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
    private final List<zzbh> f10031b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final int f10032c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final String f10033d;

    public static final class Builder {
        public Builder() {
            new ArrayList();
        }
    }

    @SafeParcelable.Constructor
    GeofencingRequest(@SafeParcelable.Param(id = 1) List<zzbh> list, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) String str) {
        this.f10031b = list;
        this.f10032c = i;
        this.f10033d = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GeofencingRequest[");
        sb.append("geofences=");
        sb.append(this.f10031b);
        int i = this.f10032c;
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(", initialTrigger=");
        sb2.append(i);
        sb2.append(", ");
        sb.append(sb2.toString());
        String valueOf = String.valueOf(this.f10033d);
        sb.append(valueOf.length() != 0 ? "tag=".concat(valueOf) : new String("tag="));
        sb.append("]");
        return sb.toString();
    }

    public int u() {
        return this.f10032c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.x(parcel, 1, this.f10031b, false);
        SafeParcelWriter.l(parcel, 2, u());
        SafeParcelWriter.t(parcel, 3, this.f10033d, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
