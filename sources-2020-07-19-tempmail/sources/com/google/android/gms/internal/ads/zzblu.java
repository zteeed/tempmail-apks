package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzblu implements zzo, zzbtd, zzbtg, zzqs {

    /* renamed from: b  reason: collision with root package name */
    private final zzblp f6341b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbls f6342c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<zzbfn> f6343d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    private final zzamd<JSONObject, JSONObject> f6344e;

    /* renamed from: f  reason: collision with root package name */
    private final Executor f6345f;
    private final Clock g;
    private final AtomicBoolean h = new AtomicBoolean(false);
    @GuardedBy("this")
    private final zzblw i = new zzblw();
    private boolean j = false;
    private WeakReference<?> k = new WeakReference<>(this);

    public zzblu(zzalw zzalw, zzbls zzbls, Executor executor, zzblp zzblp, Clock clock) {
        this.f6341b = zzblp;
        zzaln<JSONObject> zzaln = zzalm.f5772b;
        this.f6344e = zzalw.a("google.afma.activeView.handleUpdate", zzaln, zzaln);
        this.f6342c = zzbls;
        this.f6345f = executor;
        this.g = clock;
    }

    private final void u() {
        for (zzbfn g2 : this.f6343d) {
            this.f6341b.g(g2);
        }
        this.f6341b.d();
    }

    public final void B(Object obj) {
        this.k = new WeakReference<>(obj);
    }

    public final synchronized void R(zzqt zzqt) {
        this.i.f6348a = zzqt.j;
        this.i.f6352e = zzqt;
        s();
    }

    public final synchronized void f(Context context) {
        this.i.f6351d = "u";
        s();
        u();
        this.j = true;
    }

    public final synchronized void k(Context context) {
        this.i.f6349b = false;
        s();
    }

    public final synchronized void onAdImpression() {
        if (this.h.compareAndSet(false, true)) {
            this.f6341b.b(this);
            s();
        }
    }

    public final synchronized void onPause() {
        this.i.f6349b = true;
        s();
    }

    public final synchronized void onResume() {
        this.i.f6349b = false;
        s();
    }

    public final synchronized void r(Context context) {
        this.i.f6349b = true;
        s();
    }

    public final synchronized void s() {
        if (!(this.k.get() != null)) {
            y();
        } else if (!this.j && this.h.get()) {
            try {
                this.i.f6350c = this.g.b();
                JSONObject a2 = this.f6342c.b(this.i);
                for (zzbfn ccVar : this.f6343d) {
                    this.f6345f.execute(new cc(ccVar, a2));
                }
                zzbbj.b(this.f6344e.zzf(a2), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e2) {
                zzaxv.l("Failed to call ActiveViewJS", e2);
            }
        }
    }

    public final synchronized void y() {
        u();
        this.j = true;
    }

    public final synchronized void z(zzbfn zzbfn) {
        this.f6343d.add(zzbfn);
        this.f6341b.f(zzbfn);
    }

    public final void zzud() {
    }

    public final void zzue() {
    }
}
