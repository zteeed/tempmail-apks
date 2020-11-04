package com.tempmail.i;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import com.tempmail.R;
import com.tempmail.db.DomainTable;
import com.tempmail.f;
import com.tempmail.m.e1;
import com.tempmail.m.g1;
import com.tempmail.utils.m;
import com.tempmail.utils.w;
import com.tempmail.utils.z.g;
import com.tempmail.utils.z.i;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ExpListAdapter */
public class u extends BaseExpandableListAdapter {
    private static final String i = u.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    DomainTable f12359b;

    /* renamed from: c  reason: collision with root package name */
    i f12360c;

    /* renamed from: d  reason: collision with root package name */
    boolean f12361d = false;

    /* renamed from: e  reason: collision with root package name */
    private List<DomainTable> f12362e;

    /* renamed from: f  reason: collision with root package name */
    private f f12363f;
    private List<DomainTable> g = new ArrayList();
    private g h;

    static {
        Class<u> cls = u.class;
    }

    public u(f fVar, List<DomainTable> list, g gVar, i iVar) {
        this.f12363f = fVar;
        this.f12362e = list;
        this.f12359b = list.get(0);
        this.h = gVar;
        this.f12360c = iVar;
        c();
    }

    /* renamed from: a */
    public DomainTable getChild(int i2, int i3) {
        return this.g.get(i3);
    }

    /* renamed from: b */
    public DomainTable getGroup(int i2) {
        return this.f12359b;
    }

    public void c() {
        String str = i;
        m.b(str, "domains size " + this.f12362e.size());
        String str2 = i;
        m.b(str2, "child size size " + this.g.size());
        this.g.clear();
        this.g.addAll(this.f12362e);
        this.g.remove(this.f12359b);
    }

    public /* synthetic */ void d(DomainTable domainTable, int i2, View view) {
        this.f12359b = domainTable;
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
        f fVar = this.f12363f;
        fVar.Q0(fVar.getString(R.string.message_title_information), this.f12363f.getString(R.string.message_domain_deprecated));
    }

    public long getChildId(int i2, int i3) {
        return (long) i3;
    }

    public View getChildView(int i2, int i3, boolean z, View view, ViewGroup viewGroup) {
        e1 e1Var = (e1) androidx.databinding.f.d((LayoutInflater) this.f12363f.getSystemService("layout_inflater"), R.layout.spinner_item_child, viewGroup, false);
        if (i3 % 2 == 0) {
            e1Var.r.setBackground((Drawable) null);
        }
        DomainTable a2 = getChild(i2, i3);
        e1Var.r.setText(w.F(a2.a()));
        e1Var.r.setOnClickListener(new g(this, a2, i2));
        if (a2.d()) {
            e1Var.q.setVisibility(0);
        } else {
            e1Var.q.setVisibility(8);
        }
        e1Var.q.setOnClickListener(new f(this));
        return e1Var.n();
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
        g1 g1Var = (g1) androidx.databinding.f.d((LayoutInflater) this.f12363f.getSystemService("layout_inflater"), R.layout.spinner_item_group, viewGroup, false);
        if (z) {
            g1Var.q.setImageResource(R.drawable.ic_dropdown_up);
        } else {
            g1Var.q.setImageResource(R.drawable.ic_dropdown);
        }
        if (this.f12361d != z) {
            this.f12360c.g(i2);
        }
        this.f12361d = z;
        DomainTable b2 = getGroup(i2);
        g1Var.s.setText(w.F(b2.a()));
        if (b2.d()) {
            g1Var.r.setVisibility(0);
        } else {
            g1Var.r.setVisibility(8);
        }
        g1Var.r.setOnClickListener(new h(this));
        return g1Var.n();
    }

    public boolean hasStableIds() {
        return true;
    }

    public boolean isChildSelectable(int i2, int i3) {
        return true;
    }
}
