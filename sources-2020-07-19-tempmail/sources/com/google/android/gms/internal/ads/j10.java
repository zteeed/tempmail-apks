package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class j10<V> implements Runnable {
    @NullableDecl

    /* renamed from: b  reason: collision with root package name */
    private i10<V> f4091b;

    j10(i10<V> i10) {
        this.f4091b = i10;
    }

    public final void run() {
        zzdvf I;
        String str;
        i10<V> i10 = this.f4091b;
        if (i10 != null && (I = i10.i) != null) {
            this.f4091b = null;
            if (I.isDone()) {
                i10.k(I);
                return;
            }
            try {
                ScheduledFuture L = i10.j;
                ScheduledFuture unused = i10.j = null;
                str = "Timed out";
                if (L != null) {
                    long abs = Math.abs(L.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        StringBuilder sb = new StringBuilder(str.length() + 66);
                        sb.append(str);
                        sb.append(" (timeout delayed by ");
                        sb.append(abs);
                        sb.append(" ms after scheduled time)");
                        str = sb.toString();
                    }
                }
                String valueOf = String.valueOf(str);
                String valueOf2 = String.valueOf(I);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(valueOf2).length());
                sb2.append(valueOf);
                sb2.append(": ");
                sb2.append(valueOf2);
                i10.j(new m10(sb2.toString()));
                I.cancel(true);
            } catch (Throwable th) {
                I.cancel(true);
                throw th;
            }
        }
    }
}
