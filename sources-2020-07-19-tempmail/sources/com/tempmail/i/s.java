package com.tempmail.i;

import a.h.k.t;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.databinding.f;
import androidx.recyclerview.widget.RecyclerView;
import com.tempmail.R;
import com.tempmail.m.q;
import com.tempmail.utils.m;
import com.tempmail.utils.w;
import com.tempmail.utils.z.l;
import java.io.File;
import java.util.List;

/* compiled from: AttachmentsRvAdapter */
public class s extends RecyclerView.g<a> {
    public static final String g = "s";
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public l f12347c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Context f12348d;

    /* renamed from: e  reason: collision with root package name */
    private List<com.tempmail.db.a> f12349e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public List<String> f12350f;

    /* compiled from: AttachmentsRvAdapter */
    public class a extends RecyclerView.b0 {
        q t;
        View u;
        Handler v = new Handler(Looper.getMainLooper());
        Runnable w;

        /* renamed from: com.tempmail.i.s$a$a  reason: collision with other inner class name */
        /* compiled from: AttachmentsRvAdapter */
        class C0123a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            int f12351b = 0;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ TextView f12352c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String[] f12353d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ File f12354e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ com.tempmail.db.a f12355f;

            C0123a(TextView textView, String[] strArr, File file, com.tempmail.db.a aVar) {
                this.f12352c = textView;
                this.f12353d = strArr;
                this.f12354e = file;
                this.f12355f = aVar;
            }

