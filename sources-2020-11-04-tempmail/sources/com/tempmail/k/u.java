package com.tempmail.k;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import androidx.databinding.f;
import com.tempmail.R;
import com.tempmail.db.DomainTable;
import com.tempmail.h;
import com.tempmail.n.o1;
import com.tempmail.n.q1;
import com.tempmail.utils.m;
import com.tempmail.utils.x;
import com.tempmail.utils.z.g;
import com.tempmail.utils.z.i;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ExpListAdapter */
public class u extends BaseExpandableListAdapter {
    private static final String i = u.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    DomainTable f12891b;

    /* renamed from: c  reason: collision with root package name */
    i f12892c;

    /* renamed from: d  reason: collision with root package name */
    boolean f12893d = false;

    /* renamed from: e  reason: collision with root package name */
    private List<DomainTable> f12894e;

    /* renamed from: f  reason: collision with root package name */
    private h f12895f;
    private List<DomainTable> g = new ArrayList();
    private g h;

    static {
        Class<u> cls = u.class;
    }

    public u(h hVar, List<DomainTable> list, g gVar, i iVar) {
        this.f12895f = hVar;
        this.f12894e = list;
        this.f12891b = list.get(0);
        this.h = gVar;
        this.f12892c = iVar;
        c();
    }

    /* renamed from: a */
    public DomainTable getChild(int i2, int i3) {
        return this.g.get(i3);
    }

    /* renamed from: b */
    public DomainTable getGroup(int i2) {
        return this.f12891b;
    }

    public void c() {
        String str = i;
        m.b(str, "domains size " + this.f12894e.size());
        String str2 = i;
        m.b(str2, "child size size " + this.g.size());
        this.g.clear();
        this.g.addAll(this.f12894e);
        this.g.remove(this.f12891b);
    }

    public /* synthetic */ void d(DomainTable domainTable, int i2, View view) {
        this.f12891b = domainTable;
        c();
        notifyDataSetChanged();
        this.h.a(i2);
    }

    public /* synthetic */ void e(View view) {
        g();
    }

    public /* synthetic */ void f(View view) {
        g();
    }

    public void g() {
        h hVar = this.f12895f;
        hVar.O0(hVar.getString(R.string.message_title_information), this.f12895f.getString(R.string.message_domain_deprecated));
    }

    public long getChildId(int i2, int i3) {
        return (long) i3;
    }

    public View getChildView(int i2, int i3, boolean z, View view, ViewGroup viewGroup) {
        o1 o1Var = (o1) f.d((LayoutInflater) this.f12895f.getSystemService("layout_inflater"), R.layout.spinner_item_child, viewGroup, false);
        if (i3 % 2 == 0) {
            o1Var.r.setBackground((Drawable) null);
        }
        DomainTable a2 = getChild(i2, i3);
        o1Var.r.setText(x.H(a2.getDomain()));
        o1Var.r.setOnClickListener(new g(this, a2, i2));
        if (a2.isExpiredSoon()) {
            o1Var.q.setVisibility(0);
        } else {
            o1Var.q.setVisibility(8);
        }
        o1Var.q.setOnClickListener(new f(this));
        return o1Var.n();
    }

    public int getChildrenCount(int i2) {
        return this.g.size();
    }

    public int getGroupCount() {
        return 1;
    }

    public long getGroupId(int i2) {
        return (long) i2;
    }

    public View getGroupView(int i2, boolean z, View view, ViewGroup viewGroup) {
        q1 q1Var = (q1) f.d((LayoutInflater) this.f12895f.getSystemService("layout_inflater"), R.layout.spinner_item_group, viewGroup, false);
        if (z) {
            q1Var.q.setImageResource(R.drawable.ic_dropdown_up);
        } else {
            q1Var.q.setImageResource(R.drawable.ic_dropdown);
        }
        if (this.f12893d != z) {
            this.f12892c.i(i2);
        }
        this.f12893d = z;
        DomainTable b2 = getGroup(i2);
        q1Var.s.setText(x.H(b2.getDomain()));
        if (b2.isExpiredSoon()) {
            q1Var.r.setVisibility(0);
        } else {
            q1Var.r.setVisibility(8);
        }
        q1Var.r.setOnClickListener(new h(this));
        return q1Var.n();
    }

    public boolean hasStableIds() {
        return true;
    }

    public boolean isChildSelectable(int i2, int i3) {
        return true;
    }
}
