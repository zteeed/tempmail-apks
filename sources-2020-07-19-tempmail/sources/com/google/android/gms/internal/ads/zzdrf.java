package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public final class zzdrf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdrf> CREATOR = new zzdri();
    @SafeParcelable.VersionField

    /* renamed from: b  reason: collision with root package name */
    private final int f8342b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f8343c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final int f8344d;

    @SafeParcelable.Constructor
    zzdrf(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) byte[] bArr, @SafeParcelable.Param(id = 3) int i2) {
        byte[] bArr2;
        this.f8342b = i;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = Arrays.copyOf(bArr, bArr.length);
        }
        this.f8343c = bArr2;
        this.f8344d = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f8342b);
        SafeParcelWriter.f(parcel, 2, this.f8343c, false);
        SafeParcelWriter.l(parcel, 3, this.f8344d);
        SafeParcelWriter.b(parcel, a2);
    }

    public zzdrf(byte[] bArr, int i) {
        this(1, (byte[]) null, 1);
    }
}
