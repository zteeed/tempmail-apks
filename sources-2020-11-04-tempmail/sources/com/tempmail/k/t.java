package com.tempmail.k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.f;
import androidx.recyclerview.widget.RecyclerView;
import com.tempmail.R;
import com.tempmail.h;
import com.tempmail.n.o1;
import com.tempmail.u.b;
import com.tempmail.utils.m;
import com.tempmail.utils.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DomainsRvAdapter */
public class t extends RecyclerView.g<a> {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final String f12888e = "t";
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public h f12889c;

    /* renamed from: d  reason: collision with root package name */
    private List<b> f12890d = new ArrayList();

    /* compiled from: DomainsRvAdapter */
    class a extends RecyclerView.b0 {
        o1 t;
        View u;

        a(View view, o1 o1Var) {
            super(view);
            this.u = view;
            this.t = o1Var;
        }

        /* access modifiers changed from: package-private */
        public void L(b bVar) {
            this.t.r.setText(x.H(bVar.a()));
            String u2 = t.f12888e;
            m.b(u2, "domain " + bVar.a() + " isSelectable " + bVar.c());
            if (bVar.c()) {
                this.t.r.setBackground(androidx.core.content.a.f(t.this.f12889c, R.drawable.rect_blue_selected));
            } else {
                this.t.r.setBackground(androidx.core.content.a.f(t.this.f12889c, R.drawable.rect_blue));
            }
            if (bVar.b()) {
                this.t.q.setVisibility(0);
            } else {
                this.t.q.setVisibility(8);
            }
            this.t.q.setOnClickListener(new e(this));
            this.u.setOnClickListener(new d(this, bVar));
        }

        public /* synthetic */ void M(View view) {
            t.this.A();
        }

        public /* synthetic */ void N(b bVar, View view) {
            bVar.d(true);
            t.this.B(bVar);
        }
    }

    public t(h hVar, List<b> list) {
        this.f12889c = hVar;
        this.f12890d = list;
    }

    /* access modifiers changed from: private */
    public void B(b bVar) {
        for (b next : this.f12890d) {
            if (!next.equals(bVar)) {
                String str = f12888e;
                m.b(str, "domain unselect " + next.a());
                next.d(false);
            }
        }
        g();
    }

    public void A() {
        h hVar = this.f12889c;
        hVar.O0(hVar.getString(R.string.message_title_information), this.f12889c.getString(R.string.message_domain_deprecated));
    }

    public int c() {
        return this.f12890d.size();
    }

    public b x() {
        for (b next : this.f12890d) {
            if (next.c()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: y */
    public void k(a aVar, int i) {
        aVar.L(this.f12890d.get(i));
    }

    /* renamed from: z */
    public a m(ViewGroup viewGroup, int i) {
        o1 o1Var = (o1) f.d((LayoutInflater) this.f12889c.getSystemService("layout_inflater"), R.layout.spinner_item_child, viewGroup, false);
        return new a(o1Var.n(), o1Var);
    }
}
