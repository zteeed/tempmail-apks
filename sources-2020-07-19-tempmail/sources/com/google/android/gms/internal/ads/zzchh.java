package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzchh implements zzahm {

    /* renamed from: b  reason: collision with root package name */
    private final zzbtl f7062b;

    /* renamed from: c  reason: collision with root package name */
    private final zzaub f7063c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7064d;

    /* renamed from: e  reason: collision with root package name */
    private final String f7065e;

    public zzchh(zzbtl zzbtl, zzdkk zzdkk) {
        this.f7062b = zzbtl;
        this.f7063c = zzdkk.l;
        this.f7064d = zzdkk.j;
        this.f7065e = zzdkk.k;
    }

    public final void I() {
        this.f7062b.F0();
    }

    public final void N() {
        this.f7062b.G0();
    }

    @ParametersAreNonnullByDefault
    public final void Q(zzaub zzaub) {
        int i;
        String str;
        zzaub zzaub2 = this.f7063c;
        if (zzaub2 != null) {
            zzaub = zzaub2;
        }
        if (zzaub != null) {
            str = zzaub.f5961b;
            i = zzaub.f5962c;
        } else {
            str = "";
            i = 1;
        }
        this.f7062b.H0(new zzate(str, i), this.f7064d, this.f7065e);
    }
}
