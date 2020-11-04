package com.tempmail.i;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.tempmail.R;
import com.tempmail.db.DomainTable;
import com.tempmail.db.c;
import com.tempmail.f;
import com.tempmail.m.y0;
import com.tempmail.utils.g;
import com.tempmail.utils.h;
import com.tempmail.utils.m;
import com.tempmail.utils.z.e;
import com.tempmail.utils.z.l;
import java.util.List;

/* compiled from: SwitchEmailAdapter */
public class x extends RecyclerView.g<a> {
    /* access modifiers changed from: private */
    public static final String h = "x";
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public f f12373c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public l f12374d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public e f12375e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public List<com.tempmail.db.e> f12376f;
    /* access modifiers changed from: private */
    public c g;

    /* compiled from: SwitchEmailAdapter */
    public class a extends RecyclerView.b0 {
        y0 t;
        View u;

        a(View view, y0 y0Var) {
            super(view);
            this.u = view;
            this.t = y0Var;
        }

        /* access modifiers changed from: package-private */
        public void L(com.tempmail.db.e eVar) {
            if (eVar.r().booleanValue()) {
                this.t.u.setBackgroundResource(R.drawable.my_rect_white_selected);
            } else {
                this.t.u.setBackgroundResource(R.drawable.my_rect_rounded_white);
            }
            this.t.w.setText(eVar.p());
            long u2 = (long) com.tempmail.utils.e.u(x.this.f12373c, x.this.g, eVar);
            int length = String.valueOf(u2).length();
            SpannableString spannableString = new SpannableString(x.this.f12373c.getString(R.string.inbox_read_unread_count, new Object[]{Integer.valueOf(com.tempmail.utils.e.n(x.this.f12373c, x.this.g, eVar)), Long.valueOf(u2)}));
            spannableString.setSpan(new ForegroundColorSpan(x.this.f12373c.getResources().getColor(R.color.main_button_color)), spannableString.length() - length, spannableString.length(), 33);
            this.t.y.setText(spannableString);
            this.t.A.setText(String.valueOf(com.tempmail.utils.e.u(x.this.f12373c, x.this.g, eVar)));
            this.t.r.setOnClickListener(new n(this, eVar));
            this.t.u.setOnClickListener(new q(this, eVar));
            List<DomainTable> v2 = g.v(x.this.g, eVar.k());
            DomainTable domainTable = null;
            if (v2.size() > 0) {
                domainTable = v2.get(0);
            }
            if (domainTable == null) {
                this.t.s.setVisibility(8);
                this.t.q.setVisibility(4);
                this.t.t.setVisibility(0);
            } else if (domainTable.d()) {
                this.t.s.setVisibility(0);
                this.t.q.setVisibility(0);
                this.t.t.setVisibility(8);
            } else {
                this.t.s.setVisibility(8);
                this.t.q.setVisibility(0);
                this.t.t.setVisibility(8);
            }
            this.t.s.setOnClickListener(new r(this));
            this.t.q.setOnClickListener(new o(this, eVar));
            this.t.t.setOnClickListener(new p(this));
        }

        public /* synthetic */ void M(com.tempmail.db.e eVar, View view) {
            if (x.this.f12376f.size() > 1) {
                x.this.f12375e.a(eVar);
                this.t.v.o(true);
                return;
            }
            Toast.makeText(x.this.f12373c, R.string.message_delete_last_error, 1).show();
        }

        public /* synthetic */ void N(com.tempmail.db.e eVar, View view) {
            m.b(x.h, "onItemClick");
            if (x.this.f12374d != null) {
                x.this.f12374d.a(eVar);
                x.this.g();
            }
        }

        public /* synthetic */ void O(View view) {
            h.b(x.this.f12373c);
        }

        public /* synthetic */ void P(com.tempmail.db.e eVar, View view) {
            com.tempmail.utils.e.j(x.this.f12373c, eVar.p());
        }

        public /* synthetic */ void Q(View view) {
            h.a(x.this.f12373c);
        }
    }

    public x(f fVar, c cVar, List<com.tempmail.db.e> list) {
        this.f12373c = fVar;
        this.g = cVar;
        this.f12376f = list;
    }

    /* renamed from: A */
    public void k(a aVar, int i) {
        aVar.L(this.f12376f.get(i));
    }

    /* renamed from: B */
    public a m(ViewGroup viewGroup, int i) {
        y0 y0Var = (y0) androidx.databinding.f.d((LayoutInflater) this.f12373c.getSystemService("layout_inflater"), R.layout.item_email_address, viewGroup, false);
        return new a(y0Var.n(), y0Var);
    }

    public void C(boolean z, int i, List<com.tempmail.db.e> list) {
        String str = h;
        m.b(str, "indexOf " + i);
        if (list != null) {
            m.b(h, "set email");
            this.f12376f = list;
        }
        if (z) {
            m.b(h, "email address default");
            g();
            return;
        }
        m.b(h, "email address not default");
        i(i);
    }

    public void D(l lVar) {
        this.f12374d = lVar;
    }

    public void E(List<com.tempmail.db.e> list) {
        this.f12376f = list;
        g();
    }

    public void F(e eVar) {
        this.f12375e = eVar;
    }

    public int c() {
        return this.f12376f.size();
    }
}
