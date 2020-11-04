package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class LocationSettingsResult extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new zzah();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final Status f9866b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final LocationSettingsStates f9867c;

    @SafeParcelable.Constructor
    public LocationSettingsResult(@SafeParcelable.Param(id = 1) Status status, @SafeParcelable.Param(id = 2) LocationSettingsStates locationSettingsStates) {
        this.f9866b = status;
        this.f9867c = locationSettingsStates;
    }

    public final Status q() {
        return this.f9866b;
    }

    public final LocationSettingsStates u() {
        return this.f9867c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.r(parcel, 1, q(), i, false);
        SafeParcelWriter.r(parcel, 2, u(), i, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
