package com.tempmail.v;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.tempmail.R;
import com.tempmail.api.models.answers.ApiError;
import com.tempmail.api.models.answers.ExtendedMail;
import com.tempmail.api.models.requests.NewMailboxBody;
import com.tempmail.db.EmailAddressTable;
import com.tempmail.h;
import com.tempmail.k.v;
import com.tempmail.k.x;
import com.tempmail.l.b;
import com.tempmail.n.a1;
import com.tempmail.q.g;
import com.tempmail.t.r;
import com.tempmail.t.s;
import com.tempmail.t.t;
import com.tempmail.utils.e;
import com.tempmail.utils.i;
import com.tempmail.utils.u;
import com.tempmail.utils.z.c;
import com.tempmail.utils.z.f;
import com.tempmail.utils.z.m;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: SwitchMailboxFragment */
public class j extends g implements i, r {
    public static final Integer t0 = 1;
    private static final String u0 = j.class.getSimpleName();
    com.tempmail.u.a i0;
    private a1 j0;
    private m k0;
    private EmailAddressTable l0;
    private x m0;
    private v n0;
    /* access modifiers changed from: private */
    public h o0;
    private List<EmailAddressTable> p0;
    private List<EmailAddressTable> q0;
    private Handler r0 = new Handler(Looper.getMainLooper());
    private Runnable s0;

    /* compiled from: SwitchMailboxFragment */
    class a implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NewMailboxBody f13154a;

        a(NewMailboxBody newMailboxBody) {
            this.f13154a = newMailboxBody;
        }

        public void a(int i) {
            j.this.o0.a(b.l(true), this.f13154a);
        }

