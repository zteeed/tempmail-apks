package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzgg extends zzgm {
    private final zzfi i;
    private long j;

    public zzgg(zzex zzex, String str, String str2, zzcf.zza.C0073zza zza, int i2, int i3, zzfi zzfi) {
        super(zzex, str, str2, zza, i2, 53);
        this.i = zzfi;
        if (zzfi != null) {
            this.j = zzfi.e();
        }
    }

    /* access modifiers changed from: protected */
    public final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.i != null) {
            this.f8886e.M(((Long) this.f8887f.invoke((Object) null, new Object[]{Long.valueOf(this.j)})).longValue());
        }
    }
}
