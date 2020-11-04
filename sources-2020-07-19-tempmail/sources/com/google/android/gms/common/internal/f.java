package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

final class f implements Parcelable.Creator<BinderWrapper> {
    f() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BinderWrapper(parcel, (f) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BinderWrapper[i];
    }
}
