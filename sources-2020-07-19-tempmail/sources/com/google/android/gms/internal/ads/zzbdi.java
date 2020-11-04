package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.zzq;
import java.nio.ByteBuffer;
import java.util.Arrays;

@TargetApi(16)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbdi extends zzbcm implements TextureView.SurfaceTextureListener, zzbef {

    /* renamed from: d  reason: collision with root package name */
    private final zzbdb f6188d;

    /* renamed from: e  reason: collision with root package name */
    private final zzbde f6189e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f6190f;
    private final zzbdc g;
    private zzbcj h;
    private Surface i;
    private zzbdy j;
    private String k;
    private String[] l;
    private boolean m;
    private int n = 1;
    private zzbcz o;
    private final boolean p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private int u;
    private int v;
    private float w;

    public zzbdi(Context context, zzbde zzbde, zzbdb zzbdb, boolean z, boolean z2, zzbdc zzbdc) {
        super(context);
        this.f6190f = z2;
        this.f6188d = zzbdb;
        this.f6189e = zzbde;
        this.p = z;
        this.g = zzbdc;
        setSurfaceTextureListener(this);
        this.f6189e.b(this);
    }

    private final void I(int i2, int i3) {
        float f2 = i3 > 0 ? ((float) i2) / ((float) i3) : 1.0f;
        if (this.w != f2) {
            this.w = f2;
            requestLayout();
        }
    }

    private final zzbdy K() {
        return new zzbdy(this.f6188d.getContext(), this.g);
    }

    private final String L() {
        return zzq.zzkw().m0(this.f6188d.getContext(), this.f6188d.a().f6131b);
    }

    private final boolean M() {
        zzbdy zzbdy = this.j;
        return (zzbdy == null || zzbdy.z() == null || this.m) ? false : true;
    }

    private final boolean N() {
        return M() && this.n != 1;
    }

    private final void s(float f2, boolean z) {
        zzbdy zzbdy = this.j;
        if (zzbdy != null) {
            zzbdy.F(f2, z);
        } else {
            zzbba.i("Trying to set volume before player is initalized.");
        }
    }

    private final void t(Surface surface, boolean z) {
        zzbdy zzbdy = this.j;
        if (zzbdy != null) {
            zzbdy.v(surface, z);
        } else {
            zzbba.i("Trying to set surface before player is initalized.");
        }
    }

    private final void u() {
        String str;
        if (this.j == null && (str = this.k) != null && this.i != null) {
            if (str.startsWith("cache:")) {
                zzbes O = this.f6188d.O(this.k);
                if (O instanceof zzbfd) {
                    zzbdy y = ((zzbfd) O).y();
                    this.j = y;
                    if (y.z() == null) {
                        zzbba.i("Precached video player has been released.");
                        return;
                    }
                } else if (O instanceof zzbfe) {
                    zzbfe zzbfe = (zzbfe) O;
                    String L = L();
                    ByteBuffer y2 = zzbfe.y();
                    boolean A = zzbfe.A();
                    String z = zzbfe.z();
                    if (z == null) {
                        zzbba.i("Stream cache URL is null.");
                        return;
                    }
                    zzbdy K = K();
                    this.j = K;
                    K.y(new Uri[]{Uri.parse(z)}, L, y2, A);
                } else {
                    String valueOf = String.valueOf(this.k);
                    zzbba.i(valueOf.length() != 0 ? "Stream cache miss: ".concat(valueOf) : new String("Stream cache miss: "));
                    return;
                }
            } else {
                this.j = K();
                String L2 = L();
                Uri[] uriArr = new Uri[this.l.length];
                int i2 = 0;
                while (true) {
                    String[] strArr = this.l;
                    if (i2 >= strArr.length) {
                        break;
                    }
                    uriArr[i2] = Uri.parse(strArr[i2]);
                    i2++;
                }
                this.j.x(uriArr, L2);
            }
            this.j.w(this);
            t(this.i, false);
            if (this.j.z() != null) {
                int playbackState = this.j.z().getPlaybackState();
                this.n = playbackState;
                if (playbackState == 3) {
                    v();
                }
            }
        }
    }

    private final void v() {
        if (!this.q) {
            this.q = true;
            zzaye.h.post(new t7(this));
            c();
            this.f6189e.d();
            if (this.r) {
                g();
            }
        }
    }

    private final void w() {
        I(this.s, this.t);
    }

    private final void x() {
        zzbdy zzbdy = this.j;
        if (zzbdy != null) {
            zzbdy.D(true);
        }
    }

    private final void y() {
        zzbdy zzbdy = this.j;
        if (zzbdy != null) {
            zzbdy.D(false);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void A() {
        zzbcj zzbcj = this.h;
        if (zzbcj != null) {
            zzbcj.h();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void B() {
        zzbcj zzbcj = this.h;
        if (zzbcj != null) {
            zzbcj.f();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void C() {
        zzbcj zzbcj = this.h;
        if (zzbcj != null) {
            zzbcj.g();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void D() {
        zzbcj zzbcj = this.h;
        if (zzbcj != null) {
            zzbcj.d();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void E() {
        zzbcj zzbcj = this.h;
        if (zzbcj != null) {
            zzbcj.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void F(boolean z, long j2) {
        this.f6188d.V(z, j2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void G(int i2) {
        zzbcj zzbcj = this.h;
        if (zzbcj != null) {
            zzbcj.onWindowVisibilityChanged(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void H(String str) {
        zzbcj zzbcj = this.h;
        if (zzbcj != null) {
            zzbcj.e("ExoPlayerAdapter error", str);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void J(int i2, int i3) {
        zzbcj zzbcj = this.h;
        if (zzbcj != null) {
            zzbcj.c(i2, i3);
        }
    }

    public final void a(boolean z, long j2) {
        if (this.f6188d != null) {
            zzbbf.f6141e.execute(new d8(this, z, j2));
        }
    }

    public final void b(int i2, int i3) {
        this.s = i2;
        this.t = i3;
        w();
    }

    public final void c() {
        s(this.f6151c.a(), false);
    }

    public final void d() {
        if (N()) {
            if (this.g.f6170a) {
                y();
            }
            this.j.z().j(false);
            this.f6189e.f();
            this.f6151c.e();
            zzaye.h.post(new w7(this));
        }
    }

    public final void e(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        String sb2 = sb.toString();
        String valueOf = String.valueOf(sb2);
        zzbba.i(valueOf.length() != 0 ? "ExoPlayerAdapter error: ".concat(valueOf) : new String("ExoPlayerAdapter error: "));
        this.m = true;
        if (this.g.f6170a) {
            y();
        }
        zzaye.h.post(new u7(this, sb2));
    }

    public final void f(int i2) {
        if (this.n != i2) {
            this.n = i2;
            if (i2 == 3) {
                v();
            } else if (i2 == 4) {
                if (this.g.f6170a) {
                    y();
                }
                this.f6189e.f();
                this.f6151c.e();
                zzaye.h.post(new v7(this));
            }
        }
    }

    public final void g() {
        if (N()) {
            if (this.g.f6170a) {
                x();
            }
            this.j.z().j(true);
            this.f6189e.e();
            this.f6151c.d();
            this.f6150b.b();
            zzaye.h.post(new x7(this));
            return;
        }
        this.r = true;
    }

    public final int getCurrentPosition() {
        if (N()) {
            return (int) this.j.z().h();
        }
        return 0;
    }

    public final int getDuration() {
        if (N()) {
            return (int) this.j.z().getDuration();
        }
        return 0;
    }

    public final int getVideoHeight() {
        return this.t;
    }

    public final int getVideoWidth() {
        return this.s;
    }

    public final void h(int i2) {
        if (N()) {
            this.j.z().seekTo((long) i2);
        }
    }

    public final void i() {
        if (M()) {
            this.j.z().stop();
            if (this.j != null) {
                t((Surface) null, true);
                zzbdy zzbdy = this.j;
                if (zzbdy != null) {
                    zzbdy.w((zzbef) null);
                    this.j.t();
                    this.j = null;
                }
                this.n = 1;
                this.m = false;
                this.q = false;
                this.r = false;
            }
        }
        this.f6189e.f();
        this.f6151c.e();
        this.f6189e.a();
    }

    public final void j(float f2, float f3) {
        zzbcz zzbcz = this.o;
        if (zzbcz != null) {
            zzbcz.e(f2, f3);
        }
    }

    public final void k(zzbcj zzbcj) {
        this.h = zzbcj;
    }

    public final void l(String str, String[] strArr) {
        if (str != null) {
            if (strArr == null) {
                setVideoPath(str);
            }
            this.k = str;
            this.l = (String[]) Arrays.copyOf(strArr, strArr.length);
            u();
        }
    }

    public final void m(int i2) {
        zzbdy zzbdy = this.j;
        if (zzbdy != null) {
            zzbdy.C().j(i2);
        }
    }

    public final void n(int i2) {
        zzbdy zzbdy = this.j;
        if (zzbdy != null) {
            zzbdy.C().k(i2);
        }
    }

    public final void o(int i2) {
        zzbdy zzbdy = this.j;
        if (zzbdy != null) {
            zzbdy.C().h(i2);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007a A[LOOP:0: B:30:0x007a->B:35:0x0095, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r11, int r12) {
        /*
            r10 = this;
            super.onMeasure(r11, r12)
            int r11 = r10.getMeasuredWidth()
            int r12 = r10.getMeasuredHeight()
            float r0 = r10.w
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 == 0) goto L_0x002a
            com.google.android.gms.internal.ads.zzbcz r2 = r10.o
            if (r2 != 0) goto L_0x002a
            float r2 = (float) r11
            float r3 = (float) r12
            float r3 = r2 / r3
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x0020
            float r2 = r2 / r0
            int r12 = (int) r2
        L_0x0020:
            float r0 = r10.w
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x002a
            float r11 = (float) r12
            float r11 = r11 * r0
            int r11 = (int) r11
        L_0x002a:
            r10.setMeasuredDimension(r11, r12)
            com.google.android.gms.internal.ads.zzbcz r0 = r10.o
            if (r0 == 0) goto L_0x0034
            r0.i(r11, r12)
        L_0x0034:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r0 != r2) goto L_0x00a2
            int r0 = r10.u
            if (r0 <= 0) goto L_0x0040
            if (r0 != r11) goto L_0x0046
        L_0x0040:
            int r0 = r10.v
            if (r0 <= 0) goto L_0x009e
            if (r0 == r12) goto L_0x009e
        L_0x0046:
            boolean r0 = r10.f6190f
            if (r0 == 0) goto L_0x009e
            boolean r0 = r10.M()
            if (r0 == 0) goto L_0x009e
            com.google.android.gms.internal.ads.zzbdy r0 = r10.j
            com.google.android.gms.internal.ads.zzhe r0 = r0.z()
            long r2 = r0.h()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x009e
            boolean r2 = r0.b()
            if (r2 == 0) goto L_0x0067
            goto L_0x009e
        L_0x0067:
            r2 = 1
            r10.s(r1, r2)
            r0.j(r2)
            long r1 = r0.h()
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzq.zzld()
            long r3 = r3.a()
        L_0x007a:
            boolean r5 = r10.M()
            if (r5 == 0) goto L_0x0097
            long r5 = r0.h()
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 != 0) goto L_0x0097
            com.google.android.gms.common.util.Clock r5 = com.google.android.gms.ads.internal.zzq.zzld()
            long r5 = r5.a()
            long r5 = r5 - r3
            r7 = 250(0xfa, double:1.235E-321)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x007a
        L_0x0097:
            r1 = 0
            r0.j(r1)
            r10.c()
        L_0x009e:
            r10.u = r11
            r10.v = r12
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdi.onMeasure(int, int):void");
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        if (this.p) {
            zzbcz zzbcz = new zzbcz(getContext());
            this.o = zzbcz;
            zzbcz.b(surfaceTexture, i2, i3);
            this.o.start();
            SurfaceTexture k2 = this.o.k();
            if (k2 != null) {
                surfaceTexture = k2;
            } else {
                this.o.j();
                this.o = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.i = surface;
        if (this.j == null) {
            u();
        } else {
            t(surface, true);
            if (!this.g.f6170a) {
                x();
            }
        }
        if (this.s == 0 || this.t == 0) {
            I(i2, i3);
        } else {
            w();
        }
        zzaye.h.post(new z7(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        d();
        zzbcz zzbcz = this.o;
        if (zzbcz != null) {
            zzbcz.j();
            this.o = null;
        }
        if (this.j != null) {
            y();
            Surface surface = this.i;
            if (surface != null) {
                surface.release();
            }
            this.i = null;
            t((Surface) null, true);
        }
        zzaye.h.post(new b8(this));
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        zzbcz zzbcz = this.o;
        if (zzbcz != null) {
            zzbcz.i(i2, i3);
        }
        zzaye.h.post(new y7(this, i2, i3));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f6189e.c(this);
        this.f6150b.a(surfaceTexture, this.h);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i2) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i2);
        zzaxv.m(sb.toString());
        zzaye.h.post(new a8(this, i2));
        super.onWindowVisibilityChanged(i2);
    }

    public final void p(int i2) {
        zzbdy zzbdy = this.j;
        if (zzbdy != null) {
            zzbdy.C().i(i2);
        }
    }

    public final void q(int i2) {
        zzbdy zzbdy = this.j;
        if (zzbdy != null) {
            zzbdy.H(i2);
        }
    }

    public final String r() {
        String str = this.p ? " spherical" : "";
        return str.length() != 0 ? "ExoPlayer/3".concat(str) : new String("ExoPlayer/3");
    }

    public final void setVideoPath(String str) {
        if (str != null) {
            this.k = str;
            this.l = new String[]{str};
            u();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void z() {
        zzbcj zzbcj = this.h;
        if (zzbcj != null) {
            zzbcj.b();
        }
    }
}
