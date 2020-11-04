package d.a.x.b;

import android.os.Handler;
import android.os.Looper;
import d.a.t;
import java.util.concurrent.Callable;

/* compiled from: AndroidSchedulers */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final t f13961a = d.a.x.a.a.d(new C0159a());

    /* renamed from: d.a.x.b.a$a  reason: collision with other inner class name */
    /* compiled from: AndroidSchedulers */
    static class C0159a implements Callable<t> {
        C0159a() {
        }

        /* renamed from: a */
        public t call() throws Exception {
            return b.f13962a;
        }
    }

    /* compiled from: AndroidSchedulers */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final t f13962a = new b(new Handler(Looper.getMainLooper()), false);
    }

    public static t a() {
        return d.a.x.a.a.e(f13961a);
    }
}
