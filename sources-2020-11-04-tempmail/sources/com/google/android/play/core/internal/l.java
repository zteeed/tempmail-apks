package com.google.android.play.core.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.play.core.tasks.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class l<T extends IInterface> {
    private static final Map<String, Handler> l = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f11492a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final a f11493b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11494c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final List<b> f11495d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f11496e;

    /* renamed from: f  reason: collision with root package name */
    private final Intent f11497f;
    /* access modifiers changed from: private */
    public final h<T> g;
    private final WeakReference<g> h;
    private final IBinder.DeathRecipient i = new c(this);
    /* access modifiers changed from: private */
    public ServiceConnection j;
    /* access modifiers changed from: private */
    public T k;

    public l(Context context, a aVar, String str, Intent intent, h<T> hVar) {
        this.f11492a = context;
        this.f11493b = aVar;
        this.f11494c = str;
        this.f11497f = intent;
        this.g = hVar;
        this.h = new WeakReference<>((Object) null);
    }

    static /* synthetic */ void e(l lVar, b bVar) {
        if (lVar.k == null && !lVar.f11496e) {
            lVar.f11493b.f("Initiate binding to the service.", new Object[0]);
            lVar.f11495d.add(bVar);
            k kVar = new k(lVar);
            lVar.j = kVar;
            lVar.f11496e = true;
            if (!lVar.f11492a.bindService(lVar.f11497f, kVar, 1)) {
                lVar.f11493b.f("Failed to bind to the service.", new Object[0]);
                lVar.f11496e = false;
                List<b> list = lVar.f11495d;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    m<?> b2 = list.get(i2).b();
                    if (b2 != null) {
                        b2.d(new al());
                    }
                }
                lVar.f11495d.clear();
            }
        } else if (lVar.f11496e) {
            lVar.f11493b.f("Waiting to bind to the service.", new Object[0]);
            lVar.f11495d.add(bVar);
        } else {
            bVar.run();
        }
    }

    /* access modifiers changed from: private */
    public final void h(b bVar) {
        Handler handler;
        synchronized (l) {
            if (!l.containsKey(this.f11494c)) {
                HandlerThread handlerThread = new HandlerThread(this.f11494c, 10);
                handlerThread.start();
                l.put(this.f11494c, new Handler(handlerThread.getLooper()));
            }
            handler = l.get(this.f11494c);
        }
        handler.post(bVar);
    }

    static /* synthetic */ void n(l lVar) {
        lVar.f11493b.f("linkToDeath", new Object[0]);
        try {
            lVar.k.asBinder().linkToDeath(lVar.i, 0);
        } catch (RemoteException e2) {
            lVar.f11493b.d(e2, "linkToDeath failed", new Object[0]);
        }
    }

    static /* synthetic */ void p(l lVar) {
        lVar.f11493b.f("unlinkToDeath", new Object[0]);
        lVar.k.asBinder().unlinkToDeath(lVar.i, 0);
    }

    public final void b() {
        h(new f(this));
    }

    public final void c(b bVar) {
        h(new d(this, bVar.b(), bVar));
    }

    public final T f() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ void k() {
        this.f11493b.f("reportBinderDeath", new Object[0]);
        g gVar = (g) this.h.get();
        if (gVar == null) {
            this.f11493b.f("%s : Binder has died.", this.f11494c);
            List<b> list = this.f11495d;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                m<?> b2 = list.get(i2).b();
                if (b2 != null) {
                    b2.d(Build.VERSION.SDK_INT < 15 ? new RemoteException() : new RemoteException(String.valueOf(this.f11494c).concat(" : Binder has died.")));
                }
            }
            this.f11495d.clear();
            return;
        }
        this.f11493b.f("calling onBinderDied", new Object[0]);
        gVar.d();
    }
}
