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
    private final int f10066b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final int f10067c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final long f10068d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private final long f10069e;

    @SafeParcelable.Constructor
    zzaj(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) long j, @SafeParcelable.Param(id = 4) long j2) {
        this.f10066b = i;
        this.f10067c = i2;
        this.f10068d = j;
        this.f10069e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaj.class == obj.getClass()) {
            zzaj zzaj = (zzaj) obj;
            return this.f10066b == zzaj.f10066b && this.f10067c == zzaj.f10067c && this.f10068d == zzaj.f10068d && this.f10069e == zzaj.f10069e;
        }
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(this.f10067c), Integer.valueOf(this.f10066b), Long.valueOf(this.f10069e), Long.valueOf(this.f10068d));
    }

    public final String toString() {
        return "NetworkLocationStatus:" + " Wifi status: " + this.f10066b + " Cell status: " + this.f10067c + " elapsed time NS: " + this.f10069e + " system time ms: " + this.f10068d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f10066b);
        SafeParcelWriter.l(parcel, 2, this.f10067c);
        SafeParcelWriter.o(parcel, 3, this.f10068d);
        SafeParcelWriter.o(parcel, 4, this.f10069e);
        SafeParcelWriter.b(parcel, a2);
    }
}
