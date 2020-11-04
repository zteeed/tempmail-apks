package b.b;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private static long f2001a = System.currentTimeMillis();

    public enum a {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);
        

        /* renamed from: b  reason: collision with root package name */
        private int f2006b;

        private a(int i2) {
            this.f2006b = i2;
        }

        public final int f() {
            return this.f2006b;
        }
    }

    public static void a(String str) {
        if (a.DEBUG.f() <= j.b().c("logLevel", a.NONE.f())) {
            Log.d("AppsFlyer_4.9.0", l(str, false));
        }
        h0.m().h("D", l(str, true));
    }

    public static void b(String str, Throwable th) {
        j(str, th, false);
    }

    public static void c(String str) {
        d(str, true);
    }

    public static void d(String str, boolean z) {
        if (a.INFO.f() <= j.b().c("logLevel", a.NONE.f())) {
            Log.i("AppsFlyer_4.9.0", l(str, false));
        }
        if (z) {
            h0.m().h("I", l(str, true));
        }
    }

    public static void e(String str) {
        if (a.VERBOSE.f() <= j.b().c("logLevel", a.NONE.f())) {
            Log.v("AppsFlyer_4.9.0", l(str, false));
        }
        h0.m().h("V", l(str, true));
    }

    public static void f(String str) {
        i(str);
    }

    public static void g() {
        f2001a = System.currentTimeMillis();
    }

    private static String h(long j) {
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        long millis = j - TimeUnit.HOURS.toMillis(hours);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(millis);
        long millis2 = millis - TimeUnit.MINUTES.toMillis(minutes);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(millis2);
        long millis3 = TimeUnit.MILLISECONDS.toMillis(millis2 - TimeUnit.SECONDS.toMillis(seconds));
        return String.format(Locale.getDefault(), "%02d:%02d:%02d:%03d", new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(millis3)});
    }

    static void i(String str) {
        if (a.WARNING.f() <= j.b().c("logLevel", a.NONE.f())) {
            Log.w("AppsFlyer_4.9.0", l(str, false));
        }
        h0.m().h("W", l(str, true));
    }

    private static void j(String str, Throwable th, boolean z) {
        if ((a.ERROR.f() <= j.b().c("logLevel", a.NONE.f())) && z) {
            Log.e("AppsFlyer_4.9.0", l(str, false), th);
        }
        h0.m().q(th);
    }

    static void k(String str) {
        if (!j.b().h()) {
            Log.d("AppsFlyer_4.9.0", l(str, false));
        }
        h0.m().h("F", str);
    }

    private static String l(String str, boolean z) {
        if (!z && a.VERBOSE.f() > j.b().c("logLevel", a.NONE.f())) {
            return str;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(h(System.currentTimeMillis() - f2001a));
        sb.append(") [");
        sb.append(Thread.currentThread().getName());
        sb.append("] ");
        sb.append(str);
        return sb.toString();
    }
}
