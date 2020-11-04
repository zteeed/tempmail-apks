package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zztr {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    zzgy f9117a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    boolean f9118b;

    public zztr(Context context, String str, String str2) {
        zzaav.a(context);
        try {
            this.f9117a = (zzgy) zzbaz.a(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", mf0.f4391a);
            ObjectWrapper.b0(context);
            this.f9117a.w3(ObjectWrapper.b0(context), str, (String) null);
            this.f9118b = true;
        } catch (RemoteException | zzbbb | NullPointerException unused) {
            zzbba.f("Cannot dynamite load clearcut");
        }
    }

    public final zztv a(byte[] bArr) {
        return new zztv(this, bArr);
    }

    public zztr(Context context) {
        zzaav.a(context);
        if (((Boolean) zzwg.e().c(zzaav.i2)).booleanValue()) {
            try {
                this.f9117a = (zzgy) zzbaz.a(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", lf0.f4305a);
                ObjectWrapper.b0(context);
                this.f9117a.k1(ObjectWrapper.b0(context), "GMA_SDK");
                this.f9118b = true;
            } catch (RemoteException | zzbbb | NullPointerException unused) {
                zzbba.f("Cannot dynamite load clearcut");
            }
        }
    }

    public zztr() {
    }
}
