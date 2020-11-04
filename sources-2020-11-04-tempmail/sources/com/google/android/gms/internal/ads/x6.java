package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.zzq;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class x6 extends y6 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<ViewTreeObserver.OnGlobalLayoutListener> f5467c;

    public x6(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.f5467c = new WeakReference<>(onGlobalLayoutListener);
    }

    /* access modifiers changed from: protected */
    public final void d(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    /* access modifiers changed from: protected */
    public final void e(ViewTreeObserver viewTreeObserver) {
        zzq.zzky();
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }

    public final void onGlobalLayout() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.f5467c.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            b();
        }
    }
}
