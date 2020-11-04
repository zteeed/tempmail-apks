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
    private final int f9834b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final int f9835c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final long f9836d;

    @SafeParcelable.Constructor
    public ActivityTransitionEvent(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) long j) {
        DetectedActivity.v(i);
        ActivityTransition.A(i2);
        this.f9834b = i;
        this.f9835c = i2;
        this.f9836d = j;
    }

    public int A() {
        return this.f9835c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        return this.f9834b == activityTransitionEvent.f9834b && this.f9835c == activityTransitionEvent.f9835c && this.f9836d == activityTransitionEvent.f9836d;
    }

    public int hashCode() {
        return Objects.b(Integer.valueOf(this.f9834b), Integer.valueOf(this.f9835c), Long.valueOf(this.f9836d));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f9834b;
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("ActivityType ");
        sb2.append(i);
        sb.append(sb2.toString());
        sb.append(" ");
        int i2 = this.f9835c;
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append("TransitionType ");
        sb3.append(i2);
        sb.append(sb3.toString());
        sb.append(" ");
        long j = this.f9836d;
        StringBuilder sb4 = new StringBuilder(41);
        sb4.append("ElapsedRealTimeNanos ");
        sb4.append(j);
        sb.append(sb4.toString());
        return sb.toString();
    }

    public int u() {
        return this.f9834b;
    }

    public long v() {
        return this.f9836d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, u());
        SafeParcelWriter.l(parcel, 2, A());
        SafeParcelWriter.o(parcel, 3, v());
        SafeParcelWriter.b(parcel, a2);
    }
}
