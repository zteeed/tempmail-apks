package com.google.android.gms.internal.ads;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.zzty;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcqm {
    public static int a(SQLiteDatabase sQLiteDatabase, int i) {
        int i2 = 0;
        if (i == 2) {
            return 0;
        }
        Cursor d2 = d(sQLiteDatabase, i);
        if (d2.getCount() > 0) {
            d2.moveToNext();
            i2 = 0 + d2.getInt(d2.getColumnIndexOrThrow("value"));
        }
        d2.close();
        return i2;
    }

    public static ArrayList<zzty.zzo.zza> b(SQLiteDatabase sQLiteDatabase) {
        ArrayList<zzty.zzo.zza> arrayList = new ArrayList<>();
        Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        while (query.moveToNext()) {
            try {
                arrayList.add(zzty.zzo.zza.i0(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (zzegl e2) {
                zzbba.g("Unable to deserialize proto from offline signals database:");
                zzbba.g(e2.getMessage());
            }
        }
        query.close();
        return arrayList;
    }

    public static long c(SQLiteDatabase sQLiteDatabase, int i) {
        Cursor d2 = d(sQLiteDatabase, 2);
        long j = 0;
        if (d2.getCount() > 0) {
            d2.moveToNext();
            j = 0 + d2.getLong(d2.getColumnIndexOrThrow("value"));
        }
        d2.close();
        return j;
    }

    private static Cursor d(SQLiteDatabase sQLiteDatabase, int i) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i == 0) {
            strArr2[0] = "failed_requests";
        } else if (i == 1) {
            strArr2[0] = "total_requests";
        } else if (i == 2) {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, (String) null, (String) null, (String) null);
    }
}
