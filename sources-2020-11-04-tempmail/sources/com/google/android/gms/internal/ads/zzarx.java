package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@SafeParcelable.Class
@SafeParcelable.Reserved
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzarx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzarx> CREATOR = new zzasa();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6087b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f6088c;

    public zzarx() {
        this(false, Collections.emptyList());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.c(parcel, 2, this.f6087b);
        SafeParcelWriter.v(parcel, 3, this.f6088c, false);
        SafeParcelWriter.b(parcel, a2);
    }

    @SafeParcelable.Constructor
    public zzarx(@SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) List<String> list) {
        this.f6087b = z;
        this.f6088c = list;
    }
}
