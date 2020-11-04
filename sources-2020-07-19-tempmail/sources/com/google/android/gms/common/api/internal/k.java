package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import javax.annotation.concurrent.GuardedBy;

final class k extends s {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ BaseGmsClient.ConnectionProgressReportCallbacks f2796b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    k(i iVar, zabd zabd, BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        super(zabd);
        this.f2796b = connectionProgressReportCallbacks;
    }

    @GuardedBy("mLock")
    public final void a() {
        this.f2796b.a(new ConnectionResult(16, (PendingIntent) null));
    }
}
