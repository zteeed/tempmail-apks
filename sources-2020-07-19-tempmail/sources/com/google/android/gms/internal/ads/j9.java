package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class j9 implements zzduu<Map<String, String>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ List f4115a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f4116b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzbfq f4117c;

    j9(zzbfq zzbfq, List list, String str) {
        this.f4117c = zzbfq;
        this.f4115a = list;
        this.f4116b = str;
    }

    public final void a(Throwable th) {
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        this.f4117c.y((Map) obj, this.f4115a, this.f4116b);
    }
}
