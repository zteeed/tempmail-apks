package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzfj extends zzgm {
    private final Activity i;
    private final View j;

    public zzfj(zzex zzex, String str, String str2, zzcf.zza.C0073zza zza, int i2, int i3, View view, Activity activity) {
        super(zzex, str, str2, zza, i2, 62);
        this.j = view;
        this.i = activity;
    }

    /* access modifiers changed from: protected */
    public final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.j != null) {
            boolean booleanValue = ((Boolean) zzwg.e().c(zzaav.a1)).booleanValue();
            Object[] objArr = (Object[]) this.f8887f.invoke((Object) null, new Object[]{this.j, this.i, Boolean.valueOf(booleanValue)});
            synchronized (this.f8886e) {
                this.f8886e.S(((Long) objArr[0]).longValue());
                this.f8886e.U(((Long) objArr[1]).longValue());
                if (booleanValue) {
                    this.f8886e.E((String) objArr[2]);
                }
            }
        }
    }
}
