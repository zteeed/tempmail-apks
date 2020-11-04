package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzajg extends zzajt<zzalf> implements zzajp, zzaju {

    /* renamed from: d  reason: collision with root package name */
    private final zzbhu f5930d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public zzajx f5931e;

    public zzajg(Context context, zzbbd zzbbd) throws zzbfz {
        try {
            zzbhu zzbhu = new zzbhu(context, new x0(this));
            this.f5930d = zzbhu;
            zzbhu.setWillNotDraw(true);
            this.f5930d.addJavascriptInterface(new y0(this), "GoogleJsInterface");
            zzq.zzkw().k(context, zzbbd.f6314b, this.f5930d.getSettings());
            super.k0(this);
        } catch (Throwable th) {
            throw new zzbfz("Init failed.", th);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void E0(String str) {
        this.f5930d.f(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void F0(String str) {
        this.f5930d.loadUrl(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void G0(String str) {
        this.f5930d.loadData(str, "text/html", "UTF-8");
    }

    public final void L(String str) {
        Q(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head></html>", new Object[]{str}));
    }

    public final void Q(String str) {
        zzbbf.f6324e.execute(new u0(this, str));
    }

    public final void a0(String str, String str2) {
        zzajo.a(this, str, str2);
    }

    public final void destroy() {
        this.f5930d.destroy();
    }

    public final void e0(String str, JSONObject jSONObject) {
        zzajo.c(this, str, jSONObject);
    }

    public final void f(String str) {
        zzbbf.f6324e.execute(new w0(this, str));
    }

    public final void g0(String str) {
        zzbbf.f6324e.execute(new t0(this, str));
    }

    public final void k(String str, JSONObject jSONObject) {
        zzajo.d(this, str, jSONObject);
    }

    public final boolean l() {
        return this.f5930d.l();
    }

    public final zzale m0() {
        return new zzalh(this);
    }

    public final void s(zzajx zzajx) {
        this.f5931e = zzajx;
    }

    public final void z(String str, Map map) {
        zzajo.b(this, str, map);
    }
}
