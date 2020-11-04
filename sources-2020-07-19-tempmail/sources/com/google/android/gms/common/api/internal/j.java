package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import javax.annotation.concurrent.GuardedBy;

final class j extends s {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ConnectionResult f2792b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ i f2793c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    j(i iVar, zabd zabd, ConnectionResult connectionResult) {
        super(zabd);
        this.f2793c = iVar;
        this.f2792b = connectionResult;
    }

    @GuardedBy("mLock")
    public final void a() {
        this.f2793c.f2790d.v(this.f2792b);
    }
}
