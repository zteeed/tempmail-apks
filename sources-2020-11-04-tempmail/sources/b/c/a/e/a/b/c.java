package b.c.a.e.a.b;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.internal.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class c<StateT> {

    /* renamed from: a  reason: collision with root package name */
    protected final a f2466a;

    /* renamed from: b  reason: collision with root package name */
    private final IntentFilter f2467b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f2468c;

    /* renamed from: d  reason: collision with root package name */
    protected final Set<a<StateT>> f2469d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    private b f2470e = null;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f2471f = false;

    protected c(a aVar, IntentFilter intentFilter, Context context) {
        this.f2466a = aVar;
        this.f2467b = intentFilter;
        this.f2468c = com.google.android.play.core.splitinstall.a.a(context);
    }

    private final void g() {
        b bVar;
        if ((this.f2471f || !this.f2469d.isEmpty()) && this.f2470e == null) {
            b bVar2 = new b(this);
            this.f2470e = bVar2;
            this.f2468c.registerReceiver(bVar2, this.f2467b);
        }
        if (!this.f2471f && this.f2469d.isEmpty() && (bVar = this.f2470e) != null) {
            this.f2468c.unregisterReceiver(bVar);
            this.f2470e = null;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(Context context, Intent intent);

    public final synchronized void b(a<StateT> aVar) {
        this.f2466a.f("registerListener", new Object[0]);
        b.c.a.e.a.c.a.b(aVar, "Registered Play Core listener should not be null.");
        this.f2469d.add(aVar);
        g();
    }

    public final synchronized void c(StateT statet) {
        Iterator it = new HashSet(this.f2469d).iterator();
        while (it.hasNext()) {
            ((a) it.next()).e(statet);
        }
    }

    public final synchronized void d(boolean z) {
        this.f2471f = z;
        g();
    }

    public final synchronized void e(a<StateT> aVar) {
        this.f2466a.f("unregisterListener", new Object[0]);
        b.c.a.e.a.c.a.b(aVar, "Unregistered Play Core listener should not be null.");
        this.f2469d.remove(aVar);
        g();
    }

    public final synchronized boolean f() {
        return this.f2470e != null;
    }
}
