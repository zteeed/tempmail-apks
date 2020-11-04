package a.a.n;

import a.a.i;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* compiled from: ContextThemeWrapper */
public class d extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private int f37a;

    /* renamed from: b  reason: collision with root package name */
    private Resources.Theme f38b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f39c;

    /* renamed from: d  reason: collision with root package name */
    private Configuration f40d;

    /* renamed from: e  reason: collision with root package name */
    private Resources f41e;

    public d() {
        super((Context) null);
    }

    private Resources a() {
        if (this.f41e == null) {
            Configuration configuration = this.f40d;
            if (configuration == null) {
                this.f41e = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                this.f41e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f41e;
    }

    private void c() {
        boolean z = this.f38b == null;
        if (z) {
            this.f38b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f38b.setTo(theme);
            }
        }
        d(this.f38b, this.f37a, z);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int b() {
        return this.f37a;
    }

    /* access modifiers changed from: protected */
    public void d(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return a();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f39c == null) {
            this.f39c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f39c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f38b;
        if (theme != null) {
            return theme;
        }
        if (this.f37a == 0) {
            this.f37a = i.Theme_AppCompat_Light;
        }
        c();
        return this.f38b;
    }

    public void setTheme(int i) {
        if (this.f37a != i) {
            this.f37a = i;
            c();
        }
    }

    public d(Context context, int i) {
        super(context);
        this.f37a = i;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f38b = theme;
    }
}
