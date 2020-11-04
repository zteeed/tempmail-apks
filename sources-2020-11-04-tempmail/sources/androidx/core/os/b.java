package androidx.core.os;

import android.os.Build;
import android.os.Trace;

/* compiled from: TraceCompat */
public final class b {
    public static void a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void b() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
