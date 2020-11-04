package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public final class zah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zah> CREATOR = new zai();
    @SafeParcelable.VersionField

    /* renamed from: b  reason: collision with root package name */
    private final int f10736b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final ResolveAccountRequest f10737c;

    @SafeParcelable.Constructor
    zah(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ResolveAccountRequest resolveAccountRequest) {
        this.f10736b = i;
        this.f10737c = resolveAccountRequest;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f10736b);
        SafeParcelWriter.r(parcel, 2, this.f10737c, i, false);
        SafeParcelWriter.b(parcel, a2);
    }

    public zah(ResolveAccountRequest resolveAccountRequest) {
        this(1, resolveAccountRequest);
    }
}
