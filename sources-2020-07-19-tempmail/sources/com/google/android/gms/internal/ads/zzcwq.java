package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcwq extends zzws {

    /* renamed from: b  reason: collision with root package name */
    private final Context f7651b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbif f7652c;
    @VisibleForTesting

    /* renamed from: d  reason: collision with root package name */
    private final zzdlc f7653d = new zzdlc();
    @VisibleForTesting

    /* renamed from: e  reason: collision with root package name */
    private final zzccx f7654e = new zzccx();

    /* renamed from: f  reason: collision with root package name */
    private zzwj f7655f;

    public zzcwq(zzbif zzbif, Context context, String str) {
        this.f7652c = zzbif;
        this.f7653d.y(str);
        this.f7651b = context;
    }

    public final void F1(PublisherAdViewOptions publisherAdViewOptions) {
        this.f7653d.f(publisherAdViewOptions);
    }

    public final void G3(zzaeu zzaeu) {
        this.f7654e.d(zzaeu);
    }

    public final void O5(zzafh zzafh, zzvh zzvh) {
        this.f7654e.a(zzafh);
        this.f7653d.r(zzvh);
    }

    public final void P5(zzaio zzaio) {
        this.f7653d.h(zzaio);
    }

    public final void S3(zzadj zzadj) {
        this.f7653d.g(zzadj);
    }

    public final void a6(zzxk zzxk) {
        this.f7653d.o(zzxk);
    }

    public final void c5(String str, zzafa zzafa, zzaez zzaez) {
        this.f7654e.g(str, zzafa, zzaez);
    }

    public final void j1(zzwj zzwj) {
        this.f7655f = zzwj;
    }

    public final zzwo j5() {
        zzccv b2 = this.f7654e.b();
        this.f7653d.p(b2.f());
        this.f7653d.s(b2.g());
        zzdlc zzdlc = this.f7653d;
        if (zzdlc.E() == null) {
            zzdlc.r(zzvh.B());
        }
        return new zzcwt(this.f7651b, this.f7652c, this.f7653d, b2, this.f7655f);
    }

    public final void s3(zzafi zzafi) {
        this.f7654e.e(zzafi);
    }

    public final void s4(zzaet zzaet) {
        this.f7654e.c(zzaet);
    }

    public final void z5(zzaiw zzaiw) {
        this.f7654e.f(zzaiw);
    }
}
