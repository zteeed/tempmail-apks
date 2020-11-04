package a.h.k;

import android.os.Build;
import android.view.WindowInsets;

/* compiled from: WindowInsetsCompat */
public class b0 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f363a;

    private b0(Object obj) {
        this.f363a = obj;
    }

    static Object i(b0 b0Var) {
        if (b0Var == null) {
            return null;
        }
        return b0Var.f363a;
    }

    static b0 j(Object obj) {
        if (obj == null) {
            return null;
        }
        return new b0(obj);
    }

    public b0 a() {
        if (Build.VERSION.SDK_INT >= 20) {
            return new b0(((WindowInsets) this.f363a).consumeSystemWindowInsets());
        }
        return null;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f363a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f363a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f363a).getSystemWindowInsetRight();
        }
        return 0;
    }

    public int e() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f363a).getSystemWindowInsetTop();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b0.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.f363a;
        Object obj3 = ((b0) obj).f363a;
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
            return ((WindowInsets) this.f363a).hasSystemWindowInsets();
        }
        return false;
    }

    public boolean g() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f363a).isConsumed();
        }
        return false;
    }

    public b0 h(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new b0(((WindowInsets) this.f363a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    public int hashCode() {
        Object obj = this.f363a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
