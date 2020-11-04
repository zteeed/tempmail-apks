package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
public final class zzah implements Parcelable.Creator<zzae> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int L = SafeParcelReader.L(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(C)) {
                case 1:
                    j = SafeParcelReader.G(parcel2, C);
                    break;
                case 2:
                    j2 = SafeParcelReader.G(parcel2, C);
                    break;
                case 3:
                    z = SafeParcelReader.w(parcel2, C);
                    break;
                case 4:
                    str = SafeParcelReader.p(parcel2, C);
                    break;
                case 5:
                    str2 = SafeParcelReader.p(parcel2, C);
                    break;
                case 6:
                    str3 = SafeParcelReader.p(parcel2, C);
                    break;
                case 7:
                    bundle = SafeParcelReader.f(parcel2, C);
                    break;
                default:
                    SafeParcelReader.K(parcel2, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel2, L);
        return new zzae(j, j2, z, str, str2, str3, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzae[i];
    }
}
