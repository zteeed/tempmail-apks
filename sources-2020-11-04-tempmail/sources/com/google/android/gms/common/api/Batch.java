package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

public final class Batch extends BasePendingResult<BatchResult> {
    private final PendingResult<?>[] q;

    public static final class Builder {
    }

    public final void b() {
        super.b();
        for (PendingResult<?> b2 : this.q) {
            b2.b();
        }
    }

    /* renamed from: r */
    public final BatchResult d(Status status) {
        return new BatchResult(status, this.q);
    }
}
