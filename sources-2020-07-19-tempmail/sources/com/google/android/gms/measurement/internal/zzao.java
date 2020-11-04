package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new zzar();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f10377b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public final zzan f10378c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final String f10379d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final long f10380e;

    @SafeParcelable.Constructor
    public zzao(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) zzan zzan, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) long j) {
        this.f10377b = str;
        this.f10378c = zzan;
        this.f10379d = str2;
        this.f10380e = j;
    }

    public final String toString() {
        String str = this.f10379d;
        String str2 = this.f10377b;
        String valueOf = String.valueOf(this.f10378c);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.t(parcel, 2, this.f10377b, false);
        SafeParcelWriter.r(parcel, 3, this.f10378c, i, false);
        SafeParcelWriter.t(parcel, 4, this.f10379d, false);
        SafeParcelWriter.o(parcel, 5, this.f10380e);
        SafeParcelWriter.b(parcel, a2);
    }

    zzao(zzao zzao, long j) {
        Preconditions.k(zzao);
        this.f10377b = zzao.f10377b;
        this.f10378c = zzao.f10378c;
        this.f10379d = zzao.f10379d;
        this.f10380e = j;
    }
}
