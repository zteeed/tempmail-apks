package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public class zzare {
    @GuardedBy("InternalQueryInfoGenerator.class")

    /* renamed from: d  reason: collision with root package name */
    private static zzawr f6060d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f6061a;

    /* renamed from: b  reason: collision with root package name */
    private final AdFormat f6062b;

    /* renamed from: c  reason: collision with root package name */
    private final zzyq f6063c;

    public zzare(Context context, AdFormat adFormat, zzyq zzyq) {
        this.f6061a = context;
        this.f6062b = adFormat;
        this.f6063c = zzyq;
    }

    public static zzawr b(Context context) {
        zzawr zzawr;
        synchronized (zzare.class) {
            if (f6060d == null) {
                f6060d = zzwg.b().c(context, new zzamo());
            }
            zzawr = f6060d;
        }
        return zzawr;
    }

    public final void a(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzve zzve;
        zzawr b2 = b(this.f6061a);
        if (b2 == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        IObjectWrapper h0 = ObjectWrapper.h0(this.f6061a);
        zzyq zzyq = this.f6063c;
        if (zzyq == null) {
            zzve = new zzvd().a();
        } else {
            zzve = zzvf.b(this.f6061a, zzyq);
        }
        try {
            b2.Z4(h0, new zzawx((String) null, this.f6062b.name(), (zzvh) null, zzve), new m3(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
