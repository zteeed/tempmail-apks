package a.q;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* compiled from: ViewGroupOverlayApi18 */
class v implements w {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroupOverlay f595a;

    v(ViewGroup viewGroup) {
        this.f595a = viewGroup.getOverlay();
    }

    public void a(Drawable drawable) {
        this.f595a.add(drawable);
    }

    public void b(Drawable drawable) {
        this.f595a.remove(drawable);
    }

    public void c(View view) {
        this.f595a.add(view);
    }

    public void d(View view) {
        this.f595a.remove(view);
    }
}
