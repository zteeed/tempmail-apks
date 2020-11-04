package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzcvl extends zzamw {

    /* renamed from: b  reason: collision with root package name */
    private final zzbsk f7777b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbtc f7778c;

    /* renamed from: d  reason: collision with root package name */
    private final zzbtl f7779d;

    /* renamed from: e  reason: collision with root package name */
    private final zzbtv f7780e;

    /* renamed from: f  reason: collision with root package name */
    private final zzbwj f7781f;
    private final zzbui g;
    private final zzbyz h;
    private final zzbwg i;
    private final zzbss j;

    public zzcvl(zzbsk zzbsk, zzbtc zzbtc, zzbtl zzbtl, zzbtv zzbtv, zzbwj zzbwj, zzbui zzbui, zzbyz zzbyz, zzbwg zzbwg, zzbss zzbss) {
        this.f7777b = zzbsk;
        this.f7778c = zzbtc;
        this.f7779d = zzbtl;
        this.f7780e = zzbtv;
        this.f7781f = zzbwj;
        this.g = zzbui;
        this.h = zzbyz;
        this.i = zzbwg;
        this.j = zzbss;
    }

    public final void D0(String str) {
    }

    public final void D1(String str) {
        this.j.P(new zzuy(0, str, ""));
    }

    public final void L0(zzamy zzamy) {
    }

    public void R3() {
        this.h.F0();
    }

    public void U(zzaud zzaud) throws RemoteException {
    }

    public void W2() throws RemoteException {
    }

    public void Y() {
        this.h.C0();
    }

    public final void b0(zzaep zzaep, String str) {
    }

    @Deprecated
    public final void g2(int i2) throws RemoteException {
        this.j.P(new zzuy(i2, "", ""));
    }

    public void i4(zzaub zzaub) {
    }

    public final void onAdClicked() {
        this.f7777b.onAdClicked();
    }

    public final void onAdClosed() {
        this.g.zzud();
    }

    public final void onAdFailedToLoad(int i2) {
    }

    public void onAdImpression() {
        this.f7778c.onAdImpression();
        this.i.C0();
    }

    public final void onAdLeftApplication() {
        this.f7779d.D0();
    }

    public final void onAdLoaded() {
        this.f7780e.onAdLoaded();
    }

    public final void onAdOpened() {
        this.g.zzue();
        this.i.D0();
    }

    public final void onAppEvent(String str, String str2) {
        this.f7781f.onAppEvent(str, str2);
    }

    public final void onVideoPause() {
        this.h.D0();
    }

    public final void onVideoPlay() throws RemoteException {
        this.h.E0();
    }

    public final void z2(int i2, String str) {
    }

    public final void zzb(Bundle bundle) throws RemoteException {
    }
}
