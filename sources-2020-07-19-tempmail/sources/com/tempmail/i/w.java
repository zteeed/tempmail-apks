package com.tempmail.i;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tempmail.R;
import com.tempmail.db.f;
import com.tempmail.m.c1;
import com.tempmail.p.e;
import com.tempmail.utils.g;
import com.tempmail.utils.m;
import com.tempmail.utils.u;
import com.tempmail.utils.z.d;
import com.tempmail.utils.z.j;
import com.tempmail.utils.z.k;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

/* compiled from: MailListAdapter */
public class w extends RecyclerView.g<RecyclerView.b0> {
    /* access modifiers changed from: private */
    public static final String k = "w";
    private static final Integer l = 1;
    private static final Integer m = 2;

    /* renamed from: c  reason: collision with root package name */
    public Context f12368c;

    /* renamed from: d  reason: collision with root package name */
    d f12369d;

    /* renamed from: e  reason: collision with root package name */
    private com.tempmail.db.c f12370e;

    /* renamed from: f  reason: collision with root package name */
    private DateFormat f12371f = SimpleDateFormat.getDateTimeInstance();
    private k g;
    /* access modifiers changed from: private */
    public j h;
    private List<f> i;
    private com.google.firebase.remoteconfig.f j;

    /* compiled from: MailListAdapter */
    class a extends ClickableSpan {
        a() {
        }

        public void onClick(View view) {
            m.b(w.k, "onClick");
            w.this.h.M(e.r2(), true);
        }
    }

    /* compiled from: MailListAdapter */
    class b extends RecyclerView.b0 {
        TextView t;
        TextView u;
        View v;

        b(w wVar, View view) {
            super(view);
            this.v = view;
            this.t = (TextView) view.findViewById(R.id.tvAttention);
            this.u = (TextView) view.findViewById(R.id.tvAttentionTitle);
        }
    }

    /* compiled from: MailListAdapter */
    public static class c extends RecyclerView.b0 {
        ImageView A;
        public c1 B;
        TextView t;
        TextView u;
        TextView v;
        View w;
        ConstraintLayout x;
        ImageView y;
        ImageView z;

        c(View view, c1 c1Var) {
            super(view);
            ConstraintLayout constraintLayout = c1Var.v;
            this.w = constraintLayout;
            this.B = c1Var;
            this.t = c1Var.x;
            this.u = c1Var.z;
            this.v = c1Var.y;
            this.x = constraintLayout;
            this.y = c1Var.s;
            this.z = c1Var.u;
            this.A = c1Var.t;
        }
    }

    public w(Context context, j jVar, d dVar, com.tempmail.db.c cVar, List<f> list) {
        this.i = list;
        this.f12368c = context;
        this.f12370e = cVar;
        this.f12369d = dVar;
        this.h = jVar;
        String str = k;
        m.b(str, "Size: " + list.size());
        this.j = com.google.firebase.remoteconfig.f.f();
    }

    public void A(k kVar) {
        this.g = kVar;
    }

    public void B(RecyclerView.b0 b0Var) {
        b bVar = (b) b0Var;
        bVar.u.setText(R.string.premium_view_you_premium);
        bVar.t.setText(u.a(this.f12368c, R.string.inbox_view_storage_premium, String.valueOf(this.j.h(this.f12368c.getString(R.string.remote_config_store_duration_premium_days)))));
    }

    public void C(int i2) {
        f fVar = this.i.get(i2);
        fVar.q(Boolean.TRUE);
        g.K(this.f12370e, fVar);
        h(i2);
    }

    public int c() {
        return this.i.size() + 1;
    }

    public int e(int i2) {
        if (i2 < this.i.size()) {
            return l.intValue();
        }
        return m.intValue();
    }

