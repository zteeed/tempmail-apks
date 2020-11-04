package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class o9 extends FilterInputStream {

    /* renamed from: b  reason: collision with root package name */
    private final HttpURLConnection f4537b;

    o9(HttpURLConnection httpURLConnection) {
        super(zzbd.b(httpURLConnection));
        this.f4537b = httpURLConnection;
    }

    public final void close() throws IOException {
        super.close();
        this.f4537b.disconnect();
    }
}
