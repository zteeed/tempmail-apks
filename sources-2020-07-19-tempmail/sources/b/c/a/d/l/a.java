package b.c.a.d.l;

import a.k.a.a.b;
import a.k.a.a.c;
import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: AnimationUtils */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeInterpolator f2265a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final TimeInterpolator f2266b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final TimeInterpolator f2267c = new a.k.a.a.a();

    /* renamed from: d  reason: collision with root package name */
    public static final TimeInterpolator f2268d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static final TimeInterpolator f2269e = new DecelerateInterpolator();

    public static float a(float f2, float f3, float f4) {
        return f2 + (f4 * (f3 - f2));
    }

    public static int b(int i, int i2, float f2) {
        return i + Math.round(f2 * ((float) (i2 - i)));
    }
}
