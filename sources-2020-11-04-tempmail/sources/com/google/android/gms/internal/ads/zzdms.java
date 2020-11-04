package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@SafeParcelable.Class
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdms extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdms> CREATOR = new zzdmt();

    /* renamed from: b  reason: collision with root package name */
    private final zzdmr[] f8399b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f8400c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f8401d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public final Context f8402e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private final int f8403f;
    public final zzdmr g;
    @SafeParcelable.Field
    public final int h;
    @SafeParcelable.Field
    public final int i;
    @SafeParcelable.Field
    public final int j;
    @SafeParcelable.Field
    public final String k;
    @SafeParcelable.Field
    private final int l;
    public final int m;
    @SafeParcelable.Field
    private final int n;
    private final int o;

    private zzdms(@Nullable Context context, zzdmr zzdmr, int i2, int i3, int i4, String str, String str2, String str3) {
        int i5;
        this.f8399b = zzdmr.values();
        this.f8400c = zzdmu.a();
        this.f8401d = zzdmu.b();
        this.f8402e = context;
        this.f8403f = zzdmr.ordinal();
        this.g = zzdmr;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = str;
        if ("oldest".equals(str2)) {
            i5 = zzdmu.f8404a;
        } else if ("lru".equals(str2) || !"lfu".equals(str2)) {
            i5 = zzdmu.f8405b;
        } else {
            i5 = zzdmu.f8406c;
        }
        this.m = i5;
        this.l = i5 - 1;
        "onAdClosed".equals(str3);
        int i6 = zzdmu.f8408e;
        this.o = i6;
        this.n = i6 - 1;
    }

    public static zzdms u(zzdmr zzdmr, Context context) {
        if (zzdmr == zzdmr.Rewarded) {
            return new zzdms(context, zzdmr, ((Integer) zzwg.e().c(zzaav.i3)).intValue(), ((Integer) zzwg.e().c(zzaav.o3)).intValue(), ((Integer) zzwg.e().c(zzaav.q3)).intValue(), (String) zzwg.e().c(zzaav.s3), (String) zzwg.e().c(zzaav.k3), (String) zzwg.e().c(zzaav.m3));
        } else if (zzdmr == zzdmr.Interstitial) {
            return new zzdms(context, zzdmr, ((Integer) zzwg.e().c(zzaav.j3)).intValue(), ((Integer) zzwg.e().c(zzaav.p3)).intValue(), ((Integer) zzwg.e().c(zzaav.r3)).intValue(), (String) zzwg.e().c(zzaav.t3), (String) zzwg.e().c(zzaav.l3), (String) zzwg.e().c(zzaav.n3));
        } else if (zzdmr != zzdmr.AppOpen) {
            return null;
        } else {
            return new zzdms(context, zzdmr, ((Integer) zzwg.e().c(zzaav.w3)).intValue(), ((Integer) zzwg.e().c(zzaav.y3)).intValue(), ((Integer) zzwg.e().c(zzaav.z3)).intValue(), (String) zzwg.e().c(zzaav.u3), (String) zzwg.e().c(zzaav.v3), (String) zzwg.e().c(zzaav.x3));
        }
    }

    public static boolean v() {
        return ((Boolean) zzwg.e().c(zzaav.h3)).booleanValue();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f8403f);
        SafeParcelWriter.l(parcel, 2, this.h);
        SafeParcelWriter.l(parcel, 3, this.i);
        SafeParcelWriter.l(parcel, 4, this.j);
        SafeParcelWriter.t(parcel, 5, this.k, false);
        SafeParcelWriter.l(parcel, 6, this.l);
        SafeParcelWriter.l(parcel, 7, this.n);
        SafeParcelWriter.b(parcel, a2);
    }

    @SafeParcelable.Constructor
    public zzdms(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) int i4, @SafeParcelable.Param(id = 4) int i5, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) int i6, @SafeParcelable.Param(id = 7) int i7) {
        this.f8399b = zzdmr.values();
        this.f8400c = zzdmu.a();
        int[] b2 = zzdmu.b();
        this.f8401d = b2;
        this.f8402e = null;
        this.f8403f = i2;
        this.g = this.f8399b[i2];
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = str;
        this.l = i6;
        this.m = this.f8400c[i6];
        this.n = i7;
        this.o = b2[i7];
    }
}
