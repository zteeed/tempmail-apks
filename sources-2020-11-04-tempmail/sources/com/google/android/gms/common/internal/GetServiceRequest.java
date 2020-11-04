package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class
@SafeParcelable.Reserved
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new zzd();
    @SafeParcelable.VersionField

    /* renamed from: b  reason: collision with root package name */
    private final int f3180b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final int f3181c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private int f3182d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    String f3183e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    IBinder f3184f;
    @SafeParcelable.Field
    Scope[] g;
    @SafeParcelable.Field
    Bundle h;
    @SafeParcelable.Field
    Account i;
    @SafeParcelable.Field
    Feature[] j;
    @SafeParcelable.Field
    Feature[] k;
    @SafeParcelable.Field
    private boolean l;

    public GetServiceRequest(int i2) {
        this.f3180b = 4;
        this.f3182d = GoogleApiAvailabilityLight.f2856a;
        this.f3181c = i2;
        this.l = true;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f3180b);
        SafeParcelWriter.l(parcel, 2, this.f3181c);
        SafeParcelWriter.l(parcel, 3, this.f3182d);
        SafeParcelWriter.t(parcel, 4, this.f3183e, false);
        SafeParcelWriter.k(parcel, 5, this.f3184f, false);
        SafeParcelWriter.w(parcel, 6, this.g, i2, false);
        SafeParcelWriter.e(parcel, 7, this.h, false);
        SafeParcelWriter.r(parcel, 8, this.i, i2, false);
        SafeParcelWriter.w(parcel, 10, this.j, i2, false);
        SafeParcelWriter.w(parcel, 11, this.k, i2, false);
        SafeParcelWriter.c(parcel, 12, this.l);
        SafeParcelWriter.b(parcel, a2);
    }

    @SafeParcelable.Constructor
    GetServiceRequest(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) int i4, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) IBinder iBinder, @SafeParcelable.Param(id = 6) Scope[] scopeArr, @SafeParcelable.Param(id = 7) Bundle bundle, @SafeParcelable.Param(id = 8) Account account, @SafeParcelable.Param(id = 10) Feature[] featureArr, @SafeParcelable.Param(id = 11) Feature[] featureArr2, @SafeParcelable.Param(id = 12) boolean z) {
        this.f3180b = i2;
        this.f3181c = i3;
        this.f3182d = i4;
        if ("com.google.android.gms".equals(str)) {
            this.f3183e = "com.google.android.gms";
        } else {
            this.f3183e = str;
        }
        if (i2 < 2) {
            this.i = iBinder != null ? AccountAccessor.V(IAccountAccessor.Stub.H(iBinder)) : null;
        } else {
            this.f3184f = iBinder;
            this.i = account;
        }
        this.g = scopeArr;
        this.h = bundle;
        this.j = featureArr;
        this.k = featureArr2;
        this.l = z;
    }
}
