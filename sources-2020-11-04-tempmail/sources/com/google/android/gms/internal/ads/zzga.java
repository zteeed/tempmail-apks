package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzga extends zzgm {
    public zzga(zzex zzex, String str, String str2, zzcf.zza.C0073zza zza, int i, int i2) {
        super(zzex, str, str2, zza, i, 3);
    }

    /* access modifiers changed from: protected */
    public final void a() throws IllegalAccessException, InvocationTargetException {
        boolean booleanValue = ((Boolean) zzwg.e().c(zzaav.c1)).booleanValue();
        zzek zzek = new zzek((String) this.f8887f.invoke((Object) null, new Object[]{this.f8883b.a(), Boolean.valueOf(booleanValue)}));
        synchronized (this.f8886e) {
            this.f8886e.a0(zzek.f8810b);
            this.f8886e.Q(zzek.f8811c);
        }
    }
}
