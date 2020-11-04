package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public final class zaa extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zaa> CREATOR = new zab();
    @SafeParcelable.VersionField

    /* renamed from: b  reason: collision with root package name */
    private final int f10547b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private int f10548c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private Intent f10549d;

    @SafeParcelable.Constructor
    zaa(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) Intent intent) {
        this.f10547b = i;
        this.f10548c = i2;
        this.f10549d = intent;
    }

    public final Status q() {
        if (this.f10548c == 0) {
            return Status.f2710f;
        }
        return Status.i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f10547b);
        SafeParcelWriter.l(parcel, 2, this.f10548c);
        SafeParcelWriter.r(parcel, 3, this.f10549d, i, false);
        SafeParcelWriter.b(parcel, a2);
    }

    public zaa() {
        this(0, (Intent) null);
    }

    private zaa(int i, Intent intent) {
        this(2, 0, (Intent) null);
    }
}
