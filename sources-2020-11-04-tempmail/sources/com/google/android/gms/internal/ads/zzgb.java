package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzgb extends zzgm {
    private final boolean i;

    public zzgb(zzex zzex, String str, String str2, zzcf.zza.C0073zza zza, int i2, int i3) {
        super(zzex, str, str2, zza, i2, 61);
        this.i = zzex.q();
    }

    /* access modifiers changed from: protected */
    public final void a() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.f8887f.invoke((Object) null, new Object[]{this.f8883b.a(), Boolean.valueOf(this.i)})).longValue();
        synchronized (this.f8886e) {
            this.f8886e.R(longValue);
        }
    }
}
