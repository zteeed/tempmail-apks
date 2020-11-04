package com.google.android.gms.signin.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public final class zaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaj> CREATOR = new zak();
    @SafeParcelable.VersionField

    /* renamed from: b  reason: collision with root package name */
    private final int f10738b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final ConnectionResult f10739c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final ResolveAccountResponse f10740d;

    @SafeParcelable.Constructor
    zaj(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ConnectionResult connectionResult, @SafeParcelable.Param(id = 3) ResolveAccountResponse resolveAccountResponse) {
        this.f10738b = i;
        this.f10739c = connectionResult;
        this.f10740d = resolveAccountResponse;
    }

    public final ConnectionResult u() {
        return this.f10739c;
    }

    public final ResolveAccountResponse v() {
        return this.f10740d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f10738b);
        SafeParcelWriter.r(parcel, 2, this.f10739c, i, false);
        SafeParcelWriter.r(parcel, 3, this.f10740d, i, false);
        SafeParcelWriter.b(parcel, a2);
    }

    public zaj(int i) {
        this(new ConnectionResult(8, (PendingIntent) null), (ResolveAccountResponse) null);
    }

    private zaj(ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this(1, connectionResult, (ResolveAccountResponse) null);
    }
}
