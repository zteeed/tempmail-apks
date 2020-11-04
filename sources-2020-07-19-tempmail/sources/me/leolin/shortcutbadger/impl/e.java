package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import me.leolin.shortcutbadger.a;
import me.leolin.shortcutbadger.c.b;

/* compiled from: SamsungHomeBadger */
public class e implements a {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f14245b = {"_id", "class"};

    /* renamed from: a  reason: collision with root package name */
    private DefaultBadger f14246a;

    public e() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f14246a = new DefaultBadger();
        }
    }

    private ContentValues c(ComponentName componentName, int i, boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i));
        return contentValues;
    }

    public List<String> a() {
        return Arrays.asList(new String[]{"com.sec.android.app.launcher", "com.sec.android.app.twlauncher"});
    }

    public void b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        DefaultBadger defaultBadger = this.f14246a;
        if (defaultBadger == null || !defaultBadger.c(context)) {
            Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
            ContentResolver contentResolver = context.getContentResolver();
            Cursor cursor = null;
            try {
                cursor = contentResolver.query(parse, f14245b, "package=?", new String[]{componentName.getPackageName()}, (String) null);
                if (cursor != null) {
                    String className = componentName.getClassName();
                    boolean z = false;
                    while (cursor.moveToNext()) {
                        int i2 = cursor.getInt(0);
                        contentResolver.update(parse, c(componentName, i, false), "_id=?", new String[]{String.valueOf(i2)});
                        if (className.equals(cursor.getString(cursor.getColumnIndex("class")))) {
                            z = true;
                        }
                    }
                    if (!z) {
                        contentResolver.insert(parse, c(componentName, i, true));
                    }
                }
            } finally {
                b.a(cursor);
            }
        } else {
            this.f14246a.b(context, componentName, i);
        }
    }
}
