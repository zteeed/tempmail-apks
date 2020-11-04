package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.internal.ads.zzty;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class dn implements zzdob {

    /* renamed from: a  reason: collision with root package name */
    private final en f3657a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3658b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList f3659c;

    /* renamed from: d  reason: collision with root package name */
    private final zzty.zzm f3660d;

    /* renamed from: e  reason: collision with root package name */
    private final zzty.zzo.zzc f3661e;

    dn(en enVar, boolean z, ArrayList arrayList, zzty.zzm zzm, zzty.zzo.zzc zzc) {
        this.f3657a = enVar;
        this.f3658b = z;
        this.f3659c = arrayList;
        this.f3660d = zzm;
        this.f3661e = zzc;
    }

    public final Object apply(Object obj) {
        en enVar = this.f3657a;
        boolean z = this.f3658b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        byte[] c2 = enVar.f3735b.d(z, this.f3659c, this.f3660d, this.f3661e);
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzq.zzld().a()));
        contentValues.put("serialized_proto_data", c2);
        sQLiteDatabase.insert("offline_signal_contents", (String) null, contentValues);
        sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", new Object[]{"total_requests"}));
        if (!z) {
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", new Object[]{"failed_requests"}));
        }
        return null;
    }
}
