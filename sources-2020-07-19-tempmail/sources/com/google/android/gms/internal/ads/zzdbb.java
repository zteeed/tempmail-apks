package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdbb implements zzddz<Bundle> {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private final Location f7813a;

    public zzdbb(@Nullable Location location) {
        this.f7813a = location;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.f7813a != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putFloat("radius", this.f7813a.getAccuracy() * 1000.0f);
            bundle2.putLong("lat", (long) (this.f7813a.getLatitude() * 1.0E7d));
            bundle2.putLong("long", (long) (this.f7813a.getLongitude() * 1.0E7d));
            bundle2.putLong("time", this.f7813a.getTime() * 1000);
            bundle.putBundle("uule", bundle2);
        }
    }
}
