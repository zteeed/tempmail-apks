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
import com.tempmail.n.k1;
import com.tempmail.utils.g;
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
    public h f12896c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public l f12897d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public e f12898e;

    /* renamed from: f  reason: collision with root package name */
    private List<EmailAddressTable> f12899f;
    /* access modifiers changed from: private */
    public DaoSession g;

    /* compiled from: HistoryEmailAdapter */
    public class a extends RecyclerView.b0 {
        k1 t;
        View u;

        a(View view, k1 k1Var) {
            super(view);
            this.u = view;
            this.t = k1Var;
        }

        /* access modifiers changed from: package-private */
        public void L(EmailAddressTable emailAddressTable) {
            if (emailAddressTable.getIsDefault().booleanValue()) {
                this.t.t.setBackgroundResource(R.drawable.my_rect_white_selected);
            } else {
                this.t.t.setBackgroundResource(R.drawable.my_rect_rounded_white);
            }
            this.t.t.setEnabled(false);
            this.t.v.setText(emailAddressTable.getFullEmailAddress());
            long u2 = (long) com.tempmail.utils.e.u(v.this.f12896c, v.this.g, emailAddressTable);
            int length = String.valueOf(u2).length();
            SpannableString spannableString = new SpannableString(v.this.f12896c.getString(R.string.inbox_read_unread_count, new Object[]{Integer.valueOf(com.tempmail.utils.e.n(v.this.f12896c, v.this.g, emailAddressTable)), Long.valueOf(u2)}));
            spannableString.setSpan(new ForegroundColorSpan(v.this.f12896c.getResources().getColor(R.color.main_button_color)), spannableString.length() - length, spannableString.length(), 33);
            this.t.s.setOnClickListener(new k(this, emailAddressTable));
            this.t.q.setOnClickListener(new i(this, emailAddressTable));
            List<DomainTable> u3 = g.u(v.this.g, emailAddressTable.getDomain());
            DomainTable domainTable = null;
            if (u3.size() > 0) {
                domainTable = u3.get(0);
            }
            if (domainTable == null) {
                this.t.r.setVisibility(0);
                this.t.r.setImageResource(R.drawable.icons_delete_lock);
            } else if (domainTable.isExpiredSoon()) {
                this.t.r.setVisibility(0);
            } else {
                this.t.r.setVisibility(8);
            }
            this.t.r.setOnClickListener(new j(this, domainTable));
        }

        public /* synthetic */ void M(EmailAddressTable emailAddressTable, View view) {
            if (v.this.f12897d != null) {
                m.b(v.h, "ivRestore");
                v.this.f12897d.a(emailAddressTable);
                v.this.g();
            }
        }

        public /* synthetic */ void N(EmailAddressTable emailAddressTable, View view) {
            if (g.y(v.this.g).size() > 1) {
                v.this.f12898e.a(emailAddressTable);
                this.t.u.o(true);
                return;
            }
            Toast.makeText(v.this.f12896c, R.string.message_delete_last_error, 1).show();
        }

        public /* synthetic */ void O(DomainTable domainTable, View view) {
            if (domainTable == null) {
                com.tempmail.utils.h.a(v.this.f12896c);
            } else if (domainTable.isExpiredSoon()) {
                com.tempmail.utils.h.b(v.this.f12896c);
            }
        }
    }

    public v(h hVar, DaoSession daoSession, List<EmailAddressTable> list) {
        this.f12896c = hVar;
        this.g = daoSession;
        this.f12899f = list;
    }

    /* renamed from: A */
    public a m(ViewGroup viewGroup, int i) {
        k1 k1Var = (k1) f.d((LayoutInflater) this.f12896c.getSystemService("layout_inflater"), R.layout.item_email_address_expired, viewGroup, false);
        return new a(k1Var.n(), k1Var);
    }

    public void B(boolean z, int i, List<EmailAddressTable> list) {
        String str = h;
        m.b(str, "indexOf " + i);
        if (list != null) {
            m.b(h, "set email");
            this.f12899f = list;
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
        this.f12897d = lVar;
    }

    public void D(e eVar) {
        this.f12898e = eVar;
    }

    public int c() {
        return this.f12899f.size();
    }

    /* renamed from: z */
    public void k(a aVar, int i) {
        aVar.L(this.f12899f.get(i));
    }
}
