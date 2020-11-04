package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzckw {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f7355a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzckx f7356b;

    @VisibleForTesting
    zzckw(zzckx zzckx) {
        this.f7356b = zzckx;
    }

    /* access modifiers changed from: private */
    public final zzckw c() {
        this.f7355a.putAll(this.f7356b.f7359c);
        return this;
    }

    public final zzckw b(zzdkm zzdkm) {
        this.f7355a.put("gqi", zzdkm.f8321b);
        return this;
    }

    public final void d() {
        this.f7356b.f7358b.execute(new nk(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e() {
        this.f7356b.f7357a.d(this.f7355a);
    }

    public final zzckw f(zzdkk zzdkk) {
        this.f7355a.put("aai", zzdkk.t);
        return this;
    }

    public final zzckw g(String str, String str2) {
        this.f7355a.put(str, str2);
        return this;
    }
}
