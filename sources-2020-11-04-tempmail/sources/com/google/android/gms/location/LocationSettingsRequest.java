package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new zzag();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final List<LocationRequest> f10048b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final boolean f10049c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final boolean f10050d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private zzae f10051e;

    public static final class Builder {
        public Builder() {
            new ArrayList();
        }
    }

    @SafeParcelable.Constructor
    LocationSettingsRequest(@SafeParcelable.Param(id = 1) List<LocationRequest> list, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2, @SafeParcelable.Param(id = 5) zzae zzae) {
        this.f10048b = list;
        this.f10049c = z;
        this.f10050d = z2;
        this.f10051e = zzae;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.x(parcel, 1, Collections.unmodifiableList(this.f10048b), false);
        SafeParcelWriter.c(parcel, 2, this.f10049c);
        SafeParcelWriter.c(parcel, 3, this.f10050d);
        SafeParcelWriter.r(parcel, 5, this.f10051e, i, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
