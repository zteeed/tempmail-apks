package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzft extends zzgm {
    private static volatile Long i;
    private static final Object j = new Object();

    public zzft(zzex zzex, String str, String str2, zzcf.zza.C0074zza zza, int i2, int i3) {
        super(zzex, str, str2, zza, i2, 22);
    }

    /* access modifiers changed from: protected */
    public final void a() throws IllegalAccessException, InvocationTargetException {
        if (i == null) {
            synchronized (j) {
                if (i == null) {
                    i = (Long) this.f8704f.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f8703e) {
            this.f8703e.l0(i.longValue());
        }
    }
}
