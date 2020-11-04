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
    public final long f9725b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public final long f9726c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final boolean f9727d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final String f9728e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public final String f9729f;
    @SafeParcelable.Field
    public final String g;
    @SafeParcelable.Field
    public final Bundle h;

    @SafeParcelable.Constructor
    public zzae(@SafeParcelable.Param(id = 1) long j, @SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) String str2, @SafeParcelable.Param(id = 6) String str3, @SafeParcelable.Param(id = 7) Bundle bundle) {
        this.f9725b = j;
        this.f9726c = j2;
        this.f9727d = z;
        this.f9728e = str;
        this.f9729f = str2;
        this.g = str3;
        this.h = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.o(parcel, 1, this.f9725b);
        SafeParcelWriter.o(parcel, 2, this.f9726c);
        SafeParcelWriter.c(parcel, 3, this.f9727d);
        SafeParcelWriter.t(parcel, 4, this.f9728e, false);
        SafeParcelWriter.t(parcel, 5, this.f9729f, false);
        SafeParcelWriter.t(parcel, 6, this.g, false);
        SafeParcelWriter.e(parcel, 7, this.h, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
