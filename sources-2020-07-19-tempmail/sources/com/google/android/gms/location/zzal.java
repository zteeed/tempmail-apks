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
    private final List<String> f9884b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final PendingIntent f9885c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final String f9886d;

    @SafeParcelable.Constructor
    zzal(@SafeParcelable.Param(id = 1) List<String> list, @SafeParcelable.Param(id = 2) PendingIntent pendingIntent, @SafeParcelable.Param(id = 3) String str) {
        this.f9884b = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f9885c = pendingIntent;
        this.f9886d = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.v(parcel, 1, this.f9884b, false);
        SafeParcelWriter.r(parcel, 2, this.f9885c, i, false);
        SafeParcelWriter.t(parcel, 3, this.f9886d, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
