package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzuy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzuy> CREATOR = new zzux();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final int f9172b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public final String f9173c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final String f9174d;

    @SafeParcelable.Constructor
    public zzuy(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2) {
        this.f9172b = i;
        this.f9173c = str;
        this.f9174d = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f9172b);
        SafeParcelWriter.t(parcel, 2, this.f9173c, false);
        SafeParcelWriter.t(parcel, 3, this.f9174d, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
