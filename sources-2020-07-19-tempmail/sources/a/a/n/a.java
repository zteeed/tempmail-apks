package a.a.n;

import a.a.b;
import a.a.d;
import a.a.j;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewConfiguration;

/* compiled from: ActionBarPolicy */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private Context f34a;

    private a(Context context) {
        this.f34a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f34a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f34a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f34a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int e() {
        return this.f34a.getResources().getDimensionPixelSize(d.abc_action_bar_stacked_tab_max_width);
    }

    public int f() {
        TypedArray obtainStyledAttributes = this.f34a.obtainStyledAttributes((AttributeSet) null, j.ActionBar, a.a.a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(j.ActionBar_height, 0);
        Resources resources = this.f34a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f34a.getResources().getBoolean(b.abc_action_bar_embed_tabs);
    }

    public boolean h() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f34a).hasPermanentMenuKey();
    }
}
