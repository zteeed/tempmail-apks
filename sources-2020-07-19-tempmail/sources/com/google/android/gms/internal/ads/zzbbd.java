package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzbbd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbbd> CREATOR = new zzbbg();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public String f6131b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public int f6132c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public int f6133d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public boolean f6134e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private boolean f6135f;

    public zzbbd(int i, int i2, boolean z) {
        this(i, i2, z, false, false);
    }

    public static zzbbd u() {
        return new zzbbd(12451009, 12451009, true);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.t(parcel, 2, this.f6131b, false);
        SafeParcelWriter.l(parcel, 3, this.f6132c);
        SafeParcelWriter.l(parcel, 4, this.f6133d);
        SafeParcelWriter.c(parcel, 5, this.f6134e);
        SafeParcelWriter.c(parcel, 6, this.f6135f);
        SafeParcelWriter.b(parcel, a2);
    }

    public zzbbd(int i, int i2, boolean z, boolean z2) {
        this(i, i2, true, false, false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzbbd(int r8, int r9, boolean r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            if (r10 == 0) goto L_0x0005
            java.lang.String r11 = "0"
            goto L_0x0007
        L_0x0005:
            java.lang.String r11 = "1"
        L_0x0007:
            int r12 = r11.length()
            int r12 = r12 + 36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r12)
            java.lang.String r12 = "afma-sdk-a-v"
            r0.append(r12)
            r0.append(r8)
            java.lang.String r12 = "."
            r0.append(r12)
            r0.append(r9)
            r0.append(r12)
            r0.append(r11)
            java.lang.String r2 = r0.toString()
            r6 = 0
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1.<init>((java.lang.String) r2, (int) r3, (int) r4, (boolean) r5, (boolean) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbbd.<init>(int, int, boolean, boolean, boolean):void");
    }

    @SafeParcelable.Constructor
    zzbbd(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 6) boolean z2) {
        this.f6131b = str;
        this.f6132c = i;
        this.f6133d = i2;
        this.f6134e = z;
        this.f6135f = z2;
    }
}
