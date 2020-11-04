package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class hd0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IOException f4142b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ dd0 f4143c;

    hd0(dd0 dd0, IOException iOException) {
        this.f4143c = dd0;
        this.f4142b = iOException;
    }

    public final void run() {
        this.f4143c.f3822f.e(this.f4142b);
    }
}
