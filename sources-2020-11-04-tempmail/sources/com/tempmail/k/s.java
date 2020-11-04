package com.tempmail.k;

import a.h.k.u;
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
import com.tempmail.db.AttachmentInfoTable;
import com.tempmail.utils.m;
import com.tempmail.utils.x;
import com.tempmail.utils.z.l;
import java.io.File;
import java.util.List;

/* compiled from: AttachmentsRvAdapter */
public class s extends RecyclerView.g<a> {
    public static final String g = "s";
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public l f12879c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Context f12880d;

    /* renamed from: e  reason: collision with root package name */
    private List<AttachmentInfoTable> f12881e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public List<String> f12882f;

    /* compiled from: AttachmentsRvAdapter */
    public class a extends RecyclerView.b0 {
        com.tempmail.n.s t;
        View u;
        Handler v = new Handler(Looper.getMainLooper());
        Runnable w;

        /* renamed from: com.tempmail.k.s$a$a  reason: collision with other inner class name */
        /* compiled from: AttachmentsRvAdapter */
        class C0123a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            int f12883b = 0;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ TextView f12884c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String[] f12885d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ File f12886e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ AttachmentInfoTable f12887f;

            C0123a(TextView textView, String[] strArr, File file, AttachmentInfoTable attachmentInfoTable) {
                this.f12884c = textView;
                this.f12885d = strArr;
                this.f12886e = file;
                this.f12887f = attachmentInfoTable;
            }

