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
    private final int f9873b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final String f9874c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final String f9875d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private final String f9876e;

    @SafeParcelable.Constructor
    PlaceReport(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3) {
        this.f9873b = i;
        this.f9874c = str;
        this.f9875d = str2;
        this.f9876e = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlaceReport)) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj;
        return Objects.a(this.f9874c, placeReport.f9874c) && Objects.a(this.f9875d, placeReport.f9875d) && Objects.a(this.f9876e, placeReport.f9876e);
    }

    public int hashCode() {
        return Objects.b(this.f9874c, this.f9875d, this.f9876e);
    }

    public String toString() {
        Objects.ToStringHelper c2 = Objects.c(this);
        c2.a("placeId", this.f9874c);
        c2.a("tag", this.f9875d);
        if (!"unknown".equals(this.f9876e)) {
            c2.a("source", this.f9876e);
        }
        return c2.toString();
    }

    public String u() {
        return this.f9874c;
    }

    public String v() {
        return this.f9875d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f9873b);
        SafeParcelWriter.t(parcel, 2, u(), false);
        SafeParcelWriter.t(parcel, 3, v(), false);
        SafeParcelWriter.t(parcel, 4, this.f9876e, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
