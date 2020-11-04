package b.c.a.d.l;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;

/* compiled from: DrawableAlphaProperty */
public class e extends Property<Drawable, Integer> {

    /* renamed from: b  reason: collision with root package name */
    public static final Property<Drawable, Integer> f2272b = new e();

    /* renamed from: a  reason: collision with root package name */
    private final WeakHashMap<Drawable, Integer> f2273a = new WeakHashMap<>();

    private e() {
        super(Integer.class, "drawableAlphaCompat");
    }

    /* renamed from: a */
    public Integer get(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.f2273a.containsKey(drawable)) {
            return this.f2273a.get(drawable);
        }
        return 255;
    }

    /* renamed from: b */
    public void set(Drawable drawable, Integer num) {
        if (Build.VERSION.SDK_INT < 19) {
            this.f2273a.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
