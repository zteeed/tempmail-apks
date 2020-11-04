package com.tempmail.u;

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
import androidx.databinding.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.tempmail.R;
import com.tempmail.api.models.answers.ApiError;
import com.tempmail.api.models.answers.ExtendedMail;
import com.tempmail.db.e;
import com.tempmail.i.v;
import com.tempmail.i.x;
import com.tempmail.j.b;
import com.tempmail.m.q0;
import com.tempmail.n.k;
import com.tempmail.p.c;
import com.tempmail.s.l;
import com.tempmail.s.n;
import com.tempmail.s.p;
import com.tempmail.t.a;
import com.tempmail.utils.g;
import com.tempmail.utils.i;
import com.tempmail.utils.u;
import com.tempmail.utils.z.m;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: SwitchMailboxFragment */
public class j extends c implements i, l {
    public static final Integer t0 = 1;
    private static final String u0 = j.class.getSimpleName();
    private q0 i0;
    private m j0;
    private e k0;
    private x l0;
    private v m0;
    private h n0;
    private List<e> o0;
    private List<e> p0;
    private Handler q0 = new Handler(Looper.getMainLooper());
    private Runnable r0;
    a s0;

    public static j s2() {
        return new j();
    }

    public void A2() {
        if (com.tempmail.utils.e.P() && this.o0.size() > 0) {
            Handler handler = this.q0;
            b bVar = new b(this);
            this.r0 = bVar;
            handler.postDelayed(bVar, 1000);
        }
    }

    public void B2(boolean z) {
        k N2 = k.N2(this.a0, h0(R.string.message_you_sure), (String) null, z);
        N2.Z1(this, t0.intValue());
        N2.r2(this.a0.k0(), k.class.getSimpleName());
    }

    public void C2() {
        this.l0.g();
    }

    public void E0(int i, int i2, Intent intent) {
        super.E0(i, i2, intent);
        if (i == t0.intValue() && i2 == -1) {
            h2(h0(R.string.analytics_email_deleted_premium));
            this.n0.b(this.k0.p());
        } else if (i == 2 && i2 == -1) {
            this.n0.a(true, intent.getStringExtra("extra_email"), intent.getStringExtra("extra_domain"), (String) null);
            h2(h0(R.string.analytics_email_created_premium));
        }
    }

    public void G0(Context context) {
        super.G0(context);
        if (context instanceof m) {
            this.j0 = (m) context;
            com.tempmail.s.m P = this.e0.P();
            if (P instanceof p) {
                ((p) P).p(this);
            } else {
                i2();
            }
        } else {
            throw new RuntimeException(context.toString() + " must implement OnNewMailbox");
        }
    }

    public void M0(Menu menu, MenuInflater menuInflater) {
        if (!com.tempmail.utils.e.O(this.c0)) {
            menuInflater.inflate(R.menu.switch_email_menu, menu);
            h2(h0(R.string.analytics_menu_add_email));
        }
        super.M0(menu, menuInflater);
    }

