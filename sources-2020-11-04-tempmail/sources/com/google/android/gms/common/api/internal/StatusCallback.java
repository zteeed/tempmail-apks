package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.IStatusCallback;

@KeepForSdk
public class StatusCallback extends IStatusCallback.Stub {
    @KeepForSdk

    /* renamed from: b  reason: collision with root package name */
    private final BaseImplementation.ResultHolder<Status> f2952b;

    @KeepForSdk
    public void i2(Status status) {
        this.f2952b.a(status);
    }
}
