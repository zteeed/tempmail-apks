package b.d.a;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: AndroidThreeTen */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f2334a = new AtomicBoolean();

    public static void a(Application application) {
        b(application);
    }

    public static void b(Context context) {
        c(context, "org/threeten/bp/TZDB.dat");
    }

    public static void c(Context context, String str) {
        if (!f2334a.getAndSet(true)) {
            org.threeten.bp.zone.a.a(new b(context, str));
        }
    }
}
