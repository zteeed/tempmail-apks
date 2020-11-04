package androidx.fragment.app;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: OneShotPreDrawListener */
class n implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    private final View f1581b;

    /* renamed from: c  reason: collision with root package name */
    private ViewTreeObserver f1582c;

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f1583d;

    private n(View view, Runnable runnable) {
        this.f1581b = view;
        this.f1582c = view.getViewTreeObserver();
        this.f1583d = runnable;
    }

    public static n a(View view, Runnable runnable) {
        n nVar = new n(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(nVar);
        view.addOnAttachStateChangeListener(nVar);
        return nVar;
    }

    public void b() {
        if (this.f1582c.isAlive()) {
            this.f1582c.removeOnPreDrawListener(this);
        } else {
            this.f1581b.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f1581b.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        b();
        this.f1583d.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f1582c = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
