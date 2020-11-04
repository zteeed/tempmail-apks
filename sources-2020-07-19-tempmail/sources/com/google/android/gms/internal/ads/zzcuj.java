package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzcuj extends zzcvl {
    private zzbyq k;

    public zzcuj(zzbsk zzbsk, zzbtc zzbtc, zzbtl zzbtl, zzbtv zzbtv, zzbss zzbss, zzbwj zzbwj, zzbyz zzbyz, zzbui zzbui, zzbyq zzbyq, zzbwg zzbwg) {
        super(zzbsk, zzbtc, zzbtl, zzbtv, zzbwj, zzbui, zzbyz, zzbwg, zzbss);
        this.k = zzbyq;
    }

    public final void D3() {
        this.k.N();
    }

    public final void K2() throws RemoteException {
        this.k.I();
    }

    public final void O(zzaud zzaud) throws RemoteException {
        super.O(zzaud);
        this.k.Q(new zzaub(zzaud.getType(), zzaud.getAmount()));
    }

    public final void R3(zzaub zzaub) {
        super.R3(zzaub);
        this.k.Q(zzaub);
    }

    public final void S() {
        this.k.I();
    }
}
