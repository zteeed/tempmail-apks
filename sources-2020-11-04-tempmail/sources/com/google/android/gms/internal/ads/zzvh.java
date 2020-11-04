package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzvh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvh> CREATOR = new zzvk();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f9372b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public final int f9373c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final int f9374d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final boolean f9375e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public final int f9376f;
    @SafeParcelable.Field
    public final int g;
    @SafeParcelable.Field
    public final zzvh[] h;
    @SafeParcelable.Field
    public final boolean i;
    @SafeParcelable.Field
    public final boolean j;
    @SafeParcelable.Field
    public boolean k;
    @SafeParcelable.Field
    public boolean l;
    @SafeParcelable.Field
    private boolean m;
    @SafeParcelable.Field
    public boolean n;
    @SafeParcelable.Field
    public boolean o;

    public zzvh() {
        this("interstitial_mb", 0, 0, true, 0, 0, (zzvh[]) null, false, false, false, false, false, false, false);
    }

    private static int A(DisplayMetrics displayMetrics) {
        int i2 = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        if (i2 <= 400) {
            return 32;
        }
        return i2 <= 720 ? 50 : 90;
    }

    public static zzvh B() {
        return new zzvh("320x50_mb", 0, 0, false, 0, 0, (zzvh[]) null, true, false, false, false, false, false, false);
    }

    public static zzvh G() {
        return new zzvh("reward_mb", 0, 0, true, 0, 0, (zzvh[]) null, false, false, false, false, false, false, false);
    }

    public static zzvh J() {
        return new zzvh("interstitial_mb", 0, 0, false, 0, 0, (zzvh[]) null, false, false, false, false, true, false, false);
    }

    public static zzvh K() {
        return new zzvh("invalid", 0, 0, false, 0, 0, (zzvh[]) null, false, false, false, true, false, false, false);
    }

    public static int u(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public static int v(DisplayMetrics displayMetrics) {
        return (int) (((float) A(displayMetrics)) * displayMetrics.density);
    }

    public final AdSize N() {
        return zzb.zza(this.f9376f, this.f9373c, this.f9372b);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.t(parcel, 2, this.f9372b, false);
        SafeParcelWriter.l(parcel, 3, this.f9373c);
        SafeParcelWriter.l(parcel, 4, this.f9374d);
        SafeParcelWriter.c(parcel, 5, this.f9375e);
        SafeParcelWriter.l(parcel, 6, this.f9376f);
        SafeParcelWriter.l(parcel, 7, this.g);
        SafeParcelWriter.w(parcel, 8, this.h, i2, false);
        SafeParcelWriter.c(parcel, 9, this.i);
        SafeParcelWriter.c(parcel, 10, this.j);
        SafeParcelWriter.c(parcel, 11, this.k);
        SafeParcelWriter.c(parcel, 12, this.l);
        SafeParcelWriter.c(parcel, 13, this.m);
        SafeParcelWriter.c(parcel, 14, this.n);
        SafeParcelWriter.c(parcel, 15, this.o);
        SafeParcelWriter.b(parcel, a2);
    }

    public zzvh(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzvh(android.content.Context r13, com.google.android.gms.ads.AdSize[] r14) {
        /*
            r12 = this;
            r12.<init>()
            r0 = 0
            r1 = r14[r0]
            r12.f9375e = r0
            boolean r2 = r1.isFluid()
            r12.j = r2
            boolean r2 = com.google.android.gms.ads.zzb.zza(r1)
            r12.n = r2
            boolean r2 = com.google.android.gms.ads.zzb.zzb(r1)
            r12.o = r2
            boolean r3 = r12.j
            if (r3 == 0) goto L_0x002f
            com.google.android.gms.ads.AdSize r2 = com.google.android.gms.ads.AdSize.BANNER
            int r2 = r2.getWidth()
            r12.f9376f = r2
            com.google.android.gms.ads.AdSize r2 = com.google.android.gms.ads.AdSize.BANNER
            int r2 = r2.getHeight()
            r12.f9373c = r2
            goto L_0x004a
        L_0x002f:
            if (r2 == 0) goto L_0x003e
            int r2 = r1.getWidth()
            r12.f9376f = r2
            int r2 = com.google.android.gms.ads.zzb.zzc(r1)
            r12.f9373c = r2
            goto L_0x004a
        L_0x003e:
            int r2 = r1.getWidth()
            r12.f9376f = r2
            int r2 = r1.getHeight()
            r12.f9373c = r2
        L_0x004a:
            int r2 = r12.f9376f
            r3 = -1
            r4 = 1
            if (r2 != r3) goto L_0x0052
            r2 = 1
            goto L_0x0053
        L_0x0052:
            r2 = 0
        L_0x0053:
            int r3 = r12.f9373c
            r5 = -2
            if (r3 != r5) goto L_0x005a
            r3 = 1
            goto L_0x005b
        L_0x005a:
            r3 = 0
        L_0x005b:
            android.content.res.Resources r5 = r13.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            if (r2 == 0) goto L_0x009e
            com.google.android.gms.internal.ads.zzwg.a()
            boolean r6 = com.google.android.gms.internal.ads.zzbaq.o(r13)
            if (r6 == 0) goto L_0x0084
            com.google.android.gms.internal.ads.zzwg.a()
            boolean r6 = com.google.android.gms.internal.ads.zzbaq.p(r13)
            if (r6 == 0) goto L_0x0084
            int r6 = r5.widthPixels
            com.google.android.gms.internal.ads.zzwg.a()
            int r7 = com.google.android.gms.internal.ads.zzbaq.q(r13)
            int r6 = r6 - r7
            r12.g = r6
            goto L_0x0088
        L_0x0084:
            int r6 = r5.widthPixels
            r12.g = r6
        L_0x0088:
            int r6 = r12.g
            float r6 = (float) r6
            float r7 = r5.density
            float r6 = r6 / r7
            double r6 = (double) r6
            int r8 = (int) r6
            double r9 = (double) r8
            double r6 = r6 - r9
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x00ab
            int r8 = r8 + 1
            goto L_0x00ab
        L_0x009e:
            int r8 = r12.f9376f
            com.google.android.gms.internal.ads.zzwg.a()
            int r6 = r12.f9376f
            int r6 = com.google.android.gms.internal.ads.zzbaq.a(r5, r6)
            r12.g = r6
        L_0x00ab:
            if (r3 == 0) goto L_0x00b2
            int r6 = A(r5)
            goto L_0x00b4
        L_0x00b2:
            int r6 = r12.f9373c
        L_0x00b4:
            com.google.android.gms.internal.ads.zzwg.a()
            int r5 = com.google.android.gms.internal.ads.zzbaq.a(r5, r6)
            r12.f9374d = r5
            java.lang.String r5 = "_as"
            java.lang.String r7 = "x"
            r9 = 26
            if (r2 != 0) goto L_0x00f8
            if (r3 == 0) goto L_0x00c8
            goto L_0x00f8
        L_0x00c8:
            boolean r2 = r12.o
            if (r2 == 0) goto L_0x00e8
            int r1 = r12.f9376f
            int r2 = r12.f9373c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r9)
            r3.append(r1)
            r3.append(r7)
            r3.append(r2)
            r3.append(r5)
            java.lang.String r1 = r3.toString()
            r12.f9372b = r1
            goto L_0x010f
        L_0x00e8:
            boolean r2 = r12.j
            if (r2 == 0) goto L_0x00f1
            java.lang.String r1 = "320x50_mb"
            r12.f9372b = r1
            goto L_0x010f
        L_0x00f1:
            java.lang.String r1 = r1.toString()
            r12.f9372b = r1
            goto L_0x010f
        L_0x00f8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r9)
            r1.append(r8)
            r1.append(r7)
            r1.append(r6)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r12.f9372b = r1
        L_0x010f:
            int r1 = r14.length
            if (r1 <= r4) goto L_0x0129
            int r1 = r14.length
            com.google.android.gms.internal.ads.zzvh[] r1 = new com.google.android.gms.internal.ads.zzvh[r1]
            r12.h = r1
            r1 = 0
        L_0x0118:
            int r2 = r14.length
            if (r1 >= r2) goto L_0x012c
            com.google.android.gms.internal.ads.zzvh[] r2 = r12.h
            com.google.android.gms.internal.ads.zzvh r3 = new com.google.android.gms.internal.ads.zzvh
            r4 = r14[r1]
            r3.<init>((android.content.Context) r13, (com.google.android.gms.ads.AdSize) r4)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L_0x0118
        L_0x0129:
            r13 = 0
            r12.h = r13
        L_0x012c:
            r12.i = r0
            r12.k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvh.<init>(android.content.Context, com.google.android.gms.ads.AdSize[]):void");
    }

    @SafeParcelable.Constructor
    zzvh(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) int i3, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 6) int i4, @SafeParcelable.Param(id = 7) int i5, @SafeParcelable.Param(id = 8) zzvh[] zzvhArr, @SafeParcelable.Param(id = 9) boolean z2, @SafeParcelable.Param(id = 10) boolean z3, @SafeParcelable.Param(id = 11) boolean z4, @SafeParcelable.Param(id = 12) boolean z5, @SafeParcelable.Param(id = 13) boolean z6, @SafeParcelable.Param(id = 14) boolean z7, @SafeParcelable.Param(id = 15) boolean z8) {
        this.f9372b = str;
        this.f9373c = i2;
        this.f9374d = i3;
        this.f9375e = z;
        this.f9376f = i4;
        this.g = i5;
        this.h = zzvhArr;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = z7;
        this.o = z8;
    }
}
