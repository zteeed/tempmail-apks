package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import b.c.a.b.i.w.j.c;
import b.c.a.b.i.w.j.i;
import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.backends.f;
import com.google.android.datatransport.runtime.backends.g;
import com.google.android.datatransport.runtime.synchronization.a;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import javax.inject.Inject;

/* compiled from: Uploader */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2792a;

    /* renamed from: b  reason: collision with root package name */
    private final e f2793b;

    /* renamed from: c  reason: collision with root package name */
    private final c f2794c;

    /* renamed from: d  reason: collision with root package name */
    private final s f2795d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f2796e;

    /* renamed from: f  reason: collision with root package name */
    private final a f2797f;
    private final b.c.a.b.i.x.a g;

    @Inject
    public m(Context context, e eVar, c cVar, s sVar, Executor executor, a aVar, b.c.a.b.i.x.a aVar2) {
        this.f2792a = context;
        this.f2793b = eVar;
        this.f2794c = cVar;
        this.f2795d = sVar;
        this.f2796e = executor;
        this.f2797f = aVar;
        this.g = aVar2;
    }

    static /* synthetic */ Object c(m mVar, g gVar, Iterable iterable, b.c.a.b.i.m mVar2, int i) {
        if (gVar.c() == g.a.TRANSIENT_ERROR) {
            mVar.f2794c.M(iterable);
            mVar.f2795d.a(mVar2, i + 1);
            return null;
        }
        mVar.f2794c.i(iterable);
        if (gVar.c() == g.a.OK) {
            mVar.f2794c.l(mVar2, mVar.g.a() + gVar.b());
        }
        if (!mVar.f2794c.F(mVar2)) {
            return null;
        }
        mVar.f2795d.a(mVar2, 1);
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        r5.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r2.f2795d.a(r3, r4 + 1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0024 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void e(com.google.android.datatransport.runtime.scheduling.jobscheduling.m r2, b.c.a.b.i.m r3, int r4, java.lang.Runnable r5) {
        /*
            com.google.android.datatransport.runtime.synchronization.a r0 = r2.f2797f     // Catch:{ SynchronizationException -> 0x0024 }
            b.c.a.b.i.w.j.c r1 = r2.f2794c     // Catch:{ SynchronizationException -> 0x0024 }
            r1.getClass()     // Catch:{ SynchronizationException -> 0x0024 }
            com.google.android.datatransport.runtime.synchronization.a$a r1 = com.google.android.datatransport.runtime.scheduling.jobscheduling.k.a(r1)     // Catch:{ SynchronizationException -> 0x0024 }
            r0.a(r1)     // Catch:{ SynchronizationException -> 0x0024 }
            boolean r0 = r2.a()     // Catch:{ SynchronizationException -> 0x0024 }
            if (r0 != 0) goto L_0x001e
            com.google.android.datatransport.runtime.synchronization.a r0 = r2.f2797f     // Catch:{ SynchronizationException -> 0x0024 }
            com.google.android.datatransport.runtime.synchronization.a$a r1 = com.google.android.datatransport.runtime.scheduling.jobscheduling.l.a(r2, r3, r4)     // Catch:{ SynchronizationException -> 0x0024 }
            r0.a(r1)     // Catch:{ SynchronizationException -> 0x0024 }
            goto L_0x002b
        L_0x001e:
            r2.f(r3, r4)     // Catch:{ SynchronizationException -> 0x0024 }
            goto L_0x002b
        L_0x0022:
            r2 = move-exception
            goto L_0x002f
        L_0x0024:
            com.google.android.datatransport.runtime.scheduling.jobscheduling.s r2 = r2.f2795d     // Catch:{ all -> 0x0022 }
            int r4 = r4 + 1
            r2.a(r3, r4)     // Catch:{ all -> 0x0022 }
        L_0x002b:
            r5.run()
            return
        L_0x002f:
            r5.run()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.scheduling.jobscheduling.m.e(com.google.android.datatransport.runtime.scheduling.jobscheduling.m, b.c.a.b.i.m, int, java.lang.Runnable):void");
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f2792a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* access modifiers changed from: package-private */
    public void f(b.c.a.b.i.m mVar, int i) {
        g gVar;
        com.google.android.datatransport.runtime.backends.m a2 = this.f2793b.a(mVar.b());
        Iterable<i> iterable = (Iterable) this.f2797f.a(i.a(this, mVar));
        if (iterable.iterator().hasNext()) {
            if (a2 == null) {
                b.c.a.b.i.u.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", mVar);
                gVar = g.a();
            } else {
                ArrayList arrayList = new ArrayList();
                for (i b2 : iterable) {
                    arrayList.add(b2.b());
                }
                f.a a3 = f.a();
                a3.b(arrayList);
                a3.c(mVar.c());
                gVar = a2.a(a3.a());
            }
            this.f2797f.a(j.a(this, gVar, iterable, mVar, i));
        }
    }

    public void g(b.c.a.b.i.m mVar, int i, Runnable runnable) {
        this.f2796e.execute(h.a(this, mVar, i, runnable));
    }
}
