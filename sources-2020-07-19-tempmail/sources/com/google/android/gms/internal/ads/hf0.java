package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class hf0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final ef0 f3964b;

    /* renamed from: c  reason: collision with root package name */
    private final zzsz f3965c;

    /* renamed from: d  reason: collision with root package name */
    private final zzsy f3966d;

    /* renamed from: e  reason: collision with root package name */
    private final zzbbn f3967e;

    hf0(ef0 ef0, zzsz zzsz, zzsy zzsy, zzbbn zzbbn) {
        this.f3964b = ef0;
        this.f3965c = zzsz;
        this.f3966d = zzsy;
        this.f3967e = zzbbn;
    }

    public final void run() {
        ef0 ef0 = this.f3964b;
        zzsz zzsz = this.f3965c;
        zzsy zzsy = this.f3966d;
        zzbbn zzbbn = this.f3967e;
        try {
            zzsx w0 = zzsz.e().w0(zzsy);
            if (!w0.u()) {
                zzbbn.c(new RuntimeException("No entry contents."));
                ef0.f3724c.a();
                return;
            }
            jf0 jf0 = new jf0(ef0, w0.v(), 1);
            int read = jf0.read();
            if (read != -1) {
                jf0.unread(read);
                zzbbn.a(jf0);
                return;
            }
            throw new IOException("Unable to read from cache.");
        } catch (RemoteException | IOException e2) {
            zzbba.c("Unable to obtain a cache service instance.", e2);
            zzbbn.c(e2);
            ef0.f3724c.a();
        }
    }
}
