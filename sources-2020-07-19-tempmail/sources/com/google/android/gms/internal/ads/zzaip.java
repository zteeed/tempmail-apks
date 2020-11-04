package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaip implements Parcelable.Creator<zzaim> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        String str = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 1) {
                str = SafeParcelReader.p(parcel, C);
            } else if (v != 2) {
                SafeParcelReader.K(parcel, C);
            } else {
                bundle = SafeParcelReader.f(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zzaim(str, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaim[i];
    }
}
