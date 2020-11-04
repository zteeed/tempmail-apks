package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zzb implements Parcelable.Creator<ActivityRecognitionResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        long j = 0;
        long j2 = 0;
        ArrayList<DetectedActivity> arrayList = null;
        Bundle bundle = null;
        int i = 0;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 1) {
                arrayList = SafeParcelReader.t(parcel, C, DetectedActivity.CREATOR);
            } else if (v == 2) {
                j = SafeParcelReader.G(parcel, C);
            } else if (v == 3) {
                j2 = SafeParcelReader.G(parcel, C);
            } else if (v == 4) {
                i = SafeParcelReader.E(parcel, C);
            } else if (v != 5) {
                SafeParcelReader.K(parcel, C);
            } else {
                bundle = SafeParcelReader.f(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new ActivityRecognitionResult(arrayList, j, j2, i, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }
}
