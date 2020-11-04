package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.Nullable;

@SafeParcelable.Class
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new zzl();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final String f3329b;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private final c f3330c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final boolean f3331d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private final boolean f3332e;

    @SafeParcelable.Constructor
    zzk(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) @Nullable IBinder iBinder, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) boolean z2) {
        this.f3329b = str;
        this.f3330c = u(iBinder);
        this.f3331d = z;
        this.f3332e = z2;
    }

    @Nullable
    private static c u(@Nullable IBinder iBinder) {
        byte[] bArr;
        if (iBinder == null) {
            return null;
        }
        try {
            IObjectWrapper b2 = zzj.H(iBinder).b();
            if (b2 == null) {
                bArr = null;
            } else {
                bArr = (byte[]) ObjectWrapper.V(b2);
            }
            if (bArr != null) {
                return new d(bArr);
            }
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
            return null;
        } catch (RemoteException e2) {
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e2);
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.t(parcel, 1, this.f3329b, false);
        c cVar = this.f3330c;
        if (cVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            cVar = null;
        } else {
            cVar.asBinder();
        }
        SafeParcelWriter.k(parcel, 2, cVar, false);
        SafeParcelWriter.c(parcel, 3, this.f3331d);
        SafeParcelWriter.c(parcel, 4, this.f3332e);
        SafeParcelWriter.b(parcel, a2);
    }

    zzk(String str, @Nullable c cVar, boolean z, boolean z2) {
        this.f3329b = str;
        this.f3330c = cVar;
        this.f3331d = z;
        this.f3332e = z2;
    }
}
