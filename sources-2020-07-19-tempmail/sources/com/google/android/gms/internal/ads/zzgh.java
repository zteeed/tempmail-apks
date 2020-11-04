package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzgh extends zzgm {
    private final View i;

    public zzgh(zzex zzex, String str, String str2, zzcf.zza.C0074zza zza, int i2, int i3, View view) {
        super(zzex, str, str2, zza, i2, 57);
        this.i = view;
    }

    /* access modifiers changed from: protected */
    public final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.i != null) {
            Boolean bool = (Boolean) zzwg.e().c(zzaav.o1);
            DisplayMetrics displayMetrics = this.f8700b.a().getResources().getDisplayMetrics();
            zzff zzff = new zzff((String) this.f8704f.invoke((Object) null, new Object[]{this.i, displayMetrics, bool}));
            zzcf.zza.zzf.C0076zza H = zzcf.zza.zzf.H();
            H.w(zzff.f8682b.longValue());
            H.x(zzff.f8683c.longValue());
            H.y(zzff.f8684d.longValue());
            if (bool.booleanValue()) {
                H.z(zzff.f8685e.longValue());
            }
            this.f8703e.y((zzcf.zza.zzf) ((zzegb) H.O()));
        }
    }
}
