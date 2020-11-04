package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.zzv;

final class a extends zzv {

    /* renamed from: b  reason: collision with root package name */
    private final ListenerHolder<LocationCallback> f9316b;

    public final void G4(LocationResult locationResult) {
        this.f9316b.c(new b(this, locationResult));
    }

    public final void z3(LocationAvailability locationAvailability) {
        this.f9316b.c(new c(this, locationAvailability));
    }
}
