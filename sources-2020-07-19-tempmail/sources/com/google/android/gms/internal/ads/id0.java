package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class id0 implements zznk {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final int f4046a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ dd0 f4047b;

    public id0(dd0 dd0, int i) {
        this.f4047b = dd0;
        this.f4046a = i;
    }

    public final void a(long j) {
        this.f4047b.A(this.f4046a, j);
    }

    public final int b(zzhs zzhs, zzjm zzjm, boolean z) {
        return this.f4047b.t(this.f4046a, zzhs, zzjm, z);
    }

    public final void c() throws IOException {
        this.f4047b.F();
    }

    public final boolean isReady() {
        return this.f4047b.x(this.f4046a);
    }
}
