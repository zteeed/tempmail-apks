package com.google.firebase.iid;

import a.e.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-iid@@20.2.0 */
final class b0 {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f11159a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f11160b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Long> f11161c = new a();

    public b0(Context context) {
        this.f11160b = context;
        this.f11159a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(androidx.core.content.a.i(this.f11160b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !f()) {
                    Log.i("FirebaseInstanceId", "App restored, clearing state");
                    c();
                    FirebaseInstanceId.b().x();
                }
            } catch (IOException e2) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(e2.getMessage());
                    Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
                }
            }
        }
    }

    private static String b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    private final synchronized boolean f() {
        return this.f11159a.getAll().isEmpty();
    }

    private static String g(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    private final long i(String str) {
        String string = this.f11159a.getString(b(str, "cre"), (String) null);
        if (string == null) {
            return 0;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final synchronized a0 a(String str, String str2, String str3) {
        return a0.a(this.f11159a.getString(g(str, str2, str3), (String) null));
    }

    public final synchronized void c() {
        this.f11161c.clear();
        this.f11159a.edit().clear().commit();
    }

    public final synchronized void d(String str, String str2, String str3, String str4, String str5) {
        String b2 = a0.b(str4, str5, System.currentTimeMillis());
        if (b2 != null) {
            SharedPreferences.Editor edit = this.f11159a.edit();
            edit.putString(g(str, str2, str3), b2);
            edit.commit();
        }
    }

    public final synchronized long e(String str) {
        long currentTimeMillis;
        currentTimeMillis = System.currentTimeMillis();
        if (!this.f11159a.contains(b(str, "cre"))) {
            SharedPreferences.Editor edit = this.f11159a.edit();
            edit.putString(b(str, "cre"), String.valueOf(currentTimeMillis));
            edit.commit();
        } else {
            currentTimeMillis = i(str);
        }
        this.f11161c.put(str, Long.valueOf(currentTimeMillis));
        return currentTimeMillis;
    }

    public final synchronized void h(String str) {
        String concat = String.valueOf(str).concat("|T|");
        SharedPreferences.Editor edit = this.f11159a.edit();
        for (String next : this.f11159a.getAll().keySet()) {
            if (next.startsWith(concat)) {
                edit.remove(next);
            }
        }
        edit.commit();
    }
}
