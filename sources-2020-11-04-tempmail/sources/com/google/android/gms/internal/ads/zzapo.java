package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.zzq;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzapo extends zzaqd {

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f6019c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Context f6020d;

    /* renamed from: e  reason: collision with root package name */
    private String f6021e = k("description");

    /* renamed from: f  reason: collision with root package name */
    private long f6022f = l("start_ticks");
    private long g = l("end_ticks");
    private String h = k("summary");
    private String i = k("location");

    public zzapo(zzbfn zzbfn, Map<String, String> map) {
        super(zzbfn, "createCalendarEvent");
        this.f6019c = map;
        this.f6020d = zzbfn.b();
    }

    private final String k(String str) {
        return TextUtils.isEmpty(this.f6019c.get(str)) ? "" : this.f6019c.get(str);
    }

    private final long l(String str) {
        String str2 = this.f6019c.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    @TargetApi(14)
    public final Intent h() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.f6021e);
        data.putExtra("eventLocation", this.i);
        data.putExtra("description", this.h);
        long j = this.f6022f;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.g;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void i() {
        if (this.f6020d == null) {
            e("Activity context is not available.");
            return;
        }
        zzq.zzkw();
        if (!zzaye.z(this.f6020d).e()) {
            e("This feature is not available on the device.");
            return;
        }
        zzq.zzkw();
        AlertDialog.Builder y = zzaye.y(this.f6020d);
        Resources b2 = zzq.zzla().b();
        y.setTitle(b2 != null ? b2.getString(R.string.s5) : "Create calendar event");
        y.setMessage(b2 != null ? b2.getString(R.string.s6) : "Allow Ad to create a calendar event?");
        y.setPositiveButton(b2 != null ? b2.getString(R.string.s3) : AbstractSpiCall.HEADER_ACCEPT, new g3(this));
        y.setNegativeButton(b2 != null ? b2.getString(R.string.s4) : "Decline", new f3(this));
        y.create().show();
    }
}
