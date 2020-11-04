package com.tempmail.o;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;
import androidx.databinding.f;
import androidx.recyclerview.widget.GridLayoutManager;
import com.tempmail.R;
import com.tempmail.db.DomainTable;
import com.tempmail.k.t;
import com.tempmail.k.u;
import com.tempmail.n.y;
import com.tempmail.u.b;
import com.tempmail.utils.x;
import com.tempmail.utils.z.i;
import com.tempmail.utils.z.n;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CreateEmailDialog */
public class m extends l implements i {
    public static final String u0 = m.class.getSimpleName();
    private t p0;
    private List<DomainTable> q0;
    /* access modifiers changed from: private */
    public y r0;
    private u s0;
    private n t0;

    /* compiled from: CreateEmailDialog */
    class a implements TextWatcher {
        a() {
        }

        public void afterTextChanged(Editable editable) {
            if (editable.toString().isEmpty()) {
                m.this.r0.q.setEnabled(false);
            } else {
                m.this.r0.q.setEnabled(true);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static m G2(List<DomainTable> list) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("domains_list", (ArrayList) list);
        m mVar = new m();
        mVar.V1(bundle);
        return mVar;
    }

    public int A2() {
        int[] iArr = {16843499};
        TypedArray obtainStyledAttributes = this.l0.obtainStyledAttributes(new TypedValue().data, iArr);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public void B2() {
        int A2 = A2() * 2;
        Window window = q2().getWindow();
        window.setGravity(49);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        attributes.y = A2;
        window.setAttributes(attributes);
        String str = u0;
        com.tempmail.utils.m.b(str, "margin top " + A2);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        z().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        window.setLayout(displayMetrics.widthPixels * 1, attributes.height);
    }

    public /* synthetic */ boolean C2(TextView textView, int i, KeyEvent keyEvent) {
        String str = u0;
        com.tempmail.utils.m.b(str, "actionId " + i);
        if (i != 6) {
            return false;
        }
        com.tempmail.utils.m.b(u0, "IME_ACTION_DONE");
        x.r(this.l0, this.r0.s);
        return true;
    }

    public /* synthetic */ void D2(View view) {
        com.tempmail.utils.m.b(u0, "click layout");
        x.r(this.l0, this.r0.s);
    }

    public /* synthetic */ void E2(View view) {
        String str;
        String lowerCase = this.r0.s.getText().toString().trim().toLowerCase();
        if (x.u(this.l0)) {
            str = this.p0.x().a();
        } else {
            str = this.s0.getGroup(0).getDomain();
        }
        String str2 = lowerCase + str;
        if (lowerCase.length() == 0) {
            Toast.makeText(this.l0, R.string.current_address_empty_email, 1).show();
        } else if (!x.s(this.l0)) {
            Toast.makeText(this.l0, R.string.message_network_error_message, 1).show();
        } else if (x.w(str2)) {
            H2(str2, str);
            n2();
        } else {
            Toast.makeText(this.l0, R.string.current_address_wrong_login, 1).show();
        }
    }

    public /* synthetic */ void F2(int i) {
        String str = u0;
        com.tempmail.utils.m.b(str, "onGroupCollapsed " + i);
        this.r0.t.collapseGroup(i);
    }

    public void H2(String str, String str2) {
        if (m0() != null) {
            Intent intent = new Intent();
            intent.putExtra("extra_email", str);
            intent.putExtra("extra_domain", str2);
            m0().H0(n0(), -1, intent);
            return;
        }
        n nVar = this.t0;
        if (nVar != null) {
            nVar.a(str, str2);
        }
    }

    public void I2() {
        this.r0.u.setVisibility(8);
        if (this.q0.size() == 0) {
            Toast.makeText(this.l0, R.string.message_no_domains, 1).show();
            this.m0.finish();
        }
        u uVar = new u(this.m0, this.q0, new h(this), this);
        this.s0 = uVar;
        this.r0.t.setAdapter(uVar);
    }

    public void J2() {
        this.r0.t.setVisibility(8);
        this.r0.u.setVisibility(0);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.l0, 2);
        this.r0.x.setHasFixedSize(true);
        this.r0.x.setLayoutManager(gridLayoutManager);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < this.q0.size()) {
            DomainTable domainTable = this.q0.get(i);
            arrayList.add(new b(domainTable.getDomain(), i == 0, domainTable.getExpirationTimestamp() != null));
            i++;
        }
        t tVar = new t(this.m0, arrayList);
        this.p0 = tVar;
        this.r0.x.setAdapter(tVar);
    }

    public void M0(Bundle bundle) {
        super.M0(bundle);
        this.q0 = J().getParcelableArrayList("domains_list");
        String str = u0;
        com.tempmail.utils.m.b(str, "domains size " + this.q0.size());
        v2(1, R.style.FullscreenDialog);
    }

    public View Q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.r0 = (y) f.d(layoutInflater, R.layout.fragment_change_email, viewGroup, false);
        B2();
        this.r0.q.setEnabled(false);
        if (x.u(this.l0)) {
            J2();
        } else {
            I2();
        }
        this.r0.s.addTextChangedListener(new a());
        this.r0.s.setOnEditorActionListener(new g(this));
        this.r0.r.setOnClickListener(new e(this));
        this.r0.q.setOnClickListener(new f(this));
        return this.r0.n();
    }

    public void i(int i) {
        String str = u0;
        com.tempmail.utils.m.b(str, "onGroupStateChanged " + i);
        x.r(this.l0, this.r0.s);
    }
}
