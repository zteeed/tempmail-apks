package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbmh implements zzqs {

    /* renamed from: b  reason: collision with root package name */
    private zzbfn f6380b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f6381c;

    /* renamed from: d  reason: collision with root package name */
    private final zzbls f6382d;

    /* renamed from: e  reason: collision with root package name */
    private final Clock f6383e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6384f = false;
    private boolean g = false;
    private zzblw h = new zzblw();

    public zzbmh(Executor executor, zzbls zzbls, Clock clock) {
        this.f6381c = executor;
        this.f6382d = zzbls;
        this.f6383e = clock;
    }

    private final void r() {
        try {
            JSONObject a2 = this.f6382d.b(this.h);
            if (this.f6380b != null) {
                this.f6381c.execute(new dc(this, a2));
            }
        } catch (JSONException e2) {
            zzaxv.l("Failed to call video active view js", e2);
        }
    }

    public final void R(zzqt zzqt) {
        this.h.f6348a = this.g ? false : zzqt.j;
        this.h.f6350c = this.f6383e.b();
        this.h.f6352e = zzqt;
        if (this.f6384f) {
            r();
        }
    }

    public final void f() {
        this.f6384f = false;
    }

    public final void k() {
        this.f6384f = true;
        r();
    }

    public final void s(boolean z) {
        this.g = z;
    }

    public final void u(zzbfn zzbfn) {
        this.f6380b = zzbfn;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void y(JSONObject jSONObject) {
        this.f6380b.e0("AFMA_updateActiveView", jSONObject);
    }
}
