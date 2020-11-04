package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public class PlaceReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<PlaceReport> CREATOR = new zza();
    @SafeParcelable.VersionField

    /* renamed from: b  reason: collision with root package name */
    private final int f10059b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final String f10060c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final String f10061d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private final String f10062e;

    @SafeParcelable.Constructor
    PlaceReport(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3) {
        this.f10059b = i;
        this.f10060c = str;
        this.f10061d = str2;
        this.f10062e = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlaceReport)) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj;
        return Objects.a(this.f10060c, placeReport.f10060c) && Objects.a(this.f10061d, placeReport.f10061d) && Objects.a(this.f10062e, placeReport.f10062e);
    }

    public int hashCode() {
        return Objects.b(this.f10060c, this.f10061d, this.f10062e);
    }

    public String toString() {
        Objects.ToStringHelper c2 = Objects.c(this);
        c2.a("placeId", this.f10060c);
        c2.a("tag", this.f10061d);
        if (!"unknown".equals(this.f10062e)) {
            c2.a("source", this.f10062e);
        }
        return c2.toString();
    }

    public String u() {
        return this.f10060c;
    }

    public String v() {
        return this.f10061d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f10059b);
        SafeParcelWriter.t(parcel, 2, u(), false);
        SafeParcelWriter.t(parcel, 3, v(), false);
        SafeParcelWriter.t(parcel, 4, this.f10062e, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
