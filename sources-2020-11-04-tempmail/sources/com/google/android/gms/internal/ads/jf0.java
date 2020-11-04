package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class jf0 extends PushbackInputStream {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ef0 f4323b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    jf0(ef0 ef0, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.f4323b = ef0;
    }

    public final synchronized void close() throws IOException {
        this.f4323b.f3907c.a();
        super.close();
    }
}
