package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzge extends zzgm {
    private final StackTraceElement[] i;

    public zzge(zzex zzex, String str, String str2, zzcf.zza.C0073zza zza, int i2, int i3, StackTraceElement[] stackTraceElementArr) {
        super(zzex, str, str2, zza, i2, 45);
        this.i = stackTraceElementArr;
    }

    /* access modifiers changed from: protected */
    public final void a() throws IllegalAccessException, InvocationTargetException {
        zzcn zzcn;
        Object obj = this.i;
        if (obj != null) {
            zzet zzet = new zzet((String) this.f8887f.invoke((Object) null, new Object[]{obj}));
            synchronized (this.f8886e) {
                this.f8886e.F(zzet.f8848b.longValue());
                if (zzet.f8849c.booleanValue()) {
                    zzcf.zza.C0073zza zza = this.f8886e;
                    if (zzet.f8850d.booleanValue()) {
                        zzcn = zzcn.ENUM_FALSE;
                    } else {
                        zzcn = zzcn.ENUM_TRUE;
                    }
                    zza.Y(zzcn);
                } else {
                    this.f8886e.Y(zzcn.ENUM_FAILURE);
                }
            }
        }
    }
}
