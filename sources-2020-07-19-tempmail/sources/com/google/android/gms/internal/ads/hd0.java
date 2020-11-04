package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class hd0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IOException f3959b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ dd0 f3960c;

    hd0(dd0 dd0, IOException iOException) {
        this.f3960c = dd0;
        this.f3959b = iOException;
    }

    public final void run() {
        this.f3960c.f3639f.e(this.f3959b);
    }
}
