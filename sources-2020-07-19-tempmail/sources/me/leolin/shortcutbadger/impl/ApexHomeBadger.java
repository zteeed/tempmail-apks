package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import me.leolin.shortcutbadger.a;

public class ApexHomeBadger implements a {
    public List<String> a() {
        return Arrays.asList(new String[]{"com.anddoes.launcher"});
    }

    public void b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", componentName.getPackageName());
        intent.putExtra("count", i);
        intent.putExtra("class", componentName.getClassName());
        me.leolin.shortcutbadger.c.a.c(context, intent);
    }
}
