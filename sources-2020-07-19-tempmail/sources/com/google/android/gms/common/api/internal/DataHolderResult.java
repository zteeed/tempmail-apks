package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

@KeepForSdk
public class DataHolderResult implements Releasable, Result {
    @KeepForSdk

    /* renamed from: b  reason: collision with root package name */
    protected final Status f2728b;
    @KeepForSdk

    /* renamed from: c  reason: collision with root package name */
    protected final DataHolder f2729c;

    @KeepForSdk
    public Status q() {
        return this.f2728b;
    }

    @KeepForSdk
    public void release() {
        DataHolder dataHolder = this.f2729c;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}
