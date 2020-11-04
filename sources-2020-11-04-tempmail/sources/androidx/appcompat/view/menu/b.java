package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.p;
import java.util.ArrayList;

/* compiled from: BaseMenuPresenter */
public abstract class b implements o {

    /* renamed from: b  reason: collision with root package name */
    protected Context f841b;

    /* renamed from: c  reason: collision with root package name */
    protected Context f842c;

    /* renamed from: d  reason: collision with root package name */
    protected h f843d;

    /* renamed from: e  reason: collision with root package name */
    protected LayoutInflater f844e;

    /* renamed from: f  reason: collision with root package name */
    private o.a f845f;
    private int g;
    private int h;
    protected p i;
    private int j;

    public b(Context context, int i2, int i3) {
        this.f841b = context;
        this.f844e = LayoutInflater.from(context);
        this.g = i2;
        this.h = i3;
    }

    public void a(h hVar, boolean z) {
        o.a aVar = this.f845f;
        if (aVar != null) {
            aVar.a(hVar, z);
        }
    }

    /* access modifiers changed from: protected */
    public void c(View view, int i2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.i).addView(view, i2);
    }

    public abstract void d(j jVar, p.a aVar);

    public p.a e(ViewGroup viewGroup) {
        return (p.a) this.f844e.inflate(this.h, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    public boolean f(ViewGroup viewGroup, int i2) {
        viewGroup.removeViewAt(i2);
        return true;
    }

    public o.a g() {
        return this.f845f;
    }

    public int h() {
        return this.j;
    }

    public void i(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup != null) {
            h hVar = this.f843d;
            int i2 = 0;
            if (hVar != null) {
                hVar.t();
                ArrayList<j> G = this.f843d.G();
                int size = G.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    j jVar = G.get(i4);
                    if (u(i3, jVar)) {
                        View childAt = viewGroup.getChildAt(i3);
                        j itemData = childAt instanceof p.a ? ((p.a) childAt).getItemData() : null;
                        View r = r(jVar, childAt, viewGroup);
                        if (jVar != itemData) {
                            r.setPressed(false);
                            r.jumpDrawablesToCurrentState();
                        }
                        if (r != childAt) {
                            c(r, i3);
                        }
                        i3++;
                    }
                }
                i2 = i3;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (!f(viewGroup, i2)) {
                    i2++;
                }
            }
        }
    }

    public boolean k(h hVar, j jVar) {
        return false;
    }

    public boolean l(h hVar, j jVar) {
        return false;
    }

    public void m(o.a aVar) {
        this.f845f = aVar;
    }

    public void n(Context context, h hVar) {
        this.f842c = context;
        LayoutInflater.from(context);
        this.f843d = hVar;
    }

    public boolean p(u uVar) {
        o.a aVar = this.f845f;
        if (aVar != null) {
            return aVar.b(uVar);
        }
        return false;
    }

    public View r(j jVar, View view, ViewGroup viewGroup) {
        p.a aVar;
        if (view instanceof p.a) {
            aVar = (p.a) view;
        } else {
            aVar = e(viewGroup);
        }
        d(jVar, aVar);
        return (View) aVar;
    }

    public p s(ViewGroup viewGroup) {
        if (this.i == null) {
            p pVar = (p) this.f844e.inflate(this.g, viewGroup, false);
            this.i = pVar;
            pVar.b(this.f843d);
            i(true);
        }
        return this.i;
    }

    public void t(int i2) {
        this.j = i2;
    }

    public abstract boolean u(int i2, j jVar);
}
