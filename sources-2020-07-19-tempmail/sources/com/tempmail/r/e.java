package com.tempmail.r;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.tempmail.R;
import com.tempmail.db.f;
import com.tempmail.i.s;
import com.tempmail.m.g0;
import com.tempmail.n.k;
import com.tempmail.n.t;
import com.tempmail.p.c;
import com.tempmail.services.DownloadAttachmentService;
import com.tempmail.services.DownloadMailService;
import com.tempmail.utils.g;
import com.tempmail.utils.m;
import com.tempmail.utils.w;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MailFragment */
public class e extends c implements d, View.OnClickListener, com.tempmail.utils.z.b {
    public static final Integer r0 = 1;
    public static final Integer s0 = 2;
    public static final Integer t0 = 3;
    public static final Integer u0 = 4;
    /* access modifiers changed from: private */
    public static final String v0 = e.class.getSimpleName();
    private f i0;
    private g0 j0;
    private boolean k0 = false;
    private String l0;
    private List<com.tempmail.db.a> m0;
    private boolean n0 = false;
    /* access modifiers changed from: private */
    public DownloadAttachmentService o0;
    s p0;
    private ServiceConnection q0 = new a();

    /* compiled from: MailFragment */
    class a implements ServiceConnection {
        a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            m.b(e.v0, "onServiceConnected");
            DownloadAttachmentService unused = e.this.o0 = ((DownloadAttachmentService.c) iBinder).a();
            e.this.o0.k(e.this);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            m.b(e.v0, "onServiceDisconnected");
            DownloadAttachmentService unused = e.this.o0 = null;
        }
    }

    /* compiled from: MailFragment */
    private class b extends WebViewClient {
        private b() {
        }

        /* access modifiers changed from: package-private */
        public void a(Uri uri) {
            w.x(e.this.a0, uri);
        }

        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
        }

        @Deprecated
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            m.b(e.v0, "shouldOverrideUrlLoading deprecated");
            if (str.contains("android_asset")) {
                return false;
            }
            a(Uri.parse(str));
            return true;
        }

        /* synthetic */ b(e eVar, a aVar) {
            this();
        }

        @TargetApi(24)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            m.b(e.v0, "shouldOverrideUrlLoading new");
            if (webResourceRequest.getUrl().toString().contains("android_asset")) {
                return false;
            }
            a(webResourceRequest.getUrl());
            return true;
        }
    }

    public static String m2(String str) {
        return "<head><meta name=\"viewport\" content=\"width=device-width, user-scalable=yes\" charset='UTF-8' /></head>" + str + "</body></html>";
    }

    public static e s2(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("mail_id", str);
        e eVar = new e();
        eVar.O1(bundle);
        return eVar;
    }

    public void A2() {
        Intent intent = new Intent(this.c0, DownloadMailService.class);
        intent.putExtra("extra_email_id", this.i0.d());
        if (com.tempmail.utils.e.O(this.c0)) {
            intent.putExtra("extra_timestamp", this.i0.o());
            intent.putExtra("extra_address_id", this.i0.e());
        }
        this.c0.startService(intent);
    }

    public void B2(com.tempmail.db.a aVar) {
        if (this.p0 != null) {
            m.b(s.g, "attachmentDownloadStarted");
            this.p0.B(aVar.a().intValue());
        }
    }

    public void E0(int i, int i2, Intent intent) {
        super.E0(i, i2, intent);
        if (i == s0.intValue() && i2 == -1) {
            g.m(this.a0.H0(), this.i0);
            Toast.makeText(this.c0, R.string.message_email_deleted, 1).show();
            this.a0.onBackPressed();
        } else if (i == u0.intValue() && i2 == -1) {
            t2();
        }
    }

    public void J0(Bundle bundle) {
        super.J0(bundle);
        P1(true);
        if (D() != null) {
            if (this.a0.H0() == null) {
                this.a0.L0();
            }
            this.i0 = g.y(this.a0.H0(), D().getString("mail_id")).get(0);
        }
        l2();
        String str = v0;
        m.b(str, "Os version " + Build.VERSION.SDK_INT);
    }

    public View N0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        String str2;
        m.b(v0, "onCreateView");
        this.j0 = (g0) androidx.databinding.f.d(layoutInflater, R.layout.fragment_mail, viewGroup, false);
        o2();
        String[] split = this.i0.g().split(" ");
        String str3 = split[split.length - 1];
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < split.length - 1; i++) {
            String str4 = split[i];
            sb.append(str4);
            sb.append(" ");
            if (str4.length() > 0 && sb2.length() < 2) {
                sb2.append(str4.charAt(0));
            }
        }
        this.j0.H.setText(str3);
        this.j0.I.setText(sb.toString().trim());
        this.j0.L.setText(sb2.toString());
        this.j0.E.setText(SimpleDateFormat.getDateTimeInstance().format(Double.valueOf(this.i0.o().doubleValue() * 1000.0d)));
        if (TextUtils.isEmpty(this.i0.l())) {
            str = this.c0.getString(R.string.mail_no_subject);
        } else {
            str = this.i0.l();
        }
        this.j0.J.setText(str);
        WebSettings settings = this.j0.M.getSettings();
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setAppCacheEnabled(false);
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        List<com.tempmail.db.g> h = this.i0.h();
        if (h.size() > 0) {
            str2 = com.tempmail.utils.e.w(h);
        } else {
            str2 = com.tempmail.utils.e.K(this.i0.m());
        }
        if (str2 == null) {
            str2 = "";
        }
        String str5 = v0;
        m.b(str5, "mail webViewContent " + str2);
        this.j0.G.setOnClickListener(this);
        this.j0.D.setOnClickListener(this);
        this.j0.v.setOnClickListener(this);
        this.j0.w.setOnClickListener(this);
        List<com.tempmail.db.a> c2 = this.i0.c();
        this.m0 = c2;
        if (c2.size() > 0) {
            this.j0.q.setVisibility(0);
            StringBuilder sb3 = new StringBuilder();
            for (int i2 = 0; i2 < this.m0.size(); i2++) {
                sb3.append(this.m0.get(i2).d());
                if (i2 != this.m0.size() - 1) {
                    sb3.append(" , ");
                }
            }
            this.j0.C.setText(sb3.toString());
            this.j0.q.setOnClickListener(this);
        }
        String str6 = v0;
        m.b(str6, "webviewcontent " + str2);
        this.l0 = m2(str2);
        this.j0.M.setWebViewClient(new b(this, (a) null));
        this.j0.M.loadDataWithBaseURL("", this.l0, "text/html", "utf-8", "");
        h2(h0(R.string.analytics_email_read_premium));
        com.tempmail.utils.s.V(this.c0, true);
        if (com.tempmail.utils.e.O(this.c0)) {
            com.tempmail.utils.s.w0(this.c0, (int) com.google.firebase.remoteconfig.f.f().h(h0(R.string.remote_config_ir_rewarded_read_email)));
        }
        return this.j0.n();
    }

    public void O0() {
        super.O0();
        DownloadAttachmentService downloadAttachmentService = this.o0;
        if (downloadAttachmentService != null) {
            downloadAttachmentService.i();
            this.a0.unbindService(this.q0);
        }
    }

    public boolean X0(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            this.a0.onBackPressed();
        }
        return super.X0(menuItem);
    }

    public void Z0() {
        super.Z0();
    }

    public void e1(int i, String[] strArr, int[] iArr) {
        super.e1(i, strArr, iArr);
        String str = v0;
        StringBuilder sb = new StringBuilder();
        sb.append("onRequestPermissionsResult  ");
        sb.append(i);
        sb.append(" granted ");
        sb.append(iArr.length > 0 && iArr[0] == 0);
        m.b(str, sb.toString());
        if (i != r0.intValue() && i != t0.intValue()) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            String str2 = v0;
            m.b(str2, "permission denied " + b2("android.permission.WRITE_EXTERNAL_STORAGE"));
            if (!this.n0 && !b2("android.permission.WRITE_EXTERNAL_STORAGE")) {
                x2();
            }
        } else if (i == r0.intValue()) {
            A2();
        } else {
            w2();
        }
    }

    public void f1() {
        super.f1();
        com.tempmail.utils.z.a aVar = this.f0;
        if (aVar != null) {
            aVar.Y(8);
        }
        androidx.appcompat.app.a v02 = this.a0.v0();
        if (v02 != null) {
            v02.l();
        }
    }

    public void l2() {
        this.a0.bindService(new Intent(this.c0, DownloadAttachmentService.class), this.q0, 1);
    }

    public void m(com.tempmail.db.a aVar) {
        B2(aVar);
    }

    public Intent n2() {
        Uri parse = Uri.parse(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), com.tempmail.utils.y.b.f12596c).getPath());
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(parse, "resource/folder");
        return intent;
    }

    public void o(com.tempmail.db.a aVar) {
        B2(aVar);
    }

    public void o2() {
        Context context = this.c0;
        new f(context, com.tempmail.j.b.a(context), this, this.a0.J0());
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.constraintAttachments /*2131296376*/:
                if (w.w(this.c0)) {
                    String str = v0;
                    m.b(str, "should show rationale " + b2("android.permission.WRITE_EXTERNAL_STORAGE"));
                    this.n0 = b2("android.permission.WRITE_EXTERNAL_STORAGE");
                    v2(t0.intValue());
                    return;
                }
                w2();
                return;
            case R.id.ivDelete /*2131296464*/:
                y2();
                return;
            case R.id.ivDropdown /*2131296469*/:
                if (this.k0) {
                    this.j0.w.setRotation(0.0f);
                    this.j0.C.setMaxLines(1);
                } else {
                    this.j0.w.setRotation(180.0f);
                    this.j0.C.setMaxLines(10);
                }
                this.k0 = !this.k0;
                return;
            case R.id.tvClose /*2131296667*/:
                this.a0.onBackPressed();
                return;
            case R.id.tvDownload /*2131296681*/:
                if (w.w(this.c0)) {
                    this.n0 = b2("android.permission.WRITE_EXTERNAL_STORAGE");
                    v2(r0.intValue());
                    return;
                }
                A2();
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void p2(Intent intent, DialogInterface dialogInterface, int i) {
        u2(intent);
        dialogInterface.dismiss();
    }

    public /* synthetic */ void r2(Object obj) {
        com.tempmail.db.a aVar = (com.tempmail.db.a) obj;
        String str = v0;
        m.b(str, "attachmentInfoTable of " + this.m0.indexOf(aVar));
        z2(aVar);
    }

    public void t2() {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", this.c0.getPackageName(), (String) null));
        c2(intent);
    }

    public void u2(Intent intent) {
        if (intent.resolveActivityInfo(this.c0.getPackageManager(), 0) != null) {
            this.c0.startActivity(Intent.createChooser(intent, h0(R.string.download_attachment_open_folder)));
        } else {
            Toast.makeText(this.c0, R.string.message_not_app_to_open, 1).show();
        }
    }

    @TargetApi(23)
    public void v2(int i) {
        m.b(v0, "requestWriteStorage");
        if (b2("android.permission.WRITE_EXTERNAL_STORAGE")) {
            m.b(v0, "shouldShowRequestPermissionRationale");
            I1(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, i);
            return;
        }
        m.b(v0, "requestPermissions");
        I1(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, i);
    }

    public void w2() {
        d.a aVar = new d.a(this.a0, R.style.DownloadAttachmentDialog);
        aVar.f((CharSequence) null);
        com.tempmail.m.m mVar = (com.tempmail.m.m) androidx.databinding.f.d(LayoutInflater.from(this.a0), R.layout.dialog_fragment_download, (ViewGroup) null, false);
        Intent n2 = n2();
        if (n2.resolveActivityInfo(this.c0.getPackageManager(), 0) != null) {
            aVar.j(R.string.download_attachment_open_folder, new b(this, n2));
        }
        aVar.g(17039360, a.f12471b);
        List arrayList = new ArrayList();
        DownloadAttachmentService downloadAttachmentService = this.o0;
        if (downloadAttachmentService != null) {
            arrayList = downloadAttachmentService.f();
        }
        s sVar = new s(this.c0, this.m0, arrayList);
        this.p0 = sVar;
        sVar.A(new c(this));
        mVar.r.setLayoutManager(new LinearLayoutManager(H()));
        mVar.r.setAdapter(this.p0);
        aVar.m(mVar.n());
        d a2 = aVar.a();
        a2.requestWindowFeature(1);
        a2.show();
    }

    public void x2() {
        t u2 = t.u2(h0(R.string.message_title_go_to_settings), h0(17039360), h0(R.string.message_title_error), h0(R.string.message_blocked_permission));
        u2.Z1(this, u0.intValue());
        u2.r2(this.a0.k0(), t.class.getSimpleName());
    }

    public void y2() {
        k N2 = k.N2(this.a0, h0(R.string.message_you_sure), (String) null, false);
        N2.Z1(this, s0.intValue());
        N2.r2(this.a0.k0(), k.class.getSimpleName());
    }

    public void z2(com.tempmail.db.a aVar) {
        Intent intent = new Intent(this.c0, DownloadAttachmentService.class);
        intent.putExtra("extra_attachment_info", aVar);
        this.c0.startService(intent);
    }
}
