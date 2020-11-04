package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzfz extends zzgm {
    public zzfz(zzex zzex, String str, String str2, zzcf.zza.C0073zza zza, int i, int i2) {
        super(zzex, str, str2, zza, i, 73);
    }

    /* access modifiers changed from: protected */
    public final void a() throws IllegalAccessException, InvocationTargetException {
        try {
            this.f8886e.Z(((Boolean) this.f8887f.invoke((Object) null, new Object[]{this.f8883b.a()})).booleanValue() ? zzcn.ENUM_TRUE : zzcn.ENUM_FALSE);
        } catch (InvocationTargetException unused) {
            this.f8886e.Z(zzcn.ENUM_FAILURE);
        }
    }
}
