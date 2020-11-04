package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-base@@19.2.0 */
final class j50 extends f50 {

    /* renamed from: a  reason: collision with root package name */
    private final i50 f4101a = new i50();

    j50() {
    }

    public final void a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        List<Throwable> a2 = this.f4101a.a(th, false);
        if (a2 != null) {
            synchronized (a2) {
                for (Throwable printStackTrace : a2) {
                    printWriter.print("Suppressed: ");
                    printStackTrace.printStackTrace(printWriter);
                }
            }
        }
    }

    public final void b(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f4101a.a(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
