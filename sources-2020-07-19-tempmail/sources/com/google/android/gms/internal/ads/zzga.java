package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzga extends zzgm {
    public zzga(zzex zzex, String str, String str2, zzcf.zza.C0074zza zza, int i, int i2) {
        super(zzex, str, str2, zza, i, 3);
    }

    /* access modifiers changed from: protected */
    public final void a() throws IllegalAccessException, InvocationTargetException {
        boolean booleanValue = ((Boolean) zzwg.e().c(zzaav.c1)).booleanValue();
        zzek zzek = new zzek((String) this.f8704f.invoke((Object) null, new Object[]{this.f8700b.a(), Boolean.valueOf(booleanValue)}));
        synchronized (this.f8703e) {
            this.f8703e.a0(zzek.f8627b);
            this.f8703e.Q(zzek.f8628c);
        }
    }
}
