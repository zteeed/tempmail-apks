package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzfq extends zzgm {
    public zzfq(zzex zzex, String str, String str2, zzcf.zza.C0074zza zza, int i, int i2) {
        super(zzex, str, str2, zza, i, 5);
    }

    /* access modifiers changed from: protected */
    public final void a() throws IllegalAccessException, InvocationTargetException {
        this.f8703e.c0(-1);
        this.f8703e.d0(-1);
        int[] iArr = (int[]) this.f8704f.invoke((Object) null, new Object[]{this.f8700b.a()});
        synchronized (this.f8703e) {
            this.f8703e.c0((long) iArr[0]);
            this.f8703e.d0((long) iArr[1]);
            if (iArr[2] != Integer.MIN_VALUE) {
                this.f8703e.P((long) iArr[2]);
            }
        }
    }
}
