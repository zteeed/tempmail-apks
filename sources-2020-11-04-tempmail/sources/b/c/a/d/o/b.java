package b.c.a.d.o;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: ExpandableWidgetHelper */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final View f2385a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2386b = false;

    /* renamed from: c  reason: collision with root package name */
    private int f2387c = 0;

    public b(a aVar) {
        this.f2385a = (View) aVar;
    }

    private void a() {
        ViewParent parent = this.f2385a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).p(this.f2385a);
        }
    }

    public int b() {
        return this.f2387c;
    }

    public boolean c() {
        return this.f2386b;
    }

    public void d(Bundle bundle) {
        this.f2386b = bundle.getBoolean("expanded", false);
        this.f2387c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f2386b) {
            a();
        }
    }

    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f2386b);
        bundle.putInt("expandedComponentIdHint", this.f2387c);
        return bundle;
    }

    public void f(int i) {
        this.f2387c = i;
    }
}
