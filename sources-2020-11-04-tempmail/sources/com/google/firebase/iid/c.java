package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.firebase:firebase-iid@@20.2.1 */
public final class c implements c0 {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f11714c = new Object();
    @GuardedBy("lock")

    /* renamed from: d  reason: collision with root package name */
    private static k0 f11715d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f11716a;

    /* renamed from: b  reason: collision with root package name */
    private final ExecutorService f11717b;

    public c(Context context, ExecutorService executorService) {
        this.f11716a = context;
        this.f11717b = executorService;
    }

    static final /* synthetic */ Task b(Context context, Intent intent, Task task) throws Exception {
        return (!PlatformVersion.k() || ((Integer) task.n()).intValue() != 402) ? task : f(context, intent).j(s0.a(), p0.f11783a);
    }

    private static k0 c(Context context, String str) {
        k0 k0Var;
        synchronized (f11714c) {
            if (f11715d == null) {
                f11715d = new k0(context, str);
            }
            k0Var = f11715d;
        }
        return k0Var;
    }

    static final /* synthetic */ Integer e(Task task) throws Exception {
        return -1;
    }

    private static Task<Integer> f(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Binding to service");
        }
        return c(context, "com.google.firebase.MESSAGING_EVENT").a(intent).j(s0.a(), q0.f11789a);
    }

    static final /* synthetic */ Integer g(Task task) throws Exception {
        return 403;
    }

    public final Task<Integer> a(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = this.f11716a;
        boolean z2 = PlatformVersion.k() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) != 0) {
            z = true;
        }
        if (!z2 || z) {
            return Tasks.c(this.f11717b, new o0(context, intent)).l(this.f11717b, new n0(context, intent));
        }
        return f(context, intent);
    }
}
