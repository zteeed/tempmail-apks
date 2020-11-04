package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.ads.zzcf;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzfr extends zzgm {
    public zzfr(zzex zzex, String str, String str2, zzcf.zza.C0074zza zza, int i, int i2) {
        super(zzex, str, str2, zza, i, 24);
    }

    private final void c() {
        AdvertisingIdClient D = this.f8700b.D();
        if (D != null) {
            try {
                AdvertisingIdClient.Info info = D.getInfo();
                String e2 = zzfg.e(info.getId());
                if (e2 != null) {
                    synchronized (this.f8703e) {
                        this.f8703e.H(e2);
                        this.f8703e.C(info.isLimitAdTrackingEnabled());
                        this.f8703e.w(zzcf.zza.zzc.DEVICE_IDENTIFIER_ANDROID_AD_ID);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.f8700b.v()) {
            c();
            return;
        }
        synchronized (this.f8703e) {
            this.f8703e.H((String) this.f8704f.invoke((Object) null, new Object[]{this.f8700b.a()}));
        }
    }

    /* renamed from: b */
    public final Void call() throws Exception {
        if (this.f8700b.b()) {
            return super.call();
        }
        if (!this.f8700b.v()) {
            return null;
        }
        c();
        return null;
    }
}
