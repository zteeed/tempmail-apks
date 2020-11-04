package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class xh implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final zzceu f5494b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdvf f5495c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdvf f5496d;

    /* renamed from: e  reason: collision with root package name */
    private final zzdvf f5497e;

    /* renamed from: f  reason: collision with root package name */
    private final zzdvf f5498f;
    private final zzdvf g;
    private final JSONObject h;
    private final zzdvf i;
    private final zzdvf j;
    private final zzdvf k;

    xh(zzceu zzceu, zzdvf zzdvf, zzdvf zzdvf2, zzdvf zzdvf3, zzdvf zzdvf4, zzdvf zzdvf5, JSONObject jSONObject, zzdvf zzdvf6, zzdvf zzdvf7, zzdvf zzdvf8) {
        this.f5494b = zzceu;
        this.f5495c = zzdvf;
        this.f5496d = zzdvf2;
        this.f5497e = zzdvf3;
        this.f5498f = zzdvf4;
        this.g = zzdvf5;
        this.h = jSONObject;
        this.i = zzdvf6;
        this.j = zzdvf7;
        this.k = zzdvf8;
    }

    public final Object call() {
        zzdvf zzdvf = this.f5495c;
        zzdvf zzdvf2 = this.f5496d;
        zzdvf zzdvf3 = this.f5497e;
        zzdvf zzdvf4 = this.f5498f;
        zzdvf zzdvf5 = this.g;
        JSONObject jSONObject = this.h;
        zzdvf zzdvf6 = this.i;
        zzdvf zzdvf7 = this.j;
        zzdvf zzdvf8 = this.k;
        zzcck zzcck = (zzcck) zzdvf.get();
        zzcck.o((List) zzdvf2.get());
        zzcck.w((zzadt) zzdvf3.get());
        zzcck.Q((zzadt) zzdvf4.get());
        zzcck.v((zzadl) zzdvf5.get());
        zzcck.W(zzcey.k(jSONObject));
        zzcck.x(zzcey.l(jSONObject));
        zzbfn zzbfn = (zzbfn) zzdvf6.get();
        if (zzbfn != null) {
            zzcck.X(zzbfn);
            zzcck.z(zzbfn.getView());
            zzcck.R(zzbfn.m());
        }
        zzbfn zzbfn2 = (zzbfn) zzdvf7.get();
        if (zzbfn2 != null) {
            zzcck.Y(zzbfn2);
        }
        for (zzcfn zzcfn : (List) zzdvf8.get()) {
            int i2 = zzcfn.f7162a;
            if (i2 == 1) {
                zzcck.Z(zzcfn.f7163b, zzcfn.f7164c);
            } else if (i2 == 2) {
                zzcck.y(zzcfn.f7163b, zzcfn.f7165d);
            }
        }
        return zzcck;
    }
}
