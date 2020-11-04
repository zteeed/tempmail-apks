package org.greenrobot.eventbus;

import android.os.Looper;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.greenrobot.eventbus.f;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.q.b;

/* compiled from: EventBusBuilder */
public class d {
    private static final ExecutorService m = Executors.newCachedThreadPool();

    /* renamed from: a  reason: collision with root package name */
    boolean f14456a = true;

    /* renamed from: b  reason: collision with root package name */
    boolean f14457b = true;

    /* renamed from: c  reason: collision with root package name */
    boolean f14458c = true;

    /* renamed from: d  reason: collision with root package name */
    boolean f14459d = true;

    /* renamed from: e  reason: collision with root package name */
    boolean f14460e;

    /* renamed from: f  reason: collision with root package name */
    boolean f14461f = true;
    boolean g;
    boolean h;
    ExecutorService i = m;
    List<b> j;
    f k;
    g l;

    d() {
    }

    /* access modifiers changed from: package-private */
    public Object a() {
        try {
            return Looper.getMainLooper();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public f b() {
        f fVar = this.k;
        if (fVar != null) {
            return fVar;
        }
        return (!f.a.c() || a() == null) ? new f.b() : new f.a("EventBus");
    }

    /* access modifiers changed from: package-private */
    public g c() {
        Object a2;
        g gVar = this.l;
        if (gVar != null) {
            return gVar;
        }
        if (!f.a.c() || (a2 = a()) == null) {
            return null;
        }
        return new g.a((Looper) a2);
    }
}
