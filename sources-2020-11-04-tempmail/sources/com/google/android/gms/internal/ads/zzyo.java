package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzyo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzyo> CREATOR = new zzyn();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final int f9412b;

    @SafeParcelable.Constructor
    public zzyo(@SafeParcelable.Param(id = 2) int i) {
        this.f9412b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 2, this.f9412b);
        SafeParcelWriter.b(parcel, a2);
    }
}
