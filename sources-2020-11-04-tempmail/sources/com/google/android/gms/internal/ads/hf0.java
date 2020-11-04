package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class hf0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final ef0 f4147b;

    /* renamed from: c  reason: collision with root package name */
    private final zzsz f4148c;

    /* renamed from: d  reason: collision with root package name */
    private final zzsy f4149d;

    /* renamed from: e  reason: collision with root package name */
    private final zzbbn f4150e;

    hf0(ef0 ef0, zzsz zzsz, zzsy zzsy, zzbbn zzbbn) {
        this.f4147b = ef0;
        this.f4148c = zzsz;
        this.f4149d = zzsy;
        this.f4150e = zzbbn;
    }

    public final void run() {
        ef0 ef0 = this.f4147b;
        zzsz zzsz = this.f4148c;
        zzsy zzsy = this.f4149d;
        zzbbn zzbbn = this.f4150e;
        try {
            zzsx C0 = zzsz.e().C0(zzsy);
            if (!C0.u()) {
                zzbbn.c(new RuntimeException("No entry contents."));
                ef0.f3907c.a();
                return;
            }
            jf0 jf0 = new jf0(ef0, C0.v(), 1);
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
            ef0.f3907c.a();
        }
    }
}
