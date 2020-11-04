package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public class AuthAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthAccountRequest> CREATOR = new zaa();
    @SafeParcelable.VersionField

    /* renamed from: b  reason: collision with root package name */
    private final int f2958b;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    private final IBinder f2959c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final Scope[] f2960d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private Integer f2961e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private Integer f2962f;
    @SafeParcelable.Field
    private Account g;

    @SafeParcelable.Constructor
    AuthAccountRequest(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) Scope[] scopeArr, @SafeParcelable.Param(id = 4) Integer num, @SafeParcelable.Param(id = 5) Integer num2, @SafeParcelable.Param(id = 6) Account account) {
        this.f2958b = i;
        this.f2959c = iBinder;
        this.f2960d = scopeArr;
        this.f2961e = num;
        this.f2962f = num2;
        this.g = account;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f2958b);
        SafeParcelWriter.k(parcel, 2, this.f2959c, false);
        SafeParcelWriter.w(parcel, 3, this.f2960d, i, false);
        SafeParcelWriter.n(parcel, 4, this.f2961e, false);
        SafeParcelWriter.n(parcel, 5, this.f2962f, false);
        SafeParcelWriter.r(parcel, 6, this.g, i, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
