package com.google.android.gms.iid;

import a.e.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public final class zzak {

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f3490a;

    /* renamed from: b  reason: collision with root package name */
    private Context f3491b;

    /* renamed from: c  reason: collision with root package name */
    private final k f3492c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, l> f3493d;

    public zzak(Context context) {
        this(context, new k());
    }

    private static String c(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    private static String e(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T-timestamp|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    static String h(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final synchronized String a(String str) {
        return this.f3490a.getString(str, (String) null);
    }

    public final boolean b() {
        return this.f3490a.getAll().isEmpty();
    }

    public final synchronized void d(String str, String str2, String str3, String str4, String str5) {
        String c2 = c(str, str2, str3);
        String e2 = e(str, str2, str3);
        SharedPreferences.Editor edit = this.f3490a.edit();
        edit.putString(c2, str4);
        edit.putLong(e2, System.currentTimeMillis());
        edit.putString("appVersion", str5);
        edit.commit();
    }

    public final synchronized String f(String str, String str2, String str3) {
        return this.f3490a.getString(c(str, str2, str3), (String) null);
    }

    /* access modifiers changed from: package-private */
    public final synchronized long g(String str, String str2, String str3) {
        return this.f3490a.getLong(e(str, str2, str3), -1);
    }

    public final synchronized void i(String str) {
        SharedPreferences.Editor edit = this.f3490a.edit();
        for (String next : this.f3490a.getAll().keySet()) {
            if (next.startsWith(str)) {
                edit.remove(next);
            }
        }
        edit.commit();
    }

    public final synchronized l j(String str) {
        l lVar;
        l lVar2 = this.f3493d.get(str);
        if (lVar2 != null) {
            return lVar2;
        }
        try {
            lVar = this.f3492c.g(this.f3491b, str);
        } catch (m unused) {
            Log.w("InstanceID/Store", "Stored data is corrupt, generating new identity");
            InstanceIDListenerService.d(this.f3491b, this);
            lVar = this.f3492c.i(this.f3491b, str);
        }
        this.f3493d.put(str, lVar);
        return lVar;
    }

    /* access modifiers changed from: package-private */
    public final void k(String str) {
        synchronized (this) {
            this.f3493d.remove(str);
        }
        k.k(this.f3491b, str);
        i(String.valueOf(str).concat("|"));
    }

    public final synchronized void l() {
        this.f3493d.clear();
        k.n(this.f3491b);
        this.f3490a.edit().clear().commit();
    }

    @VisibleForTesting
    private zzak(Context context, k kVar) {
        this.f3493d = new a();
        this.f3491b = context;
        this.f3490a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f3492c = kVar;
        File file = new File(androidx.core.content.a.i(this.f3491b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !b()) {
                    Log.i("InstanceID/Store", "App restored, clearing state");
                    InstanceIDListenerService.d(this.f3491b, this);
                }
            } catch (IOException e2) {
                if (Log.isLoggable("InstanceID/Store", 3)) {
                    String valueOf = String.valueOf(e2.getMessage());
                    Log.d("InstanceID/Store", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
                }
            }
        }
    }
}
