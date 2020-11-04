package androidx.recyclerview.widget;

import a.h.k.c0.d;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

public class GridLayoutManager extends LinearLayoutManager {
    boolean H = false;
    int I = -1;
    int[] J;
    View[] K;
    final SparseIntArray L = new SparseIntArray();
    final SparseIntArray M = new SparseIntArray();
    c N = new a();
    final Rect O = new Rect();

    public static final class a extends c {
        public int c(int i, int i2) {
            return i % i2;
        }

        public int d(int i) {
            return 1;
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final SparseIntArray f1645a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        private boolean f1646b = false;

        /* access modifiers changed from: package-private */
        public int a(int i, int i2) {
            if (!this.f1646b) {
                return c(i, i2);
            }
            int i3 = this.f1645a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int c2 = c(i, i2);
            this.f1645a.put(i, c2);
            return c2;
        }

        public int b(int i, int i2) {
            int d2 = d(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int d3 = d(i5);
                i3 += d3;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = d3;
                }
            }
            return i3 + d2 > i2 ? i4 + 1 : i4;
        }

        public abstract int c(int i, int i2);

        public abstract int d(int i);

        public void e() {
            this.f1645a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        T2(RecyclerView.LayoutManager.g0(context, attributeSet, i, i2).spanCount);
    }

    private void F2(RecyclerView.u uVar, RecyclerView.y yVar, int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5 = 0;
        int i6 = -1;
        if (z) {
            i6 = i;
            i4 = 0;
            i3 = 1;
        } else {
            i4 = i - 1;
            i3 = -1;
        }
        while (i4 != i6) {
            View view = this.K[i4];
            b bVar = (b) view.getLayoutParams();
            int P2 = P2(uVar, yVar, f0(view));
            bVar.f1644f = P2;
            bVar.f1643e = i5;
            i5 += P2;
            i4 += i3;
        }
    }

    private void G2() {
        int I2 = I();
        for (int i = 0; i < I2; i++) {
            b bVar = (b) H(i).getLayoutParams();
            int a2 = bVar.a();
            this.L.put(a2, bVar.f());
            this.M.put(a2, bVar.e());
        }
    }

    private void H2(int i) {
        this.J = I2(this.J, this.I, i);
    }

    static int[] I2(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    private void J2() {
        this.L.clear();
        this.M.clear();
    }

    private void K2(RecyclerView.u uVar, RecyclerView.y yVar, LinearLayoutManager.a aVar, int i) {
        boolean z = i == 1;
        int O2 = O2(uVar, yVar, aVar.f1651b);
        if (z) {
            while (O2 > 0) {
                int i2 = aVar.f1651b;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    aVar.f1651b = i3;
                    O2 = O2(uVar, yVar, i3);
                } else {
                    return;
                }
            }
            return;
        }
        int b2 = yVar.b() - 1;
        int i4 = aVar.f1651b;
        while (i4 < b2) {
            int i5 = i4 + 1;
            int O22 = O2(uVar, yVar, i5);
            if (O22 <= O2) {
                break;
            }
            i4 = i5;
            O2 = O22;
        }
        aVar.f1651b = i4;
    }

    private void L2() {
        View[] viewArr = this.K;
        if (viewArr == null || viewArr.length != this.I) {
            this.K = new View[this.I];
        }
    }

