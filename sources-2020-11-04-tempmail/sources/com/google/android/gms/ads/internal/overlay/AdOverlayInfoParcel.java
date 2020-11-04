package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzagi;
import com.google.android.gms.internal.ads.zzagk;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzbfn;
import com.google.android.gms.internal.ads.zzuu;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzm();
    @SafeParcelable.Field
    public final int orientation;
    @SafeParcelable.Field
    public final String url;
    @SafeParcelable.Field
    public final zzbbd zzboy;
    @SafeParcelable.Field
    public final zzuu zzcgl;
    @SafeParcelable.Field
    public final zzagi zzddi;
    @SafeParcelable.Field
    public final zzagk zzddj;
    @SafeParcelable.Field
    public final zzbfn zzdfp;
    @SafeParcelable.Field
    public final zzd zzdod;
    @SafeParcelable.Field
    public final zzo zzdoe;
    @SafeParcelable.Field
    public final String zzdof;
    @SafeParcelable.Field
    public final boolean zzdog;
    @SafeParcelable.Field
    public final String zzdoh;
    @SafeParcelable.Field
    public final zzt zzdoi;
    @SafeParcelable.Field
    public final int zzdoj;
    @SafeParcelable.Field
    public final String zzdok;
    @SafeParcelable.Field
    public final zzg zzdol;

    public AdOverlayInfoParcel(zzuu zzuu, zzo zzo, zzt zzt, zzbfn zzbfn, int i, zzbbd zzbbd, String str, zzg zzg, String str2, String str3) {
        this.zzdod = null;
        this.zzcgl = null;
        this.zzdoe = zzo;
        this.zzdfp = zzbfn;
        this.zzddi = null;
        this.zzddj = null;
        this.zzdof = str2;
        this.zzdog = false;
        this.zzdoh = str3;
        this.zzdoi = null;
        this.orientation = i;
        this.zzdoj = 1;
        this.url = null;
        this.zzboy = zzbbd;
        this.zzdok = str;
        this.zzdol = zzg;
    }

    public static void zza(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    public static AdOverlayInfoParcel zzc(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.r(parcel, 2, this.zzdod, i, false);
        SafeParcelWriter.k(parcel, 3, ObjectWrapper.h0(this.zzcgl).asBinder(), false);
        SafeParcelWriter.k(parcel, 4, ObjectWrapper.h0(this.zzdoe).asBinder(), false);
        SafeParcelWriter.k(parcel, 5, ObjectWrapper.h0(this.zzdfp).asBinder(), false);
        SafeParcelWriter.k(parcel, 6, ObjectWrapper.h0(this.zzddj).asBinder(), false);
        SafeParcelWriter.t(parcel, 7, this.zzdof, false);
        SafeParcelWriter.c(parcel, 8, this.zzdog);
        SafeParcelWriter.t(parcel, 9, this.zzdoh, false);
        SafeParcelWriter.k(parcel, 10, ObjectWrapper.h0(this.zzdoi).asBinder(), false);
        SafeParcelWriter.l(parcel, 11, this.orientation);
        SafeParcelWriter.l(parcel, 12, this.zzdoj);
        SafeParcelWriter.t(parcel, 13, this.url, false);
        SafeParcelWriter.r(parcel, 14, this.zzboy, i, false);
        SafeParcelWriter.t(parcel, 16, this.zzdok, false);
        SafeParcelWriter.r(parcel, 17, this.zzdol, i, false);
        SafeParcelWriter.k(parcel, 18, ObjectWrapper.h0(this.zzddi).asBinder(), false);
        SafeParcelWriter.b(parcel, a2);
    }

    public AdOverlayInfoParcel(zzuu zzuu, zzo zzo, zzt zzt, zzbfn zzbfn, boolean z, int i, zzbbd zzbbd) {
        this.zzdod = null;
        this.zzcgl = zzuu;
        this.zzdoe = zzo;
        this.zzdfp = zzbfn;
        this.zzddi = null;
        this.zzddj = null;
        this.zzdof = null;
        this.zzdog = z;
        this.zzdoh = null;
        this.zzdoi = zzt;
        this.orientation = i;
        this.zzdoj = 2;
        this.url = null;
        this.zzboy = zzbbd;
        this.zzdok = null;
        this.zzdol = null;
    }

    public AdOverlayInfoParcel(zzuu zzuu, zzo zzo, zzagi zzagi, zzagk zzagk, zzt zzt, zzbfn zzbfn, boolean z, int i, String str, zzbbd zzbbd) {
        this.zzdod = null;
        this.zzcgl = zzuu;
        this.zzdoe = zzo;
        this.zzdfp = zzbfn;
        this.zzddi = zzagi;
        this.zzddj = zzagk;
        this.zzdof = null;
        this.zzdog = z;
        this.zzdoh = null;
        this.zzdoi = zzt;
        this.orientation = i;
        this.zzdoj = 3;
        this.url = str;
        this.zzboy = zzbbd;
        this.zzdok = null;
        this.zzdol = null;
    }

    public AdOverlayInfoParcel(zzuu zzuu, zzo zzo, zzagi zzagi, zzagk zzagk, zzt zzt, zzbfn zzbfn, boolean z, int i, String str, String str2, zzbbd zzbbd) {
        this.zzdod = null;
        this.zzcgl = zzuu;
        this.zzdoe = zzo;
        this.zzdfp = zzbfn;
        this.zzddi = zzagi;
        this.zzddj = zzagk;
        this.zzdof = str2;
        this.zzdog = z;
        this.zzdoh = str;
        this.zzdoi = zzt;
        this.orientation = i;
        this.zzdoj = 3;
        this.url = null;
        this.zzboy = zzbbd;
        this.zzdok = null;
        this.zzdol = null;
    }

    public AdOverlayInfoParcel(zzd zzd, zzuu zzuu, zzo zzo, zzt zzt, zzbbd zzbbd) {
        this.zzdod = zzd;
        this.zzcgl = zzuu;
        this.zzdoe = zzo;
        this.zzdfp = null;
        this.zzddi = null;
        this.zzddj = null;
        this.zzdof = null;
        this.zzdog = false;
        this.zzdoh = null;
        this.zzdoi = zzt;
        this.orientation = -1;
        this.zzdoj = 4;
        this.url = null;
        this.zzboy = zzbbd;
        this.zzdok = null;
        this.zzdol = null;
    }

    @SafeParcelable.Constructor
    AdOverlayInfoParcel(@SafeParcelable.Param(id = 2) zzd zzd, @SafeParcelable.Param(id = 3) IBinder iBinder, @SafeParcelable.Param(id = 4) IBinder iBinder2, @SafeParcelable.Param(id = 5) IBinder iBinder3, @SafeParcelable.Param(id = 6) IBinder iBinder4, @SafeParcelable.Param(id = 7) String str, @SafeParcelable.Param(id = 8) boolean z, @SafeParcelable.Param(id = 9) String str2, @SafeParcelable.Param(id = 10) IBinder iBinder5, @SafeParcelable.Param(id = 11) int i, @SafeParcelable.Param(id = 12) int i2, @SafeParcelable.Param(id = 13) String str3, @SafeParcelable.Param(id = 14) zzbbd zzbbd, @SafeParcelable.Param(id = 16) String str4, @SafeParcelable.Param(id = 17) zzg zzg, @SafeParcelable.Param(id = 18) IBinder iBinder6) {
        this.zzdod = zzd;
        this.zzcgl = (zzuu) ObjectWrapper.V(IObjectWrapper.Stub.H(iBinder));
        this.zzdoe = (zzo) ObjectWrapper.V(IObjectWrapper.Stub.H(iBinder2));
        this.zzdfp = (zzbfn) ObjectWrapper.V(IObjectWrapper.Stub.H(iBinder3));
        this.zzddi = (zzagi) ObjectWrapper.V(IObjectWrapper.Stub.H(iBinder6));
        this.zzddj = (zzagk) ObjectWrapper.V(IObjectWrapper.Stub.H(iBinder4));
        this.zzdof = str;
        this.zzdog = z;
        this.zzdoh = str2;
        this.zzdoi = (zzt) ObjectWrapper.V(IObjectWrapper.Stub.H(iBinder5));
        this.orientation = i;
        this.zzdoj = i2;
        this.url = str3;
        this.zzboy = zzbbd;
        this.zzdok = str4;
        this.zzdol = zzg;
    }
}
