package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: TintContextWrapper */
public class y extends ContextWrapper {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f1174c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static ArrayList<WeakReference<y>> f1175d;

    /* renamed from: a  reason: collision with root package name */
    private final Resources f1176a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources.Theme f1177b;

    private y(Context context) {
        super(context);
        if (g0.b()) {
            g0 g0Var = new g0(this, context.getResources());
            this.f1176a = g0Var;
            Resources.Theme newTheme = g0Var.newTheme();
            this.f1177b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f1176a = new a0(this, context.getResources());
        this.f1177b = null;
    }

    private static boolean a(Context context) {
        if ((context instanceof y) || (context.getResources() instanceof a0) || (context.getResources() instanceof g0)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 21 || g0.b()) {
            return true;
        }
        return false;
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f1174c) {
            if (f1175d == null) {
                f1175d = new ArrayList<>();
            } else {
                for (int size = f1175d.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = f1175d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1175d.remove(size);
                    }
                }
                for (int size2 = f1175d.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = f1175d.get(size2);
                    y yVar = weakReference2 != null ? (y) weakReference2.get() : null;
                    if (yVar != null && yVar.getBaseContext() == context) {
                        return yVar;
                    }
                }
            }
            y yVar2 = new y(context);
            f1175d.add(new WeakReference(yVar2));
            return yVar2;
        }
    }

    public AssetManager getAssets() {
        return this.f1176a.getAssets();
    }

    public Resources getResources() {
        return this.f1176a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1177b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i) {
        Resources.Theme theme = this.f1177b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
