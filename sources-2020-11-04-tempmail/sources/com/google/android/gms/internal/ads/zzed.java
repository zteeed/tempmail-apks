package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcf;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzed extends zzdy {
    private zzed(Context context, String str, boolean z, int i) {
        super(context, str, z, i);
    }

    public static zzed r(String str, Context context, boolean z) {
        return s(str, context, false, zzcw.f7804a);
    }

    public static zzed s(String str, Context context, boolean z, int i) {
        zzdy.j(context, z);
        zzdy.l(str, context, z, i);
        return new zzed(context, str, z, i);
    }

    /* access modifiers changed from: protected */
    public final List<Callable<Void>> i(zzex zzex, Context context, zzcf.zza.C0073zza zza, zzby.zza zza2) {
        if (zzex.r() == null || !this.v) {
            return super.i(zzex, context, zza, zza2);
        }
        int o = zzex.o();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.i(zzex, context, zza, zza2));
        arrayList.add(new zzfr(zzex, "dB9nU8T59ryKJmWsX8227JmprxMTr/BJUpIu7gXDsZZaHmbsnoTSiUl5TzUnFlE8", "5lhN2r0HBs7T9NDv68OqYdEED6z/p5KbOT380l1QTlE=", zza, o, 24));
        return arrayList;
    }
}
