package me.leolin.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import me.leolin.shortcutbadger.a;

/* compiled from: OPPOHomeBader */
public class d implements a {

    /* renamed from: a  reason: collision with root package name */
    private int f14244a = -1;

    private void c(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        if (i == 0) {
            i = -1;
        }
        Intent intent = new Intent("com.oppo.unsettledevent");
        intent.putExtra("pakeageName", componentName.getPackageName());
        intent.putExtra("number", i);
        intent.putExtra("upgradeNumber", i);
        me.leolin.shortcutbadger.c.a.c(context, intent);
    }

    @TargetApi(11)
    private void d(Context context, int i) throws ShortcutBadgeException {
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("app_badge_count", i);
            context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
        } catch (Throwable unused) {
            throw new ShortcutBadgeException("Unable to execute Badge By Content Provider");
        }
    }

    public List<String> a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    public void b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        if (this.f14244a != i) {
            this.f14244a = i;
            if (Build.VERSION.SDK_INT >= 11) {
                d(context, i);
            } else {
                c(context, componentName, i);
            }
        }
    }
}
