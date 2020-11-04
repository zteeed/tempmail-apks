package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new zaa();
    @SafeParcelable.VersionField

    /* renamed from: b  reason: collision with root package name */
    private final int f2830b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private int f2831c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private Bundle f2832d;

    @SafeParcelable.Constructor
    GoogleSignInOptionsExtensionParcelable(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) Bundle bundle) {
        this.f2830b = i;
        this.f2831c = i2;
        this.f2832d = bundle;
    }

    @KeepForSdk
    public int u() {
        return this.f2831c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f2830b);
        SafeParcelWriter.l(parcel, 2, u());
        SafeParcelWriter.e(parcel, 3, this.f2832d, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
