package com.tempmail.s;

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
import androidx.databinding.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.tempmail.R;
import com.tempmail.db.AttachmentInfoTable;
import com.tempmail.db.EmailTable;
import com.tempmail.db.MailHtmlTable;
import com.tempmail.k.s;
import com.tempmail.n.i0;
import com.tempmail.n.o;
import com.tempmail.o.j;
import com.tempmail.q.g;
import com.tempmail.services.DownloadAttachmentService;
import com.tempmail.services.DownloadMailService;
import com.tempmail.utils.m;
import com.tempmail.utils.x;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MailFragment */
public class e extends g implements d, View.OnClickListener, com.tempmail.utils.z.b {
    public static final Integer r0 = 1;
    public static final Integer s0 = 2;
    public static final Integer t0 = 3;
    public static final Integer u0 = 4;
    /* access modifiers changed from: private */
    public static final String v0 = e.class.getSimpleName();
    s i0;
    private EmailTable j0;
    private i0 k0;
    private boolean l0 = false;
    private String m0;
    private List<AttachmentInfoTable> n0;
    private boolean o0 = false;
    /* access modifiers changed from: private */
    public DownloadAttachmentService p0;
    private ServiceConnection q0 = new a();

    /* compiled from: MailFragment */
    class a implements ServiceConnection {
        a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            m.b(e.v0, "onServiceConnected");
            DownloadAttachmentService unused = e.this.p0 = ((DownloadAttachmentService.c) iBinder).a();
            e.this.p0.k(e.this);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            m.b(e.v0, "onServiceDisconnected");
            DownloadAttachmentService unused = e.this.p0 = null;
        }
    }

    /* compiled from: MailFragment */
    private class b extends WebViewClient {
        private b() {
        }

        /* access modifiers changed from: package-private */
        public void a(Uri uri) {
            x.z(e.this.Z, uri);
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

    public static String t2(String str) {
        return "<head><meta name=\"viewport\" content=\"width=device-width, user-scalable=yes\" charset='UTF-8' /></head>" + str + "</body></html>";
    }

    public static e z2(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("mail_id", str);
        e eVar = new e();
        eVar.V1(bundle);
        return eVar;
    }

    public void A2() {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", this.b0.getPackageName(), (String) null));
        i2(intent);
    }

    public void B2(Intent intent) {
        if (intent.resolveActivityInfo(this.b0.getPackageManager(), 0) != null) {
            this.b0.startActivity(Intent.createChooser(intent, k0(R.string.download_attachment_open_folder)));
        } else {
            Toast.makeText(this.b0, R.string.message_not_app_to_open, 1).show();
        }
    }

    @TargetApi(23)
    public void C2(int i) {
        m.b(v0, "requestWriteStorage");
        if (h2("android.permission.WRITE_EXTERNAL_STORAGE")) {
            m.b(v0, "shouldShowRequestPermissionRationale");
            N1(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, i);
            return;
        }
        m.b(v0, "requestPermissions");
        N1(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, i);
    }

    public void D2() {
        d.a aVar = new d.a(this.Z, R.style.DownloadAttachmentDialog);
        aVar.f((CharSequence) null);
        o oVar = (o) f.d(LayoutInflater.from(this.Z), R.layout.dialog_fragment_download, (ViewGroup) null, false);
        Intent u2 = u2();
        if (u2.resolveActivityInfo(this.b0.getPackageManager(), 0) != null) {
            aVar.j(R.string.download_attachment_open_folder, new b(this, u2));
        }
        aVar.g(17039360, a.f12987b);
        List arrayList = new ArrayList();
        DownloadAttachmentService downloadAttachmentService = this.p0;
        if (downloadAttachmentService != null) {
            arrayList = downloadAttachmentService.f();
        }
        s sVar = new s(this.b0, this.n0, arrayList);
        this.i0 = sVar;
        sVar.A(new c(this));
        oVar.r.setLayoutManager(new LinearLayoutManager(L()));
        oVar.r.setAdapter(this.i0);
        aVar.m(oVar.n());
        d a2 = aVar.a();
        a2.requestWindowFeature(1);
        a2.show();
    }

    public void E2() {
        com.tempmail.o.s A2 = com.tempmail.o.s.A2(k0(R.string.message_title_go_to_settings), k0(17039360), k0(R.string.message_title_error), k0(R.string.message_blocked_permission));
        A2.f2(this, u0.intValue());
        A2.x2(this.Z.k0(), com.tempmail.o.s.class.getSimpleName());
    }

    public void F2() {
        j R2 = j.R2(this.Z, k0(R.string.message_you_sure), (String) null, false);
        R2.f2(this, s0.intValue());
        R2.x2(this.Z.k0(), j.class.getSimpleName());
    }

    public void G2(AttachmentInfoTable attachmentInfoTable) {
        Intent intent = new Intent(this.b0, DownloadAttachmentService.class);
        intent.putExtra("extra_attachment_info", attachmentInfoTable);
        this.b0.startService(intent);
    }

    public void H0(int i, int i2, Intent intent) {
        super.H0(i, i2, intent);
        if (i == s0.intValue() && i2 == -1) {
            com.tempmail.utils.g.l(this.Z.G0(), this.j0);
            Toast.makeText(this.b0, R.string.message_email_deleted, 1).show();
            this.Z.onBackPressed();
        } else if (i == u0.intValue() && i2 == -1) {
            A2();
        }
    }

    public void H2() {
        Intent intent = new Intent(this.b0, DownloadMailService.class);
        intent.putExtra("extra_email_id", this.j0.getEid());
        if (com.tempmail.utils.e.P(this.b0)) {
            intent.putExtra("extra_timestamp", this.j0.getTimestamp());
            intent.putExtra("extra_address_id", this.j0.getEmailAddress());
        }
        this.b0.startService(intent);
    }

    public void I2(AttachmentInfoTable attachmentInfoTable) {
        if (this.i0 != null) {
            m.b(s.g, "attachmentDownloadStarted");
            this.i0.B(attachmentInfoTable.getAttachmentId().intValue());
        }
    }

    public void M0(Bundle bundle) {
        super.M0(bundle);
        W1(true);
        if (J() != null) {
            if (this.Z.G0() == null) {
                this.Z.J0();
            }
            this.j0 = com.tempmail.utils.g.x(this.Z.G0(), J().getString("mail_id")).get(0);
        }
        s2();
        String str = v0;
        m.b(str, "Os version " + Build.VERSION.SDK_INT);
    }

    public View Q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        String str2;
        m.b(v0, "onCreateView");
        this.k0 = (i0) f.d(layoutInflater, R.layout.fragment_mail, viewGroup, false);
        v2();
        String[] split = this.j0.getFromField().split(" ");
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
        this.k0.H.setText(str3);
        this.k0.I.setText(sb.toString().trim());
        this.k0.L.setText(sb2.toString());
        this.k0.E.setText(SimpleDateFormat.getDateTimeInstance().format(Double.valueOf(this.j0.getTimestamp().doubleValue() * 1000.0d)));
        if (TextUtils.isEmpty(this.j0.getSubject())) {
            str = this.b0.getString(R.string.mail_no_subject);
        } else {
            str = this.j0.getSubject();
        }
        this.k0.J.setText(str);
        WebSettings settings = this.k0.M.getSettings();
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setAppCacheEnabled(false);
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        List<MailHtmlTable> htmlList = this.j0.getHtmlList();
        if (htmlList.size() > 0) {
            str2 = com.tempmail.utils.e.w(htmlList);
        } else {
            str2 = com.tempmail.utils.e.L(this.j0.getTextList());
        }
        if (str2 == null) {
            str2 = "";
        }
        String str5 = v0;
        m.b(str5, "mail webViewContent " + str2);
        this.k0.G.setOnClickListener(this);
        this.k0.D.setOnClickListener(this);
        this.k0.v.setOnClickListener(this);
        this.k0.w.setOnClickListener(this);
        List<AttachmentInfoTable> attachments = this.j0.getAttachments();
        this.n0 = attachments;
        if (attachments.size() > 0) {
            this.k0.q.setVisibility(0);
            StringBuilder sb3 = new StringBuilder();
            for (int i2 = 0; i2 < this.n0.size(); i2++) {
                sb3.append(this.n0.get(i2).getFilename());
                if (i2 != this.n0.size() - 1) {
                    sb3.append(" , ");
                }
            }
            this.k0.C.setText(sb3.toString());
            this.k0.q.setOnClickListener(this);
        }
        String str6 = v0;
        m.b(str6, "webviewcontent " + str2);
        this.m0 = t2(str2);
        this.k0.M.setWebViewClient(new b(this, (a) null));
        this.k0.M.loadDataWithBaseURL("", this.m0, "text/html", "utf-8", "");
        o2(k0(R.string.analytics_email_read_premium));
        com.tempmail.utils.s.X(this.b0, true);
        if (com.tempmail.utils.e.P(this.b0)) {
            com.tempmail.utils.s.y0(this.b0, (int) com.google.firebase.remoteconfig.f.f().h(k0(R.string.remote_config_ir_rewarded_read_email)));
        }
        return this.k0.n();
    }

    public void R0() {
        super.R0();
        DownloadAttachmentService downloadAttachmentService = this.p0;
        if (downloadAttachmentService != null) {
            downloadAttachmentService.i();
            this.Z.unbindService(this.q0);
        }
    }

    public boolean a1(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            this.Z.onBackPressed();
        }
        return super.a1(menuItem);
    }

    public void c1() {
        super.c1();
    }

    public void h1(int i, String[] strArr, int[] iArr) {
        super.h1(i, strArr, iArr);
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
            m.b(str2, "permission denied " + h2("android.permission.WRITE_EXTERNAL_STORAGE"));
            if (!this.o0 && !h2("android.permission.WRITE_EXTERNAL_STORAGE")) {
                E2();
            }
        } else if (i == r0.intValue()) {
            H2();
        } else {
            D2();
        }
    }

    public void i1() {
        super.i1();
        com.tempmail.utils.z.a aVar = this.d0;
        if (aVar != null) {
            aVar.X(8);
        }
        this.c0.k(false);
        androidx.appcompat.app.a u02 = this.Z.u0();
        if (u02 != null) {
            u02.l();
        }
    }

    public void o(AttachmentInfoTable attachmentInfoTable) {
        I2(attachmentInfoTable);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.constraintAttachments /*2131296378*/:
                if (x.y(this.b0)) {
                    String str = v0;
                    m.b(str, "should show rationale " + h2("android.permission.WRITE_EXTERNAL_STORAGE"));
                    this.o0 = h2("android.permission.WRITE_EXTERNAL_STORAGE");
                    C2(t0.intValue());
                    return;
                }
                D2();
                return;
            case R.id.ivDelete /*2131296470*/:
                F2();
                return;
            case R.id.ivDropdown /*2131296479*/:
                if (this.l0) {
                    this.k0.w.setRotation(0.0f);
                    this.k0.C.setMaxLines(1);
                } else {
                    this.k0.w.setRotation(180.0f);
                    this.k0.C.setMaxLines(10);
                }
                this.l0 = !this.l0;
                return;
            case R.id.tvClose /*2131296684*/:
                this.Z.onBackPressed();
                return;
            case R.id.tvDownload /*2131296698*/:
                if (x.y(this.b0)) {
                    this.o0 = h2("android.permission.WRITE_EXTERNAL_STORAGE");
                    C2(r0.intValue());
                    return;
                }
                H2();
                return;
            default:
                return;
        }
    }

    public void q(AttachmentInfoTable attachmentInfoTable) {
        I2(attachmentInfoTable);
    }

    public void s2() {
        this.Z.bindService(new Intent(this.b0, DownloadAttachmentService.class), this.q0, 1);
    }

    public Intent u2() {
        Uri parse = Uri.parse(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), com.tempmail.utils.y.b.f13138c).getPath());
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(parse, "resource/folder");
        return intent;
    }

    public void v2() {
        Context context = this.b0;
        new f(context, com.tempmail.l.b.a(context), this, this.Z.H0());
    }

    public /* synthetic */ void w2(Intent intent, DialogInterface dialogInterface, int i) {
        B2(intent);
        dialogInterface.dismiss();
    }

    public /* synthetic */ void y2(Object obj) {
        AttachmentInfoTable attachmentInfoTable = (AttachmentInfoTable) obj;
        String str = v0;
        m.b(str, "attachmentInfoTable of " + this.n0.indexOf(attachmentInfoTable));
        G2(attachmentInfoTable);
    }
}
