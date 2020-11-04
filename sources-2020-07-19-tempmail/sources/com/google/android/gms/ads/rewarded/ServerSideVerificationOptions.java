package com.google.android.gms.ads.rewarded;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public class ServerSideVerificationOptions {
    private final String zzdur;
    private final String zzdus;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    public static final class Builder {
        /* access modifiers changed from: private */
        public String zzdur = "";
        /* access modifiers changed from: private */
        public String zzdus = "";

        public final ServerSideVerificationOptions build() {
            return new ServerSideVerificationOptions(this);
        }

        public final Builder setCustomData(String str) {
            this.zzdus = str;
            return this;
        }

        public final Builder setUserId(String str) {
            this.zzdur = str;
            return this;
        }
    }

    private ServerSideVerificationOptions(Builder builder) {
        this.zzdur = builder.zzdur;
        this.zzdus = builder.zzdus;
    }

    public String getCustomData() {
        return this.zzdus;
    }

    public String getUserId() {
        return this.zzdur;
    }
}
