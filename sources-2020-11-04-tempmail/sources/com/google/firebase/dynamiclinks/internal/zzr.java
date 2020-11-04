package com.google.firebase.dynamiclinks.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.firebase:firebase-dynamic-links@@19.1.0 */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new o();
    @SafeParcelable.Field
    @SafeParcelable.Reserved

    /* renamed from: b  reason: collision with root package name */
    private final String f11657b;

    @SafeParcelable.Constructor
    public zzr(@SafeParcelable.Param(id = 2) String str) {
        this.f11657b = str;
    }

    public final String u() {
        return this.f11657b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.t(parcel, 2, u(), false);
        SafeParcelWriter.b(parcel, a2);
    }
}
