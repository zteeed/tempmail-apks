package androidx.lifecycle;

import androidx.lifecycle.g;
import java.util.Iterator;
import java.util.Map;

public abstract class LiveData<T> {
    static final Object j = new Object();

    /* renamed from: a  reason: collision with root package name */
    final Object f1641a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private a.b.a.b.b<q<? super T>, LiveData<T>.b> f1642b = new a.b.a.b.b<>();

    /* renamed from: c  reason: collision with root package name */
    int f1643c = 0;

    /* renamed from: d  reason: collision with root package name */
    private volatile Object f1644d = j;

    /* renamed from: e  reason: collision with root package name */
    volatile Object f1645e = j;

    /* renamed from: f  reason: collision with root package name */
    private int f1646f = -1;
    private boolean g;
    private boolean h;
    private final Runnable i = new a();

    class LifecycleBoundObserver extends LiveData<T>.b implements i {

        /* renamed from: e  reason: collision with root package name */
        final k f1647e;

        LifecycleBoundObserver(k kVar, q<? super T> qVar) {
            super(qVar);
            this.f1647e = kVar;
        }

        public void c(k kVar, g.a aVar) {
            if (this.f1647e.c().b() == g.b.DESTROYED) {
                LiveData.this.j(this.f1650a);
            } else {
                e(k());
            }
        }

        /* access modifiers changed from: package-private */
        public void h() {
            this.f1647e.c().c(this);
        }

        /* access modifiers changed from: package-private */
        public boolean j(k kVar) {
            return this.f1647e == kVar;
        }

        /* access modifiers changed from: package-private */
        public boolean k() {
            return this.f1647e.c().b().f(g.b.STARTED);
        }
    }

    class a implements Runnable {
        a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.f1641a) {
                obj = LiveData.this.f1645e;
                LiveData.this.f1645e = LiveData.j;
            }
            LiveData.this.l(obj);
        }
    }

    private abstract class b {

        /* renamed from: a  reason: collision with root package name */
        final q<? super T> f1650a;

        /* renamed from: b  reason: collision with root package name */
        boolean f1651b;

        /* renamed from: c  reason: collision with root package name */
        int f1652c = -1;

        b(q<? super T> qVar) {
            this.f1650a = qVar;
        }

        /* access modifiers changed from: package-private */
        public void e(boolean z) {
            if (z != this.f1651b) {
                this.f1651b = z;
                int i = 1;
                boolean z2 = LiveData.this.f1643c == 0;
                LiveData liveData = LiveData.this;
                int i2 = liveData.f1643c;
                if (!this.f1651b) {
                    i = -1;
                }
                liveData.f1643c = i2 + i;
                if (z2 && this.f1651b) {
                    LiveData.this.g();
                }
                LiveData liveData2 = LiveData.this;
                if (liveData2.f1643c == 0 && !this.f1651b) {
                    liveData2.h();
                }
                if (this.f1651b) {
                    LiveData.this.c(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void h() {
        }

        /* access modifiers changed from: package-private */
        public boolean j(k kVar) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public abstract boolean k();
    }

    static void a(String str) {
        if (!a.b.a.a.a.c().a()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    private void b(LiveData<T>.b bVar) {
        if (bVar.f1651b) {
            if (!bVar.k()) {
                bVar.e(false);
                return;
            }
            int i2 = bVar.f1652c;
            int i3 = this.f1646f;
            if (i2 < i3) {
                bVar.f1652c = i3;
                bVar.f1650a.a(this.f1644d);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(LiveData<T>.b bVar) {
        if (this.g) {
            this.h = true;
            return;
        }
        this.g = true;
        do {
            this.h = false;
            if (bVar == null) {
                a.b.a.b.b<K, V>.d i2 = this.f1642b.i();
                while (i2.hasNext()) {
                    b((b) ((Map.Entry) i2.next()).getValue());
                    if (this.h) {
                        break;
                    }
                }
            } else {
                b(bVar);
                bVar = null;
            }
        } while (this.h);
        this.g = false;
    }

    public T d() {
        T t = this.f1644d;
        if (t != j) {
            return t;
        }
        return null;
    }

    public boolean e() {
        return this.f1643c > 0;
    }

    public void f(k kVar, q<? super T> qVar) {
        a("observe");
        if (kVar.c().b() != g.b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(kVar, qVar);
            b m = this.f1642b.m(qVar, lifecycleBoundObserver);
            if (m != null && !m.j(kVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (m == null) {
                kVar.c().a(lifecycleBoundObserver);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void g() {
    }

    /* access modifiers changed from: protected */
    public void h() {
    }

    /* access modifiers changed from: protected */
    public void i(T t) {
        boolean z;
        synchronized (this.f1641a) {
            z = this.f1645e == j;
            this.f1645e = t;
        }
        if (z) {
            a.b.a.a.a.c().b(this.i);
        }
    }

    public void j(q<? super T> qVar) {
        a("removeObserver");
        b q = this.f1642b.q(qVar);
        if (q != null) {
            q.h();
            q.e(false);
        }
    }

    public void k(k kVar) {
        a("removeObservers");
        Iterator<Map.Entry<q<? super T>, LiveData<T>.b>> it = this.f1642b.iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (((b) next.getValue()).j(kVar)) {
                j((q) next.getKey());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void l(T t) {
        a("setValue");
        this.f1646f++;
        this.f1644d = t;
        c((LiveData<T>.b) null);
    }
}
