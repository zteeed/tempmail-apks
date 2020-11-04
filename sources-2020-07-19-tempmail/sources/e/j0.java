package e;

import e.m0.e;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* compiled from: ResponseBody */
public abstract class j0 implements Closeable {
    @Nullable
    private Reader reader;

    /* compiled from: ResponseBody */
    class a extends j0 {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b0 f14070b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f14071c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ BufferedSource f14072d;

        a(b0 b0Var, long j, BufferedSource bufferedSource) {
            this.f14070b = b0Var;
            this.f14071c = j;
            this.f14072d = bufferedSource;
        }

        public long contentLength() {
            return this.f14071c;
        }

        @Nullable
        public b0 contentType() {
            return this.f14070b;
        }

        public BufferedSource source() {
            return this.f14072d;
        }
    }

    /* compiled from: ResponseBody */
    static final class b extends Reader {

        /* renamed from: b  reason: collision with root package name */
        private final BufferedSource f14073b;

        /* renamed from: c  reason: collision with root package name */
        private final Charset f14074c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f14075d;
        @Nullable

        /* renamed from: e  reason: collision with root package name */
        private Reader f14076e;

        b(BufferedSource bufferedSource, Charset charset) {
            this.f14073b = bufferedSource;
            this.f14074c = charset;
        }

        public void close() throws IOException {
            this.f14075d = true;
            Reader reader = this.f14076e;
            if (reader != null) {
                reader.close();
            } else {
                this.f14073b.close();
            }
        }

        public int read(char[] cArr, int i, int i2) throws IOException {
            if (!this.f14075d) {
                Reader reader = this.f14076e;
                if (reader == null) {
                    InputStreamReader inputStreamReader = new InputStreamReader(this.f14073b.inputStream(), e.b(this.f14073b, this.f14074c));
                    this.f14076e = inputStreamReader;
                    reader = inputStreamReader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    private static /* synthetic */ void $closeResource(Throwable th, AutoCloseable autoCloseable) {
        if (th != null) {
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            autoCloseable.close();
        }
    }

    private Charset charset() {
        b0 contentType = contentType();
        return contentType != null ? contentType.b(StandardCharsets.UTF_8) : StandardCharsets.UTF_8;
    }

    public static j0 create(@Nullable b0 b0Var, String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (b0Var != null && (charset = b0Var.a()) == null) {
            charset = StandardCharsets.UTF_8;
            b0Var = b0.d(b0Var + "; charset=utf-8");
        }
        Buffer writeString = new Buffer().writeString(str, charset);
        return create(b0Var, writeString.size(), writeString);
    }

    public final InputStream byteStream() {
        return source().inputStream();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (r2 != null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
        $closeResource(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] bytes() throws java.io.IOException {
        /*
            r6 = this;
            long r0 = r6.contentLength()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0055
            okio.BufferedSource r2 = r6.source()
            r3 = 0
            byte[] r4 = r2.readByteArray()     // Catch:{ all -> 0x004c }
            if (r2 == 0) goto L_0x0019
            $closeResource(r3, r2)
        L_0x0019:
            r2 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x004b
            int r2 = r4.length
            long r2 = (long) r2
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x0026
            goto L_0x004b
        L_0x0026:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Content-Length ("
            r3.append(r5)
            r3.append(r0)
            java.lang.String r0 = ") and stream length ("
            r3.append(r0)
            int r0 = r4.length
            r3.append(r0)
            java.lang.String r0 = ") disagree"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x004b:
            return r4
        L_0x004c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004e }
        L_0x004e:
            r1 = move-exception
            if (r2 == 0) goto L_0x0054
            $closeResource(r0, r2)
        L_0x0054:
            throw r1
        L_0x0055:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot buffer entire body for content length: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j0.bytes():byte[]");
    }

    public final Reader charStream() {
        Reader reader2 = this.reader;
        if (reader2 != null) {
            return reader2;
        }
        b bVar = new b(source(), charset());
        this.reader = bVar;
        return bVar;
    }

    public void close() {
        e.f(source());
    }

    public abstract long contentLength();

    @Nullable
    public abstract b0 contentType();

    public abstract BufferedSource source();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r0 != null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        $closeResource(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        r2 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String string() throws java.io.IOException {
        /*
            r3 = this;
            okio.BufferedSource r0 = r3.source()
            java.nio.charset.Charset r1 = r3.charset()     // Catch:{ all -> 0x0017 }
            java.nio.charset.Charset r1 = e.m0.e.b(r0, r1)     // Catch:{ all -> 0x0017 }
            java.lang.String r1 = r0.readString(r1)     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0016
            r2 = 0
            $closeResource(r2, r0)
        L_0x0016:
            return r1
        L_0x0017:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0019 }
        L_0x0019:
            r2 = move-exception
            if (r0 == 0) goto L_0x001f
            $closeResource(r1, r0)
        L_0x001f:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j0.string():java.lang.String");
    }

    public static j0 create(@Nullable b0 b0Var, byte[] bArr) {
        return create(b0Var, (long) bArr.length, new Buffer().write(bArr));
    }

    public static j0 create(@Nullable b0 b0Var, ByteString byteString) {
        return create(b0Var, (long) byteString.size(), new Buffer().write(byteString));
    }

    public static j0 create(@Nullable b0 b0Var, long j, BufferedSource bufferedSource) {
        if (bufferedSource != null) {
            return new a(b0Var, j, bufferedSource);
        }
        throw new NullPointerException("source == null");
    }
}
