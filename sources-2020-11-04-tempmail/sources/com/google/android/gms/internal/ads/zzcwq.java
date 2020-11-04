package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcwq extends zzws {

    /* renamed from: b  reason: collision with root package name */
    private final Context f7834b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbif f7835c;
    @VisibleForTesting

    /* renamed from: d  reason: collision with root package name */
    private final zzdlc f7836d = new zzdlc();
    @VisibleForTesting

    /* renamed from: e  reason: collision with root package name */
    private final zzccx f7837e = new zzccx();

    /* renamed from: f  reason: collision with root package name */
    private zzwj f7838f;

    public zzcwq(zzbif zzbif, Context context, String str) {
        this.f7835c = zzbif;
        this.f7836d.y(str);
        this.f7834b = context;
    }

    public final void A6(zzxk zzxk) {
        this.f7836d.o(zzxk);
    }

    public final zzwo F5() {
        zzccv b2 = this.f7837e.b();
        this.f7836d.p(b2.f());
        this.f7836d.s(b2.g());
        zzdlc zzdlc = this.f7836d;
        if (zzdlc.E() == null) {
            zzdlc.r(zzvh.B());
        }
        return new zzcwt(this.f7834b, this.f7835c, this.f7836d, b2, this.f7838f);
    }

    public final void H3(zzafi zzafi) {
        this.f7837e.e(zzafi);
    }

    public final void M4(zzaet zzaet) {
        this.f7837e.c(zzaet);
    }

    public final void O1(PublisherAdViewOptions publisherAdViewOptions) {
        this.f7836d.f(publisherAdViewOptions);
    }

    public final void U3(zzaeu zzaeu) {
        this.f7837e.d(zzaeu);
    }

    public final void X5(zzaiw zzaiw) {
        this.f7837e.f(zzaiw);
    }

    public final void k4(zzadj zzadj) {
        this.f7836d.g(zzadj);
    }

    public final void n6(zzafh zzafh, zzvh zzvh) {
        this.f7837e.a(zzafh);
        this.f7836d.r(zzvh);
    }

    public final void o6(zzaio zzaio) {
        this.f7836d.h(zzaio);
    }

    public final void p1(zzwj zzwj) {
        this.f7838f = zzwj;
    }

    public final void y5(String str, zzafa zzafa, zzaez zzaez) {
        this.f7837e.g(str, zzafa, zzaez);
    }
}
