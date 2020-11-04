package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzavp implements Parcelable.Creator<zzavq> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(C)) {
                case 2:
                    str = SafeParcelReader.p(parcel, C);
                    break;
                case 3:
                    str2 = SafeParcelReader.p(parcel, C);
                    break;
                case 4:
                    z = SafeParcelReader.w(parcel, C);
                    break;
                case 5:
                    z2 = SafeParcelReader.w(parcel, C);
                    break;
                case 6:
                    arrayList = SafeParcelReader.r(parcel, C);
                    break;
                case 7:
                    z3 = SafeParcelReader.w(parcel, C);
                    break;
                case 8:
                    z4 = SafeParcelReader.w(parcel, C);
                    break;
                case 9:
                    arrayList2 = SafeParcelReader.r(parcel, C);
                    break;
                default:
                    SafeParcelReader.K(parcel, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zzavq(str, str2, z, z2, arrayList, z3, z4, arrayList2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzavq[i];
    }
}
