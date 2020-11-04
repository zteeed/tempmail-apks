package a.h.k;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: OneShotPreDrawListener */
public final class r implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    private final View f408b;

    /* renamed from: c  reason: collision with root package name */
    private ViewTreeObserver f409c;

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f410d;

    private r(View view, Runnable runnable) {
        this.f408b = view;
        this.f409c = view.getViewTreeObserver();
        this.f410d = runnable;
    }

    public static r a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            r rVar = new r(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(rVar);
            view.addOnAttachStateChangeListener(rVar);
            return rVar;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public void b() {
        if (this.f409c.isAlive()) {
            this.f409c.removeOnPreDrawListener(this);
        } else {
            this.f408b.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f408b.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        b();
        this.f410d.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f409c = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
