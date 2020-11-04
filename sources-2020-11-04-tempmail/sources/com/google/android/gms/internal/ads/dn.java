package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.internal.ads.zzty;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class dn implements zzdob {

    /* renamed from: a  reason: collision with root package name */
    private final en f3840a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3841b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList f3842c;

    /* renamed from: d  reason: collision with root package name */
    private final zzty.zzm f3843d;

    /* renamed from: e  reason: collision with root package name */
    private final zzty.zzo.zzc f3844e;

    dn(en enVar, boolean z, ArrayList arrayList, zzty.zzm zzm, zzty.zzo.zzc zzc) {
        this.f3840a = enVar;
        this.f3841b = z;
        this.f3842c = arrayList;
        this.f3843d = zzm;
        this.f3844e = zzc;
    }

    public final Object apply(Object obj) {
        en enVar = this.f3840a;
        boolean z = this.f3841b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        byte[] c2 = enVar.f3918b.d(z, this.f3842c, this.f3843d, this.f3844e);
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
