package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.ConnectionResult;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcof extends zzcny {
    private String g;
    private int h = yl.f5583a;

    public zzcof(Context context) {
        this.f7487f = new zzaru(context, zzq.zzlk().b(), this, this);
    }

    public final void H(Bundle bundle) {
        synchronized (this.f7483b) {
            if (!this.f7485d) {
                this.f7485d = true;
                try {
                    if (this.h == yl.f5584b) {
                        this.f7487f.e().P1(this.f7486e, new zzcob(this));
                    } else if (this.h == yl.f5585c) {
                        this.f7487f.e().r4(this.g, new zzcob(this));
                    } else {
                        this.f7482a.c(new zzcop(zzdls.f8363a));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.f7482a.c(new zzcop(zzdls.f8363a));
                } catch (Throwable th) {
                    zzq.zzla().e(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    this.f7482a.c(new zzcop(zzdls.f8363a));
                }
            }
        }
    }

    public final zzdvf<InputStream> b(String str) {
        synchronized (this.f7483b) {
            if (this.h != yl.f5583a && this.h != yl.f5585c) {
                zzdvf<InputStream> a2 = zzdux.a(new zzcop(zzdls.f8364b));
                return a2;
            } else if (this.f7484c) {
                zzbbn<InputStream> zzbbn = this.f7482a;
                return zzbbn;
            } else {
                this.h = yl.f5585c;
                this.f7484c = true;
                this.g = str;
                this.f7487f.checkAvailabilityAndConnect();
                this.f7482a.f(new zl(this), zzbbf.f6325f);
                zzbbn<InputStream> zzbbn2 = this.f7482a;
                return zzbbn2;
            }
        }
    }

    public final zzdvf<InputStream> c(zzasm zzasm) {
        synchronized (this.f7483b) {
            if (this.h != yl.f5583a && this.h != yl.f5584b) {
                zzdvf<InputStream> a2 = zzdux.a(new zzcop(zzdls.f8364b));
                return a2;
            } else if (this.f7484c) {
                zzbbn<InputStream> zzbbn = this.f7482a;
                return zzbbn;
            } else {
                this.h = yl.f5584b;
                this.f7484c = true;
                this.f7486e = zzasm;
                this.f7487f.checkAvailabilityAndConnect();
                this.f7482a.f(new xl(this), zzbbf.f6325f);
                zzbbn<InputStream> zzbbn2 = this.f7482a;
                return zzbbn2;
            }
        }
    }

    public final void h0(ConnectionResult connectionResult) {
        zzbba.f("Cannot connect to remote service, fallback to local instance.");
        this.f7482a.c(new zzcop(zzdls.f8363a));
    }
}
