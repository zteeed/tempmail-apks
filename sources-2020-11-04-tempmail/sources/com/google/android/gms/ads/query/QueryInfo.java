package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzare;
import com.google.android.gms.internal.ads.zzyq;
import com.google.android.gms.internal.ads.zzzd;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public class QueryInfo {
    private final zzzd zzhhe;

    public QueryInfo(zzzd zzzd) {
        this.zzhhe = zzzd;
    }

    @KeepForSdk
    public static void generate(Context context, AdFormat adFormat, AdRequest adRequest, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzyq zzyq;
        if (adRequest == null) {
            zzyq = null;
        } else {
            zzyq = adRequest.zzdq();
        }
        new zzare(context, adFormat, zzyq).a(queryInfoGenerationCallback);
    }

    @KeepForSdk
    public String getQuery() {
        return this.zzhhe.a();
    }

    @KeepForSdk
    public Bundle getQueryBundle() {
        return this.zzhhe.b();
    }

    @KeepForSdk
    public String getRequestId() {
        return zzzd.c(this);
    }
}
