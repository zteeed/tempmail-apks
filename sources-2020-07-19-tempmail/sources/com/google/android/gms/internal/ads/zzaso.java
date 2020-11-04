package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzaso extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaso> CREATOR = new zzasn();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    String f5914b;

    @SafeParcelable.Constructor
    public zzaso(@SafeParcelable.Param(id = 2) String str) {
        this.f5914b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.t(parcel, 2, this.f5914b, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
