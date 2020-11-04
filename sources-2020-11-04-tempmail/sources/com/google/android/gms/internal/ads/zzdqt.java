package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public final class zzdqt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdqt> CREATOR = new zzdqw();
    @SafeParcelable.VersionField

    /* renamed from: b  reason: collision with root package name */
    private final int f8504b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final String f8505c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final String f8506d;

    @SafeParcelable.Constructor
    zzdqt(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2) {
        this.f8504b = i;
        this.f8505c = str;
        this.f8506d = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f8504b);
        SafeParcelWriter.t(parcel, 2, this.f8505c, false);
        SafeParcelWriter.t(parcel, 3, this.f8506d, false);
        SafeParcelWriter.b(parcel, a2);
    }

    public zzdqt(String str, String str2) {
        this(1, str, str2);
    }
}
