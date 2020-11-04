package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzajc {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5925a;

    /* renamed from: b  reason: collision with root package name */
    private final zzwo f5926b;

    zzajc(Context context, zzwo zzwo) {
        this(context, zzwo, zzvf.f9371a);
    }

    private final void c(zzyq zzyq) {
        try {
            this.f5926b.x6(zzvf.b(this.f5925a, zzyq));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void a(AdRequest adRequest) {
        c(adRequest.zzdq());
    }

    public final void b(PublisherAdRequest publisherAdRequest) {
        c(publisherAdRequest.zzdq());
    }

    private zzajc(Context context, zzwo zzwo, zzvf zzvf) {
        this.f5925a = context;
        this.f5926b = zzwo;
    }
}
