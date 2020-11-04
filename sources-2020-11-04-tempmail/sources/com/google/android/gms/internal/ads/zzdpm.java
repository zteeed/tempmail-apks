package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbw;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public final class zzdpm {

    /* renamed from: d  reason: collision with root package name */
    private static volatile zzbw.zza.zzc f8480d = zzbw.zza.zzc.UNKNOWN;

    /* renamed from: a  reason: collision with root package name */
    private final Context f8481a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f8482b;

    /* renamed from: c  reason: collision with root package name */
    private final Task<zztr> f8483c;

    private zzdpm(Context context, Executor executor, Task<zztr> task) {
        this.f8481a = context;
        this.f8482b = executor;
        this.f8483c = task;
    }

    public static zzdpm a(Context context, Executor executor) {
        return new zzdpm(context, executor, Tasks.c(executor, new gy(context)));
    }

    private final Task<Boolean> c(int i, long j, Exception exc, String str, Map<String, String> map, String str2) {
        zzbw.zza.C0070zza X = zzbw.zza.X();
        X.y(this.f8481a.getPackageName());
        X.x(j);
        X.w(f8480d);
        if (exc != null) {
            X.z(zzdsk.a(exc));
            X.C(exc.getClass().getName());
        }
        if (str2 != null) {
            X.D(str2);
        }
        if (str != null) {
            X.E(str);
        }
        return this.f8483c.j(this.f8482b, new hy(X, i));
    }

    static final /* synthetic */ Boolean e(zzbw.zza.C0070zza zza, int i, Task task) throws Exception {
        if (!task.r()) {
            return Boolean.FALSE;
        }
        zztv a2 = ((zztr) task.n()).a(((zzbw.zza) ((zzegb) zza.O())).g());
        a2.b(i);
        a2.c();
        return Boolean.TRUE;
    }

    static void f(zzbw.zza.zzc zzc) {
        f8480d = zzc;
    }

    static final /* synthetic */ zztr g(Context context) throws Exception {
        return new zztr(context, "GLAS", (String) null);
    }

    public final Task<Boolean> b(int i, long j, Exception exc) {
        return c(i, j, exc, (String) null, (Map<String, String>) null, (String) null);
    }

    public final Task<Boolean> d(int i, long j, String str, Map<String, String> map) {
        return c(i, j, (Exception) null, str, (Map<String, String>) null, (String) null);
    }

    public final Task<Boolean> h(int i, long j) {
        return c(i, j, (Exception) null, (String) null, (Map<String, String>) null, (String) null);
    }

    public final Task<Boolean> i(int i, String str) {
        return c(4007, 0, (Exception) null, (String) null, (Map<String, String>) null, str);
    }
}
