package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.firebase:firebase-dynamic-links@@19.1.0 */
public class DynamicLinkData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DynamicLinkData> CREATOR = new a();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private String f11092b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private String f11093c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private int f11094d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private long f11095e = 0;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private Bundle f11096f = null;
    @SafeParcelable.Field
    private Uri g;

    @SafeParcelable.Constructor
    public DynamicLinkData(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) long j, @SafeParcelable.Param(id = 5) Bundle bundle, @SafeParcelable.Param(id = 6) Uri uri) {
        this.f11092b = str;
        this.f11093c = str2;
        this.f11094d = i;
        this.f11095e = j;
        this.f11096f = bundle;
        this.g = uri;
    }

    public final Uri A() {
        return this.g;
    }

    public final String B() {
        return this.f11093c;
    }

    public final int G() {
        return this.f11094d;
    }

    public final Bundle J() {
        Bundle bundle = this.f11096f;
        return bundle == null ? new Bundle() : bundle;
    }

    public final long u() {
        return this.f11095e;
    }

    public final void v(long j) {
        this.f11095e = j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.t(parcel, 1, this.f11092b, false);
        SafeParcelWriter.t(parcel, 2, this.f11093c, false);
        SafeParcelWriter.l(parcel, 3, this.f11094d);
        SafeParcelWriter.o(parcel, 4, this.f11095e);
        SafeParcelWriter.e(parcel, 5, J(), false);
        SafeParcelWriter.r(parcel, 6, this.g, i, false);
        SafeParcelWriter.b(parcel, a2);
    }
}