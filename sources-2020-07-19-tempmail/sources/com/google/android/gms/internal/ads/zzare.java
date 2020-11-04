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
    private static zzawr f5877d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f5878a;

    /* renamed from: b  reason: collision with root package name */
    private final AdFormat f5879b;

    /* renamed from: c  reason: collision with root package name */
    private final zzyq f5880c;

    public zzare(Context context, AdFormat adFormat, zzyq zzyq) {
        this.f5878a = context;
        this.f5879b = adFormat;
        this.f5880c = zzyq;
    }

    public static zzawr b(Context context) {
        zzawr zzawr;
        synchronized (zzare.class) {
            if (f5877d == null) {
                f5877d = zzwg.b().c(context, new zzamo());
            }
            zzawr = f5877d;
        }
        return zzawr;
    }

    public final void a(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzve zzve;
        zzawr b2 = b(this.f5878a);
        if (b2 == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        IObjectWrapper b0 = ObjectWrapper.b0(this.f5878a);
        zzyq zzyq = this.f5880c;
        if (zzyq == null) {
            zzve = new zzvd().a();
        } else {
            zzve = zzvf.b(this.f5878a, zzyq);
        }
        try {
            b2.F4(b0, new zzawx((String) null, this.f5879b.name(), (zzvh) null, zzve), new m3(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
