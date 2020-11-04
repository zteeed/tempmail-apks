package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzazi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzazi> CREATOR = new zzazk();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f6254b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public final int f6255c;

    @SafeParcelable.Constructor
    zzazi(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i) {
        this.f6254b = str == null ? "" : str;
        this.f6255c = i;
    }

    public static zzazi u(Throwable th) {
        String str;
        zzuy b2 = zzcmi.b(th);
        if (zzdsi.b(th.getMessage())) {
            str = b2.f9356c;
        } else {
            str = th.getMessage();
        }
        return new zzazi(str, b2.f9355b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.t(parcel, 1, this.f6254b, false);
        SafeParcelWriter.l(parcel, 2, this.f6255c);
        SafeParcelWriter.b(parcel, a2);
    }
}
