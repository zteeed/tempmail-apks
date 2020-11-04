package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaaa> CREATOR = new zzaad();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5513b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5514c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5515d;

    public zzaaa(VideoOptions videoOptions) {
        this(videoOptions.getStartMuted(), videoOptions.getCustomControlsRequested(), videoOptions.getClickToExpandRequested());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.c(parcel, 2, this.f5513b);
        SafeParcelWriter.c(parcel, 3, this.f5514c);
        SafeParcelWriter.c(parcel, 4, this.f5515d);
        SafeParcelWriter.b(parcel, a2);
    }

    @SafeParcelable.Constructor
    public zzaaa(@SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2, @SafeParcelable.Param(id = 4) boolean z3) {
        this.f5513b = z;
        this.f5514c = z2;
        this.f5515d = z3;
    }
}
