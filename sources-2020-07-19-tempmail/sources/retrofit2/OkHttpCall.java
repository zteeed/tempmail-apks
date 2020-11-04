package retrofit2;

import e.b0;
import e.g0;
import e.i0;
import e.j;
import e.j0;
import e.k;
import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;
import okio.Timeout;

final class OkHttpCall<T> implements Call<T> {
    private final Object[] args;
    private final j.a callFactory;
    private volatile boolean canceled;
    @GuardedBy("this")
    @Nullable
    private Throwable creationFailure;
    @GuardedBy("this")
    private boolean executed;
    @GuardedBy("this")
    @Nullable
    private j rawCall;
    private final RequestFactory requestFactory;
    private final Converter<j0, T> responseConverter;

    static final class ExceptionCatchingResponseBody extends j0 {
        private final j0 delegate;
        private final BufferedSource delegateSource;
        @Nullable
        IOException thrownException;

        ExceptionCatchingResponseBody(j0 j0Var) {
            this.delegate = j0Var;
            this.delegateSource = Okio.buffer((Source) new ForwardingSource(j0Var.source()) {
                public long read(Buffer buffer, long j) throws IOException {
                    try {
                        return super.read(buffer, j);
                    } catch (IOException e2) {
                        ExceptionCatchingResponseBody.this.thrownException = e2;
                        throw e2;
                    }
                }
            });
        }

        public void close() {
            this.delegate.close();
        }

        public long contentLength() {
            return this.delegate.contentLength();
        }

        public b0 contentType() {
            return this.delegate.contentType();
        }

        public BufferedSource source() {
            return this.delegateSource;
        }

        /* access modifiers changed from: package-private */
        public void throwIfCaught() throws IOException {
            IOException iOException = this.thrownException;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    static final class NoContentResponseBody extends j0 {
        private final long contentLength;
        @Nullable
        private final b0 contentType;

        NoContentResponseBody(@Nullable b0 b0Var, long j) {
            this.contentType = b0Var;
            this.contentLength = j;
        }

        public long contentLength() {
            return this.contentLength;
        }

        public b0 contentType() {
            return this.contentType;
        }

        public BufferedSource source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    OkHttpCall(RequestFactory requestFactory2, Object[] objArr, j.a aVar, Converter<j0, T> converter) {
        this.requestFactory = requestFactory2;
        this.args = objArr;
        this.callFactory = aVar;
        this.responseConverter = converter;
    }

    private j createRawCall() throws IOException {
        j b2 = this.callFactory.b(this.requestFactory.create(this.args));
        if (b2 != null) {
            return b2;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    @GuardedBy("this")
    private j getRawCall() throws IOException {
        j jVar = this.rawCall;
        if (jVar != null) {
            return jVar;
        }
        Throwable th = this.creationFailure;
        if (th == null) {
            try {
                j createRawCall = createRawCall();
                this.rawCall = createRawCall;
                return createRawCall;
            } catch (IOException | Error | RuntimeException e2) {
                Utils.throwIfFatal(e2);
                this.creationFailure = e2;
                throw e2;
            }
        } else if (th instanceof IOException) {
            throw ((IOException) th);
        } else if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else {
            throw ((Error) th);
        }
    }

    public void cancel() {
        j jVar;
        this.canceled = true;
        synchronized (this) {
            jVar = this.rawCall;
        }
        if (jVar != null) {
            jVar.cancel();
        }
    }

    public void enqueue(final Callback<T> callback) {
        j jVar;
        Throwable th;
        Objects.requireNonNull(callback, "callback == null");
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
                jVar = this.rawCall;
                th = this.creationFailure;
                if (jVar == null && th == null) {
                    try {
                        j createRawCall = createRawCall();
                        this.rawCall = createRawCall;
                        jVar = createRawCall;
                    } catch (Throwable th2) {
                        th = th2;
                        Utils.throwIfFatal(th);
                        this.creationFailure = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            callback.onFailure(this, th);
            return;
        }
        if (this.canceled) {
            jVar.cancel();
        }
        jVar.u(new k() {
            private void callFailure(Throwable th) {
                try {
                    callback.onFailure(OkHttpCall.this, th);
                } catch (Throwable th2) {
                    Utils.throwIfFatal(th2);
                    th2.printStackTrace();
                }
            }

            public void onFailure(j jVar, IOException iOException) {
                callFailure(iOException);
            }

            public void onResponse(j jVar, i0 i0Var) {
                try {
                    try {
                        callback.onResponse(OkHttpCall.this, OkHttpCall.this.parseResponse(i0Var));
                    } catch (Throwable th) {
                        Utils.throwIfFatal(th);
                        th.printStackTrace();
                    }
                } catch (Throwable th2) {
                    Utils.throwIfFatal(th2);
                    callFailure(th2);
                }
            }
        });
    }

    public Response<T> execute() throws IOException {
        j rawCall2;
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
                rawCall2 = getRawCall();
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.canceled) {
            rawCall2.cancel();
        }
        return parseResponse(rawCall2.execute());
    }

    public boolean isCanceled() {
        boolean z = true;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            if (this.rawCall == null || !this.rawCall.isCanceled()) {
                z = false;
            }
        }
        return z;
    }

    public synchronized boolean isExecuted() {
        return this.executed;
    }

    /* access modifiers changed from: package-private */
    public Response<T> parseResponse(i0 i0Var) throws IOException {
        j0 a2 = i0Var.a();
        i0.a n = i0Var.n();
        n.b(new NoContentResponseBody(a2.contentType(), a2.contentLength()));
        i0 c2 = n.c();
        int d2 = c2.d();
        if (d2 < 200 || d2 >= 300) {
            try {
                return Response.error(Utils.buffer(a2), c2);
            } finally {
                a2.close();
            }
        } else if (d2 == 204 || d2 == 205) {
            a2.close();
            return Response.success(null, c2);
        } else {
            ExceptionCatchingResponseBody exceptionCatchingResponseBody = new ExceptionCatchingResponseBody(a2);
            try {
                return Response.success(this.responseConverter.convert(exceptionCatchingResponseBody), c2);
            } catch (RuntimeException e2) {
                exceptionCatchingResponseBody.throwIfCaught();
                throw e2;
            }
        }
    }

    public synchronized g0 request() {
        try {
        } catch (IOException e2) {
            throw new RuntimeException("Unable to create request.", e2);
        }
        return getRawCall().request();
    }

    public synchronized Timeout timeout() {
        try {
        } catch (IOException e2) {
            throw new RuntimeException("Unable to create call.", e2);
        }
        return getRawCall().timeout();
    }

    public OkHttpCall<T> clone() {
        return new OkHttpCall<>(this.requestFactory, this.args, this.callFactory, this.responseConverter);
    }
}
