package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzadj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzadj> CREATOR = new zzadi();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final int f5634b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5635c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final int f5636d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5637e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public final int f5638f;
    @SafeParcelable.Field
    public final zzaaa g;
    @SafeParcelable.Field
    public final boolean h;
    @SafeParcelable.Field
    public final int i;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzadj(NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzaaa(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zzjs(), nativeAdOptions.getMediaAspectRatio());
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f5634b);
        SafeParcelWriter.c(parcel, 2, this.f5635c);
        SafeParcelWriter.l(parcel, 3, this.f5636d);
        SafeParcelWriter.c(parcel, 4, this.f5637e);
        SafeParcelWriter.l(parcel, 5, this.f5638f);
        SafeParcelWriter.r(parcel, 6, this.g, i2, false);
        SafeParcelWriter.c(parcel, 7, this.h);
        SafeParcelWriter.l(parcel, 8, this.i);
        SafeParcelWriter.b(parcel, a2);
    }

    @SafeParcelable.Constructor
    public zzadj(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) boolean z2, @SafeParcelable.Param(id = 5) int i4, @SafeParcelable.Param(id = 6) zzaaa zzaaa, @SafeParcelable.Param(id = 7) boolean z3, @SafeParcelable.Param(id = 8) int i5) {
        this.f5634b = i2;
        this.f5635c = z;
        this.f5636d = i3;
        this.f5637e = z2;
        this.f5638f = i4;
        this.g = zzaaa;
        this.h = z3;
        this.i = i5;
    }
}
