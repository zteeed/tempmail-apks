package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
@KeepForSdk
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new f();

    /* renamed from: b  reason: collision with root package name */
    private IBinder f3163b;

    public BinderWrapper() {
        this.f3163b = null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f3163b);
    }

    private BinderWrapper(Parcel parcel) {
        this.f3163b = null;
        this.f3163b = parcel.readStrongBinder();
    }

    /* synthetic */ BinderWrapper(Parcel parcel, f fVar) {
        this(parcel);
    }
}
