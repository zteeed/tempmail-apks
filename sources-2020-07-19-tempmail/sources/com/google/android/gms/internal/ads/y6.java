package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
abstract class y6 {

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<View> f5353b;

    public y6(View view) {
        this.f5353b = new WeakReference<>(view);
    }

    private final ViewTreeObserver c() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.f5353b.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    public final void a() {
        ViewTreeObserver c2 = c();
        if (c2 != null) {
            d(c2);
        }
    }

    public final void b() {
        ViewTreeObserver c2 = c();
        if (c2 != null) {
            e(c2);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void d(ViewTreeObserver viewTreeObserver);

    /* access modifiers changed from: protected */
    public abstract void e(ViewTreeObserver viewTreeObserver);
}
