package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzyt;
import com.google.android.gms.internal.ads.zzzb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public class MobileAds {

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    public static final class Settings {
        private final zzzb zzadf = new zzzb();

        @Deprecated
        public final String getTrackingId() {
            return null;
        }

        @Deprecated
        public final boolean isGoogleAnalyticsEnabled() {
            return false;
        }

        @Deprecated
        public final Settings setGoogleAnalyticsEnabled(boolean z) {
            return this;
        }

        @Deprecated
        public final Settings setTrackingId(String str) {
            return this;
        }
    }

    private MobileAds() {
    }

    public static void disableMediationAdapterInitialization(Context context) {
        zzyt.s().a(context);
    }

    public static InitializationStatus getInitializationStatus() {
        return zzyt.s().b();
    }

    public static RequestConfiguration getRequestConfiguration() {
        return zzyt.s().c();
    }

    public static RewardedVideoAd getRewardedVideoAdInstance(Context context) {
        return zzyt.s().d(context);
    }

    public static String getVersionString() {
        return zzyt.s().e();
    }

    @Deprecated
    public static void initialize(Context context, String str) {
        initialize(context, str, (Settings) null);
    }

    public static void openDebugMenu(Context context, String str) {
        zzyt.s().f(context, str);
    }

    @KeepForSdk
    public static void registerRtbAdapter(Class<? extends RtbAdapter> cls) {
        zzyt.s().g(cls);
    }

    public static void setAppMuted(boolean z) {
        zzyt.s().h(z);
    }

    public static void setAppVolume(float f2) {
        zzyt.s().i(f2);
    }

    public static void setRequestConfiguration(RequestConfiguration requestConfiguration) {
        zzyt.s().j(requestConfiguration);
    }

    @Deprecated
    public static void initialize(Context context, String str, Settings settings) {
        zzyt.s().l(context, str, (OnInitializationCompleteListener) null);
    }

    public static void initialize(Context context) {
        initialize(context, (String) null, (Settings) null);
    }

    public static void initialize(Context context, OnInitializationCompleteListener onInitializationCompleteListener) {
        zzyt.s().l(context, (String) null, onInitializationCompleteListener);
    }
}