    public void k(RecyclerView.b0 b0Var, int i2) {
        String str;
        String str2;
        String str3;
        if (b0Var instanceof c) {
            c cVar = (c) b0Var;
            f fVar = this.i.get(i2);
            cVar.w.setOnClickListener(new m(this, i2));
            if (fVar.c().size() > 0) {
                cVar.y.setVisibility(0);
            } else {
                cVar.y.setVisibility(8);
            }
            cVar.B.q.setVisibility(4);
            cVar.B.r.setVisibility(0);
            cVar.B.A.setVisibility(0);
            cVar.u.setText(this.f12371f.format(Double.valueOf(fVar.o().doubleValue() * 1000.0d)));
            if (TextUtils.isEmpty(fVar.l())) {
                str = this.f12368c.getString(R.string.mail_no_subject);
            } else {
                str = fVar.l();
            }
            cVar.t.setText(str);
            List<com.tempmail.db.g> h2 = fVar.h();
            if (h2.size() > 0) {
                str2 = com.tempmail.utils.e.w(h2);
            } else {
                str2 = com.tempmail.utils.e.L(fVar.n());
            }
            if (str2 != null) {
                str3 = org.jsoup.a.a(str2).q0();
                cVar.v.setText(str3);
            } else {
                str3 = "";
            }
            cVar.v.setText(str3);
            if (fVar.j().booleanValue()) {
                cVar.t.setTextColor(this.f12368c.getResources().getColor(R.color.button_text_color));
                cVar.z.setColorFilter(this.f12368c.getResources().getColor(R.color.button_borders));
                cVar.u.setTextColor(this.f12368c.getResources().getColor(R.color.gray_light));
                cVar.v.setTextColor(this.f12368c.getResources().getColor(R.color.gray_text_color));
                cVar.t.setTypeface((Typeface) null, 0);
            } else {
                cVar.t.setTextColor(this.f12368c.getResources().getColor(R.color.text_color));
                cVar.z.setColorFilter((ColorFilter) null);
                cVar.u.setTextColor(this.f12368c.getResources().getColor(R.color.main_button_color));
                cVar.v.setTextColor(this.f12368c.getResources().getColor(R.color.button_text_color));
                cVar.t.setTypeface((Typeface) null, 1);
            }
            cVar.A.setOnClickListener(new l(this, cVar, fVar));
        } else if (!(b0Var instanceof b)) {
        } else {
            if (com.tempmail.utils.e.O(this.f12368c)) {
                z(b0Var);
            } else {
                B(b0Var);
            }
        }
    }

    public RecyclerView.b0 m(ViewGroup viewGroup, int i2) {
        if (i2 != l.intValue()) {
            return new b(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mail_footer, viewGroup, false));
        }
        c1 c1Var = (c1) androidx.databinding.f.d(LayoutInflater.from(viewGroup.getContext()), R.layout.item_mail, viewGroup, false);
        return new c(c1Var.n(), c1Var);
    }

    public /* synthetic */ void w(int i2, View view) {
        String str = k;
        m.b(str, "open position " + i2);
        this.g.a(i2);
    }

    public /* synthetic */ void x(c cVar, f fVar, View view) {
        m.b(k, "delete mail");
        cVar.B.w.o(true);
        this.f12369d.p(fVar, cVar);
    }

    public void y(List<f> list) {
        String str = k;
        m.b(str, "emailTableList " + list.size());
        this.i.clear();
        this.i.addAll(list);
        g();
    }

    public void z(RecyclerView.b0 b0Var) {
        b bVar = (b) b0Var;
        TypefaceSpan typefaceSpan = new TypefaceSpan("sans-serif-medium");
        String string = this.f12368c.getString(R.string.inbox_view_storage_free_2);
        String str = string + " " + this.f12368c.getString(R.string.inbox_view_storage_free_3);
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(typefaceSpan, string.length() + 1, str.length(), 18);
        spannableString.setSpan(new ForegroundColorSpan(this.f12368c.getResources().getColor(R.color.main_button_color)), string.length() + 1, str.length(), 18);
        spannableString.setSpan(new a(), string.length() + 1, str.length(), 18);
        bVar.t.setMovementMethod(LinkMovementMethod.getInstance());
        bVar.t.setText(spannableString);
        String valueOf = String.valueOf(this.j.h(this.f12368c.getString(R.string.remote_config_store_duration_free_hours)));
        if (com.tempmail.utils.e.P()) {
            bVar.u.setText(u.a(this.f12368c, R.string.inbox_view_10mm_storage_free_1, valueOf));
        } else {
            bVar.u.setText(u.a(this.f12368c, R.string.inbox_view_storage_free_1, valueOf));
        }
    }
}