            public void run() {
                boolean z = true;
                this.f12883b++;
                if (u.t(this.f12884c) != 0) {
                    z = false;
                }
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    String[] strArr = this.f12885d;
                    sb.append(strArr[0]);
                    sb.append(".");
                    strArr[0] = sb.toString();
                } else {
                    this.f12885d[0] = "." + this.f12885d[0];
                }
                this.f12884c.setText(this.f12885d[0]);
                if (this.f12883b == 3) {
                    this.f12883b = 0;
                    this.f12885d[0] = s.this.f12880d.getString(R.string.download_attachment_loading);
                }
                if (!this.f12886e.exists() || !a.this.N(this.f12887f)) {
                    s.this.B(this.f12887f.getAttachmentId().intValue());
                } else {
                    a.this.v.postDelayed(this, 600);
                }
            }
        }

        a(View view, com.tempmail.n.s sVar) {
            super(view);
            this.u = view;
            this.t = sVar;
        }

        public void L(File file, AttachmentInfoTable attachmentInfoTable, TextView textView) {
            this.w = new C0123a(textView, new String[]{s.this.f12880d.getString(R.string.download_attachment_loading)}, file, attachmentInfoTable);
            if (!file.exists() || !N(attachmentInfoTable)) {
                s.this.B(attachmentInfoTable.getAttachmentId().intValue());
            } else {
                this.v.postDelayed(this.w, 300);
            }
        }

        /* access modifiers changed from: package-private */
        public void M(int i, AttachmentInfoTable attachmentInfoTable) {
            String valueOf = String.valueOf(i + 1);
            SpannableString spannableString = new SpannableString(valueOf + "." + attachmentInfoTable.getFilename());
            spannableString.setSpan(new StyleSpan(3), 0, valueOf.length() + 1, 0);
            this.t.u.setText(spannableString);
            File file = new File(x.p().getPath(), attachmentInfoTable.getUpdatedFileName());
            this.u.setOnClickListener(new c(this, file, attachmentInfoTable));
            this.t.q.setOnClickListener(new a(this, file, attachmentInfoTable));
            String str = s.g;
            m.b(str, "file exist " + file.exists());
            if (file.exists() && s.this.x(file, attachmentInfoTable)) {
                m.b(s.g, "file loaded");
                this.v.removeCallbacks(this.w);
                this.t.q.setText(R.string.download_attachment_open_file);
                this.t.r.setVisibility(0);
            } else if (!file.exists() || !N(attachmentInfoTable)) {
                this.v.removeCallbacks(this.w);
                m.b(s.g, "file not exist");
                this.t.r.setVisibility(8);
                this.t.q.setText(R.string.message_download_attachment_title);
            } else {
                m.b(s.g, "file is exist");
                L(file, attachmentInfoTable, this.t.q);
                this.t.r.setVisibility(8);
                this.t.q.setOnClickListener((View.OnClickListener) null);
            }
            this.t.r.setOnClickListener(new b(this, file, attachmentInfoTable));
        }

        public boolean N(AttachmentInfoTable attachmentInfoTable) {
            return s.this.f12882f.contains(attachmentInfoTable.getMailAttachmentId());
        }

        public void O(AttachmentInfoTable attachmentInfoTable) {
            if (s.this.f12879c != null) {
                s.this.f12882f.add(attachmentInfoTable.getMailAttachmentId());
                s.this.f12879c.a(attachmentInfoTable);
            }
        }

        public void P(File file, AttachmentInfoTable attachmentInfoTable) {
            if (file.exists() && s.this.x(file, attachmentInfoTable)) {
                U(attachmentInfoTable);
            } else if (!file.exists() || !N(attachmentInfoTable)) {
                O(attachmentInfoTable);
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

        public /* synthetic */ void R(File file, AttachmentInfoTable attachmentInfoTable, View view) {
            P(file, attachmentInfoTable);
        }

        public /* synthetic */ void S(File file, AttachmentInfoTable attachmentInfoTable, View view) {
            P(file, attachmentInfoTable);
        }

        public /* synthetic */ void T(File file, AttachmentInfoTable attachmentInfoTable, View view) {
            file.delete();
            O(attachmentInfoTable);
        }

        public void U(AttachmentInfoTable attachmentInfoTable) {
            File file = new File(x.p().getPath(), attachmentInfoTable.getUpdatedFileName());
            String str = s.g;
            m.b(str, "path " + file.getPath());
            String str2 = s.g;
            m.b(str2, "file exist " + file.exists());
            Uri e2 = FileProvider.e(s.this.f12880d, s.this.f12880d.getString(R.string.file_provider_authority), file);
            String str3 = s.g;
            m.b(str3, "contentUri toString " + e2.toString());
            String str4 = s.g;
            m.b(str4, "contentUri path " + e2.getPath());
            s.this.f12880d.grantUriPermission(s.this.f12880d.getPackageName(), e2, 3);
            Intent intent = new Intent("android.intent.action.VIEW", e2);
            Q(s.this.f12880d.getApplicationContext(), intent, e2, true);
            intent.setDataAndType(e2, attachmentInfoTable.getMimeType());
            intent.setClipData(ClipData.newRawUri("", e2));
            intent.setFlags(3);
            if (intent.resolveActivity(s.this.f12880d.getPackageManager()) != null) {
                s.this.f12880d.startActivity(intent);
            } else {
                Toast.makeText(s.this.f12880d, R.string.message_not_app_to_open, 1).show();
            }
        }
    }

    public s(Context context, List<AttachmentInfoTable> list, List<String> list2) {
        this.f12880d = context;
        this.f12881e = list;
        this.f12882f = list2;
    }

    public void A(l lVar) {
        this.f12879c = lVar;
    }

    public void B(int i) {
        String str = g;
        m.b(str, "update id " + i);
        for (int i2 = 0; i2 < this.f12881e.size(); i2++) {
            if (i == this.f12881e.get(i2).getAttachmentId().intValue()) {
                String str2 = g;
                m.b(str2, "update position " + i2);
                h(i2);
                return;
            }
        }
    }

    public int c() {
        return this.f12881e.size();
    }

    public boolean x(File file, AttachmentInfoTable attachmentInfoTable) {
        String str = g;
        m.b(str, "file " + file.getPath() + " size " + file.length() + " and attachmentInfoTable " + attachmentInfoTable.getSize());
        return file.length() == attachmentInfoTable.getSize().longValue();
    }

    /* renamed from: y */
    public void k(a aVar, int i) {
        aVar.M(i, this.f12881e.get(i));
    }

    /* renamed from: z */
    public a m(ViewGroup viewGroup, int i) {
        com.tempmail.n.s sVar = (com.tempmail.n.s) f.d((LayoutInflater) this.f12880d.getSystemService("layout_inflater"), R.layout.download_item, viewGroup, false);
        return new a(sVar.n(), sVar);
    }
}
