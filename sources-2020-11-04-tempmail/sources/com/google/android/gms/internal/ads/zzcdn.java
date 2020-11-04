package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcdn implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final zzcgr f7072b;

    /* renamed from: c  reason: collision with root package name */
    private final Clock f7073c;

    /* renamed from: d  reason: collision with root package name */
    private zzafo f7074d;

    /* renamed from: e  reason: collision with root package name */
    private zzahc<Object> f7075e;

    /* renamed from: f  reason: collision with root package name */
    String f7076f;
    Long g;
    WeakReference<View> h;

    public zzcdn(zzcgr zzcgr, Clock clock) {
        this.f7072b = zzcgr;
        this.f7073c = clock;
    }

    private final void d() {
        View view;
        this.f7076f = null;
        this.g = null;
        WeakReference<View> weakReference = this.h;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            view.setClickable(false);
            view.setOnClickListener((View.OnClickListener) null);
            this.h = null;
        }
    }

    public final void a() {
        if (this.f7074d != null && this.g != null) {
            d();
            try {
                this.f7074d.onUnconfirmedClickCancelled();
            } catch (RemoteException e2) {
                zzbba.e("#007 Could not call remote method.", e2);
            }
        }
    }

    public final void b(zzafo zzafo) {
        this.f7074d = zzafo;
        zzahc<Object> zzahc = this.f7075e;
        if (zzahc != null) {
            this.f7072b.h("/unconfirmedClick", zzahc);
        }
        ih ihVar = new ih(this, zzafo);
        this.f7075e = ihVar;
        this.f7072b.d("/unconfirmedClick", ihVar);
    }

    public final zzafo c() {
        return this.f7074d;
    }

    public final void onClick(View view) {
        WeakReference<View> weakReference = this.h;
        if (weakReference != null && weakReference.get() == view) {
            if (!(this.f7076f == null || this.g == null)) {
                HashMap hashMap = new HashMap();
                hashMap.put("id", this.f7076f);
                hashMap.put("time_interval", String.valueOf(this.f7073c.a() - this.g.longValue()));
                hashMap.put("messageType", "onePointFiveClick");
                this.f7072b.e("sendMessageToNativeJs", hashMap);
            }
            d();
        }
    }
}
