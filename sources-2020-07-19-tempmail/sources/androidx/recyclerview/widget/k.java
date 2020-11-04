package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SimpleItemAnimator */
public abstract class k extends RecyclerView.l {
    boolean g = true;

    public final void A(RecyclerView.b0 b0Var) {
        I(b0Var);
        h(b0Var);
    }

    public final void B(RecyclerView.b0 b0Var) {
        J(b0Var);
    }

    public final void C(RecyclerView.b0 b0Var, boolean z) {
        K(b0Var, z);
        h(b0Var);
    }

    public final void D(RecyclerView.b0 b0Var, boolean z) {
        L(b0Var, z);
    }

    public final void E(RecyclerView.b0 b0Var) {
        M(b0Var);
        h(b0Var);
    }

    public final void F(RecyclerView.b0 b0Var) {
        N(b0Var);
    }

    public final void G(RecyclerView.b0 b0Var) {
        O(b0Var);
        h(b0Var);
    }

    public final void H(RecyclerView.b0 b0Var) {
        P(b0Var);
    }

    public void I(RecyclerView.b0 b0Var) {
    }

    public void J(RecyclerView.b0 b0Var) {
    }

    public void K(RecyclerView.b0 b0Var, boolean z) {
    }

    public void L(RecyclerView.b0 b0Var, boolean z) {
    }

    public void M(RecyclerView.b0 b0Var) {
    }

    public void N(RecyclerView.b0 b0Var) {
    }

    public void O(RecyclerView.b0 b0Var) {
    }

    public void P(RecyclerView.b0 b0Var) {
    }

    public boolean a(RecyclerView.b0 b0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        if (cVar == null || (cVar.f1703a == cVar2.f1703a && cVar.f1704b == cVar2.f1704b)) {
            return w(b0Var);
        }
        return y(b0Var, cVar.f1703a, cVar.f1704b, cVar2.f1703a, cVar2.f1704b);
    }

    public boolean b(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f1703a;
        int i4 = cVar.f1704b;
        if (b0Var2.I()) {
            int i5 = cVar.f1703a;
            i = cVar.f1704b;
            i2 = i5;
        } else {
            i2 = cVar2.f1703a;
            i = cVar2.f1704b;
        }
        return x(b0Var, b0Var2, i3, i4, i2, i);
    }

    public boolean c(RecyclerView.b0 b0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i = cVar.f1703a;
        int i2 = cVar.f1704b;
        View view = b0Var.f1686a;
        int left = cVar2 == null ? view.getLeft() : cVar2.f1703a;
        int top = cVar2 == null ? view.getTop() : cVar2.f1704b;
        if (b0Var.u() || (i == left && i2 == top)) {
            return z(b0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return y(b0Var, i, i2, left, top);
    }

    public boolean d(RecyclerView.b0 b0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        if (cVar.f1703a == cVar2.f1703a && cVar.f1704b == cVar2.f1704b) {
            E(b0Var);
            return false;
        }
        return y(b0Var, cVar.f1703a, cVar.f1704b, cVar2.f1703a, cVar2.f1704b);
    }

    public boolean f(RecyclerView.b0 b0Var) {
        return !this.g || b0Var.s();
    }

    public abstract boolean w(RecyclerView.b0 b0Var);

    public abstract boolean x(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2, int i, int i2, int i3, int i4);

    public abstract boolean y(RecyclerView.b0 b0Var, int i, int i2, int i3, int i4);

    public abstract boolean z(RecyclerView.b0 b0Var);
}
