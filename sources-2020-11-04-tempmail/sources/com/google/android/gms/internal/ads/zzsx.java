package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.InputStream;
import javax.annotation.concurrent.GuardedBy;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzsx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsx> CREATOR = new zzsw();
    @GuardedBy("this")
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private ParcelFileDescriptor f9281b;

    public zzsx() {
        this((ParcelFileDescriptor) null);
    }

    private final synchronized ParcelFileDescriptor A() {
        return this.f9281b;
    }

    public final synchronized boolean u() {
        return this.f9281b != null;
    }

    public final synchronized InputStream v() {
        if (this.f9281b == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f9281b);
        this.f9281b = null;
        return autoCloseInputStream;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.r(parcel, 2, A(), i, false);
        SafeParcelWriter.b(parcel, a2);
    }

    @SafeParcelable.Constructor
    public zzsx(@SafeParcelable.Param(id = 2) ParcelFileDescriptor parcelFileDescriptor) {
        this.f9281b = parcelFileDescriptor;
    }
}
