package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzcuj extends zzcvl {
    private zzbyq k;

    public zzcuj(zzbsk zzbsk, zzbtc zzbtc, zzbtl zzbtl, zzbtv zzbtv, zzbss zzbss, zzbwj zzbwj, zzbyz zzbyz, zzbui zzbui, zzbyq zzbyq, zzbwg zzbwg) {
        super(zzbsk, zzbtc, zzbtl, zzbtv, zzbwj, zzbui, zzbyz, zzbwg, zzbss);
        this.k = zzbyq;
    }

    public final void R3() {
        this.k.N();
    }

    public final void U(zzaud zzaud) throws RemoteException {
        super.U(zzaud);
        this.k.Q(new zzaub(zzaud.getType(), zzaud.getAmount()));
    }

    public final void W2() throws RemoteException {
        this.k.I();
    }

    public final void Y() {
        this.k.I();
    }

    public final void i4(zzaub zzaub) {
        super.i4(zzaub);
        this.k.Q(zzaub);
    }
}
