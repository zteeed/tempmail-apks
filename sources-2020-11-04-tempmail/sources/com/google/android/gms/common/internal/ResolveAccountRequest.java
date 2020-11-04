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
    private final int f3204b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final Account f3205c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final int f3206d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private final GoogleSignInAccount f3207e;

    @SafeParcelable.Constructor
    ResolveAccountRequest(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) Account account, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) GoogleSignInAccount googleSignInAccount) {
        this.f3204b = i;
        this.f3205c = account;
        this.f3206d = i2;
        this.f3207e = googleSignInAccount;
    }

    public Account a0() {
        return this.f3205c;
    }

    public int u() {
        return this.f3206d;
    }

    public GoogleSignInAccount v() {
        return this.f3207e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f3204b);
        SafeParcelWriter.r(parcel, 2, a0(), i, false);
        SafeParcelWriter.l(parcel, 3, u());
        SafeParcelWriter.r(parcel, 4, v(), i, false);
        SafeParcelWriter.b(parcel, a2);
    }

    public ResolveAccountRequest(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }
}
