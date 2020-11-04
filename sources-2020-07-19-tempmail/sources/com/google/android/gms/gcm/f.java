package com.google.android.gms.gcm;

import android.os.Parcel;
import android.os.Parcelable;

final class f implements Parcelable.Creator<PeriodicTask> {
    f() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PeriodicTask(parcel, (f) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PeriodicTask[i];
    }
}
