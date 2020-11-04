package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.zzv;

final class a extends zzv {

    /* renamed from: b  reason: collision with root package name */
    private final ListenerHolder<LocationCallback> f9499b;

    public final void N3(LocationAvailability locationAvailability) {
        this.f9499b.c(new c(this, locationAvailability));
    }

    public final void a5(LocationResult locationResult) {
        this.f9499b.c(new b(this, locationResult));
    }
}
