package com.google.android.gms.common.api;

public final class BatchResult implements Result {

    /* renamed from: b  reason: collision with root package name */
    private final Status f2872b;

    BatchResult(Status status, PendingResult<?>[] pendingResultArr) {
        this.f2872b = status;
    }

    public final Status q() {
        return this.f2872b;
    }
}
