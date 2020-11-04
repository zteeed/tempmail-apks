package com.google.android.gms.internal.ads;

import android.provider.Settings;
import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzfm extends zzgm {
    public zzfm(zzex zzex, String str, String str2, zzcf.zza.C0074zza zza, int i, int i2) {
        super(zzex, str, str2, zza, i, 49);
    }

    /* access modifiers changed from: protected */
    public final void a() throws IllegalAccessException, InvocationTargetException {
        this.f8703e.X(zzcn.ENUM_FAILURE);
        try {
            this.f8703e.X(((Boolean) this.f8704f.invoke((Object) null, new Object[]{this.f8700b.a()})).booleanValue() ? zzcn.ENUM_TRUE : zzcn.ENUM_FALSE);
        } catch (InvocationTargetException e2) {
            if (!(e2.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e2;
            }
        }
    }
}
