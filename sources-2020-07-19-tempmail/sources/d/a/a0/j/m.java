package d.a.a0.j;

import d.a.s;
import java.io.Serializable;

/* compiled from: NotificationLite */
public enum m {
    COMPLETE;

    /* compiled from: NotificationLite */
    static final class a implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;

        /* renamed from: b  reason: collision with root package name */
        final d.a.y.b f13885b;

        a(d.a.y.b bVar) {
            this.f13885b = bVar;
        }

        public String toString() {
            return "NotificationLite.Disposable[" + this.f13885b + "]";
        }
    }

    /* compiled from: NotificationLite */
    static final class b implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* renamed from: b  reason: collision with root package name */
        final Throwable f13886b;

        b(Throwable th) {
            this.f13886b = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return d.a.a0.b.b.c(this.f13886b, ((b) obj).f13886b);
            }
            return false;
        }

        public int hashCode() {
            return this.f13886b.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f13886b + "]";
        }
    }

    public static <T> boolean f(Object obj, s<? super T> sVar) {
        if (obj == COMPLETE) {
            sVar.onComplete();
            return true;
        } else if (obj instanceof b) {
            sVar.onError(((b) obj).f13886b);
            return true;
        } else {
            sVar.onNext(obj);
            return false;
        }
    }

    public static <T> boolean g(Object obj, s<? super T> sVar) {
        if (obj == COMPLETE) {
            sVar.onComplete();
            return true;
        } else if (obj instanceof b) {
            sVar.onError(((b) obj).f13886b);
            return true;
        } else if (obj instanceof a) {
            sVar.onSubscribe(((a) obj).f13885b);
            return false;
        } else {
            sVar.onNext(obj);
            return false;
        }
    }

    public static Object h() {
        return COMPLETE;
    }

    public static Object k(d.a.y.b bVar) {
        return new a(bVar);
    }

    public static Object m(Throwable th) {
        return new b(th);
    }

    public static Throwable n(Object obj) {
        return ((b) obj).f13886b;
    }

    public static <T> T o(Object obj) {
        return obj;
    }

    public static boolean p(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean q(Object obj) {
        return obj instanceof b;
    }

    public static <T> Object r(T t) {
        return t;
    }

    public String toString() {
        return "NotificationLite.Complete";
    }
}
