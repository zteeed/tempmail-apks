package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class n3 extends zzarc {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ UpdateImpressionUrlsCallback f4627b;

    n3(zzarg zzarg, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.f4627b = updateImpressionUrlsCallback;
    }

    public final void A3(List<Uri> list) {
        this.f4627b.onSuccess(list);
    }

    public final void onError(String str) {
        this.f4627b.onFailure(str);
    }
}