            public void run() {
                boolean z = true;
                this.f12351b++;
                if (t.t(this.f12352c) != 0) {
                    z = false;
                }
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    String[] strArr = this.f12353d;
                    sb.append(strArr[0]);
                    sb.append(".");
                    strArr[0] = sb.toString();
                } else {
                    this.f12353d[0] = "." + this.f12353d[0];
                }
                this.f12352c.setText(this.f12353d[0]);
                if (this.f12351b == 3) {
                    this.f12351b = 0;
                    this.f12353d[0] = s.this.f12348d.getString(R.string.download_attachment_loading);
                }
                if (!this.f12354e.exists() || !a.this.N(this.f12355f)) {
                    s.this.B(this.f12355f.a().intValue());
                } else {
                    a.this.v.postDelayed(this, 600);
                }
            }
        }

        a(View view, q qVar) {
            super(view);
            this.u = view;
            this.t = qVar;
        }

        public void L(File file, com.tempmail.db.a aVar, TextView textView) {
            this.w = new C0123a(textView, new String[]{s.this.f12348d.getString(R.string.download_attachment_loading)}, file, aVar);
            if (!file.exists() || !N(aVar)) {
                s.this.B(aVar.a().intValue());
            } else {
                this.v.postDelayed(this.w, 300);
            }
        }

        /* access modifiers changed from: package-private */
        public void M(int i, com.tempmail.db.a aVar) {
            String valueOf = String.valueOf(i + 1);
            SpannableString spannableString = new SpannableString(valueOf + "." + aVar.d());
            spannableString.setSpan(new StyleSpan(3), 0, valueOf.length() + 1, 0);
            this.t.u.setText(spannableString);
            File file = new File(w.n().getPath(), aVar.i());
            this.u.setOnClickListener(new c(this, file, aVar));
            this.t.q.setOnClickListener(new a(this, file, aVar));
            String str = s.g;
            m.b(str, "file exist " + file.exists());
            if (file.exists() && s.this.x(file, aVar)) {
                m.b(s.g, "file loaded");
                this.v.removeCallbacks(this.w);
                this.t.q.setText(R.string.download_attachment_open_file);
                this.t.r.setVisibility(0);
            } else if (!file.exists() || !N(aVar)) {
                this.v.removeCallbacks(this.w);
                m.b(s.g, "file not exist");
                this.t.r.setVisibility(8);
                this.t.q.setText(R.string.message_download_attachment_title);
            } else {
                m.b(s.g, "file is exist");
                L(file, aVar, this.t.q);
                this.t.r.setVisibility(8);
                this.t.q.setOnClickListener((View.OnClickListener) null);
            }
            this.t.r.setOnClickListener(new b(this, file, aVar));
        }

        public boolean N(com.tempmail.db.a aVar) {
            return s.this.f12350f.contains(aVar.f());
        }

        public void O(com.tempmail.db.a aVar) {
            if (s.this.f12347c != null) {
                s.this.f12350f.add(aVar.f());
                s.this.f12347c.a(aVar);
            }
        }

        public void P(File file, com.tempmail.db.a aVar) {
            if (file.exists() && s.this.x(file, aVar)) {
                U(aVar);
            } else if (!file.exists() || !N(aVar)) {
                O(aVar);
            }
        }

        public void Q(Context context, Intent intent, Uri uri, boolean z) {
            int i = z ? 3 : 1;
            intent.addFlags(i);
            for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 65536)) {
                String str = resolveInfo.activityInfo.packageName;
                String str2 = s.g;
                m.b(str2, "packageName " + str);
                context.grantUriPermission(str, uri, i);
            }
        }

        public /* synthetic */ void R(File file, com.tempmail.db.a aVar, View view) {
            P(file, aVar);
        }

        public /* synthetic */ void S(File file, com.tempmail.db.a aVar, View view) {
            P(file, aVar);
        }

        public /* synthetic */ void T(File file, com.tempmail.db.a aVar, View view) {
            file.delete();
            O(aVar);
        }

        public void U(com.tempmail.db.a aVar) {
            File file = new File(w.n().getPath(), aVar.i());
            String str = s.g;
            m.b(str, "path " + file.getPath());
            String str2 = s.g;
            m.b(str2, "file exist " + file.exists());
            Uri e2 = FileProvider.e(s.this.f12348d, s.this.f12348d.getString(R.string.file_provider_authority), file);
            String str3 = s.g;
            m.b(str3, "contentUri toString " + e2.toString());
            String str4 = s.g;
            m.b(str4, "contentUri path " + e2.getPath());
            s.this.f12348d.grantUriPermission(s.this.f12348d.getPackageName(), e2, 3);
            Intent intent = new Intent("android.intent.action.VIEW", e2);
            Q(s.this.f12348d.getApplicationContext(), intent, e2, true);
            intent.setDataAndType(e2, aVar.g());
            intent.setClipData(ClipData.newRawUri("", e2));
            intent.setFlags(3);
            if (intent.resolveActivity(s.this.f12348d.getPackageManager()) != null) {
                s.this.f12348d.startActivity(intent);
            } else {
                Toast.makeText(s.this.f12348d, R.string.message_not_app_to_open, 1).show();
            }
        }
    }

    public s(Context context, List<com.tempmail.db.a> list, List<String> list2) {
        this.f12348d = context;
        this.f12349e = list;
        this.f12350f = list2;
    }

    public void A(l lVar) {
        this.f12347c = lVar;
    }

    public void B(int i) {
        String str = g;
        m.b(str, "update id " + i);
        for (int i2 = 0; i2 < this.f12349e.size(); i2++) {
            if (i == this.f12349e.get(i2).a().intValue()) {
                String str2 = g;
                m.b(str2, "update position " + i2);
                h(i2);
                return;
            }
        }
    }

    public int c() {
        return this.f12349e.size();
    }

    public boolean x(File file, com.tempmail.db.a aVar) {
        String str = g;
        m.b(str, "file " + file.getPath() + " size " + file.length() + " and attachmentInfoTable " + aVar.h());
        return file.length() == aVar.h().longValue();
    }

    /* renamed from: y */
    public void k(a aVar, int i) {
        aVar.M(i, this.f12349e.get(i));
    }

    /* renamed from: z */
    public a m(ViewGroup viewGroup, int i) {
        q qVar = (q) f.d((LayoutInflater) this.f12348d.getSystemService("layout_inflater"), R.layout.download_item, viewGroup, false);
        return new a(qVar.n(), qVar);
    }
}
