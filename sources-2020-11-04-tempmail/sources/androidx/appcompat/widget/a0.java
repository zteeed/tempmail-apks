package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* compiled from: TintResources */
class a0 extends t {

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Context> f1093b;

    public a0(Context context, Resources resources) {
        super(resources);
        this.f1093b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.f1093b.get();
        if (!(drawable == null || context == null)) {
            f.n();
            f.D(context, i, drawable);
        }
        return drawable;
    }
}
