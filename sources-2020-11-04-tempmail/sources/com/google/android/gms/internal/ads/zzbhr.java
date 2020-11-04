package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbhr {

    /* renamed from: a  reason: collision with root package name */
    public final String f6435a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f6436b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f6437c;

    @TargetApi(21)
    public zzbhr(WebResourceRequest webResourceRequest) {
        this(webResourceRequest.getUrl().toString(), webResourceRequest.getUrl(), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders());
    }

    public zzbhr(String str) {
        this(str, Uri.parse(str), (String) null, (Map<String, String>) null);
    }

    private zzbhr(String str, Uri uri, String str2, Map<String, String> map) {
        this.f6435a = str;
        this.f6436b = uri;
        this.f6437c = map == null ? Collections.emptyMap() : map;
    }
}
