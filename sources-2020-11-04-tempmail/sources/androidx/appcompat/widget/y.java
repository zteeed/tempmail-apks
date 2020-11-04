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
    private static final Object f1201c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static ArrayList<WeakReference<y>> f1202d;

    /* renamed from: a  reason: collision with root package name */
    private final Resources f1203a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources.Theme f1204b;

    private y(Context context) {
        super(context);
        if (g0.b()) {
            g0 g0Var = new g0(this, context.getResources());
            this.f1203a = g0Var;
            Resources.Theme newTheme = g0Var.newTheme();
            this.f1204b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f1203a = new a0(this, context.getResources());
        this.f1204b = null;
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
        synchronized (f1201c) {
            if (f1202d == null) {
                f1202d = new ArrayList<>();
            } else {
                for (int size = f1202d.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = f1202d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1202d.remove(size);
                    }
                }
                for (int size2 = f1202d.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = f1202d.get(size2);
                    y yVar = weakReference2 != null ? (y) weakReference2.get() : null;
                    if (yVar != null && yVar.getBaseContext() == context) {
                        return yVar;
                    }
                }
            }
            y yVar2 = new y(context);
            f1202d.add(new WeakReference(yVar2));
            return yVar2;
        }
    }

    public AssetManager getAssets() {
        return this.f1203a.getAssets();
    }

    public Resources getResources() {
        return this.f1203a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1204b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i) {
        Resources.Theme theme = this.f1204b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
