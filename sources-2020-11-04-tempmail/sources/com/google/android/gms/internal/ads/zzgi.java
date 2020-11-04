package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzgi extends zzgm {
    public zzgi(zzex zzex, String str, String str2, zzcf.zza.C0073zza zza, int i, int i2) {
        super(zzex, str, str2, zza, i, 48);
    }

    /* access modifiers changed from: protected */
    public final void a() throws IllegalAccessException, InvocationTargetException {
        this.f8886e.z(zzcn.ENUM_FAILURE);
        boolean booleanValue = ((Boolean) this.f8887f.invoke((Object) null, new Object[]{this.f8883b.a()})).booleanValue();
        synchronized (this.f8886e) {
            if (booleanValue) {
                this.f8886e.z(zzcn.ENUM_TRUE);
            } else {
                this.f8886e.z(zzcn.ENUM_FALSE);
            }
        }
    }
}
