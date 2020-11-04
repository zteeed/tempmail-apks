package com.tempmail.i;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tempmail.R;
import com.tempmail.f;
import com.tempmail.m.e1;
import com.tempmail.t.b;
import com.tempmail.utils.m;
import com.tempmail.utils.w;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DomainsRvAdapter */
public class t extends RecyclerView.g<a> {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final String f12356e = "t";
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public f f12357c;

    /* renamed from: d  reason: collision with root package name */
    private List<b> f12358d = new ArrayList();

    /* compiled from: DomainsRvAdapter */
    class a extends RecyclerView.b0 {
        e1 t;
        View u;

        a(View view, e1 e1Var) {
            super(view);
            this.u = view;
            this.t = e1Var;
        }

        /* access modifiers changed from: package-private */
        public void L(b bVar) {
            this.t.r.setText(w.F(bVar.a()));
            String u2 = t.f12356e;
            m.b(u2, "domain " + bVar.a() + " isSelectable " + bVar.c());
            if (bVar.c()) {
                this.t.r.setBackground(androidx.core.content.a.f(t.this.f12357c, R.drawable.rect_blue_selected));
            } else {
                this.t.r.setBackground(androidx.core.content.a.f(t.this.f12357c, R.drawable.rect_blue));
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

    public t(f fVar, List<b> list) {
        this.f12357c = fVar;
        this.f12358d = list;
    }

    /* access modifiers changed from: private */
    public void B(b bVar) {
        for (b next : this.f12358d) {
            if (!next.equals(bVar)) {
                String str = f12356e;
                m.b(str, "domain unselect " + next.a());
                next.d(false);
            }
        }
        g();
    }

    public void A() {
        f fVar = this.f12357c;
        fVar.Q0(fVar.getString(R.string.message_title_information), this.f12357c.getString(R.string.message_domain_deprecated));
    }

    public int c() {
        return this.f12358d.size();
    }

    public b x() {
        for (b next : this.f12358d) {
            if (next.c()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: y */
    public void k(a aVar, int i) {
        aVar.L(this.f12358d.get(i));
    }

    /* renamed from: z */
    public a m(ViewGroup viewGroup, int i) {
        e1 e1Var = (e1) androidx.databinding.f.d((LayoutInflater) this.f12357c.getSystemService("layout_inflater"), R.layout.spinner_item_child, viewGroup, false);
        return new a(e1Var.n(), e1Var);
    }
}
