package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public class BooleanResult implements Result {

    /* renamed from: b  reason: collision with root package name */
    private final Status f2685b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f2686c;

    @KeepForSdk
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BooleanResult)) {
            return false;
        }
        BooleanResult booleanResult = (BooleanResult) obj;
        return this.f2685b.equals(booleanResult.f2685b) && this.f2686c == booleanResult.f2686c;
    }

    @KeepForSdk
    public final int hashCode() {
        return ((this.f2685b.hashCode() + 527) * 31) + (this.f2686c ? 1 : 0);
    }

    @KeepForSdk
    public Status q() {
        return this.f2685b;
    }
}
