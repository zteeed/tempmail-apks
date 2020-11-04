package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdp implements zzdw {
    private static zzdp m;

    /* renamed from: b  reason: collision with root package name */
    private final Context f8273b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdrb f8274c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdrm f8275d;

    /* renamed from: e  reason: collision with root package name */
    private final ba0 f8276e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final zzdpm f8277f;
    private final Executor g;
    private final zzgo h;
    private final zzdrh i;
    private volatile long j = 0;
    /* access modifiers changed from: private */
    public final Object k = new Object();
    /* access modifiers changed from: private */
    public volatile boolean l;

    private zzdp(Context context, zzdpm zzdpm, zzdrb zzdrb, zzdrm zzdrm, ba0 ba0, Executor executor, zzdpk zzdpk, zzgo zzgo) {
        this.f8273b = context;
        this.f8277f = zzdpm;
        this.f8274c = zzdrb;
        this.f8275d = zzdrm;
        this.f8276e = ba0;
        this.g = executor;
        this.h = zzgo;
        this.i = new gz(this, zzdpk);
    }

    static zzdp a(Context context, zzdpm zzdpm, zzdpn zzdpn) {
        return b(context, zzdpm, zzdpn, Executors.newCachedThreadPool());
    }

    private static zzdp b(Context context, zzdpm zzdpm, zzdpn zzdpn, Executor executor) {
        zzdpz b2 = zzdpz.b(context, executor, zzdpm, zzdpn);
        zzev zzev = new zzev(context);
        ba0 ba0 = new ba0(zzdpn, b2, new zzfi(context, zzev), zzev);
        zzgo c2 = new zzdqp(context, zzdpm).c();
        zzdpk zzdpk = new zzdpk();
        return new zzdp(context, zzdpm, new zzdrb(context, c2), new zzdrm(context, ba0, zzdpm, zzdpk), ba0, executor, zzdpk, c2);
    }

    public static synchronized zzdp c(String str, Context context, boolean z) {
        zzdp zzdp;
        synchronized (zzdp.class) {
            if (m == null) {
                zzdpq c2 = zzdpn.c();
                c2.d(str);
                c2.b(z);
                zzdpn a2 = c2.a();
                ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
                zzdp b2 = b(context, zzdpm.a(context, newCachedThreadPool), a2, newCachedThreadPool);
                m = b2;
                b2.g();
                m.j();
            }
            zzdp = m;
        }
        return zzdp;
    }

    /* access modifiers changed from: private */
    public final void i() {
        String str;
        String str2;
        long currentTimeMillis = System.currentTimeMillis();
        zzdrc f2 = this.f8274c.f(zzdrk.f8346a);
        if (f2 != null) {
            String R = f2.b().R();
            str = f2.b().T();
            str2 = R;
        } else {
            str2 = null;
            str = null;
        }
        try {
            zzdrf a2 = zzdpv.a(this.f8273b, 1, this.h, str2, str, "1", this.f8277f);
            if (a2.f8343c != null) {
                if (a2.f8343c.length != 0) {
                    zzgq G = zzgq.G(zzeer.U(a2.f8343c), zzefo.c());
                    boolean z = false;
                    if (!G.H().R().isEmpty() && !G.H().T().isEmpty()) {
                        if (G.L().c().length != 0) {
                            zzdrc f3 = this.f8274c.f(zzdrk.f8346a);
                            if (f3 != null) {
                                zzgr b2 = f3.b();
                                if (b2 != null) {
                                    if (G.H().R().equals(b2.R())) {
                                        if (!G.H().T().equals(b2.T())) {
                                        }
                                    }
                                }
                            }
                            z = true;
                        }
                    }
                    if (!z) {
                        this.f8277f.h(5010, System.currentTimeMillis() - currentTimeMillis);
                        return;
                    } else if (!this.f8274c.b(G, this.i)) {
                        this.f8277f.h(4009, System.currentTimeMillis() - currentTimeMillis);
                        return;
                    } else {
                        this.f8275d.e(this.f8274c.f(zzdrk.f8346a));
                        this.j = System.currentTimeMillis() / 1000;
                        return;
                    }
                }
            }
            this.f8277f.h(5009, System.currentTimeMillis() - currentTimeMillis);
        } catch (zzegl e2) {
            this.f8277f.b(4002, System.currentTimeMillis() - currentTimeMillis, e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void j() {
        /*
            r6 = this;
            boolean r0 = r6.l
            if (r0 != 0) goto L_0x0033
            java.lang.Object r0 = r6.k
            monitor-enter(r0)
            boolean r1 = r6.l     // Catch:{ all -> 0x0030 }
            if (r1 != 0) goto L_0x002e
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0030 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            long r3 = r6.j     // Catch:{ all -> 0x0030 }
            long r1 = r1 - r3
            r3 = 3600(0xe10, double:1.7786E-320)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x001d:
            com.google.android.gms.internal.ads.zzdrm r1 = r6.f8275d     // Catch:{ all -> 0x0030 }
            com.google.android.gms.internal.ads.zzdrc r1 = r1.d()     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002b
            boolean r1 = r1.f(r3)     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002e
        L_0x002b:
            r6.h()     // Catch:{ all -> 0x0030 }
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0030:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r1
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdp.j():void");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void g() {
        long currentTimeMillis = System.currentTimeMillis();
        zzdrc f2 = this.f8274c.f(zzdrk.f8346a);
        if (f2 == null || f2.a()) {
            this.f8277f.h(4013, System.currentTimeMillis() - currentTimeMillis);
        } else {
            this.f8275d.e(f2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        this.g.execute(new bz(this));
    }

    public final void zza(int i2, int i3, int i4) {
    }

    public final void zza(MotionEvent motionEvent) {
        zzdpp c2 = this.f8275d.c();
        if (c2 != null) {
            try {
                c2.a((String) null, motionEvent);
            } catch (zzdrj e2) {
                this.f8277f.b(e2.a(), -1, e2);
            }
        }
    }

    public final void zzb(View view) {
        this.f8276e.d(view);
    }

    public final String zzb(Context context) {
        j();
        zzdpp c2 = this.f8275d.c();
        if (c2 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String b2 = c2.b(context, (String) null);
        this.f8277f.d(5001, System.currentTimeMillis() - currentTimeMillis, b2, (Map<String, String>) null);
        return b2;
    }

    public final String zza(Context context, String str, View view, Activity activity) {
        j();
        zzdpp c2 = this.f8275d.c();
        if (c2 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String c3 = c2.c(context, (String) null, str, view, activity);
        this.f8277f.d(5000, System.currentTimeMillis() - currentTimeMillis, c3, (Map<String, String>) null);
        return c3;
    }

    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, (Activity) null);
    }

    public final String zza(Context context, View view, Activity activity) {
        j();
        zzdpp c2 = this.f8275d.c();
        if (c2 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String d2 = c2.d(context, (String) null, view, activity);
        this.f8277f.d(5002, System.currentTimeMillis() - currentTimeMillis, d2, (Map<String, String>) null);
        return d2;
    }
}
