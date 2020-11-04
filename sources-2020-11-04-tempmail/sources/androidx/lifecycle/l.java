package androidx.lifecycle;

import androidx.lifecycle.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: LifecycleRegistry */
public class l extends g {

    /* renamed from: a  reason: collision with root package name */
    private a.b.a.b.a<j, b> f1676a = new a.b.a.b.a<>();

    /* renamed from: b  reason: collision with root package name */
    private g.b f1677b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<k> f1678c;

    /* renamed from: d  reason: collision with root package name */
    private int f1679d = 0;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1680e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1681f = false;
    private ArrayList<g.b> g = new ArrayList<>();

    /* compiled from: LifecycleRegistry */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1682a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f1683b;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0082 */
        static {
            /*
                androidx.lifecycle.g$b[] r0 = androidx.lifecycle.g.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1683b = r0
                r1 = 1
                androidx.lifecycle.g$b r2 = androidx.lifecycle.g.b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f1683b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.g$b r3 = androidx.lifecycle.g.b.CREATED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f1683b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.g$b r4 = androidx.lifecycle.g.b.STARTED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f1683b     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.g$b r5 = androidx.lifecycle.g.b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f1683b     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.g$b r6 = androidx.lifecycle.g.b.DESTROYED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                androidx.lifecycle.g$a[] r5 = androidx.lifecycle.g.a.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f1682a = r5
                androidx.lifecycle.g$a r6 = androidx.lifecycle.g.a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x004f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r1 = f1682a     // Catch:{ NoSuchFieldError -> 0x0059 }
                androidx.lifecycle.g$a r5 = androidx.lifecycle.g.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = f1682a     // Catch:{ NoSuchFieldError -> 0x0063 }
                androidx.lifecycle.g$a r1 = androidx.lifecycle.g.a.ON_START     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = f1682a     // Catch:{ NoSuchFieldError -> 0x006d }
                androidx.lifecycle.g$a r1 = androidx.lifecycle.g.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f1682a     // Catch:{ NoSuchFieldError -> 0x0077 }
                androidx.lifecycle.g$a r1 = androidx.lifecycle.g.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                int[] r0 = f1682a     // Catch:{ NoSuchFieldError -> 0x0082 }
                androidx.lifecycle.g$a r1 = androidx.lifecycle.g.a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                int[] r0 = f1682a     // Catch:{ NoSuchFieldError -> 0x008d }
                androidx.lifecycle.g$a r1 = androidx.lifecycle.g.a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.l.a.<clinit>():void");
        }
    }

    /* compiled from: LifecycleRegistry */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        g.b f1684a;

        /* renamed from: b  reason: collision with root package name */
        i f1685b;

        b(j jVar, g.b bVar) {
            this.f1685b = n.f(jVar);
            this.f1684a = bVar;
        }

        /* access modifiers changed from: package-private */
        public void a(k kVar, g.a aVar) {
            g.b h = l.h(aVar);
            this.f1684a = l.l(this.f1684a, h);
            this.f1685b.c(kVar, aVar);
            this.f1684a = h;
        }
    }

    public l(k kVar) {
        this.f1678c = new WeakReference<>(kVar);
        this.f1677b = g.b.INITIALIZED;
    }

    private void d(k kVar) {
        Iterator<Map.Entry<j, b>> descendingIterator = this.f1676a.descendingIterator();
        while (descendingIterator.hasNext() && !this.f1681f) {
            Map.Entry next = descendingIterator.next();
            b bVar = (b) next.getValue();
            while (bVar.f1684a.compareTo(this.f1677b) > 0 && !this.f1681f && this.f1676a.contains(next.getKey())) {
                g.a f2 = f(bVar.f1684a);
                o(h(f2));
                bVar.a(kVar, f2);
                n();
            }
        }
    }

