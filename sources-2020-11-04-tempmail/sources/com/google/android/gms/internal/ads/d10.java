package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class d10 implements Executor {

    /* renamed from: b  reason: collision with root package name */
    boolean f3774b = true;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Executor f3775c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzdtu f3776d;

    d10(Executor executor, zzdtu zzdtu) {
        this.f3775c = executor;
        this.f3776d = zzdtu;
    }

    public final void execute(Runnable runnable) {
        try {
            this.f3775c.execute(new c10(this, runnable));
        } catch (RejectedExecutionException e2) {
            if (this.f3774b) {
                this.f3776d.j(e2);
            }
        }
    }
}
