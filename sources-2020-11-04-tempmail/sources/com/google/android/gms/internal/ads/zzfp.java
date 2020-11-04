package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzfp extends zzgm {
    private static volatile Long i;
    private static final Object j = new Object();

    public zzfp(zzex zzex, String str, String str2, zzcf.zza.C0073zza zza, int i2, int i3) {
        super(zzex, str, str2, zza, i2, 44);
    }

    /* access modifiers changed from: protected */
    public final void a() throws IllegalAccessException, InvocationTargetException {
        if (i == null) {
            synchronized (j) {
                if (i == null) {
                    i = (Long) this.f8887f.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f8886e) {
            this.f8886e.D(i.longValue());
        }
    }
}
