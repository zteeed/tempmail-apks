package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@SafeParcelable.Class
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzark extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzark> CREATOR = new zzarj();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final View f6069b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, WeakReference<View>> f6070c;

    @SafeParcelable.Constructor
    public zzark(@SafeParcelable.Param(id = 1) IBinder iBinder, @SafeParcelable.Param(id = 2) IBinder iBinder2) {
        this.f6069b = (View) ObjectWrapper.V(IObjectWrapper.Stub.H(iBinder));
        this.f6070c = (Map) ObjectWrapper.V(IObjectWrapper.Stub.H(iBinder2));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, ObjectWrapper.h0(this.f6069b).asBinder(), false);
        SafeParcelWriter.k(parcel, 2, ObjectWrapper.h0(this.f6070c).asBinder(), false);
        SafeParcelWriter.b(parcel, a2);
    }
}
