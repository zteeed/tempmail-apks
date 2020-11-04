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
    private final Uri f11104b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final Uri f11105c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final List<zzr> f11106d;

    @SafeParcelable.Constructor
    public zzo(@SafeParcelable.Param(id = 1) Uri uri, @SafeParcelable.Param(id = 2) Uri uri2, @SafeParcelable.Param(id = 3) List<zzr> list) {
        this.f11104b = uri;
        this.f11105c = uri2;
        this.f11106d = list;
    }

    public final List<zzr> A() {
        return this.f11106d;
    }

    public final Uri u() {
        return this.f11105c;
    }

    public final Uri v() {
        return this.f11104b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.r(parcel, 1, v(), i, false);
        SafeParcelWriter.r(parcel, 2, u(), i, false);
        SafeParcelWriter.x(parcel, 3, A(), false);
        SafeParcelWriter.b(parcel, a2);
    }
}
