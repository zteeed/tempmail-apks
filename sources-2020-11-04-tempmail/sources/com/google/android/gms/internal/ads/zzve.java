package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzve extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzve> CREATOR = new zzvg();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final int f9366b;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public final long f9367c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f9368d;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public final int f9369e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f9370f;
    @SafeParcelable.Field
    public final boolean g;
    @SafeParcelable.Field
    public final int h;
    @SafeParcelable.Field
    public final boolean i;
    @SafeParcelable.Field
    public final String j;
    @SafeParcelable.Field
    public final zzzw k;
    @SafeParcelable.Field
    public final Location l;
    @SafeParcelable.Field
    public final String m;
    @SafeParcelable.Field
    public final Bundle n;
    @SafeParcelable.Field
    public final Bundle o;
    @SafeParcelable.Field
    public final List<String> p;
    @SafeParcelable.Field
    public final String q;
    @SafeParcelable.Field
    public final String r;
    @SafeParcelable.Field
    @Deprecated
    public final boolean s;
    @SafeParcelable.Field
    public final zzuw t;
    @SafeParcelable.Field
    public final int u;
    @SafeParcelable.Field
    public final String v;
    @SafeParcelable.Field
    public final List<String> w;

    @SafeParcelable.Constructor
    public zzve(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 3) Bundle bundle, @SafeParcelable.Param(id = 4) int i3, @SafeParcelable.Param(id = 5) List<String> list, @SafeParcelable.Param(id = 6) boolean z, @SafeParcelable.Param(id = 7) int i4, @SafeParcelable.Param(id = 8) boolean z2, @SafeParcelable.Param(id = 9) String str, @SafeParcelable.Param(id = 10) zzzw zzzw, @SafeParcelable.Param(id = 11) Location location, @SafeParcelable.Param(id = 12) String str2, @SafeParcelable.Param(id = 13) Bundle bundle2, @SafeParcelable.Param(id = 14) Bundle bundle3, @SafeParcelable.Param(id = 15) List<String> list2, @SafeParcelable.Param(id = 16) String str3, @SafeParcelable.Param(id = 17) String str4, @SafeParcelable.Param(id = 18) boolean z3, @SafeParcelable.Param(id = 19) zzuw zzuw, @SafeParcelable.Param(id = 20) int i5, @SafeParcelable.Param(id = 21) String str5, @SafeParcelable.Param(id = 22) List<String> list3) {
        this.f9366b = i2;
        this.f9367c = j2;
        this.f9368d = bundle == null ? new Bundle() : bundle;
        this.f9369e = i3;
        this.f9370f = list;
        this.g = z;
        this.h = i4;
        this.i = z2;
        this.j = str;
        this.k = zzzw;
        this.l = location;
        this.m = str2;
        this.n = bundle2 == null ? new Bundle() : bundle2;
        this.o = bundle3;
        this.p = list2;
        this.q = str3;
        this.r = str4;
        this.s = z3;
        this.t = zzuw;
        this.u = i5;
        this.v = str5;
        this.w = list3 == null ? new ArrayList<>() : list3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzve)) {
            return false;
        }
        zzve zzve = (zzve) obj;
        if (this.f9366b != zzve.f9366b || this.f9367c != zzve.f9367c || !Objects.a(this.f9368d, zzve.f9368d) || this.f9369e != zzve.f9369e || !Objects.a(this.f9370f, zzve.f9370f) || this.g != zzve.g || this.h != zzve.h || this.i != zzve.i || !Objects.a(this.j, zzve.j) || !Objects.a(this.k, zzve.k) || !Objects.a(this.l, zzve.l) || !Objects.a(this.m, zzve.m) || !Objects.a(this.n, zzve.n) || !Objects.a(this.o, zzve.o) || !Objects.a(this.p, zzve.p) || !Objects.a(this.q, zzve.q) || !Objects.a(this.r, zzve.r) || this.s != zzve.s || this.u != zzve.u || !Objects.a(this.v, zzve.v) || !Objects.a(this.w, zzve.w)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(this.f9366b), Long.valueOf(this.f9367c), this.f9368d, Integer.valueOf(this.f9369e), this.f9370f, Boolean.valueOf(this.g), Integer.valueOf(this.h), Boolean.valueOf(this.i), this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, Boolean.valueOf(this.s), Integer.valueOf(this.u), this.v, this.w);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f9366b);
        SafeParcelWriter.o(parcel, 2, this.f9367c);
        SafeParcelWriter.e(parcel, 3, this.f9368d, false);
        SafeParcelWriter.l(parcel, 4, this.f9369e);
        SafeParcelWriter.v(parcel, 5, this.f9370f, false);
        SafeParcelWriter.c(parcel, 6, this.g);
        SafeParcelWriter.l(parcel, 7, this.h);
        SafeParcelWriter.c(parcel, 8, this.i);
        SafeParcelWriter.t(parcel, 9, this.j, false);
        SafeParcelWriter.r(parcel, 10, this.k, i2, false);
        SafeParcelWriter.r(parcel, 11, this.l, i2, false);
        SafeParcelWriter.t(parcel, 12, this.m, false);
        SafeParcelWriter.e(parcel, 13, this.n, false);
        SafeParcelWriter.e(parcel, 14, this.o, false);
        SafeParcelWriter.v(parcel, 15, this.p, false);
        SafeParcelWriter.t(parcel, 16, this.q, false);
        SafeParcelWriter.t(parcel, 17, this.r, false);
        SafeParcelWriter.c(parcel, 18, this.s);
        SafeParcelWriter.r(parcel, 19, this.t, i2, false);
        SafeParcelWriter.l(parcel, 20, this.u);
        SafeParcelWriter.t(parcel, 21, this.v, false);
        SafeParcelWriter.v(parcel, 22, this.w, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
