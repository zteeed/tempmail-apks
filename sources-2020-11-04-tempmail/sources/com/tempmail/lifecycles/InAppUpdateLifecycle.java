package com.tempmail.lifecycles;

import android.app.Activity;
import android.content.IntentSender;
import android.widget.Toast;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.lifecycle.r;
import b.c.a.e.a.a.a;
import b.c.a.e.a.a.c;
import com.google.android.play.core.install.b;
import com.tempmail.R;
import com.tempmail.billing.f;
import com.tempmail.utils.m;
import com.tempmail.utils.s;
import com.tempmail.utils.x;

public class InAppUpdateLifecycle implements j, b {
    public static final String g = "InAppUpdateLifecycle";

    /* renamed from: a  reason: collision with root package name */
    public f<Void> f12918a = new f<>();

    /* renamed from: b  reason: collision with root package name */
    public f<Void> f12919b = new f<>();

    /* renamed from: c  reason: collision with root package name */
    Activity f12920c;

    /* renamed from: d  reason: collision with root package name */
    b.c.a.e.a.a.b f12921d;

    /* renamed from: e  reason: collision with root package name */
    boolean f12922e = false;

    /* renamed from: f  reason: collision with root package name */
    int f12923f = -1;

    public InAppUpdateLifecycle(Activity activity) {
        this.f12920c = activity;
    }

    @r(g.a.ON_CREATE)
    public void create() {
        m.b(g, "ON_CREATE");
        this.f12921d = c.a(this.f12920c);
        h();
    }

    @r(g.a.ON_DESTROY)
    public void destroy() {
        m.b(g, "ON_DESTROY");
        this.f12921d.e(this);
        this.f12920c = null;
    }

    public void h() {
        com.google.android.play.core.tasks.c<a> b2 = this.f12921d.b();
        b2.a(new c(this));
        b2.c(new b(this));
    }

    public int j(a aVar) {
        int i = 1;
        if (aVar.i() == null || (aVar.i().intValue() < com.tempmail.utils.y.b.h.intValue() && aVar.n(0))) {
            i = 0;
        } else if (!aVar.n(1)) {
            i = -1;
        }
        if (this.f12922e) {
            Activity activity = this.f12920c;
            Toast.makeText(activity, "getAppUpdateType " + i, 0).show();
        }
        if (i == 0 && s.Q(this.f12920c) > 5) {
            return -1;
        }
        if (this.f12922e) {
            Activity activity2 = this.f12920c;
            Toast.makeText(activity2, "getAppUpdateType after " + i, 0).show();
        }
        return i;
    }

    public boolean k() {
        return Float.parseFloat(x.f(this.f12920c)) < s.G(this.f12920c);
    }

    public /* synthetic */ void l(Exception exc) {
        exc.printStackTrace();
        m.b(g, "onFailure ");
        if (this.f12920c != null) {
            String str = g;
            m.b(str, "isShowUpdateDialog " + k());
            int s = s.s(this.f12920c);
            if (this.f12922e) {
                Activity activity = this.f12920c;
                Toast.makeText(activity, "onFailure " + s, 0).show();
                Activity activity2 = this.f12920c;
                Toast.makeText(activity2, "isShowUpdateDialog " + k(), 0).show();
                Activity activity3 = this.f12920c;
                Toast.makeText(activity3, "playmarketVersion  " + s.G(this.f12920c), 0).show();
            }
            if (s < 3 || !k()) {
                s.Z(this.f12920c, s + 1);
            } else {
                this.f12918a.i(null);
            }
        }
    }

    public /* synthetic */ void m(a aVar) {
        Activity activity = this.f12920c;
        if (activity != null) {
            s.Z(activity, 0);
            if (this.f12922e) {
                Activity activity2 = this.f12920c;
                Toast.makeText(activity2, "update Availability " + aVar.r(), 0).show();
            }
            String str = g;
            m.b(str, "install status " + aVar.m());
            if (aVar.m() == 11) {
                m.b(g, "install status DOWNLOADED");
                if (this.f12922e) {
                    Toast.makeText(this.f12920c, "checkAppUpdateAvailable DOWNLOADED", 0).show();
                }
            }
            String str2 = g;
            m.b(str2, "updateAvailability " + aVar.r());
            String str3 = g;
            StringBuilder sb = new StringBuilder();
            sb.append("is update available ");
            sb.append(aVar.r() == 2);
            m.b(str3, sb.toString());
            if (aVar.i() != null) {
                String str4 = g;
                m.b(str4, "StalenessDays  " + aVar.i());
            }
            String str5 = g;
            m.b(str5, "is update available FLEXIBLE " + aVar.n(0));
            String str6 = g;
            m.b(str6, "is update available IMMEDIATE " + aVar.n(1));
            int j = aVar.r() == 2 ? j(aVar) : -1;
            if (j != -1) {
                q(aVar, j);
            }
        }
    }

