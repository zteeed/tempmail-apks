package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzt implements zzak {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f9104a;

    public zzt(Handler handler) {
        this.f9104a = new ze0(this, handler);
    }

    public final void a(zzaa<?> zzaa, zzao zzao) {
        zzaa.u("post-error");
        this.f9104a.execute(new zf0(zzaa, zzaj.b(zzao), (Runnable) null));
    }

    public final void b(zzaa<?> zzaa, zzaj<?> zzaj) {
        c(zzaa, zzaj, (Runnable) null);
    }

    public final void c(zzaa<?> zzaa, zzaj<?> zzaj, Runnable runnable) {
        zzaa.L();
        zzaa.u("post-response");
        this.f9104a.execute(new zf0(zzaa, zzaj, runnable));
    }
}
