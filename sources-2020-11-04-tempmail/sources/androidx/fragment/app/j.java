package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.k;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: FragmentLifecycleCallbacksDispatcher */
class j {

    /* renamed from: a  reason: collision with root package name */
    private final CopyOnWriteArrayList<a> f1534a = new CopyOnWriteArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final k f1535b;

    /* compiled from: FragmentLifecycleCallbacksDispatcher */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        final k.f f1536a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f1537b;
    }

    j(k kVar) {
        this.f1535b = kVar;
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment k0 = this.f1535b.k0();
        if (k0 != null) {
            k0.b0().j0().a(fragment, bundle, true);
        }
        Iterator<a> it = this.f1534a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1537b) {
                next.f1536a.a(this.f1535b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Fragment fragment, Context context, boolean z) {
        Fragment k0 = this.f1535b.k0();
        if (k0 != null) {
            k0.b0().j0().b(fragment, context, true);
        }
        Iterator<a> it = this.f1534a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1537b) {
                next.f1536a.b(this.f1535b, fragment, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment k0 = this.f1535b.k0();
        if (k0 != null) {
            k0.b0().j0().c(fragment, bundle, true);
        }
        Iterator<a> it = this.f1534a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1537b) {
                next.f1536a.c(this.f1535b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d(Fragment fragment, boolean z) {
        Fragment k0 = this.f1535b.k0();
        if (k0 != null) {
            k0.b0().j0().d(fragment, true);
        }
        Iterator<a> it = this.f1534a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1537b) {
                next.f1536a.d(this.f1535b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(Fragment fragment, boolean z) {
        Fragment k0 = this.f1535b.k0();
        if (k0 != null) {
            k0.b0().j0().e(fragment, true);
        }
        Iterator<a> it = this.f1534a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1537b) {
                next.f1536a.e(this.f1535b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f(Fragment fragment, boolean z) {
        Fragment k0 = this.f1535b.k0();
        if (k0 != null) {
            k0.b0().j0().f(fragment, true);
        }
        Iterator<a> it = this.f1534a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1537b) {
                next.f1536a.f(this.f1535b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g(Fragment fragment, Context context, boolean z) {
        Fragment k0 = this.f1535b.k0();
        if (k0 != null) {
            k0.b0().j0().g(fragment, context, true);
        }
        Iterator<a> it = this.f1534a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1537b) {
                next.f1536a.g(this.f1535b, fragment, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment k0 = this.f1535b.k0();
        if (k0 != null) {
            k0.b0().j0().h(fragment, bundle, true);
        }
        Iterator<a> it = this.f1534a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1537b) {
                next.f1536a.h(this.f1535b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void i(Fragment fragment, boolean z) {
        Fragment k0 = this.f1535b.k0();
        if (k0 != null) {
            k0.b0().j0().i(fragment, true);
        }
        Iterator<a> it = this.f1534a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1537b) {
                next.f1536a.i(this.f1535b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment k0 = this.f1535b.k0();
        if (k0 != null) {
            k0.b0().j0().j(fragment, bundle, true);
        }
        Iterator<a> it = this.f1534a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1537b) {
                next.f1536a.j(this.f1535b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void k(Fragment fragment, boolean z) {
        Fragment k0 = this.f1535b.k0();
        if (k0 != null) {
            k0.b0().j0().k(fragment, true);
        }
        Iterator<a> it = this.f1534a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1537b) {
                next.f1536a.k(this.f1535b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void l(Fragment fragment, boolean z) {
        Fragment k0 = this.f1535b.k0();
        if (k0 != null) {
            k0.b0().j0().l(fragment, true);
        }
        Iterator<a> it = this.f1534a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1537b) {
                next.f1536a.l(this.f1535b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment k0 = this.f1535b.k0();
        if (k0 != null) {
            k0.b0().j0().m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.f1534a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1537b) {
                next.f1536a.m(this.f1535b, fragment, view, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void n(Fragment fragment, boolean z) {
        Fragment k0 = this.f1535b.k0();
        if (k0 != null) {
            k0.b0().j0().n(fragment, true);
        }
        Iterator<a> it = this.f1534a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1537b) {
                next.f1536a.n(this.f1535b, fragment);
            }
        }
    }
}
