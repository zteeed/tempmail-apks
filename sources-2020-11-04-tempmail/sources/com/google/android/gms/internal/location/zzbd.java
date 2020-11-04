package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzbd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbd> CREATOR = new zzbe();
    static final List<ClientIdentity> i = Collections.emptyList();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private LocationRequest f9514b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private List<ClientIdentity> f9515c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private String f9516d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private boolean f9517e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private boolean f9518f;
    @SafeParcelable.Field
    private boolean g;
    @SafeParcelable.Field
    private String h;

    @SafeParcelable.Constructor
    zzbd(@SafeParcelable.Param(id = 1) LocationRequest locationRequest, @SafeParcelable.Param(id = 5) List<ClientIdentity> list, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) boolean z, @SafeParcelable.Param(id = 8) boolean z2, @SafeParcelable.Param(id = 9) boolean z3, @SafeParcelable.Param(id = 10) String str2) {
        this.f9514b = locationRequest;
        this.f9515c = list;
        this.f9516d = str;
        this.f9517e = z;
        this.f9518f = z2;
        this.g = z3;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbd)) {
            return false;
        }
        zzbd zzbd = (zzbd) obj;
        return Objects.a(this.f9514b, zzbd.f9514b) && Objects.a(this.f9515c, zzbd.f9515c) && Objects.a(this.f9516d, zzbd.f9516d) && this.f9517e == zzbd.f9517e && this.f9518f == zzbd.f9518f && this.g == zzbd.g && Objects.a(this.h, zzbd.h);
    }

    public final int hashCode() {
        return this.f9514b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9514b);
        if (this.f9516d != null) {
            sb.append(" tag=");
            sb.append(this.f9516d);
        }
        if (this.h != null) {
            sb.append(" moduleId=");
            sb.append(this.h);
        }
        sb.append(" hideAppOps=");
        sb.append(this.f9517e);
        sb.append(" clients=");
        sb.append(this.f9515c);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f9518f);
        if (this.g) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.r(parcel, 1, this.f9514b, i2, false);
        SafeParcelWriter.x(parcel, 5, this.f9515c, false);
        SafeParcelWriter.t(parcel, 6, this.f9516d, false);
        SafeParcelWriter.c(parcel, 7, this.f9517e);
        SafeParcelWriter.c(parcel, 8, this.f9518f);
        SafeParcelWriter.c(parcel, 9, this.g);
        SafeParcelWriter.t(parcel, 10, this.h, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
