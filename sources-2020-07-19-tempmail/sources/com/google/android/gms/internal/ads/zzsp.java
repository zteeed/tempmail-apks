package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzsp {

    /* renamed from: a  reason: collision with root package name */
    private zzww f9087a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f9088b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9089c;

    /* renamed from: d  reason: collision with root package name */
    private final zzyq f9090d;
    @AppOpenAd.AppOpenAdOrientation

    /* renamed from: e  reason: collision with root package name */
    private final int f9091e;

    /* renamed from: f  reason: collision with root package name */
    private final AppOpenAd.AppOpenAdLoadCallback f9092f;
    private final zzamo g = new zzamo();

    public zzsp(Context context, String str, zzyq zzyq, @AppOpenAd.AppOpenAdOrientation int i, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.f9088b = context;
        this.f9089c = str;
        this.f9090d = zzyq;
        this.f9091e = i;
        this.f9092f = appOpenAdLoadCallback;
        zzvf zzvf = zzvf.f9188a;
    }

    public final void a() {
        try {
            this.f9087a = zzwg.b().e(this.f9088b, zzvh.J(), this.f9089c, this.g);
            this.f9087a.zza(new zzvo(this.f9091e));
            this.f9087a.zza((zzsg) new zzsd(this.f9092f));
            this.f9087a.zza(zzvf.b(this.f9088b, this.f9090d));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }
}
