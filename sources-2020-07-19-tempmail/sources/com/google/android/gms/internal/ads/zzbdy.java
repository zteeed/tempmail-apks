package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbdy implements zzhd, zzmw, zzoy<zzok>, zzqf {
    @VisibleForTesting
    private static int n;
    @VisibleForTesting
    private static int o;

    /* renamed from: b  reason: collision with root package name */
    private final Context f6203b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbdv f6204c;

    /* renamed from: d  reason: collision with root package name */
    private final zzhv f6205d;

    /* renamed from: e  reason: collision with root package name */
    private final zzhv f6206e;

    /* renamed from: f  reason: collision with root package name */
    private final zzny f6207f;
    private final zzbdc g;
    private zzhe h;
    private ByteBuffer i;
    private boolean j;
    private zzbef k;
    private int l;
    private Set<WeakReference<c8>> m = new HashSet();

    public zzbdy(Context context, zzbdc zzbdc) {
        this.f6203b = context;
        this.g = zzbdc;
        this.f6204c = new zzbdv();
        this.f6205d = new zzpz(this.f6203b, zzlu.f8852a, 0, zzaye.h, this, -1);
        this.f6206e = new zziz(zzlu.f8852a);
        this.f6207f = new zznx();
        if (zzaxv.n()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("ExoPlayerAdapter initialize ");
            sb.append(valueOf);
            zzaxv.m(sb.toString());
        }
        n++;
        zzhe a2 = zzhi.a(new zzhv[]{this.f6206e, this.f6205d}, this.f6207f, this.f6204c);
        this.h = a2;
        a2.f(this);
    }

    public static int A() {
        return n;
    }

    public static int B() {
        return o;
    }

    @VisibleForTesting
    private final zznb E(Uri uri, String str) {
        zzon zzon;
        zzjy zzjy;
        if (!this.j || this.i.limit() <= 0) {
            if (this.g.h > 0) {
                zzon = new h8(this, str);
            } else {
                zzon = new g8(this, str);
            }
            if (this.g.i) {
                zzon = new j8(this, zzon);
            }
            if (this.i.limit() > 0) {
                byte[] bArr = new byte[this.i.limit()];
                this.i.get(bArr);
                zzon = new i8(zzon, bArr);
            }
        } else {
            byte[] bArr2 = new byte[this.i.limit()];
            this.i.get(bArr2);
            zzon = new f8(bArr2);
        }
        zzon zzon2 = zzon;
        if (((Boolean) zzwg.e().c(zzaav.l)).booleanValue()) {
            zzjy = l8.f4276a;
        } else {
            zzjy = k8.f4187a;
        }
        zzjy zzjy2 = zzjy;
        zzbdc zzbdc = this.g;
        return new zzmx(uri, zzon2, zzjy2, zzbdc.j, zzaye.h, this, (String) null, zzbdc.f6175f);
    }

    public final zzbdv C() {
        return this.f6204c;
    }

    /* access modifiers changed from: package-private */
    public final void D(boolean z) {
        if (this.h != null) {
            for (int i2 = 0; i2 < this.h.c(); i2++) {
                this.f6207f.f(i2, !z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void F(float f2, boolean z) {
        if (this.h != null) {
            zzhf zzhf = new zzhf(this.f6206e, 2, Float.valueOf(f2));
            if (z) {
                this.h.d(zzhf);
                return;
            }
            this.h.e(zzhf);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void G(boolean z, long j2) {
        zzbef zzbef = this.k;
        if (zzbef != null) {
            zzbef.a(z, j2);
        }
    }

    public final void H(int i2) {
        for (WeakReference<c8> weakReference : this.m) {
            c8 c8Var = (c8) weakReference.get();
            if (c8Var != null) {
                c8Var.b(i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzok I(String str) {
        zzbdy zzbdy = this.g.i ? null : this;
        zzbdc zzbdc = this.g;
        return new zzor(str, (zzpk<String>) null, zzbdy, zzbdc.f6173d, zzbdc.f6174e, true, (zzos) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzok J(String str) {
        zzbdy zzbdy = this.g.i ? null : this;
        zzbdc zzbdc = this.g;
        c8 c8Var = new c8(str, zzbdy, zzbdc.f6173d, zzbdc.f6174e, zzbdc.h);
        this.m.add(new WeakReference(c8Var));
        return c8Var;
    }

    public final void a() {
    }

    public final void b(String str, long j2, long j3) {
    }

    public final void c(zzjj zzjj) {
    }

    public final /* bridge */ /* synthetic */ void d(Object obj) {
    }

    public final void e(IOException iOException) {
        zzbef zzbef = this.k;
        if (zzbef != null) {
            zzbef.e("onLoadError", iOException);
        }
    }

    public final void f(zzjj zzjj) {
    }

    public final void finalize() throws Throwable {
        n--;
        if (zzaxv.n()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("ExoPlayerAdapter finalize ");
            sb.append(valueOf);
            zzaxv.m(sb.toString());
        }
    }

    public final void g(zzhb zzhb) {
        zzbef zzbef = this.k;
        if (zzbef != null) {
            zzbef.e("onPlayerError", zzhb);
        }
    }

    public final void h(zzia zzia, Object obj) {
    }

    public final void i(zzhq zzhq) {
    }

    public final void j(boolean z, int i2) {
        zzbef zzbef = this.k;
        if (zzbef != null) {
            zzbef.f(i2);
        }
    }

    public final void k(Surface surface) {
    }

    public final void l(int i2, long j2) {
    }

    public final void m(int i2, int i3, int i4, float f2) {
        zzbef zzbef = this.k;
        if (zzbef != null) {
            zzbef.b(i2, i3);
        }
    }

    public final /* synthetic */ void n(Object obj, zzop zzop) {
        this.l = 0;
    }

    public final void o(zzhw zzhw) {
    }

    public final void p(boolean z) {
    }

    public final /* synthetic */ void q(Object obj, int i2) {
        this.l += i2;
    }

    public final void r(zznr zznr, zzof zzof) {
    }

    public final long s() {
        return (long) this.l;
    }

    public final void t() {
        zzhe zzhe = this.h;
        if (zzhe != null) {
            zzhe.i(this);
            this.h.release();
            this.h = null;
            o--;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzok u(zzon zzon) {
        return new zzbdt(this.f6203b, zzon.a(), this, new m8(this));
    }

    /* access modifiers changed from: package-private */
    public final void v(Surface surface, boolean z) {
        if (this.h != null) {
            zzhf zzhf = new zzhf(this.f6205d, 1, surface);
            if (z) {
                this.h.d(zzhf);
                return;
            }
            this.h.e(zzhf);
        }
    }

    public final void w(zzbef zzbef) {
        this.k = zzbef;
    }

    public final void x(Uri[] uriArr, String str) {
        y(uriArr, str, ByteBuffer.allocate(0), false);
    }

    public final void y(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zznb zznb;
        if (this.h != null) {
            this.i = byteBuffer;
            this.j = z;
            if (uriArr.length == 1) {
                zznb = E(uriArr[0], str);
            } else {
                zznb[] zznbArr = new zznb[uriArr.length];
                for (int i2 = 0; i2 < uriArr.length; i2++) {
                    zznbArr[i2] = E(uriArr[i2], str);
                }
                zznb = new zznc(zznbArr);
            }
            this.h.a(zznb);
            o++;
        }
    }

    public final zzhe z() {
        return this.h;
    }
}
