package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.mediation.VersionInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import javax.annotation.ParametersAreNonnullByDefault;

@SafeParcelable.Class
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzapl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzapl> CREATOR = new zzapk();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final int f5830b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final int f5831c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final int f5832d;

    @SafeParcelable.Constructor
    zzapl(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3) {
        this.f5830b = i;
        this.f5831c = i2;
        this.f5832d = i3;
    }

    public static zzapl u(VersionInfo versionInfo) {
        return new zzapl(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzapl)) {
            zzapl zzapl = (zzapl) obj;
            if (zzapl.f5832d == this.f5832d && zzapl.f5831c == this.f5831c && zzapl.f5830b == this.f5830b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f5830b, this.f5831c, this.f5832d});
    }

    public final String toString() {
        int i = this.f5830b;
        int i2 = this.f5831c;
        int i3 = this.f5832d;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f5830b);
        SafeParcelWriter.l(parcel, 2, this.f5831c);
        SafeParcelWriter.l(parcel, 3, this.f5832d);
        SafeParcelWriter.b(parcel, a2);
    }
}
