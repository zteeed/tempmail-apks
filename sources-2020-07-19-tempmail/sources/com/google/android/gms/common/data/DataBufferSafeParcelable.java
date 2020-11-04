package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
public class DataBufferSafeParcelable<T extends SafeParcelable> extends AbstractDataBuffer<T> {

    /* renamed from: c  reason: collision with root package name */
    private final Parcelable.Creator<T> f2933c;

    @KeepForSdk
    /* renamed from: c */
    public T get(int i) {
        DataHolder dataHolder = this.f2922b;
        byte[] u = dataHolder.u("data", i, dataHolder.G(i));
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(u, 0, u.length);
        obtain.setDataPosition(0);
        T t = (SafeParcelable) this.f2933c.createFromParcel(obtain);
        obtain.recycle();
        return t;
    }
}