    private int N2(RecyclerView.u uVar, RecyclerView.y yVar, int i) {
        if (!yVar.e()) {
            return this.N.b(i, this.I);
        }
        int f2 = uVar.f(i);
        if (f2 != -1) {
            return this.N.b(f2, this.I);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    private int O2(RecyclerView.u uVar, RecyclerView.y yVar, int i) {
        if (!yVar.e()) {
            return this.N.a(i, this.I);
        }
        int i2 = this.M.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f2 = uVar.f(i);
        if (f2 != -1) {
            return this.N.a(f2, this.I);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    private int P2(RecyclerView.u uVar, RecyclerView.y yVar, int i) {
        if (!yVar.e()) {
            return this.N.d(i);
        }
        int i2 = this.L.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f2 = uVar.f(i);
        if (f2 != -1) {
            return this.N.d(f2);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    private void Q2(float f2, int i) {
        H2(Math.max(Math.round(f2 * ((float) this.I)), i));
    }

    private void R2(View view, int i, boolean z) {
        int i2;
        int i3;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f1707b;
        int i4 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i5 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int M2 = M2(bVar.f1643e, bVar.f1644f);
        if (this.s == 1) {
            i2 = RecyclerView.LayoutManager.J(M2, i, i5, bVar.width, false);
            i3 = RecyclerView.LayoutManager.J(this.u.n(), W(), i4, bVar.height, true);
        } else {
            int J2 = RecyclerView.LayoutManager.J(M2, i, i4, bVar.height, false);
            int J3 = RecyclerView.LayoutManager.J(this.u.n(), n0(), i5, bVar.width, true);
            i3 = J2;
            i2 = J3;
        }
        S2(view, i2, i3, z);
    }

    private void S2(View view, int i, int i2, boolean z) {
        boolean z2;
        RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
        if (z) {
            z2 = D1(view, i, i2, oVar);
        } else {
            z2 = B1(view, i, i2, oVar);
        }
        if (z2) {
            view.measure(i, i2);
        }
    }

    private void U2() {
        int i;
        int i2;
        if (i2() == 1) {
            i2 = m0() - d0();
            i = c0();
        } else {
            i2 = V() - b0();
            i = e0();
        }
        H2(i2 - i);
    }

    public RecyclerView.o C() {
        if (this.s == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    public RecyclerView.o D(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public RecyclerView.o E(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    public boolean F1() {
        return this.D == null && !this.H;
    }

    /* access modifiers changed from: package-private */
    public void G1(RecyclerView.y yVar, LinearLayoutManager.c cVar, RecyclerView.LayoutManager.c cVar2) {
        int i = this.I;
        for (int i2 = 0; i2 < this.I && cVar.c(yVar) && i > 0; i2++) {
            int i3 = cVar.f1662d;
            cVar2.a(i3, Math.max(0, cVar.g));
            i -= this.N.d(i3);
            cVar.f1662d += cVar.f1663e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f6, code lost:
        if (r13 == r11) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View H0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.u r26, androidx.recyclerview.widget.RecyclerView.y r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.A(r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r5 = (androidx.recyclerview.widget.GridLayoutManager.b) r5
            int r6 = r5.f1643e
            int r5 = r5.f1644f
            int r5 = r5 + r6
            android.view.View r7 = super.H0(r24, r25, r26, r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.K1(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = 1
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.x
            if (r7 == r10) goto L_0x0032
            r7 = 1
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r23.I()
            int r7 = r7 - r9
            r11 = -1
            r12 = -1
            goto L_0x0045
        L_0x003e:
            int r7 = r23.I()
            r11 = r7
            r7 = 0
            r12 = 1
        L_0x0045:
            int r13 = r0.s
            if (r13 != r9) goto L_0x0051
            boolean r13 = r23.j2()
            if (r13 == 0) goto L_0x0051
            r13 = 1
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.N2(r1, r2, r7)
            r10 = r7
            r8 = 0
            r15 = -1
            r16 = -1
            r17 = 0
            r7 = r4
        L_0x005e:
            if (r10 == r11) goto L_0x0149
            int r9 = r0.N2(r1, r2, r10)
            android.view.View r1 = r0.H(r10)
            if (r1 != r3) goto L_0x006c
            goto L_0x0149
        L_0x006c:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0086
            if (r9 == r14) goto L_0x0086
            if (r4 == 0) goto L_0x0078
            goto L_0x0149
        L_0x0078:
            r18 = r3
            r21 = r7
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
            goto L_0x0135
        L_0x0086:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r9 = (androidx.recyclerview.widget.GridLayoutManager.b) r9
            int r2 = r9.f1643e
            r18 = r3
            int r3 = r9.f1644f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009e
            if (r2 != r6) goto L_0x009e
            if (r3 != r5) goto L_0x009e
            return r1
        L_0x009e:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a6
            if (r4 == 0) goto L_0x00ae
        L_0x00a6:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00ba
            if (r7 != 0) goto L_0x00ba
        L_0x00ae:
            r21 = r7
        L_0x00b0:
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
        L_0x00b8:
            r11 = 1
            goto L_0x0105
        L_0x00ba:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d9
            if (r7 <= r8) goto L_0x00cf
        L_0x00ce:
            goto L_0x00b0
        L_0x00cf:
            if (r7 != r8) goto L_0x00fc
            if (r2 <= r15) goto L_0x00d5
            r7 = 1
            goto L_0x00d6
        L_0x00d5:
            r7 = 0
        L_0x00d6:
            if (r13 != r7) goto L_0x00fc
            goto L_0x00ce
        L_0x00d9:
            if (r4 != 0) goto L_0x00fc
            r19 = r8
            r20 = r11
            r8 = 0
            r11 = 1
            boolean r22 = r0.w0(r1, r8, r11)
            if (r22 == 0) goto L_0x0100
            r8 = r17
            if (r7 <= r8) goto L_0x00ee
            r7 = r16
            goto L_0x0105
        L_0x00ee:
            if (r7 != r8) goto L_0x00f9
            r7 = r16
            if (r2 <= r7) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r11 = 0
        L_0x00f6:
            if (r13 != r11) goto L_0x0104
            goto L_0x00b8
        L_0x00f9:
            r7 = r16
            goto L_0x0104
        L_0x00fc:
            r19 = r8
            r20 = r11
        L_0x0100:
            r7 = r16
            r8 = r17
        L_0x0104:
            r11 = 0
        L_0x0105:
            if (r11 == 0) goto L_0x0135
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x0123
            int r4 = r9.f1643e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r15 = r4
            r16 = r7
            r17 = r8
            r7 = r21
            r4 = r1
            r8 = r2
            goto L_0x013d
        L_0x0123:
            int r7 = r9.f1643e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r17 = r3 - r2
            r16 = r7
            r8 = r19
            r7 = r1
            goto L_0x013d
        L_0x0135:
            r16 = r7
            r17 = r8
            r8 = r19
            r7 = r21
        L_0x013d:
            int r10 = r10 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r11 = r20
            r9 = 1
            goto L_0x005e
        L_0x0149:
            r21 = r7
            if (r4 == 0) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r4 = r21
        L_0x0150:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.H0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$y):android.view.View");
    }

    public int M(RecyclerView.u uVar, RecyclerView.y yVar) {
        if (this.s == 1) {
            return this.I;
        }
        if (yVar.b() < 1) {
            return 0;
        }
        return N2(uVar, yVar, yVar.b() - 1) + 1;
    }

    /* access modifiers changed from: package-private */
    public int M2(int i, int i2) {
        if (this.s != 1 || !j2()) {
            int[] iArr = this.J;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.J;
        int i3 = this.I;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public void N0(RecyclerView.u uVar, RecyclerView.y yVar, View view, d dVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.M0(view, dVar);
            return;
        }
        b bVar = (b) layoutParams;
        int N2 = N2(uVar, yVar, bVar.a());
        if (this.s == 0) {
            dVar.c0(d.c.a(bVar.e(), bVar.f(), N2, 1, this.I > 1 && bVar.f() == this.I, false));
        } else {
            dVar.c0(d.c.a(N2, 1, bVar.e(), bVar.f(), this.I > 1 && bVar.f() == this.I, false));
        }
    }

    public void P0(RecyclerView recyclerView, int i, int i2) {
        this.N.e();
    }

    public void Q0(RecyclerView recyclerView) {
        this.N.e();
    }

    public void R0(RecyclerView recyclerView, int i, int i2, int i3) {
        this.N.e();
    }

    public void S0(RecyclerView recyclerView, int i, int i2) {
        this.N.e();
    }

    public void T2(int i) {
        if (i != this.I) {
            this.H = true;
            if (i >= 1) {
                this.I = i;
                this.N.e();
                q1();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    public void U0(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.N.e();
    }

    public void V0(RecyclerView.u uVar, RecyclerView.y yVar) {
        if (yVar.e()) {
            G2();
        }
        super.V0(uVar, yVar);
        J2();
    }

    public void W0(RecyclerView.y yVar) {
        super.W0(yVar);
        this.H = false;
    }

    /* access modifiers changed from: package-private */
    public View a2(RecyclerView.u uVar, RecyclerView.y yVar, int i, int i2, int i3) {
        M1();
        int m = this.u.m();
        int i4 = this.u.i();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View H2 = H(i);
            int f0 = f0(H2);
            if (f0 >= 0 && f0 < i3 && O2(uVar, yVar, f0) == 0) {
                if (((RecyclerView.o) H2.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = H2;
                    }
                } else if (this.u.g(H2) < i4 && this.u.d(H2) >= m) {
                    return H2;
                } else {
                    if (view == null) {
                        view = H2;
                    }
                }
            }
            i += i5;
        }
        return view != null ? view : view2;
    }

    public int i0(RecyclerView.u uVar, RecyclerView.y yVar) {
        if (this.s == 0) {
            return this.I;
        }
        if (yVar.b() < 1) {
            return 0;
        }
        return N2(uVar, yVar, yVar.b() - 1) + 1;
    }

    /* access modifiers changed from: package-private */
    public void k2(RecyclerView.u uVar, RecyclerView.y yVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        View d2;
        RecyclerView.u uVar2 = uVar;
        RecyclerView.y yVar2 = yVar;
        LinearLayoutManager.c cVar2 = cVar;
        LinearLayoutManager.b bVar2 = bVar;
        int l = this.u.l();
        boolean z2 = l != 1073741824;
        int i11 = I() > 0 ? this.J[this.I] : 0;
        if (z2) {
            U2();
        }
        boolean z3 = cVar2.f1663e == 1;
        int i12 = this.I;
        if (!z3) {
            i12 = O2(uVar2, yVar2, cVar2.f1662d) + P2(uVar2, yVar2, cVar2.f1662d);
        }
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.I && cVar2.c(yVar2) && i12 > 0) {
            int i15 = cVar2.f1662d;
            int P2 = P2(uVar2, yVar2, i15);
            if (P2 <= this.I) {
                i12 -= P2;
                if (i12 < 0 || (d2 = cVar2.d(uVar2)) == null) {
                    break;
                }
                i13 += P2;
                this.K[i14] = d2;
                i14++;
            } else {
                throw new IllegalArgumentException("Item at position " + i15 + " requires " + P2 + " spans but GridLayoutManager has only " + this.I + " spans.");
            }
        }
        if (i14 == 0) {
            bVar2.f1656b = true;
            return;
        }
        float f2 = 0.0f;
        int i16 = i14;
        F2(uVar, yVar, i14, i13, z3);
        int i17 = 0;
        for (int i18 = 0; i18 < i16; i18++) {
            View view = this.K[i18];
            if (cVar2.k != null) {
                z = false;
                if (z3) {
                    a(view);
                } else {
                    b(view, 0);
                }
            } else if (z3) {
                c(view);
                z = false;
            } else {
                z = false;
                d(view, 0);
            }
            i(view, this.O);
            R2(view, l, z);
            int e2 = this.u.e(view);
            if (e2 > i17) {
                i17 = e2;
            }
            float f3 = (((float) this.u.f(view)) * 1.0f) / ((float) ((b) view.getLayoutParams()).f1644f);
            if (f3 > f2) {
                f2 = f3;
            }
        }
        if (z2) {
            Q2(f2, i11);
            i17 = 0;
            for (int i19 = 0; i19 < i16; i19++) {
                View view2 = this.K[i19];
                R2(view2, 1073741824, true);
                int e3 = this.u.e(view2);
                if (e3 > i17) {
                    i17 = e3;
                }
            }
        }
        for (int i20 = 0; i20 < i16; i20++) {
            View view3 = this.K[i20];
            if (this.u.e(view3) != i17) {
                b bVar3 = (b) view3.getLayoutParams();
                Rect rect = bVar3.f1707b;
                int i21 = rect.top + rect.bottom + bVar3.topMargin + bVar3.bottomMargin;
                int i22 = rect.left + rect.right + bVar3.leftMargin + bVar3.rightMargin;
                int M2 = M2(bVar3.f1643e, bVar3.f1644f);
                if (this.s == 1) {
                    i10 = RecyclerView.LayoutManager.J(M2, 1073741824, i22, bVar3.width, false);
                    i9 = View.MeasureSpec.makeMeasureSpec(i17 - i21, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - i22, 1073741824);
                    i9 = RecyclerView.LayoutManager.J(M2, 1073741824, i21, bVar3.height, false);
                    i10 = makeMeasureSpec;
                }
                S2(view3, i10, i9, true);
            }
        }
        int i23 = 0;
        bVar2.f1655a = i17;
        if (this.s != 1) {
            if (cVar2.f1664f == -1) {
                int i24 = cVar2.f1660b;
                i3 = i24 - i17;
                i2 = i24;
            } else {
                int i25 = cVar2.f1660b;
                i2 = i25 + i17;
                i3 = i25;
            }
            i4 = 0;
            i = 0;
        } else if (cVar2.f1664f == -1) {
            int i26 = cVar2.f1660b;
            int i27 = i26 - i17;
            i3 = 0;
            i2 = 0;
            int i28 = i26;
            i = i27;
            i4 = i28;
        } else {
            i = cVar2.f1660b;
            i4 = i + i17;
            i3 = 0;
            i2 = 0;
        }
        while (i23 < i16) {
            View view4 = this.K[i23];
            b bVar4 = (b) view4.getLayoutParams();
            if (this.s == 1) {
                if (j2()) {
                    int c0 = c0() + this.J[this.I - bVar4.f1643e];
                    i8 = i4;
                    i6 = c0;
                    i7 = c0 - this.u.f(view4);
                } else {
                    int c02 = c0() + this.J[bVar4.f1643e];
                    i8 = i4;
                    i7 = c02;
                    i6 = this.u.f(view4) + c02;
                }
                i5 = i;
            } else {
                int e0 = e0() + this.J[bVar4.f1643e];
                i5 = e0;
                i7 = i3;
                i6 = i2;
                i8 = this.u.f(view4) + e0;
            }
            x0(view4, i7, i5, i6, i8);
            if (bVar4.c() || bVar4.b()) {
                bVar2.f1657c = true;
            }
            bVar2.f1658d |= view4.hasFocusable();
            i23++;
            i4 = i8;
            i3 = i7;
            i2 = i6;
            i = i5;
        }
        Arrays.fill(this.K, (Object) null);
    }

    public boolean l(RecyclerView.o oVar) {
        return oVar instanceof b;
    }

    /* access modifiers changed from: package-private */
    public void m2(RecyclerView.u uVar, RecyclerView.y yVar, LinearLayoutManager.a aVar, int i) {
        super.m2(uVar, yVar, aVar, i);
        U2();
        if (yVar.b() > 0 && !yVar.e()) {
            K2(uVar, yVar, aVar, i);
        }
        L2();
    }

    public int t1(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        U2();
        L2();
        return super.t1(i, uVar, yVar);
    }

    public int u1(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        U2();
        L2();
        return super.u1(i, uVar, yVar);
    }

    public void w2(boolean z) {
        if (!z) {
            super.w2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public void y1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.J == null) {
            super.y1(rect, i, i2);
        }
        int c0 = c0() + d0();
        int e0 = e0() + b0();
        if (this.s == 1) {
            i4 = RecyclerView.LayoutManager.m(i2, rect.height() + e0, Z());
            int[] iArr = this.J;
            i3 = RecyclerView.LayoutManager.m(i, iArr[iArr.length - 1] + c0, a0());
        } else {
            i3 = RecyclerView.LayoutManager.m(i, rect.width() + c0, a0());
            int[] iArr2 = this.J;
            i4 = RecyclerView.LayoutManager.m(i2, iArr2[iArr2.length - 1] + e0, Z());
        }
        x1(i3, i4);
    }

    public static class b extends RecyclerView.o {

        /* renamed from: e  reason: collision with root package name */
        int f1643e = -1;

        /* renamed from: f  reason: collision with root package name */
        int f1644f = 0;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public int e() {
            return this.f1643e;
        }

        public int f() {
            return this.f1644f;
        }

        public b(int i, int i2) {
            super(i, i2);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        T2(i);
    }
}
