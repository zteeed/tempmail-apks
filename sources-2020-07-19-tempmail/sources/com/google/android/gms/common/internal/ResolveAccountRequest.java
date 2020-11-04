package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public class ResolveAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResolveAccountRequest> CREATOR = new zam();
    @SafeParcelable.VersionField

    /* renamed from: b  reason: collision with root package name */
    private final int f3021b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final Account f3022c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final int f3023d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private final GoogleSignInAccount f3024e;

    @SafeParcelable.Constructor
    ResolveAccountRequest(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) Account account, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) GoogleSignInAccount googleSignInAccount) {
        this.f3021b = i;
        this.f3022c = account;
        this.f3023d = i2;
        this.f3024e = googleSignInAccount;
    }

    public Account U() {
        return this.f3022c;
    }

    public int u() {
        return this.f3023d;
    }

    public GoogleSignInAccount v() {
        return this.f3024e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f3021b);
        SafeParcelWriter.r(parcel, 2, U(), i, false);
        SafeParcelWriter.l(parcel, 3, u());
        SafeParcelWriter.r(parcel, 4, v(), i, false);
        SafeParcelWriter.b(parcel, a2);
    }

    public ResolveAccountRequest(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }
}
