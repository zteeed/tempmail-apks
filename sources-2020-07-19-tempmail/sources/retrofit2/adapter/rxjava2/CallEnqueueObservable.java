package retrofit2.adapter.rxjava2;

import d.a.l;
import d.a.s;
import d.a.y.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.a;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

final class CallEnqueueObservable<T> extends l<Response<T>> {
    private final Call<T> originalCall;

    private static final class CallCallback<T> implements b, Callback<T> {
        private final Call<?> call;
        private volatile boolean disposed;
        private final s<? super Response<T>> observer;
        boolean terminated = false;

        CallCallback(Call<?> call2, s<? super Response<T>> sVar) {
            this.call = call2;
            this.observer = sVar;
        }

        public void dispose() {
            this.disposed = true;
            this.call.cancel();
        }

        public boolean isDisposed() {
            return this.disposed;
        }

        public void onFailure(Call<T> call2, Throwable th) {
            if (!call2.isCanceled()) {
                try {
                    this.observer.onError(th);
                } catch (Throwable th2) {
                    a.b(th2);
                    d.a.d0.a.s(new CompositeException(th, th2));
                }
            }
        }

        public void onResponse(Call<T> call2, Response<T> response) {
            if (!this.disposed) {
                try {
                    this.observer.onNext(response);
                    if (!this.disposed) {
                        this.terminated = true;
                        this.observer.onComplete();
                    }
                } catch (Throwable th) {
                    a.b(th);
                    d.a.d0.a.s(new CompositeException(th, th));
                }
            }
        }
    }

    CallEnqueueObservable(Call<T> call) {
        this.originalCall = call;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super Response<T>> sVar) {
        Call<T> clone = this.originalCall.clone();
        CallCallback callCallback = new CallCallback(clone, sVar);
        sVar.onSubscribe(callCallback);
        if (!callCallback.isDisposed()) {
            clone.enqueue(callCallback);
        }
    }
}
