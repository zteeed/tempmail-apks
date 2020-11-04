package com.tempmail.k;

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
import com.google.firebase.remoteconfig.f;
import com.tempmail.R;
import com.tempmail.db.DaoSession;
import com.tempmail.db.EmailTable;
import com.tempmail.db.MailHtmlTable;
import com.tempmail.n.m1;
import com.tempmail.q.i;
import com.tempmail.utils.e;
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
    public Context f12900c;

    /* renamed from: d  reason: collision with root package name */
    d f12901d;

    /* renamed from: e  reason: collision with root package name */
    private DaoSession f12902e;

    /* renamed from: f  reason: collision with root package name */
    private DateFormat f12903f = SimpleDateFormat.getDateTimeInstance();
    private k g;
    /* access modifiers changed from: private */
    public j h;
    private List<EmailTable> i;
    private f j;

    /* compiled from: MailListAdapter */
    class a extends ClickableSpan {
        a() {
        }

        public void onClick(View view) {
            m.b(w.k, "onClick");
            w.this.h.L(i.G2(), true);
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
        ImageView B;
        public m1 t;
        TextView u;
        TextView v;
        TextView w;
        View x;
        ConstraintLayout y;
        ImageView z;

        c(View view, m1 m1Var) {
            super(view);
            ConstraintLayout constraintLayout = m1Var.v;
            this.x = constraintLayout;
            this.t = m1Var;
            this.u = m1Var.x;
            this.v = m1Var.z;
            this.w = m1Var.y;
            this.y = constraintLayout;
            this.z = m1Var.s;
            this.A = m1Var.u;
            this.B = m1Var.t;
        }
    }

    public w(Context context, j jVar, d dVar, DaoSession daoSession, List<EmailTable> list) {
        this.i = list;
        this.f12900c = context;
        this.f12902e = daoSession;
        this.f12901d = dVar;
        this.h = jVar;
        String str = k;
        m.b(str, "Size: " + list.size());
        this.j = f.f();
    }

    public void A(k kVar) {
        this.g = kVar;
    }

    public void B(RecyclerView.b0 b0Var) {
        b bVar = (b) b0Var;
        bVar.u.setText(R.string.premium_view_you_premium);
        bVar.t.setText(u.a(this.f12900c, R.string.inbox_view_storage_premium, String.valueOf(this.j.h(this.f12900c.getString(R.string.remote_config_store_duration_premium_days)))));
    }

    public void C(int i2) {
        EmailTable emailTable = this.i.get(i2);
        emailTable.setIsChecked(Boolean.TRUE);
        g.I(this.f12902e, emailTable);
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
            EmailTable emailTable = this.i.get(i2);
            cVar.x.setOnClickListener(new m(this, i2));
            if (emailTable.getAttachments().size() > 0) {
                cVar.z.setVisibility(0);
            } else {
                cVar.z.setVisibility(8);
            }
            cVar.t.q.setVisibility(4);
            cVar.t.r.setVisibility(0);
            cVar.t.A.setVisibility(0);
            cVar.v.setText(this.f12903f.format(Double.valueOf(emailTable.getTimestamp().doubleValue() * 1000.0d)));
            if (TextUtils.isEmpty(emailTable.getSubject())) {
                str = this.f12900c.getString(R.string.mail_no_subject);
            } else {
                str = emailTable.getSubject();
            }
            cVar.u.setText(str);
            List<MailHtmlTable> htmlList = emailTable.getHtmlList();
            if (htmlList.size() > 0) {
                str2 = e.w(htmlList);
            } else {
                str2 = e.M(emailTable.getTextOnlyList());
            }
            if (str2 != null) {
                str3 = org.jsoup.a.a(str2).q0();
                cVar.w.setText(str3);
            } else {
                str3 = "";
            }
            cVar.w.setText(str3);
            if (emailTable.getIsChecked().booleanValue()) {
                cVar.u.setTextColor(this.f12900c.getResources().getColor(R.color.button_text_color));
                cVar.A.setColorFilter(this.f12900c.getResources().getColor(R.color.button_borders));
                cVar.v.setTextColor(this.f12900c.getResources().getColor(R.color.gray_light));
                cVar.w.setTextColor(this.f12900c.getResources().getColor(R.color.gray_text_color));
                cVar.u.setTypeface((Typeface) null, 0);
            } else {
                cVar.u.setTextColor(this.f12900c.getResources().getColor(R.color.text_color));
                cVar.A.setColorFilter((ColorFilter) null);
                cVar.v.setTextColor(this.f12900c.getResources().getColor(R.color.main_button_color));
                cVar.w.setTextColor(this.f12900c.getResources().getColor(R.color.button_text_color));
                cVar.u.setTypeface((Typeface) null, 1);
            }
            cVar.B.setOnClickListener(new l(this, cVar, emailTable));
        } else if (!(b0Var instanceof b)) {
        } else {
            if (e.P(this.f12900c)) {
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
        m1 m1Var = (m1) androidx.databinding.f.d(LayoutInflater.from(viewGroup.getContext()), R.layout.item_mail, viewGroup, false);
        return new c(m1Var.n(), m1Var);
    }

    public /* synthetic */ void w(int i2, View view) {
        String str = k;
        m.b(str, "open position " + i2);
        this.g.a(i2);
    }

    public /* synthetic */ void x(c cVar, EmailTable emailTable, View view) {
        m.b(k, "delete mail");
        cVar.t.w.o(true);
        this.f12901d.r(emailTable, cVar);
    }

    public void y(List<EmailTable> list) {
        String str = k;
        m.b(str, "emailTableList " + list.size());
        this.i.clear();
        this.i.addAll(list);
        g();
    }

    public void z(RecyclerView.b0 b0Var) {
        b bVar = (b) b0Var;
        TypefaceSpan typefaceSpan = new TypefaceSpan("sans-serif-medium");
        String string = this.f12900c.getString(R.string.inbox_view_storage_free_2);
        String str = string + " " + this.f12900c.getString(R.string.inbox_view_storage_free_3);
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(typefaceSpan, string.length() + 1, str.length(), 18);
        spannableString.setSpan(new ForegroundColorSpan(this.f12900c.getResources().getColor(R.color.main_button_color)), string.length() + 1, str.length(), 18);
        spannableString.setSpan(new a(), string.length() + 1, str.length(), 18);
        bVar.t.setMovementMethod(LinkMovementMethod.getInstance());
        bVar.t.setText(spannableString);
        String valueOf = String.valueOf(this.j.h(this.f12900c.getString(R.string.remote_config_store_duration_free_hours)));
        if (e.Q()) {
            bVar.u.setText(u.a(this.f12900c, R.string.inbox_view_10mm_storage_free_1, valueOf));
        } else {
            bVar.u.setText(u.a(this.f12900c, R.string.inbox_view_storage_free_1, valueOf));
        }
    }
}
