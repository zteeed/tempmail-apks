package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.ParametersAreNonnullByDefault;

@SafeParcelable.Class
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaio extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaio> CREATOR = new zzair();
    @SafeParcelable.VersionField

    /* renamed from: b  reason: collision with root package name */
    public final int f5729b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public final int f5730c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final String f5731d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final int f5732e;

    public zzaio(zzaja zzaja) {
        this(2, 1, zzaja.b(), zzaja.a());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f5730c);
        SafeParcelWriter.t(parcel, 2, this.f5731d, false);
        SafeParcelWriter.l(parcel, 3, this.f5732e);
        SafeParcelWriter.l(parcel, 1000, this.f5729b);
        SafeParcelWriter.b(parcel, a2);
    }

    @SafeParcelable.Constructor
    public zzaio(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i3) {
        this.f5729b = i;
        this.f5730c = i2;
        this.f5731d = str;
        this.f5732e = i3;
    }
}
