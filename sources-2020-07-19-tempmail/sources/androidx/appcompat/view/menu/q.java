package androidx.appcompat.view.menu;

import a.h.f.a.a;
import a.h.f.a.b;
import a.h.f.a.c;
import android.content.Context;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: MenuWrapperFactory */
public final class q {
    public static Menu a(Context context, a aVar) {
        return new r(context, aVar);
    }

    public static MenuItem b(Context context, b bVar) {
        if (Build.VERSION.SDK_INT >= 16) {
            return new l(context, bVar);
        }
        return new k(context, bVar);
    }

    public static SubMenu c(Context context, c cVar) {
        return new v(context, cVar);
    }
}
