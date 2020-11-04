package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public class SignInButtonConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInButtonConfig> CREATOR = new zao();
    @SafeParcelable.VersionField

    /* renamed from: b  reason: collision with root package name */
    private final int f3031b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final int f3032c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final int f3033d;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    private final Scope[] f3034e;

    @SafeParcelable.Constructor
    SignInButtonConfig(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) Scope[] scopeArr) {
        this.f3031b = i;
        this.f3032c = i2;
        this.f3033d = i3;
        this.f3034e = scopeArr;
    }

    @Deprecated
    public Scope[] A() {
        return this.f3034e;
    }

    public int u() {
        return this.f3032c;
    }

    public int v() {
        return this.f3033d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f3031b);
        SafeParcelWriter.l(parcel, 2, u());
        SafeParcelWriter.l(parcel, 3, v());
        SafeParcelWriter.w(parcel, 4, A(), i, false);
        SafeParcelWriter.b(parcel, a2);
    }

    public SignInButtonConfig(int i, int i2, Scope[] scopeArr) {
        this(1, i, i2, (Scope[]) null);
    }
}
