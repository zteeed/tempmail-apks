package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.zzq;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzaaz {

    /* renamed from: a  reason: collision with root package name */
    private String f5542a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f5543b;

    /* renamed from: c  reason: collision with root package name */
    private Context f5544c = null;

    /* renamed from: d  reason: collision with root package name */
    private String f5545d = null;

    public zzaaz(Context context, String str) {
        String str2;
        this.f5544c = context;
        this.f5545d = str;
        this.f5542a = zzace.f5575b.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f5543b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        this.f5543b.put("v", "3");
        this.f5543b.put("os", Build.VERSION.RELEASE);
        this.f5543b.put("api_v", Build.VERSION.SDK);
        Map<String, String> map = this.f5543b;
        zzq.zzkw();
        map.put("device", zzaye.r0());
        Map<String, String> map2 = this.f5543b;
        if (context.getApplicationContext() != null) {
            str2 = context.getApplicationContext().getPackageName();
        } else {
            str2 = context.getPackageName();
        }
        map2.put("app", str2);
        Map<String, String> map3 = this.f5543b;
        zzq.zzkw();
        map3.put("is_lite_sdk", zzaye.H(context) ? "1" : "0");
        Future<zzasr> b2 = zzq.zzlh().b(this.f5544c);
        try {
            this.f5543b.put("network_coarse", Integer.toString(b2.get().j));
            this.f5543b.put("network_fine", Integer.toString(b2.get().k));
        } catch (Exception e2) {
            zzq.zzla().e(e2, "CsiConfiguration.CsiConfiguration");
        }
    }

    /* access modifiers changed from: package-private */
    public final Context a() {
        return this.f5544c;
    }

    /* access modifiers changed from: package-private */
    public final String b() {
        return this.f5545d;
    }

    /* access modifiers changed from: package-private */
    public final String c() {
        return this.f5542a;
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> d() {
        return this.f5543b;
    }
}
