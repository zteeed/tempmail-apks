package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.firebase_messaging.zza;
import com.google.android.gms.internal.firebase_messaging.zzf;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.firebase:firebase-iid@@20.2.0 */
public final class e {
    @GuardedBy("MessengerIpcClient.class")

    /* renamed from: e  reason: collision with root package name */
    private static e f11182e;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f11183a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f11184b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    private f f11185c = new f(this);
    @GuardedBy("this")

    /* renamed from: d  reason: collision with root package name */
    private int f11186d = 1;

    private e(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f11184b = scheduledExecutorService;
        this.f11183a = context.getApplicationContext();
    }

    private final synchronized int a() {
        int i;
        i = this.f11186d;
        this.f11186d = i + 1;
        return i;
    }

    private final synchronized <T> Task<T> d(p<T> pVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(pVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f11185c.e(pVar)) {
            f fVar = new f(this);
            this.f11185c = fVar;
            fVar.e(pVar);
        }
        return pVar.f11230b.a();
    }

    public static synchronized e e(Context context) {
        e eVar;
        synchronized (e.class) {
            if (f11182e == null) {
                f11182e = new e(context, zza.a().b(1, new NamedThreadFactory("MessengerIpcClient"), zzf.f9301a));
            }
            eVar = f11182e;
        }
        return eVar;
    }

    public final Task<Void> c(int i, Bundle bundle) {
        return d(new n(a(), 2, bundle));
    }

    public final Task<Bundle> f(int i, Bundle bundle) {
        return d(new r(a(), 1, bundle));
    }
}
