package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class
/* compiled from: com.google.firebase:firebase-dynamic-links@@19.1.0 */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new n();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final Uri f11654b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final Uri f11655c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final List<zzr> f11656d;

    @SafeParcelable.Constructor
    public zzo(@SafeParcelable.Param(id = 1) Uri uri, @SafeParcelable.Param(id = 2) Uri uri2, @SafeParcelable.Param(id = 3) List<zzr> list) {
        this.f11654b = uri;
        this.f11655c = uri2;
        this.f11656d = list;
    }

    public final List<zzr> A() {
        return this.f11656d;
    }

    public final Uri u() {
        return this.f11655c;
    }

    public final Uri v() {
        return this.f11654b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.r(parcel, 1, v(), i, false);
        SafeParcelWriter.r(parcel, 2, u(), i, false);
        SafeParcelWriter.x(parcel, 3, A(), false);
        SafeParcelWriter.b(parcel, a2);
    }
}
