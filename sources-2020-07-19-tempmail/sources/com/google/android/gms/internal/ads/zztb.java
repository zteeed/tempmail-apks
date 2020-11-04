package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zztb implements Parcelable.Creator<zzsy> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int L = SafeParcelReader.L(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(C)) {
                case 2:
                    str = SafeParcelReader.p(parcel2, C);
                    break;
                case 3:
                    j = SafeParcelReader.G(parcel2, C);
                    break;
                case 4:
                    str2 = SafeParcelReader.p(parcel2, C);
                    break;
                case 5:
                    str3 = SafeParcelReader.p(parcel2, C);
                    break;
                case 6:
                    str4 = SafeParcelReader.p(parcel2, C);
                    break;
                case 7:
                    bundle = SafeParcelReader.f(parcel2, C);
                    break;
                case 8:
                    z = SafeParcelReader.w(parcel2, C);
                    break;
                case 9:
                    j2 = SafeParcelReader.G(parcel2, C);
                    break;
                default:
                    SafeParcelReader.K(parcel2, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel2, L);
        return new zzsy(str, j, str2, str3, str4, bundle, z, j2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzsy[i];
    }
}
