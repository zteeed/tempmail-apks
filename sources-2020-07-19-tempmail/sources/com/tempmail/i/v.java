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
import com.tempmail.m.a1;
import com.tempmail.utils.g;
import com.tempmail.utils.h;
import com.tempmail.utils.m;
import com.tempmail.utils.z.e;
import com.tempmail.utils.z.l;
import java.util.List;

/* compiled from: HistoryEmailAdapter */
public class v extends RecyclerView.g<a> {
    /* access modifiers changed from: private */
    public static final String h = "v";
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public f f12364c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public l f12365d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public e f12366e;

    /* renamed from: f  reason: collision with root package name */
    private List<com.tempmail.db.e> f12367f;
    /* access modifiers changed from: private */
    public c g;

    /* compiled from: HistoryEmailAdapter */
    public class a extends RecyclerView.b0 {
        a1 t;
        View u;

        a(View view, a1 a1Var) {
            super(view);
            this.u = view;
            this.t = a1Var;
        }

        /* access modifiers changed from: package-private */
        public void L(com.tempmail.db.e eVar) {
            if (eVar.r().booleanValue()) {
                this.t.t.setBackgroundResource(R.drawable.my_rect_white_selected);
            } else {
                this.t.t.setBackgroundResource(R.drawable.my_rect_rounded_white);
            }
            this.t.t.setEnabled(false);
            this.t.v.setText(eVar.p());
            long u2 = (long) com.tempmail.utils.e.u(v.this.f12364c, v.this.g, eVar);
            int length = String.valueOf(u2).length();
            SpannableString spannableString = new SpannableString(v.this.f12364c.getString(R.string.inbox_read_unread_count, new Object[]{Integer.valueOf(com.tempmail.utils.e.n(v.this.f12364c, v.this.g, eVar)), Long.valueOf(u2)}));
            spannableString.setSpan(new ForegroundColorSpan(v.this.f12364c.getResources().getColor(R.color.main_button_color)), spannableString.length() - length, spannableString.length(), 33);
            this.t.s.setOnClickListener(new k(this, eVar));
            this.t.q.setOnClickListener(new i(this, eVar));
            List<DomainTable> v2 = g.v(v.this.g, eVar.k());
            DomainTable domainTable = null;
            if (v2.size() > 0) {
                domainTable = v2.get(0);
            }
            if (domainTable == null) {
                this.t.r.setVisibility(0);
                this.t.r.setImageResource(R.drawable.icons_delete_lock);
            } else if (domainTable.d()) {
                this.t.r.setVisibility(0);
            } else {
                this.t.r.setVisibility(8);
            }
            this.t.r.setOnClickListener(new j(this, domainTable));
        }

        public /* synthetic */ void M(com.tempmail.db.e eVar, View view) {
            if (v.this.f12365d != null) {
                m.b(v.h, "ivRestore");
                v.this.f12365d.a(eVar);
                v.this.g();
            }
        }

        public /* synthetic */ void N(com.tempmail.db.e eVar, View view) {
            if (g.z(v.this.g).size() > 1) {
                v.this.f12366e.a(eVar);
                this.t.u.o(true);
                return;
            }
            Toast.makeText(v.this.f12364c, R.string.message_delete_last_error, 1).show();
        }

        public /* synthetic */ void O(DomainTable domainTable, View view) {
            if (domainTable == null) {
                h.a(v.this.f12364c);
            } else if (domainTable.d()) {
                h.b(v.this.f12364c);
            }
        }
    }

    public v(f fVar, c cVar, List<com.tempmail.db.e> list) {
        this.f12364c = fVar;
        this.g = cVar;
        this.f12367f = list;
    }

    /* renamed from: A */
    public a m(ViewGroup viewGroup, int i) {
        a1 a1Var = (a1) androidx.databinding.f.d((LayoutInflater) this.f12364c.getSystemService("layout_inflater"), R.layout.item_email_address_expired, viewGroup, false);
        return new a(a1Var.n(), a1Var);
    }

    public void B(boolean z, int i, List<com.tempmail.db.e> list) {
        String str = h;
        m.b(str, "indexOf " + i);
        if (list != null) {
            m.b(h, "set email");
            this.f12367f = list;
        }
        if (z) {
            m.b(h, "email address default");
            g();
            return;
        }
        m.b(h, "email address not default");
        i(i);
    }

    public void C(l lVar) {
        this.f12365d = lVar;
    }

    public void D(e eVar) {
        this.f12366e = eVar;
    }

    public int c() {
        return this.f12367f.size();
    }

    /* renamed from: z */
    public void k(a aVar, int i) {
        aVar.L(this.f12367f.get(i));
    }
}
