package androidx.fragment.app;

import androidx.lifecycle.g;
import androidx.lifecycle.k;
import androidx.lifecycle.l;

/* compiled from: FragmentViewLifecycleOwner */
class u implements k {

    /* renamed from: b  reason: collision with root package name */
    private l f1635b = null;

    u() {
    }

    /* access modifiers changed from: package-private */
    public void a(g.a aVar) {
        this.f1635b.i(aVar);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (this.f1635b == null) {
            this.f1635b = new l(this);
        }
    }

    public g c() {
        b();
        return this.f1635b;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f1635b != null;
    }
}
