package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzchh implements zzahm {

    /* renamed from: b  reason: collision with root package name */
    private final zzbtl f7245b;

    /* renamed from: c  reason: collision with root package name */
    private final zzaub f7246c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7247d;

    /* renamed from: e  reason: collision with root package name */
    private final String f7248e;

    public zzchh(zzbtl zzbtl, zzdkk zzdkk) {
        this.f7245b = zzbtl;
        this.f7246c = zzdkk.l;
        this.f7247d = zzdkk.j;
        this.f7248e = zzdkk.k;
    }

    public final void I() {
        this.f7245b.F0();
    }

    public final void N() {
        this.f7245b.G0();
    }

    @ParametersAreNonnullByDefault
    public final void Q(zzaub zzaub) {
        int i;
        String str;
        zzaub zzaub2 = this.f7246c;
        if (zzaub2 != null) {
            zzaub = zzaub2;
        }
        if (zzaub != null) {
            str = zzaub.f6144b;
            i = zzaub.f6145c;
        } else {
            str = "";
            i = 1;
        }
        this.f7245b.H0(new zzate(str, i), this.f7247d, this.f7248e);
    }
}
