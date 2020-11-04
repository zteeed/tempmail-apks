package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public final class zzdqs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdqs> CREATOR = new zzdqr();
    @SafeParcelable.VersionField

    /* renamed from: b  reason: collision with root package name */
    private final int f8502b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f8503c;

    @SafeParcelable.Constructor
    zzdqs(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) byte[] bArr) {
        this.f8502b = i;
        this.f8503c = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f8502b);
        SafeParcelWriter.f(parcel, 2, this.f8503c, false);
        SafeParcelWriter.b(parcel, a2);
    }

    public zzdqs(byte[] bArr) {
        this(1, bArr);
    }
}
