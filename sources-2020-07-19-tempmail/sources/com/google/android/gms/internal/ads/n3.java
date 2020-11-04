package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class n3 extends zzarc {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ UpdateImpressionUrlsCallback f4444b;

    n3(zzarg zzarg, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.f4444b = updateImpressionUrlsCallback;
    }

    public final void k3(List<Uri> list) {
        this.f4444b.onSuccess(list);
    }

    public final void onError(String str) {
        this.f4444b.onFailure(str);
    }
}
