package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new zzj();
    @SafeParcelable.Field
    public final boolean zzboj;
    @SafeParcelable.Field
    public final boolean zzbok;
    @SafeParcelable.Field
    private final String zzbol;
    @SafeParcelable.Field
    public final boolean zzbom;
    @SafeParcelable.Field
    public final float zzbon;
    @SafeParcelable.Field
    public final int zzboo;
    @SafeParcelable.Field
    public final boolean zzbop;
    @SafeParcelable.Field
    public final boolean zzboq;
    @SafeParcelable.Field
    public final boolean zzbor;

    public zzg(boolean z, boolean z2, boolean z3, float f2, int i, boolean z4, boolean z5, boolean z6) {
        this(false, z2, (String) null, false, 0.0f, -1, z4, z5, z6);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.c(parcel, 2, this.zzboj);
        SafeParcelWriter.c(parcel, 3, this.zzbok);
        SafeParcelWriter.t(parcel, 4, this.zzbol, false);
        SafeParcelWriter.c(parcel, 5, this.zzbom);
        SafeParcelWriter.i(parcel, 6, this.zzbon);
        SafeParcelWriter.l(parcel, 7, this.zzboo);
        SafeParcelWriter.c(parcel, 8, this.zzbop);
        SafeParcelWriter.c(parcel, 9, this.zzboq);
        SafeParcelWriter.c(parcel, 10, this.zzbor);
        SafeParcelWriter.b(parcel, a2);
    }

    @SafeParcelable.Constructor
    zzg(@SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) boolean z3, @SafeParcelable.Param(id = 6) float f2, @SafeParcelable.Param(id = 7) int i, @SafeParcelable.Param(id = 8) boolean z4, @SafeParcelable.Param(id = 9) boolean z5, @SafeParcelable.Param(id = 10) boolean z6) {
        this.zzboj = z;
        this.zzbok = z2;
        this.zzbol = str;
        this.zzbom = z3;
        this.zzbon = f2;
        this.zzboo = i;
        this.zzbop = z4;
        this.zzboq = z5;
        this.zzbor = z6;
    }
}
