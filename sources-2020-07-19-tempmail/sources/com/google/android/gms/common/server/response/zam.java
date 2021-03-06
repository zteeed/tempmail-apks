package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

@ShowFirstParty
@SafeParcelable.Class
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new zaj();
    @SafeParcelable.VersionField

    /* renamed from: b  reason: collision with root package name */
    private final int f3102b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    final String f3103c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    final FastJsonResponse.Field<?, ?> f3104d;

    @SafeParcelable.Constructor
    zam(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) FastJsonResponse.Field<?, ?> field) {
        this.f3102b = i;
        this.f3103c = str;
        this.f3104d = field;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f3102b);
        SafeParcelWriter.t(parcel, 2, this.f3103c, false);
        SafeParcelWriter.r(parcel, 3, this.f3104d, i, false);
        SafeParcelWriter.b(parcel, a2);
    }

    zam(String str, FastJsonResponse.Field<?, ?> field) {
        this.f3102b = 1;
        this.f3103c = str;
        this.f3104d = field;
    }
}
