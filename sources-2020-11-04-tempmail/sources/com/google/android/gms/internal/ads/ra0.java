package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ra0 extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ pa0 f4987a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ra0(pa0 pa0, Looper looper) {
        super(looper);
        this.f4987a = pa0;
    }

    public final void handleMessage(Message message) {
        this.f4987a.k(message);
    }
}
