package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzge extends zzgm {
    private final StackTraceElement[] i;

    public zzge(zzex zzex, String str, String str2, zzcf.zza.C0074zza zza, int i2, int i3, StackTraceElement[] stackTraceElementArr) {
        super(zzex, str, str2, zza, i2, 45);
        this.i = stackTraceElementArr;
    }

    /* access modifiers changed from: protected */
    public final void a() throws IllegalAccessException, InvocationTargetException {
        zzcn zzcn;
        Object obj = this.i;
        if (obj != null) {
            zzet zzet = new zzet((String) this.f8704f.invoke((Object) null, new Object[]{obj}));
            synchronized (this.f8703e) {
                this.f8703e.F(zzet.f8665b.longValue());
                if (zzet.f8666c.booleanValue()) {
                    zzcf.zza.C0074zza zza = this.f8703e;
                    if (zzet.f8667d.booleanValue()) {
                        zzcn = zzcn.ENUM_FALSE;
                    } else {
                        zzcn = zzcn.ENUM_TRUE;
                    }
                    zza.Y(zzcn);
                } else {
                    this.f8703e.Y(zzcn.ENUM_FAILURE);
                }
            }
        }
    }
}
