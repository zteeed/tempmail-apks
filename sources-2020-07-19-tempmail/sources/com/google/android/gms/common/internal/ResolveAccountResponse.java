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
    private final int f3025b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private IBinder f3026c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private ConnectionResult f3027d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private boolean f3028e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private boolean f3029f;

    @SafeParcelable.Constructor
    ResolveAccountResponse(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) ConnectionResult connectionResult, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) boolean z2) {
        this.f3025b = i;
        this.f3026c = iBinder;
        this.f3027d = connectionResult;
        this.f3028e = z;
        this.f3029f = z2;
    }

    public boolean A() {
        return this.f3028e;
    }

    public boolean B() {
        return this.f3029f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveAccountResponse)) {
            return false;
        }
        ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse) obj;
        return this.f3027d.equals(resolveAccountResponse.f3027d) && u().equals(resolveAccountResponse.u());
    }

    public IAccountAccessor u() {
        return IAccountAccessor.Stub.E(this.f3026c);
    }

    public ConnectionResult v() {
        return this.f3027d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f3025b);
        SafeParcelWriter.k(parcel, 2, this.f3026c, false);
        SafeParcelWriter.r(parcel, 3, v(), i, false);
        SafeParcelWriter.c(parcel, 4, A());
        SafeParcelWriter.c(parcel, 5, B());
        SafeParcelWriter.b(parcel, a2);
    }
}
