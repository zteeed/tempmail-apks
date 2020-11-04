package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zze;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcvo implements zze {

    /* renamed from: a  reason: collision with root package name */
    private final zzbsk f7782a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbtc f7783b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbyk f7784c;

    /* renamed from: d  reason: collision with root package name */
    private final zzbyj f7785d;

    /* renamed from: e  reason: collision with root package name */
    private final zzblu f7786e;

    /* renamed from: f  reason: collision with root package name */
    private AtomicBoolean f7787f = new AtomicBoolean(false);

    zzcvo(zzbsk zzbsk, zzbtc zzbtc, zzbyk zzbyk, zzbyj zzbyj, zzblu zzblu) {
        this.f7782a = zzbsk;
        this.f7783b = zzbtc;
        this.f7784c = zzbyk;
        this.f7785d = zzbyj;
        this.f7786e = zzblu;
    }

    public final synchronized void zzh(View view) {
        if (this.f7787f.compareAndSet(false, true)) {
            this.f7786e.onAdImpression();
            this.f7785d.C0(view);
        }
    }

    public final void zzjz() {
        if (this.f7787f.get()) {
            this.f7782a.onAdClicked();
        }
    }

    public final void zzka() {
        if (this.f7787f.get()) {
            this.f7783b.onAdImpression();
            this.f7784c.C0();
        }
    }
}
