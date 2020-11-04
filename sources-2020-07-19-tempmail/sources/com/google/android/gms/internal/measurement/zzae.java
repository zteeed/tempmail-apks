package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new zzah();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final long f9542b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public final long f9543c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final boolean f9544d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final String f9545e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public final String f9546f;
    @SafeParcelable.Field
    public final String g;
    @SafeParcelable.Field
    public final Bundle h;

    @SafeParcelable.Constructor
    public zzae(@SafeParcelable.Param(id = 1) long j, @SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) String str2, @SafeParcelable.Param(id = 6) String str3, @SafeParcelable.Param(id = 7) Bundle bundle) {
        this.f9542b = j;
        this.f9543c = j2;
        this.f9544d = z;
        this.f9545e = str;
        this.f9546f = str2;
        this.g = str3;
        this.h = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.o(parcel, 1, this.f9542b);
        SafeParcelWriter.o(parcel, 2, this.f9543c);
        SafeParcelWriter.c(parcel, 3, this.f9544d);
        SafeParcelWriter.t(parcel, 4, this.f9545e, false);
        SafeParcelWriter.t(parcel, 5, this.f9546f, false);
        SafeParcelWriter.t(parcel, 6, this.g, false);
        SafeParcelWriter.e(parcel, 7, this.h, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
