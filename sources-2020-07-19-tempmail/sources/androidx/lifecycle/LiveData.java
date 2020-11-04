package androidx.lifecycle;

import a.b.a.b.b;
import androidx.lifecycle.e;
import java.util.Map;

public abstract class LiveData<T> {
    static final Object i = new Object();

    /* renamed from: a  reason: collision with root package name */
    final Object f1587a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private b<m<? super T>, LiveData<T>.a> f1588b = new b<>();

    /* renamed from: c  reason: collision with root package name */
    int f1589c = 0;

    /* renamed from: d  reason: collision with root package name */
    private volatile Object f1590d = i;

    /* renamed from: e  reason: collision with root package name */
    volatile Object f1591e = i;

    /* renamed from: f  reason: collision with root package name */
    private int f1592f = -1;
    private boolean g;
    private boolean h;

    class LifecycleBoundObserver extends LiveData<T>.a implements d {

        /* renamed from: e  reason: collision with root package name */
        final g f1593e;

        LifecycleBoundObserver(g gVar, m<? super T> mVar) {
            super(mVar);
            this.f1593e = gVar;
        }

        public void c(g gVar, e.a aVar) {
            if (this.f1593e.e().b() == e.b.DESTROYED) {
                LiveData.this.i(this.f1595a);
            } else {
                h(k());
            }
        }

        /* access modifiers changed from: package-private */
        public void i() {
            this.f1593e.e().c(this);
        }

        /* access modifiers changed from: package-private */
        public boolean j(g gVar) {
            return this.f1593e == gVar;
        }

        /* access modifiers changed from: package-private */
        public boolean k() {
            return this.f1593e.e().b().f(e.b.STARTED);
        }
    }

    private abstract class a {

        /* renamed from: a  reason: collision with root package name */
        final m<? super T> f1595a;

        /* renamed from: b  reason: collision with root package name */
        boolean f1596b;

        /* renamed from: c  reason: collision with root package name */
        int f1597c = -1;

        a(m<? super T> mVar) {
            this.f1595a = mVar;
        }

        /* access modifiers changed from: package-private */
        public void h(boolean z) {
            if (z != this.f1596b) {
                this.f1596b = z;
                int i = 1;
                boolean z2 = LiveData.this.f1589c == 0;
                LiveData liveData = LiveData.this;
                int i2 = liveData.f1589c;
                if (!this.f1596b) {
                    i = -1;
                }
                liveData.f1589c = i2 + i;
                if (z2 && this.f1596b) {
                    LiveData.this.g();
                }
                LiveData liveData2 = LiveData.this;
                if (liveData2.f1589c == 0 && !this.f1596b) {
                    liveData2.h();
                }
                if (this.f1596b) {
                    LiveData.this.c(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void i() {
        }

        /* access modifiers changed from: package-private */
        public boolean j(g gVar) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public abstract boolean k();
    }

    private static void a(String str) {
        if (!a.b.a.a.a.b().a()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background" + " thread");
        }
    }

    private void b(LiveData<T>.a aVar) {
        if (aVar.f1596b) {
            if (!aVar.k()) {
                aVar.h(false);
                return;
            }
            int i2 = aVar.f1597c;
            int i3 = this.f1592f;
            if (i2 < i3) {
                aVar.f1597c = i3;
                aVar.f1595a.a(this.f1590d);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(LiveData<T>.a aVar) {
        if (this.g) {
            this.h = true;
            return;
        }
        this.g = true;
        do {
            this.h = false;
            if (aVar == null) {
                b<K, V>.d i2 = this.f1588b.i();
                while (i2.hasNext()) {
                    b((a) ((Map.Entry) i2.next()).getValue());
                    if (this.h) {
                        break;
                    }
                }
            } else {
                b(aVar);
                aVar = null;
            }
        } while (this.h);
        this.g = false;
    }

    public T d() {
        T t = this.f1590d;
        if (t != i) {
            return t;
        }
        return null;
    }

    public boolean e() {
        return this.f1589c > 0;
    }

    public void f(g gVar, m<? super T> mVar) {
        a("observe");
        if (gVar.e().b() != e.b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(gVar, mVar);
            a m = this.f1588b.m(mVar, lifecycleBoundObserver);
            if (m != null && !m.j(gVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (m == null) {
                gVar.e().a(lifecycleBoundObserver);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void g() {
    }

    /* access modifiers changed from: protected */
    public void h() {
    }

    public void i(m<? super T> mVar) {
        a("removeObserver");
        a q = this.f1588b.q(mVar);
        if (q != null) {
            q.i();
            q.h(false);
        }
    }

    /* access modifiers changed from: protected */
    public void j(T t) {
        a("setValue");
        this.f1592f++;
        this.f1590d = t;
        c((LiveData<T>.a) null);
    }
}
