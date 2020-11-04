package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.IntentSender;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;

public abstract class ResolvingResultCallbacks<R extends Result> extends ResultCallbacks<R> {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f2705a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2706b;

    @KeepForSdk
    public final void b(Status status) {
        if (status.A()) {
            try {
                status.G(this.f2705a, this.f2706b);
            } catch (IntentSender.SendIntentException e2) {
                Log.e("ResolvingResultCallback", "Failed to start resolution", e2);
                d(new Status(8));
            }
        } else {
            d(status);
        }
    }

    public abstract void d(Status status);
}
