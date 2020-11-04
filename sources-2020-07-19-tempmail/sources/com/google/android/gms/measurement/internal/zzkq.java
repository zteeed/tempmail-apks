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
    private final int f10514b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public final String f10515c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final long f10516d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final Long f10517e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public final String f10518f;
    @SafeParcelable.Field
    public final String g;
    @SafeParcelable.Field
    public final Double h;

    zzkq(s7 s7Var) {
        this(s7Var.f10240c, s7Var.f10241d, s7Var.f10242e, s7Var.f10239b);
    }

    public final Object u() {
        Long l = this.f10517e;
        if (l != null) {
            return l;
        }
        Double d2 = this.h;
        if (d2 != null) {
            return d2;
        }
        String str = this.f10518f;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f10514b);
        SafeParcelWriter.t(parcel, 2, this.f10515c, false);
        SafeParcelWriter.o(parcel, 3, this.f10516d);
        SafeParcelWriter.p(parcel, 4, this.f10517e, false);
        SafeParcelWriter.j(parcel, 5, (Float) null, false);
        SafeParcelWriter.t(parcel, 6, this.f10518f, false);
        SafeParcelWriter.t(parcel, 7, this.g, false);
        SafeParcelWriter.h(parcel, 8, this.h, false);
        SafeParcelWriter.b(parcel, a2);
    }

    zzkq(String str, long j, Object obj, String str2) {
        Preconditions.g(str);
        this.f10514b = 2;
        this.f10515c = str;
        this.f10516d = j;
        this.g = str2;
        if (obj == null) {
            this.f10517e = null;
            this.h = null;
            this.f10518f = null;
        } else if (obj instanceof Long) {
            this.f10517e = (Long) obj;
            this.h = null;
            this.f10518f = null;
        } else if (obj instanceof String) {
            this.f10517e = null;
            this.h = null;
            this.f10518f = (String) obj;
        } else if (obj instanceof Double) {
            this.f10517e = null;
            this.h = (Double) obj;
            this.f10518f = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    @SafeParcelable.Constructor
    zzkq(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) long j, @SafeParcelable.Param(id = 4) Long l, @SafeParcelable.Param(id = 5) Float f2, @SafeParcelable.Param(id = 6) String str2, @SafeParcelable.Param(id = 7) String str3, @SafeParcelable.Param(id = 8) Double d2) {
        this.f10514b = i;
        this.f10515c = str;
        this.f10516d = j;
        this.f10517e = l;
        if (i == 1) {
            this.h = f2 != null ? Double.valueOf(f2.doubleValue()) : null;
        } else {
            this.h = d2;
        }
        this.f10518f = str2;
        this.g = str3;
    }
}
