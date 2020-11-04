package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzcf;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public final class zzdqv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdqv> CREATOR = new zzdqy();
    @SafeParcelable.VersionField

    /* renamed from: b  reason: collision with root package name */
    private final int f8325b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private zzcf.zza f8326c = null;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f8327d;

    @SafeParcelable.Constructor
    zzdqv(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) byte[] bArr) {
        this.f8325b = i;
        this.f8327d = bArr;
        v();
    }

    private final void v() {
        if (this.f8326c == null && this.f8327d != null) {
            return;
        }
        if (this.f8326c != null && this.f8327d == null) {
            return;
        }
        if (this.f8326c != null && this.f8327d != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (this.f8326c == null && this.f8327d == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    public final zzcf.zza u() {
        if (!(this.f8326c != null)) {
            try {
                this.f8326c = zzcf.zza.G(this.f8327d, zzefo.c());
                this.f8327d = null;
            } catch (zzegl e2) {
                throw new IllegalStateException(e2);
            }
        }
        v();
        return this.f8326c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f8325b);
        byte[] bArr = this.f8327d;
        if (bArr == null) {
            bArr = this.f8326c.g();
        }
        SafeParcelWriter.f(parcel, 2, bArr, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
