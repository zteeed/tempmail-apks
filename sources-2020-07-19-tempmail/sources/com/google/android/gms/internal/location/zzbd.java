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
    private LocationRequest f9331b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private List<ClientIdentity> f9332c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private String f9333d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private boolean f9334e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private boolean f9335f;
    @SafeParcelable.Field
    private boolean g;
    @SafeParcelable.Field
    private String h;

    @SafeParcelable.Constructor
    zzbd(@SafeParcelable.Param(id = 1) LocationRequest locationRequest, @SafeParcelable.Param(id = 5) List<ClientIdentity> list, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) boolean z, @SafeParcelable.Param(id = 8) boolean z2, @SafeParcelable.Param(id = 9) boolean z3, @SafeParcelable.Param(id = 10) String str2) {
        this.f9331b = locationRequest;
        this.f9332c = list;
        this.f9333d = str;
        this.f9334e = z;
        this.f9335f = z2;
        this.g = z3;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbd)) {
            return false;
        }
        zzbd zzbd = (zzbd) obj;
        return Objects.a(this.f9331b, zzbd.f9331b) && Objects.a(this.f9332c, zzbd.f9332c) && Objects.a(this.f9333d, zzbd.f9333d) && this.f9334e == zzbd.f9334e && this.f9335f == zzbd.f9335f && this.g == zzbd.g && Objects.a(this.h, zzbd.h);
    }

    public final int hashCode() {
        return this.f9331b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9331b);
        if (this.f9333d != null) {
            sb.append(" tag=");
            sb.append(this.f9333d);
        }
        if (this.h != null) {
            sb.append(" moduleId=");
            sb.append(this.h);
        }
        sb.append(" hideAppOps=");
        sb.append(this.f9334e);
        sb.append(" clients=");
        sb.append(this.f9332c);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f9335f);
        if (this.g) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.r(parcel, 1, this.f9331b, i2, false);
        SafeParcelWriter.x(parcel, 5, this.f9332c, false);
        SafeParcelWriter.t(parcel, 6, this.f9333d, false);
        SafeParcelWriter.c(parcel, 7, this.f9334e);
        SafeParcelWriter.c(parcel, 8, this.f9335f);
        SafeParcelWriter.c(parcel, 9, this.g);
        SafeParcelWriter.t(parcel, 10, this.h, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
