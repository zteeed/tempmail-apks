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
    private final zzbfn f5860c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f5861d;

    /* renamed from: e  reason: collision with root package name */
    private final WindowManager f5862e;

    /* renamed from: f  reason: collision with root package name */
    private final zzaac f5863f;
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
        this.f5860c = zzbfn;
        this.f5861d = context;
        this.f5863f = zzaac;
        this.f5862e = (WindowManager) context.getSystemService("window");
    }

    public final /* synthetic */ void a(Object obj, Map map) {
        zzbfn zzbfn = (zzbfn) obj;
        this.g = new DisplayMetrics();
        Display defaultDisplay = this.f5862e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.g);
        this.h = this.g.density;
        this.k = defaultDisplay.getRotation();
        zzwg.a();
        DisplayMetrics displayMetrics = this.g;
        this.i = zzbaq.k(displayMetrics, displayMetrics.widthPixels);
        zzwg.a();
        DisplayMetrics displayMetrics2 = this.g;
        this.j = zzbaq.k(displayMetrics2, displayMetrics2.heightPixels);
        Activity b2 = this.f5860c.b();
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
        if (this.f5860c.o().e()) {
            this.n = this.i;
            this.o = this.j;
        } else {
            this.f5860c.measure(0, 0);
        }
        b(this.i, this.j, this.l, this.m, this.h, this.k);
        zzaqb zzaqb = new zzaqb();
        zzaqb.c(this.f5863f.b());
        zzaqb.b(this.f5863f.c());
        zzaqb.d(this.f5863f.e());
        zzaqb.e(this.f5863f.d());
        zzaqb.f(true);
        this.f5860c.k("onDeviceFeaturesReceived", new zzapz(zzaqb).a());
        int[] iArr = new int[2];
        this.f5860c.getLocationOnScreen(iArr);
        h(zzwg.a().j(this.f5861d, iArr[0]), zzwg.a().j(this.f5861d, iArr[1]));
        if (zzbba.a(2)) {
            zzbba.h("Dispatching Ready Event.");
        }
        f(this.f5860c.a().f6131b);
    }

    public final void h(int i2, int i3) {
        int i4 = 0;
        if (this.f5861d instanceof Activity) {
            i4 = zzq.zzkw().a0((Activity) this.f5861d)[0];
        }
        if (this.f5860c.o() == null || !this.f5860c.o().e()) {
            int width = this.f5860c.getWidth();
            int height = this.f5860c.getHeight();
            if (((Boolean) zzwg.e().c(zzaav.I)).booleanValue()) {
                if (width == 0 && this.f5860c.o() != null) {
                    width = this.f5860c.o().f6251c;
                }
                if (height == 0 && this.f5860c.o() != null) {
                    height = this.f5860c.o().f6250b;
                }
            }
            this.n = zzwg.a().j(this.f5861d, width);
            this.o = zzwg.a().j(this.f5861d, height);
        }
        d(i2, i3 - i4, this.n, this.o);
        this.f5860c.q().d(i2, i3);
    }
}
