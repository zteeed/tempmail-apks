package b.c.a.d.o;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: ExpandableWidgetHelper */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final View f2287a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2288b = false;

    /* renamed from: c  reason: collision with root package name */
    private int f2289c = 0;

    public b(a aVar) {
        this.f2287a = (View) aVar;
    }

    private void a() {
        ViewParent parent = this.f2287a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).p(this.f2287a);
        }
    }

    public int b() {
        return this.f2289c;
    }

    public boolean c() {
        return this.f2288b;
    }

    public void d(Bundle bundle) {
        this.f2288b = bundle.getBoolean("expanded", false);
        this.f2289c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f2288b) {
            a();
        }
    }

    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f2288b);
        bundle.putInt("expandedComponentIdHint", this.f2289c);
        return bundle;
    }

    public void f(int i) {
        this.f2289c = i;
    }
}
