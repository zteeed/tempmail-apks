package a.q;

import android.os.Build;
import android.view.ViewGroup;

/* compiled from: ViewGroupUtils */
class x {
    static w a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new v(viewGroup);
        }
        return u.g(viewGroup);
    }

    static void b(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 18) {
            z.b(viewGroup, z);
        } else {
            y.b(viewGroup, z);
        }
    }
}
