package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public class BooleanResult implements Result {

    /* renamed from: b  reason: collision with root package name */
    private final Status f2873b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f2874c;

    @KeepForSdk
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BooleanResult)) {
            return false;
        }
        BooleanResult booleanResult = (BooleanResult) obj;
        return this.f2873b.equals(booleanResult.f2873b) && this.f2874c == booleanResult.f2874c;
    }

    @KeepForSdk
    public final int hashCode() {
        return ((this.f2873b.hashCode() + 527) * 31) + (this.f2874c ? 1 : 0);
    }

    @KeepForSdk
    public Status q() {
        return this.f2873b;
    }
}
