package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class t3 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final OutputStream f5130b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f5131c;

    t3(OutputStream outputStream, byte[] bArr) {
        this.f5130b = outputStream;
        this.f5131c = bArr;
    }

    public final void run() {
        zzash.v(this.f5130b, this.f5131c);
    }
}
