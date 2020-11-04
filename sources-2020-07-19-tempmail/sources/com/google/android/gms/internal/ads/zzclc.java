package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzq;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzclc {

    /* renamed from: a  reason: collision with root package name */
    private final String f7183a = zzace.f5575b.a();

    /* renamed from: b  reason: collision with root package name */
    private final Executor f7184b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbbe f7185c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f7186d;

    /* renamed from: e  reason: collision with root package name */
    private final String f7187e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f7188f = new HashMap();
    private final boolean g;
    private final String h;

    public zzclc(Executor executor, zzbbe zzbbe, Context context, zzbbd zzbbd) {
        this.f7184b = executor;
        this.f7185c = zzbbe;
        this.f7186d = context;
        this.f7187e = context.getPackageName();
        this.g = ((double) zzwg.h().nextFloat()) <= zzace.f5574a.a().doubleValue();
        this.h = zzbbd.f6131b;
        this.f7188f.put("s", "gmob_sdk");
        this.f7188f.put("v", "3");
        this.f7188f.put("os", Build.VERSION.RELEASE);
        this.f7188f.put("api_v", Build.VERSION.SDK);
        Map<String, String> map = this.f7188f;
        zzq.zzkw();
        map.put("device", zzaye.r0());
        this.f7188f.put("app", this.f7187e);
        Map<String, String> map2 = this.f7188f;
        zzq.zzkw();
        map2.put("is_lite_sdk", zzaye.H(this.f7186d) ? "1" : "0");
        this.f7188f.put("e", TextUtils.join(",", zzaav.e()));
        this.f7188f.put("sdkVersion", this.h);
    }

    public final Map<String, String> a() {
        return new HashMap(this.f7188f);
    }

    public final ConcurrentHashMap<String, String> b() {
        return new ConcurrentHashMap<>(this.f7188f);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(String str) {
        this.f7185c.a(str);
    }

    /* access modifiers changed from: package-private */
    public final void d(Map<String, String> map) {
        Uri.Builder buildUpon = Uri.parse(this.f7183a).buildUpon();
        for (Map.Entry next : map.entrySet()) {
            buildUpon.appendQueryParameter((String) next.getKey(), (String) next.getValue());
        }
        String uri = buildUpon.build().toString();
        if (this.g) {
            this.f7184b.execute(new pk(this, uri));
        }
        zzaxv.m(uri);
    }
}
