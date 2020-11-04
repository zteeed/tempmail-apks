package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcdn implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final zzcgr f6889b;

    /* renamed from: c  reason: collision with root package name */
    private final Clock f6890c;

    /* renamed from: d  reason: collision with root package name */
    private zzafo f6891d;

    /* renamed from: e  reason: collision with root package name */
    private zzahc<Object> f6892e;

    /* renamed from: f  reason: collision with root package name */
    String f6893f;
    Long g;
    WeakReference<View> h;

    public zzcdn(zzcgr zzcgr, Clock clock) {
        this.f6889b = zzcgr;
        this.f6890c = clock;
    }

    private final void d() {
        View view;
        this.f6893f = null;
        this.g = null;
        WeakReference<View> weakReference = this.h;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            view.setClickable(false);
            view.setOnClickListener((View.OnClickListener) null);
            this.h = null;
        }
    }

    public final void a() {
        if (this.f6891d != null && this.g != null) {
            d();
            try {
                this.f6891d.onUnconfirmedClickCancelled();
            } catch (RemoteException e2) {
                zzbba.e("#007 Could not call remote method.", e2);
            }
        }
    }

    public final void b(zzafo zzafo) {
        this.f6891d = zzafo;
        zzahc<Object> zzahc = this.f6892e;
        if (zzahc != null) {
            this.f6889b.h("/unconfirmedClick", zzahc);
        }
        ih ihVar = new ih(this, zzafo);
        this.f6892e = ihVar;
        this.f6889b.d("/unconfirmedClick", ihVar);
    }

    public final zzafo c() {
        return this.f6891d;
    }

    public final void onClick(View view) {
        WeakReference<View> weakReference = this.h;
        if (weakReference != null && weakReference.get() == view) {
            if (!(this.f6893f == null || this.g == null)) {
                HashMap hashMap = new HashMap();
                hashMap.put("id", this.f6893f);
                hashMap.put("time_interval", String.valueOf(this.f6890c.a() - this.g.longValue()));
                hashMap.put("messageType", "onePointFiveClick");
                this.f6889b.e("sendMessageToNativeJs", hashMap);
            }
            d();
        }
    }
}
