package retrofit2.adapter.rxjava2;

import d.a.l;
import d.a.s;
import d.a.y.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.a;
import retrofit2.Call;
import retrofit2.Response;

final class CallExecuteObservable<T> extends l<Response<T>> {
    private final Call<T> originalCall;

    private static final class CallDisposable implements b {
        private final Call<?> call;
        private volatile boolean disposed;

        CallDisposable(Call<?> call2) {
            this.call = call2;
        }

        public void dispose() {
            this.disposed = true;
            this.call.cancel();
        }

        public boolean isDisposed() {
            return this.disposed;
        }
    }

    CallExecuteObservable(Call<T> call) {
        this.originalCall = call;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super Response<T>> sVar) {
        boolean z;
        Call<T> clone = this.originalCall.clone();
        CallDisposable callDisposable = new CallDisposable(clone);
        sVar.onSubscribe(callDisposable);
        if (!callDisposable.isDisposed()) {
            try {
                Response<T> execute = clone.execute();
                if (!callDisposable.isDisposed()) {
                    sVar.onNext(execute);
                }
                if (!callDisposable.isDisposed()) {
                    try {
                        sVar.onComplete();
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
                a.b(th);
                if (z) {
                    d.a.d0.a.s(th);
                } else if (!callDisposable.isDisposed()) {
                    try {
                        sVar.onError(th);
                    } catch (Throwable th3) {
                        a.b(th3);
                        d.a.d0.a.s(new CompositeException(th, th3));
                    }
                }
            }
        }
    }
}
