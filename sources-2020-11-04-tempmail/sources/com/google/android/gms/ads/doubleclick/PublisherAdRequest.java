package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzyp;
import com.google.android.gms.internal.ads.zzyq;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.List;
import java.util.Set;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class PublisherAdRequest {
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;
    @Deprecated
    public static final String MAX_AD_CONTENT_RATING_G = "G";
    @Deprecated
    public static final String MAX_AD_CONTENT_RATING_MA = "MA";
    @Deprecated
    public static final String MAX_AD_CONTENT_RATING_PG = "PG";
    @Deprecated
    public static final String MAX_AD_CONTENT_RATING_T = "T";
    @Deprecated
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;
    @Deprecated
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;
    @Deprecated
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;
    private final zzyq zzacs;

    @VisibleForTesting
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    public static final class Builder {
        /* access modifiers changed from: private */
        public final zzyp zzact = new zzyp();

        public final Builder addCategoryExclusion(String str) {
            this.zzact.s(str);
            return this;
        }

        public final Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
            this.zzact.j(cls, bundle);
            return this;
        }

        public final Builder addCustomTargeting(String str, String str2) {
            this.zzact.y(str, str2);
            return this;
        }

        public final Builder addKeyword(String str) {
            this.zzact.m(str);
            return this;
        }

        public final Builder addNetworkExtras(NetworkExtras networkExtras) {
            this.zzact.d(networkExtras);
            return this;
        }

        public final Builder addNetworkExtrasBundle(Class<? extends MediationExtrasReceiver> cls, Bundle bundle) {
            this.zzact.f(cls, bundle);
            return this;
        }

        @Deprecated
        public final Builder addTestDevice(String str) {
            this.zzact.n(str);
            return this;
        }

        public final PublisherAdRequest build() {
            return new PublisherAdRequest(this);
        }

        @KeepForSdk
        public final Builder setAdInfo(AdInfo adInfo) {
            this.zzact.e(adInfo);
            return this;
        }

        @Deprecated
        public final Builder setBirthday(Date date) {
            this.zzact.g(date);
            return this;
        }

        public final Builder setContentUrl(String str) {
            Preconditions.l(str, "Content URL must be non-null.");
            Preconditions.h(str, "Content URL must be non-empty.");
            Preconditions.c(str.length() <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", Integer.valueOf(AdRequest.MAX_CONTENT_URL_LENGTH), Integer.valueOf(str.length()));
            this.zzact.p(str);
            return this;
        }

        @Deprecated
        public final Builder setGender(int i) {
            this.zzact.u(i);
            return this;
        }

        @Deprecated
        public final Builder setIsDesignedForFamilies(boolean z) {
            this.zzact.h(z);
            return this;
        }

        public final Builder setLocation(Location location) {
            this.zzact.c(location);
            return this;
        }

        @Deprecated
        public final Builder setManualImpressionsEnabled(boolean z) {
            this.zzact.a(z);
            return this;
        }

        @Deprecated
        public final Builder setMaxAdContentRating(String str) {
            this.zzact.t(str);
            return this;
        }

        public final Builder setPublisherProvidedId(String str) {
            this.zzact.q(str);
            return this;
        }

        public final Builder setRequestAgent(String str) {
            this.zzact.r(str);
            return this;
        }

        @Deprecated
        public final Builder setTagForUnderAgeOfConsent(int i) {
            this.zzact.v(i);
            return this;
        }

        @Deprecated
        public final Builder tagForChildDirectedTreatment(boolean z) {
            this.zzact.N(z);
            return this;
        }

        public final Builder addCustomTargeting(String str, List<String> list) {
            if (list != null) {
                this.zzact.y(str, TextUtils.join(",", list));
            }
            return this;
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    public @interface MaxAdContentRating {
    }

    @Deprecated
    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    public @interface TagForUnderAgeOfConsent {
    }

    private PublisherAdRequest(Builder builder) {
        this.zzacs = new zzyq(builder.zzact);
    }

    @KeepForSdk
    @Deprecated
    public static void updateCorrelator() {
    }

    @Deprecated
    public final Date getBirthday() {
        return this.zzacs.a();
    }

    public final String getContentUrl() {
        return this.zzacs.b();
    }

    public final <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.zzacs.c(cls);
    }

    public final Bundle getCustomTargeting() {
        return this.zzacs.d();
    }

    @Deprecated
    public final int getGender() {
        return this.zzacs.e();
    }

    public final Set<String> getKeywords() {
        return this.zzacs.f();
    }

    public final Location getLocation() {
        return this.zzacs.g();
    }

    public final boolean getManualImpressionsEnabled() {
        return this.zzacs.h();
    }

    @Deprecated
    public final <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return this.zzacs.j(cls);
    }

    public final <T extends MediationExtrasReceiver> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.zzacs.k(cls);
    }

    public final String getPublisherProvidedId() {
        return this.zzacs.l();
    }

    public final boolean isTestDevice(Context context) {
        return this.zzacs.n(context);
    }

    public final zzyq zzdq() {
        return this.zzacs;
    }
}
