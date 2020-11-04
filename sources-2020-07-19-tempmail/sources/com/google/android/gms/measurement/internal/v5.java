package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class v5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzij f10280b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzij f10281c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f10282d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ boolean f10283e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzii f10284f;

    v5(zzii zzii, zzij zzij, zzij zzij2, long j, boolean z) {
        this.f10284f = zzii;
        this.f10280b = zzij;
        this.f10281c = zzij2;
        this.f10282d = j;
        this.f10283e = z;
    }

    public final void run() {
        this.f10284f.Q(this.f10280b, this.f10281c, this.f10282d, this.f10283e, (Bundle) null);
    }
}
