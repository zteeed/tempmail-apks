package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class w6 extends y6 implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<ViewTreeObserver.OnScrollChangedListener> f5189c;

    public w6(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.f5189c = new WeakReference<>(onScrollChangedListener);
    }

    /* access modifiers changed from: protected */
    public final void d(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }

    /* access modifiers changed from: protected */
    public final void e(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this);
    }

    public final void onScrollChanged() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener) this.f5189c.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
        } else {
            b();
        }
    }
}
