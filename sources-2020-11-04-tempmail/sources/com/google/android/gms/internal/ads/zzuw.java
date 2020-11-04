package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzuw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzuw> CREATOR = new zzuv();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f9353b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public final String f9354c;

    @SafeParcelable.Constructor
    public zzuw(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2) {
        this.f9353b = str;
        this.f9354c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.t(parcel, 1, this.f9353b, false);
        SafeParcelWriter.t(parcel, 2, this.f9354c, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
