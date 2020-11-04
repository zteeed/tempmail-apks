package com.tempmail.services;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.widget.Toast;
import androidx.core.app.g;
import androidx.core.content.FileProvider;
import com.tempmail.R;
import com.tempmail.api.models.answers.GetMailSourceWrapper;
import com.tempmail.api.models.answers.ResultMailSource;
import com.tempmail.api.models.requests.GetMailSourceBody;
import com.tempmail.utils.e;
import com.tempmail.utils.m;
import com.tempmail.utils.q;
import com.tempmail.utils.s;
import com.tempmail.utils.u;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class DownloadMailService extends d {
    public static final String h = DownloadMailService.class.getSimpleName();
    private final IBinder g = new c(this);

    class a extends com.tempmail.j.c<GetMailSourceWrapper> {
        a(boolean z, Context context) {
            super(z, context);
        }

        public void c() {
            m.b(DownloadMailService.h, "onNetworkError");
            DownloadMailService.this.f();
        }

        public void d(Throwable th) {
            m.b(DownloadMailService.h, "onError");
            th.printStackTrace();
            DownloadMailService.this.g();
        }

        /* renamed from: g */
        public void onNext(GetMailSourceWrapper getMailSourceWrapper) {
            m.b(DownloadMailService.h, "onNext getMailSource ");
            if (getMailSourceWrapper.getError() == null) {
                ResultMailSource.Message message = getMailSourceWrapper.getResult().getMessage();
                if (message != null) {
                    String mailSource = message.getMailSource();
                    String format = SimpleDateFormat.getDateTimeInstance().format(new Date(Long.valueOf((long) (Double.valueOf(Double.parseDouble(message.getMailTimestamp())).doubleValue() * 1000.0d)).longValue()));
                    File h = DownloadMailService.this.h(message.getMailAddress() + "_" + format + ".eml", mailSource);
                    DownloadMailService downloadMailService = DownloadMailService.this;
                    Uri e2 = FileProvider.e(downloadMailService, downloadMailService.getString(R.string.file_provider_authority), h);
                    DownloadMailService downloadMailService2 = DownloadMailService.this;
                    q.e(downloadMailService2, e2, downloadMailService2.getString(R.string.app_name), u.a(DownloadMailService.this, R.string.message_mail_downloaded_new, com.tempmail.utils.y.b.f12596c));
                } else {
                    q.d(DownloadMailService.this, com.tempmail.utils.y.b.f12598e.intValue(), DownloadMailService.this.getString(R.string.app_name), DownloadMailService.this.getString(R.string.message_mail_downloaded_error));
                }
            } else {
                q.d(DownloadMailService.this, com.tempmail.utils.y.b.f12598e.intValue(), DownloadMailService.this.getString(R.string.app_name), DownloadMailService.this.getString(R.string.message_mail_downloaded_error));
            }
            DownloadMailService.this.c();
        }

        public void onComplete() {
            m.b(DownloadMailService.h, "getMailSource onComplete");
            DownloadMailService.this.c();
        }
    }

    class b extends com.tempmail.j.c<List<String>> {
        final /* synthetic */ double g;
        final /* synthetic */ String h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(boolean z, Context context, double d2, String str) {
            super(z, context);
            this.g = d2;
            this.h = str;
        }

        public void c() {
            m.b(DownloadMailService.h, "onNetworkError");
            DownloadMailService.this.f();
        }

        public void d(Throwable th) {
            m.b(DownloadMailService.h, "onError");
            th.printStackTrace();
            DownloadMailService.this.g();
        }

        /* renamed from: g */
        public void onNext(List<String> list) {
            m.b(DownloadMailService.h, "onNext getMailSourceFree ");
            if (list == null || list.size() <= 0) {
                q.d(DownloadMailService.this, com.tempmail.utils.y.b.f12598e.intValue(), DownloadMailService.this.getString(R.string.app_name), DownloadMailService.this.getString(R.string.message_mail_downloaded_error));
            } else {
                File h2 = DownloadMailService.this.h(this.h + "_" + SimpleDateFormat.getDateTimeInstance().format(new Date(Long.valueOf((long) (this.g * 1000.0d)).longValue())) + ".eml", list.get(0));
                DownloadMailService downloadMailService = DownloadMailService.this;
                Uri e2 = FileProvider.e(downloadMailService, downloadMailService.getString(R.string.file_provider_authority), h2);
                DownloadMailService downloadMailService2 = DownloadMailService.this;
                q.e(downloadMailService2, e2, downloadMailService2.getString(R.string.app_name), u.a(DownloadMailService.this, R.string.message_mail_downloaded_new, com.tempmail.utils.y.b.f12596c));
                m.b(DownloadMailService.h, "showMailLoadedNotification ");
            }
            DownloadMailService.this.c();
        }

        public void onComplete() {
            m.b(DownloadMailService.h, "getMailSource onComplete");
            DownloadMailService.this.c();
        }
    }

    public class c extends Binder {
        public c(DownloadMailService downloadMailService) {
        }
    }

    private void i() {
        g.d dVar = new g.d(this, getString(R.string.foreground_channel));
        dVar.u(17301633);
        dVar.k(getString(R.string.app_name));
        dVar.j(getText(R.string.message_downloading_mail));
        dVar.i(PendingIntent.getActivity(getApplicationContext(), 0, new Intent(getApplicationContext(), e.o(getApplicationContext(), ".MainActivity")), 0));
        m.b(h, "show foreground notify");
        startForeground(112226, dVar.b());
    }

    public void c() {
        stopForeground(true);
        stopSelf();
    }

    public void d(String str) {
        Toast.makeText(this, R.string.message_downloading_started, 1).show();
        this.f12520e.b((d.a.y.b) com.tempmail.j.b.c(this, false).c(new GetMailSourceBody(s.L(this), str)).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new a(true, this)));
    }

    public void e(String str, String str2, double d2) {
        Toast.makeText(this, R.string.message_downloading_started, 1).show();
        this.f12520e.b((d.a.y.b) com.tempmail.j.b.f(this).i(str).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new b(true, this, d2, str2)));
    }

    public void f() {
        c();
        q.d(this, com.tempmail.utils.y.b.f12598e.intValue(), getString(R.string.app_name), getString(R.string.message_network_error_message));
    }

    public void g() {
        c();
        q.d(this, com.tempmail.utils.y.b.f12598e.intValue(), getString(R.string.app_name), getString(R.string.message_mail_downloaded_error));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c A[SYNTHETIC, Splitter:B:15:0x002c] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0038 A[SYNTHETIC, Splitter:B:22:0x0038] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File h(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = com.tempmail.utils.w.n()
            java.lang.String r1 = r1.getPath()
            r0.<init>(r1, r3)
            r3 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0024, all -> 0x0020 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0024, all -> 0x0020 }
            byte[] r3 = r4.getBytes()     // Catch:{ IOException -> 0x001e }
            r1.write(r3)     // Catch:{ IOException -> 0x001e }
            r1.close()     // Catch:{ IOException -> 0x0030 }
            goto L_0x0034
        L_0x001e:
            r3 = move-exception
            goto L_0x0027
        L_0x0020:
            r4 = move-exception
            r1 = r3
            r3 = r4
            goto L_0x0036
        L_0x0024:
            r4 = move-exception
            r1 = r3
            r3 = r4
        L_0x0027:
            r3.printStackTrace()     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0034
            r1.close()     // Catch:{ IOException -> 0x0030 }
            goto L_0x0034
        L_0x0030:
            r3 = move-exception
            r3.printStackTrace()
        L_0x0034:
            return r0
        L_0x0035:
            r3 = move-exception
        L_0x0036:
            if (r1 == 0) goto L_0x0040
            r1.close()     // Catch:{ IOException -> 0x003c }
            goto L_0x0040
        L_0x003c:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0040:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tempmail.services.DownloadMailService.h(java.lang.String, java.lang.String):java.io.File");
    }

    public IBinder onBind(Intent intent) {
        return this.g;
    }

    public void onCreate() {
        super.onCreate();
        m.b(h, "onCreate");
        b();
        i();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        m.b(h, "onStartCommand");
        if (intent == null) {
            return 2;
        }
        String stringExtra = intent.getStringExtra("extra_email_id");
        String stringExtra2 = intent.getStringExtra("extra_address_id");
        double doubleExtra = intent.getDoubleExtra("extra_timestamp", 0.0d);
        if (e.O(this)) {
            e(stringExtra, stringExtra2, doubleExtra);
            return 2;
        }
        d(stringExtra);
        return 2;
    }
}
