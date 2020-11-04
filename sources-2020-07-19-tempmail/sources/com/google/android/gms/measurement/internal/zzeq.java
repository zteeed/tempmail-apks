package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzeq extends x3 {

    /* renamed from: c  reason: collision with root package name */
    private final h3 f10393c = new h3(this, f(), "google_app_measurement_local.db");

    /* renamed from: d  reason: collision with root package name */
    private boolean f10394d;

    zzeq(zzfy zzfy) {
        super(zzfy);
    }

    private static long C(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, (String) null, (String) null, "rowid desc", "1");
            if (cursor.moveToFirst()) {
                return cursor.getLong(0);
            }
            if (cursor == null) {
                return -1;
            }
            cursor.close();
            return -1;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r7v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c4 A[SYNTHETIC, Splitter:B:47:0x00c4] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x011a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x011a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x011a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean E(int r17, byte[] r18) {
        /*
            r16 = this;
            r1 = r16
            r16.a()
            r16.c()
            boolean r0 = r1.f10394d
            r2 = 0
            if (r0 == 0) goto L_0x000e
            return r2
        L_0x000e:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            java.lang.String r4 = "type"
            r3.put(r4, r0)
            java.lang.String r0 = "entry"
            r4 = r18
            r3.put(r0, r4)
            r4 = 5
            r5 = 0
            r6 = 5
        L_0x0026:
            if (r5 >= r4) goto L_0x012c
            r7 = 0
            r8 = 1
            android.database.sqlite.SQLiteDatabase r9 = r16.L()     // Catch:{ SQLiteFullException -> 0x00fe, SQLiteDatabaseLockedException -> 0x00ec, SQLiteException -> 0x00c0, all -> 0x00bd }
            if (r9 != 0) goto L_0x0038
            r1.f10394d = r8     // Catch:{ SQLiteFullException -> 0x00bb, SQLiteDatabaseLockedException -> 0x00ed, SQLiteException -> 0x00b7 }
            if (r9 == 0) goto L_0x0037
            r9.close()
        L_0x0037:
            return r2
        L_0x0038:
            r9.beginTransaction()     // Catch:{ SQLiteFullException -> 0x00bb, SQLiteDatabaseLockedException -> 0x00ed, SQLiteException -> 0x00b7 }
            r10 = 0
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r12 = r9.rawQuery(r0, r7)     // Catch:{ SQLiteFullException -> 0x00bb, SQLiteDatabaseLockedException -> 0x00ed, SQLiteException -> 0x00b7 }
            if (r12 == 0) goto L_0x0059
            boolean r0 = r12.moveToFirst()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            if (r0 == 0) goto L_0x0059
            long r10 = r12.getLong(r2)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            goto L_0x0059
        L_0x0050:
            r0 = move-exception
            goto L_0x00ea
        L_0x0053:
            r0 = move-exception
            goto L_0x00b9
        L_0x0055:
            r0 = move-exception
            r7 = r12
            goto L_0x0100
        L_0x0059:
            java.lang.String r0 = "messages"
            r13 = 100000(0x186a0, double:4.94066E-319)
            int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r15 < 0) goto L_0x00a0
            com.google.android.gms.measurement.internal.zzeu r15 = r16.h()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            com.google.android.gms.measurement.internal.zzew r15 = r15.G()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            java.lang.String r4 = "Data loss, local db full"
            r15.a(r4)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            long r13 = r13 - r10
            r10 = 1
            long r13 = r13 + r10
            java.lang.String r4 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            java.lang.String r11 = java.lang.Long.toString(r13)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            r10[r2] = r11     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            int r4 = r9.delete(r0, r4, r10)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            long r10 = (long) r4     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            int r4 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x00a0
            com.google.android.gms.measurement.internal.zzeu r4 = r16.h()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            com.google.android.gms.measurement.internal.zzew r4 = r4.G()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            java.lang.String r15 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r2 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            java.lang.Long r8 = java.lang.Long.valueOf(r10)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            long r13 = r13 - r10
            java.lang.Long r10 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            r4.d(r15, r2, r8, r10)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
        L_0x00a0:
            r9.insertOrThrow(r0, r7, r3)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            r9.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            r9.endTransaction()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            if (r12 == 0) goto L_0x00ae
            r12.close()
        L_0x00ae:
            if (r9 == 0) goto L_0x00b3
            r9.close()
        L_0x00b3:
            r2 = 1
            return r2
        L_0x00b5:
            r7 = r12
            goto L_0x00ed
        L_0x00b7:
            r0 = move-exception
            r12 = r7
        L_0x00b9:
            r7 = r9
            goto L_0x00c2
        L_0x00bb:
            r0 = move-exception
            goto L_0x0100
        L_0x00bd:
            r0 = move-exception
            r9 = r7
            goto L_0x0121
        L_0x00c0:
            r0 = move-exception
            r12 = r7
        L_0x00c2:
            if (r7 == 0) goto L_0x00cd
            boolean r2 = r7.inTransaction()     // Catch:{ all -> 0x00e8 }
            if (r2 == 0) goto L_0x00cd
            r7.endTransaction()     // Catch:{ all -> 0x00e8 }
        L_0x00cd:
            com.google.android.gms.measurement.internal.zzeu r2 = r16.h()     // Catch:{ all -> 0x00e8 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.G()     // Catch:{ all -> 0x00e8 }
            java.lang.String r4 = "Error writing entry to local database"
            r2.b(r4, r0)     // Catch:{ all -> 0x00e8 }
            r2 = 1
            r1.f10394d = r2     // Catch:{ all -> 0x00e8 }
            if (r12 == 0) goto L_0x00e2
            r12.close()
        L_0x00e2:
            if (r7 == 0) goto L_0x011a
            r7.close()
            goto L_0x011a
        L_0x00e8:
            r0 = move-exception
            r9 = r7
        L_0x00ea:
            r7 = r12
            goto L_0x0121
        L_0x00ec:
            r9 = r7
        L_0x00ed:
            long r10 = (long) r6
            android.os.SystemClock.sleep(r10)     // Catch:{ all -> 0x0120 }
            int r6 = r6 + 20
            if (r7 == 0) goto L_0x00f8
            r7.close()
        L_0x00f8:
            if (r9 == 0) goto L_0x011a
            r9.close()
            goto L_0x011a
        L_0x00fe:
            r0 = move-exception
            r9 = r7
        L_0x0100:
            com.google.android.gms.measurement.internal.zzeu r2 = r16.h()     // Catch:{ all -> 0x0120 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.G()     // Catch:{ all -> 0x0120 }
            java.lang.String r4 = "Error writing entry; local database full"
            r2.b(r4, r0)     // Catch:{ all -> 0x0120 }
            r2 = 1
            r1.f10394d = r2     // Catch:{ all -> 0x0120 }
            if (r7 == 0) goto L_0x0115
            r7.close()
        L_0x0115:
            if (r9 == 0) goto L_0x011a
            r9.close()
        L_0x011a:
            int r5 = r5 + 1
            r2 = 0
            r4 = 5
            goto L_0x0026
        L_0x0120:
            r0 = move-exception
        L_0x0121:
            if (r7 == 0) goto L_0x0126
            r7.close()
        L_0x0126:
            if (r9 == 0) goto L_0x012b
            r9.close()
        L_0x012b:
            throw r0
        L_0x012c:
            com.google.android.gms.measurement.internal.zzeu r0 = r16.h()
            com.google.android.gms.measurement.internal.zzew r0 = r0.O()
            java.lang.String r2 = "Failed to write entry to local database"
            r0.a(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzeq.E(int, byte[]):boolean");
    }

    @VisibleForTesting
    private final SQLiteDatabase L() throws SQLiteException {
        if (this.f10394d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f10393c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f10394d = true;
        return null;
    }

    @VisibleForTesting
    private final boolean M() {
        return f().getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* access modifiers changed from: protected */
    public final boolean B() {
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:60|61|62|63) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:75|76|77|78) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:47|48|49|50|175) */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x018f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0196, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        h().G().a("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r11.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        h().G().a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r11.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        h().G().a("Failed to load conditional user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        r11.recycle();
        r0 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00a4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x00d4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x010a */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x018f A[ExcHandler: all (th java.lang.Throwable), Splitter:B:12:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:112:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), SYNTHETIC, Splitter:B:12:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01a6 A[SYNTHETIC, Splitter:B:125:0x01a6] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x01f4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x01f4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x01f4 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable> D(int r22) {
        /*
            r21 = this;
            r1 = r21
            java.lang.String r2 = "Error reading entries from local database"
            r21.c()
            r21.a()
            boolean r0 = r1.f10394d
            r3 = 0
            if (r0 == 0) goto L_0x0010
            return r3
        L_0x0010:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r0 = r21.M()
            if (r0 != 0) goto L_0x001c
            return r4
        L_0x001c:
            r5 = 5
            r6 = 0
            r7 = 0
            r8 = 5
        L_0x0020:
            if (r7 >= r5) goto L_0x0207
            r9 = 1
            android.database.sqlite.SQLiteDatabase r15 = r21.L()     // Catch:{ SQLiteFullException -> 0x01da, SQLiteDatabaseLockedException -> 0x01c7, SQLiteException -> 0x01a1, all -> 0x019e }
            if (r15 != 0) goto L_0x0037
            r1.f10394d = r9     // Catch:{ SQLiteFullException -> 0x0034, SQLiteDatabaseLockedException -> 0x0196, SQLiteException -> 0x0031, all -> 0x018f }
            if (r15 == 0) goto L_0x0030
            r15.close()
        L_0x0030:
            return r3
        L_0x0031:
            r0 = move-exception
            goto L_0x0194
        L_0x0034:
            r0 = move-exception
            goto L_0x019c
        L_0x0037:
            r15.beginTransaction()     // Catch:{ SQLiteFullException -> 0x019a, SQLiteDatabaseLockedException -> 0x0196, SQLiteException -> 0x0192, all -> 0x018f }
            long r10 = C(r15)     // Catch:{ SQLiteFullException -> 0x019a, SQLiteDatabaseLockedException -> 0x0196, SQLiteException -> 0x0192, all -> 0x018f }
            r19 = -1
            int r0 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "rowid<?"
            java.lang.String[] r12 = new java.lang.String[r9]     // Catch:{ SQLiteFullException -> 0x0034, SQLiteDatabaseLockedException -> 0x0196, SQLiteException -> 0x0031, all -> 0x018f }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ SQLiteFullException -> 0x0034, SQLiteDatabaseLockedException -> 0x0196, SQLiteException -> 0x0031, all -> 0x018f }
            r12[r6] = r10     // Catch:{ SQLiteFullException -> 0x0034, SQLiteDatabaseLockedException -> 0x0196, SQLiteException -> 0x0031, all -> 0x018f }
            r13 = r0
            r14 = r12
            goto L_0x0053
        L_0x0051:
            r13 = r3
            r14 = r13
        L_0x0053:
            java.lang.String r11 = "messages"
            java.lang.String r0 = "rowid"
            java.lang.String r10 = "type"
            java.lang.String r12 = "entry"
            java.lang.String[] r12 = new java.lang.String[]{r0, r10, r12}     // Catch:{ SQLiteFullException -> 0x019a, SQLiteDatabaseLockedException -> 0x0196, SQLiteException -> 0x0192, all -> 0x018f }
            r0 = 0
            r16 = 0
            java.lang.String r17 = "rowid asc"
            r10 = 100
            java.lang.String r18 = java.lang.Integer.toString(r10)     // Catch:{ SQLiteFullException -> 0x019a, SQLiteDatabaseLockedException -> 0x0196, SQLiteException -> 0x0192, all -> 0x018f }
            r10 = r15
            r5 = r15
            r15 = r0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteFullException -> 0x018a, SQLiteDatabaseLockedException -> 0x0197, SQLiteException -> 0x0186, all -> 0x0183 }
        L_0x0071:
            boolean r0 = r10.moveToNext()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            if (r0 == 0) goto L_0x0147
            long r19 = r10.getLong(r6)     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            int r0 = r10.getInt(r9)     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            r11 = 2
            byte[] r12 = r10.getBlob(r11)     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            if (r0 != 0) goto L_0x00b9
            android.os.Parcel r11 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            int r0 = r12.length     // Catch:{ ParseException -> 0x00a4 }
            r11.unmarshall(r12, r6, r0)     // Catch:{ ParseException -> 0x00a4 }
            r11.setDataPosition(r6)     // Catch:{ ParseException -> 0x00a4 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzao> r0 = com.google.android.gms.measurement.internal.zzao.CREATOR     // Catch:{ ParseException -> 0x00a4 }
            java.lang.Object r0 = r0.createFromParcel(r11)     // Catch:{ ParseException -> 0x00a4 }
            com.google.android.gms.measurement.internal.zzao r0 = (com.google.android.gms.measurement.internal.zzao) r0     // Catch:{ ParseException -> 0x00a4 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            if (r0 == 0) goto L_0x0071
            r4.add(r0)     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            goto L_0x0071
        L_0x00a2:
            r0 = move-exception
            goto L_0x00b5
        L_0x00a4:
            com.google.android.gms.measurement.internal.zzeu r0 = r21.h()     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.G()     // Catch:{ all -> 0x00a2 }
            java.lang.String r12 = "Failed to load event from local database"
            r0.a(r12)     // Catch:{ all -> 0x00a2 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            goto L_0x0071
        L_0x00b5:
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            throw r0     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
        L_0x00b9:
            if (r0 != r9) goto L_0x00ef
            android.os.Parcel r11 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            int r0 = r12.length     // Catch:{ ParseException -> 0x00d4 }
            r11.unmarshall(r12, r6, r0)     // Catch:{ ParseException -> 0x00d4 }
            r11.setDataPosition(r6)     // Catch:{ ParseException -> 0x00d4 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzkq> r0 = com.google.android.gms.measurement.internal.zzkq.CREATOR     // Catch:{ ParseException -> 0x00d4 }
            java.lang.Object r0 = r0.createFromParcel(r11)     // Catch:{ ParseException -> 0x00d4 }
            com.google.android.gms.measurement.internal.zzkq r0 = (com.google.android.gms.measurement.internal.zzkq) r0     // Catch:{ ParseException -> 0x00d4 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            goto L_0x00e5
        L_0x00d2:
            r0 = move-exception
            goto L_0x00eb
        L_0x00d4:
            com.google.android.gms.measurement.internal.zzeu r0 = r21.h()     // Catch:{ all -> 0x00d2 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.G()     // Catch:{ all -> 0x00d2 }
            java.lang.String r12 = "Failed to load user property from local database"
            r0.a(r12)     // Catch:{ all -> 0x00d2 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            r0 = r3
        L_0x00e5:
            if (r0 == 0) goto L_0x0071
            r4.add(r0)     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            goto L_0x0071
        L_0x00eb:
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            throw r0     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
        L_0x00ef:
            if (r0 != r11) goto L_0x0126
            android.os.Parcel r11 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            int r0 = r12.length     // Catch:{ ParseException -> 0x010a }
            r11.unmarshall(r12, r6, r0)     // Catch:{ ParseException -> 0x010a }
            r11.setDataPosition(r6)     // Catch:{ ParseException -> 0x010a }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzw> r0 = com.google.android.gms.measurement.internal.zzw.CREATOR     // Catch:{ ParseException -> 0x010a }
            java.lang.Object r0 = r0.createFromParcel(r11)     // Catch:{ ParseException -> 0x010a }
            com.google.android.gms.measurement.internal.zzw r0 = (com.google.android.gms.measurement.internal.zzw) r0     // Catch:{ ParseException -> 0x010a }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            goto L_0x011b
        L_0x0108:
            r0 = move-exception
            goto L_0x0122
        L_0x010a:
            com.google.android.gms.measurement.internal.zzeu r0 = r21.h()     // Catch:{ all -> 0x0108 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.G()     // Catch:{ all -> 0x0108 }
            java.lang.String r12 = "Failed to load conditional user property from local database"
            r0.a(r12)     // Catch:{ all -> 0x0108 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            r0 = r3
        L_0x011b:
            if (r0 == 0) goto L_0x0071
            r4.add(r0)     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            goto L_0x0071
        L_0x0122:
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            throw r0     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
        L_0x0126:
            r11 = 3
            if (r0 != r11) goto L_0x0138
            com.google.android.gms.measurement.internal.zzeu r0 = r21.h()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            com.google.android.gms.measurement.internal.zzew r0 = r0.J()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            java.lang.String r11 = "Skipping app launch break"
            r0.a(r11)     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            goto L_0x0071
        L_0x0138:
            com.google.android.gms.measurement.internal.zzeu r0 = r21.h()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            com.google.android.gms.measurement.internal.zzew r0 = r0.G()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            java.lang.String r11 = "Unknown record type in local database"
            r0.a(r11)     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            goto L_0x0071
        L_0x0147:
            java.lang.String r0 = "messages"
            java.lang.String r11 = "rowid <= ?"
            java.lang.String[] r12 = new java.lang.String[r9]     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            java.lang.String r13 = java.lang.Long.toString(r19)     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            r12[r6] = r13     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            int r0 = r5.delete(r0, r11, r12)     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            int r11 = r4.size()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            if (r0 >= r11) goto L_0x016a
            com.google.android.gms.measurement.internal.zzeu r0 = r21.h()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            com.google.android.gms.measurement.internal.zzew r0 = r0.G()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            java.lang.String r11 = "Fewer entries removed from local database than expected"
            r0.a(r11)     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
        L_0x016a:
            r5.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            r5.endTransaction()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x0198, SQLiteException -> 0x017f, all -> 0x017b }
            if (r10 == 0) goto L_0x0175
            r10.close()
        L_0x0175:
            if (r5 == 0) goto L_0x017a
            r5.close()
        L_0x017a:
            return r4
        L_0x017b:
            r0 = move-exception
            r3 = r10
            goto L_0x01fc
        L_0x017f:
            r0 = move-exception
            goto L_0x0188
        L_0x0181:
            r0 = move-exception
            goto L_0x018c
        L_0x0183:
            r0 = move-exception
            goto L_0x01fc
        L_0x0186:
            r0 = move-exception
            r10 = r3
        L_0x0188:
            r15 = r5
            goto L_0x01a4
        L_0x018a:
            r0 = move-exception
            r10 = r3
        L_0x018c:
            r15 = r5
            goto L_0x01dd
        L_0x018f:
            r0 = move-exception
            goto L_0x01fb
        L_0x0192:
            r0 = move-exception
            r5 = r15
        L_0x0194:
            r10 = r3
            goto L_0x01a4
        L_0x0196:
            r5 = r15
        L_0x0197:
            r10 = r3
        L_0x0198:
            r15 = r5
            goto L_0x01c9
        L_0x019a:
            r0 = move-exception
            r5 = r15
        L_0x019c:
            r10 = r3
            goto L_0x01dd
        L_0x019e:
            r0 = move-exception
            r5 = r3
            goto L_0x01fc
        L_0x01a1:
            r0 = move-exception
            r10 = r3
            r15 = r10
        L_0x01a4:
            if (r15 == 0) goto L_0x01af
            boolean r5 = r15.inTransaction()     // Catch:{ all -> 0x01f9 }
            if (r5 == 0) goto L_0x01af
            r15.endTransaction()     // Catch:{ all -> 0x01f9 }
        L_0x01af:
            com.google.android.gms.measurement.internal.zzeu r5 = r21.h()     // Catch:{ all -> 0x01f9 }
            com.google.android.gms.measurement.internal.zzew r5 = r5.G()     // Catch:{ all -> 0x01f9 }
            r5.b(r2, r0)     // Catch:{ all -> 0x01f9 }
            r1.f10394d = r9     // Catch:{ all -> 0x01f9 }
            if (r10 == 0) goto L_0x01c1
            r10.close()
        L_0x01c1:
            if (r15 == 0) goto L_0x01f4
            r15.close()
            goto L_0x01f4
        L_0x01c7:
            r10 = r3
            r15 = r10
        L_0x01c9:
            long r11 = (long) r8
            android.os.SystemClock.sleep(r11)     // Catch:{ all -> 0x01f9 }
            int r8 = r8 + 20
            if (r10 == 0) goto L_0x01d4
            r10.close()
        L_0x01d4:
            if (r15 == 0) goto L_0x01f4
            r15.close()
            goto L_0x01f4
        L_0x01da:
            r0 = move-exception
            r10 = r3
            r15 = r10
        L_0x01dd:
            com.google.android.gms.measurement.internal.zzeu r5 = r21.h()     // Catch:{ all -> 0x01f9 }
            com.google.android.gms.measurement.internal.zzew r5 = r5.G()     // Catch:{ all -> 0x01f9 }
            r5.b(r2, r0)     // Catch:{ all -> 0x01f9 }
            r1.f10394d = r9     // Catch:{ all -> 0x01f9 }
            if (r10 == 0) goto L_0x01ef
            r10.close()
        L_0x01ef:
            if (r15 == 0) goto L_0x01f4
            r15.close()
        L_0x01f4:
            int r7 = r7 + 1
            r5 = 5
            goto L_0x0020
        L_0x01f9:
            r0 = move-exception
            r3 = r10
        L_0x01fb:
            r5 = r15
        L_0x01fc:
            if (r3 == 0) goto L_0x0201
            r3.close()
        L_0x0201:
            if (r5 == 0) goto L_0x0206
            r5.close()
        L_0x0206:
            throw r0
        L_0x0207:
            com.google.android.gms.measurement.internal.zzeu r0 = r21.h()
            com.google.android.gms.measurement.internal.zzew r0 = r0.J()
            java.lang.String r2 = "Failed to read events from database in reasonable time"
            r0.a(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzeq.D(int):java.util.List");
    }

    public final boolean F(zzao zzao) {
        Parcel obtain = Parcel.obtain();
        zzao.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return E(0, marshall);
        }
        h().H().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean G(zzkq zzkq) {
        Parcel obtain = Parcel.obtain();
        zzkq.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return E(1, marshall);
        }
        h().H().a("User property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean H(zzw zzw) {
        j();
        byte[] n0 = zzkr.n0(zzw);
        if (n0.length <= 131072) {
            return E(2, n0);
        }
        h().H().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final void I() {
        a();
        c();
        try {
            int delete = L().delete("messages", (String) null, (String[]) null) + 0;
            if (delete > 0) {
                h().O().b("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e2) {
            h().G().b("Error resetting local analytics data. error", e2);
        }
    }

    public final boolean J() {
        return E(3, new byte[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0089, code lost:
        r3 = r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean K() {
        /*
            r11 = this;
            java.lang.String r0 = "Error deleting app launch break from local database"
            r11.c()
            r11.a()
            boolean r1 = r11.f10394d
            r2 = 0
            if (r1 == 0) goto L_0x000e
            return r2
        L_0x000e:
            boolean r1 = r11.M()
            if (r1 != 0) goto L_0x0015
            return r2
        L_0x0015:
            r1 = 5
            r3 = 0
            r4 = 5
        L_0x0018:
            if (r3 >= r1) goto L_0x0092
            r5 = 0
            r6 = 1
            android.database.sqlite.SQLiteDatabase r5 = r11.L()     // Catch:{ SQLiteFullException -> 0x0076, SQLiteDatabaseLockedException -> 0x006a, SQLiteException -> 0x004b }
            if (r5 != 0) goto L_0x002a
            r11.f10394d = r6     // Catch:{ SQLiteFullException -> 0x0076, SQLiteDatabaseLockedException -> 0x006a, SQLiteException -> 0x004b }
            if (r5 == 0) goto L_0x0029
            r5.close()
        L_0x0029:
            return r2
        L_0x002a:
            r5.beginTransaction()     // Catch:{ SQLiteFullException -> 0x0076, SQLiteDatabaseLockedException -> 0x006a, SQLiteException -> 0x004b }
            java.lang.String r7 = "messages"
            java.lang.String r8 = "type == ?"
            java.lang.String[] r9 = new java.lang.String[r6]     // Catch:{ SQLiteFullException -> 0x0076, SQLiteDatabaseLockedException -> 0x006a, SQLiteException -> 0x004b }
            r10 = 3
            java.lang.String r10 = java.lang.Integer.toString(r10)     // Catch:{ SQLiteFullException -> 0x0076, SQLiteDatabaseLockedException -> 0x006a, SQLiteException -> 0x004b }
            r9[r2] = r10     // Catch:{ SQLiteFullException -> 0x0076, SQLiteDatabaseLockedException -> 0x006a, SQLiteException -> 0x004b }
            r5.delete(r7, r8, r9)     // Catch:{ SQLiteFullException -> 0x0076, SQLiteDatabaseLockedException -> 0x006a, SQLiteException -> 0x004b }
            r5.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0076, SQLiteDatabaseLockedException -> 0x006a, SQLiteException -> 0x004b }
            r5.endTransaction()     // Catch:{ SQLiteFullException -> 0x0076, SQLiteDatabaseLockedException -> 0x006a, SQLiteException -> 0x004b }
            if (r5 == 0) goto L_0x0048
            r5.close()
        L_0x0048:
            return r6
        L_0x0049:
            r0 = move-exception
            goto L_0x008c
        L_0x004b:
            r7 = move-exception
            if (r5 == 0) goto L_0x0057
            boolean r8 = r5.inTransaction()     // Catch:{ all -> 0x0049 }
            if (r8 == 0) goto L_0x0057
            r5.endTransaction()     // Catch:{ all -> 0x0049 }
        L_0x0057:
            com.google.android.gms.measurement.internal.zzeu r8 = r11.h()     // Catch:{ all -> 0x0049 }
            com.google.android.gms.measurement.internal.zzew r8 = r8.G()     // Catch:{ all -> 0x0049 }
            r8.b(r0, r7)     // Catch:{ all -> 0x0049 }
            r11.f10394d = r6     // Catch:{ all -> 0x0049 }
            if (r5 == 0) goto L_0x0089
            r5.close()
            goto L_0x0089
        L_0x006a:
            long r6 = (long) r4
            android.os.SystemClock.sleep(r6)     // Catch:{ all -> 0x0049 }
            int r4 = r4 + 20
            if (r5 == 0) goto L_0x0089
            r5.close()
            goto L_0x0089
        L_0x0076:
            r7 = move-exception
            com.google.android.gms.measurement.internal.zzeu r8 = r11.h()     // Catch:{ all -> 0x0049 }
            com.google.android.gms.measurement.internal.zzew r8 = r8.G()     // Catch:{ all -> 0x0049 }
            r8.b(r0, r7)     // Catch:{ all -> 0x0049 }
            r11.f10394d = r6     // Catch:{ all -> 0x0049 }
            if (r5 == 0) goto L_0x0089
            r5.close()
        L_0x0089:
            int r3 = r3 + 1
            goto L_0x0018
        L_0x008c:
            if (r5 == 0) goto L_0x0091
            r5.close()
        L_0x0091:
            throw r0
        L_0x0092:
            com.google.android.gms.measurement.internal.zzeu r0 = r11.h()
            com.google.android.gms.measurement.internal.zzew r0 = r0.J()
            java.lang.String r1 = "Error deleting app launch break from local database in reasonable time"
            r0.a(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzeq.K():boolean");
    }
}
