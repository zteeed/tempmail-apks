package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzatw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzatw> CREATOR = new zzatv();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final zzve f6133b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public final String f6134c;

    @SafeParcelable.Constructor
    public zzatw(@SafeParcelable.Param(id = 2) zzve zzve, @SafeParcelable.Param(id = 3) String str) {
        this.f6133b = zzve;
        this.f6134c = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.r(parcel, 2, this.f6133b, i, false);
        SafeParcelWriter.t(parcel, 3, this.f6134c, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
