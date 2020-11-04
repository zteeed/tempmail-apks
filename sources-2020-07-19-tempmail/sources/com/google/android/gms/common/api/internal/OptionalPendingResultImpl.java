package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.Result;

@KeepForSdk
public final class OptionalPendingResultImpl<R extends Result> extends OptionalPendingResult<R> {

    /* renamed from: a  reason: collision with root package name */
    private final BasePendingResult<R> f2760a;

    public final void b() {
        this.f2760a.b();
    }
}
