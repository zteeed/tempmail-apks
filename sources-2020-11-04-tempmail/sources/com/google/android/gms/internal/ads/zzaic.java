package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaic extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaic> CREATOR = new zzaif();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f5902b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5903c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final int f5904d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final String f5905e;

    @SafeParcelable.Constructor
    public zzaic(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) String str2) {
        this.f5902b = str;
        this.f5903c = z;
        this.f5904d = i;
        this.f5905e = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.t(parcel, 1, this.f5902b, false);
        SafeParcelWriter.c(parcel, 2, this.f5903c);
        SafeParcelWriter.l(parcel, 3, this.f5904d);
        SafeParcelWriter.t(parcel, 4, this.f5905e, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
