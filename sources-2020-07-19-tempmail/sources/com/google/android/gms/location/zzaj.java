package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new zzak();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final int f9880b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final int f9881c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final long f9882d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private final long f9883e;

    @SafeParcelable.Constructor
    zzaj(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) long j, @SafeParcelable.Param(id = 4) long j2) {
        this.f9880b = i;
        this.f9881c = i2;
        this.f9882d = j;
        this.f9883e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaj.class == obj.getClass()) {
            zzaj zzaj = (zzaj) obj;
            return this.f9880b == zzaj.f9880b && this.f9881c == zzaj.f9881c && this.f9882d == zzaj.f9882d && this.f9883e == zzaj.f9883e;
        }
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(this.f9881c), Integer.valueOf(this.f9880b), Long.valueOf(this.f9883e), Long.valueOf(this.f9882d));
    }

    public final String toString() {
        return "NetworkLocationStatus:" + " Wifi status: " + this.f9880b + " Cell status: " + this.f9881c + " elapsed time NS: " + this.f9883e + " system time ms: " + this.f9882d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f9880b);
        SafeParcelWriter.l(parcel, 2, this.f9881c);
        SafeParcelWriter.o(parcel, 3, this.f9882d);
        SafeParcelWriter.o(parcel, 4, this.f9883e);
        SafeParcelWriter.b(parcel, a2);
    }
}
