package androidx.recyclerview.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.LayoutManager {
    int A;
    int B;
    private boolean C;
    SavedState D;
    final a E;
    private final b F;
    private int G;
    int s;
    private c t;
    h u;
    private boolean v;
    private boolean w;
    boolean x;
    private boolean y;
    private boolean z;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        int f1647b;

        /* renamed from: c  reason: collision with root package name */
        int f1648c;

        /* renamed from: d  reason: collision with root package name */
        boolean f1649d;

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
        public boolean a() {
            return this.f1647b >= 0;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f1647b = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1647b);
            parcel.writeInt(this.f1648c);
            parcel.writeInt(this.f1649d ? 1 : 0);
        }

        SavedState(Parcel parcel) {
            this.f1647b = parcel.readInt();
            this.f1648c = parcel.readInt();
            this.f1649d = parcel.readInt() != 1 ? false : true;
        }

        public SavedState(SavedState savedState) {
            this.f1647b = savedState.f1647b;
            this.f1648c = savedState.f1648c;
            this.f1649d = savedState.f1649d;
        }
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        h f1650a;

        /* renamed from: b  reason: collision with root package name */
        int f1651b;

        /* renamed from: c  reason: collision with root package name */
        int f1652c;

        /* renamed from: d  reason: collision with root package name */
        boolean f1653d;

        /* renamed from: e  reason: collision with root package name */
        boolean f1654e;

        a() {
            e();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int i;
            if (this.f1653d) {
                i = this.f1650a.i();
            } else {
                i = this.f1650a.m();
            }
            this.f1652c = i;
        }

        public void b(View view, int i) {
            if (this.f1653d) {
                this.f1652c = this.f1650a.d(view) + this.f1650a.o();
            } else {
                this.f1652c = this.f1650a.g(view);
            }
            this.f1651b = i;
        }

        public void c(View view, int i) {
            int o = this.f1650a.o();
            if (o >= 0) {
                b(view, i);
                return;
            }
            this.f1651b = i;
            if (this.f1653d) {
                int i2 = (this.f1650a.i() - o) - this.f1650a.d(view);
                this.f1652c = this.f1650a.i() - i2;
                if (i2 > 0) {
                    int e2 = this.f1652c - this.f1650a.e(view);
                    int m = this.f1650a.m();
                    int min = e2 - (m + Math.min(this.f1650a.g(view) - m, 0));
                    if (min < 0) {
                        this.f1652c += Math.min(i2, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g = this.f1650a.g(view);
            int m2 = g - this.f1650a.m();
            this.f1652c = g;
            if (m2 > 0) {
                int i3 = (this.f1650a.i() - Math.min(0, (this.f1650a.i() - o) - this.f1650a.d(view))) - (g + this.f1650a.e(view));
                if (i3 < 0) {
                    this.f1652c -= Math.min(m2, -i3);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean d(View view, RecyclerView.y yVar) {
            RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
            return !oVar.c() && oVar.a() >= 0 && oVar.a() < yVar.b();
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.f1651b = -1;
            this.f1652c = Integer.MIN_VALUE;
            this.f1653d = false;
            this.f1654e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f1651b + ", mCoordinate=" + this.f1652c + ", mLayoutFromEnd=" + this.f1653d + ", mValid=" + this.f1654e + '}';
        }
    }

    protected static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f1655a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1656b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1657c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1658d;

        protected b() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f1655a = 0;
            this.f1656b = false;
            this.f1657c = false;
            this.f1658d = false;
        }
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        boolean f1659a = true;

        /* renamed from: b  reason: collision with root package name */
        int f1660b;

        /* renamed from: c  reason: collision with root package name */
        int f1661c;

        /* renamed from: d  reason: collision with root package name */
        int f1662d;

        /* renamed from: e  reason: collision with root package name */
        int f1663e;

        /* renamed from: f  reason: collision with root package name */
        int f1664f;
        int g;
        int h = 0;
        boolean i;
        int j;
        List<RecyclerView.b0> k = null;
        boolean l;

        c() {
        }

        private View e() {
            int size = this.k.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = this.k.get(i2).f1686a;
                RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
                if (!oVar.c() && this.f1662d == oVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b((View) null);
        }

        public void b(View view) {
            View f2 = f(view);
            if (f2 == null) {
                this.f1662d = -1;
            } else {
                this.f1662d = ((RecyclerView.o) f2.getLayoutParams()).a();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(RecyclerView.y yVar) {
            int i2 = this.f1662d;
            return i2 >= 0 && i2 < yVar.b();
        }

        /* access modifiers changed from: package-private */
        public View d(RecyclerView.u uVar) {
            if (this.k != null) {
                return e();
            }
            View o = uVar.o(this.f1662d);
            this.f1662d += this.f1663e;
            return o;
        }

        public View f(View view) {
            int a2;
            int size = this.k.size();
            View view2 = null;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < size; i3++) {
                View view3 = this.k.get(i3).f1686a;
                RecyclerView.o oVar = (RecyclerView.o) view3.getLayoutParams();
                if (view3 != view && !oVar.c() && (a2 = (oVar.a() - this.f1662d) * this.f1663e) >= 0 && a2 < i2) {
                    view2 = view3;
                    if (a2 == 0) {
                        break;
                    }
                    i2 = a2;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private void A2(int i, int i2, boolean z2, RecyclerView.y yVar) {
        int i3;
        this.t.l = r2();
        this.t.h = h2(yVar);
        c cVar = this.t;
        cVar.f1664f = i;
        int i4 = -1;
        if (i == 1) {
            cVar.h += this.u.j();
            View f2 = f2();
            c cVar2 = this.t;
            if (!this.x) {
                i4 = 1;
            }
            cVar2.f1663e = i4;
            c cVar3 = this.t;
            int f0 = f0(f2);
            c cVar4 = this.t;
            cVar3.f1662d = f0 + cVar4.f1663e;
            cVar4.f1660b = this.u.d(f2);
            i3 = this.u.d(f2) - this.u.i();
        } else {
            View g2 = g2();
            this.t.h += this.u.m();
            c cVar5 = this.t;
            if (this.x) {
                i4 = 1;
            }
            cVar5.f1663e = i4;
            c cVar6 = this.t;
            int f02 = f0(g2);
            c cVar7 = this.t;
            cVar6.f1662d = f02 + cVar7.f1663e;
            cVar7.f1660b = this.u.g(g2);
            i3 = (-this.u.g(g2)) + this.u.m();
        }
        c cVar8 = this.t;
        cVar8.f1661c = i2;
        if (z2) {
            cVar8.f1661c = i2 - i3;
        }
        this.t.g = i3;
    }

    private void B2(int i, int i2) {
        this.t.f1661c = this.u.i() - i2;
        this.t.f1663e = this.x ? -1 : 1;
        c cVar = this.t;
        cVar.f1662d = i;
        cVar.f1664f = 1;
        cVar.f1660b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    private void C2(a aVar) {
        B2(aVar.f1651b, aVar.f1652c);
    }

    private void D2(int i, int i2) {
        this.t.f1661c = i2 - this.u.m();
        c cVar = this.t;
        cVar.f1662d = i;
        cVar.f1663e = this.x ? 1 : -1;
        c cVar2 = this.t;
        cVar2.f1664f = -1;
        cVar2.f1660b = i2;
        cVar2.g = Integer.MIN_VALUE;
    }

    private void E2(a aVar) {
        D2(aVar.f1651b, aVar.f1652c);
    }

    private int H1(RecyclerView.y yVar) {
        if (I() == 0) {
            return 0;
        }
        M1();
        h hVar = this.u;
        View R1 = R1(!this.z, true);
        return j.a(yVar, hVar, R1, Q1(!this.z, true), this, this.z);
    }

    private int I1(RecyclerView.y yVar) {
        if (I() == 0) {
            return 0;
        }
        M1();
        h hVar = this.u;
        View R1 = R1(!this.z, true);
        return j.b(yVar, hVar, R1, Q1(!this.z, true), this, this.z, this.x);
    }

    private int J1(RecyclerView.y yVar) {
        if (I() == 0) {
            return 0;
        }
        M1();
        h hVar = this.u;
        View R1 = R1(!this.z, true);
        return j.c(yVar, hVar, R1, Q1(!this.z, true), this, this.z);
    }

    private View O1(RecyclerView.u uVar, RecyclerView.y yVar) {
        return W1(0, I());
    }

    private View P1(RecyclerView.u uVar, RecyclerView.y yVar) {
        return a2(uVar, yVar, 0, I(), yVar.b());
    }

    private View Q1(boolean z2, boolean z3) {
        if (this.x) {
            return X1(0, I(), z2, z3);
        }
        return X1(I() - 1, -1, z2, z3);
    }

    private View R1(boolean z2, boolean z3) {
        if (this.x) {
            return X1(I() - 1, -1, z2, z3);
        }
        return X1(0, I(), z2, z3);
    }

    private View T1(RecyclerView.u uVar, RecyclerView.y yVar) {
        return W1(I() - 1, -1);
    }

    private View U1(RecyclerView.u uVar, RecyclerView.y yVar) {
        return a2(uVar, yVar, I() - 1, -1, yVar.b());
    }

    private View Y1(RecyclerView.u uVar, RecyclerView.y yVar) {
        if (this.x) {
            return O1(uVar, yVar);
        }
        return T1(uVar, yVar);
    }

    private View Z1(RecyclerView.u uVar, RecyclerView.y yVar) {
        if (this.x) {
            return T1(uVar, yVar);
        }
        return O1(uVar, yVar);
    }

    private View b2(RecyclerView.u uVar, RecyclerView.y yVar) {
        if (this.x) {
            return P1(uVar, yVar);
        }
        return U1(uVar, yVar);
    }

    private View c2(RecyclerView.u uVar, RecyclerView.y yVar) {
        if (this.x) {
            return U1(uVar, yVar);
        }
        return P1(uVar, yVar);
    }

    private int d2(int i, RecyclerView.u uVar, RecyclerView.y yVar, boolean z2) {
        int i2;
        int i3 = this.u.i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -t2(-i3, uVar, yVar);
        int i5 = i + i4;
        if (!z2 || (i2 = this.u.i() - i5) <= 0) {
            return i4;
        }
        this.u.r(i2);
        return i2 + i4;
    }

    private int e2(int i, RecyclerView.u uVar, RecyclerView.y yVar, boolean z2) {
        int m;
        int m2 = i - this.u.m();
        if (m2 <= 0) {
            return 0;
        }
        int i2 = -t2(m2, uVar, yVar);
        int i3 = i + i2;
        if (!z2 || (m = i3 - this.u.m()) <= 0) {
            return i2;
        }
        this.u.r(-m);
        return i2 - m;
    }

    private View f2() {
        return H(this.x ? 0 : I() - 1);
    }

    private View g2() {
        return H(this.x ? I() - 1 : 0);
    }

    private void l2(RecyclerView.u uVar, RecyclerView.y yVar, int i, int i2) {
        RecyclerView.u uVar2 = uVar;
        RecyclerView.y yVar2 = yVar;
        if (yVar.g() && I() != 0 && !yVar.e() && F1()) {
            List<RecyclerView.b0> k = uVar.k();
            int size = k.size();
            int f0 = f0(H(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.b0 b0Var = k.get(i5);
                if (!b0Var.u()) {
                    char c2 = 1;
                    if ((b0Var.m() < f0) != this.x) {
                        c2 = 65535;
                    }
                    if (c2 == 65535) {
                        i3 += this.u.e(b0Var.f1686a);
                    } else {
                        i4 += this.u.e(b0Var.f1686a);
                    }
                }
            }
            this.t.k = k;
            if (i3 > 0) {
                D2(f0(g2()), i);
                c cVar = this.t;
                cVar.h = i3;
                cVar.f1661c = 0;
                cVar.a();
                N1(uVar2, this.t, yVar2, false);
            }
            if (i4 > 0) {
                B2(f0(f2()), i2);
                c cVar2 = this.t;
                cVar2.h = i4;
                cVar2.f1661c = 0;
                cVar2.a();
                N1(uVar2, this.t, yVar2, false);
            }
            this.t.k = null;
        }
    }

    private void n2(RecyclerView.u uVar, c cVar) {
        if (cVar.f1659a && !cVar.l) {
            if (cVar.f1664f == -1) {
                p2(uVar, cVar.g);
            } else {
                q2(uVar, cVar.g);
            }
        }
    }

    private void o2(RecyclerView.u uVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    k1(i3, uVar);
                }
                return;
            }
            while (i > i2) {
                k1(i, uVar);
                i--;
            }
        }
    }

    private void p2(RecyclerView.u uVar, int i) {
        int I = I();
        if (i >= 0) {
            int h = this.u.h() - i;
            if (this.x) {
                for (int i2 = 0; i2 < I; i2++) {
                    View H = H(i2);
                    if (this.u.g(H) < h || this.u.q(H) < h) {
                        o2(uVar, 0, i2);
                        return;
                    }
                }
                return;
            }
            int i3 = I - 1;
            for (int i4 = i3; i4 >= 0; i4--) {
                View H2 = H(i4);
                if (this.u.g(H2) < h || this.u.q(H2) < h) {
                    o2(uVar, i3, i4);
                    return;
                }
            }
        }
    }

    private void q2(RecyclerView.u uVar, int i) {
        if (i >= 0) {
            int I = I();
            if (this.x) {
                int i2 = I - 1;
                for (int i3 = i2; i3 >= 0; i3--) {
                    View H = H(i3);
                    if (this.u.d(H) > i || this.u.p(H) > i) {
                        o2(uVar, i2, i3);
                        return;
                    }
                }
                return;
            }
            for (int i4 = 0; i4 < I; i4++) {
                View H2 = H(i4);
                if (this.u.d(H2) > i || this.u.p(H2) > i) {
                    o2(uVar, 0, i4);
                    return;
                }
            }
        }
    }

    private void s2() {
        if (this.s == 1 || !j2()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    private boolean x2(RecyclerView.u uVar, RecyclerView.y yVar, a aVar) {
        View view;
        int i;
        boolean z2 = false;
        if (I() == 0) {
            return false;
        }
        View U = U();
        if (U != null && aVar.d(U, yVar)) {
            aVar.c(U, f0(U));
            return true;
        } else if (this.v != this.y) {
            return false;
        } else {
            if (aVar.f1653d) {
                view = b2(uVar, yVar);
            } else {
                view = c2(uVar, yVar);
            }
            if (view == null) {
                return false;
            }
            aVar.b(view, f0(view));
            if (!yVar.e() && F1()) {
                if (this.u.g(view) >= this.u.i() || this.u.d(view) < this.u.m()) {
                    z2 = true;
                }
                if (z2) {
                    if (aVar.f1653d) {
                        i = this.u.i();
                    } else {
                        i = this.u.m();
                    }
                    aVar.f1652c = i;
                }
            }
            return true;
        }
    }

    private boolean y2(RecyclerView.y yVar, a aVar) {
        int i;
        int i2;
        boolean z2 = false;
        if (!yVar.e() && (i = this.A) != -1) {
            if (i < 0 || i >= yVar.b()) {
                this.A = -1;
                this.B = Integer.MIN_VALUE;
            } else {
                aVar.f1651b = this.A;
                SavedState savedState = this.D;
                if (savedState != null && savedState.a()) {
                    boolean z3 = this.D.f1649d;
                    aVar.f1653d = z3;
                    if (z3) {
                        aVar.f1652c = this.u.i() - this.D.f1648c;
                    } else {
                        aVar.f1652c = this.u.m() + this.D.f1648c;
                    }
                    return true;
                } else if (this.B == Integer.MIN_VALUE) {
                    View B2 = B(this.A);
                    if (B2 == null) {
                        if (I() > 0) {
                            if ((this.A < f0(H(0))) == this.x) {
                                z2 = true;
                            }
                            aVar.f1653d = z2;
                        }
                        aVar.a();
                    } else if (this.u.e(B2) > this.u.n()) {
                        aVar.a();
                        return true;
                    } else if (this.u.g(B2) - this.u.m() < 0) {
                        aVar.f1652c = this.u.m();
                        aVar.f1653d = false;
                        return true;
                    } else if (this.u.i() - this.u.d(B2) < 0) {
                        aVar.f1652c = this.u.i();
                        aVar.f1653d = true;
                        return true;
                    } else {
                        if (aVar.f1653d) {
                            i2 = this.u.d(B2) + this.u.o();
                        } else {
                            i2 = this.u.g(B2);
                        }
                        aVar.f1652c = i2;
                    }
                    return true;
                } else {
                    boolean z4 = this.x;
                    aVar.f1653d = z4;
                    if (z4) {
                        aVar.f1652c = this.u.i() - this.B;
                    } else {
                        aVar.f1652c = this.u.m() + this.B;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private void z2(RecyclerView.u uVar, RecyclerView.y yVar, a aVar) {
        if (!y2(yVar, aVar) && !x2(uVar, yVar, aVar)) {
            aVar.a();
            aVar.f1651b = this.y ? yVar.b() - 1 : 0;
        }
    }

    public View B(int i) {
        int I = I();
        if (I == 0) {
            return null;
        }
        int f0 = i - f0(H(0));
        if (f0 >= 0 && f0 < I) {
            View H = H(f0);
            if (f0(H) == i) {
                return H;
            }
        }
        return super.B(i);
    }

    public RecyclerView.o C() {
        return new RecyclerView.o(-2, -2);
    }

    /* access modifiers changed from: package-private */
    public boolean C1() {
        return (W() == 1073741824 || n0() == 1073741824 || !o0()) ? false : true;
    }

    public boolean F1() {
        return this.D == null && this.v == this.y;
    }

    public void G0(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.G0(recyclerView, uVar);
        if (this.C) {
            h1(uVar);
            uVar.c();
        }
    }

    /* access modifiers changed from: package-private */
    public void G1(RecyclerView.y yVar, c cVar, RecyclerView.LayoutManager.c cVar2) {
        int i = cVar.f1662d;
        if (i >= 0 && i < yVar.b()) {
            cVar2.a(i, Math.max(0, cVar.g));
        }
    }

    public View H0(View view, int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        int K1;
        View view2;
        View view3;
        s2();
        if (I() == 0 || (K1 = K1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        M1();
        M1();
        A2(K1, (int) (((float) this.u.n()) * 0.33333334f), false, yVar);
        c cVar = this.t;
        cVar.g = Integer.MIN_VALUE;
        cVar.f1659a = false;
        N1(uVar, cVar, yVar, true);
        if (K1 == -1) {
            view2 = Z1(uVar, yVar);
        } else {
            view2 = Y1(uVar, yVar);
        }
        if (K1 == -1) {
            view3 = g2();
        } else {
            view3 = f2();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    public void I0(AccessibilityEvent accessibilityEvent) {
        super.I0(accessibilityEvent);
        if (I() > 0) {
            accessibilityEvent.setFromIndex(S1());
            accessibilityEvent.setToIndex(V1());
        }
    }

    /* access modifiers changed from: package-private */
    public int K1(int i) {
        if (i == 1) {
            return (this.s != 1 && j2()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.s != 1 && j2()) ? -1 : 1;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    return (i == 130 && this.s == 1) ? 1 : Integer.MIN_VALUE;
                }
                if (this.s == 0) {
                    return 1;
                }
                return Integer.MIN_VALUE;
            } else if (this.s == 1) {
                return -1;
            } else {
                return Integer.MIN_VALUE;
            }
        } else if (this.s == 0) {
            return -1;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    /* access modifiers changed from: package-private */
    public c L1() {
        return new c();
    }

    /* access modifiers changed from: package-private */
    public void M1() {
        if (this.t == null) {
            this.t = L1();
        }
    }

    /* access modifiers changed from: package-private */
    public int N1(RecyclerView.u uVar, c cVar, RecyclerView.y yVar, boolean z2) {
        int i = cVar.f1661c;
        int i2 = cVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.g = i2 + i;
            }
            n2(uVar, cVar);
        }
        int i3 = cVar.f1661c + cVar.h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.l && i3 <= 0) || !cVar.c(yVar)) {
                break;
            }
            bVar.a();
            k2(uVar, yVar, cVar, bVar);
            if (!bVar.f1656b) {
                cVar.f1660b += bVar.f1655a * cVar.f1664f;
                if (!bVar.f1657c || this.t.k != null || !yVar.e()) {
                    int i4 = cVar.f1661c;
                    int i5 = bVar.f1655a;
                    cVar.f1661c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.f1655a;
                    cVar.g = i7;
                    int i8 = cVar.f1661c;
                    if (i8 < 0) {
                        cVar.g = i7 + i8;
                    }
                    n2(uVar, cVar);
                }
                if (z2 && bVar.f1658d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f1661c;
    }

    public int S1() {
        View X1 = X1(0, I(), false, true);
        if (X1 == null) {
            return -1;
        }
        return f0(X1);
    }

    public void V0(RecyclerView.u uVar, RecyclerView.y yVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View B2;
        int i8;
        int i9;
        int i10 = -1;
        if (!(this.D == null && this.A == -1) && yVar.b() == 0) {
            h1(uVar);
            return;
        }
        SavedState savedState = this.D;
        if (savedState != null && savedState.a()) {
            this.A = this.D.f1647b;
        }
        M1();
        this.t.f1659a = false;
        s2();
        View U = U();
        if (!this.E.f1654e || this.A != -1 || this.D != null) {
            this.E.e();
            a aVar = this.E;
            aVar.f1653d = this.x ^ this.y;
            z2(uVar, yVar, aVar);
            this.E.f1654e = true;
        } else if (U != null && (this.u.g(U) >= this.u.i() || this.u.d(U) <= this.u.m())) {
            this.E.c(U, f0(U));
        }
        int h2 = h2(yVar);
        if (this.t.j >= 0) {
            i = h2;
            h2 = 0;
        } else {
            i = 0;
        }
        int m = h2 + this.u.m();
        int j = i + this.u.j();
        if (!(!yVar.e() || (i7 = this.A) == -1 || this.B == Integer.MIN_VALUE || (B2 = B(i7)) == null)) {
            if (this.x) {
                i8 = this.u.i() - this.u.d(B2);
                i9 = this.B;
            } else {
                i9 = this.u.g(B2) - this.u.m();
                i8 = this.B;
            }
            int i11 = i8 - i9;
            if (i11 > 0) {
                m += i11;
            } else {
                j -= i11;
            }
        }
        if (!this.E.f1653d ? !this.x : this.x) {
            i10 = 1;
        }
        m2(uVar, yVar, this.E, i10);
        v(uVar);
        this.t.l = r2();
        this.t.i = yVar.e();
        a aVar2 = this.E;
        if (aVar2.f1653d) {
            E2(aVar2);
            c cVar = this.t;
            cVar.h = m;
            N1(uVar, cVar, yVar, false);
            c cVar2 = this.t;
            i3 = cVar2.f1660b;
            int i12 = cVar2.f1662d;
            int i13 = cVar2.f1661c;
            if (i13 > 0) {
                j += i13;
            }
            C2(this.E);
            c cVar3 = this.t;
            cVar3.h = j;
            cVar3.f1662d += cVar3.f1663e;
            N1(uVar, cVar3, yVar, false);
            c cVar4 = this.t;
            i2 = cVar4.f1660b;
            int i14 = cVar4.f1661c;
            if (i14 > 0) {
                D2(i12, i3);
                c cVar5 = this.t;
                cVar5.h = i14;
                N1(uVar, cVar5, yVar, false);
                i3 = this.t.f1660b;
            }
        } else {
            C2(aVar2);
            c cVar6 = this.t;
            cVar6.h = j;
            N1(uVar, cVar6, yVar, false);
            c cVar7 = this.t;
            i2 = cVar7.f1660b;
            int i15 = cVar7.f1662d;
            int i16 = cVar7.f1661c;
            if (i16 > 0) {
                m += i16;
            }
            E2(this.E);
            c cVar8 = this.t;
            cVar8.h = m;
            cVar8.f1662d += cVar8.f1663e;
            N1(uVar, cVar8, yVar, false);
            c cVar9 = this.t;
            i3 = cVar9.f1660b;
            int i17 = cVar9.f1661c;
            if (i17 > 0) {
                B2(i15, i2);
                c cVar10 = this.t;
                cVar10.h = i17;
                N1(uVar, cVar10, yVar, false);
                i2 = this.t.f1660b;
            }
        }
        if (I() > 0) {
            if (this.x ^ this.y) {
                int d2 = d2(i2, uVar, yVar, true);
                i5 = i3 + d2;
                i4 = i2 + d2;
                i6 = e2(i5, uVar, yVar, false);
            } else {
                int e2 = e2(i3, uVar, yVar, true);
                i5 = i3 + e2;
                i4 = i2 + e2;
                i6 = d2(i4, uVar, yVar, false);
            }
            i3 = i5 + i6;
            i2 = i4 + i6;
        }
        l2(uVar, yVar, i3, i2);
        if (!yVar.e()) {
            this.u.s();
        } else {
            this.E.e();
        }
        this.v = this.y;
    }

    public int V1() {
        View X1 = X1(I() - 1, -1, false, true);
        if (X1 == null) {
            return -1;
        }
        return f0(X1);
    }

    public void W0(RecyclerView.y yVar) {
        super.W0(yVar);
        this.D = null;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.E.e();
    }

    /* access modifiers changed from: package-private */
    public View W1(int i, int i2) {
        int i3;
        int i4;
        M1();
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return H(i);
        }
        if (this.u.g(H(i)) < this.u.m()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        if (this.s == 0) {
            return this.f1674e.a(i, i2, i4, i3);
        }
        return this.f1675f.a(i, i2, i4, i3);
    }

    /* access modifiers changed from: package-private */
    public View X1(int i, int i2, boolean z2, boolean z3) {
        M1();
        int i3 = 320;
        int i4 = z2 ? 24579 : 320;
        if (!z3) {
            i3 = 0;
        }
        if (this.s == 0) {
            return this.f1674e.a(i, i2, i4, i3);
        }
        return this.f1675f.a(i, i2, i4, i3);
    }

    public void a1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.D = (SavedState) parcelable;
            q1();
        }
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
            View H = H(i);
            int f0 = f0(H);
            if (f0 >= 0 && f0 < i3) {
                if (((RecyclerView.o) H.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = H;
                    }
                } else if (this.u.g(H) < i4 && this.u.d(H) >= m) {
                    return H;
                } else {
                    if (view == null) {
                        view = H;
                    }
                }
            }
            i += i5;
        }
        return view != null ? view : view2;
    }

    public Parcelable b1() {
        if (this.D != null) {
            return new SavedState(this.D);
        }
        SavedState savedState = new SavedState();
        if (I() > 0) {
            M1();
            boolean z2 = this.v ^ this.x;
            savedState.f1649d = z2;
            if (z2) {
                View f2 = f2();
                savedState.f1648c = this.u.i() - this.u.d(f2);
                savedState.f1647b = f0(f2);
            } else {
                View g2 = g2();
                savedState.f1647b = f0(g2);
                savedState.f1648c = this.u.g(g2) - this.u.m();
            }
        } else {
            savedState.b();
        }
        return savedState;
    }

    public void f(String str) {
        if (this.D == null) {
            super.f(str);
        }
    }

    /* access modifiers changed from: protected */
    public int h2(RecyclerView.y yVar) {
        if (yVar.d()) {
            return this.u.n();
        }
        return 0;
    }

    public int i2() {
        return this.s;
    }

    public boolean j() {
        return this.s == 0;
    }

    /* access modifiers changed from: protected */
    public boolean j2() {
        return X() == 1;
    }

    public boolean k() {
        return this.s == 1;
    }

    /* access modifiers changed from: package-private */
    public void k2(RecyclerView.u uVar, RecyclerView.y yVar, c cVar, b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View d2 = cVar.d(uVar);
        if (d2 == null) {
            bVar.f1656b = true;
            return;
        }
        RecyclerView.o oVar = (RecyclerView.o) d2.getLayoutParams();
        if (cVar.k == null) {
            if (this.x == (cVar.f1664f == -1)) {
                c(d2);
            } else {
                d(d2, 0);
            }
        } else {
            if (this.x == (cVar.f1664f == -1)) {
                a(d2);
            } else {
                b(d2, 0);
            }
        }
        y0(d2, 0, 0);
        bVar.f1655a = this.u.e(d2);
        if (this.s == 1) {
            if (j2()) {
                i5 = m0() - d0();
                i4 = i5 - this.u.f(d2);
            } else {
                i4 = c0();
                i5 = this.u.f(d2) + i4;
            }
            if (cVar.f1664f == -1) {
                int i6 = cVar.f1660b;
                i = i6;
                i2 = i5;
                i3 = i6 - bVar.f1655a;
            } else {
                int i7 = cVar.f1660b;
                i3 = i7;
                i2 = i5;
                i = bVar.f1655a + i7;
            }
        } else {
            int e0 = e0();
            int f2 = this.u.f(d2) + e0;
            if (cVar.f1664f == -1) {
                int i8 = cVar.f1660b;
                i2 = i8;
                i3 = e0;
                i = f2;
                i4 = i8 - bVar.f1655a;
            } else {
                int i9 = cVar.f1660b;
                i3 = e0;
                i2 = bVar.f1655a + i9;
                i = f2;
                i4 = i9;
            }
        }
        x0(d2, i4, i3, i2, i);
        if (oVar.c() || oVar.b()) {
            bVar.f1657c = true;
        }
        bVar.f1658d = d2.hasFocusable();
    }

    /* access modifiers changed from: package-private */
    public void m2(RecyclerView.u uVar, RecyclerView.y yVar, a aVar, int i) {
    }

    public void n(int i, int i2, RecyclerView.y yVar, RecyclerView.LayoutManager.c cVar) {
        if (this.s != 0) {
            i = i2;
        }
        if (I() != 0 && i != 0) {
            M1();
            A2(i > 0 ? 1 : -1, Math.abs(i), true, yVar);
            G1(yVar, this.t, cVar);
        }
    }

    public void o(int i, RecyclerView.LayoutManager.c cVar) {
        boolean z2;
        int i2;
        SavedState savedState = this.D;
        int i3 = -1;
        if (savedState == null || !savedState.a()) {
            s2();
            z2 = this.x;
            i2 = this.A;
            if (i2 == -1) {
                i2 = z2 ? i - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.D;
            z2 = savedState2.f1649d;
            i2 = savedState2.f1647b;
        }
        if (!z2) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.G && i2 >= 0 && i2 < i; i4++) {
            cVar.a(i2, 0);
            i2 += i3;
        }
    }

    public int p(RecyclerView.y yVar) {
        return H1(yVar);
    }

    public int q(RecyclerView.y yVar) {
        return I1(yVar);
    }

    public boolean q0() {
        return true;
    }

    public int r(RecyclerView.y yVar) {
        return J1(yVar);
    }

    /* access modifiers changed from: package-private */
    public boolean r2() {
        return this.u.k() == 0 && this.u.h() == 0;
    }

    public int s(RecyclerView.y yVar) {
        return H1(yVar);
    }

    public int t(RecyclerView.y yVar) {
        return I1(yVar);
    }

    public int t1(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        if (this.s == 1) {
            return 0;
        }
        return t2(i, uVar, yVar);
    }

    /* access modifiers changed from: package-private */
    public int t2(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        if (I() == 0 || i == 0) {
            return 0;
        }
        this.t.f1659a = true;
        M1();
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        A2(i2, abs, true, yVar);
        c cVar = this.t;
        int N1 = cVar.g + N1(uVar, cVar, yVar, false);
        if (N1 < 0) {
            return 0;
        }
        if (abs > N1) {
            i = i2 * N1;
        }
        this.u.r(-i);
        this.t.j = i;
        return i;
    }

    public int u(RecyclerView.y yVar) {
        return J1(yVar);
    }

    public int u1(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        if (this.s == 0) {
            return 0;
        }
        return t2(i, uVar, yVar);
    }

    public void u2(int i) {
        if (i == 0 || i == 1) {
            f((String) null);
            if (i != this.s || this.u == null) {
                h b2 = h.b(this, i);
                this.u = b2;
                this.E.f1650a = b2;
                this.s = i;
                q1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    public void v2(boolean z2) {
        f((String) null);
        if (z2 != this.w) {
            this.w = z2;
            q1();
        }
    }

    public void w2(boolean z2) {
        f((String) null);
        if (this.y != z2) {
            this.y = z2;
            q1();
        }
    }

    public LinearLayoutManager(Context context, int i, boolean z2) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        u2(i);
        v2(z2);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        RecyclerView.LayoutManager.Properties g0 = RecyclerView.LayoutManager.g0(context, attributeSet, i, i2);
        u2(g0.orientation);
        v2(g0.reverseLayout);
        w2(g0.stackFromEnd);
    }
}
