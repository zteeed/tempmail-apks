package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
public class ActivityTransitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new zzg();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final List<ActivityTransitionEvent> f9841b;

    @SafeParcelable.Constructor
    public ActivityTransitionResult(@SafeParcelable.Param(id = 1) List<ActivityTransitionEvent> list) {
        Preconditions.l(list, "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i = 1; i < list.size(); i++) {
                Preconditions.a(list.get(i).v() >= list.get(i + -1).v());
            }
        }
        this.f9841b = Collections.unmodifiableList(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ActivityTransitionResult.class != obj.getClass()) {
            return false;
        }
        return this.f9841b.equals(((ActivityTransitionResult) obj).f9841b);
    }

    public int hashCode() {
        return this.f9841b.hashCode();
    }

    public List<ActivityTransitionEvent> u() {
        return this.f9841b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.x(parcel, 1, u(), false);
        SafeParcelWriter.b(parcel, a2);
    }
}
