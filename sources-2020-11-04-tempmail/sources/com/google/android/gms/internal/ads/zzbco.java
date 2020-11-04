package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbco extends FrameLayout implements zzbcj {

    /* renamed from: b  reason: collision with root package name */
    private final zzbdb f6335b;

    /* renamed from: c  reason: collision with root package name */
    private final FrameLayout f6336c;

    /* renamed from: d  reason: collision with root package name */
    private final zzabi f6337d;

    /* renamed from: e  reason: collision with root package name */
    private final r7 f6338e;

    /* renamed from: f  reason: collision with root package name */
    private final long f6339f;
    private zzbcm g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private long l;
    private long m;
    private String n;
    private String[] o;
    private Bitmap p;
    private ImageView q;
    private boolean r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbco(Context context, zzbdb zzbdb, int i2, boolean z, zzabi zzabi, zzbdc zzbdc) {
        super(context);
        Context context2 = context;
        zzbdb zzbdb2 = zzbdb;
        this.f6335b = zzbdb2;
        zzabi zzabi2 = zzabi;
        this.f6337d = zzabi2;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f6336c = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.k(zzbdb.j());
        zzbcm a2 = zzbdb.j().zzbnz.a(context, zzbdb2, i2, z, zzabi2, zzbdc);
        this.g = a2;
        if (a2 != null) {
            this.f6336c.addView(a2, new FrameLayout.LayoutParams(-1, -1, 17));
            if (((Boolean) zzwg.e().c(zzaav.u)).booleanValue()) {
                F();
            }
        }
        this.q = new ImageView(context);
        this.f6339f = ((Long) zzwg.e().c(zzaav.y)).longValue();
        boolean booleanValue = ((Boolean) zzwg.e().c(zzaav.w)).booleanValue();
        this.k = booleanValue;
        zzabi zzabi3 = this.f6337d;
        if (zzabi3 != null) {
            zzabi3.d("spinner_used", booleanValue ? "1" : "0");
        }
        this.f6338e = new r7(this);
        zzbcm zzbcm = this.g;
        if (zzbcm != null) {
            zzbcm.k(this);
        }
        if (this.g == null) {
            e("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    private final boolean H() {
        return this.q.getParent() != null;
    }

    private final void I() {
        if (this.f6335b.b() != null && this.i && !this.j) {
            this.f6335b.b().getWindow().clearFlags(128);
            this.i = false;
        }
    }

    public static void p(zzbdb zzbdb, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put("error", str);
        zzbdb.z("onVideoEvent", hashMap);
    }

    public static void q(zzbdb zzbdb, Map<String, List<Map<String, Object>>> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put("mimeTypes", map);
        zzbdb.z("onVideoEvent", hashMap);
    }

    public static void s(zzbdb zzbdb) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "no_video_view");
        zzbdb.z("onVideoEvent", hashMap);
    }

    /* access modifiers changed from: private */
    public final void v(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.f6335b.z("onVideoEvent", hashMap);
    }

    public final void A(int i2) {
        this.g.q(i2);
    }

    @TargetApi(14)
    public final void B(MotionEvent motionEvent) {
        zzbcm zzbcm = this.g;
        if (zzbcm != null) {
            zzbcm.dispatchTouchEvent(motionEvent);
        }
    }

    public final void C() {
        if (this.g != null) {
            if (!TextUtils.isEmpty(this.n)) {
                this.g.l(this.n, this.o);
            } else {
                v("no_src", new String[0]);
            }
        }
    }

    public final void D() {
        zzbcm zzbcm = this.g;
        if (zzbcm != null) {
            zzbcm.f6334c.b(true);
            zzbcm.c();
        }
    }

    public final void E() {
        zzbcm zzbcm = this.g;
        if (zzbcm != null) {
            zzbcm.f6334c.b(false);
            zzbcm.c();
        }
    }

    @TargetApi(14)
    public final void F() {
        zzbcm zzbcm = this.g;
        if (zzbcm != null) {
            TextView textView = new TextView(zzbcm.getContext());
            String valueOf = String.valueOf(this.g.r());
            textView.setText(valueOf.length() != 0 ? "AdMob - ".concat(valueOf) : new String("AdMob - "));
            textView.setTextColor(-65536);
            textView.setBackgroundColor(-256);
            this.f6336c.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
            this.f6336c.bringChildToFront(textView);
        }
    }

    /* access modifiers changed from: package-private */
    public final void G() {
        zzbcm zzbcm = this.g;
        if (zzbcm != null) {
            long currentPosition = (long) zzbcm.getCurrentPosition();
            if (this.l != currentPosition && currentPosition > 0) {
                v("timeupdate", "time", String.valueOf(((float) currentPosition) / 1000.0f));
                this.l = currentPosition;
            }
        }
    }

    public final void a() {
        zzbcm zzbcm = this.g;
        if (zzbcm != null && this.m == 0) {
            v("canplaythrough", "duration", String.valueOf(((float) zzbcm.getDuration()) / 1000.0f), "videoWidth", String.valueOf(this.g.getVideoWidth()), "videoHeight", String.valueOf(this.g.getVideoHeight()));
        }
    }

    public final void b() {
        if (this.r && this.p != null && !H()) {
            this.q.setImageBitmap(this.p);
            this.q.invalidate();
            this.f6336c.addView(this.q, new FrameLayout.LayoutParams(-1, -1));
            this.f6336c.bringChildToFront(this.q);
        }
        this.f6338e.a();
        this.m = this.l;
        zzaye.h.post(new m7(this));
    }

    public final void c(int i2, int i3) {
        if (this.k) {
            int max = Math.max(i2 / ((Integer) zzwg.e().c(zzaav.x)).intValue(), 1);
            int max2 = Math.max(i3 / ((Integer) zzwg.e().c(zzaav.x)).intValue(), 1);
            Bitmap bitmap = this.p;
            if (bitmap == null || bitmap.getWidth() != max || this.p.getHeight() != max2) {
                this.p = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                this.r = false;
            }
        }
    }

    public final void d() {
        v("ended", new String[0]);
        I();
    }

    public final void e(String str, String str2) {
        v("error", "what", str, "extra", str2);
    }

    public final void f() {
        v("pause", new String[0]);
        I();
        this.h = false;
    }

    public final void finalize() throws Throwable {
        try {
            this.f6338e.a();
            if (this.g != null) {
                zzbcm zzbcm = this.g;
                zzdvi zzdvi = zzbbf.f6324e;
                zzbcm.getClass();
                zzdvi.execute(i7.a(zzbcm));
            }
        } finally {
            super.finalize();
        }
    }

    public final void g() {
        if (this.f6335b.b() != null && !this.i) {
            boolean z = (this.f6335b.b().getWindow().getAttributes().flags & 128) != 0;
            this.j = z;
            if (!z) {
                this.f6335b.b().getWindow().addFlags(128);
                this.i = true;
            }
        }
        this.h = true;
    }

    public final void h() {
        this.f6338e.b();
        zzaye.h.post(new j7(this));
    }

    public final void i() {
        if (this.h && H()) {
            this.f6336c.removeView(this.q);
        }
        if (this.p != null) {
            long b2 = zzq.zzld().b();
            if (this.g.getBitmap(this.p) != null) {
                this.r = true;
            }
            long b3 = zzq.zzld().b() - b2;
            if (zzaxv.n()) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Spinner frame grab took ");
                sb.append(b3);
                sb.append("ms");
                zzaxv.m(sb.toString());
            }
            if (b3 > this.f6339f) {
                zzbba.i("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.k = false;
                this.p = null;
                zzabi zzabi = this.f6337d;
                if (zzabi != null) {
                    zzabi.d("spinner_jank", Long.toString(b3));
                }
            }
        }
    }

    public final void j() {
        this.f6338e.a();
        zzbcm zzbcm = this.g;
        if (zzbcm != null) {
            zzbcm.i();
        }
        I();
    }

    public final void k() {
        zzbcm zzbcm = this.g;
        if (zzbcm != null) {
            zzbcm.d();
        }
    }

    public final void l() {
        zzbcm zzbcm = this.g;
        if (zzbcm != null) {
            zzbcm.g();
        }
    }

    public final void m(int i2) {
        zzbcm zzbcm = this.g;
        if (zzbcm != null) {
            zzbcm.h(i2);
        }
    }

    public final void n(float f2, float f3) {
        zzbcm zzbcm = this.g;
        if (zzbcm != null) {
            zzbcm.j(f2, f3);
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.f6338e.b();
        } else {
            this.f6338e.a();
            this.m = this.l;
        }
        zzaye.h.post(new k7(this, z));
    }

    public final void onWindowVisibilityChanged(int i2) {
        boolean z;
        super.onWindowVisibilityChanged(i2);
        if (i2 == 0) {
            this.f6338e.b();
            z = true;
        } else {
            this.f6338e.a();
            this.m = this.l;
            z = false;
        }
        zzaye.h.post(new l7(this, z));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void r(boolean z) {
        v("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    public final void setVolume(float f2) {
        zzbcm zzbcm = this.g;
        if (zzbcm != null) {
            zzbcm.f6334c.c(f2);
            zzbcm.c();
        }
    }

    public final void t(String str, String[] strArr) {
        this.n = str;
        this.o = strArr;
    }

    public final void u(int i2, int i3, int i4, int i5) {
        if (i4 != 0 && i5 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
            layoutParams.setMargins(i2, i3, 0, 0);
            this.f6336c.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    public final void w(int i2) {
        this.g.m(i2);
    }

    public final void x(int i2) {
        this.g.n(i2);
    }

    public final void y(int i2) {
        this.g.o(i2);
    }

    public final void z(int i2) {
        this.g.p(i2);
    }
}
