package com.google.android.gms.ads.formats;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaav;
import com.google.android.gms.internal.ads.zzade;
import com.google.android.gms.internal.ads.zzadg;
import com.google.android.gms.internal.ads.zzado;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzwg;
import com.google.android.gms.internal.ads.zzzc;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class UnifiedNativeAdView extends FrameLayout {
    private final FrameLayout zzbnm;
    private final zzadx zzbnn = zzjt();

    public UnifiedNativeAdView(Context context) {
        super(context);
        this.zzbnm = zzd(context);
    }

    private final void zza(String str, View view) {
        try {
            this.zzbnn.x2(str, ObjectWrapper.h0(view));
        } catch (RemoteException e2) {
            zzbba.c("Unable to call setAssetView on delegate", e2);
        }
    }

    private final View zzbm(String str) {
        try {
            IObjectWrapper E3 = this.zzbnn.E3(str);
            if (E3 != null) {
                return (View) ObjectWrapper.V(E3);
            }
            return null;
        } catch (RemoteException e2) {
            zzbba.c("Unable to call getAssetView on delegate", e2);
            return null;
        }
    }

    private final FrameLayout zzd(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private final zzadx zzjt() {
        Preconditions.l(this.zzbnm, "createDelegate must be called after overlayFrame has been created");
        if (isInEditMode()) {
            return null;
        }
        return zzwg.b().a(this.zzbnm.getContext(), this, this.zzbnm);
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.zzbnm);
    }

    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.zzbnm;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public final void destroy() {
        try {
            this.zzbnn.destroy();
        } catch (RemoteException e2) {
            zzbba.c("Unable to destroy native ad view", e2);
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zzadx zzadx;
        if (((Boolean) zzwg.e().c(zzaav.p1)).booleanValue() && (zzadx = this.zzbnn) != null) {
            try {
                zzadx.B0(ObjectWrapper.h0(motionEvent));
            } catch (RemoteException e2) {
                zzbba.c("Unable to call handleTouchEvent on delegate", e2);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final AdChoicesView getAdChoicesView() {
        View zzbm = zzbm(UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW);
        if (zzbm instanceof AdChoicesView) {
            return (AdChoicesView) zzbm;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return zzbm(UnifiedNativeAdAssetNames.ASSET_ADVERTISER);
    }

    public final View getBodyView() {
        return zzbm(UnifiedNativeAdAssetNames.ASSET_BODY);
    }

    public final View getCallToActionView() {
        return zzbm(UnifiedNativeAdAssetNames.ASSET_CALL_TO_ACTION);
    }

    public final View getHeadlineView() {
        return zzbm(UnifiedNativeAdAssetNames.ASSET_HEADLINE);
    }

    public final View getIconView() {
        return zzbm(UnifiedNativeAdAssetNames.ASSET_ICON);
    }

    public final View getImageView() {
        return zzbm(UnifiedNativeAdAssetNames.ASSET_IMAGE);
    }

    public final MediaView getMediaView() {
        View zzbm = zzbm(UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO);
        if (zzbm instanceof MediaView) {
            return (MediaView) zzbm;
        }
        if (zzbm == null) {
            return null;
        }
        zzbba.f("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return zzbm(UnifiedNativeAdAssetNames.ASSET_PRICE);
    }

    public final View getStarRatingView() {
        return zzbm(UnifiedNativeAdAssetNames.ASSET_STAR_RATING);
    }

    public final View getStoreView() {
        return zzbm(UnifiedNativeAdAssetNames.ASSET_STORE);
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        zzadx zzadx = this.zzbnn;
        if (zzadx != null) {
            try {
                zzadx.z0(ObjectWrapper.h0(view), i);
            } catch (RemoteException e2) {
                zzbba.c("Unable to call onVisibilityChanged on delegate", e2);
            }
        }
    }

    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.zzbnm);
    }

    public final void removeView(View view) {
        if (this.zzbnm != view) {
            super.removeView(view);
        }
    }

    public final void setAdChoicesView(AdChoicesView adChoicesView) {
        zza(UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW, adChoicesView);
    }

    public final void setAdvertiserView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_ADVERTISER, view);
    }

    public final void setBodyView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_BODY, view);
    }

    public final void setCallToActionView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_CALL_TO_ACTION, view);
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.zzbnn.M(ObjectWrapper.h0(view));
        } catch (RemoteException e2) {
            zzbba.c("Unable to call setClickConfirmingView on delegate", e2);
        }
    }

    public final void setHeadlineView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_HEADLINE, view);
    }

    public final void setIconView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_ICON, view);
    }

    public final void setImageView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_IMAGE, view);
    }

    public final void setMediaView(MediaView mediaView) {
        zza(UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO, mediaView);
        if (mediaView != null) {
            mediaView.zza((zzade) new zze(this));
            mediaView.zza((zzadg) new zzd(this));
        }
    }

    public final void setNativeAd(UnifiedNativeAd unifiedNativeAd) {
        try {
            this.zzbnn.C((IObjectWrapper) unifiedNativeAd.zzjr());
        } catch (RemoteException e2) {
            zzbba.c("Unable to call setNativeAd on delegate", e2);
        }
    }

    public final void setPriceView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_PRICE, view);
    }

    public final void setStarRatingView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_STAR_RATING, view);
    }

    public final void setStoreView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_STORE, view);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(ImageView.ScaleType scaleType) {
        if (scaleType != null) {
            try {
                this.zzbnn.n3(ObjectWrapper.h0(scaleType));
            } catch (RemoteException e2) {
                zzbba.c("Unable to call setMediaViewImageScaleType on delegate", e2);
            }
        }
    }

    public UnifiedNativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzbnm = zzd(context);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(MediaContent mediaContent) {
        try {
            if (mediaContent instanceof zzzc) {
                this.zzbnn.L6(((zzzc) mediaContent).a());
            } else if (mediaContent == null) {
                this.zzbnn.L6((zzado) null);
            } else {
                zzbba.f("Use MediaContent provided by UnifiedNativeAd.getMediaContent");
            }
        } catch (RemoteException e2) {
            zzbba.c("Unable to call setMediaContent on delegate", e2);
        }
    }

    public UnifiedNativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzbnm = zzd(context);
    }

    @TargetApi(21)
    public UnifiedNativeAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.zzbnm = zzd(context);
    }
}
