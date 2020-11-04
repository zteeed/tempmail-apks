package a.p;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* compiled from: ViewOverlayApi18 */
class b0 implements c0 {

    /* renamed from: a  reason: collision with root package name */
    private final ViewOverlay f490a;

    b0(View view) {
        this.f490a = view.getOverlay();
    }

    public void a(Drawable drawable) {
        this.f490a.add(drawable);
    }

    public void b(Drawable drawable) {
        this.f490a.remove(drawable);
    }
}
