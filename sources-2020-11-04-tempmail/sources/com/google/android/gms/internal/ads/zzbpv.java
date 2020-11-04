package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbpv implements zzo {

    /* renamed from: b  reason: collision with root package name */
    private final zzbtl f6692b;

    /* renamed from: c  reason: collision with root package name */
    private AtomicBoolean f6693c = new AtomicBoolean(false);

    public zzbpv(zzbtl zzbtl) {
        this.f6692b = zzbtl;
    }

    public final boolean a() {
        return this.f6693c.get();
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public final void zzud() {
        this.f6693c.set(true);
        this.f6692b.C0();
    }

    public final void zzue() {
        this.f6692b.E0();
    }
}
