package com.tempmail.n;

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
import com.tempmail.i.t;
import com.tempmail.i.u;
import com.tempmail.m.w;
import com.tempmail.t.b;
import com.tempmail.utils.m;
import com.tempmail.utils.z.i;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CreateEmailDialog */
public class n extends m implements i {
    public static final String t0 = n.class.getSimpleName();
    private t o0;
    private List<DomainTable> p0;
    /* access modifiers changed from: private */
    public w q0;
    private u r0;
    private com.tempmail.utils.z.n s0;

    /* compiled from: CreateEmailDialog */
    class a implements TextWatcher {
        a() {
        }

        public void afterTextChanged(Editable editable) {
            if (editable.toString().isEmpty()) {
                n.this.q0.q.setEnabled(false);
            } else {
                n.this.q0.q.setEnabled(true);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static n A2(List<DomainTable> list) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("domains_list", (ArrayList) list);
        n nVar = new n();
        nVar.O1(bundle);
        return nVar;
    }

    public void B2(String str, String str2) {
        if (j0() != null) {
            Intent intent = new Intent();
            intent.putExtra("extra_email", str);
            intent.putExtra("extra_domain", str2);
            j0().E0(k0(), -1, intent);
            return;
        }
        com.tempmail.utils.z.n nVar = this.s0;
        if (nVar != null) {
            nVar.a(str, str2);
        }
    }

    public void C2() {
        this.q0.u.setVisibility(8);
        if (this.p0.size() == 0) {
            Toast.makeText(this.i0, R.string.message_no_domains, 1).show();
            this.j0.finish();
        }
        u uVar = new u(this.j0, this.p0, new i(this), this);
        this.r0 = uVar;
        this.q0.t.setAdapter(uVar);
    }

    public void D2() {
        this.q0.t.setVisibility(8);
        this.q0.u.setVisibility(0);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.i0, 2);
        this.q0.x.setHasFixedSize(true);
        this.q0.x.setLayoutManager(gridLayoutManager);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < this.p0.size()) {
            DomainTable domainTable = this.p0.get(i);
            arrayList.add(new b(domainTable.a(), i == 0, domainTable.b() != null));
            i++;
        }
        t tVar = new t(this.j0, arrayList);
        this.o0 = tVar;
        this.q0.x.setAdapter(tVar);
    }

    public void J0(Bundle bundle) {
        super.J0(bundle);
        this.p0 = D().getParcelableArrayList("domains_list");
        String str = t0;
        m.b(str, "domains size " + this.p0.size());
        p2(1, R.style.FullscreenDialog);
    }

    public View N0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.q0 = (w) f.d(layoutInflater, R.layout.fragment_change_email, viewGroup, false);
        v2();
        this.q0.q.setEnabled(false);
        if (com.tempmail.utils.w.s(this.i0)) {
            D2();
        } else {
            C2();
        }
        this.q0.s.addTextChangedListener(new a());
        this.q0.s.setOnEditorActionListener(new h(this));
        this.q0.r.setOnClickListener(new f(this));
        this.q0.q.setOnClickListener(new g(this));
        return this.q0.n();
    }

    public void g(int i) {
        String str = t0;
        m.b(str, "onGroupStateChanged " + i);
        com.tempmail.utils.w.p(this.i0, this.q0.s);
    }

    public int u2() {
        int[] iArr = {16843499};
        TypedArray obtainStyledAttributes = this.i0.obtainStyledAttributes(new TypedValue().data, iArr);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public void v2() {
        int u2 = u2() * 2;
        Window window = k2().getWindow();
        window.setGravity(49);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        attributes.y = u2;
        window.setAttributes(attributes);
        String str = t0;
        m.b(str, "margin top " + u2);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        u().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        window.setLayout(displayMetrics.widthPixels * 1, attributes.height);
    }

    public /* synthetic */ boolean w2(TextView textView, int i, KeyEvent keyEvent) {
        String str = t0;
        m.b(str, "actionId " + i);
        if (i != 6) {
            return false;
        }
        m.b(t0, "IME_ACTION_DONE");
        com.tempmail.utils.w.p(this.i0, this.q0.s);
        return true;
    }

    public /* synthetic */ void x2(View view) {
        m.b(t0, "click layout");
        com.tempmail.utils.w.p(this.i0, this.q0.s);
    }

    public /* synthetic */ void y2(View view) {
        String str;
        String lowerCase = this.q0.s.getText().toString().trim().toLowerCase();
        if (com.tempmail.utils.w.s(this.i0)) {
            str = this.o0.x().a();
        } else {
            str = this.r0.getGroup(0).a();
        }
        String str2 = lowerCase + str;
        if (lowerCase.length() == 0) {
            Toast.makeText(this.i0, R.string.current_address_empty_email, 1).show();
        } else if (!com.tempmail.utils.w.q(this.i0)) {
            Toast.makeText(this.i0, R.string.message_network_error_message, 1).show();
        } else if (com.tempmail.utils.w.u(str2)) {
            B2(str2, str);
            h2();
        } else {
            Toast.makeText(this.i0, R.string.current_address_wrong_login, 1).show();
        }
    }

    public /* synthetic */ void z2(int i) {
        String str = t0;
        m.b(str, "onGroupCollapsed " + i);
        this.q0.t.collapseGroup(i);
    }
}
