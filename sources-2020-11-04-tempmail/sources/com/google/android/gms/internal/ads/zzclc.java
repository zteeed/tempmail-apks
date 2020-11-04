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
    private final String f7366a = zzace.f5758b.a();

    /* renamed from: b  reason: collision with root package name */
    private final Executor f7367b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbbe f7368c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f7369d;

    /* renamed from: e  reason: collision with root package name */
    private final String f7370e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f7371f = new HashMap();
    private final boolean g;
    private final String h;

    public zzclc(Executor executor, zzbbe zzbbe, Context context, zzbbd zzbbd) {
        this.f7367b = executor;
        this.f7368c = zzbbe;
        this.f7369d = context;
        this.f7370e = context.getPackageName();
        this.g = ((double) zzwg.h().nextFloat()) <= zzace.f5757a.a().doubleValue();
        this.h = zzbbd.f6314b;
        this.f7371f.put("s", "gmob_sdk");
        this.f7371f.put("v", "3");
        this.f7371f.put("os", Build.VERSION.RELEASE);
        this.f7371f.put("api_v", Build.VERSION.SDK);
        Map<String, String> map = this.f7371f;
        zzq.zzkw();
        map.put("device", zzaye.r0());
        this.f7371f.put("app", this.f7370e);
        Map<String, String> map2 = this.f7371f;
        zzq.zzkw();
        map2.put("is_lite_sdk", zzaye.H(this.f7369d) ? "1" : "0");
        this.f7371f.put("e", TextUtils.join(",", zzaav.e()));
        this.f7371f.put("sdkVersion", this.h);
    }

    public final Map<String, String> a() {
        return new HashMap(this.f7371f);
    }

    public final ConcurrentHashMap<String, String> b() {
        return new ConcurrentHashMap<>(this.f7371f);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(String str) {
        this.f7368c.a(str);
    }

    /* access modifiers changed from: package-private */
    public final void d(Map<String, String> map) {
        Uri.Builder buildUpon = Uri.parse(this.f7366a).buildUpon();
        for (Map.Entry next : map.entrySet()) {
            buildUpon.appendQueryParameter((String) next.getKey(), (String) next.getValue());
        }
        String uri = buildUpon.build().toString();
        if (this.g) {
            this.f7367b.execute(new pk(this, uri));
        }
        zzaxv.m(uri);
    }
}
