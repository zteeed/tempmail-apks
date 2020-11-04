package com.android.billingclient.api;

import com.android.billingclient.api.d;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
final class v implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ g f2587b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ d.a f2588c;

    v(d.a aVar, g gVar) {
        this.f2588c = aVar;
        this.f2587b = gVar;
    }

    public final void run() {
        synchronized (this.f2588c.f2498a) {
            if (this.f2588c.f2500c != null) {
                this.f2588c.f2500c.j(this.f2587b);
            }
        }
    }
}
