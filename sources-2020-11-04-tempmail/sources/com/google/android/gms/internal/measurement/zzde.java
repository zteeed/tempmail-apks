package com.google.android.gms.internal.measurement;

import a.e.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzde implements l0 {

    /* renamed from: f  reason: collision with root package name */
    private static final Map<String, zzde> f9784f = new a();

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f9785a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f9786b = new u0(this);

    /* renamed from: c  reason: collision with root package name */
    private final Object f9787c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private volatile Map<String, ?> f9788d;

    /* renamed from: e  reason: collision with root package name */
    private final List<zzcm> f9789e = new ArrayList();

    private zzde(SharedPreferences sharedPreferences) {
        this.f9785a = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.f9786b);
    }

    static zzde a(Context context, String str) {
        zzde zzde;
        if (!((!zzci.a() || str.startsWith("direct_boot:")) ? true : zzci.b(context))) {
            return null;
        }
        synchronized (zzde.class) {
            zzde = f9784f.get(str);
            if (zzde == null) {
                zzde = new zzde(d(context, str));
                f9784f.put(str, zzde);
            }
        }
        return zzde;
    }

    static synchronized void b() {
        synchronized (zzde.class) {
            for (zzde next : f9784f.values()) {
                next.f9785a.unregisterOnSharedPreferenceChangeListener(next.f9786b);
            }
            f9784f.clear();
        }
    }

    private static SharedPreferences d(Context context, String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (str.startsWith("direct_boot:")) {
                if (zzci.a()) {
                    context = context.createDeviceProtectedStorageContext();
                }
                return context.getSharedPreferences(str.substring(12), 0);
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return sharedPreferences;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f9787c) {
            this.f9788d = null;
            zzcv.g();
        }
        synchronized (this) {
            for (zzcm a2 : this.f9789e) {
                a2.a();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final Object g(String str) {
        Map<String, ?> map = this.f9788d;
        if (map == null) {
            synchronized (this.f9787c) {
                map = this.f9788d;
                if (map == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        Map<String, ?> all = this.f9785a.getAll();
                        this.f9788d = all;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = all;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
