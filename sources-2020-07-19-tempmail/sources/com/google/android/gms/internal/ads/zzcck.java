package com.google.android.gms.internal.ads;

import a.e.g;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcck {

    /* renamed from: a  reason: collision with root package name */
    private int f6831a;

    /* renamed from: b  reason: collision with root package name */
    private zzyi f6832b;

    /* renamed from: c  reason: collision with root package name */
    private zzadl f6833c;

    /* renamed from: d  reason: collision with root package name */
    private View f6834d;

    /* renamed from: e  reason: collision with root package name */
    private List<?> f6835e;

    /* renamed from: f  reason: collision with root package name */
    private List<zzza> f6836f = Collections.emptyList();
    private zzza g;
    private Bundle h;
    private zzbfn i;
    private zzbfn j;
    private IObjectWrapper k;
    private View l;
    private IObjectWrapper m;
    private double n;
    private zzadt o;
    private zzadt p;
    private String q;
    private g<String, zzadf> r = new g<>();
    private g<String, String> s = new g<>();
    private float t;
    private String u;

    private static <T> T M(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.P(iObjectWrapper);
    }

    public static zzcck N(zzana zzana) {
        try {
            return t(u(zzana.getVideoController(), (zzang) null), zzana.f(), (View) M(zzana.w()), zzana.d(), zzana.j(), zzana.i(), zzana.getExtras(), zzana.h(), (View) M(zzana.v()), zzana.e(), zzana.p(), zzana.l(), zzana.n(), zzana.k(), (String) null, 0.0f);
        } catch (RemoteException e2) {
            zzbba.d("Failed to get native ad assets from app install ad mapper", e2);
            return null;
        }
    }

    public static zzcck O(zzanf zzanf) {
        try {
            return t(u(zzanf.getVideoController(), (zzang) null), zzanf.f(), (View) M(zzanf.w()), zzanf.d(), zzanf.j(), zzanf.i(), zzanf.getExtras(), zzanf.h(), (View) M(zzanf.v()), zzanf.e(), (String) null, (String) null, -1.0d, zzanf.h0(), zzanf.o(), 0.0f);
        } catch (RemoteException e2) {
            zzbba.d("Failed to get native ad assets from content ad mapper", e2);
            return null;
        }
    }

    public static zzcck P(zzang zzang) {
        try {
            return t(u(zzang.getVideoController(), zzang), zzang.f(), (View) M(zzang.w()), zzang.d(), zzang.j(), zzang.i(), zzang.getExtras(), zzang.h(), (View) M(zzang.v()), zzang.e(), zzang.p(), zzang.l(), zzang.n(), zzang.k(), zzang.o(), zzang.P0());
        } catch (RemoteException e2) {
            zzbba.d("Failed to get native ad assets from unified ad mapper", e2);
            return null;
        }
    }

    private final synchronized String V(String str) {
        return this.s.get(str);
    }

    private final synchronized void p(float f2) {
        this.t = f2;
    }

    public static zzcck r(zzana zzana) {
        try {
            zzccl u2 = u(zzana.getVideoController(), (zzang) null);
            zzadl f2 = zzana.f();
            String d2 = zzana.d();
            List<?> j2 = zzana.j();
            String i2 = zzana.i();
            Bundle extras = zzana.getExtras();
            String h2 = zzana.h();
            IObjectWrapper e2 = zzana.e();
            String p2 = zzana.p();
            String l2 = zzana.l();
            double n2 = zzana.n();
            zzadt k2 = zzana.k();
            zzcck zzcck = new zzcck();
            zzcck.f6831a = 2;
            zzcck.f6832b = u2;
            zzcck.f6833c = f2;
            zzcck.f6834d = (View) M(zzana.w());
            zzcck.Z("headline", d2);
            zzcck.f6835e = j2;
            zzcck.Z("body", i2);
            zzcck.h = extras;
            zzcck.Z("call_to_action", h2);
            zzcck.l = (View) M(zzana.v());
            zzcck.m = e2;
            zzcck.Z("store", p2);
            zzcck.Z("price", l2);
            zzcck.n = n2;
            zzcck.o = k2;
            return zzcck;
        } catch (RemoteException e3) {
            zzbba.d("Failed to get native ad from app install ad mapper", e3);
            return null;
        }
    }

    public static zzcck s(zzanf zzanf) {
        try {
            zzccl u2 = u(zzanf.getVideoController(), (zzang) null);
            zzadl f2 = zzanf.f();
            String d2 = zzanf.d();
            List<?> j2 = zzanf.j();
            String i2 = zzanf.i();
            Bundle extras = zzanf.getExtras();
            String h2 = zzanf.h();
            IObjectWrapper e2 = zzanf.e();
            String o2 = zzanf.o();
            zzadt h0 = zzanf.h0();
            zzcck zzcck = new zzcck();
            zzcck.f6831a = 1;
            zzcck.f6832b = u2;
            zzcck.f6833c = f2;
            zzcck.f6834d = (View) M(zzanf.w());
            zzcck.Z("headline", d2);
            zzcck.f6835e = j2;
            zzcck.Z("body", i2);
            zzcck.h = extras;
            zzcck.Z("call_to_action", h2);
            zzcck.l = (View) M(zzanf.v());
            zzcck.m = e2;
            zzcck.Z("advertiser", o2);
            zzcck.p = h0;
            return zzcck;
        } catch (RemoteException e3) {
            zzbba.d("Failed to get native ad from content ad mapper", e3);
            return null;
        }
    }

    private static zzcck t(zzyi zzyi, zzadl zzadl, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d2, zzadt zzadt, String str6, float f2) {
        zzcck zzcck = new zzcck();
        zzcck.f6831a = 6;
        zzcck.f6832b = zzyi;
        zzcck.f6833c = zzadl;
        zzcck.f6834d = view;
        String str7 = str;
        zzcck.Z("headline", str);
        zzcck.f6835e = list;
        String str8 = str2;
        zzcck.Z("body", str2);
        zzcck.h = bundle;
        String str9 = str3;
        zzcck.Z("call_to_action", str3);
        zzcck.l = view2;
        zzcck.m = iObjectWrapper;
        String str10 = str4;
        zzcck.Z("store", str4);
        String str11 = str5;
        zzcck.Z("price", str5);
        zzcck.n = d2;
        zzcck.o = zzadt;
        zzcck.Z("advertiser", str6);
        zzcck.p(f2);
        return zzcck;
    }

    private static zzccl u(zzyi zzyi, zzang zzang) {
        if (zzyi == null) {
            return null;
        }
        return new zzccl(zzyi, zzang);
    }

    public final synchronized int A() {
        return this.f6831a;
    }

    public final synchronized View B() {
        return this.f6834d;
    }

    public final zzadt C() {
        List<?> list = this.f6835e;
        if (!(list == null || list.size() == 0)) {
            Object obj = this.f6835e.get(0);
            if (obj instanceof IBinder) {
                return zzads.z6((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized zzza D() {
        return this.g;
    }

    public final synchronized View E() {
        return this.l;
    }

    public final synchronized zzbfn F() {
        return this.i;
    }

    public final synchronized zzbfn G() {
        return this.j;
    }

    public final synchronized IObjectWrapper H() {
        return this.k;
    }

    public final synchronized g<String, zzadf> I() {
        return this.r;
    }

    public final synchronized String J() {
        return this.u;
    }

    public final synchronized g<String, String> K() {
        return this.s;
    }

    public final synchronized void L(IObjectWrapper iObjectWrapper) {
        this.k = iObjectWrapper;
    }

    public final synchronized void Q(zzadt zzadt) {
        this.p = zzadt;
    }

    public final synchronized void R(zzyi zzyi) {
        this.f6832b = zzyi;
    }

    public final synchronized void S(int i2) {
        this.f6831a = i2;
    }

    public final synchronized void T(String str) {
        this.q = str;
    }

    public final synchronized void U(String str) {
        this.u = str;
    }

    public final synchronized void W(List<zzza> list) {
        this.f6836f = list;
    }

    public final synchronized void X(zzbfn zzbfn) {
        this.i = zzbfn;
    }

    public final synchronized void Y(zzbfn zzbfn) {
        this.j = zzbfn;
    }

    public final synchronized void Z(String str, String str2) {
        if (str2 == null) {
            this.s.remove(str);
        } else {
            this.s.put(str, str2);
        }
    }

    public final synchronized void a() {
        if (this.i != null) {
            this.i.destroy();
            this.i = null;
        }
        if (this.j != null) {
            this.j.destroy();
            this.j = null;
        }
        this.k = null;
        this.r.clear();
        this.s.clear();
        this.f6832b = null;
        this.f6833c = null;
        this.f6834d = null;
        this.f6835e = null;
        this.h = null;
        this.l = null;
        this.m = null;
        this.o = null;
        this.p = null;
        this.q = null;
    }

    public final synchronized zzadt a0() {
        return this.o;
    }

    public final synchronized String b() {
        return V("advertiser");
    }

    public final synchronized zzadl b0() {
        return this.f6833c;
    }

    public final synchronized String c() {
        return V("body");
    }

    public final synchronized IObjectWrapper c0() {
        return this.m;
    }

    public final synchronized String d() {
        return V("call_to_action");
    }

    public final synchronized zzadt d0() {
        return this.p;
    }

    public final synchronized String e() {
        return this.q;
    }

    public final synchronized Bundle f() {
        if (this.h == null) {
            this.h = new Bundle();
        }
        return this.h;
    }

    public final synchronized String g() {
        return V("headline");
    }

    public final synchronized List<?> h() {
        return this.f6835e;
    }

    public final synchronized float i() {
        return this.t;
    }

    public final synchronized List<zzza> j() {
        return this.f6836f;
    }

    public final synchronized String k() {
        return V("price");
    }

    public final synchronized double l() {
        return this.n;
    }

    public final synchronized String m() {
        return V("store");
    }

    public final synchronized zzyi n() {
        return this.f6832b;
    }

    public final synchronized void o(List<zzadf> list) {
        this.f6835e = list;
    }

    public final synchronized void q(double d2) {
        this.n = d2;
    }

    public final synchronized void v(zzadl zzadl) {
        this.f6833c = zzadl;
    }

    public final synchronized void w(zzadt zzadt) {
        this.o = zzadt;
    }

    public final synchronized void x(zzza zzza) {
        this.g = zzza;
    }

    public final synchronized void y(String str, zzadf zzadf) {
        if (zzadf == null) {
            this.r.remove(str);
        } else {
            this.r.put(str, zzadf);
        }
    }

    public final synchronized void z(View view) {
        this.l = view;
    }
}
