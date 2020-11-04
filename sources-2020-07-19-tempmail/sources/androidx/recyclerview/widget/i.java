package androidx.recyclerview.widget;

import a.h.k.c0.d;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: RecyclerViewAccessibilityDelegate */
public class i extends a.h.k.a {

    /* renamed from: d  reason: collision with root package name */
    final RecyclerView f1844d;

    /* renamed from: e  reason: collision with root package name */
    final a.h.k.a f1845e = new a(this);

    /* compiled from: RecyclerViewAccessibilityDelegate */
    public static class a extends a.h.k.a {

        /* renamed from: d  reason: collision with root package name */
        final i f1846d;

        public a(i iVar) {
            this.f1846d = iVar;
        }

        public void g(View view, d dVar) {
            super.g(view, dVar);
            if (!this.f1846d.o() && this.f1846d.f1844d.getLayoutManager() != null) {
                this.f1846d.f1844d.getLayoutManager().M0(view, dVar);
            }
        }

        public boolean j(View view, int i, Bundle bundle) {
            if (super.j(view, i, bundle)) {
                return true;
            }
            if (this.f1846d.o() || this.f1846d.f1844d.getLayoutManager() == null) {
                return false;
            }
            return this.f1846d.f1844d.getLayoutManager().f1(view, i, bundle);
        }
    }

    public i(RecyclerView recyclerView) {
        this.f1844d = recyclerView;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !o()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().I0(accessibilityEvent);
            }
        }
    }

    public void g(View view, d dVar) {
        super.g(view, dVar);
        dVar.Z(RecyclerView.class.getName());
        if (!o() && this.f1844d.getLayoutManager() != null) {
            this.f1844d.getLayoutManager().K0(dVar);
        }
    }

    public boolean j(View view, int i, Bundle bundle) {
        if (super.j(view, i, bundle)) {
            return true;
        }
        if (o() || this.f1844d.getLayoutManager() == null) {
            return false;
        }
        return this.f1844d.getLayoutManager().d1(i, bundle);
    }

    public a.h.k.a n() {
        return this.f1845e;
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        return this.f1844d.m0();
    }
}
