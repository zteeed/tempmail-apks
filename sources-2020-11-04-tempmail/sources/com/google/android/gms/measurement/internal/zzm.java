package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzm implements Parcelable.Creator<zzn> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int L = SafeParcelReader.L(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        long j6 = -2147483648L;
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(C)) {
                case 2:
                    str = SafeParcelReader.p(parcel2, C);
                    break;
                case 3:
                    str2 = SafeParcelReader.p(parcel2, C);
                    break;
                case 4:
                    str3 = SafeParcelReader.p(parcel2, C);
                    break;
                case 5:
                    str4 = SafeParcelReader.p(parcel2, C);
                    break;
                case 6:
                    j = SafeParcelReader.G(parcel2, C);
                    break;
                case 7:
                    j2 = SafeParcelReader.G(parcel2, C);
                    break;
                case 8:
                    str5 = SafeParcelReader.p(parcel2, C);
                    break;
                case 9:
                    z = SafeParcelReader.w(parcel2, C);
                    break;
                case 10:
                    z2 = SafeParcelReader.w(parcel2, C);
                    break;
                case 11:
                    j6 = SafeParcelReader.G(parcel2, C);
                    break;
                case 12:
                    str6 = SafeParcelReader.p(parcel2, C);
                    break;
                case 13:
                    j3 = SafeParcelReader.G(parcel2, C);
                    break;
                case 14:
                    j4 = SafeParcelReader.G(parcel2, C);
                    break;
                case 15:
                    i = SafeParcelReader.E(parcel2, C);
                    break;
                case 16:
                    z3 = SafeParcelReader.w(parcel2, C);
                    break;
                case 17:
                    z4 = SafeParcelReader.w(parcel2, C);
                    break;
                case 18:
                    z5 = SafeParcelReader.w(parcel2, C);
                    break;
                case 19:
                    str7 = SafeParcelReader.p(parcel2, C);
                    break;
                case 21:
                    bool = SafeParcelReader.x(parcel2, C);
                    break;
                case 22:
                    j5 = SafeParcelReader.G(parcel2, C);
                    break;
                case 23:
                    arrayList = SafeParcelReader.r(parcel2, C);
                    break;
                case 24:
                    str8 = SafeParcelReader.p(parcel2, C);
                    break;
                default:
                    SafeParcelReader.K(parcel2, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel2, L);
        return new zzn(str, str2, str3, str4, j, j2, str5, z, z2, j6, str6, j3, j4, i, z3, z4, z5, str7, bool, j5, (List<String>) arrayList, str8);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzn[i];
    }
}
