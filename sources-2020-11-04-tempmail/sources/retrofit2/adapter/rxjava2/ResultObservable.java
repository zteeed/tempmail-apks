package retrofit2.adapter.rxjava2;

import d.a.l;
import d.a.s;
import d.a.y.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.a;
import retrofit2.Response;

final class ResultObservable<T> extends l<Result<T>> {
    private final l<Response<T>> upstream;

    private static class ResultObserver<R> implements s<Response<R>> {
        private final s<? super Result<R>> observer;

        ResultObserver(s<? super Result<R>> sVar) {
            this.observer = sVar;
        }

        public void onComplete() {
            this.observer.onComplete();
        }

        public void onError(Throwable th) {
            try {
                this.observer.onNext(Result.error(th));
                this.observer.onComplete();
            } catch (Throwable th2) {
                a.b(th2);
                d.a.d0.a.s(new CompositeException(th, th2));
            }
        }

        public void onSubscribe(b bVar) {
            this.observer.onSubscribe(bVar);
        }

        public void onNext(Response<R> response) {
            this.observer.onNext(Result.response(response));
        }
    }

    ResultObservable(l<Response<T>> lVar) {
        this.upstream = lVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super Result<T>> sVar) {
        this.upstream.subscribe(new ResultObserver(sVar));
    }
}