    public View N0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.i0 = (q0) f.d(layoutInflater, R.layout.fragment_switch_email, viewGroup, false);
        l2();
        y2();
        P1(true);
        Context context = this.c0;
        this.n0 = new k(context, b.a(context), this, this.a0.J0());
        t2();
        return this.i0.n();
    }

    public void Q(String str, List<ExtendedMail> list) {
    }

    public void R0() {
        if (this.e0.P() instanceof p) {
            ((p) this.e0.P()).u(this);
        }
        super.R0();
        this.j0 = null;
    }

    public void U(ApiError apiError) {
        this.i0.s.setRefreshing(false);
    }

    public boolean X0(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.navCreateEMail) {
            return false;
        }
        this.e0.c0(this);
        return true;
    }

    public void a(boolean z) {
        if (z) {
            this.a0.O0();
        } else {
            this.a0.F0();
        }
    }

    public void b(boolean z, String str, String str2) {
        k2(com.tempmail.utils.e.W(this.a0, this.j0, this.h0, z, str, str2));
    }

    public void e0(boolean z, Map<String, List<ExtendedMail>> map) {
        boolean z2 = false;
        this.i0.s.setRefreshing(false);
        String str = u0;
        com.tempmail.utils.m.b(str, "mails.size() " + map.size());
        String str2 = u0;
        com.tempmail.utils.m.b(str2, "activeExpiredEmailAddresses.size() " + this.s0.c());
        if (map.size() != this.s0.c()) {
            z2 = true;
        }
        String str3 = u0;
        com.tempmail.utils.m.b(str3, "isMailboxesAdded " + z2);
        if (z2) {
            y2();
        }
        com.tempmail.utils.m.b(u0, "onInboxAllLoaded");
    }

    public void f(String str) {
        String str2 = u0;
        com.tempmail.utils.m.b(str2, "emailAddressToDelete " + this.k0.p());
        boolean z = false;
        if (this.k0.r().booleanValue()) {
            List<e> z2 = g.z(this.a0.H0());
            boolean remove = z2.remove(this.k0);
            String str3 = u0;
            com.tempmail.utils.m.b(str3, "isRemoved new " + remove);
            if (z2.size() > 0) {
                g.h(this.a0.H0(), z2.get(0));
                this.j0.w(g.t(this.a0.H0()));
            }
            z = true;
        }
        g.H(this.a0.H0(), this.k0);
        if (this.o0.contains(this.k0)) {
            com.tempmail.utils.m.b(u0, "activeMailboxes.contains(emailAddressToDelete)");
            int indexOf = this.o0.indexOf(this.k0);
            this.o0.remove(this.k0);
            this.l0.C(z, indexOf, this.o0);
        } else {
            com.tempmail.utils.m.b(u0, "expiredMailboxes.contains(emailAddressToDelete)");
            this.p0.remove(this.k0);
            this.m0.B(z, this.p0.indexOf(this.k0), this.p0);
        }
        x2();
        Toast.makeText(this.c0, R.string.message_address_deleted, 1).show();
    }

    public void f1() {
        super.f1();
        com.tempmail.utils.z.a aVar = this.f0;
        if (aVar != null) {
            aVar.Y(0);
        }
        androidx.appcompat.app.a v0 = this.a0.v0();
        if (v0 != null) {
            v0.y();
        }
        A2();
    }

    public void h(String str, ApiError apiError) {
        com.tempmail.utils.e.Z(this.a0, apiError);
    }

    public void i(ApiError apiError) {
        com.tempmail.utils.e.Z(this.a0, apiError);
    }

    public void i1() {
        super.i1();
        this.q0.removeCallbacks(this.r0);
    }

    public void i2() {
        this.q0.post(new d(this));
    }

    public void j(Throwable th) {
    }

    public void j2() {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (e next : this.o0) {
            if (next.v()) {
                arrayList.add(next);
                z = true;
            }
        }
        String str = u0;
        com.tempmail.utils.m.b(str, "isWasChanges " + z);
        if (z) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                this.o0.remove(eVar);
                this.p0.add(eVar);
            }
            if (this.a0 != null) {
                w2(this.o0);
                z2(this.o0.size(), this.p0);
                x2();
            }
        }
    }

    public void k2(e eVar) {
        this.o0.add(eVar);
        com.tempmail.utils.e.C(this.o0);
        this.l0.E(this.o0);
        x2();
        A2();
    }

    public void l2() {
        this.i0.q.setLayoutManager(new LinearLayoutManager(H()));
        this.i0.r.setLayoutManager(new LinearLayoutManager(H()));
        this.i0.s.setOnRefreshListener(new g(this));
    }

    public /* synthetic */ void m2() {
        com.tempmail.utils.z.c cVar = this.e0;
        if (cVar != null) {
            com.tempmail.s.m P = cVar.P();
            if (P instanceof p) {
                com.tempmail.utils.m.b(u0, "addInboxMailboxesListener");
                ((p) P).p(this);
            }
        }
    }

    public void n() {
        this.a0.P0(this.c0.getString(R.string.inbox_view_no_connection));
    }

    public /* synthetic */ void o2(e eVar) {
        this.k0 = eVar;
        B2(false);
    }

    public /* synthetic */ void p2(int i, Object obj) {
        if (i < i.a(this.c0)) {
            u2((e) obj);
        } else {
            this.a0.P0(i.b(this.c0));
        }
    }

    public /* synthetic */ void q2(e eVar) {
        this.k0 = eVar;
        B2(false);
    }

    public /* synthetic */ void r2() {
        j2();
        if (this.o0.size() > 0) {
            A2();
        }
    }

    public void t2() {
        ((n) this.e0.E()).f(false);
    }

    public void u2(e eVar) {
        n2(eVar);
        this.h0.W();
    }

    /* renamed from: v2 */
    public void n2(e eVar) {
        h2(h0(R.string.analytics_email_switched_premium));
        g.h(this.a0.H0(), eVar);
        this.j0.w(eVar);
        com.tempmail.utils.z.a aVar = this.f0;
        if (aVar != null) {
            aVar.Z(R.id.inbox);
        } else {
            this.a0.onBackPressed();
        }
    }

    public void w2(List<e> list) {
        if (this.a0 != null) {
            com.tempmail.f fVar = this.a0;
            x xVar = new x(fVar, fVar.H0(), list);
            this.l0 = xVar;
            xVar.D(new c(this));
            this.l0.F(new a(this));
            this.i0.q.setAdapter(this.l0);
        }
    }

    public void x2() {
        if (this.o0.size() == 0) {
            this.i0.v.setVisibility(8);
            this.i0.t.setVisibility(8);
        } else {
            this.i0.v.setVisibility(0);
            this.i0.t.setVisibility(0);
        }
        if (this.p0.size() == 0) {
            this.i0.w.setVisibility(8);
            this.i0.u.setVisibility(8);
            return;
        }
        this.i0.w.setVisibility(0);
        this.i0.u.setVisibility(0);
    }

    public void y() {
    }

    public void y2() {
        this.i0.u.setText(u.a(this.c0, R.string.switch_address_expired_description, "10"));
        a q = g.q(this.a0.H0());
        this.s0 = q;
        List<e> a2 = q.a();
        this.o0 = a2;
        com.tempmail.utils.e.C(a2);
        this.p0 = this.s0.b();
        w2(this.o0);
        z2(this.o0.size(), this.p0);
        x2();
        A2();
    }

    public void z2(int i, List<e> list) {
        for (e next : list) {
            String str = u0;
            com.tempmail.utils.m.b(str, "email " + next.p() + " expired at " + new Date(next.o().longValue()).toString());
        }
        com.tempmail.utils.e.D(list);
        String str2 = u0;
        com.tempmail.utils.m.b(str2, "emailAddressListExpired size before " + list.size());
        for (e next2 : list) {
            String str3 = u0;
            com.tempmail.utils.m.b(str3, "email sorted " + next2.p() + " expired at " + new Date(next2.o().longValue()).toString());
        }
        List<e> v = com.tempmail.utils.e.v(this.c0, list);
        for (e next3 : v) {
            String str4 = u0;
            com.tempmail.utils.m.b(str4, "sort email " + next3.p() + " expired at " + new Date(next3.o().longValue()).toString());
        }
        String str5 = u0;
        com.tempmail.utils.m.b(str5, "emailAddressListExpired size after " + v.size());
        String str6 = u0;
        StringBuilder sb = new StringBuilder();
        sb.append("baseActivity is null ");
        sb.append(this.a0 == null);
        com.tempmail.utils.m.b(str6, sb.toString());
        com.tempmail.f fVar = this.a0;
        v vVar = new v(fVar, fVar.H0(), v);
        this.m0 = vVar;
        vVar.C(new e(this, i));
        this.m0.D(new f(this));
        this.i0.r.setAdapter(this.m0);
    }
}
