package com.google.android.gms.internal.measurement;

import a.e.a;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzch implements l0 {
    private static final Map<Uri, zzch> g = new a();
    private static final String[] h = {"key", "value"};

    /* renamed from: a  reason: collision with root package name */
    private final ContentResolver f9763a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f9764b;

    /* renamed from: c  reason: collision with root package name */
    private final ContentObserver f9765c = new j0(this, (Handler) null);

    /* renamed from: d  reason: collision with root package name */
    private final Object f9766d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private volatile Map<String, String> f9767e;

    /* renamed from: f  reason: collision with root package name */
    private final List<zzcm> f9768f = new ArrayList();

    private zzch(ContentResolver contentResolver, Uri uri) {
        this.f9763a = contentResolver;
        this.f9764b = uri;
        contentResolver.registerContentObserver(uri, false, this.f9765c);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0018 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.zzch a(android.content.ContentResolver r3, android.net.Uri r4) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.zzch> r0 = com.google.android.gms.internal.measurement.zzch.class
            monitor-enter(r0)
            java.util.Map<android.net.Uri, com.google.android.gms.internal.measurement.zzch> r1 = g     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.measurement.zzch r1 = (com.google.android.gms.internal.measurement.zzch) r1     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0018
            com.google.android.gms.internal.measurement.zzch r2 = new com.google.android.gms.internal.measurement.zzch     // Catch:{ SecurityException -> 0x0018 }
            r2.<init>(r3, r4)     // Catch:{ SecurityException -> 0x0018 }
            java.util.Map<android.net.Uri, com.google.android.gms.internal.measurement.zzch> r3 = g     // Catch:{ SecurityException -> 0x0017 }
            r3.put(r4, r2)     // Catch:{ SecurityException -> 0x0017 }
        L_0x0017:
            r1 = r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r1
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzch.a(android.content.ContentResolver, android.net.Uri):com.google.android.gms.internal.measurement.zzch");
    }

    static synchronized void d() {
        synchronized (zzch.class) {
            for (zzch next : g.values()) {
                next.f9763a.unregisterContentObserver(next.f9765c);
            }
            g.clear();
        }
    }

    /* JADX INFO: finally extract failed */
    private final Map<String, String> f() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Map<String, String> map = (Map) zzco.a(new k0(this));
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return map;
        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return null;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    public final Map<String, String> b() {
        Map<String, String> map = this.f9767e;
        if (map == null) {
            synchronized (this.f9766d) {
                map = this.f9767e;
                if (map == null) {
                    map = f();
                    this.f9767e = map;
                }
            }
        }
        if (map != null) {
            return map;
        }
        return Collections.emptyMap();
    }

    public final void c() {
        synchronized (this.f9766d) {
            this.f9767e = null;
            zzcv.g();
        }
        synchronized (this) {
            for (zzcm a2 : this.f9768f) {
                a2.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Map e() {
        Map map;
        Cursor query = this.f9763a.query(this.f9764b, h, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                map = new a(count);
            } else {
                map = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                map.put(query.getString(0), query.getString(1));
            }
            query.close();
            return map;
        } finally {
            query.close();
        }
    }

    public final /* synthetic */ Object g(String str) {
        return b().get(str);
    }
}
