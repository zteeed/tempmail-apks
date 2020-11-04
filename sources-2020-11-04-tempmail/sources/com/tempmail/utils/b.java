package com.tempmail.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.firebase.remoteconfig.f;
import com.tempmail.ApplicationClass;
import com.tempmail.R;

/* compiled from: AdUtils */
public class b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f13106a = "b";

    /* compiled from: AdUtils */
    static class a extends RewardedAdLoadCallback {
        a() {
        }

        public void onRewardedAdFailedToLoad(int i) {
            String a2 = b.f13106a;
            m.b(a2, "onRewardedAdFailedToLoad " + i);
        }

        public void onRewardedAdLoaded() {
            m.b(b.f13106a, "onRewardedAdLoaded ");
        }
    }

    public static AdView b(Context context, AdSize adSize) {
        AdView adView = new AdView(context);
        adView.setId(View.generateViewId());
        adView.setAdSize(adSize);
        adView.setAdUnitId(context.getString(R.string.ad_mob_banner_id));
        String str = f13106a;
        m.b(str, "createAdView adSize " + adSize.toString());
        return adView;
    }

    public static InterstitialAd c(Context context) {
        InterstitialAd interstitialAd = new InterstitialAd(context);
        interstitialAd.setAdUnitId(context.getString(R.string.ad_mob_interstitial_id));
        interstitialAd.loadAd(new AdRequest.Builder().build());
        return interstitialAd;
    }

    public static AdSize d(Activity activity, int i) {
        float B = x.B(activity, (float) i);
        String str = f13106a;
        m.b(str, "widthDp " + B);
        if (B > 0.0f) {
            return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(activity, (int) B);
        }
        return AdSize.BANNER;
    }

    public static AdSize e(Activity activity, int i) {
        String str = f13106a;
        m.b(str, " container width Anchor " + i);
        if (i > 0) {
            return d(activity, i);
        }
        return AdSize.BANNER;
    }

    public static AdSize f(Activity activity, int i, int i2) {
        String str = f13106a;
        m.b(str, " container width inbox " + i);
        if (i2 / 2 > 250) {
            return AdSize.MEDIUM_RECTANGLE;
        }
        return e(activity, i);
    }

    public static RewardedAd g(Context context, RewardedAd rewardedAd, RewardedAd rewardedAd2) {
        if (!(rewardedAd == null || rewardedAd2 == null)) {
            String str = f13106a;
            m.b(str, "isAvailable first " + rewardedAd.isLoaded() + " ,isAvailable second " + rewardedAd2.isLoaded());
        }
        RewardedAd rewardedAd3 = null;
        if (rewardedAd != null && rewardedAd.isLoaded()) {
            rewardedAd3 = rewardedAd;
        } else if (rewardedAd2 != null && rewardedAd2.isLoaded()) {
            rewardedAd3 = rewardedAd2;
        }
        if (rewardedAd == null || !rewardedAd.isLoaded()) {
            return (rewardedAd2 == null || !rewardedAd2.isLoaded()) ? rewardedAd3 : rewardedAd2;
        }
        return rewardedAd;
    }

    public static boolean h(Context context) {
        return ((ApplicationClass) context.getApplicationContext()).g();
    }

    public static boolean i(Context context) {
        if (context == null) {
            return false;
        }
        f f2 = f.f();
        boolean d2 = f2.d(context.getString(R.string.remote_config_disable_all_ads));
        boolean d3 = f2.d(context.getString(R.string.remote_config_banners_ironsource));
        if (!e.P(context) || d2 || !d3 || h(context)) {
            return false;
        }
        return true;
    }

    public static boolean j(Context context) {
        return e.P(context) && !f.f().d(context.getString(R.string.remote_config_disable_all_ads)) && !h(context);
    }

    public static boolean k(Context context) {
        return e.P(context) && !f.f().d(context.getString(R.string.remote_config_disable_all_ads)) && !h(context);
    }

    public static void l(AdView adView) {
        AdRequest build = new AdRequest.Builder().build();
        String str = f13106a;
        m.b(str, "is test device " + build.isTestDevice(adView.getContext()));
        adView.loadAd(build);
    }

    public static RewardedAd m(Context context) {
        RewardedAd rewardedAd = new RewardedAd(context, context.getString(R.string.ad_mob_rewarded_id));
        rewardedAd.loadAd(new AdRequest.Builder().build(), (RewardedAdLoadCallback) new a());
        return rewardedAd;
    }

    public static void n(AdView adView) {
        m.b(f13106a, "removeBanner");
        if (adView != null) {
            adView.destroy();
            adView.setVisibility(8);
        }
    }

    public static void o(Context context, boolean z) {
        String str = f13106a;
        m.b(str, "setIsAdRemoved " + z);
        ((ApplicationClass) context.getApplicationContext()).i(z);
    }

    public static void p(InterstitialAd interstitialAd) {
        if (interstitialAd == null || !interstitialAd.isLoaded()) {
            m.b(f13106a, "The interstitial wasn't loaded yet.");
        } else {
            interstitialAd.show();
        }
    }

    public static void q(Context context, InterstitialAd interstitialAd) {
        f f2 = f.f();
        int u = s.u(context);
        int h = (int) f2.h(context.getString(R.string.remote_config_ir_interstitial_main_screen));
        String str = f13106a;
        m.b(str, "interstitialMainScreenRate= " + h + " countInterstitialMain =" + u);
        if (h != 0) {
            if (u % h == 0) {
                p(interstitialAd);
            }
            s.b0(context, u + 1);
        }
    }

    public static void r(Context context, InterstitialAd interstitialAd) {
        f f2 = f.f();
        int t = s.t(context);
        int h = (int) f2.h(context.getString(R.string.remote_config_ir_interstitial_inbox_refresh));
        String str = f13106a;
        m.b(str, "interstitialInboxRate= " + h + " countInterstitialInbox =" + t);
        if (h != 0) {
            if (t % h == 0) {
                p(interstitialAd);
            }
            s.a0(context, t + 1);
        }
    }
}
