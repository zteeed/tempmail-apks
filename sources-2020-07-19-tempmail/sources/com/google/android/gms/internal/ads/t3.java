package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class t3 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final OutputStream f4947b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f4948c;

    t3(OutputStream outputStream, byte[] bArr) {
        this.f4947b = outputStream;
        this.f4948c = bArr;
    }

    public final void run() {
        zzash.v(this.f4947b, this.f4948c);
    }
}
