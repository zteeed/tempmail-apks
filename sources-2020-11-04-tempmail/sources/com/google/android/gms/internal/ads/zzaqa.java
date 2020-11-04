package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzq;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzaqa extends zzaqd implements zzahc<zzbfn> {

    /* renamed from: c  reason: collision with root package name */
    private final zzbfn f6043c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f6044d;

    /* renamed from: e  reason: collision with root package name */
    private final WindowManager f6045e;

    /* renamed from: f  reason: collision with root package name */
    private final zzaac f6046f;
    private DisplayMetrics g;
    private float h;
    private int i = -1;
    private int j = -1;
    private int k;
    private int l = -1;
    private int m = -1;
    private int n = -1;
    private int o = -1;

    public zzaqa(zzbfn zzbfn, Context context, zzaac zzaac) {
        super(zzbfn);
        this.f6043c = zzbfn;
        this.f6044d = context;
        this.f6046f = zzaac;
        this.f6045e = (WindowManager) context.getSystemService("window");
    }

    public final /* synthetic */ void a(Object obj, Map map) {
        zzbfn zzbfn = (zzbfn) obj;
        this.g = new DisplayMetrics();
        Display defaultDisplay = this.f6045e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.g);
        this.h = this.g.density;
        this.k = defaultDisplay.getRotation();
        zzwg.a();
        DisplayMetrics displayMetrics = this.g;
        this.i = zzbaq.k(displayMetrics, displayMetrics.widthPixels);
        zzwg.a();
        DisplayMetrics displayMetrics2 = this.g;
        this.j = zzbaq.k(displayMetrics2, displayMetrics2.heightPixels);
        Activity b2 = this.f6043c.b();
        if (b2 == null || b2.getWindow() == null) {
            this.l = this.i;
            this.m = this.j;
        } else {
            zzq.zzkw();
            int[] S = zzaye.S(b2);
            zzwg.a();
            this.l = zzbaq.k(this.g, S[0]);
            zzwg.a();
            this.m = zzbaq.k(this.g, S[1]);
        }
        if (this.f6043c.o().e()) {
            this.n = this.i;
            this.o = this.j;
        } else {
            this.f6043c.measure(0, 0);
        }
        b(this.i, this.j, this.l, this.m, this.h, this.k);
        zzaqb zzaqb = new zzaqb();
        zzaqb.c(this.f6046f.b());
        zzaqb.b(this.f6046f.c());
        zzaqb.d(this.f6046f.e());
        zzaqb.e(this.f6046f.d());
        zzaqb.f(true);
        this.f6043c.k("onDeviceFeaturesReceived", new zzapz(zzaqb).a());
        int[] iArr = new int[2];
        this.f6043c.getLocationOnScreen(iArr);
        h(zzwg.a().j(this.f6044d, iArr[0]), zzwg.a().j(this.f6044d, iArr[1]));
        if (zzbba.a(2)) {
            zzbba.h("Dispatching Ready Event.");
        }
        f(this.f6043c.a().f6314b);
    }

    public final void h(int i2, int i3) {
        int i4 = 0;
        if (this.f6044d instanceof Activity) {
            i4 = zzq.zzkw().a0((Activity) this.f6044d)[0];
        }
        if (this.f6043c.o() == null || !this.f6043c.o().e()) {
            int width = this.f6043c.getWidth();
            int height = this.f6043c.getHeight();
            if (((Boolean) zzwg.e().c(zzaav.I)).booleanValue()) {
                if (width == 0 && this.f6043c.o() != null) {
                    width = this.f6043c.o().f6434c;
                }
                if (height == 0 && this.f6043c.o() != null) {
                    height = this.f6043c.o().f6433b;
                }
            }
            this.n = zzwg.a().j(this.f6044d, width);
            this.o = zzwg.a().j(this.f6044d, height);
        }
        d(i2, i3 - i4, this.n, this.o);
        this.f6043c.q().d(i2, i3);
    }
}
