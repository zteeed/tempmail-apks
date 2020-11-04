package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

/* compiled from: VectorEnabledTintResources */
public class g0 extends Resources {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f1113b = false;

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Context> f1114a;

    public g0(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1114a = new WeakReference<>(context);
    }

    public static boolean a() {
        return f1113b;
    }

    public static boolean b() {
        return a() && Build.VERSION.SDK_INT <= 20;
    }

    /* access modifiers changed from: package-private */
    public final Drawable c(int i) {
        return super.getDrawable(i);
    }

    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Context context = (Context) this.f1114a.get();
        if (context != null) {
            return f.n().z(context, this, i);
        }
        return super.getDrawable(i);
    }
}
