package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.ConnectionResult;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcnw extends zzcny {
    public zzcnw(Context context) {
        this.f7304f = new zzaru(context, zzq.zzlk().b(), this, this);
    }

    public final void E(Bundle bundle) {
        synchronized (this.f7300b) {
            if (!this.f7302d) {
                this.f7302d = true;
                try {
                    this.f7304f.e().n6(this.f7303e, new zzcob(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.f7299a.c(new zzcop(zzdls.f8180a));
                } catch (Throwable th) {
                    zzq.zzla().e(th, "RemoteAdRequestClientTask.onConnected");
                    this.f7299a.c(new zzcop(zzdls.f8180a));
                }
            }
        }
    }

    public final zzdvf<InputStream> b(zzasm zzasm) {
        synchronized (this.f7300b) {
            if (this.f7301c) {
                zzbbn<InputStream> zzbbn = this.f7299a;
                return zzbbn;
            }
            this.f7301c = true;
            this.f7303e = zzasm;
            this.f7304f.checkAvailabilityAndConnect();
            this.f7299a.f(new ul(this), zzbbf.f6142f);
            zzbbn<InputStream> zzbbn2 = this.f7299a;
            return zzbbn2;
        }
    }

    public final void b0(ConnectionResult connectionResult) {
        zzbba.f("Cannot connect to remote service, fallback to local instance.");
        this.f7299a.c(new zzcop(zzdls.f8180a));
    }
}
