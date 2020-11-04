package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class o3 extends zzarc {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ UpdateClickUrlCallback f4704b;

    o3(zzarg zzarg, UpdateClickUrlCallback updateClickUrlCallback) {
        this.f4704b = updateClickUrlCallback;
    }

    public final void A3(List<Uri> list) {
        this.f4704b.onSuccess(list.get(0));
    }

    public final void onError(String str) {
        this.f4704b.onFailure(str);
    }
}
