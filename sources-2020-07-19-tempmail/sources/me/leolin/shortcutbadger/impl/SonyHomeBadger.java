package me.leolin.shortcutbadger.impl;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;

public class SonyHomeBadger implements me.leolin.shortcutbadger.a {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f14241a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    /* renamed from: b  reason: collision with root package name */
    private AsyncQueryHandler f14242b;

    class a extends AsyncQueryHandler {
        a(SonyHomeBadger sonyHomeBadger, ContentResolver contentResolver) {
            super(contentResolver);
        }
    }

    private ContentValues c(int i, ComponentName componentName) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("badge_count", Integer.valueOf(i));
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put("activity_name", componentName.getClassName());
        return contentValues;
    }

    private static void d(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i));
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", i > 0);
        context.sendBroadcast(intent);
    }

    private void e(Context context, ComponentName componentName, int i) {
        if (i >= 0) {
            ContentValues c2 = c(i, componentName);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.f14242b == null) {
                    this.f14242b = new a(this, context.getApplicationContext().getContentResolver());
                }
                f(c2);
                return;
            }
            g(context, c2);
        }
    }

    private void f(ContentValues contentValues) {
        this.f14242b.startInsert(0, (Object) null, this.f14241a, contentValues);
    }

    private void g(Context context, ContentValues contentValues) {
        context.getApplicationContext().getContentResolver().insert(this.f14241a, contentValues);
    }

    private static boolean h(Context context) {
        return context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null;
    }

    public List<String> a() {
        return Arrays.asList(new String[]{"com.sonyericsson.home", "com.sonymobile.home"});
    }

    public void b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        if (h(context)) {
            e(context, componentName, i);
        } else {
            d(context, componentName, i);
        }
    }
}
