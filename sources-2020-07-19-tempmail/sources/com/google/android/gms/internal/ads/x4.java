package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class x4 {

    /* renamed from: a  reason: collision with root package name */
    private long f5279a = -1;

    /* renamed from: b  reason: collision with root package name */
    private long f5280b = -1;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzaxg f5281c;

    public x4(zzaxg zzaxg) {
        this.f5281c = zzaxg;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f5279a);
        bundle.putLong("tclose", this.f5280b);
        return bundle;
    }

    public final long b() {
        return this.f5280b;
    }

    public final void c() {
        this.f5280b = this.f5281c.f6010a.b();
    }

    public final void d() {
        this.f5279a = this.f5281c.f6010a.b();
    }
}
