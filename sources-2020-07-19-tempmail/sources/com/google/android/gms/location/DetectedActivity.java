package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public class DetectedActivity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DetectedActivity> CREATOR = new zzi();

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f9842d = {0, 1, 2, 3, 7, 8, 16, 17};
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private int f9843b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private int f9844c;

    @SafeParcelable.Constructor
    public DetectedActivity(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2) {
        this.f9843b = i;
        this.f9844c = i2;
    }

    public static void v(int i) {
        boolean z = false;
        for (int i2 : f9842d) {
            if (i2 == i) {
                z = true;
            }
        }
        if (!z) {
            StringBuilder sb = new StringBuilder(81);
            sb.append(i);
            sb.append(" is not a valid DetectedActivity supported by Activity Transition API.");
            Log.w("DetectedActivity", sb.toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DetectedActivity.class == obj.getClass()) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            return this.f9843b == detectedActivity.f9843b && this.f9844c == detectedActivity.f9844c;
        }
    }

    public int hashCode() {
        return Objects.b(Integer.valueOf(this.f9843b), Integer.valueOf(this.f9844c));
    }

    public String toString() {
        String str;
        int u = u();
        if (u == 0) {
            str = "IN_VEHICLE";
        } else if (u == 1) {
            str = "ON_BICYCLE";
        } else if (u == 2) {
            str = "ON_FOOT";
        } else if (u == 3) {
            str = "STILL";
        } else if (u == 4) {
            str = "UNKNOWN";
        } else if (u == 5) {
            str = "TILTING";
        } else if (u == 7) {
            str = "WALKING";
        } else if (u != 8) {
            switch (u) {
                case 16:
                    str = "IN_ROAD_VEHICLE";
                    break;
                case 17:
                    str = "IN_RAIL_VEHICLE";
                    break;
                case 18:
                    str = "IN_TWO_WHEELER_VEHICLE";
                    break;
                case 19:
                    str = "IN_FOUR_WHEELER_VEHICLE";
                    break;
                default:
                    str = Integer.toString(u);
                    break;
            }
        } else {
            str = "RUNNING";
        }
        int i = this.f9844c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48);
        sb.append("DetectedActivity [type=");
        sb.append(str);
        sb.append(", confidence=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    public int u() {
        int i = this.f9843b;
        if (i > 19 || i < 0) {
            return 4;
        }
        return i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f9843b);
        SafeParcelWriter.l(parcel, 2, this.f9844c);
        SafeParcelWriter.b(parcel, a2);
    }
}
