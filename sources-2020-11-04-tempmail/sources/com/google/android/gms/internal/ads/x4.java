package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class x4 {

    /* renamed from: a  reason: collision with root package name */
    private long f5462a = -1;

    /* renamed from: b  reason: collision with root package name */
    private long f5463b = -1;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzaxg f5464c;

    public x4(zzaxg zzaxg) {
        this.f5464c = zzaxg;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f5462a);
        bundle.putLong("tclose", this.f5463b);
        return bundle;
    }

    public final long b() {
        return this.f5463b;
    }

    public final void c() {
        this.f5463b = this.f5464c.f6193a.b();
    }

    public final void d() {
        this.f5462a = this.f5464c.f6193a.b();
    }
}
