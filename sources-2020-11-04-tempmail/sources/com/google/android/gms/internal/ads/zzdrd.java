package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public final class zzdrd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdrd> CREATOR = new zzdrg();
    @SafeParcelable.VersionField

    /* renamed from: b  reason: collision with root package name */
    private final int f8520b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final int f8521c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final String f8522d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private final String f8523e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private final int f8524f;

    @SafeParcelable.Constructor
    zzdrd(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 5) int i3, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2) {
        this.f8520b = i;
        this.f8521c = i2;
        this.f8522d = str;
        this.f8523e = str2;
        this.f8524f = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f8520b);
        SafeParcelWriter.l(parcel, 2, this.f8521c);
        SafeParcelWriter.t(parcel, 3, this.f8522d, false);
        SafeParcelWriter.t(parcel, 4, this.f8523e, false);
        SafeParcelWriter.l(parcel, 5, this.f8524f);
        SafeParcelWriter.b(parcel, a2);
    }

    public zzdrd(int i, zzgo zzgo, String str, String str2) {
        this(1, i, zzgo.i(), str, str2);
    }
}
