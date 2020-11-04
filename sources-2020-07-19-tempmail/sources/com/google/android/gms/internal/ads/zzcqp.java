package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.internal.ads.zzto;
import com.google.android.gms.internal.ads.zzty;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcqp {

    /* renamed from: a  reason: collision with root package name */
    private zztm f7376a;

    /* renamed from: b  reason: collision with root package name */
    private Context f7377b;

    /* renamed from: c  reason: collision with root package name */
    private zzcpz f7378c;

    /* renamed from: d  reason: collision with root package name */
    private zzbbd f7379d;

    public zzcqp(Context context, zzbbd zzbbd, zztm zztm, zzcpz zzcpz) {
        this.f7377b = context;
        this.f7379d = zzbbd;
        this.f7376a = zztm;
        this.f7378c = zzcpz;
    }

    public final void a() {
        try {
            this.f7378c.a(new fn(this));
        } catch (Exception e2) {
            String valueOf = String.valueOf(e2.getMessage());
            zzbba.g(valueOf.length() != 0 ? "Error in offline signals database startup: ".concat(valueOf) : new String("Error in offline signals database startup: "));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void b(SQLiteDatabase sQLiteDatabase) throws Exception {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        ArrayList<zzty.zzo.zza> b2 = zzcqm.b(sQLiteDatabase);
        zzty.zzo.zzb X = zzty.zzo.X();
        X.w(this.f7377b.getPackageName());
        X.x(Build.MODEL);
        int i = 0;
        X.y(zzcqm.a(sQLiteDatabase2, 0));
        X.C(b2);
        X.z(zzcqm.a(sQLiteDatabase2, 1));
        X.D(zzq.zzld().a());
        X.E(zzcqm.c(sQLiteDatabase2, 2));
        zzty.zzo zzo = (zzty.zzo) ((zzegb) X.O());
        int size = b2.size();
        long j = 0;
        int i2 = 0;
        while (i2 < size) {
            zzty.zzo.zza zza = b2.get(i2);
            i2++;
            zzty.zzo.zza zza2 = zza;
            if (zza2.j0() == zzui.ENUM_TRUE && zza2.G() > j) {
                j = zza2.G();
            }
        }
        if (j != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j));
            sQLiteDatabase2.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", (String[]) null);
        }
        this.f7376a.b(new hn(zzo));
        zzty.zzu.zza P = zzty.zzu.P();
        P.w(this.f7379d.f6132c);
        P.x(this.f7379d.f6133d);
        if (!this.f7379d.f6134e) {
            i = 2;
        }
        P.y(i);
        this.f7376a.b(new gn((zzty.zzu) ((zzegb) P.O())));
        this.f7376a.a(zzto.zza.C0085zza.OFFLINE_UPLOAD);
        sQLiteDatabase2.delete("offline_signal_contents", (String) null, (String[]) null);
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("value", 0);
        sQLiteDatabase2.update("offline_signal_statistics", contentValues2, "statistic_name = ?", new String[]{"failed_requests"});
        ContentValues contentValues3 = new ContentValues();
        contentValues3.put("value", 0);
        sQLiteDatabase2.update("offline_signal_statistics", contentValues3, "statistic_name = ?", new String[]{"total_requests"});
        return null;
    }
}
