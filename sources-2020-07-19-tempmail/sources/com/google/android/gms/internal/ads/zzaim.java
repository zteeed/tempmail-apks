package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaim extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaim> CREATOR = new zzaip();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f5726b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f5727c;

    @SafeParcelable.Constructor
    public zzaim(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) Bundle bundle) {
        this.f5726b = str;
        this.f5727c = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.t(parcel, 1, this.f5726b, false);
        SafeParcelWriter.e(parcel, 2, this.f5727c, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
