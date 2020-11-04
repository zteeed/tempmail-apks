package com.google.android.gms.ads.query;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzarg;
import com.google.android.gms.internal.ads.zzarh;
import java.util.List;
import java.util.Map;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class ReportingInfo {
    private final zzarg zzhhf;

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    public static final class Builder {
        /* access modifiers changed from: private */
        public final zzarh zzhhg;

        @KeepForSdk
        public Builder(View view) {
            zzarh zzarh = new zzarh();
            this.zzhhg = zzarh;
            zzarh.d(view);
        }

        @KeepForSdk
        public final ReportingInfo build() {
            return new ReportingInfo(this);
        }

        @KeepForSdk
        public final Builder setAssetViews(Map<String, View> map) {
            this.zzhhg.c(map);
            return this;
        }
    }

    private ReportingInfo(Builder builder) {
        this.zzhhf = new zzarg(builder.zzhhg);
    }

    @KeepForSdk
    public final void reportTouchEvent(MotionEvent motionEvent) {
        this.zzhhf.a(motionEvent);
    }

    @KeepForSdk
    public final void updateClickUrl(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zzhhf.b(uri, updateClickUrlCallback);
    }

    @KeepForSdk
    public final void updateImpressionUrls(List<Uri> list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zzhhf.c(list, updateImpressionUrlsCallback);
    }
}
