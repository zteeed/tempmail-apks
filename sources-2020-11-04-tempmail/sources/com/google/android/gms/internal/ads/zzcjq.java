package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzto;
import com.google.android.gms.internal.ads.zzty;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcjq implements zzbsq, zzbtd, zzbua, zzbva, zzbww, zzuu {

    /* renamed from: b  reason: collision with root package name */
    private final zztm f7314b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    private boolean f7315c = false;

    public zzcjq(zztm zztm, @Nullable zzdir zzdir) {
        this.f7314b = zztm;
        zztm.a(zzto.zza.C0084zza.AD_REQUEST);
        if (zzdir != null) {
            zztm.a(zzto.zza.C0084zza.REQUEST_IS_PREFETCH);
        }
    }

    public final void B(zzdkw zzdkw) {
        this.f7314b.b(new ek(zzdkw));
    }

    public final void C(zzasm zzasm) {
    }

    public final void V(zzty.zzb zzb) {
        this.f7314b.b(new gk(zzb));
        this.f7314b.a(zzto.zza.C0084zza.REQUEST_SAVED_TO_CACHE);
    }

    public final void e0(zzty.zzb zzb) {
        this.f7314b.b(new dk(zzb));
        this.f7314b.a(zzto.zza.C0084zza.REQUEST_LOADED_FROM_CACHE);
    }

    public final void k(boolean z) {
        zzto.zza.C0084zza zza;
        zztm zztm = this.f7314b;
        if (z) {
            zza = zzto.zza.C0084zza.REQUESTED_CACHE_KEY_FROM_SERVICE_SUCCEEDED;
        } else {
            zza = zzto.zza.C0084zza.REQUESTED_CACHE_KEY_FROM_SERVICE_FAILED;
        }
        zztm.a(zza);
    }

    public final synchronized void onAdClicked() {
        if (!this.f7315c) {
            this.f7314b.a(zzto.zza.C0084zza.AD_FIRST_CLICK);
            this.f7315c = true;
            return;
        }
        this.f7314b.a(zzto.zza.C0084zza.AD_SUBSEQUENT_CLICK);
    }

    public final void onAdFailedToLoad(int i) {
        switch (i) {
            case 1:
                this.f7314b.a(zzto.zza.C0084zza.AD_FAILED_TO_LOAD_INVALID_REQUEST);
                return;
            case 2:
                this.f7314b.a(zzto.zza.C0084zza.AD_FAILED_TO_LOAD_NETWORK_ERROR);
                return;
            case 3:
                this.f7314b.a(zzto.zza.C0084zza.AD_FAILED_TO_LOAD_NO_FILL);
                return;
            case 4:
                this.f7314b.a(zzto.zza.C0084zza.AD_FAILED_TO_LOAD_TIMEOUT);
                return;
            case 5:
                this.f7314b.a(zzto.zza.C0084zza.AD_FAILED_TO_LOAD_CANCELLED);
                return;
            case 6:
                this.f7314b.a(zzto.zza.C0084zza.AD_FAILED_TO_LOAD_NO_ERROR);
                return;
            case 7:
                this.f7314b.a(zzto.zza.C0084zza.AD_FAILED_TO_LOAD_NOT_FOUND);
                return;
            default:
                this.f7314b.a(zzto.zza.C0084zza.AD_FAILED_TO_LOAD);
                return;
        }
    }

    public final synchronized void onAdImpression() {
        this.f7314b.a(zzto.zza.C0084zza.AD_IMPRESSION);
    }

    public final void onAdLoaded() {
        this.f7314b.a(zzto.zza.C0084zza.AD_LOADED);
    }

    public final void r() {
        this.f7314b.a(zzto.zza.C0084zza.REQUEST_FAILED_TO_LOAD_FROM_CACHE);
    }

    public final void y(zzty.zzb zzb) {
        this.f7314b.b(new fk(zzb));
        this.f7314b.a(zzto.zza.C0084zza.REQUEST_PREFETCH_INTERCEPTED);
    }

    public final void z(boolean z) {
        zzto.zza.C0084zza zza;
        zztm zztm = this.f7314b;
        if (z) {
            zza = zzto.zza.C0084zza.NOTIFIED_CACHE_HIT_TO_SERVICE_SUCCEEDED;
        } else {
            zza = zzto.zza.C0084zza.NOTIFIED_CACHE_HIT_TO_SERVICE_FAILED;
        }
        zztm.a(zza);
    }
}
