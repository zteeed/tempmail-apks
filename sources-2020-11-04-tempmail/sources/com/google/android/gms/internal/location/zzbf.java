package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.zzu;
import com.google.android.gms.location.zzv;
import com.google.android.gms.location.zzx;
import com.google.android.gms.location.zzy;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzbf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbf> CREATOR = new zzbg();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private int f9519b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private zzbd f9520c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private zzx f9521d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private PendingIntent f9522e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private zzu f9523f;
    @SafeParcelable.Field
    private zzaj g;

    @SafeParcelable.Constructor
    zzbf(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) zzbd zzbd, @SafeParcelable.Param(id = 3) IBinder iBinder, @SafeParcelable.Param(id = 4) PendingIntent pendingIntent, @SafeParcelable.Param(id = 5) IBinder iBinder2, @SafeParcelable.Param(id = 6) IBinder iBinder3) {
        this.f9519b = i;
        this.f9520c = zzbd;
        zzaj zzaj = null;
        this.f9521d = iBinder == null ? null : zzy.H(iBinder);
        this.f9522e = pendingIntent;
        this.f9523f = iBinder2 == null ? null : zzv.H(iBinder2);
        if (!(iBinder3 == null || iBinder3 == null)) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzaj = queryLocalInterface instanceof zzaj ? (zzaj) queryLocalInterface : new zzal(iBinder3);
        }
        this.g = zzaj;
    }

    public static zzbf u(zzu zzu, zzaj zzaj) {
        return new zzbf(2, (zzbd) null, (IBinder) null, (PendingIntent) null, zzu.asBinder(), zzaj != null ? zzaj.asBinder() : null);
    }

    public static zzbf v(zzx zzx, zzaj zzaj) {
        return new zzbf(2, (zzbd) null, zzx.asBinder(), (PendingIntent) null, (IBinder) null, zzaj != null ? zzaj.asBinder() : null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f9519b);
        SafeParcelWriter.r(parcel, 2, this.f9520c, i, false);
        zzx zzx = this.f9521d;
        IBinder iBinder = null;
        SafeParcelWriter.k(parcel, 3, zzx == null ? null : zzx.asBinder(), false);
        SafeParcelWriter.r(parcel, 4, this.f9522e, i, false);
        zzu zzu = this.f9523f;
        SafeParcelWriter.k(parcel, 5, zzu == null ? null : zzu.asBinder(), false);
        zzaj zzaj = this.g;
        if (zzaj != null) {
            iBinder = zzaj.asBinder();
        }
        SafeParcelWriter.k(parcel, 6, iBinder, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
