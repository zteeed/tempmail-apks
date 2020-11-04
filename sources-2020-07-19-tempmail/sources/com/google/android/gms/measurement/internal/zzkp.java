package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzkp implements Parcelable.Creator<zzkq> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int L = SafeParcelReader.L(parcel);
        String str = null;
        Long l = null;
        Float f2 = null;
        String str2 = null;
        String str3 = null;
        Double d2 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(C)) {
                case 1:
                    i = SafeParcelReader.E(parcel2, C);
                    break;
                case 2:
                    str = SafeParcelReader.p(parcel2, C);
                    break;
                case 3:
                    j = SafeParcelReader.G(parcel2, C);
                    break;
                case 4:
                    l = SafeParcelReader.H(parcel2, C);
                    break;
                case 5:
                    f2 = SafeParcelReader.B(parcel2, C);
                    break;
                case 6:
                    str2 = SafeParcelReader.p(parcel2, C);
                    break;
                case 7:
                    str3 = SafeParcelReader.p(parcel2, C);
                    break;
                case 8:
                    d2 = SafeParcelReader.z(parcel2, C);
                    break;
                default:
                    SafeParcelReader.K(parcel2, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel2, L);
        return new zzkq(i, str, j, l, f2, str2, str3, d2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzkq[i];
    }
}
