package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzsp {

    /* renamed from: a  reason: collision with root package name */
    private zzww f9270a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f9271b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9272c;

    /* renamed from: d  reason: collision with root package name */
    private final zzyq f9273d;
    @AppOpenAd.AppOpenAdOrientation

    /* renamed from: e  reason: collision with root package name */
    private final int f9274e;

    /* renamed from: f  reason: collision with root package name */
    private final AppOpenAd.AppOpenAdLoadCallback f9275f;
    private final zzamo g = new zzamo();

    public zzsp(Context context, String str, zzyq zzyq, @AppOpenAd.AppOpenAdOrientation int i, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.f9271b = context;
        this.f9272c = str;
        this.f9273d = zzyq;
        this.f9274e = i;
        this.f9275f = appOpenAdLoadCallback;
        zzvf zzvf = zzvf.f9371a;
    }

    public final void a() {
        try {
            this.f9270a = zzwg.b().e(this.f9271b, zzvh.J(), this.f9272c, this.g);
            this.f9270a.zza(new zzvo(this.f9274e));
            this.f9270a.zza((zzsg) new zzsd(this.f9275f));
            this.f9270a.zza(zzvf.b(this.f9271b, this.f9273d));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }
}
