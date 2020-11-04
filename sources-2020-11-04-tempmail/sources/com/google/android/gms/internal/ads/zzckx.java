package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzckx {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final zzclc f7357a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Executor f7358b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f7359c;

    public zzckx(zzclc zzclc, Executor executor) {
        this.f7357a = zzclc;
        this.f7359c = zzclc.a();
        this.f7358b = executor;
    }

    public final zzckw b() {
        zzckw zzckw = new zzckw(this);
        zzckw unused = zzckw.c();
        return zzckw;
    }
}
