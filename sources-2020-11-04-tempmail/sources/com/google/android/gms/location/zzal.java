package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = new zzam();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f10070b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final PendingIntent f10071c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final String f10072d;

    @SafeParcelable.Constructor
    zzal(@SafeParcelable.Param(id = 1) List<String> list, @SafeParcelable.Param(id = 2) PendingIntent pendingIntent, @SafeParcelable.Param(id = 3) String str) {
        this.f10070b = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f10071c = pendingIntent;
        this.f10072d = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.v(parcel, 1, this.f10070b, false);
        SafeParcelWriter.r(parcel, 2, this.f10071c, i, false);
        SafeParcelWriter.t(parcel, 3, this.f10072d, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
