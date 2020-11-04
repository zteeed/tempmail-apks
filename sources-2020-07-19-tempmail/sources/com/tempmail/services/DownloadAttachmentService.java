package com.tempmail.services;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.webkit.MimeTypeMap;
import android.widget.Toast;
import androidx.core.app.g;
import androidx.core.content.FileProvider;
import com.tempmail.R;
import com.tempmail.api.models.answers.FreeResultAttachments;
import com.tempmail.api.models.answers.GetAttachmentWrapper;
import com.tempmail.api.models.answers.ResultAttachments;
import com.tempmail.api.models.requests.GetAttachmentBody;
import com.tempmail.utils.e;
import com.tempmail.utils.m;
import com.tempmail.utils.q;
import com.tempmail.utils.s;
import com.tempmail.utils.u;
import com.tempmail.utils.w;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DownloadAttachmentService extends d {
    public static final String j = DownloadAttachmentService.class.getSimpleName();
    private final IBinder g = new c();
    com.tempmail.utils.z.b h;
    List<String> i = new ArrayList();

    class a extends com.tempmail.j.c<GetAttachmentWrapper> {
        final /* synthetic */ com.tempmail.db.a g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z, Context context, com.tempmail.db.a aVar) {
            super(z, context);
            this.g = aVar;
        }

        public void c() {
            m.b(DownloadAttachmentService.j, "get attachment onNetworkError");
            q.d(DownloadAttachmentService.this, com.tempmail.utils.y.b.f12598e.intValue(), DownloadAttachmentService.this.getString(R.string.app_name), DownloadAttachmentService.this.getString(R.string.message_network_error_message));
            Toast.makeText(DownloadAttachmentService.this, R.string.message_network_error_message, 1).show();
            DownloadAttachmentService.this.h(this.g);
        }

        public void d(Throwable th) {
            m.b(DownloadAttachmentService.j, "onError");
            th.printStackTrace();
            String a2 = u.a(DownloadAttachmentService.this, R.string.message_attachment_download_error, this.g.d());
            q.d(DownloadAttachmentService.this, com.tempmail.utils.y.b.f12598e.intValue(), DownloadAttachmentService.this.getString(R.string.app_name), a2);
            Toast.makeText(DownloadAttachmentService.this, a2, 1).show();
            DownloadAttachmentService.this.h(this.g);
        }

        /* renamed from: g */
        public void onNext(GetAttachmentWrapper getAttachmentWrapper) {
            m.b(DownloadAttachmentService.j, "onNext");
            if (getAttachmentWrapper.getResult() != null) {
                ResultAttachments.Attachment attachment = getAttachmentWrapper.getResult().getAttachment();
                DownloadAttachmentService downloadAttachmentService = DownloadAttachmentService.this;
                File j = downloadAttachmentService.j(downloadAttachmentService.g(attachment), attachment.getData());
                DownloadAttachmentService downloadAttachmentService2 = DownloadAttachmentService.this;
                Uri e2 = FileProvider.e(downloadAttachmentService2, downloadAttachmentService2.getString(R.string.file_provider_authority), j);
                String b2 = u.b(DownloadAttachmentService.this, R.string.message_attachment_downloaded_new, attachment.getFilename(), DownloadAttachmentService.this.getString(R.string.app_name));
                DownloadAttachmentService downloadAttachmentService3 = DownloadAttachmentService.this;
                q.c(downloadAttachmentService3, e2, downloadAttachmentService3.getString(R.string.app_name), b2, attachment.getContentType());
            }
            DownloadAttachmentService.this.h(this.g);
        }

        public void onComplete() {
            m.b(DownloadAttachmentService.j, "get attachment onComplete");
        }
    }

    class b extends com.tempmail.j.c<FreeResultAttachments> {
        final /* synthetic */ com.tempmail.db.a g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(boolean z, Context context, com.tempmail.db.a aVar) {
            super(z, context);
            this.g = aVar;
        }

        public void c() {
            m.b(DownloadAttachmentService.j, "get attachment onNetworkError");
            q.d(DownloadAttachmentService.this, com.tempmail.utils.y.b.f12598e.intValue(), DownloadAttachmentService.this.getString(R.string.app_name), DownloadAttachmentService.this.getString(R.string.message_network_error_message));
            Toast.makeText(DownloadAttachmentService.this, R.string.message_network_error_message, 1).show();
            DownloadAttachmentService.this.h(this.g);
        }

        public void d(Throwable th) {
            m.b(DownloadAttachmentService.j, "onError");
            th.printStackTrace();
            String a2 = u.a(DownloadAttachmentService.this, R.string.message_attachment_download_error, this.g.d());
            q.d(DownloadAttachmentService.this, com.tempmail.utils.y.b.f12598e.intValue(), DownloadAttachmentService.this.getString(R.string.app_name), a2);
            Toast.makeText(DownloadAttachmentService.this, a2, 1).show();
            DownloadAttachmentService.this.h(this.g);
        }

        /* renamed from: g */
        public void onNext(FreeResultAttachments freeResultAttachments) {
            m.b(DownloadAttachmentService.j, "onNext");
            if (freeResultAttachments != null) {
                String name = freeResultAttachments.getName();
                String str = DownloadAttachmentService.j;
                m.b(str, "fileName " + name);
                File j = DownloadAttachmentService.this.j(this.g.i(), freeResultAttachments.getContent());
                DownloadAttachmentService downloadAttachmentService = DownloadAttachmentService.this;
                Uri e2 = FileProvider.e(downloadAttachmentService, downloadAttachmentService.getString(R.string.file_provider_authority), j);
                String b2 = u.b(DownloadAttachmentService.this, R.string.message_attachment_downloaded_new, freeResultAttachments.getName(), DownloadAttachmentService.this.getString(R.string.app_name));
                DownloadAttachmentService downloadAttachmentService2 = DownloadAttachmentService.this;
                q.c(downloadAttachmentService2, e2, downloadAttachmentService2.getString(R.string.app_name), b2, freeResultAttachments.getContentType());
            }
            DownloadAttachmentService.this.h(this.g);
        }

        public void onComplete() {
            m.b(DownloadAttachmentService.j, "get attachment onComplete");
        }
    }

    public class c extends Binder {
        public c() {
        }

        public DownloadAttachmentService a() {
            return DownloadAttachmentService.this;
        }
    }

    private void n() {
        g.d dVar = new g.d(this, getString(R.string.foreground_channel));
        dVar.u(17301633);
        dVar.k(getString(R.string.app_name));
        dVar.j(getText(R.string.message_downloading_attachment));
        dVar.i(PendingIntent.getActivity(getApplicationContext(), 0, new Intent(getApplicationContext(), e.o(getApplicationContext(), ".MainActivity")), 0));
        m.b(j, "show foreground notify");
        startForeground(112226, dVar.b());
    }

    public void c() {
        stopForeground(true);
        stopSelf();
    }

    public void d(com.tempmail.db.a aVar) {
        File file = new File(w.n().getPath(), aVar.i());
        if (!file.exists()) {
            try {
                file.createNewFile();
                String str = j;
                m.b(str, "setWritable " + file.setWritable(true));
                String str2 = j;
                m.b(str2, "setReadable " + file.setReadable(true));
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        m(aVar);
        GetAttachmentBody getAttachmentBody = new GetAttachmentBody(s.L(this), aVar.d(), aVar.c(), aVar.a());
        Toast.makeText(this, u.a(this, R.string.message_downloading_attachment_started, aVar.d()), 1).show();
        this.f12520e.b((d.a.y.b) com.tempmail.j.b.c(this, false).h(getAttachmentBody).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new a(true, this, aVar)));
    }

    public void e(com.tempmail.db.a aVar) {
        File file = new File(w.n().getPath(), aVar.i());
        String str = j;
        m.b(str, "create file " + file.getPath());
        if (!file.exists()) {
            try {
                boolean createNewFile = file.createNewFile();
                String str2 = j;
                m.b(str2, "setWritable " + file.setWritable(true));
                String str3 = j;
                m.b(str3, "setReadable " + file.setReadable(true));
                String str4 = j;
                m.b(str4, "file " + file.getPath() + " isCreated " + createNewFile);
                String str5 = j;
                StringBuilder sb = new StringBuilder();
                sb.append("file is Exist");
                sb.append(file.exists());
                m.b(str5, sb.toString());
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        m(aVar);
        Toast.makeText(this, u.a(this, R.string.message_downloading_attachment_started, aVar.d()), 1).show();
        this.f12520e.b((d.a.y.b) com.tempmail.j.b.c(this, false).q(aVar.c(), aVar.a()).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new b(true, this, aVar)));
    }

    public List<String> f() {
        return this.i;
    }

    public String g(ResultAttachments.Attachment attachment) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(attachment.getContentType());
        String filename = attachment.getFilename();
        m.b(j, "fileName " + filename);
        m.b(j, "extension " + extensionFromMimeType);
        if (extensionFromMimeType == null || filename.contains(extensionFromMimeType)) {
            return filename;
        }
        String str = filename + "." + extensionFromMimeType;
        m.b(j, "fileName updated" + str);
        return str;
    }

    public void h(com.tempmail.db.a aVar) {
        l(aVar);
        String f2 = aVar.f();
        String str = j;
        m.b(str, "before remove attachment id  " + this.i.size());
        this.i.remove(f2);
        String str2 = j;
        m.b(str2, "remove attachment id  " + f2);
        String str3 = j;
        m.b(str3, "attachmentIdList size " + this.i.size());
        if (this.i.size() == 0) {
            c();
        }
    }

    public void i() {
        this.h = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d A[SYNTHETIC, Splitter:B:15:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e A[SYNTHETIC, Splitter:B:23:0x006e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File j(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 0
            byte[] r5 = android.util.Base64.decode(r5, r0)
            java.io.File r0 = new java.io.File
            java.io.File r1 = com.tempmail.utils.w.n()
            java.lang.String r1 = r1.getPath()
            r0.<init>(r1, r4)
            r4 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0025, all -> 0x0021 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0025, all -> 0x0021 }
            r1.write(r5)     // Catch:{ IOException -> 0x001f }
            r1.close()     // Catch:{ IOException -> 0x0031 }
            goto L_0x0035
        L_0x001f:
            r4 = move-exception
            goto L_0x0028
        L_0x0021:
            r5 = move-exception
            r1 = r4
            r4 = r5
            goto L_0x006c
        L_0x0025:
            r5 = move-exception
            r1 = r4
            r4 = r5
        L_0x0028:
            r4.printStackTrace()     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x0035
            r1.close()     // Catch:{ IOException -> 0x0031 }
            goto L_0x0035
        L_0x0031:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0035:
            java.lang.String r4 = j
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "setWritable "
            r5.append(r1)
            r1 = 1
            boolean r2 = r0.setWritable(r1)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.tempmail.utils.m.b(r4, r5)
            java.lang.String r4 = j
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = "setReadable "
            r5.append(r2)
            boolean r1 = r0.setReadable(r1)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            com.tempmail.utils.m.b(r4, r5)
            return r0
        L_0x006b:
            r4 = move-exception
        L_0x006c:
            if (r1 == 0) goto L_0x0076
            r1.close()     // Catch:{ IOException -> 0x0072 }
            goto L_0x0076
        L_0x0072:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0076:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tempmail.services.DownloadAttachmentService.j(java.lang.String, java.lang.String):java.io.File");
    }

    public void k(com.tempmail.utils.z.b bVar) {
        this.h = bVar;
    }

    public void l(com.tempmail.db.a aVar) {
        if (this.h != null) {
            m.b(j, "downloadAttachmentListener!=null");
            this.h.o(aVar);
        }
    }

    public void m(com.tempmail.db.a aVar) {
        com.tempmail.utils.z.b bVar = this.h;
        if (bVar != null) {
            bVar.m(aVar);
        }
    }

    public IBinder onBind(Intent intent) {
        return this.g;
    }

    public void onCreate() {
        super.onCreate();
        m.b(j, "onCreate");
        b();
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        super.onStartCommand(intent, i2, i3);
        m.b(j, "onStartCommand");
        if (intent != null) {
            com.tempmail.db.a aVar = (com.tempmail.db.a) intent.getSerializableExtra("extra_attachment_info");
            if (aVar == null) {
                c();
            } else {
                String f2 = aVar.f();
                String str = j;
                m.b(str, "attachmentIdList size  before " + this.i.size());
                if (!this.i.contains(f2)) {
                    this.i.add(f2);
                }
                String str2 = j;
                m.b(str2, "add attachmentId  " + f2);
                String str3 = j;
                m.b(str3, "attachmentIdList size   " + this.i.size());
                if (e.O(this)) {
                    e(aVar);
                } else {
                    d(aVar);
                }
            }
        }
        n();
        return 2;
    }
}
