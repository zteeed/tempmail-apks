package androidx.lifecycle;

import android.util.Log;
import androidx.lifecycle.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: LifecycleRegistry */
public class h extends e {

    /* renamed from: a  reason: collision with root package name */
    private a.b.a.b.a<f, b> f1614a = new a.b.a.b.a<>();

    /* renamed from: b  reason: collision with root package name */
    private e.b f1615b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<g> f1616c;

    /* renamed from: d  reason: collision with root package name */
    private int f1617d = 0;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1618e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1619f = false;
    private ArrayList<e.b> g = new ArrayList<>();

    /* compiled from: LifecycleRegistry */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1620a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f1621b;

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
                androidx.lifecycle.e$b[] r0 = androidx.lifecycle.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1621b = r0
                r1 = 1
                androidx.lifecycle.e$b r2 = androidx.lifecycle.e.b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f1621b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.e$b r3 = androidx.lifecycle.e.b.CREATED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f1621b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.e$b r4 = androidx.lifecycle.e.b.STARTED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f1621b     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.e$b r5 = androidx.lifecycle.e.b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f1621b     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.e$b r6 = androidx.lifecycle.e.b.DESTROYED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                androidx.lifecycle.e$a[] r5 = androidx.lifecycle.e.a.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f1620a = r5
                androidx.lifecycle.e$a r6 = androidx.lifecycle.e.a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x004f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r1 = f1620a     // Catch:{ NoSuchFieldError -> 0x0059 }
                androidx.lifecycle.e$a r5 = androidx.lifecycle.e.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = f1620a     // Catch:{ NoSuchFieldError -> 0x0063 }
                androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_START     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = f1620a     // Catch:{ NoSuchFieldError -> 0x006d }
                androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f1620a     // Catch:{ NoSuchFieldError -> 0x0077 }
                androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                int[] r0 = f1620a     // Catch:{ NoSuchFieldError -> 0x0082 }
                androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                int[] r0 = f1620a     // Catch:{ NoSuchFieldError -> 0x008d }
                androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.h.a.<clinit>():void");
        }
    }

    /* compiled from: LifecycleRegistry */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        e.b f1622a;

        /* renamed from: b  reason: collision with root package name */
        d f1623b;

        b(f fVar, e.b bVar) {
            this.f1623b = j.d(fVar);
            this.f1622a = bVar;
        }

        /* access modifiers changed from: package-private */
        public void a(g gVar, e.a aVar) {
            e.b h = h.h(aVar);
            this.f1622a = h.l(this.f1622a, h);
            this.f1623b.c(gVar, aVar);
            this.f1622a = h;
        }
    }

    public h(g gVar) {
        this.f1616c = new WeakReference<>(gVar);
        this.f1615b = e.b.INITIALIZED;
    }

    private void d(g gVar) {
        Iterator<Map.Entry<f, b>> descendingIterator = this.f1614a.descendingIterator();
        while (descendingIterator.hasNext() && !this.f1619f) {
            Map.Entry next = descendingIterator.next();
            b bVar = (b) next.getValue();
            while (bVar.f1622a.compareTo(this.f1615b) > 0 && !this.f1619f && this.f1614a.contains(next.getKey())) {
                e.a f2 = f(bVar.f1622a);
                o(h(f2));
                bVar.a(gVar, f2);
                n();
            }
        }
    }

    private e.b e(f fVar) {
        Map.Entry<f, b> s = this.f1614a.s(fVar);
        e.b bVar = null;
        e.b bVar2 = s != null ? s.getValue().f1622a : null;
        if (!this.g.isEmpty()) {
            ArrayList<e.b> arrayList = this.g;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        return l(l(this.f1615b, bVar2), bVar);
    }

    private static e.a f(e.b bVar) {
        int i = a.f1621b[bVar.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        } else if (i == 2) {
            return e.a.ON_DESTROY;
        } else {
            if (i == 3) {
                return e.a.ON_STOP;
            }
            if (i == 4) {
                return e.a.ON_PAUSE;
            }
            if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
            throw new IllegalArgumentException();
        }
    }

    private void g(g gVar) {
        a.b.a.b.b<K, V>.d i = this.f1614a.i();
        while (i.hasNext() && !this.f1619f) {
            Map.Entry entry = (Map.Entry) i.next();
            b bVar = (b) entry.getValue();
            while (bVar.f1622a.compareTo(this.f1615b) < 0 && !this.f1619f && this.f1614a.contains(entry.getKey())) {
                o(bVar.f1622a);
                bVar.a(gVar, q(bVar.f1622a));
                n();
            }
        }
    }

    static e.b h(e.a aVar) {
        switch (a.f1620a[aVar.ordinal()]) {
            case 1:
            case 2:
                return e.b.CREATED;
            case 3:
            case 4:
                return e.b.STARTED;
            case 5:
                return e.b.RESUMED;
            case 6:
                return e.b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    private boolean j() {
        if (this.f1614a.size() == 0) {
            return true;
        }
        e.b bVar = this.f1614a.c().getValue().f1622a;
        e.b bVar2 = this.f1614a.j().getValue().f1622a;
        if (bVar == bVar2 && this.f1615b == bVar2) {
            return true;
        }
        return false;
    }

    static e.b l(e.b bVar, e.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    private void m(e.b bVar) {
        if (this.f1615b != bVar) {
            this.f1615b = bVar;
            if (this.f1618e || this.f1617d != 0) {
                this.f1619f = true;
                return;
            }
            this.f1618e = true;
            p();
            this.f1618e = false;
        }
    }

    private void n() {
        ArrayList<e.b> arrayList = this.g;
        arrayList.remove(arrayList.size() - 1);
    }

    private void o(e.b bVar) {
        this.g.add(bVar);
    }

    private void p() {
        g gVar = (g) this.f1616c.get();
        if (gVar == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
            return;
        }
        while (!j()) {
            this.f1619f = false;
            if (this.f1615b.compareTo(this.f1614a.c().getValue().f1622a) < 0) {
                d(gVar);
            }
            Map.Entry<f, b> j = this.f1614a.j();
            if (!this.f1619f && j != null && this.f1615b.compareTo(j.getValue().f1622a) > 0) {
                g(gVar);
            }
        }
        this.f1619f = false;
    }

    private static e.a q(e.b bVar) {
        int i = a.f1621b[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return e.a.ON_START;
            }
            if (i == 3) {
                return e.a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            } else if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
        }
        return e.a.ON_CREATE;
    }

    public void a(f fVar) {
        g gVar;
        e.b bVar = this.f1615b;
        e.b bVar2 = e.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = e.b.INITIALIZED;
        }
        b bVar3 = new b(fVar, bVar2);
        if (this.f1614a.m(fVar, bVar3) == null && (gVar = (g) this.f1616c.get()) != null) {
            boolean z = this.f1617d != 0 || this.f1618e;
            e.b e2 = e(fVar);
            this.f1617d++;
            while (bVar3.f1622a.compareTo(e2) < 0 && this.f1614a.contains(fVar)) {
                o(bVar3.f1622a);
                bVar3.a(gVar, q(bVar3.f1622a));
                n();
                e2 = e(fVar);
            }
            if (!z) {
                p();
            }
            this.f1617d--;
        }
    }

    public e.b b() {
        return this.f1615b;
    }

    public void c(f fVar) {
        this.f1614a.q(fVar);
    }

    public void i(e.a aVar) {
        m(h(aVar));
    }

    public void k(e.b bVar) {
        m(bVar);
    }
}
