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
    private final int f6013b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final int f6014c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final int f6015d;

    @SafeParcelable.Constructor
    zzapl(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3) {
        this.f6013b = i;
        this.f6014c = i2;
        this.f6015d = i3;
    }

    public static zzapl u(VersionInfo versionInfo) {
        return new zzapl(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzapl)) {
            zzapl zzapl = (zzapl) obj;
            if (zzapl.f6015d == this.f6015d && zzapl.f6014c == this.f6014c && zzapl.f6013b == this.f6013b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f6013b, this.f6014c, this.f6015d});
    }

    public final String toString() {
        int i = this.f6013b;
        int i2 = this.f6014c;
        int i3 = this.f6015d;
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
        SafeParcelWriter.l(parcel, 1, this.f6013b);
        SafeParcelWriter.l(parcel, 2, this.f6014c);
        SafeParcelWriter.l(parcel, 3, this.f6015d);
        SafeParcelWriter.b(parcel, a2);
    }
}
