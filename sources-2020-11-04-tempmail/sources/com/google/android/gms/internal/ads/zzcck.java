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
    private int f7014a;

    /* renamed from: b  reason: collision with root package name */
    private zzyi f7015b;

    /* renamed from: c  reason: collision with root package name */
    private zzadl f7016c;

    /* renamed from: d  reason: collision with root package name */
    private View f7017d;

    /* renamed from: e  reason: collision with root package name */
    private List<?> f7018e;

    /* renamed from: f  reason: collision with root package name */
    private List<zzza> f7019f = Collections.emptyList();
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
        return ObjectWrapper.V(iObjectWrapper);
    }

    public static zzcck N(zzana zzana) {
        try {
            return t(u(zzana.getVideoController(), (zzang) null), zzana.g(), (View) M(zzana.z()), zzana.e(), zzana.k(), zzana.j(), zzana.getExtras(), zzana.i(), (View) M(zzana.x()), zzana.f(), zzana.r(), zzana.n(), zzana.p(), zzana.m(), (String) null, 0.0f);
        } catch (RemoteException e2) {
            zzbba.d("Failed to get native ad assets from app install ad mapper", e2);
            return null;
        }
    }

    public static zzcck O(zzanf zzanf) {
        try {
            return t(u(zzanf.getVideoController(), (zzang) null), zzanf.g(), (View) M(zzanf.z()), zzanf.e(), zzanf.k(), zzanf.j(), zzanf.getExtras(), zzanf.i(), (View) M(zzanf.x()), zzanf.f(), (String) null, (String) null, -1.0d, zzanf.n0(), zzanf.q(), 0.0f);
        } catch (RemoteException e2) {
            zzbba.d("Failed to get native ad assets from content ad mapper", e2);
            return null;
        }
    }

    public static zzcck P(zzang zzang) {
        try {
            return t(u(zzang.getVideoController(), zzang), zzang.g(), (View) M(zzang.z()), zzang.e(), zzang.k(), zzang.j(), zzang.getExtras(), zzang.i(), (View) M(zzang.x()), zzang.f(), zzang.r(), zzang.n(), zzang.p(), zzang.m(), zzang.q(), zzang.W0());
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
            zzadl g2 = zzana.g();
            String e2 = zzana.e();
            List<?> k2 = zzana.k();
            String j2 = zzana.j();
            Bundle extras = zzana.getExtras();
            String i2 = zzana.i();
            IObjectWrapper f2 = zzana.f();
            String r2 = zzana.r();
            String n2 = zzana.n();
            double p2 = zzana.p();
            zzadt m2 = zzana.m();
            zzcck zzcck = new zzcck();
            zzcck.f7014a = 2;
            zzcck.f7015b = u2;
            zzcck.f7016c = g2;
            zzcck.f7017d = (View) M(zzana.z());
            zzcck.Z("headline", e2);
            zzcck.f7018e = k2;
            zzcck.Z("body", j2);
            zzcck.h = extras;
            zzcck.Z("call_to_action", i2);
            zzcck.l = (View) M(zzana.x());
            zzcck.m = f2;
            zzcck.Z("store", r2);
            zzcck.Z("price", n2);
            zzcck.n = p2;
            zzcck.o = m2;
            return zzcck;
        } catch (RemoteException e3) {
            zzbba.d("Failed to get native ad from app install ad mapper", e3);
            return null;
        }
    }

    public static zzcck s(zzanf zzanf) {
        try {
            zzccl u2 = u(zzanf.getVideoController(), (zzang) null);
            zzadl g2 = zzanf.g();
            String e2 = zzanf.e();
            List<?> k2 = zzanf.k();
            String j2 = zzanf.j();
            Bundle extras = zzanf.getExtras();
            String i2 = zzanf.i();
            IObjectWrapper f2 = zzanf.f();
            String q2 = zzanf.q();
            zzadt n0 = zzanf.n0();
            zzcck zzcck = new zzcck();
            zzcck.f7014a = 1;
            zzcck.f7015b = u2;
            zzcck.f7016c = g2;
            zzcck.f7017d = (View) M(zzanf.z());
            zzcck.Z("headline", e2);
            zzcck.f7018e = k2;
            zzcck.Z("body", j2);
            zzcck.h = extras;
            zzcck.Z("call_to_action", i2);
            zzcck.l = (View) M(zzanf.x());
            zzcck.m = f2;
            zzcck.Z("advertiser", q2);
            zzcck.p = n0;
            return zzcck;
        } catch (RemoteException e3) {
            zzbba.d("Failed to get native ad from content ad mapper", e3);
            return null;
        }
    }

    private static zzcck t(zzyi zzyi, zzadl zzadl, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d2, zzadt zzadt, String str6, float f2) {
        zzcck zzcck = new zzcck();
        zzcck.f7014a = 6;
        zzcck.f7015b = zzyi;
        zzcck.f7016c = zzadl;
        zzcck.f7017d = view;
        String str7 = str;
        zzcck.Z("headline", str);
        zzcck.f7018e = list;
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
        return this.f7014a;
    }

    public final synchronized View B() {
        return this.f7017d;
    }

    public final zzadt C() {
        List<?> list = this.f7018e;
        if (!(list == null || list.size() == 0)) {
            Object obj = this.f7018e.get(0);
            if (obj instanceof IBinder) {
                return zzads.e7((IBinder) obj);
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
        this.f7015b = zzyi;
    }

    public final synchronized void S(int i2) {
        this.f7014a = i2;
    }

    public final synchronized void T(String str) {
        this.q = str;
    }

    public final synchronized void U(String str) {
        this.u = str;
    }

    public final synchronized void W(List<zzza> list) {
        this.f7019f = list;
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
        this.f7015b = null;
        this.f7016c = null;
        this.f7017d = null;
        this.f7018e = null;
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
        return this.f7016c;
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
        return this.f7018e;
    }

    public final synchronized float i() {
        return this.t;
    }

    public final synchronized List<zzza> j() {
        return this.f7019f;
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
        return this.f7015b;
    }

    public final synchronized void o(List<zzadf> list) {
        this.f7018e = list;
    }

    public final synchronized void q(double d2) {
        this.n = d2;
    }

    public final synchronized void v(zzadl zzadl) {
        this.f7016c = zzadl;
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
