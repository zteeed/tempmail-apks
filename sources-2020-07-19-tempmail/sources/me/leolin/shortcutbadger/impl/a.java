package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;

/* compiled from: AsusHomeBadger */
public class a implements me.leolin.shortcutbadger.a {
    public List<String> a() {
        return Arrays.asList(new String[]{"com.asus.launcher"});
    }

    public void b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        intent.putExtra("badge_vip_count", 0);
        me.leolin.shortcutbadger.c.a.b(context, intent);
    }
}
