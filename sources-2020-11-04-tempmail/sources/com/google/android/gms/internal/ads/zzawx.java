package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.ParametersAreNonnullByDefault;

@SafeParcelable.Class
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzawx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzawx> CREATOR = new zzaxa();
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public final String f6189b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public final String f6190c;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public final zzvh f6191d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final zzve f6192e;

    @SafeParcelable.Constructor
    public zzawx(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) zzvh zzvh, @SafeParcelable.Param(id = 4) zzve zzve) {
        this.f6189b = str;
        this.f6190c = str2;
        this.f6191d = zzvh;
        this.f6192e = zzve;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.t(parcel, 1, this.f6189b, false);
        SafeParcelWriter.t(parcel, 2, this.f6190c, false);
        SafeParcelWriter.r(parcel, 3, this.f6191d, i, false);
        SafeParcelWriter.r(parcel, 4, this.f6192e, i, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
