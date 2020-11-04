package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

final class b implements PendingResult.StatusListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ BasePendingResult f2957a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zaab f2958b;

    b(zaab zaab, BasePendingResult basePendingResult) {
        this.f2958b = zaab;
        this.f2957a = basePendingResult;
    }

    public final void a(Status status) {
        this.f2958b.f3020a.remove(this.f2957a);
    }
}
