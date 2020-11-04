package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ze0 implements Executor {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Handler f5462b;

    ze0(zzt zzt, Handler handler) {
        this.f5462b = handler;
    }

    public final void execute(Runnable runnable) {
        this.f5462b.post(runnable);
    }
}
