package com.tempmail.k;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.databinding.f;
import androidx.recyclerview.widget.RecyclerView;
import com.tempmail.R;
import com.tempmail.db.DaoSession;
import com.tempmail.db.DomainTable;
import com.tempmail.db.EmailAddressTable;
import com.tempmail.h;
import com.tempmail.n.i1;
import com.tempmail.utils.g;
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
    public h f12905c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public l f12906d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public e f12907e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public List<EmailAddressTable> f12908f;
    /* access modifiers changed from: private */
    public DaoSession g;

    /* compiled from: SwitchEmailAdapter */
    public class a extends RecyclerView.b0 {
        i1 t;
        View u;

        a(View view, i1 i1Var) {
            super(view);
            this.u = view;
            this.t = i1Var;
        }

        /* access modifiers changed from: package-private */
        public void L(EmailAddressTable emailAddressTable) {
            if (emailAddressTable.getIsDefault().booleanValue()) {
                this.t.u.setBackgroundResource(R.drawable.my_rect_white_selected);
            } else {
                this.t.u.setBackgroundResource(R.drawable.my_rect_rounded_white);
            }
            this.t.w.setText(emailAddressTable.getFullEmailAddress());
            long u2 = (long) com.tempmail.utils.e.u(x.this.f12905c, x.this.g, emailAddressTable);
            int length = String.valueOf(u2).length();
            SpannableString spannableString = new SpannableString(x.this.f12905c.getString(R.string.inbox_read_unread_count, new Object[]{Integer.valueOf(com.tempmail.utils.e.n(x.this.f12905c, x.this.g, emailAddressTable)), Long.valueOf(u2)}));
            spannableString.setSpan(new ForegroundColorSpan(x.this.f12905c.getResources().getColor(R.color.main_button_color)), spannableString.length() - length, spannableString.length(), 33);
            this.t.y.setText(spannableString);
            this.t.A.setText(String.valueOf(com.tempmail.utils.e.u(x.this.f12905c, x.this.g, emailAddressTable)));
            this.t.r.setOnClickListener(new n(this, emailAddressTable));
            this.t.u.setOnClickListener(new q(this, emailAddressTable));
            List<DomainTable> u3 = g.u(x.this.g, emailAddressTable.getDomain());
            DomainTable domainTable = null;
            if (u3.size() > 0) {
                domainTable = u3.get(0);
            }
            if (domainTable == null) {
                this.t.s.setVisibility(8);
                this.t.q.setVisibility(4);
                this.t.t.setVisibility(0);
            } else if (domainTable.isExpiredSoon()) {
                this.t.s.setVisibility(0);
                this.t.q.setVisibility(0);
                this.t.t.setVisibility(8);
            } else {
                this.t.s.setVisibility(8);
                this.t.q.setVisibility(0);
                this.t.t.setVisibility(8);
            }
            this.t.s.setOnClickListener(new r(this));
            this.t.q.setOnClickListener(new o(this, emailAddressTable));
            this.t.t.setOnClickListener(new p(this));
        }

        public /* synthetic */ void M(EmailAddressTable emailAddressTable, View view) {
            if (x.this.f12908f.size() > 1) {
                x.this.f12907e.a(emailAddressTable);
                this.t.v.o(true);
                return;
            }
            Toast.makeText(x.this.f12905c, R.string.message_delete_last_error, 1).show();
        }

        public /* synthetic */ void N(EmailAddressTable emailAddressTable, View view) {
            m.b(x.h, "onItemClick");
            if (x.this.f12906d != null) {
                x.this.f12906d.a(emailAddressTable);
                x.this.g();
            }
        }

        public /* synthetic */ void O(View view) {
            com.tempmail.utils.h.b(x.this.f12905c);
        }

        public /* synthetic */ void P(EmailAddressTable emailAddressTable, View view) {
            com.tempmail.utils.e.j(x.this.f12905c, emailAddressTable.getFullEmailAddress());
        }

        public /* synthetic */ void Q(View view) {
            com.tempmail.utils.h.a(x.this.f12905c);
        }
    }

    public x(h hVar, DaoSession daoSession, List<EmailAddressTable> list) {
        this.f12905c = hVar;
        this.g = daoSession;
        this.f12908f = list;
    }

    /* renamed from: A */
    public void k(a aVar, int i) {
        aVar.L(this.f12908f.get(i));
    }

    /* renamed from: B */
    public a m(ViewGroup viewGroup, int i) {
        i1 i1Var = (i1) f.d((LayoutInflater) this.f12905c.getSystemService("layout_inflater"), R.layout.item_email_address, viewGroup, false);
        return new a(i1Var.n(), i1Var);
    }

    public void C(boolean z, int i, List<EmailAddressTable> list) {
        String str = h;
        m.b(str, "indexOf " + i);
        if (list != null) {
            m.b(h, "set email");
            this.f12908f = list;
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
        this.f12906d = lVar;
    }

    public void E(List<EmailAddressTable> list) {
        this.f12908f = list;
        g();
    }

    public void F(e eVar) {
        this.f12907e = eVar;
    }

    public int c() {
        return this.f12908f.size();
    }
}
