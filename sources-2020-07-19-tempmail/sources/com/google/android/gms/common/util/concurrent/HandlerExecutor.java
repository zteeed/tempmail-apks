package com.google.android.gms.common.util.concurrent;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.common.zze;
import java.util.concurrent.Executor;

@KeepForSdk
public class HandlerExecutor implements Executor {

    /* renamed from: b  reason: collision with root package name */
    private final Handler f3130b;

    @KeepForSdk
    public HandlerExecutor(Looper looper) {
        this.f3130b = new zze(looper);
    }

    public void execute(Runnable runnable) {
        this.f3130b.post(runnable);
    }
}