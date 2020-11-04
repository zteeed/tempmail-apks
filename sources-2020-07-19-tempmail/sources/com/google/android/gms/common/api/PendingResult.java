package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;

@KeepForSdk
public abstract class PendingResult<R extends Result> {

    @KeepForSdk
    public interface StatusListener {
        @KeepForSdk
        void a(Status status);
    }

    public abstract void b();
}
