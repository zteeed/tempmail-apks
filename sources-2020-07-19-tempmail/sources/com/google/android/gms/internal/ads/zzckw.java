package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzckw {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f7172a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzckx f7173b;

    @VisibleForTesting
    zzckw(zzckx zzckx) {
        this.f7173b = zzckx;
    }

    /* access modifiers changed from: private */
    public final zzckw c() {
        this.f7172a.putAll(this.f7173b.f7176c);
        return this;
    }

    public final zzckw b(zzdkm zzdkm) {
        this.f7172a.put("gqi", zzdkm.f8138b);
        return this;
    }

    public final void d() {
        this.f7173b.f7175b.execute(new nk(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e() {
        this.f7173b.f7174a.d(this.f7172a);
    }

    public final zzckw f(zzdkk zzdkk) {
        this.f7172a.put("aai", zzdkk.t);
        return this;
    }

    public final zzckw g(String str, String str2) {
        this.f7172a.put(str, str2);
        return this;
    }
}
