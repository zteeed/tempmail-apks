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
    private final ConcurrentHashMap<zzdmv, zw> f3501a;

    /* renamed from: b  reason: collision with root package name */
    private zzdms f3502b;

    /* renamed from: c  reason: collision with root package name */
    private cx f3503c = new cx();

    public bx(zzdms zzdms) {
        this.f3501a = new ConcurrentHashMap<>(zzdms.i);
        this.f3502b = zzdms;
    }

    private final void f() {
        if (zzdms.v()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f3502b.g);
            sb.append(" PoolCollection");
            sb.append(this.f3503c.g());
            int i = 0;
            for (Map.Entry next : this.f3501a.entrySet()) {
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
                for (int b2 = ((zw) next.getValue()).b(); b2 < this.f3502b.i; b2++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zw) next.getValue()).f());
                sb.append("\n");
            }
            while (i < this.f3502b.h) {
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
            zzty.zzb.zza.C0087zza P = zzty.zzb.zza.P();
            P.w(zzty.zzb.C0088zzb.IN_MEMORY);
            zzty.zzb.zzd.zza L = zzty.zzb.zzd.L();
            L.x(zzdnm.f8244b);
            L.w(zzdnm.f8245c);
            P.x(L);
            I.w(P);
            zzdmw.f8227a.h().e0((zzty.zzb) ((zzegb) I.O()));
        }
        f();
    }

    public final synchronized boolean a(zzdmv zzdmv) {
        zw zwVar = this.f3501a.get(zzdmv);
        if (zwVar == null) {
            return true;
        }
        if (zwVar.b() < this.f3502b.i) {
            return true;
        }
        return false;
    }

    public final synchronized zzdmw<?> b(zzdmv zzdmv) {
        zzdmw<?> zzdmw;
        zw zwVar = this.f3501a.get(zzdmv);
        zzdmw = null;
        if (zwVar != null) {
            zzdmw = zwVar.c();
            if (zzdmw == null) {
                this.f3503c.b();
            }
            g(zzdmw, zwVar.g());
        } else {
            this.f3503c.a();
            g((zzdmw<?>) null, (zzdnm) null);
        }
        return zzdmw;
    }

    public final zzdms c() {
        return this.f3502b;
    }

    @Deprecated
    public final zzdmv d(zzve zzve, String str, zzvo zzvo) {
        return new zzdmy(zzve, str, new zzasu(this.f3502b.f8219e).d().j, this.f3502b.k, zzvo);
    }

    public final synchronized boolean e(zzdmv zzdmv, zzdmw<?> zzdmw) {
        boolean i;
        zw zwVar = this.f3501a.get(zzdmv);
        zzdmw.f8230d = zzq.zzld().a();
        if (zwVar == null) {
            zwVar = new zw(this.f3502b.i, this.f3502b.j * 1000);
            if (this.f3501a.size() == this.f3502b.h) {
                int i2 = ax.f3407a[this.f3502b.m - 1];
                long j = Long.MAX_VALUE;
                zzdmv zzdmv2 = null;
                if (i2 == 1) {
                    for (Map.Entry next : this.f3501a.entrySet()) {
                        if (((zw) next.getValue()).a() < j) {
                            j = ((zw) next.getValue()).a();
                            zzdmv2 = (zzdmv) next.getKey();
                        }
                    }
                    if (zzdmv2 != null) {
                        this.f3501a.remove(zzdmv2);
                    }
                } else if (i2 == 2) {
                    for (Map.Entry next2 : this.f3501a.entrySet()) {
                        if (((zw) next2.getValue()).d() < j) {
                            j = ((zw) next2.getValue()).d();
                            zzdmv2 = (zzdmv) next2.getKey();
                        }
                    }
                    if (zzdmv2 != null) {
                        this.f3501a.remove(zzdmv2);
                    }
                } else if (i2 == 3) {
                    int i3 = Integer.MAX_VALUE;
                    for (Map.Entry next3 : this.f3501a.entrySet()) {
                        if (((zw) next3.getValue()).e() < i3) {
                            i3 = ((zw) next3.getValue()).e();
                            zzdmv2 = (zzdmv) next3.getKey();
                        }
                    }
                    if (zzdmv2 != null) {
                        this.f3501a.remove(zzdmv2);
                    }
                }
                this.f3503c.d();
            }
            this.f3501a.put(zzdmv, zwVar);
            this.f3503c.c();
        }
        i = zwVar.i(zzdmw);
        this.f3503c.e();
        zzdmp f2 = this.f3503c.f();
        zzdnm g = zwVar.g();
        if (zzdmw != null) {
            zzty.zzb.zzc I = zzty.zzb.I();
            zzty.zzb.zza.C0087zza P = zzty.zzb.zza.P();
            P.w(zzty.zzb.C0088zzb.IN_MEMORY);
            zzty.zzb.zze.zza M = zzty.zzb.zze.M();
            M.x(f2.f8210b);
            M.y(f2.f8211c);
            M.w(g.f8245c);
            P.y(M);
            I.w(P);
            zzdmw.f8227a.h().V((zzty.zzb) ((zzegb) I.O()));
        }
        f();
        return i;
    }
}
