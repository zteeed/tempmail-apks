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
    private final int f8508b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private zzcf.zza f8509c = null;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f8510d;

    @SafeParcelable.Constructor
    zzdqv(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) byte[] bArr) {
        this.f8508b = i;
        this.f8510d = bArr;
        v();
    }

    private final void v() {
        if (this.f8509c == null && this.f8510d != null) {
            return;
        }
        if (this.f8509c != null && this.f8510d == null) {
            return;
        }
        if (this.f8509c != null && this.f8510d != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (this.f8509c == null && this.f8510d == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    public final zzcf.zza u() {
        if (!(this.f8509c != null)) {
            try {
                this.f8509c = zzcf.zza.G(this.f8510d, zzefo.c());
                this.f8510d = null;
            } catch (zzegl e2) {
                throw new IllegalStateException(e2);
            }
        }
        v();
        return this.f8509c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f8508b);
        byte[] bArr = this.f8510d;
        if (bArr == null) {
            bArr = this.f8509c.g();
        }
        SafeParcelWriter.f(parcel, 2, bArr, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
