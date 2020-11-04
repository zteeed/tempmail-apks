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
    private final boolean f10054b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final boolean f10055c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final boolean f10056d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private final boolean f10057e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private final boolean f10058f;
    @SafeParcelable.Field
    private final boolean g;

    @SafeParcelable.Constructor
    public LocationSettingsStates(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) boolean z2, @SafeParcelable.Param(id = 3) boolean z3, @SafeParcelable.Param(id = 4) boolean z4, @SafeParcelable.Param(id = 5) boolean z5, @SafeParcelable.Param(id = 6) boolean z6) {
        this.f10054b = z;
        this.f10055c = z2;
        this.f10056d = z3;
        this.f10057e = z4;
        this.f10058f = z5;
        this.g = z6;
    }

    public final boolean A() {
        return this.f10057e;
    }

    public final boolean B() {
        return this.f10054b;
    }

    public final boolean G() {
        return this.f10058f;
    }

    public final boolean J() {
        return this.f10055c;
    }

    public final boolean u() {
        return this.g;
    }

    public final boolean v() {
        return this.f10056d;
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
