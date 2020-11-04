package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class v3 implements Callable<zzasr> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f5095b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzast f5096c;

    v3(zzast zzast, Context context) {
        this.f5096c = zzast;
        this.f5095b = context;
    }

    public final /* synthetic */ Object call() throws Exception {
        zzasr zzasr;
        u3 u3Var = (u3) this.f5096c.f5927a.get(this.f5095b);
        if (u3Var != null) {
            if (!(u3Var.f5031a + zzacd.f5573a.a().longValue() < zzq.zzld().a())) {
                zzasr = new zzasu(this.f5095b, u3Var.f5032b).d();
                this.f5096c.f5927a.put(this.f5095b, new u3(this.f5096c, zzasr));
                return zzasr;
            }
        }
        zzasr = new zzasu(this.f5095b).d();
        this.f5096c.f5927a.put(this.f5095b, new u3(this.f5096c, zzasr));
        return zzasr;
    }
}
