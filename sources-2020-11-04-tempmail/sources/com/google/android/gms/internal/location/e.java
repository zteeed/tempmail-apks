package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.zzy;

final class e extends zzy {

    /* renamed from: b  reason: collision with root package name */
    private final ListenerHolder<LocationListener> f9502b;

    public final synchronized void z6(Location location) {
        this.f9502b.c(new f(this, location));
    }
}
