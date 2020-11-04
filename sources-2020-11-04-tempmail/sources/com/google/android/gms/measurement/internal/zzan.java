package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzan extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzan> CREATOR = new zzap();
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f10562b;

    @SafeParcelable.Constructor
    zzan(@SafeParcelable.Param(id = 2) Bundle bundle) {
        this.f10562b = bundle;
    }

    /* access modifiers changed from: package-private */
    public final Object A(String str) {
        return this.f10562b.get(str);
    }

    public final Bundle B() {
        return new Bundle(this.f10562b);
    }

    /* access modifiers changed from: package-private */
    public final Long G(String str) {
        return Long.valueOf(this.f10562b.getLong(str));
    }

    /* access modifiers changed from: package-private */
    public final Double J(String str) {
        return Double.valueOf(this.f10562b.getDouble(str));
    }

    /* access modifiers changed from: package-private */
    public final String K(String str) {
        return this.f10562b.getString(str);
    }

    public final Iterator<String> iterator() {
        return new i(this);
    }

    public final String toString() {
        return this.f10562b.toString();
    }

    public final int u() {
        return this.f10562b.size();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.e(parcel, 2, B(), false);
        SafeParcelWriter.b(parcel, a2);
    }
}
