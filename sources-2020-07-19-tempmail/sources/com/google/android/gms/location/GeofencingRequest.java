package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.location.zzbh;
import java.util.ArrayList;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new zzq();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final List<zzbh> f9845b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final int f9846c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final String f9847d;

    public static final class Builder {
        public Builder() {
            new ArrayList();
        }
    }

    @SafeParcelable.Constructor
    GeofencingRequest(@SafeParcelable.Param(id = 1) List<zzbh> list, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) String str) {
        this.f9845b = list;
        this.f9846c = i;
        this.f9847d = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GeofencingRequest[");
        sb.append("geofences=");
        sb.append(this.f9845b);
        int i = this.f9846c;
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(", initialTrigger=");
        sb2.append(i);
        sb2.append(", ");
        sb.append(sb2.toString());
        String valueOf = String.valueOf(this.f9847d);
        sb.append(valueOf.length() != 0 ? "tag=".concat(valueOf) : new String("tag="));
        sb.append("]");
        return sb.toString();
    }

    public int u() {
        return this.f9846c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.x(parcel, 1, this.f9845b, false);
        SafeParcelWriter.l(parcel, 2, u());
        SafeParcelWriter.t(parcel, 3, this.f9847d, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
