package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzaht implements Parcelable.Creator<zzahq> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int L = SafeParcelReader.L(parcel);
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        long j = 0;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(C)) {
                case 1:
                    z = SafeParcelReader.w(parcel2, C);
                    break;
                case 2:
                    str = SafeParcelReader.p(parcel2, C);
                    break;
                case 3:
                    i = SafeParcelReader.E(parcel2, C);
                    break;
                case 4:
                    bArr = SafeParcelReader.g(parcel2, C);
                    break;
                case 5:
                    strArr = SafeParcelReader.q(parcel2, C);
                    break;
                case 6:
                    strArr2 = SafeParcelReader.q(parcel2, C);
                    break;
                case 7:
                    z2 = SafeParcelReader.w(parcel2, C);
                    break;
                case 8:
                    j = SafeParcelReader.G(parcel2, C);
                    break;
                default:
                    SafeParcelReader.K(parcel2, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel2, L);
        return new zzahq(z, str, i, bArr, strArr, strArr2, z2, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzahq[i];
    }
}
