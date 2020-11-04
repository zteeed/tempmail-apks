package a.h.k;

import android.view.View;
import android.view.ViewParent;

/* compiled from: NestedScrollingChildHelper */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private ViewParent f401a;

    /* renamed from: b  reason: collision with root package name */
    private ViewParent f402b;

    /* renamed from: c  reason: collision with root package name */
    private final View f403c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f404d;

    /* renamed from: e  reason: collision with root package name */
    private int[] f405e;

    public l(View view) {
        this.f403c = view;
    }

    private boolean h(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent i6;
        int i7;
        int i8;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!m() || (i6 = i(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f403c.getLocationInWindow(iArr4);
            i8 = iArr4[0];
            i7 = iArr4[1];
        } else {
            i8 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            int[] j = j();
            j[0] = 0;
            j[1] = 0;
            iArr3 = j;
        } else {
            iArr3 = iArr2;
        }
        x.d(i6, this.f403c, i, i2, i3, i4, i5, iArr3);
        if (iArr4 != null) {
            this.f403c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i8;
            iArr4[1] = iArr4[1] - i7;
        }
        return true;
    }

    private ViewParent i(int i) {
        if (i == 0) {
            return this.f401a;
        }
        if (i != 1) {
            return null;
        }
        return this.f402b;
    }

    private int[] j() {
        if (this.f405e == null) {
            this.f405e = new int[2];
        }
        return this.f405e;
    }

    private void o(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f401a = viewParent;
        } else if (i == 1) {
            this.f402b = viewParent;
        }
    }

    public boolean a(float f2, float f3, boolean z) {
        ViewParent i;
        if (!m() || (i = i(0)) == null) {
            return false;
        }
        return x.a(i, this.f403c, f2, f3, z);
    }

    public boolean b(float f2, float f3) {
        ViewParent i;
        if (!m() || (i = i(0)) == null) {
            return false;
        }
        return x.b(i, this.f403c, f2, f3);
    }

    public boolean c(int i, int i2, int[] iArr, int[] iArr2) {
        return d(i, i2, iArr, iArr2, 0);
    }

    public boolean d(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent i4;
        int i5;
        int i6;
        if (!m() || (i4 = i(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.f403c.getLocationInWindow(iArr2);
                i6 = iArr2[0];
                i5 = iArr2[1];
            } else {
                i6 = 0;
                i5 = 0;
            }
            if (iArr == null) {
                iArr = j();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            x.c(i4, this.f403c, i, i2, iArr, i3);
            if (iArr2 != null) {
                this.f403c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i6;
                iArr2[1] = iArr2[1] - i5;
            }
            if (iArr[0] == 0 && iArr[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    public void e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        h(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public boolean f(int i, int i2, int i3, int i4, int[] iArr) {
        return h(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    public boolean g(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return h(i, i2, i3, i4, iArr, i5, (int[]) null);
    }

    public boolean k() {
        return l(0);
    }

    public boolean l(int i) {
        return i(i) != null;
    }

    public boolean m() {
        return this.f404d;
    }

    public void n(boolean z) {
        if (this.f404d) {
            u.q0(this.f403c);
        }
        this.f404d = z;
    }

    public boolean p(int i) {
        return q(i, 0);
    }

    public boolean q(int i, int i2) {
        if (l(i2)) {
            return true;
        }
        if (!m()) {
            return false;
        }
        View view = this.f403c;
        for (ViewParent parent = this.f403c.getParent(); parent != null; parent = parent.getParent()) {
            if (x.f(parent, view, this.f403c, i, i2)) {
                o(i2, parent);
                x.e(parent, view, this.f403c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void r() {
        s(0);
    }

    public void s(int i) {
        ViewParent i2 = i(i);
        if (i2 != null) {
            x.g(i2, this.f403c, i);
            o(i, (ViewParent) null);
        }
    }
}
