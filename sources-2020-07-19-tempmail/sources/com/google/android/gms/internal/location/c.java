package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;

final class c implements ListenerHolder.Notifier<LocationCallback> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ LocationAvailability f9318a;

    c(a aVar, LocationAvailability locationAvailability) {
        this.f9318a = locationAvailability;
    }
}
