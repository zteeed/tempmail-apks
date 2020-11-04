package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zze;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcvo implements zze {

    /* renamed from: a  reason: collision with root package name */
    private final zzbsk f7599a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbtc f7600b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbyk f7601c;

    /* renamed from: d  reason: collision with root package name */
    private final zzbyj f7602d;

    /* renamed from: e  reason: collision with root package name */
    private final zzblu f7603e;

    /* renamed from: f  reason: collision with root package name */
    private AtomicBoolean f7604f = new AtomicBoolean(false);

    zzcvo(zzbsk zzbsk, zzbtc zzbtc, zzbyk zzbyk, zzbyj zzbyj, zzblu zzblu) {
        this.f7599a = zzbsk;
        this.f7600b = zzbtc;
        this.f7601c = zzbyk;
        this.f7602d = zzbyj;
        this.f7603e = zzblu;
    }

    public final synchronized void zzh(View view) {
        if (this.f7604f.compareAndSet(false, true)) {
            this.f7603e.onAdImpression();
            this.f7602d.C0(view);
        }
    }

    public final void zzjz() {
        if (this.f7604f.get()) {
            this.f7599a.onAdClicked();
        }
    }

    public final void zzka() {
        if (this.f7604f.get()) {
            this.f7600b.onAdImpression();
            this.f7601c.C0();
        }
    }
}
