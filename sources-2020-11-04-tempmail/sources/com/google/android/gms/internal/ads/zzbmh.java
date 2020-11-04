package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbmh implements zzqs {

    /* renamed from: b  reason: collision with root package name */
    private zzbfn f6563b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f6564c;

    /* renamed from: d  reason: collision with root package name */
    private final zzbls f6565d;

    /* renamed from: e  reason: collision with root package name */
    private final Clock f6566e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6567f = false;
    private boolean g = false;
    private zzblw h = new zzblw();

    public zzbmh(Executor executor, zzbls zzbls, Clock clock) {
        this.f6564c = executor;
        this.f6565d = zzbls;
        this.f6566e = clock;
    }

    private final void r() {
        try {
            JSONObject a2 = this.f6565d.b(this.h);
            if (this.f6563b != null) {
                this.f6564c.execute(new dc(this, a2));
            }
        } catch (JSONException e2) {
            zzaxv.l("Failed to call video active view js", e2);
        }
    }

    public final void R(zzqt zzqt) {
        this.h.f6531a = this.g ? false : zzqt.j;
        this.h.f6533c = this.f6566e.b();
        this.h.f6535e = zzqt;
        if (this.f6567f) {
            r();
        }
    }

    public final void f() {
        this.f6567f = false;
    }

    public final void k() {
        this.f6567f = true;
        r();
    }

    public final void s(boolean z) {
        this.g = z;
    }

    public final void u(zzbfn zzbfn) {
        this.f6563b = zzbfn;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void y(JSONObject jSONObject) {
        this.f6563b.e0("AFMA_updateActiveView", jSONObject);
    }
}
