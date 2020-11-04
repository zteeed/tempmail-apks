package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new zzaf();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final String f10063b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final String f10064c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final String f10065d;

    @SafeParcelable.Constructor
    zzae(@SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 1) String str2, @SafeParcelable.Param(id = 2) String str3) {
        this.f10065d = str;
        this.f10063b = str2;
        this.f10064c = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.t(parcel, 1, this.f10063b, false);
        SafeParcelWriter.t(parcel, 2, this.f10064c, false);
        SafeParcelWriter.t(parcel, 5, this.f10065d, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
