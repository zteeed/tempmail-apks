package me.leolin.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import me.leolin.shortcutbadger.a;

/* compiled from: ZukHomeBadger */
public class h implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f14247a = Uri.parse("content://com.android.badge/badge");

    public List<String> a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @TargetApi(11)
    public void b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        context.getContentResolver().call(this.f14247a, "setAppBadgeCount", (String) null, bundle);
    }
}
