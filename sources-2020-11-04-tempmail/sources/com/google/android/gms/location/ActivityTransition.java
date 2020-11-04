package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.Class
@SafeParcelable.Reserved
public class ActivityTransition extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransition> CREATOR = new zzc();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final int f10018b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final int f10019c;

    public static class Builder {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SupportedActivityTransition {
    }

    @SafeParcelable.Constructor
    ActivityTransition(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2) {
        this.f10018b = i;
        this.f10019c = i2;
    }

    public static void A(int i) {
        boolean z = true;
        if (i < 0 || i > 1) {
            z = false;
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("Transition type ");
        sb.append(i);
        sb.append(" is not valid.");
        Preconditions.b(z, sb.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        return this.f10018b == activityTransition.f10018b && this.f10019c == activityTransition.f10019c;
    }

    public int hashCode() {
        return Objects.b(Integer.valueOf(this.f10018b), Integer.valueOf(this.f10019c));
    }

    public String toString() {
        int i = this.f10018b;
        int i2 = this.f10019c;
        StringBuilder sb = new StringBuilder(75);
        sb.append("ActivityTransition [mActivityType=");
        sb.append(i);
        sb.append(", mTransitionType=");
        sb.append(i2);
        sb.append(']');
        return sb.toString();
    }

    public int u() {
        return this.f10018b;
    }

    public int v() {
        return this.f10019c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, u());
        SafeParcelWriter.l(parcel, 2, v());
        SafeParcelWriter.b(parcel, a2);
    }
}
