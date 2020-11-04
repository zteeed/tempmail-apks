package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new zzc();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    Bundle f3061b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    Feature[] f3062c;

    @SafeParcelable.Constructor
    zzb(@SafeParcelable.Param(id = 1) Bundle bundle, @SafeParcelable.Param(id = 2) Feature[] featureArr) {
        this.f3061b = bundle;
        this.f3062c = featureArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.e(parcel, 1, this.f3061b, false);
        SafeParcelWriter.w(parcel, 2, this.f3062c, i, false);
        SafeParcelWriter.b(parcel, a2);
    }

    public zzb() {
    }
}
