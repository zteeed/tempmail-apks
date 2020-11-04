package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    @KeepForSdk
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new zaa();
    @SafeParcelable.VersionField

    /* renamed from: b  reason: collision with root package name */
    private final int f3075b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final String f3076c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final int f3077d;

    @SafeParcelable.Constructor
    public FavaDiagnosticsEntity(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i2) {
        this.f3075b = i;
        this.f3076c = str;
        this.f3077d = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f3075b);
        SafeParcelWriter.t(parcel, 2, this.f3076c, false);
        SafeParcelWriter.l(parcel, 3, this.f3077d);
        SafeParcelWriter.b(parcel, a2);
    }
}
