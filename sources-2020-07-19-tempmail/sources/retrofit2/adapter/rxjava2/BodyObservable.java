package retrofit2.adapter.rxjava2;

import d.a.d0.a;
import d.a.l;
import d.a.s;
import d.a.y.b;
import io.reactivex.exceptions.CompositeException;
import retrofit2.Response;

final class BodyObservable<T> extends l<T> {
    private final l<Response<T>> upstream;

    private static class BodyObserver<R> implements s<Response<R>> {
        private final s<? super R> observer;
        private boolean terminated;

        BodyObserver(s<? super R> sVar) {
            this.observer = sVar;
        }

        public void onComplete() {
            if (!this.terminated) {
                this.observer.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (!this.terminated) {
                this.observer.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            a.s(assertionError);
        }

        public void onSubscribe(b bVar) {
            this.observer.onSubscribe(bVar);
        }

        public void onNext(Response<R> response) {
            if (response.isSuccessful()) {
                this.observer.onNext(response.body());
                return;
            }
            this.terminated = true;
            HttpException httpException = new HttpException(response);
            try {
                this.observer.onError(httpException);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                a.s(new CompositeException(httpException, th));
            }
        }
    }

    BodyObservable(l<Response<T>> lVar) {
        this.upstream = lVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        this.upstream.subscribe(new BodyObserver(sVar));
    }
}
