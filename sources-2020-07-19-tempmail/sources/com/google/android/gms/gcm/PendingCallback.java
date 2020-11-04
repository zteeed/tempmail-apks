package com.google.android.gms.gcm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;

@ShowFirstParty
@VisibleForTesting
public class PendingCallback implements Parcelable, ReflectedParcelable {
    public static final Parcelable.Creator<PendingCallback> CREATOR = new e();

    /* renamed from: b  reason: collision with root package name */
    final IBinder f3230b;

    public PendingCallback(Parcel parcel) {
        this.f3230b = parcel.readStrongBinder();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f3230b);
    }
}
