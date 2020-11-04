package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbrx;
import com.google.android.gms.internal.ads.zzbxa;
import com.google.android.gms.internal.ads.zzcym;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcxz extends zzawu {
    private static final List<String> l = new ArrayList(Arrays.asList(new String[]{"/aclk", "/pcs/click"}));
    private static final List<String> m = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com"}));
    private static final List<String> n = new ArrayList(Arrays.asList(new String[]{"/pagead/adview", "/pcs/view", "/pagead/conversion"}));
    private static final List<String> o = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"}));

    /* renamed from: b  reason: collision with root package name */
    private zzbif f7688b;

    /* renamed from: c  reason: collision with root package name */
    private Context f7689c;

    /* renamed from: d  reason: collision with root package name */
    private zzeg f7690d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public zzbbd f7691e;

    /* renamed from: f  reason: collision with root package name */
    private zzdll<zzcgr> f7692f;
    private final zzdvi g;
    private final ScheduledExecutorService h;
    private zzark i;
    private Point j = new Point();
    private Point k = new Point();

    public zzcxz(zzbif zzbif, Context context, zzeg zzeg, zzbbd zzbbd, zzdll<zzcgr> zzdll, zzdvi zzdvi, ScheduledExecutorService scheduledExecutorService) {
        this.f7688b = zzbif;
        this.f7689c = context;
        this.f7690d = zzeg;
        this.f7691e = zzbbd;
        this.f7692f = zzdll;
        this.g = zzdvi;
        this.h = scheduledExecutorService;
    }

    /* access modifiers changed from: private */
    /* renamed from: A6 */
    public final Uri K6(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        try {
            uri = this.f7690d.b(uri, this.f7689c, (View) ObjectWrapper.P(iObjectWrapper), (Activity) null);
        } catch (zzef e2) {
            zzbba.d("", e2);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    private static Uri B6(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i2 = indexOf + 1;
        return Uri.parse(uri2.substring(0, i2) + str + "=" + str2 + "&" + uri2.substring(i2));
    }

    static /* synthetic */ ArrayList G6(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!O6(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(B6(uri, "nas", str));
            }
        }
        return arrayList;
    }

    private static boolean I6(Uri uri, List<String> list, List<String> list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (!(host == null || path == null)) {
            for (String contains : list) {
                if (path.contains(contains)) {
                    for (String endsWith : list2) {
                        if (host.endsWith(endsWith)) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f5887c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean J6() {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.zzark r0 = r1.i
            if (r0 == 0) goto L_0x0010
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r0 = r0.f5887c
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcxz.J6():boolean");
    }

    static /* synthetic */ Uri M6(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? B6(uri, "nas", str) : uri;
    }

    private final zzdvf<String> N6(String str) {
        zzcgr[] zzcgrArr = new zzcgr[1];
        zzdvf<O> j2 = zzdux.j(this.f7692f.a(), new vq(this, zzcgrArr, str), this.g);
        j2.f(new yq(this, zzcgrArr), this.g);
        return zzduo.H(j2).C((long) ((Integer) zzwg.e().c(zzaav.H3)).intValue(), TimeUnit.MILLISECONDS, this.h).D(tq.f5009a, this.g).E(Exception.class, wq.f5251a, this.g);
    }

    private static boolean O6(Uri uri) {
        return I6(uri, n, o);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf D6(zzcgr[] zzcgrArr, String str, zzcgr zzcgr) throws Exception {
        zzcgrArr[0] = zzcgr;
        Context context = this.f7689c;
        zzark zzark = this.i;
        Map<String, WeakReference<View>> map = zzark.f5887c;
        JSONObject e2 = zzbae.e(context, map, map, zzark.f5886b);
        JSONObject d2 = zzbae.d(this.f7689c, this.i.f5886b);
        JSONObject l2 = zzbae.l(this.i.f5886b);
        JSONObject i2 = zzbae.i(this.f7689c, this.i.f5886b);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", e2);
        jSONObject.put("ad_view_signal", d2);
        jSONObject.put("scroll_view_signal", l2);
        jSONObject.put("lock_screen_signal", i2);
        if (str == "google.afma.nativeAds.getPublisherCustomRenderedClickSignals") {
            jSONObject.put("click_signal", zzbae.f((String) null, this.f7689c, this.k, this.j));
        }
        return zzcgr.i(str, jSONObject);
    }

    public final void E1(List<Uri> list, IObjectWrapper iObjectWrapper, zzaqz zzaqz) {
        try {
            if (!((Boolean) zzwg.e().c(zzaav.G3)).booleanValue()) {
                zzaqz.onError("The updating URL feature is not enabled.");
            } else if (list.size() != 1) {
                zzaqz.onError("There should be only 1 click URL.");
            } else {
                Uri uri = list.get(0);
                if (!I6(uri, l, m)) {
                    String valueOf = String.valueOf(uri);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                    sb.append("Not a Google URL: ");
                    sb.append(valueOf);
                    zzbba.i(sb.toString());
                    zzaqz.k3(list);
                    return;
                }
                zzdvf f2 = this.g.f(new pq(this, uri, iObjectWrapper));
                if (J6()) {
                    f2 = zzdux.j(f2, new sq(this), this.g);
                } else {
                    zzbba.h("Asset view map is empty.");
                }
                zzdux.f(f2, new zq(this, zzaqz), this.f7688b.e());
            }
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }

    public final IObjectWrapper F2(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return null;
    }

    public final void F4(IObjectWrapper iObjectWrapper, zzawx zzawx, zzawq zzawq) {
        Context context = (Context) ObjectWrapper.P(iObjectWrapper);
        this.f7689c = context;
        String str = zzawx.f6006b;
        String str2 = zzawx.f6007c;
        zzvh zzvh = zzawx.f6008d;
        zzve zzve = zzawx.f6009e;
        zzcxw s = this.f7688b.s();
        zzbrx.zza zza = new zzbrx.zza();
        zza.g(context);
        zzdlc zzdlc = new zzdlc();
        if (str == null) {
            str = "adUnitId";
        }
        zzdlc.y(str);
        if (zzve == null) {
            zzve = new zzvd().a();
        }
        zzdlc.A(zzve);
        if (zzvh == null) {
            zzvh = new zzvh();
        }
        zzdlc.r(zzvh);
        zza.c(zzdlc.e());
        zzcxw c2 = s.c(zza.d());
        zzcym.zza zza2 = new zzcym.zza();
        zza2.b(str2);
        zzdux.f(c2.a(new zzcym(zza2)).b(new zzbxa.zza().n()).d().a(), new xq(this, zzawq), this.f7688b.e());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList F6(List list, IObjectWrapper iObjectWrapper) throws Exception {
        String zza = this.f7690d.h() != null ? this.f7690d.h().zza(this.f7689c, (View) ObjectWrapper.P(iObjectWrapper), (Activity) null) : "";
        if (!TextUtils.isEmpty(zza)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (!O6(uri)) {
                    String valueOf = String.valueOf(uri);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                    sb.append("Not a Google URL: ");
                    sb.append(valueOf);
                    zzbba.i(sb.toString());
                    arrayList.add(uri);
                } else {
                    arrayList.add(B6(uri, "ms", zza));
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            throw new Exception("Empty impression URLs result.");
        }
        throw new Exception("Failed to get view signals.");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void H6(zzcgr[] zzcgrArr) {
        if (zzcgrArr[0] != null) {
            this.f7692f.b(zzdux.g(zzcgrArr[0]));
        }
    }

    public final void L2(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzwg.e().c(zzaav.G3)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.P(iObjectWrapper);
            zzark zzark = this.i;
            this.j = zzbae.a(motionEvent, zzark == null ? null : zzark.f5886b);
            if (motionEvent.getAction() == 0) {
                this.k = this.j;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Point point = this.j;
            obtain.setLocation((float) point.x, (float) point.y);
            this.f7690d.d(obtain);
            obtain.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf L6(ArrayList arrayList) throws Exception {
        return zzdux.i(N6("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new rq(this, arrayList), this.g);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf P6(Uri uri) throws Exception {
        return zzdux.i(N6("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new uq(this, uri), this.g);
    }

    public final void R0(List<Uri> list, IObjectWrapper iObjectWrapper, zzaqz zzaqz) {
        if (!((Boolean) zzwg.e().c(zzaav.G3)).booleanValue()) {
            try {
                zzaqz.onError("The updating URL feature is not enabled.");
            } catch (RemoteException e2) {
                zzbba.c("", e2);
            }
        } else {
            zzdvf f2 = this.g.f(new oq(this, list, iObjectWrapper));
            if (J6()) {
                f2 = zzdux.j(f2, new qq(this), this.g);
            } else {
                zzbba.h("Asset view map is empty.");
            }
            zzdux.f(f2, new ar(this, zzaqz), this.f7688b.e());
        }
    }

    public final void i4(zzark zzark) {
        this.i = zzark;
        this.f7692f.c(1);
    }

    public final IObjectWrapper k0(IObjectWrapper iObjectWrapper) {
        return null;
    }
}
