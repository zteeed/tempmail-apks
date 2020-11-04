package a.p;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* compiled from: ViewGroupOverlayApi18 */
class v implements w {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroupOverlay f591a;

    v(ViewGroup viewGroup) {
        this.f591a = viewGroup.getOverlay();
    }

    public void a(Drawable drawable) {
        this.f591a.add(drawable);
    }

    public void b(Drawable drawable) {
        this.f591a.remove(drawable);
    }

    public void c(View view) {
        this.f591a.add(view);
    }

    public void d(View view) {
        this.f591a.remove(view);
    }
}
