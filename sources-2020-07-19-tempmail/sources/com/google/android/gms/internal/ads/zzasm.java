package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@SafeParcelable.Class
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzasm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzasm> CREATOR = new zzasl();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f5909b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public final zzbbd f5910c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final ApplicationInfo f5911d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final String f5912e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f5913f;
    @SafeParcelable.Field
    public final PackageInfo g;
    @SafeParcelable.Field
    public final String h;
    @SafeParcelable.Field
    public final boolean i;
    @SafeParcelable.Field
    public final String j;
    @SafeParcelable.Field
    public zzdms k;
    @SafeParcelable.Field
    public String l;

    @SafeParcelable.Constructor
    public zzasm(@SafeParcelable.Param(id = 1) Bundle bundle, @SafeParcelable.Param(id = 2) zzbbd zzbbd, @SafeParcelable.Param(id = 3) ApplicationInfo applicationInfo, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) List<String> list, @SafeParcelable.Param(id = 6) PackageInfo packageInfo, @SafeParcelable.Param(id = 7) String str2, @SafeParcelable.Param(id = 8) boolean z, @SafeParcelable.Param(id = 9) String str3, @SafeParcelable.Param(id = 10) zzdms zzdms, @SafeParcelable.Param(id = 11) String str4) {
        this.f5909b = bundle;
        this.f5910c = zzbbd;
        this.f5912e = str;
        this.f5911d = applicationInfo;
        this.f5913f = list;
        this.g = packageInfo;
        this.h = str2;
        this.i = z;
        this.j = str3;
        this.k = zzdms;
        this.l = str4;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.e(parcel, 1, this.f5909b, false);
        SafeParcelWriter.r(parcel, 2, this.f5910c, i2, false);
        SafeParcelWriter.r(parcel, 3, this.f5911d, i2, false);
        SafeParcelWriter.t(parcel, 4, this.f5912e, false);
        SafeParcelWriter.v(parcel, 5, this.f5913f, false);
        SafeParcelWriter.r(parcel, 6, this.g, i2, false);
        SafeParcelWriter.t(parcel, 7, this.h, false);
        SafeParcelWriter.c(parcel, 8, this.i);
        SafeParcelWriter.t(parcel, 9, this.j, false);
        SafeParcelWriter.r(parcel, 10, this.k, i2, false);
        SafeParcelWriter.t(parcel, 11, this.l, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
