package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzj implements Parcelable.Creator<zzg> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f2 = 0.0f;
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(C)) {
                case 2:
                    z = SafeParcelReader.w(parcel, C);
                    break;
                case 3:
                    z2 = SafeParcelReader.w(parcel, C);
                    break;
                case 4:
                    str = SafeParcelReader.p(parcel, C);
                    break;
                case 5:
                    z3 = SafeParcelReader.w(parcel, C);
                    break;
                case 6:
                    f2 = SafeParcelReader.A(parcel, C);
                    break;
                case 7:
                    i = SafeParcelReader.E(parcel, C);
                    break;
                case 8:
                    z4 = SafeParcelReader.w(parcel, C);
                    break;
                case 9:
                    z5 = SafeParcelReader.w(parcel, C);
                    break;
                case 10:
                    z6 = SafeParcelReader.w(parcel, C);
                    break;
                default:
                    SafeParcelReader.K(parcel, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zzg(z, z2, str, z3, f2, i, z4, z5, z6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzg[i];
    }
}
