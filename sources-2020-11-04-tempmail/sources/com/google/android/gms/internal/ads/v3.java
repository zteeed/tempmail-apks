package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class v3 implements Callable<zzasr> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f5278b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzast f5279c;

    v3(zzast zzast, Context context) {
        this.f5279c = zzast;
        this.f5278b = context;
    }

    public final /* synthetic */ Object call() throws Exception {
        zzasr zzasr;
        u3 u3Var = (u3) this.f5279c.f6110a.get(this.f5278b);
        if (u3Var != null) {
            if (!(u3Var.f5214a + zzacd.f5756a.a().longValue() < zzq.zzld().a())) {
                zzasr = new zzasu(this.f5278b, u3Var.f5215b).d();
                this.f5279c.f6110a.put(this.f5278b, new u3(this.f5279c, zzasr));
                return zzasr;
            }
        }
        zzasr = new zzasu(this.f5278b).d();
        this.f5279c.f6110a.put(this.f5278b, new u3(this.f5279c, zzasr));
        return zzasr;
    }
}
