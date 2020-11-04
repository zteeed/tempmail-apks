package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsConnectorReceiver;

@KeepForSdk
@SafeParcelable.Class
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new zzb();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final String f2660b;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    private final int f2661c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final long f2662d;

    @SafeParcelable.Constructor
    public Feature(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) long j) {
        this.f2660b = str;
        this.f2661c = i;
        this.f2662d = j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((u() == null || !u().equals(feature.u())) && (u() != null || feature.u() != null)) || v() != feature.v()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.b(u(), Long.valueOf(v()));
    }

    public String toString() {
        Objects.ToStringHelper c2 = Objects.c(this);
        c2.a(AnalyticsConnectorReceiver.EVENT_NAME_KEY, u());
        c2.a("version", Long.valueOf(v()));
        return c2.toString();
    }

    @KeepForSdk
    public String u() {
        return this.f2660b;
    }

    @KeepForSdk
    public long v() {
        long j = this.f2662d;
        return j == -1 ? (long) this.f2661c : j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.t(parcel, 1, u(), false);
        SafeParcelWriter.l(parcel, 2, this.f2661c);
        SafeParcelWriter.o(parcel, 3, v());
        SafeParcelWriter.b(parcel, a2);
    }
}
