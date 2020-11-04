package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.internal.ads.zzty;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class bx implements zzdml {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<zzdmv, zw> f3684a;

    /* renamed from: b  reason: collision with root package name */
    private zzdms f3685b;

    /* renamed from: c  reason: collision with root package name */
    private cx f3686c = new cx();

    public bx(zzdms zzdms) {
        this.f3684a = new ConcurrentHashMap<>(zzdms.i);
        this.f3685b = zzdms;
    }

    private final void f() {
        if (zzdms.v()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f3685b.g);
            sb.append(" PoolCollection");
            sb.append(this.f3686c.g());
            int i = 0;
            for (Map.Entry next : this.f3684a.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(next.getValue());
                sb.append("#");
                sb.append(((zzdmv) next.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((zw) next.getValue()).b(); i2++) {
                    sb.append("[O]");
                }
                for (int b2 = ((zw) next.getValue()).b(); b2 < this.f3685b.i; b2++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zw) next.getValue()).f());
                sb.append("\n");
            }
            while (i < this.f3685b.h) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            zzbba.f(sb.toString());
        }
    }

    private final void g(zzdmw<?> zzdmw, zzdnm zzdnm) {
        if (zzdmw != null) {
            zzty.zzb.zzc I = zzty.zzb.I();
            zzty.zzb.zza.C0086zza P = zzty.zzb.zza.P();
            P.w(zzty.zzb.C0087zzb.IN_MEMORY);
            zzty.zzb.zzd.zza L = zzty.zzb.zzd.L();
            L.x(zzdnm.f8427b);
            L.w(zzdnm.f8428c);
            P.x(L);
            I.w(P);
            zzdmw.f8410a.h().e0((zzty.zzb) ((zzegb) I.O()));
        }
        f();
    }

    public final synchronized boolean a(zzdmv zzdmv) {
        zw zwVar = this.f3684a.get(zzdmv);
        if (zwVar == null) {
            return true;
        }
        if (zwVar.b() < this.f3685b.i) {
            return true;
        }
        return false;
    }

    public final synchronized zzdmw<?> b(zzdmv zzdmv) {
        zzdmw<?> zzdmw;
        zw zwVar = this.f3684a.get(zzdmv);
        zzdmw = null;
        if (zwVar != null) {
            zzdmw = zwVar.c();
            if (zzdmw == null) {
                this.f3686c.b();
            }
            g(zzdmw, zwVar.g());
        } else {
            this.f3686c.a();
            g((zzdmw<?>) null, (zzdnm) null);
        }
        return zzdmw;
    }

    public final zzdms c() {
        return this.f3685b;
    }

    @Deprecated
    public final zzdmv d(zzve zzve, String str, zzvo zzvo) {
        return new zzdmy(zzve, str, new zzasu(this.f3685b.f8402e).d().j, this.f3685b.k, zzvo);
    }

    public final synchronized boolean e(zzdmv zzdmv, zzdmw<?> zzdmw) {
        boolean i;
        zw zwVar = this.f3684a.get(zzdmv);
        zzdmw.f8413d = zzq.zzld().a();
        if (zwVar == null) {
            zwVar = new zw(this.f3685b.i, this.f3685b.j * 1000);
            if (this.f3684a.size() == this.f3685b.h) {
                int i2 = ax.f3590a[this.f3685b.m - 1];
                long j = Long.MAX_VALUE;
                zzdmv zzdmv2 = null;
                if (i2 == 1) {
                    for (Map.Entry next : this.f3684a.entrySet()) {
                        if (((zw) next.getValue()).a() < j) {
                            j = ((zw) next.getValue()).a();
                            zzdmv2 = (zzdmv) next.getKey();
                        }
                    }
                    if (zzdmv2 != null) {
                        this.f3684a.remove(zzdmv2);
                    }
                } else if (i2 == 2) {
                    for (Map.Entry next2 : this.f3684a.entrySet()) {
                        if (((zw) next2.getValue()).d() < j) {
                            j = ((zw) next2.getValue()).d();
                            zzdmv2 = (zzdmv) next2.getKey();
                        }
                    }
                    if (zzdmv2 != null) {
                        this.f3684a.remove(zzdmv2);
                    }
                } else if (i2 == 3) {
                    int i3 = Integer.MAX_VALUE;
                    for (Map.Entry next3 : this.f3684a.entrySet()) {
                        if (((zw) next3.getValue()).e() < i3) {
                            i3 = ((zw) next3.getValue()).e();
                            zzdmv2 = (zzdmv) next3.getKey();
                        }
                    }
                    if (zzdmv2 != null) {
                        this.f3684a.remove(zzdmv2);
                    }
                }
                this.f3686c.d();
            }
            this.f3684a.put(zzdmv, zwVar);
            this.f3686c.c();
        }
        i = zwVar.i(zzdmw);
        this.f3686c.e();
        zzdmp f2 = this.f3686c.f();
        zzdnm g = zwVar.g();
        if (zzdmw != null) {
            zzty.zzb.zzc I = zzty.zzb.I();
            zzty.zzb.zza.C0086zza P = zzty.zzb.zza.P();
            P.w(zzty.zzb.C0087zzb.IN_MEMORY);
            zzty.zzb.zze.zza M = zzty.zzb.zze.M();
            M.x(f2.f8393b);
            M.y(f2.f8394c);
            M.w(g.f8428c);
            P.y(M);
            I.w(P);
            zzdmw.f8410a.h().V((zzty.zzb) ((zzegb) I.O()));
        }
        f();
        return i;
    }
}
