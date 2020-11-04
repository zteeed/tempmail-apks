package com.google.android.gms.internal.ads;

import java.io.PrintWriter;

/* compiled from: com.google.android.gms:play-services-ads-base@@19.2.0 */
final class k50 extends f50 {
    k50() {
    }

    public final void a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
    }

    public final void b(Throwable th, Throwable th2) {
        th.addSuppressed(th2);
    }
}
