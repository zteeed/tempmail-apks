package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzasa implements Parcelable.Creator<zzarx> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        boolean z = false;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 2) {
                z = SafeParcelReader.w(parcel, C);
            } else if (v != 3) {
                SafeParcelReader.K(parcel, C);
            } else {
                arrayList = SafeParcelReader.r(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zzarx(z, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzarx[i];
    }
}
