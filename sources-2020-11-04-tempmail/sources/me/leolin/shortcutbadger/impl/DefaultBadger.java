package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import me.leolin.shortcutbadger.a;

public class DefaultBadger implements a {
    public List<String> a() {
        return Arrays.asList(new String[]{"fr.neamar.kiss", "com.quaap.launchtime", "com.quaap.launchtime_official"});
    }

    public void b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        me.leolin.shortcutbadger.c.a.b(context, intent);
    }

    /* access modifiers changed from: package-private */
    public boolean c(Context context) {
        return me.leolin.shortcutbadger.c.a.a(context, new Intent("android.intent.action.BADGE_COUNT_UPDATE")).size() > 0 || (Build.VERSION.SDK_INT >= 26 && me.leolin.shortcutbadger.c.a.a(context, new Intent("me.leolin.shortcutbadger.BADGE_COUNT_UPDATE")).size() > 0);
    }
}
