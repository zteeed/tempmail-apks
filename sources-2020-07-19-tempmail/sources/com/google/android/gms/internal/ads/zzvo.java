package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzvo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvo> CREATOR = new zzvn();
    @SafeParcelable.Field
    @AppOpenAd.AppOpenAdOrientation

    /* renamed from: b  reason: collision with root package name */
    public final int f9199b;

    @SafeParcelable.Constructor
    public zzvo(@SafeParcelable.Param(id = 2) @AppOpenAd.AppOpenAdOrientation int i) {
        this.f9199b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 2, this.f9199b);
        SafeParcelWriter.b(parcel, a2);
    }
}
