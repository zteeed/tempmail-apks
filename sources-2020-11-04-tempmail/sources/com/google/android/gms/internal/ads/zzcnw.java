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
        this.f7487f = new zzaru(context, zzq.zzlk().b(), this, this);
    }

    public final void H(Bundle bundle) {
        synchronized (this.f7483b) {
            if (!this.f7485d) {
                this.f7485d = true;
                try {
                    this.f7487f.e().P6(this.f7486e, new zzcob(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.f7482a.c(new zzcop(zzdls.f8363a));
                } catch (Throwable th) {
                    zzq.zzla().e(th, "RemoteAdRequestClientTask.onConnected");
                    this.f7482a.c(new zzcop(zzdls.f8363a));
                }
            }
        }
    }

    public final zzdvf<InputStream> b(zzasm zzasm) {
        synchronized (this.f7483b) {
            if (this.f7484c) {
                zzbbn<InputStream> zzbbn = this.f7482a;
                return zzbbn;
            }
            this.f7484c = true;
            this.f7486e = zzasm;
            this.f7487f.checkAvailabilityAndConnect();
            this.f7482a.f(new ul(this), zzbbf.f6325f);
            zzbbn<InputStream> zzbbn2 = this.f7482a;
            return zzbbn2;
        }
    }

    public final void h0(ConnectionResult connectionResult) {
        zzbba.f("Cannot connect to remote service, fallback to local instance.");
        this.f7482a.c(new zzcop(zzdls.f8363a));
    }
}
