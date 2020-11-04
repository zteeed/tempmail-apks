package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzzw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzzw> CREATOR = new zzzz();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f9459b;

    public zzzw(SearchAdRequest searchAdRequest) {
        this.f9459b = searchAdRequest.getQuery();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.t(parcel, 15, this.f9459b, false);
        SafeParcelWriter.b(parcel, a2);
    }

    @SafeParcelable.Constructor
    zzzw(@SafeParcelable.Param(id = 15) String str) {
        this.f9459b = str;
    }
}
