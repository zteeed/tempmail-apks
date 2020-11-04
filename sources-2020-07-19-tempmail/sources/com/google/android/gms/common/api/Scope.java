package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new zza();
    @SafeParcelable.VersionField

    /* renamed from: b  reason: collision with root package name */
    private final int f2708b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final String f2709c;

    @SafeParcelable.Constructor
    Scope(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str) {
        Preconditions.h(str, "scopeUri must not be null or empty");
        this.f2708b = i;
        this.f2709c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f2709c.equals(((Scope) obj).f2709c);
    }

    public final int hashCode() {
        return this.f2709c.hashCode();
    }

    public final String toString() {
        return this.f2709c;
    }

    @KeepForSdk
    public final String u() {
        return this.f2709c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f2708b);
        SafeParcelWriter.t(parcel, 2, u(), false);
        SafeParcelWriter.b(parcel, a2);
    }

    public Scope(String str) {
        this(1, str);
    }
}
