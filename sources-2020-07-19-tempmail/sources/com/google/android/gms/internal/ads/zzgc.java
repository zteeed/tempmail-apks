package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzgc extends zzgm {
    private List<Long> i = null;

    public zzgc(zzex zzex, String str, String str2, zzcf.zza.C0074zza zza, int i2, int i3) {
        super(zzex, str, str2, zza, i2, 31);
    }

    /* access modifiers changed from: protected */
    public final void a() throws IllegalAccessException, InvocationTargetException {
        this.f8703e.n0(-1);
        this.f8703e.o0(-1);
        if (this.i == null) {
            this.i = (List) this.f8704f.invoke((Object) null, new Object[]{this.f8700b.a()});
        }
        List<Long> list = this.i;
        if (list != null && list.size() == 2) {
            synchronized (this.f8703e) {
                this.f8703e.n0(this.i.get(0).longValue());
                this.f8703e.o0(this.i.get(1).longValue());
            }
        }
    }
}
