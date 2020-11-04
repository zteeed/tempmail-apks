package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public abstract class zzcng implements zzduh<zzasm, zzdkw> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final zzbuv f7457a;

    public zzcng(zzbuv zzbuv) {
        this.f7457a = zzbuv;
    }

    /* access modifiers changed from: protected */
    public abstract zzdvf<zzdkw> c(zzasm zzasm) throws zzcmi;

    public final /* synthetic */ zzdvf zzf(Object obj) throws Exception {
        zzasm zzasm = (zzasm) obj;
        this.f7457a.C(zzasm);
        zzdvf<zzdkw> c2 = c(zzasm);
        zzdux.f(c2, new kl(this), zzbbf.f6325f);
        return c2;
    }
}
