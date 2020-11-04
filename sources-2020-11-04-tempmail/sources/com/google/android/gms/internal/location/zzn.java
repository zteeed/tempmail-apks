package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.zzj;
import java.util.List;

public final class zzn implements Parcelable.Creator<zzm> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        zzj zzj = zzm.f9532f;
        List<ClientIdentity> list = zzm.f9531e;
        String str = null;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 1) {
                zzj = (zzj) SafeParcelReader.o(parcel, C, zzj.CREATOR);
            } else if (v == 2) {
                list = SafeParcelReader.t(parcel, C, ClientIdentity.CREATOR);
            } else if (v != 3) {
                SafeParcelReader.K(parcel, C);
            } else {
                str = SafeParcelReader.p(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zzm(zzj, list, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzm[i];
    }
}