    public /* synthetic */ void n(a aVar) {
        if (this.f12920c != null) {
            String str = g;
            m.b(str, "resumeStartedAppUpdate appUpdateInfo.updateAvailability() " + aVar.r());
            boolean z = false;
            if (aVar.m() == 11) {
                m.b(g, "appUpdateInfo.installStatus() == InstallStatus.DOWNLOADED ");
                if (this.f12922e) {
                    Toast.makeText(this.f12920c, "resumeStartedAppUpdate DOWNLOADED", 0).show();
                }
                this.f12919b.i(null);
            }
            if (this.f12922e) {
                Activity activity = this.f12920c;
                Toast.makeText(activity, "resumeStartedAppUpdate requestedUpdateType " + this.f12923f + " updateAvailability " + aVar.r(), 0).show();
            }
            if (this.f12923f != 0 && aVar.r() == 3) {
                if (this.f12922e && aVar.i() != null) {
                    Activity activity2 = this.f12920c;
                    Toast.makeText(activity2, "resumeStartedAppUpdate clientVersionStalenessDays " + aVar.i(), 0).show();
                }
                String str2 = g;
                StringBuilder sb = new StringBuilder();
                sb.append("resumeStartedAppUpdate is DEVELOPER_TRIGGERED_UPDATE_IN_PROGRESS ");
                if (aVar.r() == 3) {
                    z = true;
                }
                sb.append(z);
                m.b(str2, sb.toString());
                q(aVar, j(aVar));
            }
        }
    }

    /* renamed from: o */
    public void e(com.google.android.play.core.install.a aVar) {
        if (this.f12922e) {
            Activity activity = this.f12920c;
            Toast.makeText(activity, "requestAppUpdate installStatus  " + aVar.d(), 0).show();
        }
        if (aVar.d() == 2) {
            long b2 = aVar.b();
            long f2 = aVar.f();
            String str = g;
            m.b(str, "bytesDownloaded " + b2);
            String str2 = g;
            m.b(str2, "totalBytesToDownload " + f2);
            if (this.f12922e) {
                Activity activity2 = this.f12920c;
                Toast.makeText(activity2, "requestAppUpdate DOWNLOADING  " + b2, 0).show();
            }
        }
        if (aVar.d() == 11) {
            this.f12919b.i(null);
            if (this.f12922e) {
                Toast.makeText(this.f12920c, "requestAppUpdate DOWNLOADED", 0).show();
            }
            this.f12921d.e(this);
        }
    }

    public void p(int i) {
        if (i != -1) {
            String str = g;
            m.c(str, "Update flow failed! Result code: " + i);
            if (this.f12923f == 1) {
                Toast.makeText(this.f12920c, R.string.update_app_dialog_message, 1).show();
                this.f12920c.finish();
            } else {
                m.c(g, "Flexible update can be skipped ");
            }
            this.f12923f = -1;
        }
    }

    public void q(a aVar, int i) {
        this.f12923f = i;
        s.w0(this.f12920c, s.Q(this.f12920c) + 1);
        String str = g;
        m.b(str, "requestAppUpdate " + aVar);
        String str2 = g;
        m.b(str2, "requestAppUpdate type " + i);
        if (this.f12922e) {
            Activity activity = this.f12920c;
            Toast.makeText(activity, "requestAppUpdate type " + i, 0).show();
        }
        this.f12921d.c(this);
        try {
            this.f12921d.d(aVar, i, this.f12920c, com.tempmail.utils.y.c.f13144c.intValue());
        } catch (IntentSender.SendIntentException e2) {
            e2.printStackTrace();
        }
    }

    public void r() {
        m.b(g, "resumeStartedAppUpdate");
        this.f12921d.b().c(new a(this));
    }

    @r(g.a.ON_RESUME)
    public void resume() {
        m.b(g, "ON_RESUME");
        r();
    }
}
