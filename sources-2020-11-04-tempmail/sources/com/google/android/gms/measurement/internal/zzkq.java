package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzkq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzkq> CREATOR = new zzkp();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final int f10700b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public final String f10701c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final long f10702d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final Long f10703e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public final String f10704f;
    @SafeParcelable.Field
    public final String g;
    @SafeParcelable.Field
    public final Double h;

    zzkq(s7 s7Var) {
        this(s7Var.f10426c, s7Var.f10427d, s7Var.f10428e, s7Var.f10425b);
    }

    public final Object u() {
        Long l = this.f10703e;
        if (l != null) {
            return l;
        }
        Double d2 = this.h;
        if (d2 != null) {
            return d2;
        }
        String str = this.f10704f;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f10700b);
        SafeParcelWriter.t(parcel, 2, this.f10701c, false);
        SafeParcelWriter.o(parcel, 3, this.f10702d);
        SafeParcelWriter.p(parcel, 4, this.f10703e, false);
        SafeParcelWriter.j(parcel, 5, (Float) null, false);
        SafeParcelWriter.t(parcel, 6, this.f10704f, false);
        SafeParcelWriter.t(parcel, 7, this.g, false);
        SafeParcelWriter.h(parcel, 8, this.h, false);
        SafeParcelWriter.b(parcel, a2);
    }

    zzkq(String str, long j, Object obj, String str2) {
        Preconditions.g(str);
        this.f10700b = 2;
        this.f10701c = str;
        this.f10702d = j;
        this.g = str2;
        if (obj == null) {
            this.f10703e = null;
            this.h = null;
            this.f10704f = null;
        } else if (obj instanceof Long) {
            this.f10703e = (Long) obj;
            this.h = null;
            this.f10704f = null;
        } else if (obj instanceof String) {
            this.f10703e = null;
            this.h = null;
            this.f10704f = (String) obj;
        } else if (obj instanceof Double) {
            this.f10703e = null;
            this.h = (Double) obj;
            this.f10704f = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    @SafeParcelable.Constructor
    zzkq(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) long j, @SafeParcelable.Param(id = 4) Long l, @SafeParcelable.Param(id = 5) Float f2, @SafeParcelable.Param(id = 6) String str2, @SafeParcelable.Param(id = 7) String str3, @SafeParcelable.Param(id = 8) Double d2) {
        this.f10700b = i;
        this.f10701c = str;
        this.f10702d = j;
        this.f10703e = l;
        if (i == 1) {
            this.h = f2 != null ? Double.valueOf(f2.doubleValue()) : null;
        } else {
            this.h = d2;
        }
        this.f10704f = str2;
        this.g = str3;
    }
}
