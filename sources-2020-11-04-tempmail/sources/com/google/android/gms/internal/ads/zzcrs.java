package com.google.android.gms.internal.ads;

import a.c.b.a;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcrs implements zzcqt<zzbzj> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7601a;

    /* renamed from: b  reason: collision with root package name */
    private final zzcae f7602b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f7603c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdki f7604d;

    public zzcrs(Context context, Executor executor, zzcae zzcae, zzdki zzdki) {
        this.f7601a = context;
        this.f7602b = zzcae;
        this.f7603c = executor;
        this.f7604d = zzdki;
    }

    private static String d(zzdkk zzdkk) {
        try {
            return zzdkk.s.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    public final zzdvf<zzbzj> a(zzdkw zzdkw, zzdkk zzdkk) {
        String d2 = d(zzdkk);
        return zzdux.j(zzdux.g(null), new wn(this, d2 != null ? Uri.parse(d2) : null, zzdkw, zzdkk), this.f7603c);
    }

    public final boolean b(zzdkw zzdkw, zzdkk zzdkk) {
        return (this.f7601a instanceof Activity) && PlatformVersion.b() && zzabs.a(this.f7601a) && !TextUtils.isEmpty(d(zzdkk));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf c(Uri uri, zzdkw zzdkw, zzdkk zzdkk, Object obj) throws Exception {
        try {
            a a2 = new a.C0004a().a();
            a2.f97a.setData(uri);
            zzd zzd = new zzd(a2.f97a);
            zzbbn zzbbn = new zzbbn();
            zzbzl a3 = this.f7602b.a(new zzbpr(zzdkw, zzdkk, (String) null), new zzbzk(new vn(zzbbn)));
            zzbbn.a(new AdOverlayInfoParcel(zzd, (zzuu) null, a3.j(), (zzt) null, new zzbbd(0, 0, false)));
            this.f7604d.f();
            return zzdux.g(a3.i());
        } catch (Throwable th) {
            zzbba.c("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}