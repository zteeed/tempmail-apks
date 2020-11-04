package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    protected final RecyclerView.LayoutManager f1841a;

    /* renamed from: b  reason: collision with root package name */
    private int f1842b;

    /* renamed from: c  reason: collision with root package name */
    final Rect f1843c;

    /* compiled from: OrientationHelper */
    static class a extends h {
        a(RecyclerView.LayoutManager layoutManager) {
            super(layoutManager, (a) null);
        }

        public int d(View view) {
            return this.f1841a.S(view) + ((RecyclerView.o) view.getLayoutParams()).rightMargin;
        }

        public int e(View view) {
            RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
            return this.f1841a.R(view) + oVar.leftMargin + oVar.rightMargin;
        }

        public int f(View view) {
            RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
            return this.f1841a.Q(view) + oVar.topMargin + oVar.bottomMargin;
        }

        public int g(View view) {
            return this.f1841a.P(view) - ((RecyclerView.o) view.getLayoutParams()).leftMargin;
        }

        public int h() {
            return this.f1841a.m0();
        }

        public int i() {
            return this.f1841a.m0() - this.f1841a.d0();
        }

        public int j() {
            return this.f1841a.d0();
        }

        public int k() {
            return this.f1841a.n0();
        }

        public int l() {
            return this.f1841a.W();
        }

        public int m() {
            return this.f1841a.c0();
        }

        public int n() {
            return (this.f1841a.m0() - this.f1841a.c0()) - this.f1841a.d0();
        }

        public int p(View view) {
            this.f1841a.l0(view, true, this.f1843c);
            return this.f1843c.right;
        }

        public int q(View view) {
            this.f1841a.l0(view, true, this.f1843c);
            return this.f1843c.left;
        }

        public void r(int i) {
            this.f1841a.A0(i);
        }
    }

    /* compiled from: OrientationHelper */
    static class b extends h {
        b(RecyclerView.LayoutManager layoutManager) {
            super(layoutManager, (a) null);
        }

        public int d(View view) {
            return this.f1841a.N(view) + ((RecyclerView.o) view.getLayoutParams()).bottomMargin;
        }

        public int e(View view) {
            RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
            return this.f1841a.Q(view) + oVar.topMargin + oVar.bottomMargin;
        }

        public int f(View view) {
            RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
            return this.f1841a.R(view) + oVar.leftMargin + oVar.rightMargin;
        }

        public int g(View view) {
            return this.f1841a.T(view) - ((RecyclerView.o) view.getLayoutParams()).topMargin;
        }

        public int h() {
            return this.f1841a.V();
        }

        public int i() {
            return this.f1841a.V() - this.f1841a.b0();
        }

        public int j() {
            return this.f1841a.b0();
        }

        public int k() {
            return this.f1841a.W();
        }

        public int l() {
            return this.f1841a.n0();
        }

        public int m() {
            return this.f1841a.e0();
        }

        public int n() {
            return (this.f1841a.V() - this.f1841a.e0()) - this.f1841a.b0();
        }

        public int p(View view) {
            this.f1841a.l0(view, true, this.f1843c);
            return this.f1843c.bottom;
        }

        public int q(View view) {
            this.f1841a.l0(view, true, this.f1843c);
            return this.f1843c.top;
        }

        public void r(int i) {
            this.f1841a.B0(i);
        }
    }

    /* synthetic */ h(RecyclerView.LayoutManager layoutManager, a aVar) {
        this(layoutManager);
    }

    public static h a(RecyclerView.LayoutManager layoutManager) {
        return new a(layoutManager);
    }

    public static h b(RecyclerView.LayoutManager layoutManager, int i) {
        if (i == 0) {
            return a(layoutManager);
        }
        if (i == 1) {
            return c(layoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static h c(RecyclerView.LayoutManager layoutManager) {
        return new b(layoutManager);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f1842b) {
            return 0;
        }
        return n() - this.f1842b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i);

    public void s() {
        this.f1842b = n();
    }

    private h(RecyclerView.LayoutManager layoutManager) {
        this.f1842b = Integer.MIN_VALUE;
        this.f1843c = new Rect();
        this.f1841a = layoutManager;
    }
}
