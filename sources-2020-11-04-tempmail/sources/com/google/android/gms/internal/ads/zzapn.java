package com.google.android.gms.internal.ads;

import a.c.b.a;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.common.util.PlatformVersion;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzapn implements MediationInterstitialAdapter {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Activity f6016a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public MediationInterstitialListener f6017b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f6018c;

    public final void onDestroy() {
        zzbba.f("Destroying AdMobCustomTabsAdapter adapter.");
    }

    public final void onPause() {
        zzbba.f("Pausing AdMobCustomTabsAdapter adapter.");
    }

    public final void onResume() {
        zzbba.f("Resuming AdMobCustomTabsAdapter adapter.");
    }

    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f6017b = mediationInterstitialListener;
        if (mediationInterstitialListener == null) {
            zzbba.i("Listener not set for mediation. Returning.");
        } else if (!(context instanceof Activity)) {
            zzbba.i("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f6017b.onAdFailedToLoad(this, 0);
        } else {
            if (!(PlatformVersion.b() && zzabs.a(context))) {
                zzbba.i("Default browser does not support custom tabs. Bailing out.");
                this.f6017b.onAdFailedToLoad(this, 0);
                return;
            }
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                zzbba.i("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.f6017b.onAdFailedToLoad(this, 0);
                return;
            }
            this.f6016a = (Activity) context;
            this.f6018c = Uri.parse(string);
            this.f6017b.onAdLoaded(this);
        }
    }

    public final void showInterstitial() {
        a a2 = new a.C0004a().a();
        a2.f97a.setData(this.f6018c);
        zzaye.h.post(new e3(this, new AdOverlayInfoParcel(new zzd(a2.f97a), (zzuu) null, new d3(this), (zzt) null, new zzbbd(0, 0, false))));
        zzq.zzla().n();
    }
}
