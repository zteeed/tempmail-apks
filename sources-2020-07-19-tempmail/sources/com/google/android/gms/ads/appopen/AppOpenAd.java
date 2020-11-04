package com.google.android.gms.ads.appopen;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzsl;
import com.google.android.gms.internal.ads.zzsp;
import com.google.android.gms.internal.ads.zzww;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class AppOpenAd {
    public static final int APP_OPEN_AD_ORIENTATION_LANDSCAPE = 2;
    public static final int APP_OPEN_AD_ORIENTATION_PORTRAIT = 1;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    public static abstract class AppOpenAdLoadCallback {
        public void onAppOpenAdFailedToLoad(int i) {
        }

        public void onAppOpenAdLoaded(AppOpenAd appOpenAd) {
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    public @interface AppOpenAdOrientation {
    }

    public static void load(Context context, String str, AdRequest adRequest, @AppOpenAdOrientation int i, AppOpenAdLoadCallback appOpenAdLoadCallback) {
        Preconditions.l(context, "Context cannot be null.");
        Preconditions.l(str, "adUnitId cannot be null.");
        Preconditions.l(adRequest, "AdRequest cannot be null.");
        new zzsp(context, str, adRequest.zzdq(), i, appOpenAdLoadCallback).a();
    }

    /* access modifiers changed from: protected */
    public abstract void zza(zzsl zzsl);

    /* access modifiers changed from: protected */
    public abstract zzww zzdv();

    public static void load(Context context, String str, PublisherAdRequest publisherAdRequest, @AppOpenAdOrientation int i, AppOpenAdLoadCallback appOpenAdLoadCallback) {
        Preconditions.l(context, "Context cannot be null.");
        Preconditions.l(str, "adUnitId cannot be null.");
        Preconditions.l(publisherAdRequest, "PublisherAdRequest cannot be null.");
        new zzsp(context, str, publisherAdRequest.zzdq(), i, appOpenAdLoadCallback).a();
    }
}
