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
    public final String f6006b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public final String f6007c;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public final zzvh f6008d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final zzve f6009e;

    @SafeParcelable.Constructor
    public zzawx(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) zzvh zzvh, @SafeParcelable.Param(id = 4) zzve zzve) {
        this.f6006b = str;
        this.f6007c = str2;
        this.f6008d = zzvh;
        this.f6009e = zzve;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.t(parcel, 1, this.f6006b, false);
        SafeParcelWriter.t(parcel, 2, this.f6007c, false);
        SafeParcelWriter.r(parcel, 3, this.f6008d, i, false);
        SafeParcelWriter.r(parcel, 4, this.f6009e, i, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
