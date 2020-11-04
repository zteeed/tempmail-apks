package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

public class HashAccumulator {
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    private static int f2645b = 31;

    /* renamed from: a  reason: collision with root package name */
    private int f2646a = 1;

    @KeepForSdk
    public HashAccumulator a(Object obj) {
        this.f2646a = (f2645b * this.f2646a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    @KeepForSdk
    public int b() {
        return this.f2646a;
    }

    public final HashAccumulator c(boolean z) {
        this.f2646a = (f2645b * this.f2646a) + (z ? 1 : 0);
        return this;
    }
}
