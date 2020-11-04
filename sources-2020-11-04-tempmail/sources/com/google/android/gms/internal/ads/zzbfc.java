package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbfc extends zzbes {
    public zzbfc(zzbdb zzbdb) {
        super(zzbdb);
    }

    public final void c() {
    }

    public final boolean v(String str) {
        zzbdb zzbdb = (zzbdb) this.f6400d.get();
        if (zzbdb != null) {
            zzbdb.g(w(str), this);
        }
        zzbba.i("VideoStreamNoopCache is doing nothing.");
        l(str, w(str), "noop", "Noop cache is a noop.");
        return false;
    }
}
