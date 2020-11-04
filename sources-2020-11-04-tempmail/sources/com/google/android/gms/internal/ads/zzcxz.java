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
    private zzbif f7871b;

    /* renamed from: c  reason: collision with root package name */
    private Context f7872c;

    /* renamed from: d  reason: collision with root package name */
    private zzeg f7873d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public zzbbd f7874e;

    /* renamed from: f  reason: collision with root package name */
    private zzdll<zzcgr> f7875f;
    private final zzdvi g;
    private final ScheduledExecutorService h;
    private zzark i;
    private Point j = new Point();
    private Point k = new Point();

    public zzcxz(zzbif zzbif, Context context, zzeg zzeg, zzbbd zzbbd, zzdll<zzcgr> zzdll, zzdvi zzdvi, ScheduledExecutorService scheduledExecutorService) {
        this.f7871b = zzbif;
        this.f7872c = context;
        this.f7873d = zzeg;
        this.f7874e = zzbbd;
        this.f7875f = zzdll;
        this.g = zzdvi;
        this.h = scheduledExecutorService;
    }

    /* access modifiers changed from: private */
    /* renamed from: f7 */
    public final Uri p7(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        try {
            uri = this.f7873d.b(uri, this.f7872c, (View) ObjectWrapper.V(iObjectWrapper), (Activity) null);
        } catch (zzef e2) {
            zzbba.d("", e2);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    private static Uri g7(Uri uri, String str, String str2) {
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

    static /* synthetic */ ArrayList l7(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!t7(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(g7(uri, "nas", str));
            }
        }
        return arrayList;
    }

    private static boolean n7(Uri uri, List<String> list, List<String> list2) {
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
        r0 = r0.f6070c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean o7() {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.zzark r0 = r1.i
            if (r0 == 0) goto L_0x0010
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r0 = r0.f6070c
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcxz.o7():boolean");
    }

    static /* synthetic */ Uri r7(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? g7(uri, "nas", str) : uri;
    }

    private final zzdvf<String> s7(String str) {
        zzcgr[] zzcgrArr = new zzcgr[1];
        zzdvf<O> j2 = zzdux.j(this.f7875f.a(), new vq(this, zzcgrArr, str), this.g);
        j2.f(new yq(this, zzcgrArr), this.g);
        return zzduo.H(j2).C((long) ((Integer) zzwg.e().c(zzaav.H3)).intValue(), TimeUnit.MILLISECONDS, this.h).D(tq.f5192a, this.g).E(Exception.class, wq.f5434a, this.g);
    }

    private static boolean t7(Uri uri) {
        return n7(uri, n, o);
    }

    public final void C4(zzark zzark) {
        this.i = zzark;
        this.f7875f.c(1);
    }

    public final void N1(List<Uri> list, IObjectWrapper iObjectWrapper, zzaqz zzaqz) {
        try {
            if (!((Boolean) zzwg.e().c(zzaav.G3)).booleanValue()) {
                zzaqz.onError("The updating URL feature is not enabled.");
            } else if (list.size() != 1) {
                zzaqz.onError("There should be only 1 click URL.");
            } else {
                Uri uri = list.get(0);
                if (!n7(uri, l, m)) {
                    String valueOf = String.valueOf(uri);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                    sb.append("Not a Google URL: ");
                    sb.append(valueOf);
                    zzbba.i(sb.toString());
                    zzaqz.A3(list);
                    return;
                }
                zzdvf f2 = this.g.f(new pq(this, uri, iObjectWrapper));
                if (o7()) {
                    f2 = zzdux.j(f2, new sq(this), this.g);
                } else {
                    zzbba.h("Asset view map is empty.");
                }
                zzdux.f(f2, new zq(this, zzaqz), this.f7871b.e());
            }
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }

    public final IObjectWrapper Q2(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return null;
    }

    public final void X2(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzwg.e().c(zzaav.G3)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.V(iObjectWrapper);
            zzark zzark = this.i;
            this.j = zzbae.a(motionEvent, zzark == null ? null : zzark.f6069b);
            if (motionEvent.getAction() == 0) {
                this.k = this.j;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Point point = this.j;
            obtain.setLocation((float) point.x, (float) point.y);
            this.f7873d.d(obtain);
            obtain.recycle();
        }
    }

    public final void Y0(List<Uri> list, IObjectWrapper iObjectWrapper, zzaqz zzaqz) {
        if (!((Boolean) zzwg.e().c(zzaav.G3)).booleanValue()) {
            try {
                zzaqz.onError("The updating URL feature is not enabled.");
            } catch (RemoteException e2) {
                zzbba.c("", e2);
            }
        } else {
            zzdvf f2 = this.g.f(new oq(this, list, iObjectWrapper));
            if (o7()) {
                f2 = zzdux.j(f2, new qq(this), this.g);
            } else {
                zzbba.h("Asset view map is empty.");
            }
            zzdux.f(f2, new ar(this, zzaqz), this.f7871b.e());
        }
    }

    public final void Z4(IObjectWrapper iObjectWrapper, zzawx zzawx, zzawq zzawq) {
        Context context = (Context) ObjectWrapper.V(iObjectWrapper);
        this.f7872c = context;
        String str = zzawx.f6189b;
        String str2 = zzawx.f6190c;
        zzvh zzvh = zzawx.f6191d;
        zzve zzve = zzawx.f6192e;
        zzcxw s = this.f7871b.s();
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
        zzdux.f(c2.a(new zzcym(zza2)).b(new zzbxa.zza().n()).d().a(), new xq(this, zzawq), this.f7871b.e());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf i7(zzcgr[] zzcgrArr, String str, zzcgr zzcgr) throws Exception {
        zzcgrArr[0] = zzcgr;
        Context context = this.f7872c;
        zzark zzark = this.i;
        Map<String, WeakReference<View>> map = zzark.f6070c;
        JSONObject e2 = zzbae.e(context, map, map, zzark.f6069b);
        JSONObject d2 = zzbae.d(this.f7872c, this.i.f6069b);
        JSONObject l2 = zzbae.l(this.i.f6069b);
        JSONObject i2 = zzbae.i(this.f7872c, this.i.f6069b);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", e2);
        jSONObject.put("ad_view_signal", d2);
        jSONObject.put("scroll_view_signal", l2);
        jSONObject.put("lock_screen_signal", i2);
        if (str == "google.afma.nativeAds.getPublisherCustomRenderedClickSignals") {
            jSONObject.put("click_signal", zzbae.f((String) null, this.f7872c, this.k, this.j));
        }
        return zzcgr.i(str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList k7(List list, IObjectWrapper iObjectWrapper) throws Exception {
        String zza = this.f7873d.h() != null ? this.f7873d.h().zza(this.f7872c, (View) ObjectWrapper.V(iObjectWrapper), (Activity) null) : "";
        if (!TextUtils.isEmpty(zza)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (!t7(uri)) {
                    String valueOf = String.valueOf(uri);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                    sb.append("Not a Google URL: ");
                    sb.append(valueOf);
                    zzbba.i(sb.toString());
                    arrayList.add(uri);
                } else {
                    arrayList.add(g7(uri, "ms", zza));
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
    public final /* synthetic */ void m7(zzcgr[] zzcgrArr) {
        if (zzcgrArr[0] != null) {
            this.f7875f.b(zzdux.g(zzcgrArr[0]));
        }
    }

    public final IObjectWrapper q0(IObjectWrapper iObjectWrapper) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf q7(ArrayList arrayList) throws Exception {
        return zzdux.i(s7("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new rq(this, arrayList), this.g);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf u7(Uri uri) throws Exception {
        return zzdux.i(s7("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new uq(this, uri), this.g);
    }
}
