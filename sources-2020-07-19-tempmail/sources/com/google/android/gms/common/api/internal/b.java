package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

final class b implements PendingResult.StatusListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ BasePendingResult f2769a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zaab f2770b;

    b(zaab zaab, BasePendingResult basePendingResult) {
        this.f2770b = zaab;
        this.f2769a = basePendingResult;
    }

    public final void a(Status status) {
        this.f2770b.f2832a.remove(this.f2769a);
    }
}
