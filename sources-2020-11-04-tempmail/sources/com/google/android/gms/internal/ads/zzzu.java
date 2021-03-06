package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzzu> CREATOR = new zzzx();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final int f9456b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final int f9457c;

    @SafeParcelable.Constructor
    public zzzu(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2) {
        this.f9456b = i;
        this.f9457c = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f9456b);
        SafeParcelWriter.l(parcel, 2, this.f9457c);
        SafeParcelWriter.b(parcel, a2);
    }

    public zzzu(RequestConfiguration requestConfiguration) {
        this.f9456b = requestConfiguration.getTagForChildDirectedTreatment();
        this.f9457c = requestConfiguration.getTagForUnderAgeOfConsent();
    }
}
