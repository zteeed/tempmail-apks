package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public class ResolveAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResolveAccountResponse> CREATOR = new zan();
    @SafeParcelable.VersionField

    /* renamed from: b  reason: collision with root package name */
    private final int f3208b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private IBinder f3209c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private ConnectionResult f3210d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private boolean f3211e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private boolean f3212f;

    @SafeParcelable.Constructor
    ResolveAccountResponse(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) ConnectionResult connectionResult, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) boolean z2) {
        this.f3208b = i;
        this.f3209c = iBinder;
        this.f3210d = connectionResult;
        this.f3211e = z;
        this.f3212f = z2;
    }

    public boolean A() {
        return this.f3211e;
    }

    public boolean B() {
        return this.f3212f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveAccountResponse)) {
            return false;
        }
        ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse) obj;
        return this.f3210d.equals(resolveAccountResponse.f3210d) && u().equals(resolveAccountResponse.u());
    }

    public IAccountAccessor u() {
        return IAccountAccessor.Stub.H(this.f3209c);
    }

    public ConnectionResult v() {
        return this.f3210d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f3208b);
        SafeParcelWriter.k(parcel, 2, this.f3209c, false);
        SafeParcelWriter.r(parcel, 3, v(), i, false);
        SafeParcelWriter.c(parcel, 4, A());
        SafeParcelWriter.c(parcel, 5, B());
        SafeParcelWriter.b(parcel, a2);
    }
}
