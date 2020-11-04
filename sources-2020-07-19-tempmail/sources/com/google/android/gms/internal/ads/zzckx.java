package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzckx {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final zzclc f7174a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Executor f7175b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f7176c;

    public zzckx(zzclc zzclc, Executor executor) {
        this.f7174a = zzclc;
        this.f7176c = zzclc.a();
        this.f7175b = executor;
    }

    public final zzckw b() {
        zzckw zzckw = new zzckw(this);
        zzckw unused = zzckw.c();
        return zzckw;
    }
}
