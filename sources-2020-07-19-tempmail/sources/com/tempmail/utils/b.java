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
import com.tempmail.n.l;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AdUtils */
public class b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f12563a = "b";

    /* compiled from: AdUtils */
    static class a extends RewardedAdLoadCallback {
        a() {
        }

        public void onRewardedAdFailedToLoad(int i) {
            String a2 = b.f12563a;
            m.b(a2, "onRewardedAdFailedToLoad " + i);
        }

        public void onRewardedAdLoaded() {
            m.b(b.f12563a, "onRewardedAdLoaded ");
        }
    }

    public static AdView b(Context context, List<AdSize> list) {
        AdView adView = new AdView(context);
        adView.setId(View.generateViewId());
        int size = list.size();
        AdSize[] adSizeArr = new AdSize[size];
        list.toArray(adSizeArr);
        for (int i = 0; i < size; i++) {
            AdSize adSize = adSizeArr[i];
            String str = f12563a;
            m.b(str, "createAdView adSize " + adSize.toString());
        }
        adView.setAdSize(list.get(0));
        adView.setAdUnitId(context.getString(R.string.ad_mob_banner_id));
        return adView;
    }

    public static InterstitialAd c(Context context) {
        InterstitialAd interstitialAd = new InterstitialAd(context);
        interstitialAd.setAdUnitId(context.getString(R.string.ad_mob_interstitial_id));
        interstitialAd.loadAd(new AdRequest.Builder().build());
        return interstitialAd;
    }

    public static AdSize d(Activity activity, int i) {
        float z = w.z(activity, (float) i);
        String str = f12563a;
        m.b(str, "widthDp " + z);
        if (z > 0.0f) {
            return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(activity, (int) z);
        }
        return AdSize.BANNER;
    }

    public static List<AdSize> e(Activity activity, int i) {
        String str = l.A0;
        m.b(str, " container width " + i);
        ArrayList arrayList = new ArrayList();
        arrayList.add(AdSize.MEDIUM_RECTANGLE);
        if (i > 0) {
            arrayList.add(d(activity, i));
        }
        return arrayList;
    }

    public static List<AdSize> f(Activity activity, int i, int i2) {
        String str = f12563a;
        m.b(str, " container width inbox " + i);
        ArrayList arrayList = new ArrayList();
        if (i2 / 2 > 250) {
            arrayList.add(AdSize.MEDIUM_RECTANGLE);
        }
        if (i > 0) {
            arrayList.add(d(activity, i));
        } else {
            arrayList.add(AdSize.BANNER);
        }
        return arrayList;
    }

    public static RewardedAd g(Context context, RewardedAd rewardedAd, RewardedAd rewardedAd2) {
        if (!(rewardedAd == null || rewardedAd2 == null)) {
            String str = f12563a;
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
        return ((ApplicationClass) context.getApplicationContext()).f();
    }

    public static boolean i(Context context) {
        f f2 = f.f();
        return e.O(context) && !f2.d(context.getString(R.string.remote_config_disable_all_ads)) && f2.d(context.getString(R.string.remote_config_banners_ironsource)) && !h(context);
    }

    public static boolean j(Context context) {
        return e.O(context) && !f.f().d(context.getString(R.string.remote_config_disable_all_ads)) && !h(context);
    }

    public static boolean k(Context context) {
        return e.O(context) && !f.f().d(context.getString(R.string.remote_config_disable_all_ads)) && !h(context);
    }

    public static void l(AdView adView) {
        AdRequest build = new AdRequest.Builder().build();
        String str = f12563a;
        m.b(str, "is test device " + build.isTestDevice(adView.getContext()));
        adView.loadAd(build);
    }

    public static RewardedAd m(Context context) {
        RewardedAd rewardedAd = new RewardedAd(context, context.getString(R.string.ad_mob_rewarded_id));
        rewardedAd.loadAd(new AdRequest.Builder().build(), (RewardedAdLoadCallback) new a());
        return rewardedAd;
    }

    public static void n(AdView adView) {
        m.b(f12563a, "removeBanner");
        if (adView != null) {
            adView.destroy();
            adView.setVisibility(8);
        }
    }

    public static void o(Context context, boolean z) {
        String str = f12563a;
        m.b(str, "setIsAdRemoved " + z);
        ((ApplicationClass) context.getApplicationContext()).h(z);
    }

    public static void p(InterstitialAd interstitialAd) {
        if (interstitialAd.isLoaded()) {
            interstitialAd.show();
        } else {
            m.b(f12563a, "The interstitial wasn't loaded yet.");
        }
    }

    public static void q(Context context, InterstitialAd interstitialAd) {
        f f2 = f.f();
        int t = s.t(context);
        int h = (int) f2.h(context.getString(R.string.remote_config_ir_interstitial_main_screen));
        String str = f12563a;
        m.b(str, "interstitialMainScreenRate= " + h + " countInterstitialMain =" + t);
        if (h != 0) {
            if (t % h == 0) {
                p(interstitialAd);
            }
            s.Z(context, t + 1);
        }
    }

    public static void r(Context context, InterstitialAd interstitialAd) {
        f f2 = f.f();
        int s = s.s(context);
        int h = (int) f2.h(context.getString(R.string.remote_config_ir_interstitial_inbox_refresh));
        String str = f12563a;
        m.b(str, "interstitialInboxRate= " + h + " countInterstitialInbox =" + s);
        if (h != 0) {
            if (s % h == 0) {
                p(interstitialAd);
            }
            s.Y(context, s + 1);
        }
    }
}
