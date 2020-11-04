package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzfs extends zzgm {
    private long i;

    public zzfs(zzex zzex, String str, String str2, zzcf.zza.C0074zza zza, long j, int i2, int i3) {
        super(zzex, str, str2, zza, i2, 25);
        this.i = j;
    }

    /* access modifiers changed from: protected */
    public final void a() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.f8704f.invoke((Object) null, new Object[0])).longValue();
        synchronized (this.f8703e) {
            this.f8703e.V(longValue);
            if (this.i != 0) {
                this.f8703e.j0(longValue - this.i);
                this.f8703e.m0(this.i);
            }
        }
    }
}
