package com.google.android.gms.gcm;

import android.os.Parcel;
import android.os.Parcelable;

final class d implements Parcelable.Creator<OneoffTask> {
    d() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new OneoffTask(parcel, (d) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new OneoffTask[i];
    }
}
