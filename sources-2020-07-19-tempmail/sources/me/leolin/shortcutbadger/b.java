package me.leolin.shortcutbadger;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import me.leolin.shortcutbadger.impl.AdwHomeBadger;
import me.leolin.shortcutbadger.impl.ApexHomeBadger;
import me.leolin.shortcutbadger.impl.DefaultBadger;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import me.leolin.shortcutbadger.impl.NovaHomeBadger;
import me.leolin.shortcutbadger.impl.SonyHomeBadger;
import me.leolin.shortcutbadger.impl.a;
import me.leolin.shortcutbadger.impl.c;
import me.leolin.shortcutbadger.impl.d;
import me.leolin.shortcutbadger.impl.e;
import me.leolin.shortcutbadger.impl.f;
import me.leolin.shortcutbadger.impl.g;
import me.leolin.shortcutbadger.impl.h;

/* compiled from: ShortcutBadger */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final List<Class<? extends a>> f14238a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    private static a f14239b;

    /* renamed from: c  reason: collision with root package name */
    private static ComponentName f14240c;

    static {
        f14238a.add(AdwHomeBadger.class);
        f14238a.add(ApexHomeBadger.class);
        f14238a.add(DefaultBadger.class);
        f14238a.add(NewHtcHomeBadger.class);
        f14238a.add(NovaHomeBadger.class);
        f14238a.add(SonyHomeBadger.class);
        f14238a.add(a.class);
        f14238a.add(c.class);
        f14238a.add(d.class);
        f14238a.add(e.class);
        f14238a.add(h.class);
        f14238a.add(f.class);
        f14238a.add(g.class);
        f14238a.add(me.leolin.shortcutbadger.impl.b.class);
    }

    public static boolean a(Context context, int i) {
        try {
            b(context, i);
            return true;
        } catch (ShortcutBadgeException e2) {
            if (!Log.isLoggable("ShortcutBadger", 3)) {
                return false;
            }
            Log.d("ShortcutBadger", "Unable to execute badge", e2);
            return false;
        }
    }

    public static void b(Context context, int i) throws ShortcutBadgeException {
        if (f14239b != null || c(context)) {
            try {
                f14239b.b(context, f14240c, i);
            } catch (Exception e2) {
                throw new ShortcutBadgeException("Unable to execute badge", e2);
            }
        } else {
            throw new ShortcutBadgeException("No default launcher available");
        }
    }

    private static boolean c(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            Log.e("ShortcutBadger", "Unable to find launch intent for package " + context.getPackageName());
            return false;
        }
        f14240c = launchIntentForPackage.getComponent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 65536)) {
            String str = resolveInfo.activityInfo.packageName;
            Iterator<Class<? extends a>> it = f14238a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                a aVar = null;
                try {
                    aVar = (a) it.next().newInstance();
                } catch (Exception unused) {
                }
                if (aVar != null && aVar.a().contains(str)) {
                    f14239b = aVar;
                    break;
                }
            }
            if (f14239b != null) {
                break;
            }
        }
        if (f14239b != null) {
            return true;
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("ZUK")) {
            f14239b = new h();
            return true;
        } else if (Build.MANUFACTURER.equalsIgnoreCase("OPPO")) {
            f14239b = new d();
            return true;
        } else if (Build.MANUFACTURER.equalsIgnoreCase("VIVO")) {
            f14239b = new f();
            return true;
        } else if (Build.MANUFACTURER.equalsIgnoreCase("ZTE")) {
            f14239b = new g();
            return true;
        } else {
            f14239b = new DefaultBadger();
            return true;
        }
    }
}
