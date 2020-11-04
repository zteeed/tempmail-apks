package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class m3 extends zzawp {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ QueryInfoGenerationCallback f4525b;

    m3(zzare zzare, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        this.f4525b = queryInfoGenerationCallback;
    }

    public final void T(String str, String str2, Bundle bundle) {
        QueryInfo queryInfo = new QueryInfo(new zzzd(str, bundle));
        zzwg.i().put(queryInfo, str2);
        this.f4525b.onSuccess(queryInfo);
    }

    public final void U6(String str, String str2) {
        QueryInfo queryInfo = new QueryInfo(new zzzd(str, (Bundle) null));
        zzwg.i().put(queryInfo, str2);
        this.f4525b.onSuccess(queryInfo);
    }

    public final void onError(String str) {
        this.f4525b.onFailure(str);
    }
}
