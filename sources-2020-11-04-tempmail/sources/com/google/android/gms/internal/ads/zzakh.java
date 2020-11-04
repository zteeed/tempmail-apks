package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzq;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzakh {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Object f5935a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f5936b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5937c;

    /* renamed from: d  reason: collision with root package name */
    private final zzbbd f5938d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public zzazj<zzaju> f5939e;

    /* renamed from: f  reason: collision with root package name */
    private zzazj<zzaju> f5940f;
    /* access modifiers changed from: private */
    public zzaky g;
    /* access modifiers changed from: private */
    public int h;

    public zzakh(Context context, zzbbd zzbbd, String str) {
        this.f5935a = new Object();
        this.h = 1;
        this.f5937c = str;
        this.f5936b = context.getApplicationContext();
        this.f5938d = zzbbd;
        this.f5939e = new zzakv();
        this.f5940f = new zzakv();
    }

    /* access modifiers changed from: protected */
    public final zzaky c(zzeg zzeg) {
        zzaky zzaky = new zzaky(this.f5940f);
        zzbbf.f6324e.execute(new i1(this, zzeg, zzaky));
        zzaky.d(new r1(this, zzaky), new u1(this, zzaky));
        return zzaky;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e(zzaju zzaju) {
        if (zzaju.l()) {
            this.h = 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void f(com.google.android.gms.internal.ads.zzaky r4, com.google.android.gms.internal.ads.zzaju r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f5935a
            monitor-enter(r0)
            int r1 = r4.a()     // Catch:{ all -> 0x002a }
            r2 = -1
            if (r1 == r2) goto L_0x0028
            int r1 = r4.a()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != r2) goto L_0x0012
            goto L_0x0028
        L_0x0012:
            r4.b()     // Catch:{ all -> 0x002a }
            com.google.android.gms.internal.ads.zzdvi r4 = com.google.android.gms.internal.ads.zzbbf.f6324e     // Catch:{ all -> 0x002a }
            r5.getClass()     // Catch:{ all -> 0x002a }
            java.lang.Runnable r5 = com.google.android.gms.internal.ads.o1.a(r5)     // Catch:{ all -> 0x002a }
            r4.execute(r5)     // Catch:{ all -> 0x002a }
            java.lang.String r4 = "Could not receive loaded message in a timely manner. Rejecting."
            com.google.android.gms.internal.ads.zzaxv.m(r4)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakh.f(com.google.android.gms.internal.ads.zzaky, com.google.android.gms.internal.ads.zzaju):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g(zzeg zzeg, zzaky zzaky) {
        zzaju zzaju;
        try {
            Context context = this.f5936b;
            zzbbd zzbbd = this.f5938d;
            if (zzacw.f5801c.a().booleanValue()) {
                zzaju = new zzajg(context, zzbbd);
            } else {
                zzaju = new zzajw(context, zzbbd, zzeg, (zza) null);
            }
            zzaju.s(new m1(this, zzaky, zzaju));
            zzaju.c("/jsLoaded", new n1(this, zzaky, zzaju));
            zzbaf zzbaf = new zzbaf();
            q1 q1Var = new q1(this, zzeg, zzaju, zzbaf);
            zzbaf.b(q1Var);
            zzaju.c("/requestReload", q1Var);
            if (this.f5937c.endsWith(".js")) {
                zzaju.L(this.f5937c);
            } else if (this.f5937c.startsWith("<html>")) {
                zzaju.Q(this.f5937c);
            } else {
                zzaju.g0(this.f5937c);
            }
            zzaye.h.postDelayed(new p1(this, zzaky, zzaju), (long) t1.f5126a);
        } catch (Throwable th) {
            zzbba.c("Error creating webview.", th);
            zzq.zzla().e(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzaky.b();
        }
    }

    public final zzaku h(zzeg zzeg) {
        synchronized (this.f5935a) {
            synchronized (this.f5935a) {
                if (this.g != null && this.h == 0) {
                    this.g.d(new k1(this), j1.f4273a);
                }
            }
            if (this.g != null) {
                if (this.g.a() != -1) {
                    if (this.h == 0) {
                        zzaku g2 = this.g.g();
                        return g2;
                    } else if (this.h == 1) {
                        this.h = 2;
                        c((zzeg) null);
                        zzaku g3 = this.g.g();
                        return g3;
                    } else if (this.h == 2) {
                        zzaku g4 = this.g.g();
                        return g4;
                    } else {
                        zzaku g5 = this.g.g();
                        return g5;
                    }
                }
            }
            this.h = 2;
            zzaky c2 = c((zzeg) null);
            this.g = c2;
            zzaku g6 = c2.g();
            return g6;
        }
    }

    public zzakh(Context context, zzbbd zzbbd, String str, zzazj<zzaju> zzazj, zzazj<zzaju> zzazj2) {
        this(context, zzbbd, str);
        this.f5939e = zzazj;
        this.f5940f = zzazj2;
    }
}
