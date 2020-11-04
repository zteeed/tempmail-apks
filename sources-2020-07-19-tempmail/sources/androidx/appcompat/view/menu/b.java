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
    protected Context f814b;

    /* renamed from: c  reason: collision with root package name */
    protected Context f815c;

    /* renamed from: d  reason: collision with root package name */
    protected h f816d;

    /* renamed from: e  reason: collision with root package name */
    protected LayoutInflater f817e;

    /* renamed from: f  reason: collision with root package name */
    private o.a f818f;
    private int g;
    private int h;
    protected p i;
    private int j;

    public b(Context context, int i2, int i3) {
        this.f814b = context;
        this.f817e = LayoutInflater.from(context);
        this.g = i2;
        this.h = i3;
    }

    public void a(h hVar, boolean z) {
        o.a aVar = this.f818f;
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
        return (p.a) this.f817e.inflate(this.h, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    public boolean f(ViewGroup viewGroup, int i2) {
        viewGroup.removeViewAt(i2);
        return true;
    }

    public int g() {
        return this.j;
    }

    public void h(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup != null) {
            h hVar = this.f816d;
            int i2 = 0;
            if (hVar != null) {
                hVar.t();
                ArrayList<j> G = this.f816d.G();
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

    public boolean j(h hVar, j jVar) {
        return false;
    }

    public boolean k(h hVar, j jVar) {
        return false;
    }

    public void l(o.a aVar) {
        this.f818f = aVar;
    }

    public void m(Context context, h hVar) {
        this.f815c = context;
        LayoutInflater.from(context);
        this.f816d = hVar;
    }

    public boolean o(u uVar) {
        o.a aVar = this.f818f;
        if (aVar != null) {
            return aVar.b(uVar);
        }
        return false;
    }

    public o.a q() {
        return this.f818f;
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
            p pVar = (p) this.f817e.inflate(this.g, viewGroup, false);
            this.i = pVar;
            pVar.b(this.f816d);
            h(true);
        }
        return this.i;
    }

    public void t(int i2) {
        this.j = i2;
    }

    public abstract boolean u(int i2, j jVar);
}
