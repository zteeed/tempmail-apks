package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* compiled from: GapWorker */
final class e implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    static final ThreadLocal<e> f1820f = new ThreadLocal<>();
    static Comparator<c> g = new a();

    /* renamed from: b  reason: collision with root package name */
    ArrayList<RecyclerView> f1821b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    long f1822c;

    /* renamed from: d  reason: collision with root package name */
    long f1823d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<c> f1824e = new ArrayList<>();

    /* compiled from: GapWorker */
    static class a implements Comparator<c> {
        a() {
        }

        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            if ((cVar.f1832d == null) == (cVar2.f1832d == null)) {
                boolean z = cVar.f1829a;
                if (z == cVar2.f1829a) {
                    int i = cVar2.f1830b - cVar.f1830b;
                    if (i != 0) {
                        return i;
                    }
                    int i2 = cVar.f1831c - cVar2.f1831c;
                    if (i2 != 0) {
                        return i2;
                    }
                    return 0;
                } else if (z) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (cVar.f1832d == null) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    /* compiled from: GapWorker */
    static class b implements RecyclerView.LayoutManager.c {

        /* renamed from: a  reason: collision with root package name */
        int f1825a;

        /* renamed from: b  reason: collision with root package name */
        int f1826b;

        /* renamed from: c  reason: collision with root package name */
        int[] f1827c;

        /* renamed from: d  reason: collision with root package name */
        int f1828d;

        b() {
        }

        public void a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f1828d * 2;
                int[] iArr = this.f1827c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f1827c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.f1827c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f1827c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.f1828d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            int[] iArr = this.f1827c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f1828d = 0;
        }

        /* access modifiers changed from: package-private */
        public void c(RecyclerView recyclerView, boolean z) {
            this.f1828d = 0;
            int[] iArr = this.f1827c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.n;
            if (recyclerView.m != null && layoutManager != null && layoutManager.s0()) {
                if (z) {
                    if (!recyclerView.f1668e.p()) {
                        layoutManager.o(recyclerView.m.c(), this);
                    }
                } else if (!recyclerView.m0()) {
                    layoutManager.n(this.f1825a, this.f1826b, recyclerView.i0, this);
                }
                int i = this.f1828d;
                if (i > layoutManager.m) {
                    layoutManager.m = i;
                    layoutManager.n = z;
                    recyclerView.f1666c.K();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean d(int i) {
            if (this.f1827c != null) {
                int i2 = this.f1828d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f1827c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void e(int i, int i2) {
            this.f1825a = i;
            this.f1826b = i2;
        }
    }

    /* compiled from: GapWorker */
    static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1829a;

        /* renamed from: b  reason: collision with root package name */
        public int f1830b;

        /* renamed from: c  reason: collision with root package name */
        public int f1831c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f1832d;

        /* renamed from: e  reason: collision with root package name */
        public int f1833e;

        c() {
        }

        public void a() {
            this.f1829a = false;
            this.f1830b = 0;
            this.f1831c = 0;
            this.f1832d = null;
            this.f1833e = 0;
        }
    }

    e() {
    }

    private void b() {
        c cVar;
        int size = this.f1821b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f1821b.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.h0.c(recyclerView, false);
                i += recyclerView.h0.f1828d;
            }
        }
        this.f1824e.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f1821b.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.h0;
                int abs = Math.abs(bVar.f1825a) + Math.abs(bVar.f1826b);
                for (int i5 = 0; i5 < bVar.f1828d * 2; i5 += 2) {
                    if (i3 >= this.f1824e.size()) {
                        cVar = new c();
                        this.f1824e.add(cVar);
                    } else {
                        cVar = this.f1824e.get(i3);
                    }
                    int i6 = bVar.f1827c[i5 + 1];
                    cVar.f1829a = i6 <= abs;
                    cVar.f1830b = abs;
                    cVar.f1831c = i6;
                    cVar.f1832d = recyclerView2;
                    cVar.f1833e = bVar.f1827c[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f1824e, g);
    }

    private void c(c cVar, long j) {
        RecyclerView.b0 i = i(cVar.f1832d, cVar.f1833e, cVar.f1829a ? Long.MAX_VALUE : j);
        if (i != null && i.f1687b != null && i.r() && !i.s()) {
            h((RecyclerView) i.f1687b.get(), j);
        }
    }

    private void d(long j) {
        int i = 0;
        while (i < this.f1824e.size()) {
            c cVar = this.f1824e.get(i);
            if (cVar.f1832d != null) {
                c(cVar, j);
                cVar.a();
                i++;
            } else {
                return;
            }
        }
    }

    static boolean e(RecyclerView recyclerView, int i) {
        int j = recyclerView.f1669f.j();
        for (int i2 = 0; i2 < j; i2++) {
            RecyclerView.b0 f0 = RecyclerView.f0(recyclerView.f1669f.i(i2));
            if (f0.f1688c == i && !f0.s()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.E && recyclerView.f1669f.j() != 0) {
                recyclerView.T0();
            }
            b bVar = recyclerView.h0;
            bVar.c(recyclerView, true);
            if (bVar.f1828d != 0) {
                try {
                    androidx.core.os.a.a("RV Nested Prefetch");
                    recyclerView.i0.f(recyclerView.m);
                    for (int i = 0; i < bVar.f1828d * 2; i += 2) {
                        i(recyclerView, bVar.f1827c[i], j);
                    }
                } finally {
                    androidx.core.os.a.b();
                }
            }
        }
    }

    private RecyclerView.b0 i(RecyclerView recyclerView, int i, long j) {
        if (e(recyclerView, i)) {
            return null;
        }
        RecyclerView.u uVar = recyclerView.f1666c;
        try {
            recyclerView.F0();
            RecyclerView.b0 I = uVar.I(i, false, j);
            if (I != null) {
                if (!I.r() || I.s()) {
                    uVar.a(I, false);
                } else {
                    uVar.B(I.f1686a);
                }
            }
            return I;
        } finally {
            recyclerView.H0(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        this.f1821b.add(recyclerView);
    }

    /* access modifiers changed from: package-private */
    public void f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f1822c == 0) {
            this.f1822c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.h0.e(i, i2);
    }

    /* access modifiers changed from: package-private */
    public void g(long j) {
        b();
        d(j);
    }

    public void j(RecyclerView recyclerView) {
        this.f1821b.remove(recyclerView);
    }

    public void run() {
        try {
            androidx.core.os.a.a("RV Prefetch");
            if (!this.f1821b.isEmpty()) {
                int size = this.f1821b.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f1821b.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j) + this.f1823d);
                    this.f1822c = 0;
                    androidx.core.os.a.b();
                }
            }
        } finally {
            this.f1822c = 0;
            androidx.core.os.a.b();
        }
    }
}
