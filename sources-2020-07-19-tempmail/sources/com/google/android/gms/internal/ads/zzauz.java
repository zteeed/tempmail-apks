package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.ParametersAreNonnullByDefault;

@SafeParcelable.Class
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzauz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzauz> CREATOR = new zzavc();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f5968b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public final String f5969c;

    public zzauz(ServerSideVerificationOptions serverSideVerificationOptions) {
        this(serverSideVerificationOptions.getUserId(), serverSideVerificationOptions.getCustomData());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.t(parcel, 1, this.f5968b, false);
        SafeParcelWriter.t(parcel, 2, this.f5969c, false);
        SafeParcelWriter.b(parcel, a2);
    }

    @SafeParcelable.Constructor
    public zzauz(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2) {
        this.f5968b = str;
        this.f5969c = str2;
    }
}
