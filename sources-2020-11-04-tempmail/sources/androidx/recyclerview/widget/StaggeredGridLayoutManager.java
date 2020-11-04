package androidx.recyclerview.widget;

import a.h.k.d0.d;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.LayoutManager {
    boolean A = false;
    private BitSet B;
    int C = -1;
    int D = Integer.MIN_VALUE;
    LazySpanLookup E = new LazySpanLookup();
    private int F = 2;
    private boolean G;
    private boolean H;
    private SavedState I;
    private int J;
    private final Rect K = new Rect();
    private final b L = new b();
    private boolean M = false;
    private boolean N = true;
    private int[] O;
    private final Runnable P = new a();
    private int s = -1;
    d[] t;
    h u;
    h v;
    private int w;
    private int x;
    private final f y;
    boolean z = false;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        int f1818b;

        /* renamed from: c  reason: collision with root package name */
        int f1819c;

        /* renamed from: d  reason: collision with root package name */
        int f1820d;

        /* renamed from: e  reason: collision with root package name */
        int[] f1821e;

        /* renamed from: f  reason: collision with root package name */
        int f1822f;
        int[] g;
        List<LazySpanLookup.FullSpanItem> h;
        boolean i;
        boolean j;
        boolean k;

        static class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f1821e = null;
            this.f1820d = 0;
            this.f1822f = 0;
            this.g = null;
            this.h = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f1818b);
            parcel.writeInt(this.f1819c);
            parcel.writeInt(this.f1820d);
            if (this.f1820d > 0) {
                parcel.writeIntArray(this.f1821e);
            }
            parcel.writeInt(this.f1822f);
            if (this.f1822f > 0) {
                parcel.writeIntArray(this.g);
            }
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeInt(this.k ? 1 : 0);
            parcel.writeList(this.h);
        }

        SavedState(Parcel parcel) {
            this.f1818b = parcel.readInt();
            this.f1819c = parcel.readInt();
            int readInt = parcel.readInt();
            this.f1820d = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f1821e = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f1822f = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.g = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.i = parcel.readInt() == 1;
            this.j = parcel.readInt() == 1;
            this.k = parcel.readInt() == 1 ? true : z;
            this.h = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f1820d = savedState.f1820d;
            this.f1818b = savedState.f1818b;
            this.f1819c = savedState.f1819c;
            this.f1821e = savedState.f1821e;
            this.f1822f = savedState.f1822f;
            this.g = savedState.g;
            this.i = savedState.i;
            this.j = savedState.j;
            this.k = savedState.k;
            this.h = savedState.h;
        }
    }

    class a implements Runnable {
        a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.M1();
        }
    }

    class b {

        /* renamed from: a  reason: collision with root package name */
        int f1824a;

        /* renamed from: b  reason: collision with root package name */
        int f1825b;

        /* renamed from: c  reason: collision with root package name */
        boolean f1826c;

        /* renamed from: d  reason: collision with root package name */
        boolean f1827d;

        /* renamed from: e  reason: collision with root package name */
        boolean f1828e;

        /* renamed from: f  reason: collision with root package name */
        int[] f1829f;

        b() {
            c();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int i;
            if (this.f1826c) {
                i = StaggeredGridLayoutManager.this.u.i();
            } else {
                i = StaggeredGridLayoutManager.this.u.m();
            }
            this.f1825b = i;
        }

        /* access modifiers changed from: package-private */
        public void b(int i) {
            if (this.f1826c) {
                this.f1825b = StaggeredGridLayoutManager.this.u.i() - i;
            } else {
                this.f1825b = StaggeredGridLayoutManager.this.u.m() + i;
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f1824a = -1;
            this.f1825b = Integer.MIN_VALUE;
            this.f1826c = false;
            this.f1827d = false;
            this.f1828e = false;
            int[] iArr = this.f1829f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* access modifiers changed from: package-private */
        public void d(d[] dVarArr) {
            int length = dVarArr.length;
            int[] iArr = this.f1829f;
            if (iArr == null || iArr.length < length) {
                this.f1829f = new int[StaggeredGridLayoutManager.this.t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f1829f[i] = dVarArr[i].p(Integer.MIN_VALUE);
            }
        }
    }

    public static class c extends RecyclerView.o {

        /* renamed from: e  reason: collision with root package name */
        d f1830e;

        /* renamed from: f  reason: collision with root package name */
        boolean f1831f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int e() {
            d dVar = this.f1830e;
            if (dVar == null) {
                return -1;
            }
            return dVar.f1836e;
        }

        public boolean f() {
            return this.f1831f;
        }

        public c(int i, int i2) {
            super(i, i2);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    class d {

        /* renamed from: a  reason: collision with root package name */
        ArrayList<View> f1832a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        int f1833b = Integer.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        int f1834c = Integer.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        int f1835d = 0;

        /* renamed from: e  reason: collision with root package name */
        final int f1836e;

        d(int i) {
            this.f1836e = i;
        }

        /* access modifiers changed from: package-private */
        public void a(View view) {
            c n = n(view);
            n.f1830e = this;
            this.f1832a.add(view);
            this.f1834c = Integer.MIN_VALUE;
            if (this.f1832a.size() == 1) {
                this.f1833b = Integer.MIN_VALUE;
            }
            if (n.c() || n.b()) {
                this.f1835d += StaggeredGridLayoutManager.this.u.e(view);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(boolean z, int i) {
            int i2;
            if (z) {
                i2 = l(Integer.MIN_VALUE);
            } else {
                i2 = p(Integer.MIN_VALUE);
            }
            e();
            if (i2 != Integer.MIN_VALUE) {
                if (z && i2 < StaggeredGridLayoutManager.this.u.i()) {
                    return;
                }
                if (z || i2 <= StaggeredGridLayoutManager.this.u.m()) {
                    if (i != Integer.MIN_VALUE) {
                        i2 += i;
                    }
                    this.f1834c = i2;
                    this.f1833b = i2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            LazySpanLookup.FullSpanItem f2;
            ArrayList<View> arrayList = this.f1832a;
            View view = arrayList.get(arrayList.size() - 1);
            c n = n(view);
            this.f1834c = StaggeredGridLayoutManager.this.u.d(view);
            if (n.f1831f && (f2 = StaggeredGridLayoutManager.this.E.f(n.a())) != null && f2.f1815c == 1) {
                this.f1834c += f2.a(this.f1836e);
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            LazySpanLookup.FullSpanItem f2;
            View view = this.f1832a.get(0);
            c n = n(view);
            this.f1833b = StaggeredGridLayoutManager.this.u.g(view);
            if (n.f1831f && (f2 = StaggeredGridLayoutManager.this.E.f(n.a())) != null && f2.f1815c == -1) {
                this.f1833b -= f2.a(this.f1836e);
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.f1832a.clear();
            q();
            this.f1835d = 0;
        }

        public int f() {
            if (StaggeredGridLayoutManager.this.z) {
                return i(this.f1832a.size() - 1, -1, true);
            }
            return i(0, this.f1832a.size(), true);
        }

        public int g() {
            if (StaggeredGridLayoutManager.this.z) {
                return i(0, this.f1832a.size(), true);
            }
            return i(this.f1832a.size() - 1, -1, true);
        }

        /* access modifiers changed from: package-private */
        public int h(int i, int i2, boolean z, boolean z2, boolean z3) {
            int m = StaggeredGridLayoutManager.this.u.m();
            int i3 = StaggeredGridLayoutManager.this.u.i();
            int i4 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f1832a.get(i);
                int g = StaggeredGridLayoutManager.this.u.g(view);
                int d2 = StaggeredGridLayoutManager.this.u.d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? g < i3 : g <= i3;
                if (!z3 ? d2 > m : d2 >= m) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.f0(view);
                        }
                        if (g < m || d2 > i3) {
                            return StaggeredGridLayoutManager.this.f0(view);
                        }
                    } else if (g >= m && d2 <= i3) {
                        return StaggeredGridLayoutManager.this.f0(view);
                    }
                }
                i += i4;
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public int i(int i, int i2, boolean z) {
            return h(i, i2, false, false, z);
        }

        public int j() {
            return this.f1835d;
        }

        /* access modifiers changed from: package-private */
        public int k() {
            int i = this.f1834c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            c();
            return this.f1834c;
        }

        /* access modifiers changed from: package-private */
        public int l(int i) {
            int i2 = this.f1834c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f1832a.size() == 0) {
                return i;
            }
            c();
            return this.f1834c;
        }

        public View m(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f1832a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f1832a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.z && staggeredGridLayoutManager.f0(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.z && staggeredGridLayoutManager2.f0(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f1832a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f1832a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.z && staggeredGridLayoutManager3.f0(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.z && staggeredGridLayoutManager4.f0(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: package-private */
        public c n(View view) {
            return (c) view.getLayoutParams();
        }

        /* access modifiers changed from: package-private */
        public int o() {
            int i = this.f1833b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            d();
            return this.f1833b;
        }

        /* access modifiers changed from: package-private */
        public int p(int i) {
            int i2 = this.f1833b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f1832a.size() == 0) {
                return i;
            }
            d();
            return this.f1833b;
        }

        /* access modifiers changed from: package-private */
        public void q() {
            this.f1833b = Integer.MIN_VALUE;
            this.f1834c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public void r(int i) {
            int i2 = this.f1833b;
            if (i2 != Integer.MIN_VALUE) {
                this.f1833b = i2 + i;
            }
            int i3 = this.f1834c;
            if (i3 != Integer.MIN_VALUE) {
                this.f1834c = i3 + i;
            }
        }

        /* access modifiers changed from: package-private */
        public void s() {
            int size = this.f1832a.size();
            View remove = this.f1832a.remove(size - 1);
            c n = n(remove);
            n.f1830e = null;
            if (n.c() || n.b()) {
                this.f1835d -= StaggeredGridLayoutManager.this.u.e(remove);
            }
            if (size == 1) {
                this.f1833b = Integer.MIN_VALUE;
            }
            this.f1834c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public void t() {
            View remove = this.f1832a.remove(0);
            c n = n(remove);
            n.f1830e = null;
            if (this.f1832a.size() == 0) {
                this.f1834c = Integer.MIN_VALUE;
            }
            if (n.c() || n.b()) {
                this.f1835d -= StaggeredGridLayoutManager.this.u.e(remove);
            }
            this.f1833b = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public void u(View view) {
            c n = n(view);
            n.f1830e = this;
            this.f1832a.add(0, view);
            this.f1833b = Integer.MIN_VALUE;
            if (this.f1832a.size() == 1) {
                this.f1834c = Integer.MIN_VALUE;
            }
            if (n.c() || n.b()) {
                this.f1835d += StaggeredGridLayoutManager.this.u.e(view);
            }
        }

        /* access modifiers changed from: package-private */
        public void v(int i) {
            this.f1833b = i;
            this.f1834c = i;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.LayoutManager.Properties g0 = RecyclerView.LayoutManager.g0(context, attributeSet, i, i2);
        B2(g0.orientation);
        D2(g0.spanCount);
        C2(g0.reverseLayout);
        this.y = new f();
        U1();
    }

    private void A2(int i) {
        f fVar = this.y;
        fVar.f1921e = i;
        int i2 = 1;
        if (this.A != (i == -1)) {
            i2 = -1;
        }
        fVar.f1920d = i2;
    }

    private void E2(int i, int i2) {
        for (int i3 = 0; i3 < this.s; i3++) {
            if (!this.t[i3].f1832a.isEmpty()) {
                K2(this.t[i3], i, i2);
            }
        }
    }

    private boolean F2(RecyclerView.y yVar, b bVar) {
        int i;
        if (this.G) {
            i = a2(yVar.b());
        } else {
            i = W1(yVar.b());
        }
        bVar.f1824a = i;
        bVar.f1825b = Integer.MIN_VALUE;
        return true;
    }

    private void G1(View view) {
        for (int i = this.s - 1; i >= 0; i--) {
            this.t[i].a(view);
        }
    }

    private void H1(b bVar) {
        int i;
        SavedState savedState = this.I;
        int i2 = savedState.f1820d;
        if (i2 > 0) {
            if (i2 == this.s) {
                for (int i3 = 0; i3 < this.s; i3++) {
                    this.t[i3].e();
                    SavedState savedState2 = this.I;
                    int i4 = savedState2.f1821e[i3];
                    if (i4 != Integer.MIN_VALUE) {
                        if (savedState2.j) {
                            i = this.u.i();
                        } else {
                            i = this.u.m();
                        }
                        i4 += i;
                    }
                    this.t[i3].v(i4);
                }
            } else {
                savedState.a();
                SavedState savedState3 = this.I;
                savedState3.f1818b = savedState3.f1819c;
            }
        }
        SavedState savedState4 = this.I;
        this.H = savedState4.k;
        C2(savedState4.i);
        y2();
        SavedState savedState5 = this.I;
        int i5 = savedState5.f1818b;
        if (i5 != -1) {
            this.C = i5;
            bVar.f1826c = savedState5.j;
        } else {
            bVar.f1826c = this.A;
        }
        SavedState savedState6 = this.I;
        if (savedState6.f1822f > 1) {
            LazySpanLookup lazySpanLookup = this.E;
            lazySpanLookup.f1812a = savedState6.g;
            lazySpanLookup.f1813b = savedState6.h;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void I2(int r5, androidx.recyclerview.widget.RecyclerView.y r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.f r0 = r4.y
            r1 = 0
            r0.f1918b = r1
            r0.f1919c = r5
            boolean r0 = r4.v0()
            r2 = 1
            if (r0 == 0) goto L_0x002e
            int r6 = r6.c()
            r0 = -1
            if (r6 == r0) goto L_0x002e
            boolean r0 = r4.A
            if (r6 >= r5) goto L_0x001b
            r5 = 1
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            if (r0 != r5) goto L_0x0025
            androidx.recyclerview.widget.h r5 = r4.u
            int r5 = r5.n()
            goto L_0x002f
        L_0x0025:
            androidx.recyclerview.widget.h r5 = r4.u
            int r5 = r5.n()
            r6 = r5
            r5 = 0
            goto L_0x0030
        L_0x002e:
            r5 = 0
        L_0x002f:
            r6 = 0
        L_0x0030:
            boolean r0 = r4.L()
            if (r0 == 0) goto L_0x004d
            androidx.recyclerview.widget.f r0 = r4.y
            androidx.recyclerview.widget.h r3 = r4.u
            int r3 = r3.m()
            int r3 = r3 - r6
            r0.f1922f = r3
            androidx.recyclerview.widget.f r6 = r4.y
            androidx.recyclerview.widget.h r0 = r4.u
            int r0 = r0.i()
            int r0 = r0 + r5
            r6.g = r0
            goto L_0x005d
        L_0x004d:
            androidx.recyclerview.widget.f r0 = r4.y
            androidx.recyclerview.widget.h r3 = r4.u
            int r3 = r3.h()
            int r3 = r3 + r5
            r0.g = r3
            androidx.recyclerview.widget.f r5 = r4.y
            int r6 = -r6
            r5.f1922f = r6
        L_0x005d:
            androidx.recyclerview.widget.f r5 = r4.y
            r5.h = r1
            r5.f1917a = r2
            androidx.recyclerview.widget.h r6 = r4.u
            int r6 = r6.k()
            if (r6 != 0) goto L_0x0074
            androidx.recyclerview.widget.h r6 = r4.u
            int r6 = r6.h()
            if (r6 != 0) goto L_0x0074
            r1 = 1
        L_0x0074:
            r5.i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.I2(int, androidx.recyclerview.widget.RecyclerView$y):void");
    }

    private void K1(View view, c cVar, f fVar) {
        if (fVar.f1921e == 1) {
            if (cVar.f1831f) {
                G1(view);
            } else {
                cVar.f1830e.a(view);
            }
        } else if (cVar.f1831f) {
            t2(view);
        } else {
            cVar.f1830e.u(view);
        }
    }

    private void K2(d dVar, int i, int i2) {
        int j = dVar.j();
        if (i == -1) {
            if (dVar.o() + j <= i2) {
                this.B.set(dVar.f1836e, false);
            }
        } else if (dVar.k() - j >= i2) {
            this.B.set(dVar.f1836e, false);
        }
    }

    private int L1(int i) {
        if (I() != 0) {
            if ((i < d2()) != this.A) {
                return -1;
            }
            return 1;
        } else if (this.A) {
            return 1;
        } else {
            return -1;
        }
    }

    private int L2(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    private boolean N1(d dVar) {
        if (this.A) {
            if (dVar.k() < this.u.i()) {
                ArrayList<View> arrayList = dVar.f1832a;
                return !dVar.n(arrayList.get(arrayList.size() - 1)).f1831f;
            }
        } else if (dVar.o() > this.u.m()) {
            return !dVar.n(dVar.f1832a.get(0)).f1831f;
        }
        return false;
    }

    private int O1(RecyclerView.y yVar) {
        if (I() == 0) {
            return 0;
        }
        return j.a(yVar, this.u, Y1(!this.N), X1(!this.N), this, this.N);
    }

    private int P1(RecyclerView.y yVar) {
        if (I() == 0) {
            return 0;
        }
        return j.b(yVar, this.u, Y1(!this.N), X1(!this.N), this, this.N, this.A);
    }

    private int Q1(RecyclerView.y yVar) {
        if (I() == 0) {
            return 0;
        }
        return j.c(yVar, this.u, Y1(!this.N), X1(!this.N), this, this.N);
    }

    private int R1(int i) {
        if (i == 1) {
            return (this.w != 1 && n2()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.w != 1 && n2()) ? -1 : 1;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    return (i == 130 && this.w == 1) ? 1 : Integer.MIN_VALUE;
                }
                if (this.w == 0) {
                    return 1;
                }
                return Integer.MIN_VALUE;
            } else if (this.w == 1) {
                return -1;
            } else {
                return Integer.MIN_VALUE;
            }
        } else if (this.w == 0) {
            return -1;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    private LazySpanLookup.FullSpanItem S1(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f1816d = new int[this.s];
        for (int i2 = 0; i2 < this.s; i2++) {
            fullSpanItem.f1816d[i2] = i - this.t[i2].l(i);
        }
        return fullSpanItem;
    }

    private LazySpanLookup.FullSpanItem T1(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f1816d = new int[this.s];
        for (int i2 = 0; i2 < this.s; i2++) {
            fullSpanItem.f1816d[i2] = this.t[i2].p(i) - i;
        }
        return fullSpanItem;
    }

    private void U1() {
        this.u = h.b(this, this.w);
        this.v = h.b(this, 1 - this.w);
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r9v5 */
    private int V1(RecyclerView.u uVar, f fVar, RecyclerView.y yVar) {
        int i;
        int i2;
        int i3;
        d dVar;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int i10;
        int i11;
        int i12;
        RecyclerView.u uVar2 = uVar;
        f fVar2 = fVar;
        ? r9 = 0;
        this.B.set(0, this.s, true);
        if (this.y.i) {
            i = fVar2.f1921e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            if (fVar2.f1921e == 1) {
                i12 = fVar2.g + fVar2.f1918b;
            } else {
                i12 = fVar2.f1922f - fVar2.f1918b;
            }
            i = i12;
        }
        E2(fVar2.f1921e, i);
        if (this.A) {
            i2 = this.u.i();
        } else {
            i2 = this.u.m();
        }
        int i13 = i2;
        boolean z3 = false;
        while (fVar.a(yVar) && (this.y.i || !this.B.isEmpty())) {
            View b2 = fVar2.b(uVar2);
            c cVar = (c) b2.getLayoutParams();
            int a2 = cVar.a();
            int g = this.E.g(a2);
            boolean z4 = g == -1;
            if (z4) {
                dVar = cVar.f1831f ? this.t[r9] : j2(fVar2);
                this.E.n(a2, dVar);
            } else {
                dVar = this.t[g];
            }
            d dVar2 = dVar;
            cVar.f1830e = dVar2;
            if (fVar2.f1921e == 1) {
                c(b2);
            } else {
                d(b2, r9);
            }
            p2(b2, cVar, r9);
            if (fVar2.f1921e == 1) {
                if (cVar.f1831f) {
                    i11 = f2(i13);
                } else {
                    i11 = dVar2.l(i13);
                }
                int e2 = this.u.e(b2) + i11;
                if (z4 && cVar.f1831f) {
                    LazySpanLookup.FullSpanItem S1 = S1(i11);
                    S1.f1815c = -1;
                    S1.f1814b = a2;
                    this.E.a(S1);
                }
                i4 = e2;
                i5 = i11;
            } else {
                if (cVar.f1831f) {
                    i10 = i2(i13);
                } else {
                    i10 = dVar2.p(i13);
                }
                i5 = i10 - this.u.e(b2);
                if (z4 && cVar.f1831f) {
                    LazySpanLookup.FullSpanItem T1 = T1(i10);
                    T1.f1815c = 1;
                    T1.f1814b = a2;
                    this.E.a(T1);
                }
                i4 = i10;
            }
            if (cVar.f1831f && fVar2.f1920d == -1) {
                if (z4) {
                    this.M = true;
                } else {
                    if (fVar2.f1921e == 1) {
                        z2 = I1();
                    } else {
                        z2 = J1();
                    }
                    if (!z2) {
                        LazySpanLookup.FullSpanItem f2 = this.E.f(a2);
                        if (f2 != null) {
                            f2.f1817e = true;
                        }
                        this.M = true;
                    }
                }
            }
            K1(b2, cVar, fVar2);
            if (!n2() || this.w != 1) {
                if (cVar.f1831f) {
                    i8 = this.v.m();
                } else {
                    i8 = (dVar2.f1836e * this.x) + this.v.m();
                }
                i7 = i8;
                i6 = this.v.e(b2) + i8;
            } else {
                if (cVar.f1831f) {
                    i9 = this.v.i();
                } else {
                    i9 = this.v.i() - (((this.s - 1) - dVar2.f1836e) * this.x);
                }
                i6 = i9;
                i7 = i9 - this.v.e(b2);
            }
            if (this.w == 1) {
                x0(b2, i7, i5, i6, i4);
            } else {
                x0(b2, i5, i7, i4, i6);
            }
            if (cVar.f1831f) {
                E2(this.y.f1921e, i);
            } else {
                K2(dVar2, this.y.f1921e, i);
            }
            u2(uVar2, this.y);
            if (this.y.h && b2.hasFocusable()) {
                if (cVar.f1831f) {
                    this.B.clear();
                } else {
                    this.B.set(dVar2.f1836e, false);
                    z3 = true;
                    r9 = 0;
                }
            }
            z3 = true;
            r9 = 0;
        }
        if (!z3) {
            u2(uVar2, this.y);
        }
        if (this.y.f1921e == -1) {
            i3 = this.u.m() - i2(this.u.m());
        } else {
            i3 = f2(this.u.i()) - this.u.i();
        }
        if (i3 > 0) {
            return Math.min(fVar2.f1918b, i3);
        }
        return 0;
    }

    private int W1(int i) {
        int I2 = I();
        for (int i2 = 0; i2 < I2; i2++) {
            int f0 = f0(H(i2));
            if (f0 >= 0 && f0 < i) {
                return f0;
            }
        }
        return 0;
    }

    private int a2(int i) {
        for (int I2 = I() - 1; I2 >= 0; I2--) {
            int f0 = f0(H(I2));
            if (f0 >= 0 && f0 < i) {
                return f0;
            }
        }
        return 0;
    }

    private void b2(RecyclerView.u uVar, RecyclerView.y yVar, boolean z2) {
        int i;
        int f2 = f2(Integer.MIN_VALUE);
        if (f2 != Integer.MIN_VALUE && (i = this.u.i() - f2) > 0) {
            int i2 = i - (-z2(-i, uVar, yVar));
            if (z2 && i2 > 0) {
                this.u.r(i2);
            }
        }
    }

    private void c2(RecyclerView.u uVar, RecyclerView.y yVar, boolean z2) {
        int m;
        int i2 = i2(Integer.MAX_VALUE);
        if (i2 != Integer.MAX_VALUE && (m = i2 - this.u.m()) > 0) {
            int z22 = m - z2(m, uVar, yVar);
            if (z2 && z22 > 0) {
                this.u.r(-z22);
            }
        }
    }

    private int f2(int i) {
        int l = this.t[0].l(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int l2 = this.t[i2].l(i);
            if (l2 > l) {
                l = l2;
            }
        }
        return l;
    }

    private int g2(int i) {
        int p = this.t[0].p(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int p2 = this.t[i2].p(i);
            if (p2 > p) {
                p = p2;
            }
        }
        return p;
    }

    private int h2(int i) {
        int l = this.t[0].l(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int l2 = this.t[i2].l(i);
            if (l2 < l) {
                l = l2;
            }
        }
        return l;
    }

    private int i2(int i) {
        int p = this.t[0].p(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int p2 = this.t[i2].p(i);
            if (p2 < p) {
                p = p2;
            }
        }
        return p;
    }

    private d j2(f fVar) {
        int i;
        int i2;
        int i3 = -1;
        if (r2(fVar.f1921e)) {
            i2 = this.s - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.s;
            i = 1;
        }
        d dVar = null;
        if (fVar.f1921e == 1) {
            int i4 = Integer.MAX_VALUE;
            int m = this.u.m();
            while (i2 != i3) {
                d dVar2 = this.t[i2];
                int l = dVar2.l(m);
                if (l < i4) {
                    dVar = dVar2;
                    i4 = l;
                }
                i2 += i;
            }
            return dVar;
        }
        int i5 = Integer.MIN_VALUE;
        int i6 = this.u.i();
        while (i2 != i3) {
            d dVar3 = this.t[i2];
            int p = dVar3.p(i6);
            if (p > i5) {
                dVar = dVar3;
                i5 = p;
            }
            i2 += i;
        }
        return dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void k2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L_0x0009
            int r0 = r6.e2()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.d2()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.E
            r7.j(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.k(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.j(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.A
            if (r7 == 0) goto L_0x004d
            int r7 = r6.d2()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.e2()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.q1()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.k2(int, int, int):void");
    }

    private void o2(View view, int i, int i2, boolean z2) {
        boolean z3;
        i(view, this.K);
        c cVar = (c) view.getLayoutParams();
        int i3 = cVar.leftMargin;
        Rect rect = this.K;
        int L2 = L2(i, i3 + rect.left, cVar.rightMargin + rect.right);
        int i4 = cVar.topMargin;
        Rect rect2 = this.K;
        int L22 = L2(i2, i4 + rect2.top, cVar.bottomMargin + rect2.bottom);
        if (z2) {
            z3 = D1(view, L2, L22, cVar);
        } else {
            z3 = B1(view, L2, L22, cVar);
        }
        if (z3) {
            view.measure(L2, L22);
        }
    }

    private void p2(View view, c cVar, boolean z2) {
        if (cVar.f1831f) {
            if (this.w == 1) {
                o2(view, this.J, RecyclerView.LayoutManager.J(V(), W(), e0() + b0(), cVar.height, true), z2);
            } else {
                o2(view, RecyclerView.LayoutManager.J(m0(), n0(), c0() + d0(), cVar.width, true), this.J, z2);
            }
        } else if (this.w == 1) {
            o2(view, RecyclerView.LayoutManager.J(this.x, n0(), 0, cVar.width, false), RecyclerView.LayoutManager.J(V(), W(), e0() + b0(), cVar.height, true), z2);
        } else {
            o2(view, RecyclerView.LayoutManager.J(m0(), n0(), c0() + d0(), cVar.width, true), RecyclerView.LayoutManager.J(this.x, W(), 0, cVar.height, false), z2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0157, code lost:
        if (M1() != false) goto L_0x015b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void q2(androidx.recyclerview.widget.RecyclerView.u r9, androidx.recyclerview.widget.RecyclerView.y r10, boolean r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r8.L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r8.I
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.C
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.b()
            if (r1 != 0) goto L_0x0018
            r8.h1(r9)
            r0.c()
            return
        L_0x0018:
            boolean r1 = r0.f1828e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.C
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r8.I
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.I
            if (r5 == 0) goto L_0x0037
            r8.H1(r0)
            goto L_0x003e
        L_0x0037:
            r8.y2()
            boolean r5 = r8.A
            r0.f1826c = r5
        L_0x003e:
            r8.H2(r10, r0)
            r0.f1828e = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.I
            if (r5 != 0) goto L_0x0060
            int r5 = r8.C
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f1826c
            boolean r6 = r8.G
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.n2()
            boolean r6 = r8.H
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r5 = r8.E
            r5.b()
            r0.f1827d = r4
        L_0x0060:
            int r5 = r8.I()
            if (r5 <= 0) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.I
            if (r5 == 0) goto L_0x006e
            int r5 = r5.f1820d
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.f1827d
            if (r5 == 0) goto L_0x008e
            r1 = 0
        L_0x0073:
            int r5 = r8.s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.t
            r5 = r5[r1]
            r5.e()
            int r5 = r0.f1825b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r6 = r8.t
            r6 = r6[r1]
            r6.v(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.L
            int[] r1 = r1.f1829f
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = 0
        L_0x0098:
            int r5 = r8.s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.t
            r5 = r5[r1]
            r5.e()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r6 = r8.L
            int[] r6 = r6.f1829f
            r6 = r6[r1]
            r5.v(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = 0
        L_0x00b0:
            int r5 = r8.s
            if (r1 >= r5) goto L_0x00c2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.t
            r5 = r5[r1]
            boolean r6 = r8.A
            int r7 = r0.f1825b
            r5.b(r6, r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.t
            r1.d(r5)
        L_0x00c9:
            r8.v(r9)
            androidx.recyclerview.widget.f r1 = r8.y
            r1.f1917a = r3
            r8.M = r3
            androidx.recyclerview.widget.h r1 = r8.v
            int r1 = r1.n()
            r8.J2(r1)
            int r1 = r0.f1824a
            r8.I2(r1, r10)
            boolean r1 = r0.f1826c
            if (r1 == 0) goto L_0x00fc
            r8.A2(r2)
            androidx.recyclerview.widget.f r1 = r8.y
            r8.V1(r9, r1, r10)
            r8.A2(r4)
            androidx.recyclerview.widget.f r1 = r8.y
            int r2 = r0.f1824a
            int r5 = r1.f1920d
            int r2 = r2 + r5
            r1.f1919c = r2
            r8.V1(r9, r1, r10)
            goto L_0x0113
        L_0x00fc:
            r8.A2(r4)
            androidx.recyclerview.widget.f r1 = r8.y
            r8.V1(r9, r1, r10)
            r8.A2(r2)
            androidx.recyclerview.widget.f r1 = r8.y
            int r2 = r0.f1824a
            int r5 = r1.f1920d
            int r2 = r2 + r5
            r1.f1919c = r2
            r8.V1(r9, r1, r10)
        L_0x0113:
            r8.x2()
            int r1 = r8.I()
            if (r1 <= 0) goto L_0x012d
            boolean r1 = r8.A
            if (r1 == 0) goto L_0x0127
            r8.b2(r9, r10, r4)
            r8.c2(r9, r10, r3)
            goto L_0x012d
        L_0x0127:
            r8.c2(r9, r10, r4)
            r8.b2(r9, r10, r3)
        L_0x012d:
            if (r11 == 0) goto L_0x015a
            boolean r11 = r10.e()
            if (r11 != 0) goto L_0x015a
            int r11 = r8.F
            if (r11 == 0) goto L_0x014b
            int r11 = r8.I()
            if (r11 <= 0) goto L_0x014b
            boolean r11 = r8.M
            if (r11 != 0) goto L_0x0149
            android.view.View r11 = r8.l2()
            if (r11 == 0) goto L_0x014b
        L_0x0149:
            r11 = 1
            goto L_0x014c
        L_0x014b:
            r11 = 0
        L_0x014c:
            if (r11 == 0) goto L_0x015a
            java.lang.Runnable r11 = r8.P
            r8.l1(r11)
            boolean r11 = r8.M1()
            if (r11 == 0) goto L_0x015a
            goto L_0x015b
        L_0x015a:
            r4 = 0
        L_0x015b:
            boolean r11 = r10.e()
            if (r11 == 0) goto L_0x0166
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.L
            r11.c()
        L_0x0166:
            boolean r11 = r0.f1826c
            r8.G = r11
            boolean r11 = r8.n2()
            r8.H = r11
            if (r4 == 0) goto L_0x017a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.L
            r11.c()
            r8.q2(r9, r10, r3)
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.q2(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$y, boolean):void");
    }

    private boolean r2(int i) {
        if (this.w == 0) {
            if ((i == -1) != this.A) {
                return true;
            }
            return false;
        }
        if (((i == -1) == this.A) == n2()) {
            return true;
        }
        return false;
    }

    private void t2(View view) {
        for (int i = this.s - 1; i >= 0; i--) {
            this.t[i].u(view);
        }
    }

    private void u2(RecyclerView.u uVar, f fVar) {
        int i;
        int i2;
        if (fVar.f1917a && !fVar.i) {
            if (fVar.f1918b == 0) {
                if (fVar.f1921e == -1) {
                    v2(uVar, fVar.g);
                } else {
                    w2(uVar, fVar.f1922f);
                }
            } else if (fVar.f1921e == -1) {
                int i3 = fVar.f1922f;
                int g2 = i3 - g2(i3);
                if (g2 < 0) {
                    i2 = fVar.g;
                } else {
                    i2 = fVar.g - Math.min(g2, fVar.f1918b);
                }
                v2(uVar, i2);
            } else {
                int h2 = h2(fVar.g) - fVar.g;
                if (h2 < 0) {
                    i = fVar.f1922f;
                } else {
                    i = Math.min(h2, fVar.f1918b) + fVar.f1922f;
                }
                w2(uVar, i);
            }
        }
    }

    private void v2(RecyclerView.u uVar, int i) {
        int I2 = I() - 1;
        while (I2 >= 0) {
            View H2 = H(I2);
            if (this.u.g(H2) >= i && this.u.q(H2) >= i) {
                c cVar = (c) H2.getLayoutParams();
                if (cVar.f1831f) {
                    int i2 = 0;
                    while (i2 < this.s) {
                        if (this.t[i2].f1832a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.s; i3++) {
                        this.t[i3].s();
                    }
                } else if (cVar.f1830e.f1832a.size() != 1) {
                    cVar.f1830e.s();
                } else {
                    return;
                }
                j1(H2, uVar);
                I2--;
            } else {
                return;
            }
        }
    }

    private void w2(RecyclerView.u uVar, int i) {
        while (I() > 0) {
            View H2 = H(0);
            if (this.u.d(H2) <= i && this.u.p(H2) <= i) {
                c cVar = (c) H2.getLayoutParams();
                if (cVar.f1831f) {
                    int i2 = 0;
                    while (i2 < this.s) {
                        if (this.t[i2].f1832a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.s; i3++) {
                        this.t[i3].t();
                    }
                } else if (cVar.f1830e.f1832a.size() != 1) {
                    cVar.f1830e.t();
                } else {
                    return;
                }
                j1(H2, uVar);
            } else {
                return;
            }
        }
    }

    private void x2() {
        if (this.v.k() != 1073741824) {
            float f2 = 0.0f;
            int I2 = I();
            for (int i = 0; i < I2; i++) {
                View H2 = H(i);
                float e2 = (float) this.v.e(H2);
                if (e2 >= f2) {
                    if (((c) H2.getLayoutParams()).f()) {
                        e2 = (e2 * 1.0f) / ((float) this.s);
                    }
                    f2 = Math.max(f2, e2);
                }
            }
            int i2 = this.x;
            int round = Math.round(f2 * ((float) this.s));
            if (this.v.k() == Integer.MIN_VALUE) {
                round = Math.min(round, this.v.n());
            }
            J2(round);
            if (this.x != i2) {
                for (int i3 = 0; i3 < I2; i3++) {
                    View H3 = H(i3);
                    c cVar = (c) H3.getLayoutParams();
                    if (!cVar.f1831f) {
                        if (!n2() || this.w != 1) {
                            int i4 = cVar.f1830e.f1836e;
                            int i5 = this.x * i4;
                            int i6 = i4 * i2;
                            if (this.w == 1) {
                                H3.offsetLeftAndRight(i5 - i6);
                            } else {
                                H3.offsetTopAndBottom(i5 - i6);
                            }
                        } else {
                            int i7 = this.s;
                            int i8 = cVar.f1830e.f1836e;
                            H3.offsetLeftAndRight(((-((i7 - 1) - i8)) * this.x) - ((-((i7 - 1) - i8)) * i2));
                        }
                    }
                }
            }
        }
    }

    private void y2() {
        if (this.w == 1 || !n2()) {
            this.A = this.z;
        } else {
            this.A = !this.z;
        }
    }

    public void A0(int i) {
        super.A0(i);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].r(i);
        }
    }

    public void B0(int i) {
        super.B0(i);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].r(i);
        }
    }

    public void B2(int i) {
        if (i == 0 || i == 1) {
            f((String) null);
            if (i != this.w) {
                this.w = i;
                h hVar = this.u;
                this.u = this.v;
                this.v = hVar;
                q1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public RecyclerView.o C() {
        if (this.w == 0) {
            return new c(-2, -1);
        }
        return new c(-1, -2);
    }

    public void C2(boolean z2) {
        f((String) null);
        SavedState savedState = this.I;
        if (!(savedState == null || savedState.i == z2)) {
            savedState.i = z2;
        }
        this.z = z2;
        q1();
    }

    public RecyclerView.o D(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public void D2(int i) {
        f((String) null);
        if (i != this.s) {
            m2();
            this.s = i;
            this.B = new BitSet(this.s);
            this.t = new d[this.s];
            for (int i2 = 0; i2 < this.s; i2++) {
                this.t[i2] = new d(i2);
            }
            q1();
        }
    }

    public RecyclerView.o E(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    public boolean F1() {
        return this.I == null;
    }

    public void G0(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.G0(recyclerView, uVar);
        l1(this.P);
        for (int i = 0; i < this.s; i++) {
            this.t[i].e();
        }
        recyclerView.requestLayout();
    }

    /* access modifiers changed from: package-private */
    public boolean G2(RecyclerView.y yVar, b bVar) {
        int i;
        int i2;
        int i3;
        boolean z2 = false;
        if (!yVar.e() && (i = this.C) != -1) {
            if (i < 0 || i >= yVar.b()) {
                this.C = -1;
                this.D = Integer.MIN_VALUE;
            } else {
                SavedState savedState = this.I;
                if (savedState == null || savedState.f1818b == -1 || savedState.f1820d < 1) {
                    View B2 = B(this.C);
                    if (B2 != null) {
                        if (this.A) {
                            i2 = e2();
                        } else {
                            i2 = d2();
                        }
                        bVar.f1824a = i2;
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.f1826c) {
                                bVar.f1825b = (this.u.i() - this.D) - this.u.d(B2);
                            } else {
                                bVar.f1825b = (this.u.m() + this.D) - this.u.g(B2);
                            }
                            return true;
                        } else if (this.u.e(B2) > this.u.n()) {
                            if (bVar.f1826c) {
                                i3 = this.u.i();
                            } else {
                                i3 = this.u.m();
                            }
                            bVar.f1825b = i3;
                            return true;
                        } else {
                            int g = this.u.g(B2) - this.u.m();
                            if (g < 0) {
                                bVar.f1825b = -g;
                                return true;
                            }
                            int i4 = this.u.i() - this.u.d(B2);
                            if (i4 < 0) {
                                bVar.f1825b = i4;
                                return true;
                            }
                            bVar.f1825b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i5 = this.C;
                        bVar.f1824a = i5;
                        int i6 = this.D;
                        if (i6 == Integer.MIN_VALUE) {
                            if (L1(i5) == 1) {
                                z2 = true;
                            }
                            bVar.f1826c = z2;
                            bVar.a();
                        } else {
                            bVar.b(i6);
                        }
                        bVar.f1827d = true;
                    }
                } else {
                    bVar.f1825b = Integer.MIN_VALUE;
                    bVar.f1824a = this.C;
                }
                return true;
            }
        }
        return false;
    }

    public View H0(View view, int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        View A2;
        int i2;
        int i3;
        int i4;
        int i5;
        View m;
        if (I() == 0 || (A2 = A(view)) == null) {
            return null;
        }
        y2();
        int R1 = R1(i);
        if (R1 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) A2.getLayoutParams();
        boolean z2 = cVar.f1831f;
        d dVar = cVar.f1830e;
        if (R1 == 1) {
            i2 = e2();
        } else {
            i2 = d2();
        }
        I2(i2, yVar);
        A2(R1);
        f fVar = this.y;
        fVar.f1919c = fVar.f1920d + i2;
        fVar.f1918b = (int) (((float) this.u.n()) * 0.33333334f);
        f fVar2 = this.y;
        fVar2.h = true;
        fVar2.f1917a = false;
        V1(uVar, fVar2, yVar);
        this.G = this.A;
        if (!z2 && (m = dVar.m(i2, R1)) != null && m != A2) {
            return m;
        }
        if (r2(R1)) {
            for (int i6 = this.s - 1; i6 >= 0; i6--) {
                View m2 = this.t[i6].m(i2, R1);
                if (m2 != null && m2 != A2) {
                    return m2;
                }
            }
        } else {
            for (int i7 = 0; i7 < this.s; i7++) {
                View m3 = this.t[i7].m(i2, R1);
                if (m3 != null && m3 != A2) {
                    return m3;
                }
            }
        }
        boolean z3 = (this.z ^ true) == (R1 == -1);
        if (!z2) {
            if (z3) {
                i5 = dVar.f();
            } else {
                i5 = dVar.g();
            }
            View B2 = B(i5);
            if (!(B2 == null || B2 == A2)) {
                return B2;
            }
        }
        if (r2(R1)) {
            for (int i8 = this.s - 1; i8 >= 0; i8--) {
                if (i8 != dVar.f1836e) {
                    if (z3) {
                        i4 = this.t[i8].f();
                    } else {
                        i4 = this.t[i8].g();
                    }
                    View B3 = B(i4);
                    if (!(B3 == null || B3 == A2)) {
                        return B3;
                    }
                }
            }
        } else {
            for (int i9 = 0; i9 < this.s; i9++) {
                if (z3) {
                    i3 = this.t[i9].f();
                } else {
                    i3 = this.t[i9].g();
                }
                View B4 = B(i3);
                if (B4 != null && B4 != A2) {
                    return B4;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void H2(RecyclerView.y yVar, b bVar) {
        if (!G2(yVar, bVar) && !F2(yVar, bVar)) {
            bVar.a();
            bVar.f1824a = 0;
        }
    }

    public void I0(AccessibilityEvent accessibilityEvent) {
        super.I0(accessibilityEvent);
        if (I() > 0) {
            View Y1 = Y1(false);
            View X1 = X1(false);
            if (Y1 != null && X1 != null) {
                int f0 = f0(Y1);
                int f02 = f0(X1);
                if (f0 < f02) {
                    accessibilityEvent.setFromIndex(f0);
                    accessibilityEvent.setToIndex(f02);
                    return;
                }
                accessibilityEvent.setFromIndex(f02);
                accessibilityEvent.setToIndex(f0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean I1() {
        int l = this.t[0].l(Integer.MIN_VALUE);
        for (int i = 1; i < this.s; i++) {
            if (this.t[i].l(Integer.MIN_VALUE) != l) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean J1() {
        int p = this.t[0].p(Integer.MIN_VALUE);
        for (int i = 1; i < this.s; i++) {
            if (this.t[i].p(Integer.MIN_VALUE) != p) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void J2(int i) {
        this.x = i / this.s;
        this.J = View.MeasureSpec.makeMeasureSpec(i, this.v.k());
    }

    public int M(RecyclerView.u uVar, RecyclerView.y yVar) {
        if (this.w == 1) {
            return this.s;
        }
        return super.M(uVar, yVar);
    }

    /* access modifiers changed from: package-private */
    public boolean M1() {
        int i;
        int i2;
        if (I() == 0 || this.F == 0 || !p0()) {
            return false;
        }
        if (this.A) {
            i2 = e2();
            i = d2();
        } else {
            i2 = d2();
            i = e2();
        }
        if (i2 == 0 && l2() != null) {
            this.E.b();
            r1();
            q1();
            return true;
        } else if (!this.M) {
            return false;
        } else {
            int i3 = this.A ? -1 : 1;
            int i4 = i + 1;
            LazySpanLookup.FullSpanItem e2 = this.E.e(i2, i4, i3, true);
            if (e2 == null) {
                this.M = false;
                this.E.d(i4);
                return false;
            }
            LazySpanLookup.FullSpanItem e3 = this.E.e(i2, e2.f1814b, i3 * -1, true);
            if (e3 == null) {
                this.E.d(e2.f1814b);
            } else {
                this.E.d(e3.f1814b + 1);
            }
            r1();
            q1();
            return true;
        }
    }

    public void N0(RecyclerView.u uVar, RecyclerView.y yVar, View view, a.h.k.d0.d dVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.M0(view, dVar);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.w == 0) {
            dVar.c0(d.c.a(cVar.e(), cVar.f1831f ? this.s : 1, -1, -1, cVar.f1831f, false));
        } else {
            dVar.c0(d.c.a(-1, -1, cVar.e(), cVar.f1831f ? this.s : 1, cVar.f1831f, false));
        }
    }

    public void P0(RecyclerView recyclerView, int i, int i2) {
        k2(i, i2, 1);
    }

    public void Q0(RecyclerView recyclerView) {
        this.E.b();
        q1();
    }

    public void R0(RecyclerView recyclerView, int i, int i2, int i3) {
        k2(i, i2, 8);
    }

    public void S0(RecyclerView recyclerView, int i, int i2) {
        k2(i, i2, 2);
    }

    public void U0(RecyclerView recyclerView, int i, int i2, Object obj) {
        k2(i, i2, 4);
    }

    public void V0(RecyclerView.u uVar, RecyclerView.y yVar) {
        q2(uVar, yVar, true);
    }

    public void W0(RecyclerView.y yVar) {
        super.W0(yVar);
        this.C = -1;
        this.D = Integer.MIN_VALUE;
        this.I = null;
        this.L.c();
    }

    /* access modifiers changed from: package-private */
    public View X1(boolean z2) {
        int m = this.u.m();
        int i = this.u.i();
        View view = null;
        for (int I2 = I() - 1; I2 >= 0; I2--) {
            View H2 = H(I2);
            int g = this.u.g(H2);
            int d2 = this.u.d(H2);
            if (d2 > m && g < i) {
                if (d2 <= i || !z2) {
                    return H2;
                }
                if (view == null) {
                    view = H2;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public View Y1(boolean z2) {
        int m = this.u.m();
        int i = this.u.i();
        int I2 = I();
        View view = null;
        for (int i2 = 0; i2 < I2; i2++) {
            View H2 = H(i2);
            int g = this.u.g(H2);
            if (this.u.d(H2) > m && g < i) {
                if (g >= m || !z2) {
                    return H2;
                }
                if (view == null) {
                    view = H2;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public int Z1() {
        View view;
        if (this.A) {
            view = X1(true);
        } else {
            view = Y1(true);
        }
        if (view == null) {
            return -1;
        }
        return f0(view);
    }

    public void a1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.I = (SavedState) parcelable;
            q1();
        }
    }

    public Parcelable b1() {
        int i;
        int i2;
        int i3;
        int[] iArr;
        if (this.I != null) {
            return new SavedState(this.I);
        }
        SavedState savedState = new SavedState();
        savedState.i = this.z;
        savedState.j = this.G;
        savedState.k = this.H;
        LazySpanLookup lazySpanLookup = this.E;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f1812a) == null) {
            savedState.f1822f = 0;
        } else {
            savedState.g = iArr;
            savedState.f1822f = iArr.length;
            savedState.h = lazySpanLookup.f1813b;
        }
        if (I() > 0) {
            if (this.G) {
                i = e2();
            } else {
                i = d2();
            }
            savedState.f1818b = i;
            savedState.f1819c = Z1();
            int i4 = this.s;
            savedState.f1820d = i4;
            savedState.f1821e = new int[i4];
            for (int i5 = 0; i5 < this.s; i5++) {
                if (this.G) {
                    i2 = this.t[i5].l(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.u.i();
                    } else {
                        savedState.f1821e[i5] = i2;
                    }
                } else {
                    i2 = this.t[i5].p(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.u.m();
                    } else {
                        savedState.f1821e[i5] = i2;
                    }
                }
                i2 -= i3;
                savedState.f1821e[i5] = i2;
            }
        } else {
            savedState.f1818b = -1;
            savedState.f1819c = -1;
            savedState.f1820d = 0;
        }
        return savedState;
    }

    public void c1(int i) {
        if (i == 0) {
            M1();
        }
    }

    /* access modifiers changed from: package-private */
    public int d2() {
        if (I() == 0) {
            return 0;
        }
        return f0(H(0));
    }

    /* access modifiers changed from: package-private */
    public int e2() {
        int I2 = I();
        if (I2 == 0) {
            return 0;
        }
        return f0(H(I2 - 1));
    }

    public void f(String str) {
        if (this.I == null) {
            super.f(str);
        }
    }

    public int i0(RecyclerView.u uVar, RecyclerView.y yVar) {
        if (this.w == 0) {
            return this.s;
        }
        return super.i0(uVar, yVar);
    }

    public boolean j() {
        return this.w == 0;
    }

    public boolean k() {
        return this.w == 1;
    }

    public boolean l(RecyclerView.o oVar) {
        return oVar instanceof c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View l2() {
        /*
            r12 = this;
            int r0 = r12.I()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.s
            r2.<init>(r3)
            int r3 = r12.s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.w
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.n2()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.A
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.H(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f1830e
            int r9 = r9.f1836e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f1830e
            boolean r9 = r12.N1(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f1830e
            int r9 = r9.f1836e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f1831f
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.H(r9)
            boolean r10 = r12.A
            if (r10 == 0) goto L_0x0077
            androidx.recyclerview.widget.h r10 = r12.u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.h r11 = r12.u
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            androidx.recyclerview.widget.h r10 = r12.u
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.h r11 = r12.u
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = 1
            goto L_0x008b
        L_0x008a:
            r10 = 0
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r8 = r8.f1830e
            int r8 = r8.f1836e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r9.f1830e
            int r9 = r9.f1836e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = 1
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = 1
            goto L_0x00a6
        L_0x00a5:
            r9 = 0
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.l2():android.view.View");
    }

    public void m2() {
        this.E.b();
        q1();
    }

    public void n(int i, int i2, RecyclerView.y yVar, RecyclerView.LayoutManager.c cVar) {
        int i3;
        int i4;
        if (this.w != 0) {
            i = i2;
        }
        if (I() != 0 && i != 0) {
            s2(i, yVar);
            int[] iArr = this.O;
            if (iArr == null || iArr.length < this.s) {
                this.O = new int[this.s];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.s; i6++) {
                f fVar = this.y;
                if (fVar.f1920d == -1) {
                    i4 = fVar.f1922f;
                    i3 = this.t[i6].p(i4);
                } else {
                    i4 = this.t[i6].l(fVar.g);
                    i3 = this.y.g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.O[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.O, 0, i5);
            for (int i8 = 0; i8 < i5 && this.y.a(yVar); i8++) {
                cVar.a(this.y.f1919c, this.O[i8]);
                f fVar2 = this.y;
                fVar2.f1919c += fVar2.f1920d;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean n2() {
        return X() == 1;
    }

    public int p(RecyclerView.y yVar) {
        return O1(yVar);
    }

    public int q(RecyclerView.y yVar) {
        return P1(yVar);
    }

    public boolean q0() {
        return this.F != 0;
    }

    public int r(RecyclerView.y yVar) {
        return Q1(yVar);
    }

    public int s(RecyclerView.y yVar) {
        return O1(yVar);
    }

    /* access modifiers changed from: package-private */
    public void s2(int i, RecyclerView.y yVar) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = e2();
            i2 = 1;
        } else {
            i3 = d2();
            i2 = -1;
        }
        this.y.f1917a = true;
        I2(i3, yVar);
        A2(i2);
        f fVar = this.y;
        fVar.f1919c = i3 + fVar.f1920d;
        fVar.f1918b = Math.abs(i);
    }

    public int t(RecyclerView.y yVar) {
        return P1(yVar);
    }

    public int t1(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        return z2(i, uVar, yVar);
    }

    public int u(RecyclerView.y yVar) {
        return Q1(yVar);
    }

    public int u1(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        return z2(i, uVar, yVar);
    }

    public void y1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int c0 = c0() + d0();
        int e0 = e0() + b0();
        if (this.w == 1) {
            i4 = RecyclerView.LayoutManager.m(i2, rect.height() + e0, Z());
            i3 = RecyclerView.LayoutManager.m(i, (this.x * this.s) + c0, a0());
        } else {
            i3 = RecyclerView.LayoutManager.m(i, rect.width() + c0, a0());
            i4 = RecyclerView.LayoutManager.m(i2, (this.x * this.s) + e0, Z());
        }
        x1(i3, i4);
    }

    /* access modifiers changed from: package-private */
    public int z2(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        if (I() == 0 || i == 0) {
            return 0;
        }
        s2(i, yVar);
        int V1 = V1(uVar, this.y, yVar);
        if (this.y.f1918b >= V1) {
            i = i < 0 ? -V1 : V1;
        }
        this.u.r(-i);
        this.G = this.A;
        f fVar = this.y;
        fVar.f1918b = 0;
        u2(uVar, fVar);
        return i;
    }

    static class LazySpanLookup {

        /* renamed from: a  reason: collision with root package name */
        int[] f1812a;

        /* renamed from: b  reason: collision with root package name */
        List<FullSpanItem> f1813b;

        LazySpanLookup() {
        }

        private int i(int i) {
            if (this.f1813b == null) {
                return -1;
            }
            FullSpanItem f2 = f(i);
            if (f2 != null) {
                this.f1813b.remove(f2);
            }
            int size = this.f1813b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.f1813b.get(i2).f1814b >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.f1813b.remove(i2);
            return this.f1813b.get(i2).f1814b;
        }

        private void l(int i, int i2) {
            List<FullSpanItem> list = this.f1813b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.f1813b.get(size);
                    int i3 = fullSpanItem.f1814b;
                    if (i3 >= i) {
                        fullSpanItem.f1814b = i3 + i2;
                    }
                }
            }
        }

        private void m(int i, int i2) {
            List<FullSpanItem> list = this.f1813b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.f1813b.get(size);
                    int i4 = fullSpanItem.f1814b;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            this.f1813b.remove(size);
                        } else {
                            fullSpanItem.f1814b = i4 - i2;
                        }
                    }
                }
            }
        }

        public void a(FullSpanItem fullSpanItem) {
            if (this.f1813b == null) {
                this.f1813b = new ArrayList();
            }
            int size = this.f1813b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = this.f1813b.get(i);
                if (fullSpanItem2.f1814b == fullSpanItem.f1814b) {
                    this.f1813b.remove(i);
                }
                if (fullSpanItem2.f1814b >= fullSpanItem.f1814b) {
                    this.f1813b.add(i, fullSpanItem);
                    return;
                }
            }
            this.f1813b.add(fullSpanItem);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            int[] iArr = this.f1812a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f1813b = null;
        }

        /* access modifiers changed from: package-private */
        public void c(int i) {
            int[] iArr = this.f1812a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.f1812a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[o(i)];
                this.f1812a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f1812a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* access modifiers changed from: package-private */
        public int d(int i) {
            List<FullSpanItem> list = this.f1813b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f1813b.get(size).f1814b >= i) {
                        this.f1813b.remove(size);
                    }
                }
            }
            return h(i);
        }

        public FullSpanItem e(int i, int i2, int i3, boolean z) {
            List<FullSpanItem> list = this.f1813b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = this.f1813b.get(i4);
                int i5 = fullSpanItem.f1814b;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.f1815c == i3 || (z && fullSpanItem.f1817e))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public FullSpanItem f(int i) {
            List<FullSpanItem> list = this.f1813b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f1813b.get(size);
                if (fullSpanItem.f1814b == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public int g(int i) {
            int[] iArr = this.f1812a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* access modifiers changed from: package-private */
        public int h(int i) {
            int[] iArr = this.f1812a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int i2 = i(i);
            if (i2 == -1) {
                int[] iArr2 = this.f1812a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f1812a.length;
            }
            int i3 = i2 + 1;
            Arrays.fill(this.f1812a, i, i3, -1);
            return i3;
        }

        /* access modifiers changed from: package-private */
        public void j(int i, int i2) {
            int[] iArr = this.f1812a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                c(i3);
                int[] iArr2 = this.f1812a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f1812a, i, i3, -1);
                l(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        public void k(int i, int i2) {
            int[] iArr = this.f1812a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                c(i3);
                int[] iArr2 = this.f1812a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f1812a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        public void n(int i, d dVar) {
            c(i);
            this.f1812a[i] = dVar.f1836e;
        }

        /* access modifiers changed from: package-private */
        public int o(int i) {
            int length = this.f1812a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();

            /* renamed from: b  reason: collision with root package name */
            int f1814b;

            /* renamed from: c  reason: collision with root package name */
            int f1815c;

            /* renamed from: d  reason: collision with root package name */
            int[] f1816d;

            /* renamed from: e  reason: collision with root package name */
            boolean f1817e;

            static class a implements Parcelable.Creator<FullSpanItem> {
                a() {
                }

                /* renamed from: a */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                /* renamed from: b */
                public FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            FullSpanItem(Parcel parcel) {
                this.f1814b = parcel.readInt();
                this.f1815c = parcel.readInt();
                this.f1817e = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f1816d = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* access modifiers changed from: package-private */
            public int a(int i) {
                int[] iArr = this.f1816d;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f1814b + ", mGapDir=" + this.f1815c + ", mHasUnwantedGapAfter=" + this.f1817e + ", mGapPerSpan=" + Arrays.toString(this.f1816d) + '}';
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f1814b);
                parcel.writeInt(this.f1815c);
                parcel.writeInt(this.f1817e ? 1 : 0);
                int[] iArr = this.f1816d;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f1816d);
            }

            FullSpanItem() {
            }
        }
    }
}
