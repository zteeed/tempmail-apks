package com.google.android.gms.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.gcm.zzg;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

public final class zzr {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f3323a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f3324b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    private p f3325c;
    @GuardedBy("this")

    /* renamed from: d  reason: collision with root package name */
    private int f3326d;

    public zzr(Context context) {
        this(context, zzg.a().b(1, new NamedThreadFactory("MessengerIpcClient"), 9));
    }

    private final synchronized <T> Task<T> c(w<T> wVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(wVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f3325c.c(wVar)) {
            p pVar = new p(this);
            this.f3325c = pVar;
            pVar.c(wVar);
        }
        return wVar.f3296b.a();
    }

    private final synchronized int e() {
        int i;
        i = this.f3326d;
        this.f3326d = i + 1;
        return i;
    }

    public final Task<Bundle> b(int i, Bundle bundle) {
        return c(new a(e(), 1, bundle));
    }

    private zzr(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f3325c = new p(this);
        this.f3326d = 1;
        this.f3323a = context.getApplicationContext();
        this.f3324b = scheduledExecutorService;
    }
}
