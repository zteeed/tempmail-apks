package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.zzj;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new zzn();
    @VisibleForTesting

    /* renamed from: e  reason: collision with root package name */
    static final List<ClientIdentity> f9531e = Collections.emptyList();

    /* renamed from: f  reason: collision with root package name */
    static final zzj f9532f = new zzj();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private zzj f9533b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private List<ClientIdentity> f9534c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private String f9535d;

    @SafeParcelable.Constructor
    zzm(@SafeParcelable.Param(id = 1) zzj zzj, @SafeParcelable.Param(id = 2) List<ClientIdentity> list, @SafeParcelable.Param(id = 3) String str) {
        this.f9533b = zzj;
        this.f9534c = list;
        this.f9535d = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzm)) {
            return false;
        }
        zzm zzm = (zzm) obj;
        return Objects.a(this.f9533b, zzm.f9533b) && Objects.a(this.f9534c, zzm.f9534c) && Objects.a(this.f9535d, zzm.f9535d);
    }

    public final int hashCode() {
        return this.f9533b.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.r(parcel, 1, this.f9533b, i, false);
        SafeParcelWriter.x(parcel, 2, this.f9534c, false);
        SafeParcelWriter.t(parcel, 3, this.f9535d, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
