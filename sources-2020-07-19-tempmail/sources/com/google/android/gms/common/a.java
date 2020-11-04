package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzm;
import com.google.android.gms.common.internal.zzn;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
final class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile zzm f2676a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f2677b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static Context f2678c;

    static i a(String str, c cVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return d(str, cVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    static final /* synthetic */ String b(boolean z, String str, c cVar) throws Exception {
        boolean z2 = true;
        if (z || !d(str, cVar, true, false).f2946a) {
            z2 = false;
        }
        return i.e(str, cVar, z, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void c(android.content.Context r2) {
        /*
            java.lang.Class<com.google.android.gms.common.a> r0 = com.google.android.gms.common.a.class
            monitor-enter(r0)
            android.content.Context r1 = f2678c     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0011
            if (r2 == 0) goto L_0x0018
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x001a }
            f2678c = r2     // Catch:{ all -> 0x001a }
            monitor-exit(r0)
            return
        L_0x0011:
            java.lang.String r2 = "GoogleCertificates"
            java.lang.String r1 = "GoogleCertificates has been initialized already"
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r0)
            return
        L_0x001a:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.a.c(android.content.Context):void");
    }

    private static i d(String str, c cVar, boolean z, boolean z2) {
        try {
            if (f2676a == null) {
                Preconditions.k(f2678c);
                synchronized (f2677b) {
                    if (f2676a == null) {
                        f2676a = zzn.E(DynamiteModule.e(f2678c, DynamiteModule.k, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                }
            }
            Preconditions.k(f2678c);
            try {
                if (f2676a.D1(new zzk(str, cVar, z, z2), ObjectWrapper.b0(f2678c.getPackageManager()))) {
                    return i.f();
                }
                return i.c(new b(z, str, cVar));
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return i.b("module call", e2);
            }
        } catch (DynamiteModule.LoadingException e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            String valueOf = String.valueOf(e3.getMessage());
            return i.b(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e3);
        }
    }
}
