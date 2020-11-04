package com.google.android.gms.measurement.internal;

import a.e.a;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzjw;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
public final class zzfs extends m7 implements a {
    @VisibleForTesting
    private static int j = 65535;
    @VisibleForTesting
    private static int k = 2;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, Map<String, String>> f10443d = new a();

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, Map<String, Boolean>> f10444e = new a();

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, Map<String, Boolean>> f10445f = new a();
    private final Map<String, zzby.zzb> g = new a();
    private final Map<String, Map<String, Integer>> h = new a();
    private final Map<String, String> i = new a();

    zzfs(zzkj zzkj) {
        super(zzkj);
    }

    private final void K(String str) {
        s();
        c();
        Preconditions.g(str);
        if (this.g.get(str) == null) {
            byte[] q0 = p().q0(str);
            if (q0 == null) {
                this.f10443d.put(str, (Object) null);
                this.f10444e.put(str, (Object) null);
                this.f10445f.put(str, (Object) null);
                this.g.put(str, (Object) null);
                this.i.put(str, (Object) null);
                this.h.put(str, (Object) null);
                return;
            }
            zzby.zzb.zza zza = (zzby.zzb.zza) w(str, q0).x();
            y(str, zza);
            this.f10443d.put(str, x((zzby.zzb) ((zzfo) zza.q())));
            this.g.put(str, (zzby.zzb) ((zzfo) zza.q()));
            this.i.put(str, (Object) null);
        }
    }

    private final zzby.zzb w(String str, byte[] bArr) {
        if (bArr == null) {
            return zzby.zzb.R();
        }
        try {
            zzby.zzb zzb = (zzby.zzb) ((zzfo) ((zzby.zzb.zza) zzkn.A(zzby.zzb.Q(), bArr)).q());
            zzew O = h().O();
            String str2 = null;
            Long valueOf = zzb.H() ? Long.valueOf(zzb.I()) : null;
            if (zzb.J()) {
                str2 = zzb.K();
            }
            O.c("Parsed config. version, gmp_app_id", valueOf, str2);
            return zzb;
        } catch (zzfw e2) {
            h().J().c("Unable to merge remote config. appId", zzeu.x(str), e2);
            return zzby.zzb.R();
        } catch (RuntimeException e3) {
            h().J().c("Unable to merge remote config. appId", zzeu.x(str), e3);
            return zzby.zzb.R();
        }
    }

    private static Map<String, String> x(zzby.zzb zzb) {
        a aVar = new a();
        if (zzb != null) {
            for (zzby.zzc next : zzb.L()) {
                aVar.put(next.D(), next.E());
            }
        }
        return aVar;
    }

    private final void y(String str, zzby.zzb.zza zza) {
        a aVar = new a();
        a aVar2 = new a();
        a aVar3 = new a();
        if (zza != null) {
            for (int i2 = 0; i2 < zza.C(); i2++) {
                zzby.zza.C0091zza zza2 = (zzby.zza.C0091zza) zza.D(i2).x();
                if (TextUtils.isEmpty(zza2.D())) {
                    h().J().a("EventConfig contained null event name");
                } else {
                    String b2 = zzgw.b(zza2.D());
                    if (!TextUtils.isEmpty(b2)) {
                        zza2.C(b2);
                        zza.E(i2, zza2);
                    }
                    aVar.put(zza2.D(), Boolean.valueOf(zza2.E()));
                    aVar2.put(zza2.D(), Boolean.valueOf(zza2.F()));
                    if (zza2.H()) {
                        if (zza2.I() < k || zza2.I() > j) {
                            h().J().c("Invalid sampling rate. Event name, sample rate", zza2.D(), Integer.valueOf(zza2.I()));
                        } else {
                            aVar3.put(zza2.D(), Integer.valueOf(zza2.I()));
                        }
                    }
                }
            }
        }
        this.f10444e.put(str, aVar);
        this.f10445f.put(str, aVar2);
        this.h.put(str, aVar3);
    }

    /* access modifiers changed from: protected */
    public final String A(String str) {
        c();
        return this.i.get(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean B(String str, String str2) {
        Boolean bool;
        c();
        K(str);
        if (I(str) && zzkr.C0(str2)) {
            return true;
        }
        if (J(str) && zzkr.d0(str2)) {
            return true;
        }
        Map map = this.f10444e.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: protected */
    public final void C(String str) {
        c();
        this.i.put(str, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public final boolean D(String str, String str2) {
        Boolean bool;
        c();
        K(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        if (zzjw.b() && l().t(zzaq.J0) && ("purchase".equals(str2) || "refund".equals(str2))) {
            return true;
        }
        Map map = this.f10445f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final int E(String str, String str2) {
        Integer num;
        c();
        K(str);
        Map map = this.h.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: package-private */
    public final void F(String str) {
        c();
        this.g.remove(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean G(String str) {
        c();
        zzby.zzb v = v(str);
        if (v == null) {
            return false;
        }
        return v.P();
    }

    /* access modifiers changed from: package-private */
    public final long H(String str) {
        String i2 = i(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(i2)) {
            return 0;
        }
        try {
            return Long.parseLong(i2);
        } catch (NumberFormatException e2) {
            h().J().c("Unable to parse timezone offset. appId", zzeu.x(str), e2);
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean I(String str) {
        return "1".equals(i(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: package-private */
    public final boolean J(String str) {
        return "1".equals(i(str, "measurement.upload.blacklist_public"));
    }

    public final String i(String str, String str2) {
        c();
        K(str);
        Map map = this.f10443d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean u() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final zzby.zzb v(String str) {
        s();
        c();
        Preconditions.g(str);
        K(str);
        return this.g.get(str);
    }

    /* access modifiers changed from: protected */
    public final boolean z(String str, byte[] bArr, String str2) {
        s();
        c();
        Preconditions.g(str);
        zzby.zzb.zza zza = (zzby.zzb.zza) w(str, bArr).x();
        if (zza == null) {
            return false;
        }
        y(str, zza);
        this.g.put(str, (zzby.zzb) ((zzfo) zza.q()));
        this.i.put(str, str2);
        this.f10443d.put(str, x((zzby.zzb) ((zzfo) zza.q())));
        p().O(str, new ArrayList(zza.F()));
        try {
            zza.H();
            bArr = ((zzby.zzb) ((zzfo) zza.q())).j();
        } catch (RuntimeException e2) {
            h().J().c("Unable to serialize reduced-size config. Storing full config instead. appId", zzeu.x(str), e2);
        }
        c p = p();
        Preconditions.g(str);
        p.c();
        p.s();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        try {
            if (((long) p.w().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                p.h().G().b("Failed to update remote config (got 0). appId", zzeu.x(str));
            }
        } catch (SQLiteException e3) {
            p.h().G().c("Error storing remote config. appId", zzeu.x(str), e3);
        }
        this.g.put(str, (zzby.zzb) ((zzfo) zza.q()));
        return true;
    }
}
