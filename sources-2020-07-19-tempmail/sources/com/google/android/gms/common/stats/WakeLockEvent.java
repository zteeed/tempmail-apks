package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();
    @SafeParcelable.VersionField

    /* renamed from: b  reason: collision with root package name */
    private final int f3109b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final long f3110c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private int f3111d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private final String f3112e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private final String f3113f;
    @SafeParcelable.Field
    private final String g;
    @SafeParcelable.Field
    private final int h;
    @SafeParcelable.Field
    private final List<String> i;
    @SafeParcelable.Field
    private final String j;
    @SafeParcelable.Field
    private final long k;
    @SafeParcelable.Field
    private int l;
    @SafeParcelable.Field
    private final String m;
    @SafeParcelable.Field
    private final float n;
    @SafeParcelable.Field
    private final long o;
    @SafeParcelable.Field
    private final boolean p;
    private long q;

    @SafeParcelable.Constructor
    WakeLockEvent(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 11) int i3, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) int i4, @SafeParcelable.Param(id = 6) List<String> list, @SafeParcelable.Param(id = 12) String str2, @SafeParcelable.Param(id = 8) long j3, @SafeParcelable.Param(id = 14) int i5, @SafeParcelable.Param(id = 10) String str3, @SafeParcelable.Param(id = 13) String str4, @SafeParcelable.Param(id = 15) float f2, @SafeParcelable.Param(id = 16) long j4, @SafeParcelable.Param(id = 17) String str5, @SafeParcelable.Param(id = 18) boolean z) {
        this.f3109b = i2;
        this.f3110c = j2;
        this.f3111d = i3;
        this.f3112e = str;
        this.f3113f = str3;
        this.g = str5;
        this.h = i4;
        this.q = -1;
        this.i = list;
        this.j = str2;
        this.k = j3;
        this.l = i5;
        this.m = str4;
        this.n = f2;
        this.o = j4;
        this.p = z;
    }

    public final long A() {
        return this.q;
    }

    public final String B() {
        String str;
        String str2 = this.f3112e;
        int i2 = this.h;
        List<String> list = this.i;
        String str3 = "";
        if (list == null) {
            str = str3;
        } else {
            str = TextUtils.join(",", list);
        }
        int i3 = this.l;
        String str4 = this.f3113f;
        if (str4 == null) {
            str4 = str3;
        }
        String str5 = this.m;
        if (str5 == null) {
            str5 = str3;
        }
        float f2 = this.n;
        String str6 = this.g;
        if (str6 != null) {
            str3 = str6;
        }
        boolean z = this.p;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 51 + String.valueOf(str).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str3).length());
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i3);
        sb.append("\t");
        sb.append(str4);
        sb.append("\t");
        sb.append(str5);
        sb.append("\t");
        sb.append(f2);
        sb.append("\t");
        sb.append(str3);
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }

    public final int u() {
        return this.f3111d;
    }

    public final long v() {
        return this.f3110c;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f3109b);
        SafeParcelWriter.o(parcel, 2, v());
        SafeParcelWriter.t(parcel, 4, this.f3112e, false);
        SafeParcelWriter.l(parcel, 5, this.h);
        SafeParcelWriter.v(parcel, 6, this.i, false);
        SafeParcelWriter.o(parcel, 8, this.k);
        SafeParcelWriter.t(parcel, 10, this.f3113f, false);
        SafeParcelWriter.l(parcel, 11, u());
        SafeParcelWriter.t(parcel, 12, this.j, false);
        SafeParcelWriter.t(parcel, 13, this.m, false);
        SafeParcelWriter.l(parcel, 14, this.l);
        SafeParcelWriter.i(parcel, 15, this.n);
        SafeParcelWriter.o(parcel, 16, this.o);
        SafeParcelWriter.t(parcel, 17, this.g, false);
        SafeParcelWriter.c(parcel, 18, this.p);
        SafeParcelWriter.b(parcel, a2);
    }

    public WakeLockEvent(long j2, int i2, String str, int i3, List<String> list, String str2, long j3, int i4, String str3, String str4, float f2, long j4, String str5, boolean z) {
        this(2, j2, i2, str, i3, list, str2, j3, i4, str3, str4, f2, j4, str5, z);
    }
}
