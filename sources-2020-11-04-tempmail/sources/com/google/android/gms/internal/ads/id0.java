package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class id0 implements zznk {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final int f4229a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ dd0 f4230b;

    public id0(dd0 dd0, int i) {
        this.f4230b = dd0;
        this.f4229a = i;
    }

    public final void a(long j) {
        this.f4230b.A(this.f4229a, j);
    }

    public final int b(zzhs zzhs, zzjm zzjm, boolean z) {
        return this.f4230b.t(this.f4229a, zzhs, zzjm, z);
    }

    public final void c() throws IOException {
        this.f4230b.F();
    }

    public final boolean isReady() {
        return this.f4230b.x(this.f4229a);
    }
}
