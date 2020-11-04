package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new zzai();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final boolean f9868b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9869c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final boolean f9870d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private final boolean f9871e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private final boolean f9872f;
    @SafeParcelable.Field
    private final boolean g;

    @SafeParcelable.Constructor
    public LocationSettingsStates(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) boolean z2, @SafeParcelable.Param(id = 3) boolean z3, @SafeParcelable.Param(id = 4) boolean z4, @SafeParcelable.Param(id = 5) boolean z5, @SafeParcelable.Param(id = 6) boolean z6) {
        this.f9868b = z;
        this.f9869c = z2;
        this.f9870d = z3;
        this.f9871e = z4;
        this.f9872f = z5;
        this.g = z6;
    }

    public final boolean A() {
        return this.f9871e;
    }

    public final boolean B() {
        return this.f9868b;
    }

    public final boolean G() {
        return this.f9872f;
    }

    public final boolean J() {
        return this.f9869c;
    }

    public final boolean u() {
        return this.g;
    }

    public final boolean v() {
        return this.f9870d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.c(parcel, 1, B());
        SafeParcelWriter.c(parcel, 2, J());
        SafeParcelWriter.c(parcel, 3, v());
        SafeParcelWriter.c(parcel, 4, A());
        SafeParcelWriter.c(parcel, 5, G());
        SafeParcelWriter.c(parcel, 6, u());
        SafeParcelWriter.b(parcel, a2);
    }
}
