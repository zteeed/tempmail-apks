package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzafm;
import com.google.android.gms.internal.ads.zzafn;
import com.google.android.gms.internal.ads.zzvl;
import com.google.android.gms.internal.ads.zzxd;
import com.google.android.gms.internal.ads.zzxe;
import com.google.android.gms.internal.ads.zzzy;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzc();
    @SafeParcelable.Field
    private final boolean zzbnr;
    @SafeParcelable.Field
    private final zzxe zzbns;
    private AppEventListener zzbnt;
    @SafeParcelable.Field
    private final IBinder zzbnu;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    public static final class Builder {
        /* access modifiers changed from: private */
        public boolean zzbnr = false;
        /* access modifiers changed from: private */
        public AppEventListener zzbnt;
        /* access modifiers changed from: private */
        public ShouldDelayBannerRenderingListener zzbnv;

        public final PublisherAdViewOptions build() {
            return new PublisherAdViewOptions(this);
        }

        public final Builder setAppEventListener(AppEventListener appEventListener) {
            this.zzbnt = appEventListener;
            return this;
        }

        public final Builder setManualImpressionsEnabled(boolean z) {
            this.zzbnr = z;
            return this;
        }

        @KeepForSdk
        public final Builder setShouldDelayBannerRenderingListener(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            this.zzbnv = shouldDelayBannerRenderingListener;
            return this;
        }
    }

    private PublisherAdViewOptions(Builder builder) {
        this.zzbnr = builder.zzbnr;
        AppEventListener zzb = builder.zzbnt;
        this.zzbnt = zzb;
        zzzy zzzy = null;
        this.zzbns = zzb != null ? new zzvl(this.zzbnt) : null;
        this.zzbnu = builder.zzbnv != null ? new zzzy(builder.zzbnv) : zzzy;
    }

    public final AppEventListener getAppEventListener() {
        return this.zzbnt;
    }

    public final boolean getManualImpressionsEnabled() {
        return this.zzbnr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.c(parcel, 1, getManualImpressionsEnabled());
        zzxe zzxe = this.zzbns;
        SafeParcelWriter.k(parcel, 2, zzxe == null ? null : zzxe.asBinder(), false);
        SafeParcelWriter.k(parcel, 3, this.zzbnu, false);
        SafeParcelWriter.b(parcel, a2);
    }

    public final zzxe zzju() {
        return this.zzbns;
    }

    public final zzafn zzjv() {
        return zzafm.e7(this.zzbnu);
    }

    @SafeParcelable.Constructor
    PublisherAdViewOptions(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) IBinder iBinder2) {
        this.zzbnr = z;
        this.zzbns = iBinder != null ? zzxd.e7(iBinder) : null;
        this.zzbnu = iBinder2;
    }
}
