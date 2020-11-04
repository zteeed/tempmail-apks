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
    private final int f3146b;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    private final IBinder f3147c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final Scope[] f3148d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private Integer f3149e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private Integer f3150f;
    @SafeParcelable.Field
    private Account g;

    @SafeParcelable.Constructor
    AuthAccountRequest(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) Scope[] scopeArr, @SafeParcelable.Param(id = 4) Integer num, @SafeParcelable.Param(id = 5) Integer num2, @SafeParcelable.Param(id = 6) Account account) {
        this.f3146b = i;
        this.f3147c = iBinder;
        this.f3148d = scopeArr;
        this.f3149e = num;
        this.f3150f = num2;
        this.g = account;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f3146b);
        SafeParcelWriter.k(parcel, 2, this.f3147c, false);
        SafeParcelWriter.w(parcel, 3, this.f3148d, i, false);
        SafeParcelWriter.n(parcel, 4, this.f3149e, false);
        SafeParcelWriter.n(parcel, 5, this.f3150f, false);
        SafeParcelWriter.r(parcel, 6, this.g, i, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
