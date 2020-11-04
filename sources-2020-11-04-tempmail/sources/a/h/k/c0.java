package a.h.k;

import android.os.Build;
import android.view.WindowInsets;

/* compiled from: WindowInsetsCompat */
public class c0 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f373a;

    private c0(Object obj) {
        this.f373a = obj;
    }

    static Object i(c0 c0Var) {
        if (c0Var == null) {
            return null;
        }
        return c0Var.f373a;
    }

    static c0 j(Object obj) {
        if (obj == null) {
            return null;
        }
        return new c0(obj);
    }

    public c0 a() {
        if (Build.VERSION.SDK_INT >= 20) {
            return new c0(((WindowInsets) this.f373a).consumeSystemWindowInsets());
        }
        return null;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f373a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f373a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f373a).getSystemWindowInsetRight();
        }
        return 0;
    }

    public int e() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f373a).getSystemWindowInsetTop();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c0.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.f373a;
        Object obj3 = ((c0) obj).f373a;
        if (obj2 != null) {
            return obj2.equals(obj3);
        }
        if (obj3 == null) {
            return true;
        }
        return false;
    }

    public boolean f() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f373a).hasSystemWindowInsets();
        }
        return false;
    }

    public boolean g() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f373a).isConsumed();
        }
        return false;
    }

    public c0 h(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new c0(((WindowInsets) this.f373a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    public int hashCode() {
        Object obj = this.f373a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
