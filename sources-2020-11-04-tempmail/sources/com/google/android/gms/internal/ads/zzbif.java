package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzbkb;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public abstract class zzbif implements zzblb {
    @GuardedBy("AppComponent.class")

    /* renamed from: a  reason: collision with root package name */
    private static zzbif f6451a;

    public static zzbif b(Context context, zzamr zzamr, int i) {
        zzbif v = v(context, i);
        v.j().c(zzamr);
        return v;
    }

    @Deprecated
    private static zzbif c(zzbbd zzbbd, Context context, zzbkb.zza zza) {
        zzbif zzbif;
        synchronized (zzbif.class) {
            if (f6451a == null) {
                zzbjp zzbjp = new zzbjp();
                zzbie.zza zza2 = new zzbie.zza();
                zza2.b(zzbbd);
                zza2.d(context);
                zzbjp.c(new zzbie(zza2));
                zzbjp.a(new zzbkb(zza));
                f6451a = zzbjp.b();
                zzaav.a(context);
                zzq.zzla().k(context, zzbbd);
                zzq.zzlc().c(context);
                zzq.zzkw().u(context);
                zzq.zzkw().v(context);
                zzaxt.a(context);
                zzq.zzkz().c(context);
                zzq.zzlr().a(context);
                if (((Boolean) zzwg.e().c(zzaav.b3)).booleanValue()) {
                    new zzcqp(context, zzbbd, new zztm(new zztr(context)), new zzcpz(new zzcpx(context), f6451a.h())).a();
                }
            }
            zzbif = f6451a;
        }
        return zzbif;
    }

    @Deprecated
    public static zzbif v(Context context, int i) {
        synchronized (zzbif.class) {
            if (f6451a == null) {
                return c(new zzbbd(201604000, i, true, false), context, new zzbja());
            }
            zzbif zzbif = f6451a;
            return zzbif;
        }
    }

    public final zzdeu a(zzasm zzasm, int i) {
        return d(new zzdgd(zzasm, i));
    }

    /* access modifiers changed from: protected */
    public abstract zzdeu d(zzdgd zzdgd);

    public abstract Executor e();

    public abstract ScheduledExecutorService f();

    public abstract Executor g();

    public abstract zzdvi h();

    public abstract zzbus i();

    public abstract zzcix j();

    public abstract zzbkg k();

    public abstract zzbob l();

    public abstract zzbmt m();

    public abstract zzdhf n();

    public abstract zzcah o();

    public abstract zzcbf p();

    public abstract zzchp q();

    public abstract zzdkb r();

    public abstract zzcxw s();

    public abstract zzcxz t();

    public abstract zzdll<zzcgr> u();
}
