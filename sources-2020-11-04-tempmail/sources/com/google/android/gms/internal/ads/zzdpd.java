package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdpd {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f8462a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbbe f8463b;

    /* renamed from: c  reason: collision with root package name */
    private final zzcts f8464c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8465d;

    /* renamed from: e  reason: collision with root package name */
    private final String f8466e;

    /* renamed from: f  reason: collision with root package name */
    private final String f8467f;
    private final Context g;
    private final zzdkv h;
    private final Clock i;
    private final zzeg j;

    public zzdpd(Executor executor, zzbbe zzbbe, zzcts zzcts, zzbbd zzbbd, String str, String str2, Context context, zzdkv zzdkv, Clock clock, zzeg zzeg) {
        this.f8462a = executor;
        this.f8463b = zzbbe;
        this.f8464c = zzcts;
        this.f8465d = zzbbd.f6314b;
        this.f8466e = str;
        this.f8467f = str2;
        this.g = context;
        this.h = zzdkv;
        this.i = clock;
        this.j = zzeg;
    }

    private static String d(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    private static String f(String str) {
        return (TextUtils.isEmpty(str) || !zzbau.a()) ? str : "fakeForAdDebugLog";
    }

    public final void a(zzdkw zzdkw, zzdkk zzdkk, List<String> list) {
        c(zzdkw, zzdkk, false, "", "", list);
    }

    public final void b(zzdkw zzdkw, zzdkk zzdkk, List<String> list, zzatg zzatg) {
        long a2 = this.i.a();
        try {
            String type = zzatg.getType();
            String num = Integer.toString(zzatg.getAmount());
            ArrayList arrayList = new ArrayList();
            zzdkv zzdkv = this.h;
            String str = "";
            String f2 = zzdkv == null ? str : f(zzdkv.f8342a);
            zzdkv zzdkv2 = this.h;
            if (zzdkv2 != null) {
                str = f(zzdkv2.f8343b);
            }
            for (String d2 : list) {
                arrayList.add(zzawn.d(d(d(d(d(d(d(d2, "@gw_rwd_userid@", Uri.encode(f2)), "@gw_rwd_custom_data@", Uri.encode(str)), "@gw_tmstmp@", Long.toString(a2)), "@gw_rwd_itm@", Uri.encode(type)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.f8465d), this.g, zzdkk.N));
            }
            h(arrayList);
        } catch (RemoteException unused) {
        }
    }

    public final void c(zzdkw zzdkw, zzdkk zzdkk, boolean z, String str, String str2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        String str3 = z ? "1" : "0";
        for (String d2 : list) {
            String d3 = d(d(d(d2, "@gw_adlocid@", zzdkw.f8344a.f8332a.f8351f), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.f8465d);
            if (zzdkk != null) {
                d3 = zzawn.d(d(d(d(d3, "@gw_qdata@", zzdkk.v), "@gw_adnetid@", zzdkk.u), "@gw_allocid@", zzdkk.t), this.g, zzdkk.N);
            }
            String d4 = d(d(d(d3, "@gw_adnetstatus@", this.f8464c.e()), "@gw_seqnum@", this.f8466e), "@gw_sessid@", this.f8467f);
            boolean z2 = ((Boolean) zzwg.e().c(zzaav.r1)).booleanValue() && !TextUtils.isEmpty(str);
            boolean isEmpty = true ^ TextUtils.isEmpty(str2);
            if (z2 || isEmpty) {
                if (this.j.f(Uri.parse(d4))) {
                    Uri.Builder buildUpon = Uri.parse(d4).buildUpon();
                    if (z2) {
                        buildUpon = buildUpon.appendQueryParameter("ms", str);
                    }
                    if (isEmpty) {
                        buildUpon = buildUpon.appendQueryParameter("attok", str2);
                    }
                    d4 = buildUpon.build().toString();
                }
            }
            arrayList.add(d4);
        }
        h(arrayList);
    }

    public final void e(String str) {
        this.f8462a.execute(new fy(this, str));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g(String str) {
        this.f8463b.a(str);
    }

    public final void h(List<String> list) {
        for (String e2 : list) {
            e(e2);
        }
    }
}
