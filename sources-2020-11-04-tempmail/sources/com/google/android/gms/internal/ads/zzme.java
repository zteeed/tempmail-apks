package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzme implements Parcelable {
    public static final Parcelable.Creator<zzme> CREATOR = new yc0();

    /* renamed from: b  reason: collision with root package name */
    private final zza[] f9049b;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public interface zza extends Parcelable {
    }

    public zzme(List<? extends zza> list) {
        zza[] zzaArr = new zza[list.size()];
        this.f9049b = zzaArr;
        list.toArray(zzaArr);
    }

    public final int a() {
        return this.f9049b.length;
    }

    public final zza b(int i) {
        return this.f9049b[i];
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzme.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f9049b, ((zzme) obj).f9049b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9049b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9049b.length);
        for (zza writeParcelable : this.f9049b) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    zzme(Parcel parcel) {
        this.f9049b = new zza[parcel.readInt()];
        int i = 0;
        while (true) {
            zza[] zzaArr = this.f9049b;
            if (i < zzaArr.length) {
                zzaArr[i] = (zza) parcel.readParcelable(zza.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }
}