        public void b(int i) {
        }
    }

    public static j A2() {
        return new j();
    }

    public void B2() {
        ((t) this.c0.D()).f(false);
    }

    public void C2(EmailAddressTable emailAddressTable) {
        v2(emailAddressTable);
        this.e0.U();
    }

    /* renamed from: D2 */
    public void v2(EmailAddressTable emailAddressTable) {
        o2(k0(R.string.analytics_email_switched_premium));
        com.tempmail.utils.g.g(this.Z.G0(), emailAddressTable);
        this.k0.v(emailAddressTable);
        com.tempmail.utils.z.a aVar = this.d0;
        if (aVar != null) {
            aVar.Y(R.id.inbox);
        } else {
            this.Z.onBackPressed();
        }
    }

    public void E2(List<EmailAddressTable> list) {
        if (this.Z != null) {
            h hVar = this.Z;
            x xVar = new x(hVar, hVar.G0(), list);
            this.m0 = xVar;
            xVar.D(new c(this));
            this.m0.F(new a(this));
            this.j0.q.setAdapter(this.m0);
        }
    }

    public void F2() {
        if (this.p0.size() == 0) {
            this.j0.v.setVisibility(8);
            this.j0.t.setVisibility(8);
        } else {
            this.j0.v.setVisibility(0);
            this.j0.t.setVisibility(0);
        }
        if (this.q0.size() == 0) {
            this.j0.w.setVisibility(8);
            this.j0.u.setVisibility(8);
            return;
        }
        this.j0.w.setVisibility(0);
        this.j0.u.setVisibility(0);
    }

    public void G2() {
        this.j0.u.setText(u.a(this.b0, R.string.switch_address_expired_description, "10"));
        com.tempmail.u.a p = com.tempmail.utils.g.p(this.Z.G0());
        this.i0 = p;
        List<EmailAddressTable> a2 = p.a();
        this.p0 = a2;
        e.C(a2);
        this.q0 = this.i0.b();
        E2(this.p0);
        H2(this.p0.size(), this.q0);
        F2();
        I2();
    }

    public void H0(int i, int i2, Intent intent) {
        super.H0(i, i2, intent);
        if (i == t0.intValue() && i2 == -1) {
            o2(k0(R.string.analytics_email_deleted_premium));
            this.o0.c(this.l0.getFullEmailAddress());
        } else if (i == 2 && i2 == -1) {
            this.o0.b(true, intent.getStringExtra("extra_email"), intent.getStringExtra("extra_domain"), (String) null);
            o2(k0(R.string.analytics_email_created_premium));
        }
    }

    public void H2(int i, List<EmailAddressTable> list) {
        for (EmailAddressTable next : list) {
            String str = u0;
            com.tempmail.utils.m.b(str, "email " + next.getFullEmailAddress() + " expired at " + new Date(next.getEndTime().longValue()).toString());
        }
        e.D(list);
        String str2 = u0;
        com.tempmail.utils.m.b(str2, "emailAddressListExpired size before " + list.size());
        for (EmailAddressTable next2 : list) {
            String str3 = u0;
            com.tempmail.utils.m.b(str3, "email sorted " + next2.getFullEmailAddress() + " expired at " + new Date(next2.getEndTime().longValue()).toString());
        }
        List<EmailAddressTable> v = e.v(this.b0, list);
        for (EmailAddressTable next3 : v) {
            String str4 = u0;
            com.tempmail.utils.m.b(str4, "sort email " + next3.getFullEmailAddress() + " expired at " + new Date(next3.getEndTime().longValue()).toString());
        }
        String str5 = u0;
        com.tempmail.utils.m.b(str5, "emailAddressListExpired size after " + v.size());
        String str6 = u0;
        StringBuilder sb = new StringBuilder();
        sb.append("baseActivity is null ");
        sb.append(this.Z == null);
        com.tempmail.utils.m.b(str6, sb.toString());
        h hVar = this.Z;
        v vVar = new v(hVar, hVar.G0(), v);
        this.n0 = vVar;
        vVar.C(new e(this, i));
        this.n0.D(new f(this));
        this.j0.r.setAdapter(this.n0);
    }

    public void I2() {
        if (e.Q() && this.p0.size() > 0) {
            Handler handler = this.r0;
            b bVar = new b(this);
            this.s0 = bVar;
            handler.postDelayed(bVar, 1000);
        }
    }

    public void J0(Context context) {
        super.J0(context);
        if (context instanceof m) {
            this.k0 = (m) context;
            s P = this.c0.P();
            if (P instanceof com.tempmail.t.v) {
                ((com.tempmail.t.v) P).p(this);
            } else {
                q2();
            }
        } else {
            throw new RuntimeException(context.toString() + " must implement OnNewMailbox");
        }
    }

    public void J2(boolean z) {
        com.tempmail.o.j R2 = com.tempmail.o.j.R2(this.Z, k0(R.string.message_you_sure), (String) null, z);
        R2.f2(this, t0.intValue());
        R2.x2(this.Z.k0(), com.tempmail.o.j.class.getSimpleName());
    }

    public void K2(NewMailboxBody newMailboxBody) {
        String str;
        if (e.R()) {
            str = k0(R.string.message_network_error_message) + "\nError details: \nFailed with " + "Create email";
        } else {
            str = k0(R.string.message_network_error_message);
        }
        com.tempmail.o.s A2 = com.tempmail.o.s.A2(k0(R.string.message_try_again), k0(17039360), (String) null, str);
        A2.t2(true);
        A2.B2(0, new a(newMailboxBody));
        try {
            A2.x2(this.Z.k0(), com.tempmail.o.s.class.getSimpleName());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void L2() {
        this.m0.g();
    }

    public void O(String str, List<ExtendedMail> list) {
    }

    public void P0(Menu menu, MenuInflater menuInflater) {
        if (!e.P(this.b0)) {
            menuInflater.inflate(R.menu.switch_email_menu, menu);
            o2(k0(R.string.analytics_menu_add_email));
        }
        super.P0(menu, menuInflater);
    }

    public View Q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.j0 = (a1) androidx.databinding.f.d(layoutInflater, R.layout.fragment_switch_email, viewGroup, false);
        t2();
        G2();
        W1(true);
        Context context = this.b0;
        this.o0 = new k(context, b.a(context), this, this.Z.H0());
        B2();
        return this.j0.n();
    }

    public void S(ApiError apiError) {
        this.j0.s.setRefreshing(false);
    }

    public void U0() {
        if (this.c0.P() instanceof com.tempmail.t.v) {
            ((com.tempmail.t.v) this.c0.P()).t(this);
        }
        super.U0();
        this.k0 = null;
    }

    public void a(boolean z) {
        if (z) {
            this.Z.M0();
        } else {
            this.Z.E0();
        }
    }

    public boolean a1(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.navCreateEMail) {
            return false;
        }
        this.c0.b0(this);
        return true;
    }

    public void c0(boolean z, Map<String, List<ExtendedMail>> map) {
        boolean z2 = false;
        this.j0.s.setRefreshing(false);
        String str = u0;
        com.tempmail.utils.m.b(str, "mails.size() " + map.size());
        String str2 = u0;
        com.tempmail.utils.m.b(str2, "activeExpiredEmailAddresses.size() " + this.i0.c());
        if (map.size() != this.i0.c()) {
            z2 = true;
        }
        String str3 = u0;
        com.tempmail.utils.m.b(str3, "isMailboxesAdded " + z2);
        if (z2) {
            G2();
        }
        com.tempmail.utils.m.b(u0, "onInboxAllLoaded");
    }

    public void d(boolean z, String str, String str2) {
        s2(e.W(this.Z, this.k0, this.e0, z, str, str2));
    }

    public void g(String str) {
        String str2 = u0;
        com.tempmail.utils.m.b(str2, "emailAddressToDelete " + this.l0.getFullEmailAddress());
        boolean z = false;
        if (this.l0.getIsDefault().booleanValue()) {
            List<EmailAddressTable> y = com.tempmail.utils.g.y(this.Z.G0());
            boolean remove = y.remove(this.l0);
            String str3 = u0;
            com.tempmail.utils.m.b(str3, "isRemoved new " + remove);
            if (y.size() > 0) {
                com.tempmail.utils.g.g(this.Z.G0(), y.get(0));
                this.k0.v(com.tempmail.utils.g.s(this.Z.G0()));
            }
            z = true;
        }
        com.tempmail.utils.g.F(this.Z.G0(), this.l0);
        if (this.p0.contains(this.l0)) {
            com.tempmail.utils.m.b(u0, "activeMailboxes.contains(emailAddressToDelete)");
            int indexOf = this.p0.indexOf(this.l0);
            this.p0.remove(this.l0);
            this.m0.C(z, indexOf, this.p0);
        } else {
            com.tempmail.utils.m.b(u0, "expiredMailboxes.contains(emailAddressToDelete)");
            this.q0.remove(this.l0);
            this.n0.B(z, this.q0.indexOf(this.l0), this.q0);
        }
        F2();
        Toast.makeText(this.b0, R.string.message_address_deleted, 1).show();
    }

    public void h(Throwable th) {
    }

    public void i1() {
        super.i1();
        com.tempmail.utils.z.a aVar = this.d0;
        if (aVar != null) {
            aVar.X(0);
        }
        this.c0.k(false);
        androidx.appcompat.app.a u02 = this.Z.u0();
        if (u02 != null) {
            u02.y();
        }
        I2();
    }

    public void j(String str, ApiError apiError) {
        e.Z(this.Z, apiError, k0(R.string.analytics_screen_name_switch), "mailbox.delete");
    }

    public void k(ApiError apiError) {
        e.Z(this.Z, apiError, k0(R.string.analytics_screen_name_switch), "mailbox.new");
    }

    public void l(NewMailboxBody newMailboxBody) {
        K2(newMailboxBody);
    }

    public void m1() {
        super.m1();
        this.r0.removeCallbacks(this.s0);
    }

    public void p() {
        this.Z.N0(this.b0.getString(R.string.inbox_view_no_connection));
    }

    public void q2() {
        this.r0.post(new d(this));
    }

    public void r2() {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (EmailAddressTable next : this.p0) {
            if (next.isExpired()) {
                arrayList.add(next);
                z = true;
            }
        }
        String str = u0;
        com.tempmail.utils.m.b(str, "isWasChanges " + z);
        if (z) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                EmailAddressTable emailAddressTable = (EmailAddressTable) it.next();
                this.p0.remove(emailAddressTable);
                this.q0.add(emailAddressTable);
            }
            if (this.Z != null) {
                E2(this.p0);
                H2(this.p0.size(), this.q0);
                F2();
            }
        }
    }

    public void s2(EmailAddressTable emailAddressTable) {
        this.p0.add(emailAddressTable);
        e.C(this.p0);
        this.m0.E(this.p0);
        F2();
        I2();
    }

    public void t2() {
        this.j0.q.setLayoutManager(new LinearLayoutManager(L()));
        this.j0.r.setLayoutManager(new LinearLayoutManager(L()));
        this.j0.s.setOnRefreshListener(new g(this));
    }

    public /* synthetic */ void u2() {
        c cVar = this.c0;
        if (cVar != null) {
            s P = cVar.P();
            if (P instanceof com.tempmail.t.v) {
                com.tempmail.utils.m.b(u0, "addInboxMailboxesListener");
                ((com.tempmail.t.v) P).p(this);
            }
        }
    }

    public /* synthetic */ void w2(EmailAddressTable emailAddressTable) {
        this.l0 = emailAddressTable;
        J2(false);
    }

    public void x() {
    }

    public /* synthetic */ void x2(int i, Object obj) {
        if (i < i.a(this.b0)) {
            C2((EmailAddressTable) obj);
        } else {
            this.Z.N0(i.b(this.b0));
        }
    }

    public /* synthetic */ void y2(EmailAddressTable emailAddressTable) {
        this.l0 = emailAddressTable;
        J2(false);
    }

    public /* synthetic */ void z2() {
        r2();
        if (this.p0.size() > 0) {
            I2();
        }
    }
}
