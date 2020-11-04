package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzq;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class p6 implements Executor {

    /* renamed from: b  reason: collision with root package name */
    private final Handler f4795b = new zzaxy(Looper.getMainLooper());

    p6() {
    }

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
            } catch (Throwable th) {
                zzq.zzkw();
                zzaye.n(zzq.zzla().a(), th);
                throw th;
            }
        } else {
            this.f4795b.post(runnable);
        }
    }
}
