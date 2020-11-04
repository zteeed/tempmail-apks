package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new zzb();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private List<DetectedActivity> f10013b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private long f10014c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private long f10015d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private int f10016e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private Bundle f10017f;

    @SafeParcelable.Constructor
    public ActivityRecognitionResult(@SafeParcelable.Param(id = 1) List<DetectedActivity> list, @SafeParcelable.Param(id = 2) long j, @SafeParcelable.Param(id = 3) long j2, @SafeParcelable.Param(id = 4) int i, @SafeParcelable.Param(id = 5) Bundle bundle) {
        boolean z = true;
        Preconditions.b(list != null && list.size() > 0, "Must have at least 1 detected activity");
        Preconditions.b((j <= 0 || j2 <= 0) ? false : z, "Must set times");
        this.f10013b = list;
        this.f10014c = j;
        this.f10015d = j2;
        this.f10016e = i;
        this.f10017f = bundle;
    }

    private static boolean u(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return true;
        }
        if ((bundle == null && bundle2 != null) || ((bundle != null && bundle2 == null) || bundle.size() != bundle2.size())) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            if (bundle.get(str) == null) {
                if (bundle2.get(str) != null) {
                    return false;
                }
            } else if (bundle.get(str) instanceof Bundle) {
                if (!u(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else if (!bundle.get(str).equals(bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ActivityRecognitionResult.class == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            return this.f10014c == activityRecognitionResult.f10014c && this.f10015d == activityRecognitionResult.f10015d && this.f10016e == activityRecognitionResult.f10016e && Objects.a(this.f10013b, activityRecognitionResult.f10013b) && u(this.f10017f, activityRecognitionResult.f10017f);
        }
    }

    public int hashCode() {
        return Objects.b(Long.valueOf(this.f10014c), Long.valueOf(this.f10015d), Integer.valueOf(this.f10016e), this.f10013b, this.f10017f);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f10013b);
        long j = this.f10014c;
        long j2 = this.f10015d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 124);
        sb.append("ActivityRecognitionResult [probableActivities=");
        sb.append(valueOf);
        sb.append(", timeMillis=");
        sb.append(j);
        sb.append(", elapsedRealtimeMillis=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.x(parcel, 1, this.f10013b, false);
        SafeParcelWriter.o(parcel, 2, this.f10014c);
        SafeParcelWriter.o(parcel, 3, this.f10015d);
        SafeParcelWriter.l(parcel, 4, this.f10016e);
        SafeParcelWriter.e(parcel, 5, this.f10017f, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
