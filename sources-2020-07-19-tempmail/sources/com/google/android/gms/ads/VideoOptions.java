package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzaaa;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class VideoOptions {
    private final boolean zzado;
    private final boolean zzadp;
    private final boolean zzadq;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    public static final class Builder {
        /* access modifiers changed from: private */
        public boolean zzado = true;
        /* access modifiers changed from: private */
        public boolean zzadp = false;
        /* access modifiers changed from: private */
        public boolean zzadq = false;

        public final VideoOptions build() {
            return new VideoOptions(this);
        }

        public final Builder setClickToExpandRequested(boolean z) {
            this.zzadq = z;
            return this;
        }

        public final Builder setCustomControlsRequested(boolean z) {
            this.zzadp = z;
            return this;
        }

        public final Builder setStartMuted(boolean z) {
            this.zzado = z;
            return this;
        }
    }

    public VideoOptions(zzaaa zzaaa) {
        this.zzado = zzaaa.f5513b;
        this.zzadp = zzaaa.f5514c;
        this.zzadq = zzaaa.f5515d;
    }

    public final boolean getClickToExpandRequested() {
        return this.zzadq;
    }

    public final boolean getCustomControlsRequested() {
        return this.zzadp;
    }

    public final boolean getStartMuted() {
        return this.zzado;
    }

    private VideoOptions(Builder builder) {
        this.zzado = builder.zzado;
        this.zzadp = builder.zzadp;
        this.zzadq = builder.zzadq;
    }
}
