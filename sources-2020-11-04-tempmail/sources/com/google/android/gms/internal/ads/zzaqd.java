package com.google.android.gms.internal.ads;

import com.tempmail.t.y;
import com.tempmail.utils.x;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzaqd {

    /* renamed from: a  reason: collision with root package name */
    private final zzbfn f6052a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6053b;

    public zzaqd(zzbfn zzbfn) {
        this(zzbfn, "");
    }

    public final void b(int i, int i2, int i3, int i4, float f2, int i5) {
        try {
            this.f6052a.k("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", (double) f2).put("rotation", i5));
        } catch (JSONException e2) {
            zzbba.c("Error occurred while obtaining screen information.", e2);
        }
    }

    public final void c(int i, int i2, int i3, int i4) {
        try {
            this.f6052a.k("onSizeChanged", new JSONObject().put(x.f13134a, i).put(y.f13082d, i2).put("width", i3).put("height", i4));
        } catch (JSONException e2) {
            zzbba.c("Error occurred while dispatching size change.", e2);
        }
    }

    public final void d(int i, int i2, int i3, int i4) {
        try {
            this.f6052a.k("onDefaultPositionReceived", new JSONObject().put(x.f13134a, i).put(y.f13082d, i2).put("width", i3).put("height", i4));
        } catch (JSONException e2) {
            zzbba.c("Error occurred while dispatching default position.", e2);
        }
    }

    public final void e(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.f6053b);
            if (this.f6052a != null) {
                this.f6052a.k("onError", put);
            }
        } catch (JSONException e2) {
            zzbba.c("Error occurred while dispatching error event.", e2);
        }
    }

    public final void f(String str) {
        try {
            this.f6052a.k("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e2) {
            zzbba.c("Error occurred while dispatching ready Event.", e2);
        }
    }

    public final void g(String str) {
        try {
            this.f6052a.k("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e2) {
            zzbba.c("Error occurred while dispatching state change.", e2);
        }
    }

    public zzaqd(zzbfn zzbfn, String str) {
        this.f6052a = zzbfn;
        this.f6053b = str;
    }
}
