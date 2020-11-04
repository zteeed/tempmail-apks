package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;

public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* renamed from: b  reason: collision with root package name */
    private final Feature f2903b;

    @KeepForSdk
    public UnsupportedApiCallException(Feature feature) {
        this.f2903b = feature;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.f2903b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
