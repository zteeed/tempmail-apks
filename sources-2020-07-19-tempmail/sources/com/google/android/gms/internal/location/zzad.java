package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzad extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zzad> CREATOR = new zzae();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final Status f9324b;

    static {
        new zzad(Status.f2710f);
    }

    @SafeParcelable.Constructor
    public zzad(@SafeParcelable.Param(id = 1) Status status) {
        this.f9324b = status;
    }

    public final Status q() {
        return this.f9324b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.r(parcel, 1, q(), i, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
