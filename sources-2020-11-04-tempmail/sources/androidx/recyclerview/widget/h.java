package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    protected final RecyclerView.LayoutManager f1924a;

    /* renamed from: b  reason: collision with root package name */
    private int f1925b;

    /* renamed from: c  reason: collision with root package name */
    final Rect f1926c;

    /* compiled from: OrientationHelper */
    static class a extends h {
        a(RecyclerView.LayoutManager layoutManager) {
            super(layoutManager, (a) null);
        }

        public int d(View view) {
            return this.f1924a.S(view) + ((RecyclerView.o) view.getLayoutParams()).rightMargin;
        }

        public int e(View view) {
            RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
            return this.f1924a.R(view) + oVar.leftMargin + oVar.rightMargin;
        }

        public int f(View view) {
            RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
            return this.f1924a.Q(view) + oVar.topMargin + oVar.bottomMargin;
        }

        public int g(View view) {
            return this.f1924a.P(view) - ((RecyclerView.o) view.getLayoutParams()).leftMargin;
        }

        public int h() {
            return this.f1924a.m0();
        }

        public int i() {
            return this.f1924a.m0() - this.f1924a.d0();
        }

        public int j() {
            return this.f1924a.d0();
        }

        public int k() {
            return this.f1924a.n0();
        }

        public int l() {
            return this.f1924a.W();
        }

        public int m() {
            return this.f1924a.c0();
        }

        public int n() {
            return (this.f1924a.m0() - this.f1924a.c0()) - this.f1924a.d0();
        }

        public int p(View view) {
            this.f1924a.l0(view, true, this.f1926c);
            return this.f1926c.right;
        }

        public int q(View view) {
            this.f1924a.l0(view, true, this.f1926c);
            return this.f1926c.left;
        }

        public void r(int i) {
            this.f1924a.A0(i);
        }
    }

    /* compiled from: OrientationHelper */
    static class b extends h {
        b(RecyclerView.LayoutManager layoutManager) {
            super(layoutManager, (a) null);
        }

        public int d(View view) {
            return this.f1924a.N(view) + ((RecyclerView.o) view.getLayoutParams()).bottomMargin;
        }

        public int e(View view) {
            RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
            return this.f1924a.Q(view) + oVar.topMargin + oVar.bottomMargin;
        }

        public int f(View view) {
            RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
            return this.f1924a.R(view) + oVar.leftMargin + oVar.rightMargin;
        }

        public int g(View view) {
            return this.f1924a.T(view) - ((RecyclerView.o) view.getLayoutParams()).topMargin;
        }

        public int h() {
            return this.f1924a.V();
        }

        public int i() {
            return this.f1924a.V() - this.f1924a.b0();
        }

        public int j() {
            return this.f1924a.b0();
        }

        public int k() {
            return this.f1924a.W();
        }

        public int l() {
            return this.f1924a.n0();
        }

        public int m() {
            return this.f1924a.e0();
        }

        public int n() {
            return (this.f1924a.V() - this.f1924a.e0()) - this.f1924a.b0();
        }

        public int p(View view) {
            this.f1924a.l0(view, true, this.f1926c);
            return this.f1926c.bottom;
        }

        public int q(View view) {
            this.f1924a.l0(view, true, this.f1926c);
            return this.f1926c.top;
        }

        public void r(int i) {
            this.f1924a.B0(i);
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
        if (Integer.MIN_VALUE == this.f1925b) {
            return 0;
        }
        return n() - this.f1925b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i);

    public void s() {
        this.f1925b = n();
    }

    private h(RecyclerView.LayoutManager layoutManager) {
        this.f1925b = Integer.MIN_VALUE;
        this.f1926c = new Rect();
        this.f1924a = layoutManager;
    }
}
