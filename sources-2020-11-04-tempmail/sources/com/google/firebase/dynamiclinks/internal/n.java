package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.firebase:firebase-dynamic-links@@19.1.0 */
public final class n implements Parcelable.Creator<zzo> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        Uri uri = null;
        Uri uri2 = null;
        ArrayList<zzr> arrayList = null;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 1) {
                uri = (Uri) SafeParcelReader.o(parcel, C, Uri.CREATOR);
            } else if (v == 2) {
                uri2 = (Uri) SafeParcelReader.o(parcel, C, Uri.CREATOR);
            } else if (v != 3) {
                SafeParcelReader.K(parcel, C);
            } else {
                arrayList = SafeParcelReader.t(parcel, C, zzr.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zzo(uri, uri2, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
