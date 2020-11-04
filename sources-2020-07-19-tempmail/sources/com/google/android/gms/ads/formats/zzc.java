package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzc implements Parcelable.Creator<PublisherAdViewOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        boolean z = false;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 1) {
                z = SafeParcelReader.w(parcel, C);
            } else if (v == 2) {
                iBinder = SafeParcelReader.D(parcel, C);
            } else if (v != 3) {
                SafeParcelReader.K(parcel, C);
            } else {
                iBinder2 = SafeParcelReader.D(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new PublisherAdViewOptions(z, iBinder, iBinder2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PublisherAdViewOptions[i];
    }
}
