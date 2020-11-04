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
    static final ThreadLocal<e> f1903f = new ThreadLocal<>();
    static Comparator<c> g = new a();

    /* renamed from: b  reason: collision with root package name */
    ArrayList<RecyclerView> f1904b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    long f1905c;

    /* renamed from: d  reason: collision with root package name */
    long f1906d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<c> f1907e = new ArrayList<>();

    /* compiled from: GapWorker */
    static class a implements Comparator<c> {
        a() {
        }

        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            if ((cVar.f1915d == null) == (cVar2.f1915d == null)) {
                boolean z = cVar.f1912a;
                if (z == cVar2.f1912a) {
                    int i = cVar2.f1913b - cVar.f1913b;
                    if (i != 0) {
                        return i;
                    }
                    int i2 = cVar.f1914c - cVar2.f1914c;
                    if (i2 != 0) {
                        return i2;
                    }
                    return 0;
                } else if (z) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (cVar.f1915d == null) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    /* compiled from: GapWorker */
    static class b implements RecyclerView.LayoutManager.c {

        /* renamed from: a  reason: collision with root package name */
        int f1908a;

        /* renamed from: b  reason: collision with root package name */
        int f1909b;

        /* renamed from: c  reason: collision with root package name */
        int[] f1910c;

        /* renamed from: d  reason: collision with root package name */
        int f1911d;

        b() {
        }

        public void a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f1911d * 2;
                int[] iArr = this.f1910c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f1910c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.f1910c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f1910c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.f1911d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            int[] iArr = this.f1910c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f1911d = 0;
        }

        /* access modifiers changed from: package-private */
        public void c(RecyclerView recyclerView, boolean z) {
            this.f1911d = 0;
            int[] iArr = this.f1910c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.n;
            if (recyclerView.m != null && layoutManager != null && layoutManager.s0()) {
                if (z) {
                    if (!recyclerView.f1751e.p()) {
                        layoutManager.o(recyclerView.m.c(), this);
                    }
                } else if (!recyclerView.m0()) {
                    layoutManager.n(this.f1908a, this.f1909b, recyclerView.i0, this);
                }
                int i = this.f1911d;
                if (i > layoutManager.m) {
                    layoutManager.m = i;
                    layoutManager.n = z;
                    recyclerView.f1749c.K();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean d(int i) {
            if (this.f1910c != null) {
                int i2 = this.f1911d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f1910c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void e(int i, int i2) {
            this.f1908a = i;
            this.f1909b = i2;
        }
    }

    /* compiled from: GapWorker */
    static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1912a;

        /* renamed from: b  reason: collision with root package name */
        public int f1913b;

        /* renamed from: c  reason: collision with root package name */
        public int f1914c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f1915d;

        /* renamed from: e  reason: collision with root package name */
        public int f1916e;

        c() {
        }

        public void a() {
            this.f1912a = false;
            this.f1913b = 0;
            this.f1914c = 0;
            this.f1915d = null;
            this.f1916e = 0;
        }
    }

    e() {
    }

    private void b() {
        c cVar;
        int size = this.f1904b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f1904b.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.h0.c(recyclerView, false);
                i += recyclerView.h0.f1911d;
            }
        }
        this.f1907e.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f1904b.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.h0;
                int abs = Math.abs(bVar.f1908a) + Math.abs(bVar.f1909b);
                for (int i5 = 0; i5 < bVar.f1911d * 2; i5 += 2) {
                    if (i3 >= this.f1907e.size()) {
                        cVar = new c();
                        this.f1907e.add(cVar);
                    } else {
                        cVar = this.f1907e.get(i3);
                    }
                    int i6 = bVar.f1910c[i5 + 1];
                    cVar.f1912a = i6 <= abs;
                    cVar.f1913b = abs;
                    cVar.f1914c = i6;
                    cVar.f1915d = recyclerView2;
                    cVar.f1916e = bVar.f1910c[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f1907e, g);
    }

    private void c(c cVar, long j) {
        RecyclerView.b0 i = i(cVar.f1915d, cVar.f1916e, cVar.f1912a ? Long.MAX_VALUE : j);
        if (i != null && i.f1770b != null && i.r() && !i.s()) {
            h((RecyclerView) i.f1770b.get(), j);
        }
    }

    private void d(long j) {
        int i = 0;
        while (i < this.f1907e.size()) {
            c cVar = this.f1907e.get(i);
            if (cVar.f1915d != null) {
                c(cVar, j);
                cVar.a();
                i++;
            } else {
                return;
            }
        }
    }

    static boolean e(RecyclerView recyclerView, int i) {
        int j = recyclerView.f1752f.j();
        for (int i2 = 0; i2 < j; i2++) {
            RecyclerView.b0 f0 = RecyclerView.f0(recyclerView.f1752f.i(i2));
            if (f0.f1771c == i && !f0.s()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.E && recyclerView.f1752f.j() != 0) {
                recyclerView.T0();
            }
            b bVar = recyclerView.h0;
            bVar.c(recyclerView, true);
            if (bVar.f1911d != 0) {
                try {
                    androidx.core.os.b.a("RV Nested Prefetch");
                    recyclerView.i0.f(recyclerView.m);
                    for (int i = 0; i < bVar.f1911d * 2; i += 2) {
                        i(recyclerView, bVar.f1910c[i], j);
                    }
                } finally {
                    androidx.core.os.b.b();
                }
            }
        }
    }

    private RecyclerView.b0 i(RecyclerView recyclerView, int i, long j) {
        if (e(recyclerView, i)) {
            return null;
        }
        RecyclerView.u uVar = recyclerView.f1749c;
        try {
            recyclerView.F0();
            RecyclerView.b0 I = uVar.I(i, false, j);
            if (I != null) {
                if (!I.r() || I.s()) {
                    uVar.a(I, false);
                } else {
                    uVar.B(I.f1769a);
                }
            }
            return I;
        } finally {
            recyclerView.H0(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        this.f1904b.add(recyclerView);
    }

    /* access modifiers changed from: package-private */
    public void f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f1905c == 0) {
            this.f1905c = recyclerView.getNanoTime();
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
        this.f1904b.remove(recyclerView);
    }

    public void run() {
        try {
            androidx.core.os.b.a("RV Prefetch");
            if (!this.f1904b.isEmpty()) {
                int size = this.f1904b.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f1904b.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j) + this.f1906d);
                    this.f1905c = 0;
                    androidx.core.os.b.b();
                }
            }
        } finally {
            this.f1905c = 0;
            androidx.core.os.b.b();
        }
    }
}
