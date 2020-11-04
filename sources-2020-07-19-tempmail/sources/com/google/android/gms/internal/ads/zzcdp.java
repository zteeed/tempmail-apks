package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcdp implements zzela<zzcdn> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzcgr> f6898a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Clock> f6899b;

    public zzcdp(zzelj<zzcgr> zzelj, zzelj<Clock> zzelj2) {
        this.f6898a = zzelj;
        this.f6899b = zzelj2;
    }

    public final /* synthetic */ Object get() {
        return new zzcdn(this.f6898a.get(), this.f6899b.get());
    }
}
