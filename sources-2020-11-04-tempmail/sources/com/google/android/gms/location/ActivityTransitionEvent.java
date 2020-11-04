package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public class ActivityTransitionEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = new zzd();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final int f10020b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final int f10021c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final long f10022d;

    @SafeParcelable.Constructor
    public ActivityTransitionEvent(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) long j) {
        DetectedActivity.v(i);
        ActivityTransition.A(i2);
        this.f10020b = i;
        this.f10021c = i2;
        this.f10022d = j;
    }

    public int A() {
        return this.f10021c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        return this.f10020b == activityTransitionEvent.f10020b && this.f10021c == activityTransitionEvent.f10021c && this.f10022d == activityTransitionEvent.f10022d;
    }

    public int hashCode() {
        return Objects.b(Integer.valueOf(this.f10020b), Integer.valueOf(this.f10021c), Long.valueOf(this.f10022d));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f10020b;
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("ActivityType ");
        sb2.append(i);
        sb.append(sb2.toString());
        sb.append(" ");
        int i2 = this.f10021c;
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append("TransitionType ");
        sb3.append(i2);
        sb.append(sb3.toString());
        sb.append(" ");
        long j = this.f10022d;
        StringBuilder sb4 = new StringBuilder(41);
        sb4.append("ElapsedRealTimeNanos ");
        sb4.append(j);
        sb.append(sb4.toString());
        return sb.toString();
    }

    public int u() {
        return this.f10020b;
    }

    public long v() {
        return this.f10022d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, u());
        SafeParcelWriter.l(parcel, 2, A());
        SafeParcelWriter.o(parcel, 3, v());
        SafeParcelWriter.b(parcel, a2);
    }
}
