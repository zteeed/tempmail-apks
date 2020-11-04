package com.google.android.gms.measurement.internal;

import a.e.a;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzbt;
import com.google.android.gms.internal.measurement.zzcb;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzlm;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class c extends m7 {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f10120f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    /* access modifiers changed from: private */
    public static final String[] g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    /* access modifiers changed from: private */
    public static final String[] h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"};
    /* access modifiers changed from: private */
    public static final String[] i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    /* access modifiers changed from: private */
    public static final String[] j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    /* access modifiers changed from: private */
    public static final String[] k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */
    public static final String[] l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */
    public static final String[] m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d  reason: collision with root package name */
    private final d f10121d = new d(this, f(), "google_app_measurement.db");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final j7 f10122e = new j7(n());

    c(zzkj zzkj) {
        super(zzkj);
    }

    @VisibleForTesting
    private final Object F(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            h().G().a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i2));
            }
            if (type == 3) {
                return cursor.getString(i2);
            }
            if (type != 4) {
                h().G().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            h().G().a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    private static void L(ContentValues contentValues, String str, Object obj) {
        Preconditions.g(str);
        Preconditions.k(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    private final boolean U(String str, int i2, zzbt.zzb zzb) {
        s();
        c();
        Preconditions.g(str);
        Preconditions.k(zzb);
        Integer num = null;
        if (TextUtils.isEmpty(zzb.K())) {
            zzew J = h().J();
            Object x = zzeu.x(str);
            Integer valueOf = Integer.valueOf(i2);
            if (zzb.I()) {
                num = Integer.valueOf(zzb.J());
            }
            J.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", x, valueOf, String.valueOf(num));
            return false;
        }
        byte[] j2 = zzb.j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        contentValues.put("filter_id", zzb.I() ? Integer.valueOf(zzb.J()) : null);
        contentValues.put("event_name", zzb.K());
        contentValues.put("session_scoped", zzb.S() ? Boolean.valueOf(zzb.T()) : null);
        contentValues.put("data", j2);
        try {
            if (w().insertWithOnConflict("event_filters", (String) null, contentValues, 5) != -1) {
                return true;
            }
            h().G().b("Failed to insert event filter (got -1). appId", zzeu.x(str));
            return true;
        } catch (SQLiteException e2) {
            h().G().c("Error storing event filter. appId", zzeu.x(str), e2);
            return false;
        }
    }

    private final boolean V(String str, int i2, zzbt.zze zze) {
        s();
        c();
        Preconditions.g(str);
        Preconditions.k(zze);
        Integer num = null;
        if (TextUtils.isEmpty(zze.H())) {
            zzew J = h().J();
            Object x = zzeu.x(str);
            Integer valueOf = Integer.valueOf(i2);
            if (zze.F()) {
                num = Integer.valueOf(zze.G());
            }
            J.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", x, valueOf, String.valueOf(num));
            return false;
        }
        byte[] j2 = zze.j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        contentValues.put("filter_id", zze.F() ? Integer.valueOf(zze.G()) : null);
        contentValues.put("property_name", zze.H());
        contentValues.put("session_scoped", zze.L() ? Boolean.valueOf(zze.M()) : null);
        contentValues.put("data", j2);
        try {
            if (w().insertWithOnConflict("property_filters", (String) null, contentValues, 5) != -1) {
                return true;
            }
            h().G().b("Failed to insert property filter (got -1). appId", zzeu.x(str));
            return false;
        } catch (SQLiteException e2) {
            h().G().c("Error storing property filter. appId", zzeu.x(str), e2);
            return false;
        }
    }

    @VisibleForTesting
    private final boolean h0() {
        return f().getDatabasePath("google_app_measurement.db").exists();
    }

    private final long i0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = w().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j2 = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j2;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e2) {
            h().G().c("Database error", str, e2);
            throw e2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private final boolean m0(String str, List<Integer> list) {
        Preconditions.g(str);
        s();
        c();
        SQLiteDatabase w = w();
        try {
            long i0 = i0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, l().v(str, zzaq.F)));
            if (i0 <= ((long) max)) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Integer num = list.get(i2);
                if (num == null || !(num instanceof Integer)) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(",", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 140);
            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb3.append(sb2);
            sb3.append(" order by rowid desc limit -1 offset ?)");
            return w.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e2) {
            h().G().c("Database error querying filters. appId", zzeu.x(str), e2);
            return false;
        }
    }

    private final long z(String str, String[] strArr, long j2) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = w().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j3 = rawQuery.getLong(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return j3;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return j2;
        } catch (SQLiteException e2) {
            h().G().c("Database error", str, e2);
            throw e2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<com.google.android.gms.internal.measurement.zzcb.zzc, java.lang.Long> A(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.c()
            r7.s()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.w()     // Catch:{ SQLiteException -> 0x007b, all -> 0x0079 }
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x007b, all -> 0x0079 }
            r4 = 0
            r3[r4] = r8     // Catch:{ SQLiteException -> 0x007b, all -> 0x0079 }
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x007b, all -> 0x0079 }
            r6 = 1
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x007b, all -> 0x0079 }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x007b, all -> 0x0079 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0077 }
            if (r2 != 0) goto L_0x0037
            com.google.android.gms.measurement.internal.zzeu r8 = r7.h()     // Catch:{ SQLiteException -> 0x0077 }
            com.google.android.gms.measurement.internal.zzew r8 = r8.O()     // Catch:{ SQLiteException -> 0x0077 }
            java.lang.String r9 = "Main event not found"
            r8.a(r9)     // Catch:{ SQLiteException -> 0x0077 }
            if (r1 == 0) goto L_0x0036
            r1.close()
        L_0x0036:
            return r0
        L_0x0037:
            byte[] r2 = r1.getBlob(r4)     // Catch:{ SQLiteException -> 0x0077 }
            long r3 = r1.getLong(r6)     // Catch:{ SQLiteException -> 0x0077 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x0077 }
            com.google.android.gms.internal.measurement.zzcb$zzc$zza r4 = com.google.android.gms.internal.measurement.zzcb.zzc.d0()     // Catch:{ IOException -> 0x005f }
            com.google.android.gms.internal.measurement.zzgz r2 = com.google.android.gms.measurement.internal.zzkn.A(r4, r2)     // Catch:{ IOException -> 0x005f }
            com.google.android.gms.internal.measurement.zzcb$zzc$zza r2 = (com.google.android.gms.internal.measurement.zzcb.zzc.zza) r2     // Catch:{ IOException -> 0x005f }
            com.google.android.gms.internal.measurement.zzgw r2 = r2.q()     // Catch:{ IOException -> 0x005f }
            com.google.android.gms.internal.measurement.zzfo r2 = (com.google.android.gms.internal.measurement.zzfo) r2     // Catch:{ IOException -> 0x005f }
            com.google.android.gms.internal.measurement.zzcb$zzc r2 = (com.google.android.gms.internal.measurement.zzcb.zzc) r2     // Catch:{ IOException -> 0x005f }
            android.util.Pair r8 = android.util.Pair.create(r2, r3)     // Catch:{ SQLiteException -> 0x0077 }
            if (r1 == 0) goto L_0x005e
            r1.close()
        L_0x005e:
            return r8
        L_0x005f:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzeu r3 = r7.h()     // Catch:{ SQLiteException -> 0x0077 }
            com.google.android.gms.measurement.internal.zzew r3 = r3.G()     // Catch:{ SQLiteException -> 0x0077 }
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzeu.x(r8)     // Catch:{ SQLiteException -> 0x0077 }
            r3.d(r4, r8, r9, r2)     // Catch:{ SQLiteException -> 0x0077 }
            if (r1 == 0) goto L_0x0076
            r1.close()
        L_0x0076:
            return r0
        L_0x0077:
            r8 = move-exception
            goto L_0x007d
        L_0x0079:
            r8 = move-exception
            goto L_0x0092
        L_0x007b:
            r8 = move-exception
            r1 = r0
        L_0x007d:
            com.google.android.gms.measurement.internal.zzeu r9 = r7.h()     // Catch:{ all -> 0x0090 }
            com.google.android.gms.measurement.internal.zzew r9 = r9.G()     // Catch:{ all -> 0x0090 }
            java.lang.String r2 = "Error selecting main event"
            r9.b(r2, r8)     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x008f
            r1.close()
        L_0x008f:
            return r0
        L_0x0090:
            r8 = move-exception
            r0 = r1
        L_0x0092:
            if (r0 == 0) goto L_0x0097
            r0.close()
        L_0x0097:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.c.A(java.lang.String, java.lang.Long):android.util.Pair");
    }

    public final void A0() {
        s();
        w().endTransaction();
    }

    public final zzac B(long j2, String str, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Preconditions.g(str);
        c();
        s();
        String[] strArr = {str};
        zzac zzac = new zzac();
        Cursor cursor = null;
        try {
            SQLiteDatabase w = w();
            cursor = w.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                h().J().b("Not updating daily counts, app is not known. appId", zzeu.x(str));
                if (cursor != null) {
                    cursor.close();
                }
                return zzac;
            }
            if (cursor.getLong(0) == j2) {
                zzac.f10548b = cursor.getLong(1);
                zzac.f10547a = cursor.getLong(2);
                zzac.f10549c = cursor.getLong(3);
                zzac.f10550d = cursor.getLong(4);
                zzac.f10551e = cursor.getLong(5);
            }
            if (z) {
                zzac.f10548b += j3;
            }
            if (z2) {
                zzac.f10547a += j3;
            }
            if (z3) {
                zzac.f10549c += j3;
            }
            if (z4) {
                zzac.f10550d += j3;
            }
            if (z5) {
                zzac.f10551e += j3;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j2));
            contentValues.put("daily_public_events_count", Long.valueOf(zzac.f10547a));
            contentValues.put("daily_events_count", Long.valueOf(zzac.f10548b));
            contentValues.put("daily_conversions_count", Long.valueOf(zzac.f10549c));
            contentValues.put("daily_error_events_count", Long.valueOf(zzac.f10550d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(zzac.f10551e));
            w.update("apps", contentValues, "app_id=?", strArr);
            if (cursor != null) {
                cursor.close();
            }
            return zzac;
        } catch (SQLiteException e2) {
            h().G().c("Error updating daily counts. appId", zzeu.x(str), e2);
            if (cursor != null) {
                cursor.close();
            }
            return zzac;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle B0(java.lang.String r8) {
        /*
            r7 = this;
            r7.c()
            r7.s()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.w()     // Catch:{ SQLiteException -> 0x00c0, all -> 0x00be }
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x00c0, all -> 0x00be }
            r4 = 0
            r3[r4] = r8     // Catch:{ SQLiteException -> 0x00c0, all -> 0x00be }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x00c0, all -> 0x00be }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x00bc }
            if (r2 != 0) goto L_0x0030
            com.google.android.gms.measurement.internal.zzeu r8 = r7.h()     // Catch:{ SQLiteException -> 0x00bc }
            com.google.android.gms.measurement.internal.zzew r8 = r8.O()     // Catch:{ SQLiteException -> 0x00bc }
            java.lang.String r2 = "Default event parameters not found"
            r8.a(r2)     // Catch:{ SQLiteException -> 0x00bc }
            if (r1 == 0) goto L_0x002f
            r1.close()
        L_0x002f:
            return r0
        L_0x0030:
            byte[] r2 = r1.getBlob(r4)     // Catch:{ SQLiteException -> 0x00bc }
            com.google.android.gms.internal.measurement.zzcb$zzc$zza r3 = com.google.android.gms.internal.measurement.zzcb.zzc.d0()     // Catch:{ IOException -> 0x00a4 }
            com.google.android.gms.internal.measurement.zzgz r2 = com.google.android.gms.measurement.internal.zzkn.A(r3, r2)     // Catch:{ IOException -> 0x00a4 }
            com.google.android.gms.internal.measurement.zzcb$zzc$zza r2 = (com.google.android.gms.internal.measurement.zzcb.zzc.zza) r2     // Catch:{ IOException -> 0x00a4 }
            com.google.android.gms.internal.measurement.zzgw r2 = r2.q()     // Catch:{ IOException -> 0x00a4 }
            com.google.android.gms.internal.measurement.zzfo r2 = (com.google.android.gms.internal.measurement.zzfo) r2     // Catch:{ IOException -> 0x00a4 }
            com.google.android.gms.internal.measurement.zzcb$zzc r2 = (com.google.android.gms.internal.measurement.zzcb.zzc) r2     // Catch:{ IOException -> 0x00a4 }
            r7.o()     // Catch:{ SQLiteException -> 0x00bc }
            java.util.List r8 = r2.E()     // Catch:{ SQLiteException -> 0x00bc }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ SQLiteException -> 0x00bc }
            r2.<init>()     // Catch:{ SQLiteException -> 0x00bc }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ SQLiteException -> 0x00bc }
        L_0x0056:
            boolean r3 = r8.hasNext()     // Catch:{ SQLiteException -> 0x00bc }
            if (r3 == 0) goto L_0x009e
            java.lang.Object r3 = r8.next()     // Catch:{ SQLiteException -> 0x00bc }
            com.google.android.gms.internal.measurement.zzcb$zze r3 = (com.google.android.gms.internal.measurement.zzcb.zze) r3     // Catch:{ SQLiteException -> 0x00bc }
            java.lang.String r4 = r3.P()     // Catch:{ SQLiteException -> 0x00bc }
            boolean r5 = r3.c0()     // Catch:{ SQLiteException -> 0x00bc }
            if (r5 == 0) goto L_0x0074
            double r5 = r3.d0()     // Catch:{ SQLiteException -> 0x00bc }
            r2.putDouble(r4, r5)     // Catch:{ SQLiteException -> 0x00bc }
            goto L_0x0056
        L_0x0074:
            boolean r5 = r3.a0()     // Catch:{ SQLiteException -> 0x00bc }
            if (r5 == 0) goto L_0x0082
            float r3 = r3.b0()     // Catch:{ SQLiteException -> 0x00bc }
            r2.putFloat(r4, r3)     // Catch:{ SQLiteException -> 0x00bc }
            goto L_0x0056
        L_0x0082:
            boolean r5 = r3.U()     // Catch:{ SQLiteException -> 0x00bc }
            if (r5 == 0) goto L_0x0090
            java.lang.String r3 = r3.V()     // Catch:{ SQLiteException -> 0x00bc }
            r2.putString(r4, r3)     // Catch:{ SQLiteException -> 0x00bc }
            goto L_0x0056
        L_0x0090:
            boolean r5 = r3.Y()     // Catch:{ SQLiteException -> 0x00bc }
            if (r5 == 0) goto L_0x0056
            long r5 = r3.Z()     // Catch:{ SQLiteException -> 0x00bc }
            r2.putLong(r4, r5)     // Catch:{ SQLiteException -> 0x00bc }
            goto L_0x0056
        L_0x009e:
            if (r1 == 0) goto L_0x00a3
            r1.close()
        L_0x00a3:
            return r2
        L_0x00a4:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzeu r3 = r7.h()     // Catch:{ SQLiteException -> 0x00bc }
            com.google.android.gms.measurement.internal.zzew r3 = r3.G()     // Catch:{ SQLiteException -> 0x00bc }
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzeu.x(r8)     // Catch:{ SQLiteException -> 0x00bc }
            r3.c(r4, r8, r2)     // Catch:{ SQLiteException -> 0x00bc }
            if (r1 == 0) goto L_0x00bb
            r1.close()
        L_0x00bb:
            return r0
        L_0x00bc:
            r8 = move-exception
            goto L_0x00c2
        L_0x00be:
            r8 = move-exception
            goto L_0x00d7
        L_0x00c0:
            r8 = move-exception
            r1 = r0
        L_0x00c2:
            com.google.android.gms.measurement.internal.zzeu r2 = r7.h()     // Catch:{ all -> 0x00d5 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.G()     // Catch:{ all -> 0x00d5 }
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r8)     // Catch:{ all -> 0x00d5 }
            if (r1 == 0) goto L_0x00d4
            r1.close()
        L_0x00d4:
            return r0
        L_0x00d5:
            r8 = move-exception
            r0 = r1
        L_0x00d7:
            if (r0 == 0) goto L_0x00dc
            r0.close()
        L_0x00dc:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.c.B0(java.lang.String):android.os.Bundle");
    }

    public final zzac C(long j2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return B(j2, str, 1, false, false, z3, false, z5);
    }

    public final boolean C0() {
        return i0("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0150  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.h D(java.lang.String r26, java.lang.String r27) {
        /*
            r25 = this;
            r15 = r27
            com.google.android.gms.common.internal.Preconditions.g(r26)
            com.google.android.gms.common.internal.Preconditions.g(r27)
            r25.c()
            r25.s()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r1 = "lifetime_count"
            java.lang.String r2 = "current_bundle_count"
            java.lang.String r3 = "last_fire_timestamp"
            java.lang.String r4 = "last_bundled_timestamp"
            java.lang.String r5 = "last_bundled_day"
            java.lang.String r6 = "last_sampled_complex_event_id"
            java.lang.String r7 = "last_sampling_rate"
            java.lang.String r8 = "last_exempt_from_sampling"
            java.lang.String r9 = "current_session_count"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            r18 = 0
            android.database.sqlite.SQLiteDatabase r1 = r25.w()     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            java.lang.String r2 = "events"
            r9 = 0
            java.lang.String[] r3 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            r3 = r0
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            java.lang.String r4 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            r5[r9] = r26     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            r10 = 1
            r5[r10] = r15     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r1 != 0) goto L_0x005c
            if (r14 == 0) goto L_0x005b
            r14.close()
        L_0x005b:
            return r18
        L_0x005c:
            long r4 = r14.getLong(r9)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            long r6 = r14.getLong(r10)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            long r11 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r0 = 3
            boolean r1 = r14.isNull(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r2 = 0
            if (r1 == 0) goto L_0x0074
            r16 = r2
            goto L_0x007a
        L_0x0074:
            long r0 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r16 = r0
        L_0x007a:
            r0 = 4
            boolean r1 = r14.isNull(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r1 == 0) goto L_0x0084
            r0 = r18
            goto L_0x008c
        L_0x0084:
            long r0 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
        L_0x008c:
            r1 = 5
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r8 == 0) goto L_0x0096
            r19 = r18
            goto L_0x00a0
        L_0x0096:
            long r19 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            java.lang.Long r1 = java.lang.Long.valueOf(r19)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r19 = r1
        L_0x00a0:
            r1 = 6
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r8 == 0) goto L_0x00aa
            r20 = r18
            goto L_0x00b4
        L_0x00aa:
            long r20 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            java.lang.Long r1 = java.lang.Long.valueOf(r20)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r20 = r1
        L_0x00b4:
            r1 = 7
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r8 != 0) goto L_0x00d0
            long r21 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x00cd }
            r23 = 1
            int r1 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r1 != 0) goto L_0x00c6
            r9 = 1
        L_0x00c6:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)     // Catch:{ SQLiteException -> 0x00cd }
            r21 = r1
            goto L_0x00d2
        L_0x00cd:
            r0 = move-exception
            goto L_0x012a
        L_0x00d0:
            r21 = r18
        L_0x00d2:
            r1 = 8
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r8 == 0) goto L_0x00dc
            r8 = r2
            goto L_0x00e1
        L_0x00dc:
            long r1 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r8 = r1
        L_0x00e1:
            com.google.android.gms.measurement.internal.h r22 = new com.google.android.gms.measurement.internal.h     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r1 = r22
            r2 = r26
            r3 = r27
            r10 = r11
            r12 = r16
            r23 = r14
            r14 = r0
            r15 = r19
            r16 = r20
            r17 = r21
            r1.<init>(r2, r3, r4, r6, r8, r10, r12, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            boolean r0 = r23.moveToNext()     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            if (r0 == 0) goto L_0x010f
            com.google.android.gms.measurement.internal.zzeu r0 = r25.h()     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.G()     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            java.lang.String r1 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzeu.x(r26)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            r0.b(r1, r2)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
        L_0x010f:
            if (r23 == 0) goto L_0x0114
            r23.close()
        L_0x0114:
            return r22
        L_0x0115:
            r0 = move-exception
            goto L_0x011e
        L_0x0117:
            r0 = move-exception
            r14 = r23
            goto L_0x012a
        L_0x011b:
            r0 = move-exception
            r23 = r14
        L_0x011e:
            r18 = r23
            goto L_0x014e
        L_0x0121:
            r0 = move-exception
            r23 = r14
            goto L_0x012a
        L_0x0125:
            r0 = move-exception
            goto L_0x014e
        L_0x0127:
            r0 = move-exception
            r14 = r18
        L_0x012a:
            com.google.android.gms.measurement.internal.zzeu r1 = r25.h()     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.zzew r1 = r1.G()     // Catch:{ all -> 0x014b }
            java.lang.String r2 = "Error querying events. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzeu.x(r26)     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.zzes r4 = r25.e()     // Catch:{ all -> 0x014b }
            r5 = r27
            java.lang.String r4 = r4.w(r5)     // Catch:{ all -> 0x014b }
            r1.d(r2, r3, r4, r0)     // Catch:{ all -> 0x014b }
            if (r14 == 0) goto L_0x014a
            r14.close()
        L_0x014a:
            return r18
        L_0x014b:
            r0 = move-exception
            r18 = r14
        L_0x014e:
            if (r18 == 0) goto L_0x0153
            r18.close()
        L_0x0153:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.c.D(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.h");
    }

    /* access modifiers changed from: package-private */
    public final void D0() {
        int delete;
        c();
        s();
        if (h0()) {
            long a2 = k().h.a();
            long b2 = n().b();
            if (Math.abs(b2 - a2) > zzaq.y.a(null).longValue()) {
                k().h.b(b2);
                c();
                s();
                if (h0() && (delete = w().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(n().a()), String.valueOf(zzy.N())})) > 0) {
                    h().O().b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                }
            }
        }
    }

    public final long E0() {
        return z("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    public final long F0() {
        return z("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String G(long r5) {
        /*
            r4 = this;
            r4.c()
            r4.s()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.w()     // Catch:{ SQLiteException -> 0x0042, all -> 0x0040 }
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0042, all -> 0x0040 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0042, all -> 0x0040 }
            r6 = 0
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x0042, all -> 0x0040 }
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x0042, all -> 0x0040 }
            boolean r1 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x003e }
            if (r1 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.zzeu r6 = r4.h()     // Catch:{ SQLiteException -> 0x003e }
            com.google.android.gms.measurement.internal.zzew r6 = r6.O()     // Catch:{ SQLiteException -> 0x003e }
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.a(r1)     // Catch:{ SQLiteException -> 0x003e }
            if (r5 == 0) goto L_0x0033
            r5.close()
        L_0x0033:
            return r0
        L_0x0034:
            java.lang.String r6 = r5.getString(r6)     // Catch:{ SQLiteException -> 0x003e }
            if (r5 == 0) goto L_0x003d
            r5.close()
        L_0x003d:
            return r6
        L_0x003e:
            r6 = move-exception
            goto L_0x0044
        L_0x0040:
            r6 = move-exception
            goto L_0x0059
        L_0x0042:
            r6 = move-exception
            r5 = r0
        L_0x0044:
            com.google.android.gms.measurement.internal.zzeu r1 = r4.h()     // Catch:{ all -> 0x0057 }
            com.google.android.gms.measurement.internal.zzew r1 = r1.G()     // Catch:{ all -> 0x0057 }
            java.lang.String r2 = "Error selecting expired configs"
            r1.b(r2, r6)     // Catch:{ all -> 0x0057 }
            if (r5 == 0) goto L_0x0056
            r5.close()
        L_0x0056:
            return r0
        L_0x0057:
            r6 = move-exception
            r0 = r5
        L_0x0059:
            if (r0 == 0) goto L_0x005e
            r0.close()
        L_0x005e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.c.G(long):java.lang.String");
    }

    public final boolean G0() {
        return i0("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9 A[Catch:{ all -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.s7> H(java.lang.String r14) {
        /*
            r13 = this;
            com.google.android.gms.common.internal.Preconditions.g(r14)
            r13.c()
            r13.s()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r13.w()     // Catch:{ SQLiteException -> 0x0084, all -> 0x0082 }
            java.lang.String r3 = "user_attributes"
            java.lang.String r4 = "name"
            java.lang.String r5 = "origin"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7}     // Catch:{ SQLiteException -> 0x0084, all -> 0x0082 }
            java.lang.String r5 = "app_id=?"
            r11 = 1
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0084, all -> 0x0082 }
            r12 = 0
            r6[r12] = r14     // Catch:{ SQLiteException -> 0x0084, all -> 0x0082 }
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0084, all -> 0x0082 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0080 }
            if (r3 != 0) goto L_0x003f
            if (r2 == 0) goto L_0x003e
            r2.close()
        L_0x003e:
            return r0
        L_0x003f:
            java.lang.String r7 = r2.getString(r12)     // Catch:{ SQLiteException -> 0x0080 }
            java.lang.String r3 = r2.getString(r11)     // Catch:{ SQLiteException -> 0x0080 }
            if (r3 != 0) goto L_0x004b
            java.lang.String r3 = ""
        L_0x004b:
            r6 = r3
            r3 = 2
            long r8 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x0080 }
            r3 = 3
            java.lang.Object r10 = r13.F(r2, r3)     // Catch:{ SQLiteException -> 0x0080 }
            if (r10 != 0) goto L_0x006a
            com.google.android.gms.measurement.internal.zzeu r3 = r13.h()     // Catch:{ SQLiteException -> 0x0080 }
            com.google.android.gms.measurement.internal.zzew r3 = r3.G()     // Catch:{ SQLiteException -> 0x0080 }
            java.lang.String r4 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzeu.x(r14)     // Catch:{ SQLiteException -> 0x0080 }
            r3.b(r4, r5)     // Catch:{ SQLiteException -> 0x0080 }
            goto L_0x0074
        L_0x006a:
            com.google.android.gms.measurement.internal.s7 r3 = new com.google.android.gms.measurement.internal.s7     // Catch:{ SQLiteException -> 0x0080 }
            r4 = r3
            r5 = r14
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x0080 }
            r0.add(r3)     // Catch:{ SQLiteException -> 0x0080 }
        L_0x0074:
            boolean r3 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0080 }
            if (r3 != 0) goto L_0x003f
            if (r2 == 0) goto L_0x007f
            r2.close()
        L_0x007f:
            return r0
        L_0x0080:
            r0 = move-exception
            goto L_0x0086
        L_0x0082:
            r14 = move-exception
            goto L_0x00bb
        L_0x0084:
            r0 = move-exception
            r2 = r1
        L_0x0086:
            com.google.android.gms.measurement.internal.zzeu r3 = r13.h()     // Catch:{ all -> 0x00b9 }
            com.google.android.gms.measurement.internal.zzew r3 = r3.G()     // Catch:{ all -> 0x00b9 }
            java.lang.String r4 = "Error querying user properties. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzeu.x(r14)     // Catch:{ all -> 0x00b9 }
            r3.c(r4, r5, r0)     // Catch:{ all -> 0x00b9 }
            boolean r0 = com.google.android.gms.internal.measurement.zzku.b()     // Catch:{ all -> 0x00b9 }
            if (r0 == 0) goto L_0x00b3
            com.google.android.gms.measurement.internal.zzy r0 = r13.l()     // Catch:{ all -> 0x00b9 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.zzaq.T0     // Catch:{ all -> 0x00b9 }
            boolean r14 = r0.C(r14, r3)     // Catch:{ all -> 0x00b9 }
            if (r14 == 0) goto L_0x00b3
            java.util.List r14 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00b9 }
            if (r2 == 0) goto L_0x00b2
            r2.close()
        L_0x00b2:
            return r14
        L_0x00b3:
            if (r2 == 0) goto L_0x00b8
            r2.close()
        L_0x00b8:
            return r1
        L_0x00b9:
            r14 = move-exception
            r1 = r2
        L_0x00bb:
            if (r1 == 0) goto L_0x00c0
            r1.close()
        L_0x00c0:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.c.H(java.lang.String):java.util.List");
    }

    public final boolean H0() {
        return i0("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    public final List<Pair<zzcb.zzg, Long>> I(String str, int i2, int i3) {
        c();
        s();
        Preconditions.a(i2 > 0);
        Preconditions.a(i3 > 0);
        Preconditions.g(str);
        Cursor cursor = null;
        try {
            cursor = w().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", String.valueOf(i2));
            if (!cursor.moveToFirst()) {
                List<Pair<zzcb.zzg, Long>> emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            do {
                long j2 = cursor.getLong(0);
                try {
                    byte[] W = o().W(cursor.getBlob(1));
                    if (!arrayList.isEmpty() && W.length + i4 > i3) {
                        break;
                    }
                    try {
                        zzcb.zzg.zza zza = (zzcb.zzg.zza) zzkn.A(zzcb.zzg.N0(), W);
                        if (!cursor.isNull(2)) {
                            zza.y0(cursor.getInt(2));
                        }
                        i4 += W.length;
                        arrayList.add(Pair.create((zzcb.zzg) ((zzfo) zza.q()), Long.valueOf(j2)));
                    } catch (IOException e2) {
                        h().G().c("Failed to merge queued bundle. appId", zzeu.x(str), e2);
                    }
                    if (!cursor.moveToNext()) {
                        break;
                    }
                } catch (IOException e3) {
                    h().G().c("Failed to unzip queued bundle. appId", zzeu.x(str), e3);
                }
            } while (i4 <= i3);
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (SQLiteException e4) {
            h().G().c("Error querying bundles. appId", zzeu.x(str), e4);
            List<Pair<zzcb.zzg, Long>> emptyList2 = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fb, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fc, code lost:
        r12 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ff, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0100, code lost:
        r12 = r20;
        r3 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x013c, code lost:
        r9.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0011] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0128 A[Catch:{ all -> 0x0138 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x013c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.s7> J(java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
            r20 = this;
            r8 = r21
            com.google.android.gms.common.internal.Preconditions.g(r21)
            r20.c()
            r20.s()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9 = 0
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fb }
            r10 = 3
            r1.<init>(r10)     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fb }
            r1.add(r8)     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fb }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fb }
            java.lang.String r3 = "app_id=?"
            r2.<init>(r3)     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fb }
            boolean r3 = android.text.TextUtils.isEmpty(r22)     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fb }
            if (r3 != 0) goto L_0x0032
            r3 = r22
            r1.add(r3)     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            java.lang.String r4 = " and origin=?"
            r2.append(r4)     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            goto L_0x0034
        L_0x0032:
            r3 = r22
        L_0x0034:
            boolean r4 = android.text.TextUtils.isEmpty(r23)     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            if (r4 != 0) goto L_0x004c
            java.lang.String r4 = java.lang.String.valueOf(r23)     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            java.lang.String r5 = "*"
            java.lang.String r4 = r4.concat(r5)     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            r1.add(r4)     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            java.lang.String r4 = " and name glob ?"
            r2.append(r4)     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
        L_0x004c:
            int r4 = r1.size()     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            java.lang.Object[] r1 = r1.toArray(r4)     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            r15 = r1
            java.lang.String[] r15 = (java.lang.String[]) r15     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            android.database.sqlite.SQLiteDatabase r11 = r20.w()     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            java.lang.String r12 = "user_attributes"
            java.lang.String r1 = "name"
            java.lang.String r4 = "set_timestamp"
            java.lang.String r5 = "value"
            java.lang.String r6 = "origin"
            java.lang.String[] r13 = new java.lang.String[]{r1, r4, r5, r6}     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            java.lang.String r14 = r2.toString()     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = "1001"
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            boolean r1 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x00f3, all -> 0x00ef }
            if (r1 != 0) goto L_0x0087
            if (r11 == 0) goto L_0x0086
            r11.close()
        L_0x0086:
            return r0
        L_0x0087:
            int r1 = r0.size()     // Catch:{ SQLiteException -> 0x00f3, all -> 0x00ef }
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r1 < r2) goto L_0x00a3
            com.google.android.gms.measurement.internal.zzeu r1 = r20.h()     // Catch:{ SQLiteException -> 0x00f3, all -> 0x00ef }
            com.google.android.gms.measurement.internal.zzew r1 = r1.G()     // Catch:{ SQLiteException -> 0x00f3, all -> 0x00ef }
            java.lang.String r4 = "Read more than the max allowed user properties, ignoring excess"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x00f3, all -> 0x00ef }
            r1.b(r4, r2)     // Catch:{ SQLiteException -> 0x00f3, all -> 0x00ef }
            r12 = r20
            goto L_0x00e2
        L_0x00a3:
            r1 = 0
            java.lang.String r4 = r11.getString(r1)     // Catch:{ SQLiteException -> 0x00f3, all -> 0x00ef }
            r1 = 1
            long r5 = r11.getLong(r1)     // Catch:{ SQLiteException -> 0x00f3, all -> 0x00ef }
            r1 = 2
            r12 = r20
            java.lang.Object r7 = r12.F(r11, r1)     // Catch:{ SQLiteException -> 0x00ed }
            java.lang.String r13 = r11.getString(r10)     // Catch:{ SQLiteException -> 0x00ed }
            if (r7 != 0) goto L_0x00ce
            com.google.android.gms.measurement.internal.zzeu r1 = r20.h()     // Catch:{ SQLiteException -> 0x00ea }
            com.google.android.gms.measurement.internal.zzew r1 = r1.G()     // Catch:{ SQLiteException -> 0x00ea }
            java.lang.String r2 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzeu.x(r21)     // Catch:{ SQLiteException -> 0x00ea }
            r14 = r23
            r1.d(r2, r3, r13, r14)     // Catch:{ SQLiteException -> 0x00ea }
            goto L_0x00dc
        L_0x00ce:
            r14 = r23
            com.google.android.gms.measurement.internal.s7 r15 = new com.google.android.gms.measurement.internal.s7     // Catch:{ SQLiteException -> 0x00ea }
            r1 = r15
            r2 = r21
            r3 = r13
            r1.<init>(r2, r3, r4, r5, r7)     // Catch:{ SQLiteException -> 0x00ea }
            r0.add(r15)     // Catch:{ SQLiteException -> 0x00ea }
        L_0x00dc:
            boolean r1 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x00ea }
            if (r1 != 0) goto L_0x00e8
        L_0x00e2:
            if (r11 == 0) goto L_0x00e7
            r11.close()
        L_0x00e7:
            return r0
        L_0x00e8:
            r3 = r13
            goto L_0x0087
        L_0x00ea:
            r0 = move-exception
            r3 = r13
            goto L_0x0105
        L_0x00ed:
            r0 = move-exception
            goto L_0x0105
        L_0x00ef:
            r0 = move-exception
            r12 = r20
            goto L_0x0139
        L_0x00f3:
            r0 = move-exception
            r12 = r20
            goto L_0x0105
        L_0x00f7:
            r0 = move-exception
            r12 = r20
            goto L_0x0104
        L_0x00fb:
            r0 = move-exception
            r12 = r20
            goto L_0x013a
        L_0x00ff:
            r0 = move-exception
            r12 = r20
            r3 = r22
        L_0x0104:
            r11 = r9
        L_0x0105:
            com.google.android.gms.measurement.internal.zzeu r1 = r20.h()     // Catch:{ all -> 0x0138 }
            com.google.android.gms.measurement.internal.zzew r1 = r1.G()     // Catch:{ all -> 0x0138 }
            java.lang.String r2 = "(2)Error querying user properties"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeu.x(r21)     // Catch:{ all -> 0x0138 }
            r1.d(r2, r4, r3, r0)     // Catch:{ all -> 0x0138 }
            boolean r0 = com.google.android.gms.internal.measurement.zzku.b()     // Catch:{ all -> 0x0138 }
            if (r0 == 0) goto L_0x0132
            com.google.android.gms.measurement.internal.zzy r0 = r20.l()     // Catch:{ all -> 0x0138 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.zzaq.T0     // Catch:{ all -> 0x0138 }
            boolean r0 = r0.C(r8, r1)     // Catch:{ all -> 0x0138 }
            if (r0 == 0) goto L_0x0132
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0138 }
            if (r11 == 0) goto L_0x0131
            r11.close()
        L_0x0131:
            return r0
        L_0x0132:
            if (r11 == 0) goto L_0x0137
            r11.close()
        L_0x0137:
            return r9
        L_0x0138:
            r0 = move-exception
        L_0x0139:
            r9 = r11
        L_0x013a:
            if (r9 == 0) goto L_0x013f
            r9.close()
        L_0x013f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.c.J(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final List<zzw> K(String str, String[] strArr) {
        c();
        s();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = w().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, (String) null, (String) null, "rowid", NativeContentAd.ASSET_HEADLINE);
            if (!cursor.moveToFirst()) {
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            }
            while (true) {
                if (arrayList.size() < 1000) {
                    boolean z = false;
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    String string3 = cursor.getString(2);
                    Object F = F(cursor, 3);
                    if (cursor.getInt(4) != 0) {
                        z = true;
                    }
                    String string4 = cursor.getString(5);
                    long j2 = cursor.getLong(6);
                    long j3 = cursor.getLong(8);
                    long j4 = cursor.getLong(10);
                    boolean z2 = z;
                    zzw zzw = r3;
                    zzw zzw2 = new zzw(string, string2, new zzkq(string3, j4, F, string2), j3, z2, string4, (zzao) o().x(cursor.getBlob(7), zzao.CREATOR), j2, (zzao) o().x(cursor.getBlob(9), zzao.CREATOR), cursor.getLong(11), (zzao) o().x(cursor.getBlob(12), zzao.CREATOR));
                    arrayList.add(zzw);
                    if (!cursor.moveToNext()) {
                        break;
                    }
                } else {
                    h().G().b("Read more than the max allowed conditional properties, ignoring extra", 1000);
                    break;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (SQLiteException e2) {
            h().G().b("Error querying conditional user property value", e2);
            List<zzw> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void M(h hVar) {
        Preconditions.k(hVar);
        c();
        s();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", hVar.f10212a);
        contentValues.put("name", hVar.f10213b);
        contentValues.put("lifetime_count", Long.valueOf(hVar.f10214c));
        contentValues.put("current_bundle_count", Long.valueOf(hVar.f10215d));
        contentValues.put("last_fire_timestamp", Long.valueOf(hVar.f10217f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(hVar.g));
        contentValues.put("last_bundled_day", hVar.h);
        contentValues.put("last_sampled_complex_event_id", hVar.i);
        contentValues.put("last_sampling_rate", hVar.j);
        contentValues.put("current_session_count", Long.valueOf(hVar.f10216e));
        Boolean bool = hVar.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (w().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                h().G().b("Failed to insert/update event aggregates (got -1). appId", zzeu.x(hVar.f10212a));
            }
        } catch (SQLiteException e2) {
            h().G().c("Error storing event aggregates. appId", zzeu.x(hVar.f10212a), e2);
        }
    }

    public final void N(k3 k3Var) {
        Preconditions.k(k3Var);
        c();
        s();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", k3Var.t());
        contentValues.put("app_instance_id", k3Var.x());
        contentValues.put("gmp_app_id", k3Var.A());
        contentValues.put("resettable_device_id_hash", k3Var.J());
        contentValues.put("last_bundle_index", Long.valueOf(k3Var.f0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(k3Var.P()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(k3Var.R()));
        contentValues.put("app_version", k3Var.T());
        contentValues.put("app_store", k3Var.X());
        contentValues.put("gmp_version", Long.valueOf(k3Var.Z()));
        contentValues.put("dev_cert_hash", Long.valueOf(k3Var.b0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(k3Var.e0()));
        contentValues.put("day", Long.valueOf(k3Var.j0()));
        contentValues.put("daily_public_events_count", Long.valueOf(k3Var.k0()));
        contentValues.put("daily_events_count", Long.valueOf(k3Var.l0()));
        contentValues.put("daily_conversions_count", Long.valueOf(k3Var.m0()));
        contentValues.put("config_fetched_time", Long.valueOf(k3Var.g0()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(k3Var.h0()));
        contentValues.put("app_version_int", Long.valueOf(k3Var.V()));
        contentValues.put("firebase_instance_id", k3Var.M());
        contentValues.put("daily_error_events_count", Long.valueOf(k3Var.h()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(k3Var.g()));
        contentValues.put("health_monitor_sample", k3Var.i());
        contentValues.put("android_id", Long.valueOf(k3Var.k()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(k3Var.l()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(k3Var.m()));
        contentValues.put("admob_app_id", k3Var.D());
        contentValues.put("dynamite_version", Long.valueOf(k3Var.d0()));
        if (k3Var.o() != null) {
            if (k3Var.o().size() == 0) {
                h().J().b("Safelisted events should not be an empty list. appId", k3Var.t());
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", k3Var.o()));
            }
        }
        if (zzlm.b() && l().C(k3Var.t(), zzaq.o0)) {
            contentValues.put("ga_app_id", k3Var.G());
        }
        try {
            SQLiteDatabase w = w();
            if (((long) w.update("apps", contentValues, "app_id = ?", new String[]{k3Var.t()})) == 0 && w.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                h().G().b("Failed to insert/update app (got -1). appId", zzeu.x(k3Var.t()));
            }
        } catch (SQLiteException e2) {
            h().G().c("Error storing app. appId", zzeu.x(k3Var.t()), e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void O(String str, List<zzbt.zza> list) {
        boolean z;
        boolean z2;
        String str2 = str;
        List<zzbt.zza> list2 = list;
        Preconditions.k(list);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzbt.zza.C0089zza zza = (zzbt.zza.C0089zza) list2.get(i2).x();
            if (zza.H() != 0) {
                for (int i3 = 0; i3 < zza.H(); i3++) {
                    zzbt.zzb.zza zza2 = (zzbt.zzb.zza) zza.I(i3).x();
                    zzbt.zzb.zza zza3 = (zzbt.zzb.zza) ((zzfo.zza) zza2.clone());
                    String b2 = zzgw.b(zza2.F());
                    if (b2 != null) {
                        zza3.D(b2);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    for (int i4 = 0; i4 < zza2.H(); i4++) {
                        zzbt.zzc E = zza2.E(i4);
                        String a2 = zzgz.a(E.M());
                        if (a2 != null) {
                            zzbt.zzc.zza zza4 = (zzbt.zzc.zza) E.x();
                            zza4.C(a2);
                            zza3.C(i4, (zzbt.zzc) ((zzfo) zza4.q()));
                            z2 = true;
                        }
                    }
                    if (z2) {
                        zza.D(i3, zza3);
                        list2.set(i2, (zzbt.zza) ((zzfo) zza.q()));
                    }
                }
            }
            if (zza.C() != 0) {
                for (int i5 = 0; i5 < zza.C(); i5++) {
                    zzbt.zze F = zza.F(i5);
                    String a3 = zzgy.a(F.H());
                    if (a3 != null) {
                        zzbt.zze.zza zza5 = (zzbt.zze.zza) F.x();
                        zza5.C(a3);
                        zza.E(i5, zza5);
                        list2.set(i2, (zzbt.zza) ((zzfo) zza.q()));
                    }
                }
            }
        }
        s();
        c();
        Preconditions.g(str);
        Preconditions.k(list);
        SQLiteDatabase w = w();
        w.beginTransaction();
        try {
            s();
            c();
            Preconditions.g(str);
            SQLiteDatabase w2 = w();
            w2.delete("property_filters", "app_id=?", new String[]{str2});
            w2.delete("event_filters", "app_id=?", new String[]{str2});
            for (zzbt.zza next : list) {
                s();
                c();
                Preconditions.g(str);
                Preconditions.k(next);
                if (!next.I()) {
                    h().J().b("Audience with no ID. appId", zzeu.x(str));
                } else {
                    int J = next.J();
                    Iterator<zzbt.zzb> it = next.O().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().I()) {
                                h().J().c("Event filter with no ID. Audience definition ignored. appId, audienceId", zzeu.x(str), Integer.valueOf(J));
                                break;
                            }
                        } else {
                            Iterator<zzbt.zze> it2 = next.L().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!it2.next().F()) {
                                        h().J().c("Property filter with no ID. Audience definition ignored. appId, audienceId", zzeu.x(str), Integer.valueOf(J));
                                        break;
                                    }
                                } else {
                                    Iterator<zzbt.zzb> it3 = next.O().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!U(str2, J, it3.next())) {
                                                z = false;
                                                break;
                                            }
                                        } else {
                                            z = true;
                                            break;
                                        }
                                    }
                                    if (z) {
                                        Iterator<zzbt.zze> it4 = next.L().iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                if (!V(str2, J, it4.next())) {
                                                    z = false;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        s();
                                        c();
                                        Preconditions.g(str);
                                        SQLiteDatabase w3 = w();
                                        w3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str2, String.valueOf(J)});
                                        w3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str2, String.valueOf(J)});
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (zzbt.zza next2 : list) {
                arrayList.add(next2.I() ? Integer.valueOf(next2.J()) : null);
            }
            m0(str2, arrayList);
            w.setTransactionSuccessful();
        } finally {
            w.endTransaction();
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final void P(List<Long> list) {
        c();
        s();
        Preconditions.k(list);
        Preconditions.m(list.size());
        if (h0()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(sb2);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (i0(sb3.toString(), (String[]) null) > 0) {
                h().J().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase w = w();
                StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                w.execSQL(sb4.toString());
            } catch (SQLiteException e2) {
                h().G().b("Error incrementing retry count. error", e2);
            }
        }
    }

    public final boolean Q(zzcb.zzg zzg, boolean z) {
        c();
        s();
        Preconditions.k(zzg);
        Preconditions.g(zzg.I2());
        Preconditions.n(zzg.j2());
        D0();
        long a2 = n().a();
        if (zzg.k2() < a2 - zzy.N() || zzg.k2() > zzy.N() + a2) {
            h().J().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzeu.x(zzg.I2()), Long.valueOf(a2), Long.valueOf(zzg.k2()));
        }
        try {
            byte[] X = o().X(zzg.j());
            h().O().b("Saving bundle, size", Integer.valueOf(X.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzg.I2());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzg.k2()));
            contentValues.put("data", X);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (zzg.x0()) {
                contentValues.put("retry_count", Integer.valueOf(zzg.I0()));
            }
            try {
                if (w().insert("queue", (String) null, contentValues) != -1) {
                    return true;
                }
                h().G().b("Failed to insert bundle (got -1). appId", zzeu.x(zzg.I2()));
                return false;
            } catch (SQLiteException e2) {
                h().G().c("Error storing bundle. appId", zzeu.x(zzg.I2()), e2);
                return false;
            }
        } catch (IOException e3) {
            h().G().c("Data loss. Failed to serialize bundle. appId", zzeu.x(zzg.I2()), e3);
            return false;
        }
    }

    public final boolean R(zzal zzal, long j2, boolean z) {
        c();
        s();
        Preconditions.k(zzal);
        Preconditions.g(zzal.f10556a);
        byte[] j3 = o().y(zzal).j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzal.f10556a);
        contentValues.put("name", zzal.f10557b);
        contentValues.put("timestamp", Long.valueOf(zzal.f10559d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j2));
        contentValues.put("data", j3);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (w().insert("raw_events", (String) null, contentValues) != -1) {
                return true;
            }
            h().G().b("Failed to insert raw event (got -1). appId", zzeu.x(zzal.f10556a));
            return false;
        } catch (SQLiteException e2) {
            h().G().c("Error storing raw event. appId", zzeu.x(zzal.f10556a), e2);
            return false;
        }
    }

    public final boolean S(s7 s7Var) {
        Preconditions.k(s7Var);
        c();
        s();
        if (o0(s7Var.f10424a, s7Var.f10426c) == null) {
            if (zzkr.d0(s7Var.f10426c)) {
                if (i0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{s7Var.f10424a}) >= ((long) l().y(s7Var.f10424a))) {
                    return false;
                }
            } else if (!"_npa".equals(s7Var.f10426c)) {
                if (i0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{s7Var.f10424a, s7Var.f10425b}) >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", s7Var.f10424a);
        contentValues.put("origin", s7Var.f10425b);
        contentValues.put("name", s7Var.f10426c);
        contentValues.put("set_timestamp", Long.valueOf(s7Var.f10427d));
        L(contentValues, "value", s7Var.f10428e);
        try {
            if (w().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                h().G().b("Failed to insert/update user property (got -1). appId", zzeu.x(s7Var.f10424a));
            }
        } catch (SQLiteException e2) {
            h().G().c("Error storing user property. appId", zzeu.x(s7Var.f10424a), e2);
        }
        return true;
    }

    public final boolean T(zzw zzw) {
        Preconditions.k(zzw);
        c();
        s();
        if (o0(zzw.f10715b, zzw.f10717d.f10701c) == null) {
            if (i0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{zzw.f10715b}) >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzw.f10715b);
        contentValues.put("origin", zzw.f10716c);
        contentValues.put("name", zzw.f10717d.f10701c);
        L(contentValues, "value", zzw.f10717d.u());
        contentValues.put("active", Boolean.valueOf(zzw.f10719f));
        contentValues.put("trigger_event_name", zzw.g);
        contentValues.put("trigger_timeout", Long.valueOf(zzw.i));
        j();
        contentValues.put("timed_out_event", zzkr.n0(zzw.h));
        contentValues.put("creation_timestamp", Long.valueOf(zzw.f10718e));
        j();
        contentValues.put("triggered_event", zzkr.n0(zzw.j));
        contentValues.put("triggered_timestamp", Long.valueOf(zzw.f10717d.f10702d));
        contentValues.put("time_to_live", Long.valueOf(zzw.k));
        j();
        contentValues.put("expired_event", zzkr.n0(zzw.l));
        try {
            if (w().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                h().G().b("Failed to insert/update conditional user property (got -1)", zzeu.x(zzw.f10715b));
            }
        } catch (SQLiteException e2) {
            h().G().c("Error storing conditional user property", zzeu.x(zzw.f10715b), e2);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean W(String str, Bundle bundle) {
        c();
        s();
        byte[] j2 = o().y(new zzal(this.f10357a, "", str, "dep", 0, 0, bundle)).j();
        h().O().c("Saving default event parameters, appId, data size", e().w(str), Integer.valueOf(j2.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", j2);
        try {
            if (w().insertWithOnConflict("default_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            h().G().b("Failed to insert default event parameters (got -1). appId", zzeu.x(str));
            return false;
        } catch (SQLiteException e2) {
            h().G().c("Error storing default event parameters. appId", zzeu.x(str), e2);
            return false;
        }
    }

    public final boolean X(String str, Long l2, long j2, zzcb.zzc zzc) {
        c();
        s();
        Preconditions.k(zzc);
        Preconditions.g(str);
        Preconditions.k(l2);
        byte[] j3 = zzc.j();
        h().O().c("Saving complex main event, appId, data size", e().w(str), Integer.valueOf(j3.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", j3);
        try {
            if (w().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            h().G().b("Failed to insert complex main event (got -1). appId", zzeu.x(str));
            return false;
        } catch (SQLiteException e2) {
            h().G().c("Error storing complex main event. appId", zzeu.x(str), e2);
            return false;
        }
    }

    public final long Y() {
        Cursor cursor = null;
        try {
            cursor = w().rawQuery("select rowid from raw_events order by rowid desc limit 1;", (String[]) null);
            if (!cursor.moveToFirst()) {
                if (cursor != null) {
                    cursor.close();
                }
                return -1;
            }
            long j2 = cursor.getLong(0);
            if (cursor != null) {
                cursor.close();
            }
            return j2;
        } catch (SQLiteException e2) {
            h().G().b("Error querying raw events", e2);
            if (cursor != null) {
                cursor.close();
            }
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x011b A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x011f A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0159 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0172 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0187 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01a3 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01a4 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01b3 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01e9 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x022d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.k3 j0(java.lang.String r35) {
        /*
            r34 = this;
            r1 = r35
            com.google.android.gms.common.internal.Preconditions.g(r35)
            r34.c()
            r34.s()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r34.w()     // Catch:{ SQLiteException -> 0x020e, all -> 0x020a }
            java.lang.String r4 = "apps"
            java.lang.String r5 = "app_instance_id"
            java.lang.String r6 = "gmp_app_id"
            java.lang.String r7 = "resettable_device_id_hash"
            java.lang.String r8 = "last_bundle_index"
            java.lang.String r9 = "last_bundle_start_timestamp"
            java.lang.String r10 = "last_bundle_end_timestamp"
            java.lang.String r11 = "app_version"
            java.lang.String r12 = "app_store"
            java.lang.String r13 = "gmp_version"
            java.lang.String r14 = "dev_cert_hash"
            java.lang.String r15 = "measurement_enabled"
            java.lang.String r16 = "day"
            java.lang.String r17 = "daily_public_events_count"
            java.lang.String r18 = "daily_events_count"
            java.lang.String r19 = "daily_conversions_count"
            java.lang.String r20 = "config_fetched_time"
            java.lang.String r21 = "failed_config_fetch_time"
            java.lang.String r22 = "app_version_int"
            java.lang.String r23 = "firebase_instance_id"
            java.lang.String r24 = "daily_error_events_count"
            java.lang.String r25 = "daily_realtime_events_count"
            java.lang.String r26 = "health_monitor_sample"
            java.lang.String r27 = "android_id"
            java.lang.String r28 = "adid_reporting_enabled"
            java.lang.String r29 = "ssaid_reporting_enabled"
            java.lang.String r30 = "admob_app_id"
            java.lang.String r31 = "dynamite_version"
            java.lang.String r32 = "safelisted_events"
            java.lang.String r33 = "ga_app_id"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33}     // Catch:{ SQLiteException -> 0x020e, all -> 0x020a }
            java.lang.String r6 = "app_id=?"
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x020e, all -> 0x020a }
            r11 = 0
            r7[r11] = r1     // Catch:{ SQLiteException -> 0x020e, all -> 0x020a }
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x020e, all -> 0x020a }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0206, all -> 0x0202 }
            if (r4 != 0) goto L_0x006b
            if (r3 == 0) goto L_0x006a
            r3.close()
        L_0x006a:
            return r2
        L_0x006b:
            com.google.android.gms.measurement.internal.k3 r4 = new com.google.android.gms.measurement.internal.k3     // Catch:{ SQLiteException -> 0x0206, all -> 0x0202 }
            r5 = r34
            com.google.android.gms.measurement.internal.zzkj r6 = r5.f10329b     // Catch:{ SQLiteException -> 0x0200 }
            com.google.android.gms.measurement.internal.zzfy r6 = r6.g0()     // Catch:{ SQLiteException -> 0x0200 }
            r4.<init>(r6, r1)     // Catch:{ SQLiteException -> 0x0200 }
            java.lang.String r6 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x0200 }
            r4.c(r6)     // Catch:{ SQLiteException -> 0x0200 }
            java.lang.String r6 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x0200 }
            r4.r(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 2
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.C(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 3
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.H(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 4
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.a(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 5
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.q(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 6
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.I(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 7
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.L(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 8
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.y(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 9
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.B(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 10
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r7 != 0) goto L_0x00d9
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r6 == 0) goto L_0x00d7
            goto L_0x00d9
        L_0x00d7:
            r6 = 0
            goto L_0x00da
        L_0x00d9:
            r6 = 1
        L_0x00da:
            r4.e(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 11
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.Q(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 12
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.S(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 13
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.U(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 14
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.W(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 15
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.K(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 16
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.N(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 17
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r7 == 0) goto L_0x011f
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0124
        L_0x011f:
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0200 }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x0200 }
        L_0x0124:
            r4.u(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 18
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.F(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 19
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.a0(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 20
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.Y(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 21
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.O(r6)     // Catch:{ SQLiteException -> 0x0200 }
            com.google.android.gms.measurement.internal.zzy r6 = r34.l()     // Catch:{ SQLiteException -> 0x0200 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.zzaq.M0     // Catch:{ SQLiteException -> 0x0200 }
            boolean r6 = r6.t(r7)     // Catch:{ SQLiteException -> 0x0200 }
            r7 = 0
            if (r6 != 0) goto L_0x016a
            r6 = 22
            boolean r9 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r9 == 0) goto L_0x0163
            r9 = r7
            goto L_0x0167
        L_0x0163:
            long r9 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
        L_0x0167:
            r4.c0(r9)     // Catch:{ SQLiteException -> 0x0200 }
        L_0x016a:
            r6 = 23
            boolean r9 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r9 != 0) goto L_0x017b
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r6 == 0) goto L_0x0179
            goto L_0x017b
        L_0x0179:
            r6 = 0
            goto L_0x017c
        L_0x017b:
            r6 = 1
        L_0x017c:
            r4.s(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 24
            boolean r9 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r9 != 0) goto L_0x018f
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r6 == 0) goto L_0x018e
            goto L_0x018f
        L_0x018e:
            r0 = 0
        L_0x018f:
            r4.w(r0)     // Catch:{ SQLiteException -> 0x0200 }
            r0 = 25
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x0200 }
            r4.v(r0)     // Catch:{ SQLiteException -> 0x0200 }
            r0 = 26
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x0200 }
            if (r6 == 0) goto L_0x01a4
            goto L_0x01a8
        L_0x01a4:
            long r7 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x0200 }
        L_0x01a8:
            r4.E(r7)     // Catch:{ SQLiteException -> 0x0200 }
            r0 = 27
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x0200 }
            if (r6 != 0) goto L_0x01c5
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x0200 }
            java.lang.String r6 = ","
            r7 = -1
            java.lang.String[] r0 = r0.split(r6, r7)     // Catch:{ SQLiteException -> 0x0200 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ SQLiteException -> 0x0200 }
            r4.d(r0)     // Catch:{ SQLiteException -> 0x0200 }
        L_0x01c5:
            boolean r0 = com.google.android.gms.internal.measurement.zzlm.b()     // Catch:{ SQLiteException -> 0x0200 }
            if (r0 == 0) goto L_0x01e0
            com.google.android.gms.measurement.internal.zzy r0 = r34.l()     // Catch:{ SQLiteException -> 0x0200 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.zzaq.o0     // Catch:{ SQLiteException -> 0x0200 }
            boolean r0 = r0.C(r1, r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r0 == 0) goto L_0x01e0
            r0 = 28
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x0200 }
            r4.z(r0)     // Catch:{ SQLiteException -> 0x0200 }
        L_0x01e0:
            r4.p()     // Catch:{ SQLiteException -> 0x0200 }
            boolean r0 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x0200 }
            if (r0 == 0) goto L_0x01fa
            com.google.android.gms.measurement.internal.zzeu r0 = r34.h()     // Catch:{ SQLiteException -> 0x0200 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.G()     // Catch:{ SQLiteException -> 0x0200 }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzeu.x(r35)     // Catch:{ SQLiteException -> 0x0200 }
            r0.b(r6, r7)     // Catch:{ SQLiteException -> 0x0200 }
        L_0x01fa:
            if (r3 == 0) goto L_0x01ff
            r3.close()
        L_0x01ff:
            return r4
        L_0x0200:
            r0 = move-exception
            goto L_0x0212
        L_0x0202:
            r0 = move-exception
            r5 = r34
            goto L_0x022a
        L_0x0206:
            r0 = move-exception
            r5 = r34
            goto L_0x0212
        L_0x020a:
            r0 = move-exception
            r5 = r34
            goto L_0x022b
        L_0x020e:
            r0 = move-exception
            r5 = r34
            r3 = r2
        L_0x0212:
            com.google.android.gms.measurement.internal.zzeu r4 = r34.h()     // Catch:{ all -> 0x0229 }
            com.google.android.gms.measurement.internal.zzew r4 = r4.G()     // Catch:{ all -> 0x0229 }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r1 = com.google.android.gms.measurement.internal.zzeu.x(r35)     // Catch:{ all -> 0x0229 }
            r4.c(r6, r1, r0)     // Catch:{ all -> 0x0229 }
            if (r3 == 0) goto L_0x0228
            r3.close()
        L_0x0228:
            return r2
        L_0x0229:
            r0 = move-exception
        L_0x022a:
            r2 = r3
        L_0x022b:
            if (r2 == 0) goto L_0x0230
            r2.close()
        L_0x0230:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.c.j0(java.lang.String):com.google.android.gms.measurement.internal.k3");
    }

    public final List<zzw> k0(String str, String str2, String str3) {
        Preconditions.g(str);
        c();
        s();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return K(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final void l0(String str, String str2) {
        Preconditions.g(str);
        Preconditions.g(str2);
        c();
        s();
        try {
            w().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            h().G().d("Error deleting user property. appId", zzeu.x(str), e().A(str2), e2);
        }
    }

    public final long n0(String str) {
        Preconditions.g(str);
        c();
        s();
        try {
            return (long) w().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, l().v(str, zzaq.p))))});
        } catch (SQLiteException e2) {
            h().G().c("Error deleting over the limit events. appId", zzeu.x(str), e2);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.s7 o0(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            com.google.android.gms.common.internal.Preconditions.g(r19)
            com.google.android.gms.common.internal.Preconditions.g(r20)
            r18.c()
            r18.s()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.w()     // Catch:{ SQLiteException -> 0x0082, all -> 0x007e }
            java.lang.String r11 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r1 = "value"
            java.lang.String r2 = "origin"
            java.lang.String[] r12 = new java.lang.String[]{r0, r1, r2}     // Catch:{ SQLiteException -> 0x0082, all -> 0x007e }
            java.lang.String r13 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0082, all -> 0x007e }
            r1 = 0
            r14[r1] = r19     // Catch:{ SQLiteException -> 0x0082, all -> 0x007e }
            r2 = 1
            r14[r2] = r8     // Catch:{ SQLiteException -> 0x0082, all -> 0x007e }
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0082, all -> 0x007e }
            boolean r3 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x007a, all -> 0x0076 }
            if (r3 != 0) goto L_0x003f
            if (r10 == 0) goto L_0x003e
            r10.close()
        L_0x003e:
            return r9
        L_0x003f:
            long r5 = r10.getLong(r1)     // Catch:{ SQLiteException -> 0x007a, all -> 0x0076 }
            r11 = r18
            java.lang.Object r7 = r11.F(r10, r2)     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.String r3 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x0074 }
            com.google.android.gms.measurement.internal.s7 r0 = new com.google.android.gms.measurement.internal.s7     // Catch:{ SQLiteException -> 0x0074 }
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch:{ SQLiteException -> 0x0074 }
            boolean r1 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x0074 }
            if (r1 == 0) goto L_0x006e
            com.google.android.gms.measurement.internal.zzeu r1 = r18.h()     // Catch:{ SQLiteException -> 0x0074 }
            com.google.android.gms.measurement.internal.zzew r1 = r1.G()     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzeu.x(r19)     // Catch:{ SQLiteException -> 0x0074 }
            r1.b(r2, r3)     // Catch:{ SQLiteException -> 0x0074 }
        L_0x006e:
            if (r10 == 0) goto L_0x0073
            r10.close()
        L_0x0073:
            return r0
        L_0x0074:
            r0 = move-exception
            goto L_0x0086
        L_0x0076:
            r0 = move-exception
            r11 = r18
            goto L_0x00a6
        L_0x007a:
            r0 = move-exception
            r11 = r18
            goto L_0x0086
        L_0x007e:
            r0 = move-exception
            r11 = r18
            goto L_0x00a7
        L_0x0082:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L_0x0086:
            com.google.android.gms.measurement.internal.zzeu r1 = r18.h()     // Catch:{ all -> 0x00a5 }
            com.google.android.gms.measurement.internal.zzew r1 = r1.G()     // Catch:{ all -> 0x00a5 }
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzeu.x(r19)     // Catch:{ all -> 0x00a5 }
            com.google.android.gms.measurement.internal.zzes r4 = r18.e()     // Catch:{ all -> 0x00a5 }
            java.lang.String r4 = r4.A(r8)     // Catch:{ all -> 0x00a5 }
            r1.d(r2, r3, r4, r0)     // Catch:{ all -> 0x00a5 }
            if (r10 == 0) goto L_0x00a4
            r10.close()
        L_0x00a4:
            return r9
        L_0x00a5:
            r0 = move-exception
        L_0x00a6:
            r9 = r10
        L_0x00a7:
            if (r9 == 0) goto L_0x00ac
            r9.close()
        L_0x00ac:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.c.o0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.s7");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzw p0(java.lang.String r30, java.lang.String r31) {
        /*
            r29 = this;
            r7 = r31
            com.google.android.gms.common.internal.Preconditions.g(r30)
            com.google.android.gms.common.internal.Preconditions.g(r31)
            r29.c()
            r29.s()
            r8 = 0
            android.database.sqlite.SQLiteDatabase r9 = r29.w()     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            java.lang.String r10 = "conditional_properties"
            java.lang.String r11 = "origin"
            java.lang.String r12 = "value"
            java.lang.String r13 = "active"
            java.lang.String r14 = "trigger_event_name"
            java.lang.String r15 = "trigger_timeout"
            java.lang.String r16 = "timed_out_event"
            java.lang.String r17 = "creation_timestamp"
            java.lang.String r18 = "triggered_event"
            java.lang.String r19 = "triggered_timestamp"
            java.lang.String r20 = "time_to_live"
            java.lang.String r21 = "expired_event"
            java.lang.String[] r11 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            java.lang.String r12 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r13 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            r1 = 0
            r13[r1] = r30     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            r2 = 1
            r13[r2] = r7     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            r14 = 0
            r15 = 0
            r16 = 0
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            boolean r3 = r9.moveToFirst()     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f2 }
            if (r3 != 0) goto L_0x004e
            if (r9 == 0) goto L_0x004d
            r9.close()
        L_0x004d:
            return r8
        L_0x004e:
            java.lang.String r16 = r9.getString(r1)     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f2 }
            r10 = r29
            java.lang.Object r5 = r10.F(r9, r2)     // Catch:{ SQLiteException -> 0x00f0 }
            int r0 = r9.getInt(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            if (r0 == 0) goto L_0x0061
            r20 = 1
            goto L_0x0063
        L_0x0061:
            r20 = 0
        L_0x0063:
            r0 = 3
            java.lang.String r21 = r9.getString(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            r0 = 4
            long r23 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.zzkn r0 = r29.o()     // Catch:{ SQLiteException -> 0x00f0 }
            r1 = 5
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzao> r2 = com.google.android.gms.measurement.internal.zzao.CREATOR     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable r0 = r0.x(r1, r2)     // Catch:{ SQLiteException -> 0x00f0 }
            r22 = r0
            com.google.android.gms.measurement.internal.zzao r22 = (com.google.android.gms.measurement.internal.zzao) r22     // Catch:{ SQLiteException -> 0x00f0 }
            r0 = 6
            long r18 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.zzkn r0 = r29.o()     // Catch:{ SQLiteException -> 0x00f0 }
            r1 = 7
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzao> r2 = com.google.android.gms.measurement.internal.zzao.CREATOR     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable r0 = r0.x(r1, r2)     // Catch:{ SQLiteException -> 0x00f0 }
            r25 = r0
            com.google.android.gms.measurement.internal.zzao r25 = (com.google.android.gms.measurement.internal.zzao) r25     // Catch:{ SQLiteException -> 0x00f0 }
            r0 = 8
            long r3 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            r0 = 9
            long r26 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.zzkn r0 = r29.o()     // Catch:{ SQLiteException -> 0x00f0 }
            r1 = 10
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzao> r2 = com.google.android.gms.measurement.internal.zzao.CREATOR     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable r0 = r0.x(r1, r2)     // Catch:{ SQLiteException -> 0x00f0 }
            r28 = r0
            com.google.android.gms.measurement.internal.zzao r28 = (com.google.android.gms.measurement.internal.zzao) r28     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.zzkq r17 = new com.google.android.gms.measurement.internal.zzkq     // Catch:{ SQLiteException -> 0x00f0 }
            r1 = r17
            r2 = r31
            r6 = r16
            r1.<init>(r2, r3, r5, r6)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.zzw r0 = new com.google.android.gms.measurement.internal.zzw     // Catch:{ SQLiteException -> 0x00f0 }
            r14 = r0
            r15 = r30
            r14.<init>(r15, r16, r17, r18, r20, r21, r22, r23, r25, r26, r28)     // Catch:{ SQLiteException -> 0x00f0 }
            boolean r1 = r9.moveToNext()     // Catch:{ SQLiteException -> 0x00f0 }
            if (r1 == 0) goto L_0x00ea
            com.google.android.gms.measurement.internal.zzeu r1 = r29.h()     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.zzew r1 = r1.G()     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.String r2 = "Got multiple records for conditional property, expected one"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzeu.x(r30)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.zzes r4 = r29.e()     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.String r4 = r4.A(r7)     // Catch:{ SQLiteException -> 0x00f0 }
            r1.c(r2, r3, r4)     // Catch:{ SQLiteException -> 0x00f0 }
        L_0x00ea:
            if (r9 == 0) goto L_0x00ef
            r9.close()
        L_0x00ef:
            return r0
        L_0x00f0:
            r0 = move-exception
            goto L_0x0102
        L_0x00f2:
            r0 = move-exception
            r10 = r29
            goto L_0x0122
        L_0x00f6:
            r0 = move-exception
            r10 = r29
            goto L_0x0102
        L_0x00fa:
            r0 = move-exception
            r10 = r29
            goto L_0x0123
        L_0x00fe:
            r0 = move-exception
            r10 = r29
            r9 = r8
        L_0x0102:
            com.google.android.gms.measurement.internal.zzeu r1 = r29.h()     // Catch:{ all -> 0x0121 }
            com.google.android.gms.measurement.internal.zzew r1 = r1.G()     // Catch:{ all -> 0x0121 }
            java.lang.String r2 = "Error querying conditional property"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzeu.x(r30)     // Catch:{ all -> 0x0121 }
            com.google.android.gms.measurement.internal.zzes r4 = r29.e()     // Catch:{ all -> 0x0121 }
            java.lang.String r4 = r4.A(r7)     // Catch:{ all -> 0x0121 }
            r1.d(r2, r3, r4, r0)     // Catch:{ all -> 0x0121 }
            if (r9 == 0) goto L_0x0120
            r9.close()
        L_0x0120:
            return r8
        L_0x0121:
            r0 = move-exception
        L_0x0122:
            r8 = r9
        L_0x0123:
            if (r8 == 0) goto L_0x0128
            r8.close()
        L_0x0128:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.c.p0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzw");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] q0(java.lang.String r11) {
        /*
            r10 = this;
            com.google.android.gms.common.internal.Preconditions.g(r11)
            r10.c()
            r10.s()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.w()     // Catch:{ SQLiteException -> 0x0056, all -> 0x0054 }
            java.lang.String r2 = "apps"
            java.lang.String r3 = "remote_config"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x0056, all -> 0x0054 }
            java.lang.String r4 = "app_id=?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0056, all -> 0x0054 }
            r9 = 0
            r5[r9] = r11     // Catch:{ SQLiteException -> 0x0056, all -> 0x0054 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0056, all -> 0x0054 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0052 }
            if (r2 != 0) goto L_0x0031
            if (r1 == 0) goto L_0x0030
            r1.close()
        L_0x0030:
            return r0
        L_0x0031:
            byte[] r2 = r1.getBlob(r9)     // Catch:{ SQLiteException -> 0x0052 }
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0052 }
            if (r3 == 0) goto L_0x004c
            com.google.android.gms.measurement.internal.zzeu r3 = r10.h()     // Catch:{ SQLiteException -> 0x0052 }
            com.google.android.gms.measurement.internal.zzew r3 = r3.G()     // Catch:{ SQLiteException -> 0x0052 }
            java.lang.String r4 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzeu.x(r11)     // Catch:{ SQLiteException -> 0x0052 }
            r3.b(r4, r5)     // Catch:{ SQLiteException -> 0x0052 }
        L_0x004c:
            if (r1 == 0) goto L_0x0051
            r1.close()
        L_0x0051:
            return r2
        L_0x0052:
            r2 = move-exception
            goto L_0x0058
        L_0x0054:
            r11 = move-exception
            goto L_0x0071
        L_0x0056:
            r2 = move-exception
            r1 = r0
        L_0x0058:
            com.google.android.gms.measurement.internal.zzeu r3 = r10.h()     // Catch:{ all -> 0x006f }
            com.google.android.gms.measurement.internal.zzew r3 = r3.G()     // Catch:{ all -> 0x006f }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzeu.x(r11)     // Catch:{ all -> 0x006f }
            r3.c(r4, r11, r2)     // Catch:{ all -> 0x006f }
            if (r1 == 0) goto L_0x006e
            r1.close()
        L_0x006e:
            return r0
        L_0x006f:
            r11 = move-exception
            r0 = r1
        L_0x0071:
            if (r0 == 0) goto L_0x0076
            r0.close()
        L_0x0076:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.c.q0(java.lang.String):byte[]");
    }

    public final int r0(String str, String str2) {
        Preconditions.g(str);
        Preconditions.g(str2);
        c();
        s();
        try {
            return w().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            h().G().d("Error deleting conditional property", zzeu.x(str), e().A(str2), e2);
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, List<zzbt.zzb>> s0(String str) {
        Preconditions.g(str);
        a aVar = new a();
        Cursor cursor = null;
        try {
            cursor = w().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                Map<Integer, List<zzbt.zzb>> emptyMap = Collections.emptyMap();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyMap;
            }
            do {
                try {
                    zzbt.zzb zzb = (zzbt.zzb) ((zzfo) ((zzbt.zzb.zza) zzkn.A(zzbt.zzb.U(), cursor.getBlob(1))).q());
                    if (zzb.O()) {
                        int i2 = cursor.getInt(0);
                        List list = (List) aVar.get(Integer.valueOf(i2));
                        if (list == null) {
                            list = new ArrayList();
                            aVar.put(Integer.valueOf(i2), list);
                        }
                        list.add(zzb);
                    }
                } catch (IOException e2) {
                    h().G().c("Failed to merge filter. appId", zzeu.x(str), e2);
                }
            } while (cursor.moveToNext());
            if (cursor != null) {
                cursor.close();
            }
            return aVar;
        } catch (SQLiteException e3) {
            h().G().c("Database error querying filters. appId", zzeu.x(str), e3);
            Map<Integer, List<zzbt.zzb>> emptyMap2 = Collections.emptyMap();
            if (cursor != null) {
                cursor.close();
            }
            return emptyMap2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008e A[Catch:{ all -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> t0(java.lang.String r8) {
        /*
            r7 = this;
            r7.s()
            r7.c()
            com.google.android.gms.common.internal.Preconditions.g(r8)
            a.e.a r0 = new a.e.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r7.w()
            r2 = 0
            java.lang.String r3 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0069, all -> 0x0067 }
            r5 = 0
            r4[r5] = r8     // Catch:{ SQLiteException -> 0x0069, all -> 0x0067 }
            r6 = 1
            r4[r6] = r8     // Catch:{ SQLiteException -> 0x0069, all -> 0x0067 }
            android.database.Cursor r1 = r1.rawQuery(r3, r4)     // Catch:{ SQLiteException -> 0x0069, all -> 0x0067 }
            boolean r3 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0065 }
            if (r3 != 0) goto L_0x0032
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0065 }
            if (r1 == 0) goto L_0x0031
            r1.close()
        L_0x0031:
            return r8
        L_0x0032:
            int r3 = r1.getInt(r5)     // Catch:{ SQLiteException -> 0x0065 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x0065 }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ SQLiteException -> 0x0065 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ SQLiteException -> 0x0065 }
            if (r4 != 0) goto L_0x004e
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0065 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0065 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x0065 }
            r0.put(r3, r4)     // Catch:{ SQLiteException -> 0x0065 }
        L_0x004e:
            int r3 = r1.getInt(r6)     // Catch:{ SQLiteException -> 0x0065 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x0065 }
            r4.add(r3)     // Catch:{ SQLiteException -> 0x0065 }
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0065 }
            if (r3 != 0) goto L_0x0032
            if (r1 == 0) goto L_0x0064
            r1.close()
        L_0x0064:
            return r0
        L_0x0065:
            r0 = move-exception
            goto L_0x006b
        L_0x0067:
            r8 = move-exception
            goto L_0x00a0
        L_0x0069:
            r0 = move-exception
            r1 = r2
        L_0x006b:
            com.google.android.gms.measurement.internal.zzeu r3 = r7.h()     // Catch:{ all -> 0x009e }
            com.google.android.gms.measurement.internal.zzew r3 = r3.G()     // Catch:{ all -> 0x009e }
            java.lang.String r4 = "Database error querying scoped filters. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzeu.x(r8)     // Catch:{ all -> 0x009e }
            r3.c(r4, r5, r0)     // Catch:{ all -> 0x009e }
            boolean r0 = com.google.android.gms.internal.measurement.zzku.b()     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x0098
            com.google.android.gms.measurement.internal.zzy r0 = r7.l()     // Catch:{ all -> 0x009e }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.zzaq.T0     // Catch:{ all -> 0x009e }
            boolean r8 = r0.C(r8, r3)     // Catch:{ all -> 0x009e }
            if (r8 == 0) goto L_0x0098
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x009e }
            if (r1 == 0) goto L_0x0097
            r1.close()
        L_0x0097:
            return r8
        L_0x0098:
            if (r1 == 0) goto L_0x009d
            r1.close()
        L_0x009d:
            return r2
        L_0x009e:
            r8 = move-exception
            r2 = r1
        L_0x00a0:
            if (r2 == 0) goto L_0x00a5
            r2.close()
        L_0x00a5:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.c.t0(java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: protected */
    public final boolean u() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bf A[Catch:{ all -> 0x00cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzbt.zzb>> u0(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.s()
            r12.c()
            com.google.android.gms.common.internal.Preconditions.g(r13)
            com.google.android.gms.common.internal.Preconditions.g(r14)
            a.e.a r0 = new a.e.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.w()
            r9 = 0
            java.lang.String r2 = "event_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteException -> 0x009a, all -> 0x0098 }
            java.lang.String r4 = "app_id=? AND event_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x009a, all -> 0x0098 }
            r10 = 0
            r5[r10] = r13     // Catch:{ SQLiteException -> 0x009a, all -> 0x0098 }
            r11 = 1
            r5[r11] = r14     // Catch:{ SQLiteException -> 0x009a, all -> 0x0098 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x009a, all -> 0x0098 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0096 }
            if (r1 != 0) goto L_0x0042
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0096 }
            if (r14 == 0) goto L_0x0041
            r14.close()
        L_0x0041:
            return r13
        L_0x0042:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x0096 }
            com.google.android.gms.internal.measurement.zzbt$zzb$zza r2 = com.google.android.gms.internal.measurement.zzbt.zzb.U()     // Catch:{ IOException -> 0x0078 }
            com.google.android.gms.internal.measurement.zzgz r1 = com.google.android.gms.measurement.internal.zzkn.A(r2, r1)     // Catch:{ IOException -> 0x0078 }
            com.google.android.gms.internal.measurement.zzbt$zzb$zza r1 = (com.google.android.gms.internal.measurement.zzbt.zzb.zza) r1     // Catch:{ IOException -> 0x0078 }
            com.google.android.gms.internal.measurement.zzgw r1 = r1.q()     // Catch:{ IOException -> 0x0078 }
            com.google.android.gms.internal.measurement.zzfo r1 = (com.google.android.gms.internal.measurement.zzfo) r1     // Catch:{ IOException -> 0x0078 }
            com.google.android.gms.internal.measurement.zzbt$zzb r1 = (com.google.android.gms.internal.measurement.zzbt.zzb) r1     // Catch:{ IOException -> 0x0078 }
            int r2 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x0096 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0096 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x0096 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x0096 }
            if (r3 != 0) goto L_0x0074
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0096 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0096 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0096 }
            r0.put(r2, r3)     // Catch:{ SQLiteException -> 0x0096 }
        L_0x0074:
            r3.add(r1)     // Catch:{ SQLiteException -> 0x0096 }
            goto L_0x008a
        L_0x0078:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzeu r2 = r12.h()     // Catch:{ SQLiteException -> 0x0096 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.G()     // Catch:{ SQLiteException -> 0x0096 }
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeu.x(r13)     // Catch:{ SQLiteException -> 0x0096 }
            r2.c(r3, r4, r1)     // Catch:{ SQLiteException -> 0x0096 }
        L_0x008a:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0096 }
            if (r1 != 0) goto L_0x0042
            if (r14 == 0) goto L_0x0095
            r14.close()
        L_0x0095:
            return r0
        L_0x0096:
            r0 = move-exception
            goto L_0x009c
        L_0x0098:
            r13 = move-exception
            goto L_0x00d1
        L_0x009a:
            r0 = move-exception
            r14 = r9
        L_0x009c:
            com.google.android.gms.measurement.internal.zzeu r1 = r12.h()     // Catch:{ all -> 0x00cf }
            com.google.android.gms.measurement.internal.zzew r1 = r1.G()     // Catch:{ all -> 0x00cf }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzeu.x(r13)     // Catch:{ all -> 0x00cf }
            r1.c(r2, r3, r0)     // Catch:{ all -> 0x00cf }
            boolean r0 = com.google.android.gms.internal.measurement.zzku.b()     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x00c9
            com.google.android.gms.measurement.internal.zzy r0 = r12.l()     // Catch:{ all -> 0x00cf }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.zzaq.T0     // Catch:{ all -> 0x00cf }
            boolean r13 = r0.C(r13, r1)     // Catch:{ all -> 0x00cf }
            if (r13 == 0) goto L_0x00c9
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x00cf }
            if (r14 == 0) goto L_0x00c8
            r14.close()
        L_0x00c8:
            return r13
        L_0x00c9:
            if (r14 == 0) goto L_0x00ce
            r14.close()
        L_0x00ce:
            return r9
        L_0x00cf:
            r13 = move-exception
            r9 = r14
        L_0x00d1:
            if (r9 == 0) goto L_0x00d6
            r9.close()
        L_0x00d6:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.c.u0(java.lang.String, java.lang.String):java.util.Map");
    }

    public final void v() {
        s();
        w().setTransactionSuccessful();
    }

    public final void v0() {
        s();
        w().beginTransaction();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final SQLiteDatabase w() {
        c();
        try {
            return this.f10121d.getWritableDatabase();
        } catch (SQLiteException e2) {
            h().J().b("Error opening database", e2);
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c1 A[Catch:{ all -> 0x00d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, com.google.android.gms.internal.measurement.zzcb.zzi> w0(java.lang.String r12) {
        /*
            r11 = this;
            r11.s()
            r11.c()
            com.google.android.gms.common.internal.Preconditions.g(r12)
            android.database.sqlite.SQLiteDatabase r0 = r11.w()
            r8 = 0
            java.lang.String r1 = "audience_filter_values"
            java.lang.String r2 = "audience_id"
            java.lang.String r3 = "current_results"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch:{ SQLiteException -> 0x009c, all -> 0x009a }
            java.lang.String r3 = "app_id=?"
            r9 = 1
            java.lang.String[] r4 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x009c, all -> 0x009a }
            r10 = 0
            r4[r10] = r12     // Catch:{ SQLiteException -> 0x009c, all -> 0x009a }
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ SQLiteException -> 0x009c, all -> 0x009a }
            boolean r1 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x0098 }
            if (r1 != 0) goto L_0x004f
            boolean r1 = com.google.android.gms.internal.measurement.zzku.b()     // Catch:{ SQLiteException -> 0x0098 }
            if (r1 == 0) goto L_0x0049
            com.google.android.gms.measurement.internal.zzy r1 = r11.l()     // Catch:{ SQLiteException -> 0x0098 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.zzaq.T0     // Catch:{ SQLiteException -> 0x0098 }
            boolean r1 = r1.C(r12, r2)     // Catch:{ SQLiteException -> 0x0098 }
            if (r1 == 0) goto L_0x0049
            java.util.Map r12 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0098 }
            if (r0 == 0) goto L_0x0048
            r0.close()
        L_0x0048:
            return r12
        L_0x0049:
            if (r0 == 0) goto L_0x004e
            r0.close()
        L_0x004e:
            return r8
        L_0x004f:
            a.e.a r1 = new a.e.a     // Catch:{ SQLiteException -> 0x0098 }
            r1.<init>()     // Catch:{ SQLiteException -> 0x0098 }
        L_0x0054:
            int r2 = r0.getInt(r10)     // Catch:{ SQLiteException -> 0x0098 }
            byte[] r3 = r0.getBlob(r9)     // Catch:{ SQLiteException -> 0x0098 }
            com.google.android.gms.internal.measurement.zzcb$zzi$zza r4 = com.google.android.gms.internal.measurement.zzcb.zzi.c0()     // Catch:{ IOException -> 0x0076 }
            com.google.android.gms.internal.measurement.zzgz r3 = com.google.android.gms.measurement.internal.zzkn.A(r4, r3)     // Catch:{ IOException -> 0x0076 }
            com.google.android.gms.internal.measurement.zzcb$zzi$zza r3 = (com.google.android.gms.internal.measurement.zzcb.zzi.zza) r3     // Catch:{ IOException -> 0x0076 }
            com.google.android.gms.internal.measurement.zzgw r3 = r3.q()     // Catch:{ IOException -> 0x0076 }
            com.google.android.gms.internal.measurement.zzfo r3 = (com.google.android.gms.internal.measurement.zzfo) r3     // Catch:{ IOException -> 0x0076 }
            com.google.android.gms.internal.measurement.zzcb$zzi r3 = (com.google.android.gms.internal.measurement.zzcb.zzi) r3     // Catch:{ IOException -> 0x0076 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0098 }
            r1.put(r2, r3)     // Catch:{ SQLiteException -> 0x0098 }
            goto L_0x008c
        L_0x0076:
            r3 = move-exception
            com.google.android.gms.measurement.internal.zzeu r4 = r11.h()     // Catch:{ SQLiteException -> 0x0098 }
            com.google.android.gms.measurement.internal.zzew r4 = r4.G()     // Catch:{ SQLiteException -> 0x0098 }
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzeu.x(r12)     // Catch:{ SQLiteException -> 0x0098 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0098 }
            r4.d(r5, r6, r2, r3)     // Catch:{ SQLiteException -> 0x0098 }
        L_0x008c:
            boolean r2 = r0.moveToNext()     // Catch:{ SQLiteException -> 0x0098 }
            if (r2 != 0) goto L_0x0054
            if (r0 == 0) goto L_0x0097
            r0.close()
        L_0x0097:
            return r1
        L_0x0098:
            r1 = move-exception
            goto L_0x009e
        L_0x009a:
            r12 = move-exception
            goto L_0x00d3
        L_0x009c:
            r1 = move-exception
            r0 = r8
        L_0x009e:
            com.google.android.gms.measurement.internal.zzeu r2 = r11.h()     // Catch:{ all -> 0x00d1 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.G()     // Catch:{ all -> 0x00d1 }
            java.lang.String r3 = "Database error querying filter results. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeu.x(r12)     // Catch:{ all -> 0x00d1 }
            r2.c(r3, r4, r1)     // Catch:{ all -> 0x00d1 }
            boolean r1 = com.google.android.gms.internal.measurement.zzku.b()     // Catch:{ all -> 0x00d1 }
            if (r1 == 0) goto L_0x00cb
            com.google.android.gms.measurement.internal.zzy r1 = r11.l()     // Catch:{ all -> 0x00d1 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.zzaq.T0     // Catch:{ all -> 0x00d1 }
            boolean r12 = r1.C(r12, r2)     // Catch:{ all -> 0x00d1 }
            if (r12 == 0) goto L_0x00cb
            java.util.Map r12 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x00d1 }
            if (r0 == 0) goto L_0x00ca
            r0.close()
        L_0x00ca:
            return r12
        L_0x00cb:
            if (r0 == 0) goto L_0x00d0
            r0.close()
        L_0x00d0:
            return r8
        L_0x00d1:
            r12 = move-exception
            r8 = r0
        L_0x00d3:
            if (r8 == 0) goto L_0x00d8
            r8.close()
        L_0x00d8:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.c.w0(java.lang.String):java.util.Map");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String x() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.w()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0029, all -> 0x0024 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x0022 }
            if (r2 == 0) goto L_0x001c
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x0022 }
            if (r0 == 0) goto L_0x001b
            r0.close()
        L_0x001b:
            return r1
        L_0x001c:
            if (r0 == 0) goto L_0x0021
            r0.close()
        L_0x0021:
            return r1
        L_0x0022:
            r2 = move-exception
            goto L_0x002b
        L_0x0024:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x003f
        L_0x0029:
            r2 = move-exception
            r0 = r1
        L_0x002b:
            com.google.android.gms.measurement.internal.zzeu r3 = r6.h()     // Catch:{ all -> 0x003e }
            com.google.android.gms.measurement.internal.zzew r3 = r3.G()     // Catch:{ all -> 0x003e }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x003d
            r0.close()
        L_0x003d:
            return r1
        L_0x003e:
            r1 = move-exception
        L_0x003f:
            if (r0 == 0) goto L_0x0044
            r0.close()
        L_0x0044:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.c.x():java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bf A[Catch:{ all -> 0x00cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzbt.zze>> x0(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.s()
            r12.c()
            com.google.android.gms.common.internal.Preconditions.g(r13)
            com.google.android.gms.common.internal.Preconditions.g(r14)
            a.e.a r0 = new a.e.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.w()
            r9 = 0
            java.lang.String r2 = "property_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteException -> 0x009a, all -> 0x0098 }
            java.lang.String r4 = "app_id=? AND property_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x009a, all -> 0x0098 }
            r10 = 0
            r5[r10] = r13     // Catch:{ SQLiteException -> 0x009a, all -> 0x0098 }
            r11 = 1
            r5[r11] = r14     // Catch:{ SQLiteException -> 0x009a, all -> 0x0098 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x009a, all -> 0x0098 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0096 }
            if (r1 != 0) goto L_0x0042
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0096 }
            if (r14 == 0) goto L_0x0041
            r14.close()
        L_0x0041:
            return r13
        L_0x0042:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x0096 }
            com.google.android.gms.internal.measurement.zzbt$zze$zza r2 = com.google.android.gms.internal.measurement.zzbt.zze.O()     // Catch:{ IOException -> 0x0078 }
            com.google.android.gms.internal.measurement.zzgz r1 = com.google.android.gms.measurement.internal.zzkn.A(r2, r1)     // Catch:{ IOException -> 0x0078 }
            com.google.android.gms.internal.measurement.zzbt$zze$zza r1 = (com.google.android.gms.internal.measurement.zzbt.zze.zza) r1     // Catch:{ IOException -> 0x0078 }
            com.google.android.gms.internal.measurement.zzgw r1 = r1.q()     // Catch:{ IOException -> 0x0078 }
            com.google.android.gms.internal.measurement.zzfo r1 = (com.google.android.gms.internal.measurement.zzfo) r1     // Catch:{ IOException -> 0x0078 }
            com.google.android.gms.internal.measurement.zzbt$zze r1 = (com.google.android.gms.internal.measurement.zzbt.zze) r1     // Catch:{ IOException -> 0x0078 }
            int r2 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x0096 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0096 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x0096 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x0096 }
            if (r3 != 0) goto L_0x0074
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0096 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0096 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0096 }
            r0.put(r2, r3)     // Catch:{ SQLiteException -> 0x0096 }
        L_0x0074:
            r3.add(r1)     // Catch:{ SQLiteException -> 0x0096 }
            goto L_0x008a
        L_0x0078:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzeu r2 = r12.h()     // Catch:{ SQLiteException -> 0x0096 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.G()     // Catch:{ SQLiteException -> 0x0096 }
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeu.x(r13)     // Catch:{ SQLiteException -> 0x0096 }
            r2.c(r3, r4, r1)     // Catch:{ SQLiteException -> 0x0096 }
        L_0x008a:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0096 }
            if (r1 != 0) goto L_0x0042
            if (r14 == 0) goto L_0x0095
            r14.close()
        L_0x0095:
            return r0
        L_0x0096:
            r0 = move-exception
            goto L_0x009c
        L_0x0098:
            r13 = move-exception
            goto L_0x00d1
        L_0x009a:
            r0 = move-exception
            r14 = r9
        L_0x009c:
            com.google.android.gms.measurement.internal.zzeu r1 = r12.h()     // Catch:{ all -> 0x00cf }
            com.google.android.gms.measurement.internal.zzew r1 = r1.G()     // Catch:{ all -> 0x00cf }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzeu.x(r13)     // Catch:{ all -> 0x00cf }
            r1.c(r2, r3, r0)     // Catch:{ all -> 0x00cf }
            boolean r0 = com.google.android.gms.internal.measurement.zzku.b()     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x00c9
            com.google.android.gms.measurement.internal.zzy r0 = r12.l()     // Catch:{ all -> 0x00cf }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.zzaq.T0     // Catch:{ all -> 0x00cf }
            boolean r13 = r0.C(r13, r1)     // Catch:{ all -> 0x00cf }
            if (r13 == 0) goto L_0x00c9
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x00cf }
            if (r14 == 0) goto L_0x00c8
            r14.close()
        L_0x00c8:
            return r13
        L_0x00c9:
            if (r14 == 0) goto L_0x00ce
            r14.close()
        L_0x00ce:
            return r9
        L_0x00cf:
            r13 = move-exception
            r9 = r14
        L_0x00d1:
            if (r9 == 0) goto L_0x00d6
            r9.close()
        L_0x00d6:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.c.x0(java.lang.String, java.lang.String):java.util.Map");
    }

    public final long y(zzcb.zzg zzg) throws IOException {
        c();
        s();
        Preconditions.k(zzg);
        Preconditions.g(zzg.I2());
        byte[] j2 = zzg.j();
        long w = o().w(j2);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzg.I2());
        contentValues.put("metadata_fingerprint", Long.valueOf(w));
        contentValues.put("metadata", j2);
        try {
            w().insertWithOnConflict("raw_events_metadata", (String) null, contentValues, 4);
            return w;
        } catch (SQLiteException e2) {
            h().G().c("Error storing raw event metadata. appId", zzeu.x(zzg.I2()), e2);
            throw e2;
        }
    }

    public final long y0(String str) {
        Preconditions.g(str);
        return z("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    public final long z0(String str, String str2) {
        long z;
        String str3 = str;
        String str4 = str2;
        Preconditions.g(str);
        Preconditions.g(str2);
        c();
        s();
        SQLiteDatabase w = w();
        w.beginTransaction();
        long j2 = 0;
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32);
            sb.append("select ");
            sb.append(str4);
            sb.append(" from app2 where app_id=?");
            try {
                z = z(sb.toString(), new String[]{str3}, -1);
                if (z == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str3);
                    contentValues.put("first_open_count", 0);
                    contentValues.put("previous_install_count", 0);
                    if (w.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                        h().G().c("Failed to insert column (got -1). appId", zzeu.x(str), str4);
                        w.endTransaction();
                        return -1;
                    }
                    z = 0;
                }
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    h().G().d("Error inserting column. appId", zzeu.x(str), str4, e);
                    w.endTransaction();
                    return j2;
                } catch (Throwable th) {
                    th = th;
                    w.endTransaction();
                    throw th;
                }
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str3);
                contentValues2.put(str4, Long.valueOf(1 + z));
                if (((long) w.update("app2", contentValues2, "app_id = ?", new String[]{str3})) == 0) {
                    h().G().c("Failed to update column (got 0). appId", zzeu.x(str), str4);
                    w.endTransaction();
                    return -1;
                }
                w.setTransactionSuccessful();
                w.endTransaction();
                return z;
            } catch (SQLiteException e3) {
                e = e3;
                j2 = z;
                h().G().d("Error inserting column. appId", zzeu.x(str), str4, e);
                w.endTransaction();
                return j2;
            }
        } catch (SQLiteException e4) {
            e = e4;
            h().G().d("Error inserting column. appId", zzeu.x(str), str4, e);
            w.endTransaction();
            return j2;
        } catch (Throwable th2) {
            th = th2;
            w.endTransaction();
            throw th;
        }
    }
}
