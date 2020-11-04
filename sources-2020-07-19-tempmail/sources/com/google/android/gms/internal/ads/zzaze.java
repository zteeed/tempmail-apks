package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzaze {

    /* renamed from: a  reason: collision with root package name */
    private final Object f6064a = new Object();
    @GuardedBy("lock")

    /* renamed from: b  reason: collision with root package name */
    private String f6065b = "";
    @GuardedBy("lock")

    /* renamed from: c  reason: collision with root package name */
    private String f6066c = "";
    @GuardedBy("lock")

    /* renamed from: d  reason: collision with root package name */
    private boolean f6067d = false;
    @VisibleForTesting

    /* renamed from: e  reason: collision with root package name */
    private String f6068e = "";

    @VisibleForTesting
    private final void b(Context context, String str, boolean z, boolean z2) {
        if (!(context instanceof Activity)) {
            zzbba.h("Can not create dialog without Activity Context");
        } else {
            zzaye.h.post(new w5(this, context, str, z, z2));
        }
    }

    private final String d(Context context) {
        String str;
        synchronized (this.f6064a) {
            if (TextUtils.isEmpty(this.f6065b)) {
                zzq.zzkw();
                String o0 = zzaye.o0(context, "debug_signals_id.txt");
                this.f6065b = o0;
                if (TextUtils.isEmpty(o0)) {
                    zzq.zzkw();
                    this.f6065b = zzaye.q0();
                    zzq.zzkw();
                    zzaye.N(context, "debug_signals_id.txt", this.f6065b);
                }
            }
            str = this.f6065b;
        }
        return str;
    }

    private final void e(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = f(context, (String) zzwg.e().c(zzaav.b2), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        zzq.zzkw();
        zzaye.G(context, str, buildUpon.build().toString());
    }

    private final Uri f(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("linkedDeviceId", d(context));
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    @VisibleForTesting
    private final boolean h(Context context, String str, String str2) {
        String j = j(context, f(context, (String) zzwg.e().c(zzaav.Z1), str, str2).toString(), str2);
        if (TextUtils.isEmpty(j)) {
            zzbba.f("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(j.trim());
            String optString = jSONObject.optString("gct");
            this.f6068e = jSONObject.optString("status");
            synchronized (this.f6064a) {
                this.f6066c = optString;
            }
            return true;
        } catch (JSONException e2) {
            zzbba.d("Fail to get in app preview response json.", e2);
            return false;
        }
    }

    @VisibleForTesting
    private final boolean i(Context context, String str, String str2) {
        String j = j(context, f(context, (String) zzwg.e().c(zzaav.a2), str, str2).toString(), str2);
        if (TextUtils.isEmpty(j)) {
            zzbba.f("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(j.trim()).optString("debug_mode"));
            synchronized (this.f6064a) {
                this.f6067d = equals;
            }
            return equals;
        } catch (JSONException e2) {
            zzbba.d("Fail to get debug mode response json.", e2);
            return false;
        }
    }

    @VisibleForTesting
    private static String j(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractSpiCall.HEADER_USER_AGENT, zzq.zzkw().m0(context, str2));
        zzdvf<String> c2 = new zzazq(context).c(str, hashMap);
        try {
            return c2.get((long) ((Integer) zzwg.e().c(zzaav.c2)).intValue(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e2) {
            String valueOf = String.valueOf(str);
            zzbba.c(valueOf.length() != 0 ? "Timeout while retriving a response from: ".concat(valueOf) : new String("Timeout while retriving a response from: "), e2);
            c2.cancel(true);
            return null;
        } catch (InterruptedException e3) {
            String valueOf2 = String.valueOf(str);
            zzbba.c(valueOf2.length() != 0 ? "Interrupted while retriving a response from: ".concat(valueOf2) : new String("Interrupted while retriving a response from: "), e3);
            c2.cancel(true);
            return null;
        } catch (Exception e4) {
            String valueOf3 = String.valueOf(str);
            zzbba.c(valueOf3.length() != 0 ? "Error retriving a response from: ".concat(valueOf3) : new String("Error retriving a response from: "), e4);
            return null;
        }
    }

    private final void k(Context context, String str, String str2) {
        zzq.zzkw();
        zzaye.j(context, f(context, (String) zzwg.e().c(zzaav.Y1), str, str2));
    }

    public final void a(Context context, String str, String str2, String str3) {
        boolean m = m();
        if (i(context, str, str2)) {
            if (!m && !TextUtils.isEmpty(str3)) {
                e(context, str2, str3, str);
            }
            zzbba.f("Device is linked for debug signals.");
            b(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        k(context, str, str2);
    }

    public final boolean c(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !zzq.zzlg().m()) {
            return false;
        }
        zzbba.f("Sending troubleshooting signals to the server.");
        e(context, str, str2, str3);
        return true;
    }

    public final void g(Context context, String str, String str2) {
        if (!h(context, str, str2)) {
            b(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(this.f6068e)) {
            zzbba.f("Creative is not pushed for this device.");
            b(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(this.f6068e)) {
            zzbba.f("The app is not linked for creative preview.");
            k(context, str, str2);
        } else if ("0".equals(this.f6068e)) {
            zzbba.f("Device is linked for in app preview.");
            b(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final String l() {
        String str;
        synchronized (this.f6064a) {
            str = this.f6066c;
        }
        return str;
    }

    public final boolean m() {
        boolean z;
        synchronized (this.f6064a) {
            z = this.f6067d;
        }
        return z;
    }
}
