package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzfl extends zzgm {
    private static zzgl<String> j = new zzgl<>();
    private final Context i;

    public zzfl(zzex zzex, String str, String str2, zzcf.zza.C0073zza zza, int i2, int i3, Context context) {
        super(zzex, str, str2, zza, i2, 29);
        this.i = context;
    }

    /* access modifiers changed from: protected */
    public final void a() throws IllegalAccessException, InvocationTargetException {
        this.f8886e.x0("E");
        AtomicReference<String> a2 = j.a(this.i.getPackageName());
        if (a2.get() == null) {
            synchronized (a2) {
                if (a2.get() == null) {
                    a2.set((String) this.f8887f.invoke((Object) null, new Object[]{this.i}));
                }
            }
        }
        String str = a2.get();
        synchronized (this.f8886e) {
            this.f8886e.x0(zzcv.a(str.getBytes(), true));
        }
    }
}
