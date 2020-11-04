package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzcvl extends zzamw {

    /* renamed from: b  reason: collision with root package name */
    private final zzbsk f7594b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbtc f7595c;

    /* renamed from: d  reason: collision with root package name */
    private final zzbtl f7596d;

    /* renamed from: e  reason: collision with root package name */
    private final zzbtv f7597e;

    /* renamed from: f  reason: collision with root package name */
    private final zzbwj f7598f;
    private final zzbui g;
    private final zzbyz h;
    private final zzbwg i;
    private final zzbss j;

    public zzcvl(zzbsk zzbsk, zzbtc zzbtc, zzbtl zzbtl, zzbtv zzbtv, zzbwj zzbwj, zzbui zzbui, zzbyz zzbyz, zzbwg zzbwg, zzbss zzbss) {
        this.f7594b = zzbsk;
        this.f7595c = zzbtc;
        this.f7596d = zzbtl;
        this.f7597e = zzbtv;
        this.f7598f = zzbwj;
        this.g = zzbui;
        this.h = zzbyz;
        this.i = zzbwg;
        this.j = zzbss;
    }

    public void D3() {
        this.h.F0();
    }

    public final void F0(zzamy zzamy) {
    }

    public void K2() throws RemoteException {
    }

    public void O(zzaud zzaud) throws RemoteException {
    }

    public void R3(zzaub zzaub) {
    }

    public void S() {
        this.h.C0();
    }

    public final void V(zzaep zzaep, String str) {
    }

    @Deprecated
    public final void W1(int i2) throws RemoteException {
        this.j.P(new zzuy(i2, "", ""));
    }

    public final void o2(int i2, String str) {
    }

    public final void onAdClicked() {
        this.f7594b.onAdClicked();
    }

    public final void onAdClosed() {
        this.g.zzud();
    }

    public final void onAdFailedToLoad(int i2) {
    }

    public void onAdImpression() {
        this.f7595c.onAdImpression();
        this.i.C0();
    }

    public final void onAdLeftApplication() {
        this.f7596d.D0();
    }

    public final void onAdLoaded() {
        this.f7597e.onAdLoaded();
    }

    public final void onAdOpened() {
        this.g.zzue();
        this.i.D0();
    }

    public final void onAppEvent(String str, String str2) {
        this.f7598f.onAppEvent(str, str2);
    }

    public final void onVideoPause() {
        this.h.D0();
    }

    public final void onVideoPlay() throws RemoteException {
        this.h.E0();
    }

    public final void u1(String str) {
        this.j.P(new zzuy(0, str, ""));
    }

    public final void x0(String str) {
    }

    public final void zzb(Bundle bundle) throws RemoteException {
    }
}
