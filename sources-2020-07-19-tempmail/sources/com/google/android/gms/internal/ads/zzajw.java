package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.ads.internal.zzq;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzajw implements zzajp, zzaju {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final zzbfn f5751b;

    public zzajw(Context context, zzbbd zzbbd, zzeg zzeg, zza zza) throws zzbfz {
        zzq.zzkx();
        zzbfn a2 = zzbfv.a(context, zzbhg.b(), "", false, false, zzeg, zzbbd, (zzabi) null, (zzi) null, (zza) null, zztm.f(), (zzso) null, false);
        this.f5751b = a2;
        a2.getView().setWillNotDraw(true);
    }

    private static void C(Runnable runnable) {
        zzwg.a();
        if (zzbaq.y()) {
            runnable.run();
        } else {
            zzaye.h.post(runnable);
        }
    }

    public final void L(String str) {
        C(new d1(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    public final void Q(String str) {
        C(new g1(this, str));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void R(String str) {
        this.f5751b.f(str);
    }

    public final void a0(String str, String str2) {
        zzajo.a(this, str, str2);
    }

    public final void c(String str, zzahc<? super zzalf> zzahc) {
        this.f5751b.c(str, new h1(this, zzahc));
    }

    public final void destroy() {
        this.f5751b.destroy();
    }

    public final void e0(String str, JSONObject jSONObject) {
        zzajo.c(this, str, jSONObject);
    }

    public final void f(String str) {
        C(new c1(this, str));
    }

    public final void g0(String str) {
        C(new f1(this, str));
    }

    public final void k(String str, JSONObject jSONObject) {
        zzajo.d(this, str, jSONObject);
    }

    public final boolean l() {
        return this.f5751b.l();
    }

    public final zzale m0() {
        return new zzalh(this);
    }

    public final void n(String str, zzahc<? super zzalf> zzahc) {
        this.f5751b.v(str, new b1(zzahc));
    }

    public final void s(zzajx zzajx) {
        zzbgz q = this.f5751b.q();
        zzajx.getClass();
        q.c(e1.b(zzajx));
    }

    public final void z(String str, Map map) {
        zzajo.b(this, str, map);
    }
}