    private g.b e(j jVar) {
        Map.Entry<j, b> s = this.f1676a.s(jVar);
        g.b bVar = null;
        g.b bVar2 = s != null ? s.getValue().f1684a : null;
        if (!this.g.isEmpty()) {
            ArrayList<g.b> arrayList = this.g;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        return l(l(this.f1677b, bVar2), bVar);
    }

    private static g.a f(g.b bVar) {
        int i = a.f1683b[bVar.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        } else if (i == 2) {
            return g.a.ON_DESTROY;
        } else {
            if (i == 3) {
                return g.a.ON_STOP;
            }
            if (i == 4) {
                return g.a.ON_PAUSE;
            }
            if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
            throw new IllegalArgumentException();
        }
    }

    private void g(k kVar) {
        a.b.a.b.b<K, V>.d i = this.f1676a.i();
        while (i.hasNext() && !this.f1681f) {
            Map.Entry entry = (Map.Entry) i.next();
            b bVar = (b) entry.getValue();
            while (bVar.f1684a.compareTo(this.f1677b) < 0 && !this.f1681f && this.f1676a.contains(entry.getKey())) {
                o(bVar.f1684a);
                bVar.a(kVar, r(bVar.f1684a));
                n();
            }
        }
    }

    static g.b h(g.a aVar) {
        switch (a.f1682a[aVar.ordinal()]) {
            case 1:
            case 2:
                return g.b.CREATED;
            case 3:
            case 4:
                return g.b.STARTED;
            case 5:
                return g.b.RESUMED;
            case 6:
                return g.b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    private boolean j() {
        if (this.f1676a.size() == 0) {
            return true;
        }
        g.b bVar = this.f1676a.c().getValue().f1684a;
        g.b bVar2 = this.f1676a.j().getValue().f1684a;
        if (bVar == bVar2 && this.f1677b == bVar2) {
            return true;
        }
        return false;
    }

    static g.b l(g.b bVar, g.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    private void m(g.b bVar) {
        if (this.f1677b != bVar) {
            this.f1677b = bVar;
            if (this.f1680e || this.f1679d != 0) {
                this.f1681f = true;
                return;
            }
            this.f1680e = true;
            q();
            this.f1680e = false;
        }
    }

    private void n() {
        ArrayList<g.b> arrayList = this.g;
        arrayList.remove(arrayList.size() - 1);
    }

    private void o(g.b bVar) {
        this.g.add(bVar);
    }

    private void q() {
        k kVar = (k) this.f1678c.get();
        if (kVar != null) {
            while (!j()) {
                this.f1681f = false;
                if (this.f1677b.compareTo(this.f1676a.c().getValue().f1684a) < 0) {
                    d(kVar);
                }
                Map.Entry<j, b> j = this.f1676a.j();
                if (!this.f1681f && j != null && this.f1677b.compareTo(j.getValue().f1684a) > 0) {
                    g(kVar);
                }
            }
            this.f1681f = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    private static g.a r(g.b bVar) {
        int i = a.f1683b[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return g.a.ON_START;
            }
            if (i == 3) {
                return g.a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            } else if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
        }
        return g.a.ON_CREATE;
    }

    public void a(j jVar) {
        k kVar;
        g.b bVar = this.f1677b;
        g.b bVar2 = g.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = g.b.INITIALIZED;
        }
        b bVar3 = new b(jVar, bVar2);
        if (this.f1676a.m(jVar, bVar3) == null && (kVar = (k) this.f1678c.get()) != null) {
            boolean z = this.f1679d != 0 || this.f1680e;
            g.b e2 = e(jVar);
            this.f1679d++;
            while (bVar3.f1684a.compareTo(e2) < 0 && this.f1676a.contains(jVar)) {
                o(bVar3.f1684a);
                bVar3.a(kVar, r(bVar3.f1684a));
                n();
                e2 = e(jVar);
            }
            if (!z) {
                q();
            }
            this.f1679d--;
        }
    }

    public g.b b() {
        return this.f1677b;
    }

    public void c(j jVar) {
        this.f1676a.q(jVar);
    }

    public void i(g.a aVar) {
        m(h(aVar));
    }

    @Deprecated
    public void k(g.b bVar) {
        p(bVar);
    }

    public void p(g.b bVar) {
        m(bVar);
    }
}
