package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.g;
import androidx.viewpager.widget.a;

/* compiled from: FragmentPagerAdapter */
public abstract class n extends a {

    /* renamed from: b  reason: collision with root package name */
    private final k f1562b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1563c;

    /* renamed from: d  reason: collision with root package name */
    private q f1564d;

    /* renamed from: e  reason: collision with root package name */
    private Fragment f1565e;

    @Deprecated
    public n(k kVar) {
        this(kVar, 0);
    }

    private static String w(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    public void b(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f1564d == null) {
            this.f1564d = this.f1562b.j();
        }
        this.f1564d.k(fragment);
        if (fragment.equals(this.f1565e)) {
            this.f1565e = null;
        }
    }

    public void d(ViewGroup viewGroup) {
        q qVar = this.f1564d;
        if (qVar != null) {
            try {
                qVar.j();
            } catch (IllegalStateException unused) {
                this.f1564d.i();
            }
            this.f1564d = null;
        }
    }

    public Object j(ViewGroup viewGroup, int i) {
        if (this.f1564d == null) {
            this.f1564d = this.f1562b.j();
        }
        long v = v(i);
        Fragment Z = this.f1562b.Z(w(viewGroup.getId(), v));
        if (Z != null) {
            this.f1564d.g(Z);
        } else {
            Z = u(i);
            this.f1564d.b(viewGroup.getId(), Z, w(viewGroup.getId(), v));
        }
        if (Z != this.f1565e) {
            Z.Y1(false);
            if (this.f1563c == 1) {
                this.f1564d.q(Z, g.b.STARTED);
            } else {
                Z.g2(false);
            }
        }
        return Z;
    }

    public boolean k(View view, Object obj) {
        return ((Fragment) obj).p0() == view;
    }

    public void m(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable n() {
        return null;
    }

    public void p(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f1565e;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.Y1(false);
                if (this.f1563c == 1) {
                    if (this.f1564d == null) {
                        this.f1564d = this.f1562b.j();
                    }
                    this.f1564d.q(this.f1565e, g.b.STARTED);
                } else {
                    this.f1565e.g2(false);
                }
            }
            fragment.Y1(true);
            if (this.f1563c == 1) {
                if (this.f1564d == null) {
                    this.f1564d = this.f1562b.j();
                }
                this.f1564d.q(fragment, g.b.RESUMED);
            } else {
                fragment.g2(true);
            }
            this.f1565e = fragment;
        }
    }

    public void s(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    public abstract Fragment u(int i);

    public long v(int i) {
        return (long) i;
    }

    public n(k kVar, int i) {
        this.f1564d = null;
        this.f1565e = null;
        this.f1562b = kVar;
        this.f1563c = i;
    }
}
