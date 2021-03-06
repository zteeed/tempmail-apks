package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.zzr;
import com.google.android.gms.location.zzs;

@SafeParcelable.Class
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private int f9353b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private zzm f9354c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private zzr f9355d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private zzaj f9356e;

    @SafeParcelable.Constructor
    zzo(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) zzm zzm, @SafeParcelable.Param(id = 3) IBinder iBinder, @SafeParcelable.Param(id = 4) IBinder iBinder2) {
        this.f9353b = i;
        this.f9354c = zzm;
        zzaj zzaj = null;
        this.f9355d = iBinder == null ? null : zzs.E(iBinder);
        if (!(iBinder2 == null || iBinder2 == null)) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzaj = queryLocalInterface instanceof zzaj ? (zzaj) queryLocalInterface : new zzal(iBinder2);
        }
        this.f9356e = zzaj;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f9353b);
        SafeParcelWriter.r(parcel, 2, this.f9354c, i, false);
        zzr zzr = this.f9355d;
        IBinder iBinder = null;
        SafeParcelWriter.k(parcel, 3, zzr == null ? null : zzr.asBinder(), false);
        zzaj zzaj = this.f9356e;
        if (zzaj != null) {
            iBinder = zzaj.asBinder();
        }
        SafeParcelWriter.k(parcel, 4, iBinder, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
