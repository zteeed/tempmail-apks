package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzae;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.gms.internal.measurement.zzcb;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzkz;
import com.google.android.gms.internal.measurement.zzlm;
import com.google.android.gms.internal.measurement.zzlr;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
public class zzkj implements r4 {
    private static volatile zzkj x;

    /* renamed from: a  reason: collision with root package name */
    private zzfs f10689a;

    /* renamed from: b  reason: collision with root package name */
    private zzfb f10690b;

    /* renamed from: c  reason: collision with root package name */
    private c f10691c;

    /* renamed from: d  reason: collision with root package name */
    private o3 f10692d;

    /* renamed from: e  reason: collision with root package name */
    private zzkf f10693e;

    /* renamed from: f  reason: collision with root package name */
    private w7 f10694f;
    private final zzkn g;
    private u5 h;
    private final zzfy i;
    private boolean j;
    private boolean k;
    @VisibleForTesting
    private long l;
    private List<Runnable> m;
    private int n;
    private int o;
    private boolean p;
    private boolean q;
    private boolean r;
    private FileLock s;
    private FileChannel t;
    private List<Long> u;
    private List<Long> v;
    private long w;

    /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
    class a implements e {

        /* renamed from: a  reason: collision with root package name */
        zzcb.zzg f10695a;

        /* renamed from: b  reason: collision with root package name */
        List<Long> f10696b;

        /* renamed from: c  reason: collision with root package name */
        List<zzcb.zzc> f10697c;

        /* renamed from: d  reason: collision with root package name */
        private long f10698d;

        private a(zzkj zzkj) {
        }

        private static long c(zzcb.zzc zzc) {
            return ((zzc.Y() / 1000) / 60) / 60;
        }

        public final void a(zzcb.zzg zzg) {
            Preconditions.k(zzg);
            this.f10695a = zzg;
        }

        public final boolean b(long j, zzcb.zzc zzc) {
            Preconditions.k(zzc);
            if (this.f10697c == null) {
                this.f10697c = new ArrayList();
            }
            if (this.f10696b == null) {
                this.f10696b = new ArrayList();
            }
            if (this.f10697c.size() > 0 && c(this.f10697c.get(0)) != c(zzc)) {
                return false;
            }
            long i = this.f10698d + ((long) zzc.i());
            if (i >= ((long) Math.max(0, zzaq.i.a(null).intValue()))) {
                return false;
            }
            this.f10698d = i;
            this.f10697c.add(zzc);
            this.f10696b.add(Long.valueOf(j));
            if (this.f10697c.size() >= Math.max(1, zzaq.j.a(null).intValue())) {
                return false;
            }
            return true;
        }

        /* synthetic */ a(zzkj zzkj, o7 o7Var) {
            this(zzkj);
        }
    }

    private zzkj(zzko zzko) {
        this(zzko, (zzfy) null);
    }

    @VisibleForTesting
    private final boolean C(int i2, FileChannel fileChannel) {
        j0();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.i.h().G().a("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i2);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            if (this.i.x().t(zzaq.z0) && Build.VERSION.SDK_INT <= 19) {
                fileChannel.position(0);
            }
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.i.h().G().b("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e2) {
            this.i.h().G().b("Failed to write to channel", e2);
            return false;
        }
    }

    private final boolean D(zzcb.zzc.zza zza, zzcb.zzc.zza zza2) {
        String str;
        Preconditions.a("_e".equals(zza.U()));
        Z();
        zzcb.zze z = zzkn.z((zzcb.zzc) ((zzfo) zza.q()), "_sc");
        String str2 = null;
        if (z == null) {
            str = null;
        } else {
            str = z.V();
        }
        Z();
        zzcb.zze z2 = zzkn.z((zzcb.zzc) ((zzfo) zza2.q()), "_pc");
        if (z2 != null) {
            str2 = z2.V();
        }
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        J(zza, zza2);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x024f A[SYNTHETIC, Splitter:B:115:0x024f] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0256 A[Catch:{ IOException -> 0x0214, all -> 0x0f39 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0264 A[Catch:{ IOException -> 0x0214, all -> 0x0f39 }] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x03a6 A[Catch:{ IOException -> 0x0214, all -> 0x0f39 }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03a8 A[Catch:{ IOException -> 0x0214, all -> 0x0f39 }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03ab A[Catch:{ IOException -> 0x0214, all -> 0x0f39 }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x03ac A[Catch:{ IOException -> 0x0214, all -> 0x0f39 }] */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x059a A[Catch:{ IOException -> 0x0214, all -> 0x0f39 }] */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0671 A[Catch:{ IOException -> 0x0214, all -> 0x0f39 }] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x080c A[Catch:{ IOException -> 0x0214, all -> 0x0f39 }] */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0828 A[Catch:{ IOException -> 0x0214, all -> 0x0f39 }] */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0842 A[Catch:{ IOException -> 0x0214, all -> 0x0f39 }] */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x0b7f A[Catch:{ IOException -> 0x0214, all -> 0x0f39 }] */
    /* JADX WARNING: Removed duplicated region for block: B:446:0x0b92 A[Catch:{ IOException -> 0x0214, all -> 0x0f39 }] */
    /* JADX WARNING: Removed duplicated region for block: B:448:0x0b95 A[Catch:{ IOException -> 0x0214, all -> 0x0f39 }] */
    /* JADX WARNING: Removed duplicated region for block: B:449:0x0bbc A[SYNTHETIC, Splitter:B:449:0x0bbc] */
    /* JADX WARNING: Removed duplicated region for block: B:563:0x0f21 A[SYNTHETIC, Splitter:B:563:0x0f21] */
    /* JADX WARNING: Removed duplicated region for block: B:570:0x0f35 A[SYNTHETIC, Splitter:B:570:0x0f35] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean E(java.lang.String r44, long r45) {
        /*
            r43 = this;
            r1 = r43
            java.lang.String r2 = "_npa"
            java.lang.String r3 = ""
            com.google.android.gms.measurement.internal.c r4 = r43.V()
            r4.v0()
            com.google.android.gms.measurement.internal.zzkj$a r4 = new com.google.android.gms.measurement.internal.zzkj$a     // Catch:{ all -> 0x0f39 }
            r5 = 0
            r4.<init>(r1, r5)     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.c r6 = r43.V()     // Catch:{ all -> 0x0f39 }
            long r7 = r1.w     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.common.internal.Preconditions.k(r4)     // Catch:{ all -> 0x0f39 }
            r6.c()     // Catch:{ all -> 0x0f39 }
            r6.s()     // Catch:{ all -> 0x0f39 }
            r10 = -1
            r12 = 2
            r13 = 0
            r14 = 1
            android.database.sqlite.SQLiteDatabase r15 = r6.w()     // Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
            boolean r16 = android.text.TextUtils.isEmpty(r5)     // Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
            if (r16 == 0) goto L_0x0095
            int r16 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r16 == 0) goto L_0x0049
            java.lang.String[] r9 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0044 }
            java.lang.String r17 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x0044 }
            r9[r13] = r17     // Catch:{ SQLiteException -> 0x0044 }
            java.lang.String r17 = java.lang.String.valueOf(r45)     // Catch:{ SQLiteException -> 0x0044 }
            r9[r14] = r17     // Catch:{ SQLiteException -> 0x0044 }
            goto L_0x0051
        L_0x0044:
            r0 = move-exception
            r7 = r0
            r9 = r5
            goto L_0x023c
        L_0x0049:
            java.lang.String[] r9 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
            java.lang.String r17 = java.lang.String.valueOf(r45)     // Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
            r9[r13] = r17     // Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
        L_0x0051:
            if (r16 == 0) goto L_0x0058
            java.lang.String r16 = "rowid <= ? and "
            r45 = r16
            goto L_0x005a
        L_0x0058:
            r45 = r3
        L_0x005a:
            int r5 = r45.length()     // Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
            int r5 = r5 + 148
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
            r12.<init>(r5)     // Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
            java.lang.String r5 = "select app_id, metadata_fingerprint from raw_events where "
            r12.append(r5)     // Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
            r5 = r45
            r12.append(r5)     // Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
            java.lang.String r5 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r12.append(r5)     // Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
            java.lang.String r5 = r12.toString()     // Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
            android.database.Cursor r5 = r15.rawQuery(r5, r9)     // Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
            boolean r9 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0230 }
            if (r9 != 0) goto L_0x0089
            if (r5 == 0) goto L_0x0252
            r5.close()     // Catch:{ all -> 0x0f39 }
            goto L_0x0252
        L_0x0089:
            java.lang.String r9 = r5.getString(r13)     // Catch:{ SQLiteException -> 0x0230 }
            java.lang.String r12 = r5.getString(r14)     // Catch:{ SQLiteException -> 0x022d }
            r5.close()     // Catch:{ SQLiteException -> 0x022d }
            goto L_0x00e6
        L_0x0095:
            int r5 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x00a6
            r9 = 2
            java.lang.String[] r12 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
            r9 = 0
            r12[r13] = r9     // Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
            java.lang.String r9 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
            r12[r14] = r9     // Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
            goto L_0x00ab
        L_0x00a6:
            r9 = 0
            java.lang.String[] r12 = new java.lang.String[]{r9}     // Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
        L_0x00ab:
            if (r5 == 0) goto L_0x00b0
            java.lang.String r5 = " and rowid <= ?"
            goto L_0x00b1
        L_0x00b0:
            r5 = r3
        L_0x00b1:
            int r9 = r5.length()     // Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
            int r9 = r9 + 84
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
            r10.<init>(r9)     // Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
            java.lang.String r9 = "select metadata_fingerprint from raw_events where app_id = ?"
            r10.append(r9)     // Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
            r10.append(r5)     // Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
            java.lang.String r5 = " order by rowid limit 1;"
            r10.append(r5)     // Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
            java.lang.String r5 = r10.toString()     // Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
            android.database.Cursor r5 = r15.rawQuery(r5, r12)     // Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
            boolean r9 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0230 }
            if (r9 != 0) goto L_0x00de
            if (r5 == 0) goto L_0x0252
            r5.close()     // Catch:{ all -> 0x0f39 }
            goto L_0x0252
        L_0x00de:
            java.lang.String r12 = r5.getString(r13)     // Catch:{ SQLiteException -> 0x0230 }
            r5.close()     // Catch:{ SQLiteException -> 0x0230 }
            r9 = 0
        L_0x00e6:
            java.lang.String r16 = "raw_events_metadata"
            java.lang.String r10 = "metadata"
            java.lang.String[] r17 = new java.lang.String[]{r10}     // Catch:{ SQLiteException -> 0x022d }
            java.lang.String r18 = "app_id = ? and metadata_fingerprint = ?"
            r10 = 2
            java.lang.String[] r11 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x022d }
            r11[r13] = r9     // Catch:{ SQLiteException -> 0x022d }
            r11[r14] = r12     // Catch:{ SQLiteException -> 0x022d }
            r20 = 0
            r21 = 0
            java.lang.String r22 = "rowid"
            java.lang.String r23 = "2"
            r10 = r15
            r15 = r10
            r19 = r11
            android.database.Cursor r5 = r15.query(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x022d }
            boolean r11 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x022d }
            if (r11 != 0) goto L_0x0125
            com.google.android.gms.measurement.internal.zzeu r7 = r6.h()     // Catch:{ SQLiteException -> 0x022d }
            com.google.android.gms.measurement.internal.zzew r7 = r7.G()     // Catch:{ SQLiteException -> 0x022d }
            java.lang.String r8 = "Raw event metadata record is missing. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzeu.x(r9)     // Catch:{ SQLiteException -> 0x022d }
            r7.b(r8, r10)     // Catch:{ SQLiteException -> 0x022d }
            if (r5 == 0) goto L_0x0252
            r5.close()     // Catch:{ all -> 0x0f39 }
            goto L_0x0252
        L_0x0125:
            byte[] r11 = r5.getBlob(r13)     // Catch:{ SQLiteException -> 0x022d }
            com.google.android.gms.internal.measurement.zzcb$zzg$zza r15 = com.google.android.gms.internal.measurement.zzcb.zzg.N0()     // Catch:{ IOException -> 0x0214 }
            com.google.android.gms.internal.measurement.zzgz r11 = com.google.android.gms.measurement.internal.zzkn.A(r15, r11)     // Catch:{ IOException -> 0x0214 }
            com.google.android.gms.internal.measurement.zzcb$zzg$zza r11 = (com.google.android.gms.internal.measurement.zzcb.zzg.zza) r11     // Catch:{ IOException -> 0x0214 }
            com.google.android.gms.internal.measurement.zzgw r11 = r11.q()     // Catch:{ IOException -> 0x0214 }
            com.google.android.gms.internal.measurement.zzfo r11 = (com.google.android.gms.internal.measurement.zzfo) r11     // Catch:{ IOException -> 0x0214 }
            com.google.android.gms.internal.measurement.zzcb$zzg r11 = (com.google.android.gms.internal.measurement.zzcb.zzg) r11     // Catch:{ IOException -> 0x0214 }
            boolean r15 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x022d }
            if (r15 == 0) goto L_0x0152
            com.google.android.gms.measurement.internal.zzeu r15 = r6.h()     // Catch:{ SQLiteException -> 0x022d }
            com.google.android.gms.measurement.internal.zzew r15 = r15.J()     // Catch:{ SQLiteException -> 0x022d }
            java.lang.String r14 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzeu.x(r9)     // Catch:{ SQLiteException -> 0x022d }
            r15.b(r14, r13)     // Catch:{ SQLiteException -> 0x022d }
        L_0x0152:
            r5.close()     // Catch:{ SQLiteException -> 0x022d }
            r4.a(r11)     // Catch:{ SQLiteException -> 0x022d }
            r13 = -1
            int r11 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r11 == 0) goto L_0x0175
            java.lang.String r11 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            r13 = 3
            java.lang.String[] r14 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x022d }
            r13 = 0
            r14[r13] = r9     // Catch:{ SQLiteException -> 0x022d }
            r13 = 1
            r14[r13] = r12     // Catch:{ SQLiteException -> 0x022d }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x022d }
            r8 = 2
            r14[r8] = r7     // Catch:{ SQLiteException -> 0x022d }
            r18 = r11
            r19 = r14
            goto L_0x0184
        L_0x0175:
            java.lang.String r7 = "app_id = ? and metadata_fingerprint = ?"
            r8 = 2
            java.lang.String[] r11 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x022d }
            r8 = 0
            r11[r8] = r9     // Catch:{ SQLiteException -> 0x022d }
            r8 = 1
            r11[r8] = r12     // Catch:{ SQLiteException -> 0x022d }
            r18 = r7
            r19 = r11
        L_0x0184:
            java.lang.String r16 = "raw_events"
            java.lang.String r7 = "rowid"
            java.lang.String r8 = "name"
            java.lang.String r11 = "timestamp"
            java.lang.String r12 = "data"
            java.lang.String[] r17 = new java.lang.String[]{r7, r8, r11, r12}     // Catch:{ SQLiteException -> 0x022d }
            r20 = 0
            r21 = 0
            java.lang.String r22 = "rowid"
            r23 = 0
            r15 = r10
            android.database.Cursor r5 = r15.query(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x022d }
            boolean r7 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x022d }
            if (r7 != 0) goto L_0x01bd
            com.google.android.gms.measurement.internal.zzeu r7 = r6.h()     // Catch:{ SQLiteException -> 0x022d }
            com.google.android.gms.measurement.internal.zzew r7 = r7.J()     // Catch:{ SQLiteException -> 0x022d }
            java.lang.String r8 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzeu.x(r9)     // Catch:{ SQLiteException -> 0x022d }
            r7.b(r8, r10)     // Catch:{ SQLiteException -> 0x022d }
            if (r5 == 0) goto L_0x0252
            r5.close()     // Catch:{ all -> 0x0f39 }
            goto L_0x0252
        L_0x01bd:
            r7 = 0
            long r10 = r5.getLong(r7)     // Catch:{ SQLiteException -> 0x022d }
            r7 = 3
            byte[] r8 = r5.getBlob(r7)     // Catch:{ SQLiteException -> 0x022d }
            com.google.android.gms.internal.measurement.zzcb$zzc$zza r7 = com.google.android.gms.internal.measurement.zzcb.zzc.d0()     // Catch:{ IOException -> 0x01f5 }
            com.google.android.gms.internal.measurement.zzgz r7 = com.google.android.gms.measurement.internal.zzkn.A(r7, r8)     // Catch:{ IOException -> 0x01f5 }
            com.google.android.gms.internal.measurement.zzcb$zzc$zza r7 = (com.google.android.gms.internal.measurement.zzcb.zzc.zza) r7     // Catch:{ IOException -> 0x01f5 }
            r8 = 1
            java.lang.String r12 = r5.getString(r8)     // Catch:{ SQLiteException -> 0x022d }
            r7.L(r12)     // Catch:{ SQLiteException -> 0x022d }
            r8 = 2
            long r12 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x022d }
            r7.E(r12)     // Catch:{ SQLiteException -> 0x022d }
            com.google.android.gms.internal.measurement.zzgw r7 = r7.q()     // Catch:{ SQLiteException -> 0x022d }
            com.google.android.gms.internal.measurement.zzfo r7 = (com.google.android.gms.internal.measurement.zzfo) r7     // Catch:{ SQLiteException -> 0x022d }
            com.google.android.gms.internal.measurement.zzcb$zzc r7 = (com.google.android.gms.internal.measurement.zzcb.zzc) r7     // Catch:{ SQLiteException -> 0x022d }
            boolean r7 = r4.b(r10, r7)     // Catch:{ SQLiteException -> 0x022d }
            if (r7 != 0) goto L_0x0208
            if (r5 == 0) goto L_0x0252
            r5.close()     // Catch:{ all -> 0x0f39 }
            goto L_0x0252
        L_0x01f5:
            r0 = move-exception
            r7 = r0
            com.google.android.gms.measurement.internal.zzeu r8 = r6.h()     // Catch:{ SQLiteException -> 0x022d }
            com.google.android.gms.measurement.internal.zzew r8 = r8.G()     // Catch:{ SQLiteException -> 0x022d }
            java.lang.String r10 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzeu.x(r9)     // Catch:{ SQLiteException -> 0x022d }
            r8.c(r10, r11, r7)     // Catch:{ SQLiteException -> 0x022d }
        L_0x0208:
            boolean r7 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x022d }
            if (r7 != 0) goto L_0x01bd
            if (r5 == 0) goto L_0x0252
            r5.close()     // Catch:{ all -> 0x0f39 }
            goto L_0x0252
        L_0x0214:
            r0 = move-exception
            r7 = r0
            com.google.android.gms.measurement.internal.zzeu r8 = r6.h()     // Catch:{ SQLiteException -> 0x022d }
            com.google.android.gms.measurement.internal.zzew r8 = r8.G()     // Catch:{ SQLiteException -> 0x022d }
            java.lang.String r10 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzeu.x(r9)     // Catch:{ SQLiteException -> 0x022d }
            r8.c(r10, r11, r7)     // Catch:{ SQLiteException -> 0x022d }
            if (r5 == 0) goto L_0x0252
            r5.close()     // Catch:{ all -> 0x0f39 }
            goto L_0x0252
        L_0x022d:
            r0 = move-exception
            r7 = r0
            goto L_0x023c
        L_0x0230:
            r0 = move-exception
            r7 = r0
            goto L_0x023b
        L_0x0233:
            r0 = move-exception
            r2 = r0
            r5 = 0
            goto L_0x0f33
        L_0x0238:
            r0 = move-exception
            r7 = r0
            r5 = 0
        L_0x023b:
            r9 = 0
        L_0x023c:
            com.google.android.gms.measurement.internal.zzeu r6 = r6.h()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.zzew r6 = r6.G()     // Catch:{ all -> 0x0f31 }
            java.lang.String r8 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzeu.x(r9)     // Catch:{ all -> 0x0f31 }
            r6.c(r8, r9, r7)     // Catch:{ all -> 0x0f31 }
            if (r5 == 0) goto L_0x0252
            r5.close()     // Catch:{ all -> 0x0f39 }
        L_0x0252:
            java.util.List<com.google.android.gms.internal.measurement.zzcb$zzc> r5 = r4.f10697c     // Catch:{ all -> 0x0f39 }
            if (r5 == 0) goto L_0x0261
            java.util.List<com.google.android.gms.internal.measurement.zzcb$zzc> r5 = r4.f10697c     // Catch:{ all -> 0x0f39 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0f39 }
            if (r5 == 0) goto L_0x025f
            goto L_0x0261
        L_0x025f:
            r5 = 0
            goto L_0x0262
        L_0x0261:
            r5 = 1
        L_0x0262:
            if (r5 != 0) goto L_0x0f21
            com.google.android.gms.internal.measurement.zzcb$zzg r5 = r4.f10695a     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzfo$zza r5 = r5.x()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzg$zza r5 = (com.google.android.gms.internal.measurement.zzcb.zzg.zza) r5     // Catch:{ all -> 0x0f39 }
            r5.X()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzfy r6 = r1.i     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzy r6 = r6.x()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzg r7 = r4.f10695a     // Catch:{ all -> 0x0f39 }
            java.lang.String r7 = r7.I2()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.zzaq.V     // Catch:{ all -> 0x0f39 }
            boolean r6 = r6.C(r7, r8)     // Catch:{ all -> 0x0f39 }
            r7 = -1
            r8 = -1
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x028a:
            java.util.List<com.google.android.gms.internal.measurement.zzcb$zzc> r9 = r4.f10697c     // Catch:{ all -> 0x0f39 }
            int r9 = r9.size()     // Catch:{ all -> 0x0f39 }
            r18 = r3
            java.lang.String r3 = "_fr"
            r19 = r13
            java.lang.String r13 = "_et"
            r20 = r2
            java.lang.String r2 = "_e"
            r21 = r14
            r22 = r15
            if (r12 >= r9) goto L_0x089e
            java.util.List<com.google.android.gms.internal.measurement.zzcb$zzc> r9 = r4.f10697c     // Catch:{ all -> 0x0f39 }
            java.lang.Object r9 = r9.get(r12)     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzc r9 = (com.google.android.gms.internal.measurement.zzcb.zzc) r9     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzfo$zza r9 = r9.x()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzc$zza r9 = (com.google.android.gms.internal.measurement.zzcb.zzc.zza) r9     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzfs r14 = r43.R()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzg r15 = r4.f10695a     // Catch:{ all -> 0x0f39 }
            java.lang.String r15 = r15.I2()     // Catch:{ all -> 0x0f39 }
            r16 = r12
            java.lang.String r12 = r9.U()     // Catch:{ all -> 0x0f39 }
            boolean r12 = r14.B(r15, r12)     // Catch:{ all -> 0x0f39 }
            java.lang.String r14 = "_err"
            if (r12 == 0) goto L_0x0345
            com.google.android.gms.measurement.internal.zzfy r2 = r1.i     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzeu r2 = r2.h()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.J()     // Catch:{ all -> 0x0f39 }
            java.lang.String r3 = "Dropping blacklisted raw event. appId"
            com.google.android.gms.internal.measurement.zzcb$zzg r12 = r4.f10695a     // Catch:{ all -> 0x0f39 }
            java.lang.String r12 = r12.I2()     // Catch:{ all -> 0x0f39 }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzeu.x(r12)     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzfy r13 = r1.i     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzes r13 = r13.H()     // Catch:{ all -> 0x0f39 }
            java.lang.String r15 = r9.U()     // Catch:{ all -> 0x0f39 }
            java.lang.String r13 = r13.w(r15)     // Catch:{ all -> 0x0f39 }
            r2.c(r3, r12, r13)     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzfs r2 = r43.R()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzg r3 = r4.f10695a     // Catch:{ all -> 0x0f39 }
            java.lang.String r3 = r3.I2()     // Catch:{ all -> 0x0f39 }
            boolean r2 = r2.I(r3)     // Catch:{ all -> 0x0f39 }
            if (r2 != 0) goto L_0x0312
            com.google.android.gms.measurement.internal.zzfs r2 = r43.R()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzg r3 = r4.f10695a     // Catch:{ all -> 0x0f39 }
            java.lang.String r3 = r3.I2()     // Catch:{ all -> 0x0f39 }
            boolean r2 = r2.J(r3)     // Catch:{ all -> 0x0f39 }
            if (r2 == 0) goto L_0x0310
            goto L_0x0312
        L_0x0310:
            r2 = 0
            goto L_0x0313
        L_0x0312:
            r2 = 1
        L_0x0313:
            if (r2 != 0) goto L_0x0338
            java.lang.String r2 = r9.U()     // Catch:{ all -> 0x0f39 }
            boolean r2 = r14.equals(r2)     // Catch:{ all -> 0x0f39 }
            if (r2 != 0) goto L_0x0338
            com.google.android.gms.measurement.internal.zzfy r2 = r1.i     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzkr r24 = r2.G()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzg r2 = r4.f10695a     // Catch:{ all -> 0x0f39 }
            java.lang.String r25 = r2.I2()     // Catch:{ all -> 0x0f39 }
            r26 = 11
            java.lang.String r27 = "_ev"
            java.lang.String r28 = r9.U()     // Catch:{ all -> 0x0f39 }
            r29 = 0
            r24.W(r25, r26, r27, r28, r29)     // Catch:{ all -> 0x0f39 }
        L_0x0338:
            r26 = r6
            r12 = r16
            r13 = r19
            r14 = r21
            r15 = r22
            r6 = r5
            goto L_0x0893
        L_0x0345:
            com.google.android.gms.measurement.internal.zzfs r12 = r43.R()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzg r15 = r4.f10695a     // Catch:{ all -> 0x0f39 }
            java.lang.String r15 = r15.I2()     // Catch:{ all -> 0x0f39 }
            r26 = r6
            java.lang.String r6 = r9.U()     // Catch:{ all -> 0x0f39 }
            boolean r6 = r12.D(r15, r6)     // Catch:{ all -> 0x0f39 }
            java.lang.String r12 = "_c"
            if (r6 != 0) goto L_0x03b7
            r43.Z()     // Catch:{ all -> 0x0f39 }
            java.lang.String r15 = r9.U()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.common.internal.Preconditions.g(r15)     // Catch:{ all -> 0x0f39 }
            r27 = r7
            int r7 = r15.hashCode()     // Catch:{ all -> 0x0f39 }
            r28 = r10
            r10 = 94660(0x171c4, float:1.32647E-40)
            if (r7 == r10) goto L_0x0393
            r10 = 95025(0x17331, float:1.33158E-40)
            if (r7 == r10) goto L_0x0389
            r10 = 95027(0x17333, float:1.33161E-40)
            if (r7 == r10) goto L_0x037f
            goto L_0x039d
        L_0x037f:
            java.lang.String r7 = "_ui"
            boolean r7 = r15.equals(r7)     // Catch:{ all -> 0x0f39 }
            if (r7 == 0) goto L_0x039d
            r7 = 1
            goto L_0x039e
        L_0x0389:
            java.lang.String r7 = "_ug"
            boolean r7 = r15.equals(r7)     // Catch:{ all -> 0x0f39 }
            if (r7 == 0) goto L_0x039d
            r7 = 2
            goto L_0x039e
        L_0x0393:
            java.lang.String r7 = "_in"
            boolean r7 = r15.equals(r7)     // Catch:{ all -> 0x0f39 }
            if (r7 == 0) goto L_0x039d
            r7 = 0
            goto L_0x039e
        L_0x039d:
            r7 = -1
        L_0x039e:
            if (r7 == 0) goto L_0x03a8
            r10 = 1
            if (r7 == r10) goto L_0x03a8
            r10 = 2
            if (r7 == r10) goto L_0x03a8
            r7 = 0
            goto L_0x03a9
        L_0x03a8:
            r7 = 1
        L_0x03a9:
            if (r7 == 0) goto L_0x03ac
            goto L_0x03bb
        L_0x03ac:
            r30 = r5
            r31 = r8
            r10 = r11
            r29 = r13
            r13 = r2
            r11 = r3
            goto L_0x0598
        L_0x03b7:
            r27 = r7
            r28 = r10
        L_0x03bb:
            r29 = r13
            r7 = 0
            r10 = 0
            r15 = 0
        L_0x03c0:
            int r13 = r9.Q()     // Catch:{ all -> 0x0f39 }
            r30 = r5
            java.lang.String r5 = "_r"
            if (r15 >= r13) goto L_0x042a
            com.google.android.gms.internal.measurement.zzcb$zze r13 = r9.M(r15)     // Catch:{ all -> 0x0f39 }
            java.lang.String r13 = r13.P()     // Catch:{ all -> 0x0f39 }
            boolean r13 = r12.equals(r13)     // Catch:{ all -> 0x0f39 }
            if (r13 == 0) goto L_0x03f6
            com.google.android.gms.internal.measurement.zzcb$zze r5 = r9.M(r15)     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzfo$zza r5 = r5.x()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zze$zza r5 = (com.google.android.gms.internal.measurement.zzcb.zze.zza) r5     // Catch:{ all -> 0x0f39 }
            r13 = r8
            r7 = 1
            r5.E(r7)     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzgw r5 = r5.q()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzfo r5 = (com.google.android.gms.internal.measurement.zzfo) r5     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zze r5 = (com.google.android.gms.internal.measurement.zzcb.zze) r5     // Catch:{ all -> 0x0f39 }
            r9.D(r15, r5)     // Catch:{ all -> 0x0f39 }
            r8 = r11
            r7 = 1
            goto L_0x0423
        L_0x03f6:
            r13 = r8
            com.google.android.gms.internal.measurement.zzcb$zze r8 = r9.M(r15)     // Catch:{ all -> 0x0f39 }
            java.lang.String r8 = r8.P()     // Catch:{ all -> 0x0f39 }
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x0f39 }
            if (r5 == 0) goto L_0x0422
            com.google.android.gms.internal.measurement.zzcb$zze r5 = r9.M(r15)     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzfo$zza r5 = r5.x()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zze$zza r5 = (com.google.android.gms.internal.measurement.zzcb.zze.zza) r5     // Catch:{ all -> 0x0f39 }
            r8 = r11
            r10 = 1
            r5.E(r10)     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzgw r5 = r5.q()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzfo r5 = (com.google.android.gms.internal.measurement.zzfo) r5     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zze r5 = (com.google.android.gms.internal.measurement.zzcb.zze) r5     // Catch:{ all -> 0x0f39 }
            r9.D(r15, r5)     // Catch:{ all -> 0x0f39 }
            r10 = 1
            goto L_0x0423
        L_0x0422:
            r8 = r11
        L_0x0423:
            int r15 = r15 + 1
            r11 = r8
            r8 = r13
            r5 = r30
            goto L_0x03c0
        L_0x042a:
            r13 = r8
            r8 = r11
            if (r7 != 0) goto L_0x0461
            if (r6 == 0) goto L_0x0461
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzeu r7 = r7.h()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzew r7 = r7.O()     // Catch:{ all -> 0x0f39 }
            java.lang.String r11 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.zzfy r15 = r1.i     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzes r15 = r15.H()     // Catch:{ all -> 0x0f39 }
            r31 = r13
            java.lang.String r13 = r9.U()     // Catch:{ all -> 0x0f39 }
            java.lang.String r13 = r15.w(r13)     // Catch:{ all -> 0x0f39 }
            r7.b(r11, r13)     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zze$zza r7 = com.google.android.gms.internal.measurement.zzcb.zze.g0()     // Catch:{ all -> 0x0f39 }
            r7.I(r12)     // Catch:{ all -> 0x0f39 }
            r13 = r2
            r11 = r3
            r2 = 1
            r7.E(r2)     // Catch:{ all -> 0x0f39 }
            r9.F(r7)     // Catch:{ all -> 0x0f39 }
            goto L_0x0465
        L_0x0461:
            r11 = r3
            r31 = r13
            r13 = r2
        L_0x0465:
            if (r10 != 0) goto L_0x0495
            com.google.android.gms.measurement.internal.zzfy r2 = r1.i     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzeu r2 = r2.h()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.O()     // Catch:{ all -> 0x0f39 }
            java.lang.String r3 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzes r7 = r7.H()     // Catch:{ all -> 0x0f39 }
            java.lang.String r10 = r9.U()     // Catch:{ all -> 0x0f39 }
            java.lang.String r7 = r7.w(r10)     // Catch:{ all -> 0x0f39 }
            r2.b(r3, r7)     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zze$zza r2 = com.google.android.gms.internal.measurement.zzcb.zze.g0()     // Catch:{ all -> 0x0f39 }
            r2.I(r5)     // Catch:{ all -> 0x0f39 }
            r3 = r8
            r7 = 1
            r2.E(r7)     // Catch:{ all -> 0x0f39 }
            r9.F(r2)     // Catch:{ all -> 0x0f39 }
            goto L_0x0496
        L_0x0495:
            r3 = r8
        L_0x0496:
            com.google.android.gms.measurement.internal.c r32 = r43.V()     // Catch:{ all -> 0x0f39 }
            long r33 = r43.k0()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzg r2 = r4.f10695a     // Catch:{ all -> 0x0f39 }
            java.lang.String r35 = r2.I2()     // Catch:{ all -> 0x0f39 }
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 1
            com.google.android.gms.measurement.internal.zzac r2 = r32.C(r33, r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x0f39 }
            long r7 = r2.f10551e     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzfy r2 = r1.i     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzy r2 = r2.x()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzg r10 = r4.f10695a     // Catch:{ all -> 0x0f39 }
            java.lang.String r10 = r10.I2()     // Catch:{ all -> 0x0f39 }
            int r2 = r2.x(r10)     // Catch:{ all -> 0x0f39 }
            r10 = r3
            long r2 = (long) r2     // Catch:{ all -> 0x0f39 }
            int r15 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r15 <= 0) goto L_0x04ce
            k(r9, r5)     // Catch:{ all -> 0x0f39 }
            goto L_0x04d0
        L_0x04ce:
            r19 = 1
        L_0x04d0:
            java.lang.String r2 = r9.U()     // Catch:{ all -> 0x0f39 }
            boolean r2 = com.google.android.gms.measurement.internal.zzkr.d0(r2)     // Catch:{ all -> 0x0f39 }
            if (r2 == 0) goto L_0x0598
            if (r6 == 0) goto L_0x0598
            com.google.android.gms.measurement.internal.c r32 = r43.V()     // Catch:{ all -> 0x0f39 }
            long r33 = r43.k0()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzg r2 = r4.f10695a     // Catch:{ all -> 0x0f39 }
            java.lang.String r35 = r2.I2()     // Catch:{ all -> 0x0f39 }
            r36 = 0
            r37 = 0
            r38 = 1
            r39 = 0
            r40 = 0
            com.google.android.gms.measurement.internal.zzac r2 = r32.C(r33, r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x0f39 }
            long r2 = r2.f10549c     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzfy r5 = r1.i     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzy r5 = r5.x()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzg r7 = r4.f10695a     // Catch:{ all -> 0x0f39 }
            java.lang.String r7 = r7.I2()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.zzaq.n     // Catch:{ all -> 0x0f39 }
            int r5 = r5.v(r7, r8)     // Catch:{ all -> 0x0f39 }
            long r7 = (long) r5     // Catch:{ all -> 0x0f39 }
            int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x0598
            com.google.android.gms.measurement.internal.zzfy r2 = r1.i     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzeu r2 = r2.h()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.J()     // Catch:{ all -> 0x0f39 }
            java.lang.String r3 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.zzcb$zzg r5 = r4.f10695a     // Catch:{ all -> 0x0f39 }
            java.lang.String r5 = r5.I2()     // Catch:{ all -> 0x0f39 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzeu.x(r5)     // Catch:{ all -> 0x0f39 }
            r2.b(r3, r5)     // Catch:{ all -> 0x0f39 }
            r2 = -1
            r3 = 0
            r5 = 0
            r7 = 0
        L_0x052e:
            int r8 = r9.Q()     // Catch:{ all -> 0x0f39 }
            if (r7 >= r8) goto L_0x0559
            com.google.android.gms.internal.measurement.zzcb$zze r8 = r9.M(r7)     // Catch:{ all -> 0x0f39 }
            java.lang.String r15 = r8.P()     // Catch:{ all -> 0x0f39 }
            boolean r15 = r12.equals(r15)     // Catch:{ all -> 0x0f39 }
            if (r15 == 0) goto L_0x054b
            com.google.android.gms.internal.measurement.zzfo$zza r2 = r8.x()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zze$zza r2 = (com.google.android.gms.internal.measurement.zzcb.zze.zza) r2     // Catch:{ all -> 0x0f39 }
            r3 = r2
            r2 = r7
            goto L_0x0556
        L_0x054b:
            java.lang.String r8 = r8.P()     // Catch:{ all -> 0x0f39 }
            boolean r8 = r14.equals(r8)     // Catch:{ all -> 0x0f39 }
            if (r8 == 0) goto L_0x0556
            r5 = 1
        L_0x0556:
            int r7 = r7 + 1
            goto L_0x052e
        L_0x0559:
            if (r5 == 0) goto L_0x0561
            if (r3 == 0) goto L_0x0561
            r9.R(r2)     // Catch:{ all -> 0x0f39 }
            goto L_0x0598
        L_0x0561:
            if (r3 == 0) goto L_0x057f
            java.lang.Object r3 = r3.clone()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzfo$zza r3 = (com.google.android.gms.internal.measurement.zzfo.zza) r3     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zze$zza r3 = (com.google.android.gms.internal.measurement.zzcb.zze.zza) r3     // Catch:{ all -> 0x0f39 }
            r3.I(r14)     // Catch:{ all -> 0x0f39 }
            r7 = 10
            r3.E(r7)     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzgw r3 = r3.q()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzfo r3 = (com.google.android.gms.internal.measurement.zzfo) r3     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zze r3 = (com.google.android.gms.internal.measurement.zzcb.zze) r3     // Catch:{ all -> 0x0f39 }
            r9.D(r2, r3)     // Catch:{ all -> 0x0f39 }
            goto L_0x0598
        L_0x057f:
            com.google.android.gms.measurement.internal.zzfy r2 = r1.i     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzeu r2 = r2.h()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.G()     // Catch:{ all -> 0x0f39 }
            java.lang.String r3 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.zzcb$zzg r5 = r4.f10695a     // Catch:{ all -> 0x0f39 }
            java.lang.String r5 = r5.I2()     // Catch:{ all -> 0x0f39 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzeu.x(r5)     // Catch:{ all -> 0x0f39 }
            r2.b(r3, r5)     // Catch:{ all -> 0x0f39 }
        L_0x0598:
            if (r6 == 0) goto L_0x065b
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0f39 }
            java.util.List r3 = r9.P()     // Catch:{ all -> 0x0f39 }
            r2.<init>(r3)     // Catch:{ all -> 0x0f39 }
            r3 = 0
            r5 = -1
            r6 = -1
        L_0x05a6:
            int r7 = r2.size()     // Catch:{ all -> 0x0f39 }
            java.lang.String r8 = "currency"
            java.lang.String r14 = "value"
            if (r3 >= r7) goto L_0x05d6
            java.lang.Object r7 = r2.get(r3)     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zze r7 = (com.google.android.gms.internal.measurement.zzcb.zze) r7     // Catch:{ all -> 0x0f39 }
            java.lang.String r7 = r7.P()     // Catch:{ all -> 0x0f39 }
            boolean r7 = r14.equals(r7)     // Catch:{ all -> 0x0f39 }
            if (r7 == 0) goto L_0x05c2
            r5 = r3
            goto L_0x05d3
        L_0x05c2:
            java.lang.Object r7 = r2.get(r3)     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zze r7 = (com.google.android.gms.internal.measurement.zzcb.zze) r7     // Catch:{ all -> 0x0f39 }
            java.lang.String r7 = r7.P()     // Catch:{ all -> 0x0f39 }
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x0f39 }
            if (r7 == 0) goto L_0x05d3
            r6 = r3
        L_0x05d3:
            int r3 = r3 + 1
            goto L_0x05a6
        L_0x05d6:
            r3 = -1
            if (r5 == r3) goto L_0x065c
            java.lang.Object r3 = r2.get(r5)     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zze r3 = (com.google.android.gms.internal.measurement.zzcb.zze) r3     // Catch:{ all -> 0x0f39 }
            boolean r3 = r3.Y()     // Catch:{ all -> 0x0f39 }
            if (r3 != 0) goto L_0x060c
            java.lang.Object r3 = r2.get(r5)     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zze r3 = (com.google.android.gms.internal.measurement.zzcb.zze) r3     // Catch:{ all -> 0x0f39 }
            boolean r3 = r3.c0()     // Catch:{ all -> 0x0f39 }
            if (r3 != 0) goto L_0x060c
            com.google.android.gms.measurement.internal.zzfy r2 = r1.i     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzeu r2 = r2.h()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.L()     // Catch:{ all -> 0x0f39 }
            java.lang.String r3 = "Value must be specified with a numeric type."
            r2.a(r3)     // Catch:{ all -> 0x0f39 }
            r9.R(r5)     // Catch:{ all -> 0x0f39 }
            k(r9, r12)     // Catch:{ all -> 0x0f39 }
            r2 = 18
            j(r9, r2, r14)     // Catch:{ all -> 0x0f39 }
            goto L_0x065b
        L_0x060c:
            r3 = -1
            if (r6 != r3) goto L_0x0612
            r2 = 1
            r7 = 3
            goto L_0x063e
        L_0x0612:
            java.lang.Object r2 = r2.get(r6)     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zze r2 = (com.google.android.gms.internal.measurement.zzcb.zze) r2     // Catch:{ all -> 0x0f39 }
            java.lang.String r2 = r2.V()     // Catch:{ all -> 0x0f39 }
            int r6 = r2.length()     // Catch:{ all -> 0x0f39 }
            r7 = 3
            if (r6 == r7) goto L_0x0625
        L_0x0623:
            r2 = 1
            goto L_0x063e
        L_0x0625:
            r6 = 0
        L_0x0626:
            int r14 = r2.length()     // Catch:{ all -> 0x0f39 }
            if (r6 >= r14) goto L_0x063d
            int r14 = r2.codePointAt(r6)     // Catch:{ all -> 0x0f39 }
            boolean r15 = java.lang.Character.isLetter(r14)     // Catch:{ all -> 0x0f39 }
            if (r15 != 0) goto L_0x0637
            goto L_0x0623
        L_0x0637:
            int r14 = java.lang.Character.charCount(r14)     // Catch:{ all -> 0x0f39 }
            int r6 = r6 + r14
            goto L_0x0626
        L_0x063d:
            r2 = 0
        L_0x063e:
            if (r2 == 0) goto L_0x065d
            com.google.android.gms.measurement.internal.zzfy r2 = r1.i     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzeu r2 = r2.h()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.L()     // Catch:{ all -> 0x0f39 }
            java.lang.String r6 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.a(r6)     // Catch:{ all -> 0x0f39 }
            r9.R(r5)     // Catch:{ all -> 0x0f39 }
            k(r9, r12)     // Catch:{ all -> 0x0f39 }
            r2 = 19
            j(r9, r2, r8)     // Catch:{ all -> 0x0f39 }
            goto L_0x065d
        L_0x065b:
            r3 = -1
        L_0x065c:
            r7 = 3
        L_0x065d:
            com.google.android.gms.measurement.internal.zzfy r2 = r1.i     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzy r2 = r2.x()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzg r5 = r4.f10695a     // Catch:{ all -> 0x0f39 }
            java.lang.String r5 = r5.I2()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.zzaq.U     // Catch:{ all -> 0x0f39 }
            boolean r2 = r2.C(r5, r6)     // Catch:{ all -> 0x0f39 }
            if (r2 == 0) goto L_0x080c
            java.lang.String r2 = r9.U()     // Catch:{ all -> 0x0f39 }
            r5 = r13
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0f39 }
            r12 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x06d7
            r43.Z()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzgw r2 = r9.q()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzfo r2 = (com.google.android.gms.internal.measurement.zzfo) r2     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzc r2 = (com.google.android.gms.internal.measurement.zzcb.zzc) r2     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zze r2 = com.google.android.gms.measurement.internal.zzkn.z(r2, r11)     // Catch:{ all -> 0x0f39 }
            if (r2 != 0) goto L_0x06cd
            if (r10 == 0) goto L_0x06c1
            long r14 = r10.V()     // Catch:{ all -> 0x0f39 }
            long r24 = r9.V()     // Catch:{ all -> 0x0f39 }
            long r14 = r14 - r24
            long r14 = java.lang.Math.abs(r14)     // Catch:{ all -> 0x0f39 }
            int r2 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r2 > 0) goto L_0x06c1
            java.lang.Object r2 = r10.clone()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzfo$zza r2 = (com.google.android.gms.internal.measurement.zzfo.zza) r2     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzc$zza r2 = (com.google.android.gms.internal.measurement.zzcb.zzc.zza) r2     // Catch:{ all -> 0x0f39 }
            boolean r6 = r1.D(r9, r2)     // Catch:{ all -> 0x0f39 }
            if (r6 == 0) goto L_0x06c1
            r6 = r30
            r8 = r31
            r6.D(r8, r2)     // Catch:{ all -> 0x0f39 }
            r7 = r27
            r14 = r29
        L_0x06bc:
            r10 = 0
        L_0x06bd:
            r28 = 0
            goto L_0x0816
        L_0x06c1:
            r6 = r30
            r8 = r31
            r28 = r9
            r7 = r21
            r14 = r29
            goto L_0x0816
        L_0x06cd:
            r6 = r30
            r8 = r31
            r11 = r27
            r14 = r29
            goto L_0x0815
        L_0x06d7:
            r6 = r30
            r8 = r31
            java.lang.String r2 = "_vs"
            java.lang.String r11 = r9.U()     // Catch:{ all -> 0x0f39 }
            boolean r2 = r2.equals(r11)     // Catch:{ all -> 0x0f39 }
            if (r2 == 0) goto L_0x072f
            r43.Z()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzgw r2 = r9.q()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzfo r2 = (com.google.android.gms.internal.measurement.zzfo) r2     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzc r2 = (com.google.android.gms.internal.measurement.zzcb.zzc) r2     // Catch:{ all -> 0x0f39 }
            r14 = r29
            com.google.android.gms.internal.measurement.zzcb$zze r2 = com.google.android.gms.measurement.internal.zzkn.z(r2, r14)     // Catch:{ all -> 0x0f39 }
            if (r2 != 0) goto L_0x072b
            if (r28 == 0) goto L_0x0723
            long r10 = r28.V()     // Catch:{ all -> 0x0f39 }
            long r24 = r9.V()     // Catch:{ all -> 0x0f39 }
            long r10 = r10 - r24
            long r10 = java.lang.Math.abs(r10)     // Catch:{ all -> 0x0f39 }
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 > 0) goto L_0x0723
            java.lang.Object r2 = r28.clone()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzfo$zza r2 = (com.google.android.gms.internal.measurement.zzfo.zza) r2     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzc$zza r2 = (com.google.android.gms.internal.measurement.zzcb.zzc.zza) r2     // Catch:{ all -> 0x0f39 }
            boolean r10 = r1.D(r2, r9)     // Catch:{ all -> 0x0f39 }
            if (r10 == 0) goto L_0x0723
            r11 = r27
            r6.D(r11, r2)     // Catch:{ all -> 0x0f39 }
            r7 = r11
            goto L_0x06bc
        L_0x0723:
            r11 = r27
            r10 = r9
            r7 = r11
            r8 = r21
            goto L_0x0816
        L_0x072b:
            r11 = r27
            goto L_0x0815
        L_0x072f:
            r11 = r27
            r14 = r29
            com.google.android.gms.measurement.internal.zzfy r2 = r1.i     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzy r2 = r2.x()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzg r12 = r4.f10695a     // Catch:{ all -> 0x0f39 }
            java.lang.String r12 = r12.I2()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.zzaq.s0     // Catch:{ all -> 0x0f39 }
            boolean r2 = r2.C(r12, r13)     // Catch:{ all -> 0x0f39 }
            if (r2 == 0) goto L_0x0815
            java.lang.String r2 = "_ab"
            java.lang.String r12 = r9.U()     // Catch:{ all -> 0x0f39 }
            boolean r2 = r2.equals(r12)     // Catch:{ all -> 0x0f39 }
            if (r2 == 0) goto L_0x0815
            r43.Z()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzgw r2 = r9.q()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzfo r2 = (com.google.android.gms.internal.measurement.zzfo) r2     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzc r2 = (com.google.android.gms.internal.measurement.zzcb.zzc) r2     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zze r2 = com.google.android.gms.measurement.internal.zzkn.z(r2, r14)     // Catch:{ all -> 0x0f39 }
            if (r2 != 0) goto L_0x0815
            if (r28 == 0) goto L_0x0815
            long r12 = r28.V()     // Catch:{ all -> 0x0f39 }
            long r24 = r9.V()     // Catch:{ all -> 0x0f39 }
            long r12 = r12 - r24
            long r12 = java.lang.Math.abs(r12)     // Catch:{ all -> 0x0f39 }
            r24 = 4000(0xfa0, double:1.9763E-320)
            int r2 = (r12 > r24 ? 1 : (r12 == r24 ? 0 : -1))
            if (r2 > 0) goto L_0x0815
            java.lang.Object r2 = r28.clone()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzfo$zza r2 = (com.google.android.gms.internal.measurement.zzfo.zza) r2     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzc$zza r2 = (com.google.android.gms.internal.measurement.zzcb.zzc.zza) r2     // Catch:{ all -> 0x0f39 }
            r1.J(r2, r9)     // Catch:{ all -> 0x0f39 }
            java.lang.String r12 = r2.U()     // Catch:{ all -> 0x0f39 }
            boolean r12 = r5.equals(r12)     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.common.internal.Preconditions.a(r12)     // Catch:{ all -> 0x0f39 }
            r43.Z()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzgw r12 = r2.q()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzfo r12 = (com.google.android.gms.internal.measurement.zzfo) r12     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzc r12 = (com.google.android.gms.internal.measurement.zzcb.zzc) r12     // Catch:{ all -> 0x0f39 }
            java.lang.String r13 = "_sn"
            com.google.android.gms.internal.measurement.zzcb$zze r12 = com.google.android.gms.measurement.internal.zzkn.z(r12, r13)     // Catch:{ all -> 0x0f39 }
            r43.Z()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzgw r13 = r2.q()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzfo r13 = (com.google.android.gms.internal.measurement.zzfo) r13     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzc r13 = (com.google.android.gms.internal.measurement.zzcb.zzc) r13     // Catch:{ all -> 0x0f39 }
            java.lang.String r15 = "_sc"
            com.google.android.gms.internal.measurement.zzcb$zze r13 = com.google.android.gms.measurement.internal.zzkn.z(r13, r15)     // Catch:{ all -> 0x0f39 }
            r43.Z()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzgw r15 = r2.q()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzfo r15 = (com.google.android.gms.internal.measurement.zzfo) r15     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzc r15 = (com.google.android.gms.internal.measurement.zzcb.zzc) r15     // Catch:{ all -> 0x0f39 }
            java.lang.String r3 = "_si"
            com.google.android.gms.internal.measurement.zzcb$zze r3 = com.google.android.gms.measurement.internal.zzkn.z(r15, r3)     // Catch:{ all -> 0x0f39 }
            if (r12 == 0) goto L_0x07ca
            java.lang.String r12 = r12.V()     // Catch:{ all -> 0x0f39 }
            goto L_0x07cc
        L_0x07ca:
            r12 = r18
        L_0x07cc:
            boolean r15 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0f39 }
            if (r15 != 0) goto L_0x07db
            com.google.android.gms.measurement.internal.zzkn r15 = r43.Z()     // Catch:{ all -> 0x0f39 }
            java.lang.String r7 = "_sn"
            r15.I(r9, r7, r12)     // Catch:{ all -> 0x0f39 }
        L_0x07db:
            if (r13 == 0) goto L_0x07e2
            java.lang.String r7 = r13.V()     // Catch:{ all -> 0x0f39 }
            goto L_0x07e4
        L_0x07e2:
            r7 = r18
        L_0x07e4:
            boolean r12 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0f39 }
            if (r12 != 0) goto L_0x07f3
            com.google.android.gms.measurement.internal.zzkn r12 = r43.Z()     // Catch:{ all -> 0x0f39 }
            java.lang.String r13 = "_sc"
            r12.I(r9, r13, r7)     // Catch:{ all -> 0x0f39 }
        L_0x07f3:
            if (r3 == 0) goto L_0x0806
            com.google.android.gms.measurement.internal.zzkn r7 = r43.Z()     // Catch:{ all -> 0x0f39 }
            java.lang.String r12 = "_si"
            long r24 = r3.Z()     // Catch:{ all -> 0x0f39 }
            java.lang.Long r3 = java.lang.Long.valueOf(r24)     // Catch:{ all -> 0x0f39 }
            r7.I(r9, r12, r3)     // Catch:{ all -> 0x0f39 }
        L_0x0806:
            r6.D(r11, r2)     // Catch:{ all -> 0x0f39 }
            r7 = r11
            goto L_0x06bd
        L_0x080c:
            r5 = r13
            r11 = r27
            r14 = r29
            r6 = r30
            r8 = r31
        L_0x0815:
            r7 = r11
        L_0x0816:
            if (r26 != 0) goto L_0x0877
            java.lang.String r2 = r9.U()     // Catch:{ all -> 0x0f39 }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0f39 }
            if (r2 == 0) goto L_0x0877
            int r2 = r9.Q()     // Catch:{ all -> 0x0f39 }
            if (r2 != 0) goto L_0x0842
            com.google.android.gms.measurement.internal.zzfy r2 = r1.i     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzeu r2 = r2.h()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.J()     // Catch:{ all -> 0x0f39 }
            java.lang.String r3 = "Engagement event does not contain any parameters. appId"
            com.google.android.gms.internal.measurement.zzcb$zzg r5 = r4.f10695a     // Catch:{ all -> 0x0f39 }
            java.lang.String r5 = r5.I2()     // Catch:{ all -> 0x0f39 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzeu.x(r5)     // Catch:{ all -> 0x0f39 }
            r2.b(r3, r5)     // Catch:{ all -> 0x0f39 }
            goto L_0x0877
        L_0x0842:
            com.google.android.gms.measurement.internal.zzkn r2 = r43.Z()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzgw r3 = r9.q()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzfo r3 = (com.google.android.gms.internal.measurement.zzfo) r3     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzc r3 = (com.google.android.gms.internal.measurement.zzcb.zzc) r3     // Catch:{ all -> 0x0f39 }
            java.lang.Object r2 = r2.V(r3, r14)     // Catch:{ all -> 0x0f39 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x0f39 }
            if (r2 != 0) goto L_0x0870
            com.google.android.gms.measurement.internal.zzfy r2 = r1.i     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzeu r2 = r2.h()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.J()     // Catch:{ all -> 0x0f39 }
            java.lang.String r3 = "Engagement event does not include duration. appId"
            com.google.android.gms.internal.measurement.zzcb$zzg r5 = r4.f10695a     // Catch:{ all -> 0x0f39 }
            java.lang.String r5 = r5.I2()     // Catch:{ all -> 0x0f39 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzeu.x(r5)     // Catch:{ all -> 0x0f39 }
            r2.b(r3, r5)     // Catch:{ all -> 0x0f39 }
            goto L_0x0877
        L_0x0870:
            long r2 = r2.longValue()     // Catch:{ all -> 0x0f39 }
            long r2 = r22 + r2
            goto L_0x0879
        L_0x0877:
            r2 = r22
        L_0x0879:
            java.util.List<com.google.android.gms.internal.measurement.zzcb$zzc> r5 = r4.f10697c     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzgw r11 = r9.q()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzfo r11 = (com.google.android.gms.internal.measurement.zzfo) r11     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzc r11 = (com.google.android.gms.internal.measurement.zzcb.zzc) r11     // Catch:{ all -> 0x0f39 }
            r12 = r16
            r5.set(r12, r11)     // Catch:{ all -> 0x0f39 }
            int r14 = r21 + 1
            r6.H(r9)     // Catch:{ all -> 0x0f39 }
            r15 = r2
            r11 = r10
            r13 = r19
            r10 = r28
        L_0x0893:
            int r12 = r12 + 1
            r5 = r6
            r3 = r18
            r2 = r20
            r6 = r26
            goto L_0x028a
        L_0x089e:
            r11 = r3
            r26 = r6
            r14 = r13
            r6 = r5
            r5 = r2
            if (r26 == 0) goto L_0x08fb
            r2 = r21
            r15 = r22
            r3 = 0
        L_0x08ab:
            if (r3 >= r2) goto L_0x08f9
            com.google.android.gms.internal.measurement.zzcb$zzc r7 = r6.T(r3)     // Catch:{ all -> 0x0f39 }
            java.lang.String r8 = r7.W()     // Catch:{ all -> 0x0f39 }
            boolean r8 = r5.equals(r8)     // Catch:{ all -> 0x0f39 }
            if (r8 == 0) goto L_0x08cc
            r43.Z()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zze r8 = com.google.android.gms.measurement.internal.zzkn.z(r7, r11)     // Catch:{ all -> 0x0f39 }
            if (r8 == 0) goto L_0x08cc
            r6.Y(r3)     // Catch:{ all -> 0x0f39 }
            int r2 = r2 + -1
            int r3 = r3 + -1
            goto L_0x08f6
        L_0x08cc:
            r43.Z()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zze r7 = com.google.android.gms.measurement.internal.zzkn.z(r7, r14)     // Catch:{ all -> 0x0f39 }
            if (r7 == 0) goto L_0x08f6
            boolean r8 = r7.Y()     // Catch:{ all -> 0x0f39 }
            if (r8 == 0) goto L_0x08e4
            long r7 = r7.Z()     // Catch:{ all -> 0x0f39 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0f39 }
            goto L_0x08e5
        L_0x08e4:
            r7 = 0
        L_0x08e5:
            if (r7 == 0) goto L_0x08f6
            long r8 = r7.longValue()     // Catch:{ all -> 0x0f39 }
            r12 = 0
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x08f6
            long r7 = r7.longValue()     // Catch:{ all -> 0x0f39 }
            long r15 = r15 + r7
        L_0x08f6:
            r7 = 1
            int r3 = r3 + r7
            goto L_0x08ab
        L_0x08f9:
            r2 = r15
            goto L_0x08fd
        L_0x08fb:
            r2 = r22
        L_0x08fd:
            r5 = 0
            r1.o(r6, r2, r5)     // Catch:{ all -> 0x0f39 }
            java.util.List r5 = r6.R()     // Catch:{ all -> 0x0f39 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0f39 }
        L_0x0909:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x0f39 }
            if (r7 == 0) goto L_0x0923
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzc r7 = (com.google.android.gms.internal.measurement.zzcb.zzc) r7     // Catch:{ all -> 0x0f39 }
            java.lang.String r8 = "_s"
            java.lang.String r7 = r7.W()     // Catch:{ all -> 0x0f39 }
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x0f39 }
            if (r7 == 0) goto L_0x0909
            r5 = 1
            goto L_0x0924
        L_0x0923:
            r5 = 0
        L_0x0924:
            java.lang.String r7 = "_se"
            if (r5 == 0) goto L_0x0933
            com.google.android.gms.measurement.internal.c r5 = r43.V()     // Catch:{ all -> 0x0f39 }
            java.lang.String r8 = r6.D0()     // Catch:{ all -> 0x0f39 }
            r5.l0(r8, r7)     // Catch:{ all -> 0x0f39 }
        L_0x0933:
            java.lang.String r5 = "_sid"
            int r5 = com.google.android.gms.measurement.internal.zzkn.v(r6, r5)     // Catch:{ all -> 0x0f39 }
            if (r5 < 0) goto L_0x093d
            r5 = 1
            goto L_0x093e
        L_0x093d:
            r5 = 0
        L_0x093e:
            if (r5 == 0) goto L_0x0945
            r5 = 1
            r1.o(r6, r2, r5)     // Catch:{ all -> 0x0f39 }
            goto L_0x0967
        L_0x0945:
            int r2 = com.google.android.gms.measurement.internal.zzkn.v(r6, r7)     // Catch:{ all -> 0x0f39 }
            if (r2 < 0) goto L_0x0967
            r6.i0(r2)     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzfy r2 = r1.i     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzeu r2 = r2.h()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.G()     // Catch:{ all -> 0x0f39 }
            java.lang.String r3 = "Session engagement user property is in the bundle without session ID. appId"
            com.google.android.gms.internal.measurement.zzcb$zzg r5 = r4.f10695a     // Catch:{ all -> 0x0f39 }
            java.lang.String r5 = r5.I2()     // Catch:{ all -> 0x0f39 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzeu.x(r5)     // Catch:{ all -> 0x0f39 }
            r2.b(r3, r5)     // Catch:{ all -> 0x0f39 }
        L_0x0967:
            com.google.android.gms.measurement.internal.zzkn r2 = r43.Z()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzeu r3 = r2.h()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzew r3 = r3.O()     // Catch:{ all -> 0x0f39 }
            java.lang.String r5 = "Checking account type status for ad personalization signals"
            r3.a(r5)     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzfs r3 = r2.q()     // Catch:{ all -> 0x0f39 }
            java.lang.String r5 = r6.D0()     // Catch:{ all -> 0x0f39 }
            boolean r3 = r3.G(r5)     // Catch:{ all -> 0x0f39 }
            if (r3 == 0) goto L_0x09f5
            com.google.android.gms.measurement.internal.c r3 = r2.p()     // Catch:{ all -> 0x0f39 }
            java.lang.String r5 = r6.D0()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.k3 r3 = r3.j0(r5)     // Catch:{ all -> 0x0f39 }
            if (r3 == 0) goto L_0x09f5
            boolean r3 = r3.l()     // Catch:{ all -> 0x0f39 }
            if (r3 == 0) goto L_0x09f5
            com.google.android.gms.measurement.internal.zzai r3 = r2.d()     // Catch:{ all -> 0x0f39 }
            boolean r3 = r3.z()     // Catch:{ all -> 0x0f39 }
            if (r3 == 0) goto L_0x09f5
            com.google.android.gms.measurement.internal.zzeu r3 = r2.h()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzew r3 = r3.N()     // Catch:{ all -> 0x0f39 }
            java.lang.String r5 = "Turning off ad personalization due to account type"
            r3.a(r5)     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzk$zza r3 = com.google.android.gms.internal.measurement.zzcb.zzk.a0()     // Catch:{ all -> 0x0f39 }
            r5 = r20
            r3.F(r5)     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzai r2 = r2.d()     // Catch:{ all -> 0x0f39 }
            long r7 = r2.x()     // Catch:{ all -> 0x0f39 }
            r3.E(r7)     // Catch:{ all -> 0x0f39 }
            r7 = 1
            r3.I(r7)     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzgw r2 = r3.q()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzfo r2 = (com.google.android.gms.internal.measurement.zzfo) r2     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzk r2 = (com.google.android.gms.internal.measurement.zzcb.zzk) r2     // Catch:{ all -> 0x0f39 }
            r3 = 0
        L_0x09d3:
            int r7 = r6.h0()     // Catch:{ all -> 0x0f39 }
            if (r3 >= r7) goto L_0x09ef
            com.google.android.gms.internal.measurement.zzcb$zzk r7 = r6.f0(r3)     // Catch:{ all -> 0x0f39 }
            java.lang.String r7 = r7.S()     // Catch:{ all -> 0x0f39 }
            boolean r7 = r5.equals(r7)     // Catch:{ all -> 0x0f39 }
            if (r7 == 0) goto L_0x09ec
            r6.E(r3, r2)     // Catch:{ all -> 0x0f39 }
            r3 = 1
            goto L_0x09f0
        L_0x09ec:
            int r3 = r3 + 1
            goto L_0x09d3
        L_0x09ef:
            r3 = 0
        L_0x09f0:
            if (r3 != 0) goto L_0x09f5
            r6.L(r2)     // Catch:{ all -> 0x0f39 }
        L_0x09f5:
            com.google.android.gms.measurement.internal.zzfy r2 = r1.i     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzy r2 = r2.x()     // Catch:{ all -> 0x0f39 }
            java.lang.String r3 = r6.D0()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.zzaq.n0     // Catch:{ all -> 0x0f39 }
            boolean r2 = r2.C(r3, r5)     // Catch:{ all -> 0x0f39 }
            if (r2 == 0) goto L_0x0a0a
            l(r6)     // Catch:{ all -> 0x0f39 }
        L_0x0a0a:
            r6.K0()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.w7 r7 = r43.X()     // Catch:{ all -> 0x0f39 }
            java.lang.String r8 = r6.D0()     // Catch:{ all -> 0x0f39 }
            java.util.List r9 = r6.R()     // Catch:{ all -> 0x0f39 }
            java.util.List r10 = r6.g0()     // Catch:{ all -> 0x0f39 }
            long r2 = r6.l0()     // Catch:{ all -> 0x0f39 }
            java.lang.Long r11 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0f39 }
            long r2 = r6.p0()     // Catch:{ all -> 0x0f39 }
            java.lang.Long r12 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0f39 }
            java.util.List r2 = r7.w(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0f39 }
            r6.a0(r2)     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzfy r2 = r1.i     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzy r2 = r2.x()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzg r3 = r4.f10695a     // Catch:{ all -> 0x0f39 }
            java.lang.String r3 = r3.I2()     // Catch:{ all -> 0x0f39 }
            boolean r2 = r2.I(r3)     // Catch:{ all -> 0x0f39 }
            if (r2 == 0) goto L_0x0d79
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0d74 }
            r2.<init>()     // Catch:{ all -> 0x0d74 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0d74 }
            r3.<init>()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.zzfy r5 = r1.i     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.zzkr r5 = r5.G()     // Catch:{ all -> 0x0d74 }
            java.security.SecureRandom r5 = r5.H0()     // Catch:{ all -> 0x0d74 }
            r7 = 0
        L_0x0a5b:
            int r8 = r6.S()     // Catch:{ all -> 0x0d74 }
            if (r7 >= r8) goto L_0x0d3f
            com.google.android.gms.internal.measurement.zzcb$zzc r8 = r6.T(r7)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.zzfo$zza r8 = r8.x()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.zzcb$zzc$zza r8 = (com.google.android.gms.internal.measurement.zzcb.zzc.zza) r8     // Catch:{ all -> 0x0d74 }
            java.lang.String r9 = r8.U()     // Catch:{ all -> 0x0d74 }
            java.lang.String r10 = "_ep"
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x0d74 }
            java.lang.String r10 = "_sr"
            if (r9 == 0) goto L_0x0aef
            com.google.android.gms.measurement.internal.zzkn r9 = r43.Z()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzgw r11 = r8.q()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzfo r11 = (com.google.android.gms.internal.measurement.zzfo) r11     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzc r11 = (com.google.android.gms.internal.measurement.zzcb.zzc) r11     // Catch:{ all -> 0x0f39 }
            java.lang.String r12 = "_en"
            java.lang.Object r9 = r9.V(r11, r12)     // Catch:{ all -> 0x0f39 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0f39 }
            java.lang.Object r11 = r2.get(r9)     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.h r11 = (com.google.android.gms.measurement.internal.h) r11     // Catch:{ all -> 0x0f39 }
            if (r11 != 0) goto L_0x0aa6
            com.google.android.gms.measurement.internal.c r11 = r43.V()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzg r12 = r4.f10695a     // Catch:{ all -> 0x0f39 }
            java.lang.String r12 = r12.I2()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.h r11 = r11.D(r12, r9)     // Catch:{ all -> 0x0f39 }
            r2.put(r9, r11)     // Catch:{ all -> 0x0f39 }
        L_0x0aa6:
            java.lang.Long r9 = r11.i     // Catch:{ all -> 0x0f39 }
            if (r9 != 0) goto L_0x0ae5
            java.lang.Long r9 = r11.j     // Catch:{ all -> 0x0f39 }
            long r12 = r9.longValue()     // Catch:{ all -> 0x0f39 }
            r14 = 1
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x0abf
            com.google.android.gms.measurement.internal.zzkn r9 = r43.Z()     // Catch:{ all -> 0x0f39 }
            java.lang.Long r12 = r11.j     // Catch:{ all -> 0x0f39 }
            r9.I(r8, r10, r12)     // Catch:{ all -> 0x0f39 }
        L_0x0abf:
            java.lang.Boolean r9 = r11.k     // Catch:{ all -> 0x0f39 }
            if (r9 == 0) goto L_0x0ada
            java.lang.Boolean r9 = r11.k     // Catch:{ all -> 0x0f39 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0f39 }
            if (r9 == 0) goto L_0x0ada
            com.google.android.gms.measurement.internal.zzkn r9 = r43.Z()     // Catch:{ all -> 0x0f39 }
            java.lang.String r10 = "_efs"
            r11 = 1
            java.lang.Long r13 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0f39 }
            r9.I(r8, r10, r13)     // Catch:{ all -> 0x0f39 }
        L_0x0ada:
            com.google.android.gms.internal.measurement.zzgw r9 = r8.q()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzfo r9 = (com.google.android.gms.internal.measurement.zzfo) r9     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzc r9 = (com.google.android.gms.internal.measurement.zzcb.zzc) r9     // Catch:{ all -> 0x0f39 }
            r3.add(r9)     // Catch:{ all -> 0x0f39 }
        L_0x0ae5:
            r6.D(r7, r8)     // Catch:{ all -> 0x0f39 }
        L_0x0ae8:
            r44 = r4
            r15 = r5
            r5 = r6
            r1 = r7
            goto L_0x0d35
        L_0x0aef:
            com.google.android.gms.measurement.internal.zzfs r9 = r43.R()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.zzcb$zzg r11 = r4.f10695a     // Catch:{ all -> 0x0d74 }
            java.lang.String r11 = r11.I2()     // Catch:{ all -> 0x0d74 }
            long r11 = r9.H(r11)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.zzfy r9 = r1.i     // Catch:{ all -> 0x0d74 }
            r9.G()     // Catch:{ all -> 0x0d74 }
            long r13 = r8.V()     // Catch:{ all -> 0x0d74 }
            long r13 = com.google.android.gms.measurement.internal.zzkr.w(r13, r11)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.zzgw r9 = r8.q()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.zzfo r9 = (com.google.android.gms.internal.measurement.zzfo) r9     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.zzcb$zzc r9 = (com.google.android.gms.internal.measurement.zzcb.zzc) r9     // Catch:{ all -> 0x0d74 }
            java.lang.String r15 = "_dbg"
            r20 = r11
            r16 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0d74 }
            boolean r12 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x0d74 }
            if (r12 != 0) goto L_0x0b7c
            if (r11 != 0) goto L_0x0b25
            goto L_0x0b7c
        L_0x0b25:
            java.util.List r9 = r9.E()     // Catch:{ all -> 0x0f39 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0f39 }
        L_0x0b2d:
            boolean r12 = r9.hasNext()     // Catch:{ all -> 0x0f39 }
            if (r12 == 0) goto L_0x0b7c
            java.lang.Object r12 = r9.next()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zze r12 = (com.google.android.gms.internal.measurement.zzcb.zze) r12     // Catch:{ all -> 0x0f39 }
            r44 = r9
            java.lang.String r9 = r12.P()     // Catch:{ all -> 0x0f39 }
            boolean r9 = r15.equals(r9)     // Catch:{ all -> 0x0f39 }
            if (r9 == 0) goto L_0x0b79
            boolean r9 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0f39 }
            if (r9 == 0) goto L_0x0b57
            long r15 = r12.Z()     // Catch:{ all -> 0x0f39 }
            java.lang.Long r9 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0f39 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0f39 }
            if (r9 != 0) goto L_0x0b77
        L_0x0b57:
            boolean r9 = r11 instanceof java.lang.String     // Catch:{ all -> 0x0f39 }
            if (r9 == 0) goto L_0x0b65
            java.lang.String r9 = r12.V()     // Catch:{ all -> 0x0f39 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0f39 }
            if (r9 != 0) goto L_0x0b77
        L_0x0b65:
            boolean r9 = r11 instanceof java.lang.Double     // Catch:{ all -> 0x0f39 }
            if (r9 == 0) goto L_0x0b7c
            double r15 = r12.d0()     // Catch:{ all -> 0x0f39 }
            java.lang.Double r9 = java.lang.Double.valueOf(r15)     // Catch:{ all -> 0x0f39 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0f39 }
            if (r9 == 0) goto L_0x0b7c
        L_0x0b77:
            r9 = 1
            goto L_0x0b7d
        L_0x0b79:
            r9 = r44
            goto L_0x0b2d
        L_0x0b7c:
            r9 = 0
        L_0x0b7d:
            if (r9 != 0) goto L_0x0b92
            com.google.android.gms.measurement.internal.zzfs r9 = r43.R()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzg r11 = r4.f10695a     // Catch:{ all -> 0x0f39 }
            java.lang.String r11 = r11.I2()     // Catch:{ all -> 0x0f39 }
            java.lang.String r12 = r8.U()     // Catch:{ all -> 0x0f39 }
            int r9 = r9.E(r11, r12)     // Catch:{ all -> 0x0f39 }
            goto L_0x0b93
        L_0x0b92:
            r9 = 1
        L_0x0b93:
            if (r9 > 0) goto L_0x0bbc
            com.google.android.gms.measurement.internal.zzfy r10 = r1.i     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzeu r10 = r10.h()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzew r10 = r10.J()     // Catch:{ all -> 0x0f39 }
            java.lang.String r11 = "Sample rate must be positive. event, rate"
            java.lang.String r12 = r8.U()     // Catch:{ all -> 0x0f39 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0f39 }
            r10.c(r11, r12, r9)     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzgw r9 = r8.q()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzfo r9 = (com.google.android.gms.internal.measurement.zzfo) r9     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzc r9 = (com.google.android.gms.internal.measurement.zzcb.zzc) r9     // Catch:{ all -> 0x0f39 }
            r3.add(r9)     // Catch:{ all -> 0x0f39 }
            r6.D(r7, r8)     // Catch:{ all -> 0x0f39 }
            goto L_0x0ae8
        L_0x0bbc:
            java.lang.String r11 = r8.U()     // Catch:{ all -> 0x0d74 }
            java.lang.Object r11 = r2.get(r11)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.h r11 = (com.google.android.gms.measurement.internal.h) r11     // Catch:{ all -> 0x0d74 }
            if (r11 != 0) goto L_0x0c1a
            com.google.android.gms.measurement.internal.c r11 = r43.V()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.zzcb$zzg r12 = r4.f10695a     // Catch:{ all -> 0x0d74 }
            java.lang.String r12 = r12.I2()     // Catch:{ all -> 0x0d74 }
            java.lang.String r15 = r8.U()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.h r11 = r11.D(r12, r15)     // Catch:{ all -> 0x0d74 }
            if (r11 != 0) goto L_0x0c1a
            com.google.android.gms.measurement.internal.zzfy r11 = r1.i     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.zzeu r11 = r11.h()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.zzew r11 = r11.J()     // Catch:{ all -> 0x0d74 }
            java.lang.String r12 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.zzcb$zzg r15 = r4.f10695a     // Catch:{ all -> 0x0d74 }
            java.lang.String r15 = r15.I2()     // Catch:{ all -> 0x0d74 }
            java.lang.String r1 = r8.U()     // Catch:{ all -> 0x0d74 }
            r11.c(r12, r15, r1)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.h r11 = new com.google.android.gms.measurement.internal.h     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.zzcb$zzg r1 = r4.f10695a     // Catch:{ all -> 0x0d74 }
            java.lang.String r27 = r1.I2()     // Catch:{ all -> 0x0d74 }
            java.lang.String r28 = r8.U()     // Catch:{ all -> 0x0d74 }
            r29 = 1
            r31 = 1
            r33 = 1
            long r35 = r8.V()     // Catch:{ all -> 0x0d74 }
            r37 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r26 = r11
            r26.<init>(r27, r28, r29, r31, r33, r35, r37, r39, r40, r41, r42)     // Catch:{ all -> 0x0d74 }
        L_0x0c1a:
            com.google.android.gms.measurement.internal.zzkn r1 = r43.Z()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.zzgw r12 = r8.q()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.zzfo r12 = (com.google.android.gms.internal.measurement.zzfo) r12     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.zzcb$zzc r12 = (com.google.android.gms.internal.measurement.zzcb.zzc) r12     // Catch:{ all -> 0x0d74 }
            java.lang.String r15 = "_eid"
            java.lang.Object r1 = r1.V(r12, r15)     // Catch:{ all -> 0x0d74 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x0d74 }
            if (r1 == 0) goto L_0x0c32
            r12 = 1
            goto L_0x0c33
        L_0x0c32:
            r12 = 0
        L_0x0c33:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x0d74 }
            r15 = 1
            if (r9 != r15) goto L_0x0c68
            com.google.android.gms.internal.measurement.zzgw r1 = r8.q()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.zzfo r1 = (com.google.android.gms.internal.measurement.zzfo) r1     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.zzcb$zzc r1 = (com.google.android.gms.internal.measurement.zzcb.zzc) r1     // Catch:{ all -> 0x0d74 }
            r3.add(r1)     // Catch:{ all -> 0x0d74 }
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0d74 }
            if (r1 == 0) goto L_0x0c63
            java.lang.Long r1 = r11.i     // Catch:{ all -> 0x0d74 }
            if (r1 != 0) goto L_0x0c57
            java.lang.Long r1 = r11.j     // Catch:{ all -> 0x0d74 }
            if (r1 != 0) goto L_0x0c57
            java.lang.Boolean r1 = r11.k     // Catch:{ all -> 0x0d74 }
            if (r1 == 0) goto L_0x0c63
        L_0x0c57:
            r1 = 0
            com.google.android.gms.measurement.internal.h r9 = r11.c(r1, r1, r1)     // Catch:{ all -> 0x0d74 }
            java.lang.String r1 = r8.U()     // Catch:{ all -> 0x0d74 }
            r2.put(r1, r9)     // Catch:{ all -> 0x0d74 }
        L_0x0c63:
            r6.D(r7, r8)     // Catch:{ all -> 0x0d74 }
            goto L_0x0ae8
        L_0x0c68:
            int r15 = r5.nextInt(r9)     // Catch:{ all -> 0x0d74 }
            if (r15 != 0) goto L_0x0caa
            com.google.android.gms.measurement.internal.zzkn r1 = r43.Z()     // Catch:{ all -> 0x0d74 }
            r44 = r4
            r15 = r5
            long r4 = (long) r9     // Catch:{ all -> 0x0d74 }
            java.lang.Long r9 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0d74 }
            r1.I(r8, r10, r9)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.zzgw r1 = r8.q()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.zzfo r1 = (com.google.android.gms.internal.measurement.zzfo) r1     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.zzcb$zzc r1 = (com.google.android.gms.internal.measurement.zzcb.zzc) r1     // Catch:{ all -> 0x0d74 }
            r3.add(r1)     // Catch:{ all -> 0x0d74 }
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0d74 }
            if (r1 == 0) goto L_0x0c97
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0d74 }
            r4 = 0
            com.google.android.gms.measurement.internal.h r11 = r11.c(r4, r1, r4)     // Catch:{ all -> 0x0d74 }
        L_0x0c97:
            java.lang.String r1 = r8.U()     // Catch:{ all -> 0x0d74 }
            long r4 = r8.V()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.h r4 = r11.b(r4, r13)     // Catch:{ all -> 0x0d74 }
            r2.put(r1, r4)     // Catch:{ all -> 0x0d74 }
            r5 = r6
            r1 = r7
            goto L_0x0d32
        L_0x0caa:
            r44 = r4
            r15 = r5
            java.lang.Long r4 = r11.h     // Catch:{ all -> 0x0d74 }
            if (r4 == 0) goto L_0x0cbc
            java.lang.Long r4 = r11.h     // Catch:{ all -> 0x0d74 }
            long r4 = r4.longValue()     // Catch:{ all -> 0x0d74 }
            r30 = r6
            r16 = r7
            goto L_0x0cd1
        L_0x0cbc:
            r4 = r43
            com.google.android.gms.measurement.internal.zzfy r5 = r4.i     // Catch:{ all -> 0x0d74 }
            r5.G()     // Catch:{ all -> 0x0d74 }
            long r4 = r8.W()     // Catch:{ all -> 0x0d74 }
            r30 = r6
            r16 = r7
            r6 = r20
            long r4 = com.google.android.gms.measurement.internal.zzkr.w(r4, r6)     // Catch:{ all -> 0x0d74 }
        L_0x0cd1:
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 == 0) goto L_0x0d1c
            com.google.android.gms.measurement.internal.zzkn r1 = r43.Z()     // Catch:{ all -> 0x0d74 }
            java.lang.String r4 = "_efs"
            r5 = 1
            java.lang.Long r7 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0d74 }
            r1.I(r8, r4, r7)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.zzkn r1 = r43.Z()     // Catch:{ all -> 0x0d74 }
            long r5 = (long) r9     // Catch:{ all -> 0x0d74 }
            java.lang.Long r4 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0d74 }
            r1.I(r8, r10, r4)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.zzgw r1 = r8.q()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.zzfo r1 = (com.google.android.gms.internal.measurement.zzfo) r1     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.zzcb$zzc r1 = (com.google.android.gms.internal.measurement.zzcb.zzc) r1     // Catch:{ all -> 0x0d74 }
            r3.add(r1)     // Catch:{ all -> 0x0d74 }
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0d74 }
            if (r1 == 0) goto L_0x0d0c
            java.lang.Long r1 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0d74 }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0d74 }
            r5 = 0
            com.google.android.gms.measurement.internal.h r11 = r11.c(r5, r1, r4)     // Catch:{ all -> 0x0d74 }
        L_0x0d0c:
            java.lang.String r1 = r8.U()     // Catch:{ all -> 0x0d74 }
            long r4 = r8.V()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.h r4 = r11.b(r4, r13)     // Catch:{ all -> 0x0d74 }
            r2.put(r1, r4)     // Catch:{ all -> 0x0d74 }
            goto L_0x0d2e
        L_0x0d1c:
            boolean r4 = r12.booleanValue()     // Catch:{ all -> 0x0d74 }
            if (r4 == 0) goto L_0x0d2e
            java.lang.String r4 = r8.U()     // Catch:{ all -> 0x0d74 }
            r5 = 0
            com.google.android.gms.measurement.internal.h r1 = r11.c(r1, r5, r5)     // Catch:{ all -> 0x0d74 }
            r2.put(r4, r1)     // Catch:{ all -> 0x0d74 }
        L_0x0d2e:
            r1 = r16
            r5 = r30
        L_0x0d32:
            r5.D(r1, r8)     // Catch:{ all -> 0x0d74 }
        L_0x0d35:
            int r7 = r1 + 1
            r1 = r43
            r4 = r44
            r6 = r5
            r5 = r15
            goto L_0x0a5b
        L_0x0d3f:
            r44 = r4
            r5 = r6
            int r1 = r3.size()     // Catch:{ all -> 0x0d74 }
            int r4 = r5.S()     // Catch:{ all -> 0x0d74 }
            if (r1 >= r4) goto L_0x0d52
            r5.X()     // Catch:{ all -> 0x0d74 }
            r5.M(r3)     // Catch:{ all -> 0x0d74 }
        L_0x0d52:
            java.util.Set r1 = r2.entrySet()     // Catch:{ all -> 0x0d74 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0d74 }
        L_0x0d5a:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0d74 }
            if (r2 == 0) goto L_0x0d7c
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0d74 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.c r3 = r43.V()     // Catch:{ all -> 0x0d74 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.h r2 = (com.google.android.gms.measurement.internal.h) r2     // Catch:{ all -> 0x0d74 }
            r3.M(r2)     // Catch:{ all -> 0x0d74 }
            goto L_0x0d5a
        L_0x0d74:
            r0 = move-exception
            r1 = r43
            goto L_0x0f3a
        L_0x0d79:
            r44 = r4
            r5 = r6
        L_0x0d7c:
            r1 = r43
            com.google.android.gms.measurement.internal.zzfy r2 = r1.i     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzy r2 = r2.x()     // Catch:{ all -> 0x0f39 }
            java.lang.String r3 = r5.D0()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.zzaq.n0     // Catch:{ all -> 0x0f39 }
            boolean r2 = r2.C(r3, r4)     // Catch:{ all -> 0x0f39 }
            if (r2 != 0) goto L_0x0d93
            l(r5)     // Catch:{ all -> 0x0f39 }
        L_0x0d93:
            r2 = r44
            com.google.android.gms.internal.measurement.zzcb$zzg r3 = r2.f10695a     // Catch:{ all -> 0x0f39 }
            java.lang.String r3 = r3.I2()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.c r4 = r43.V()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.k3 r4 = r4.j0(r3)     // Catch:{ all -> 0x0f39 }
            if (r4 != 0) goto L_0x0dbf
            com.google.android.gms.measurement.internal.zzfy r4 = r1.i     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzeu r4 = r4.h()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzew r4 = r4.G()     // Catch:{ all -> 0x0f39 }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.zzcb$zzg r7 = r2.f10695a     // Catch:{ all -> 0x0f39 }
            java.lang.String r7 = r7.I2()     // Catch:{ all -> 0x0f39 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzeu.x(r7)     // Catch:{ all -> 0x0f39 }
            r4.b(r6, r7)     // Catch:{ all -> 0x0f39 }
            goto L_0x0e1a
        L_0x0dbf:
            int r6 = r5.S()     // Catch:{ all -> 0x0f39 }
            if (r6 <= 0) goto L_0x0e1a
            long r6 = r4.R()     // Catch:{ all -> 0x0f39 }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0dd3
            r5.j0(r6)     // Catch:{ all -> 0x0f39 }
            goto L_0x0dd6
        L_0x0dd3:
            r5.x0()     // Catch:{ all -> 0x0f39 }
        L_0x0dd6:
            long r8 = r4.P()     // Catch:{ all -> 0x0f39 }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0de1
            goto L_0x0de2
        L_0x0de1:
            r6 = r8
        L_0x0de2:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0dea
            r5.c0(r6)     // Catch:{ all -> 0x0f39 }
            goto L_0x0ded
        L_0x0dea:
            r5.t0()     // Catch:{ all -> 0x0f39 }
        L_0x0ded:
            r4.i0()     // Catch:{ all -> 0x0f39 }
            long r6 = r4.f0()     // Catch:{ all -> 0x0f39 }
            int r7 = (int) r6     // Catch:{ all -> 0x0f39 }
            r5.q0(r7)     // Catch:{ all -> 0x0f39 }
            long r6 = r5.l0()     // Catch:{ all -> 0x0f39 }
            r4.a(r6)     // Catch:{ all -> 0x0f39 }
            long r6 = r5.p0()     // Catch:{ all -> 0x0f39 }
            r4.q(r6)     // Catch:{ all -> 0x0f39 }
            java.lang.String r6 = r4.j()     // Catch:{ all -> 0x0f39 }
            if (r6 == 0) goto L_0x0e10
            r5.C0(r6)     // Catch:{ all -> 0x0f39 }
            goto L_0x0e13
        L_0x0e10:
            r5.E0()     // Catch:{ all -> 0x0f39 }
        L_0x0e13:
            com.google.android.gms.measurement.internal.c r6 = r43.V()     // Catch:{ all -> 0x0f39 }
            r6.N(r4)     // Catch:{ all -> 0x0f39 }
        L_0x0e1a:
            int r4 = r5.S()     // Catch:{ all -> 0x0f39 }
            if (r4 <= 0) goto L_0x0e80
            com.google.android.gms.measurement.internal.zzfy r4 = r1.i     // Catch:{ all -> 0x0f39 }
            r4.m()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzfs r4 = r43.R()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzg r6 = r2.f10695a     // Catch:{ all -> 0x0f39 }
            java.lang.String r6 = r6.I2()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzby$zzb r4 = r4.v(r6)     // Catch:{ all -> 0x0f39 }
            if (r4 == 0) goto L_0x0e44
            boolean r6 = r4.H()     // Catch:{ all -> 0x0f39 }
            if (r6 != 0) goto L_0x0e3c
            goto L_0x0e44
        L_0x0e3c:
            long r6 = r4.I()     // Catch:{ all -> 0x0f39 }
            r5.z0(r6)     // Catch:{ all -> 0x0f39 }
            goto L_0x0e6f
        L_0x0e44:
            com.google.android.gms.internal.measurement.zzcb$zzg r4 = r2.f10695a     // Catch:{ all -> 0x0f39 }
            java.lang.String r4 = r4.k0()     // Catch:{ all -> 0x0f39 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0f39 }
            if (r4 == 0) goto L_0x0e56
            r6 = -1
            r5.z0(r6)     // Catch:{ all -> 0x0f39 }
            goto L_0x0e6f
        L_0x0e56:
            com.google.android.gms.measurement.internal.zzfy r4 = r1.i     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzeu r4 = r4.h()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzew r4 = r4.J()     // Catch:{ all -> 0x0f39 }
            java.lang.String r6 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.zzcb$zzg r7 = r2.f10695a     // Catch:{ all -> 0x0f39 }
            java.lang.String r7 = r7.I2()     // Catch:{ all -> 0x0f39 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzeu.x(r7)     // Catch:{ all -> 0x0f39 }
            r4.b(r6, r7)     // Catch:{ all -> 0x0f39 }
        L_0x0e6f:
            com.google.android.gms.measurement.internal.c r4 = r43.V()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzgw r5 = r5.q()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzfo r5 = (com.google.android.gms.internal.measurement.zzfo) r5     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.internal.measurement.zzcb$zzg r5 = (com.google.android.gms.internal.measurement.zzcb.zzg) r5     // Catch:{ all -> 0x0f39 }
            r13 = r19
            r4.Q(r5, r13)     // Catch:{ all -> 0x0f39 }
        L_0x0e80:
            com.google.android.gms.measurement.internal.c r4 = r43.V()     // Catch:{ all -> 0x0f39 }
            java.util.List<java.lang.Long> r2 = r2.f10696b     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.common.internal.Preconditions.k(r2)     // Catch:{ all -> 0x0f39 }
            r4.c()     // Catch:{ all -> 0x0f39 }
            r4.s()     // Catch:{ all -> 0x0f39 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0f39 }
            java.lang.String r6 = "rowid in ("
            r5.<init>(r6)     // Catch:{ all -> 0x0f39 }
            r6 = 0
        L_0x0e97:
            int r7 = r2.size()     // Catch:{ all -> 0x0f39 }
            if (r6 >= r7) goto L_0x0eb4
            if (r6 == 0) goto L_0x0ea4
            java.lang.String r7 = ","
            r5.append(r7)     // Catch:{ all -> 0x0f39 }
        L_0x0ea4:
            java.lang.Object r7 = r2.get(r6)     // Catch:{ all -> 0x0f39 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0f39 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0f39 }
            r5.append(r7)     // Catch:{ all -> 0x0f39 }
            int r6 = r6 + 1
            goto L_0x0e97
        L_0x0eb4:
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x0f39 }
            android.database.sqlite.SQLiteDatabase r6 = r4.w()     // Catch:{ all -> 0x0f39 }
            java.lang.String r7 = "raw_events"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0f39 }
            r8 = 0
            int r5 = r6.delete(r7, r5, r8)     // Catch:{ all -> 0x0f39 }
            int r6 = r2.size()     // Catch:{ all -> 0x0f39 }
            if (r5 == r6) goto L_0x0ee7
            com.google.android.gms.measurement.internal.zzeu r4 = r4.h()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzew r4 = r4.G()     // Catch:{ all -> 0x0f39 }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0f39 }
            int r2 = r2.size()     // Catch:{ all -> 0x0f39 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0f39 }
            r4.c(r6, r5, r2)     // Catch:{ all -> 0x0f39 }
        L_0x0ee7:
            com.google.android.gms.measurement.internal.c r2 = r43.V()     // Catch:{ all -> 0x0f39 }
            android.database.sqlite.SQLiteDatabase r4 = r2.w()     // Catch:{ all -> 0x0f39 }
            java.lang.String r5 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0efe }
            r7 = 0
            r6[r7] = r3     // Catch:{ SQLiteException -> 0x0efe }
            r7 = 1
            r6[r7] = r3     // Catch:{ SQLiteException -> 0x0efe }
            r4.execSQL(r5, r6)     // Catch:{ SQLiteException -> 0x0efe }
            goto L_0x0f11
        L_0x0efe:
            r0 = move-exception
            r4 = r0
            com.google.android.gms.measurement.internal.zzeu r2 = r2.h()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.G()     // Catch:{ all -> 0x0f39 }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzeu.x(r3)     // Catch:{ all -> 0x0f39 }
            r2.c(r5, r3, r4)     // Catch:{ all -> 0x0f39 }
        L_0x0f11:
            com.google.android.gms.measurement.internal.c r2 = r43.V()     // Catch:{ all -> 0x0f39 }
            r2.v()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.c r2 = r43.V()
            r2.A0()
            r2 = 1
            return r2
        L_0x0f21:
            com.google.android.gms.measurement.internal.c r2 = r43.V()     // Catch:{ all -> 0x0f39 }
            r2.v()     // Catch:{ all -> 0x0f39 }
            com.google.android.gms.measurement.internal.c r2 = r43.V()
            r2.A0()
            r2 = 0
            return r2
        L_0x0f31:
            r0 = move-exception
            r2 = r0
        L_0x0f33:
            if (r5 == 0) goto L_0x0f38
            r5.close()     // Catch:{ all -> 0x0f39 }
        L_0x0f38:
            throw r2     // Catch:{ all -> 0x0f39 }
        L_0x0f39:
            r0 = move-exception
        L_0x0f3a:
            r2 = r0
            com.google.android.gms.measurement.internal.c r3 = r43.V()
            r3.A0()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkj.E(java.lang.String, long):boolean");
    }

    private final void F() {
        j0();
        if (this.p || this.q || this.r) {
            this.i.h().O().d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.p), Boolean.valueOf(this.q), Boolean.valueOf(this.r));
            return;
        }
        this.i.h().O().a("Stopping uploading service(s)");
        List<Runnable> list = this.m;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            this.m.clear();
        }
    }

    @VisibleForTesting
    private final boolean G() {
        FileLock fileLock;
        j0();
        if (!this.i.x().t(zzaq.m0) || (fileLock = this.s) == null || !fileLock.isValid()) {
            try {
                FileChannel channel = new RandomAccessFile(new File(this.i.f().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.t = channel;
                FileLock tryLock = channel.tryLock();
                this.s = tryLock;
                if (tryLock != null) {
                    this.i.h().O().a("Storage concurrent access okay");
                    return true;
                }
                this.i.h().G().a("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e2) {
                this.i.h().G().b("Failed to acquire storage lock", e2);
                return false;
            } catch (IOException e3) {
                this.i.h().G().b("Failed to access storage lock file", e3);
                return false;
            } catch (OverlappingFileLockException e4) {
                this.i.h().J().b("Storage lock already acquired", e4);
                return false;
            }
        } else {
            this.i.h().O().a("Storage concurrent access okay");
            return true;
        }
    }

    private final Boolean I(k3 k3Var) {
        try {
            if (k3Var.V() != -2147483648L) {
                if (k3Var.V() == ((long) Wrappers.a(this.i.f()).e(k3Var.t(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = Wrappers.a(this.i.f()).e(k3Var.t(), 0).versionName;
                if (k3Var.T() != null && k3Var.T().equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final void J(zzcb.zzc.zza zza, zzcb.zzc.zza zza2) {
        Preconditions.a("_e".equals(zza.U()));
        Z();
        zzcb.zze z = zzkn.z((zzcb.zzc) ((zzfo) zza.q()), "_et");
        if (z.Y() && z.Z() > 0) {
            long Z = z.Z();
            Z();
            zzcb.zze z2 = zzkn.z((zzcb.zzc) ((zzfo) zza2.q()), "_et");
            if (z2 != null && z2.Z() > 0) {
                Z += z2.Z();
            }
            Z().I(zza2, "_et", Long.valueOf(Z));
            Z().I(zza, "_fr", 1L);
        }
    }

    private final void K(zzao zzao, zzn zzn) {
        if (zzlr.b() && this.i.x().t(zzaq.O0)) {
            zzey b2 = zzey.b(zzao);
            this.i.G().M(b2.f10599d, V().B0(zzn.f10709b));
            this.i.G().V(b2, this.i.x().o(zzn.f10709b));
            zzao = b2.a();
        }
        p(zzao, zzn);
    }

    private static void L(m7 m7Var) {
        if (m7Var == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!m7Var.r()) {
            String valueOf = String.valueOf(m7Var.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:275:0x08ac, code lost:
        r11 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02e1 A[Catch:{ SQLiteException -> 0x02a9, all -> 0x093d }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0318 A[Catch:{ SQLiteException -> 0x02a9, all -> 0x093d }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x034e A[Catch:{ SQLiteException -> 0x02a9, all -> 0x093d }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x035d A[Catch:{ SQLiteException -> 0x02a9, all -> 0x093d }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0391 A[Catch:{ SQLiteException -> 0x02a9, all -> 0x093d }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x017d A[Catch:{ SQLiteException -> 0x02a9, all -> 0x093d }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0185 A[Catch:{ SQLiteException -> 0x02a9, all -> 0x093d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void S(com.google.android.gms.measurement.internal.zzao r27, com.google.android.gms.measurement.internal.zzn r28) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            r3 = r28
            java.lang.String r4 = "_sno"
            com.google.android.gms.common.internal.Preconditions.k(r28)
            java.lang.String r5 = r3.f10709b
            com.google.android.gms.common.internal.Preconditions.g(r5)
            long r5 = java.lang.System.nanoTime()
            r26.j0()
            r26.c0()
            java.lang.String r15 = r3.f10709b
            r26.Z()
            boolean r7 = com.google.android.gms.measurement.internal.zzkn.S(r27, r28)
            if (r7 != 0) goto L_0x0026
            return
        L_0x0026:
            boolean r7 = r3.i
            if (r7 != 0) goto L_0x002e
            r1.Q(r3)
            return
        L_0x002e:
            com.google.android.gms.measurement.internal.zzfs r7 = r26.R()
            java.lang.String r8 = r2.f10563b
            boolean r7 = r7.B(r15, r8)
            java.lang.String r14 = "_err"
            r13 = 0
            if (r7 == 0) goto L_0x00d9
            com.google.android.gms.measurement.internal.zzfy r3 = r1.i
            com.google.android.gms.measurement.internal.zzeu r3 = r3.h()
            com.google.android.gms.measurement.internal.zzew r3 = r3.J()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeu.x(r15)
            com.google.android.gms.measurement.internal.zzfy r5 = r1.i
            com.google.android.gms.measurement.internal.zzes r5 = r5.H()
            java.lang.String r6 = r2.f10563b
            java.lang.String r5 = r5.w(r6)
            java.lang.String r6 = "Dropping blacklisted event. appId"
            r3.c(r6, r4, r5)
            com.google.android.gms.measurement.internal.zzfs r3 = r26.R()
            boolean r3 = r3.I(r15)
            if (r3 != 0) goto L_0x0073
            com.google.android.gms.measurement.internal.zzfs r3 = r26.R()
            boolean r3 = r3.J(r15)
            if (r3 == 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r3 = 0
            goto L_0x0074
        L_0x0073:
            r3 = 1
        L_0x0074:
            if (r3 != 0) goto L_0x008f
            java.lang.String r4 = r2.f10563b
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x008f
            com.google.android.gms.measurement.internal.zzfy r4 = r1.i
            com.google.android.gms.measurement.internal.zzkr r7 = r4.G()
            r9 = 11
            java.lang.String r11 = r2.f10563b
            r12 = 0
            java.lang.String r10 = "_ev"
            r8 = r15
            r7.W(r8, r9, r10, r11, r12)
        L_0x008f:
            if (r3 == 0) goto L_0x00d8
            com.google.android.gms.measurement.internal.c r2 = r26.V()
            com.google.android.gms.measurement.internal.k3 r2 = r2.j0(r15)
            if (r2 == 0) goto L_0x00d8
            long r3 = r2.h0()
            long r5 = r2.g0()
            long r3 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.zzfy r5 = r1.i
            com.google.android.gms.common.util.Clock r5 = r5.n()
            long r5 = r5.a()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            com.google.android.gms.measurement.internal.zzen<java.lang.Long> r5 = com.google.android.gms.measurement.internal.zzaq.z
            java.lang.Object r5 = r5.a(r13)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00d8
            com.google.android.gms.measurement.internal.zzfy r3 = r1.i
            com.google.android.gms.measurement.internal.zzeu r3 = r3.h()
            com.google.android.gms.measurement.internal.zzew r3 = r3.N()
            java.lang.String r4 = "Fetching config for blacklisted app"
            r3.a(r4)
            r1.r(r2)
        L_0x00d8:
            return
        L_0x00d9:
            boolean r7 = com.google.android.gms.internal.measurement.zzjq.b()
            if (r7 == 0) goto L_0x0108
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i
            com.google.android.gms.measurement.internal.zzy r7 = r7.x()
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.zzaq.K0
            boolean r7 = r7.t(r8)
            if (r7 == 0) goto L_0x0108
            com.google.android.gms.measurement.internal.zzey r2 = com.google.android.gms.measurement.internal.zzey.b(r27)
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i
            com.google.android.gms.measurement.internal.zzkr r7 = r7.G()
            com.google.android.gms.measurement.internal.zzfy r8 = r1.i
            com.google.android.gms.measurement.internal.zzy r8 = r8.x()
            int r8 = r8.o(r15)
            r7.V(r2, r8)
            com.google.android.gms.measurement.internal.zzao r2 = r2.a()
        L_0x0108:
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i
            com.google.android.gms.measurement.internal.zzeu r7 = r7.h()
            r8 = 2
            boolean r7 = r7.C(r8)
            if (r7 == 0) goto L_0x012e
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i
            com.google.android.gms.measurement.internal.zzeu r7 = r7.h()
            com.google.android.gms.measurement.internal.zzew r7 = r7.O()
            com.google.android.gms.measurement.internal.zzfy r9 = r1.i
            com.google.android.gms.measurement.internal.zzes r9 = r9.H()
            java.lang.String r9 = r9.v(r2)
            java.lang.String r10 = "Logging event"
            r7.b(r10, r9)
        L_0x012e:
            com.google.android.gms.measurement.internal.c r7 = r26.V()
            r7.v0()
            r1.Q(r3)     // Catch:{ all -> 0x093d }
            boolean r7 = com.google.android.gms.internal.measurement.zzjw.b()     // Catch:{ all -> 0x093d }
            if (r7 == 0) goto L_0x014e
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzy r7 = r7.x()     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.zzaq.J0     // Catch:{ all -> 0x093d }
            boolean r7 = r7.t(r9)     // Catch:{ all -> 0x093d }
            if (r7 == 0) goto L_0x014e
            r7 = 1
            goto L_0x014f
        L_0x014e:
            r7 = 0
        L_0x014f:
            java.lang.String r9 = "ecommerce_purchase"
            java.lang.String r10 = r2.f10563b     // Catch:{ all -> 0x093d }
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x093d }
            java.lang.String r10 = "refund"
            if (r9 != 0) goto L_0x0172
            if (r7 == 0) goto L_0x0170
            java.lang.String r7 = "purchase"
            java.lang.String r9 = r2.f10563b     // Catch:{ all -> 0x093d }
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x093d }
            if (r7 != 0) goto L_0x0172
            java.lang.String r7 = r2.f10563b     // Catch:{ all -> 0x093d }
            boolean r7 = r10.equals(r7)     // Catch:{ all -> 0x093d }
            if (r7 == 0) goto L_0x0170
            goto L_0x0172
        L_0x0170:
            r7 = 0
            goto L_0x0173
        L_0x0172:
            r7 = 1
        L_0x0173:
            java.lang.String r9 = "_iap"
            java.lang.String r11 = r2.f10563b     // Catch:{ all -> 0x093d }
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x093d }
            if (r9 != 0) goto L_0x0182
            if (r7 == 0) goto L_0x0180
            goto L_0x0182
        L_0x0180:
            r9 = 0
            goto L_0x0183
        L_0x0182:
            r9 = 1
        L_0x0183:
            if (r9 == 0) goto L_0x0327
            com.google.android.gms.measurement.internal.zzan r9 = r2.f10564c     // Catch:{ all -> 0x093d }
            java.lang.String r11 = "currency"
            java.lang.String r9 = r9.K(r11)     // Catch:{ all -> 0x093d }
            java.lang.String r11 = "value"
            if (r7 == 0) goto L_0x0200
            com.google.android.gms.measurement.internal.zzan r7 = r2.f10564c     // Catch:{ all -> 0x093d }
            java.lang.Double r7 = r7.J(r11)     // Catch:{ all -> 0x093d }
            double r17 = r7.doubleValue()     // Catch:{ all -> 0x093d }
            r19 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r17 = r17 * r19
            r21 = 0
            int r7 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            com.google.android.gms.measurement.internal.zzan r7 = r2.f10564c     // Catch:{ all -> 0x093d }
            java.lang.Long r7 = r7.G(r11)     // Catch:{ all -> 0x093d }
            long r12 = r7.longValue()     // Catch:{ all -> 0x093d }
            double r11 = (double) r12     // Catch:{ all -> 0x093d }
            double r17 = r11 * r19
        L_0x01b5:
            r11 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r7 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r7 > 0) goto L_0x01e3
            r11 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r7 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r7 < 0) goto L_0x01e3
            long r11 = java.lang.Math.round(r17)     // Catch:{ all -> 0x093d }
            boolean r7 = com.google.android.gms.internal.measurement.zzjw.b()     // Catch:{ all -> 0x093d }
            if (r7 == 0) goto L_0x020a
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzy r7 = r7.x()     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.zzaq.J0     // Catch:{ all -> 0x093d }
            boolean r7 = r7.t(r13)     // Catch:{ all -> 0x093d }
            if (r7 == 0) goto L_0x020a
            java.lang.String r7 = r2.f10563b     // Catch:{ all -> 0x093d }
            boolean r7 = r10.equals(r7)     // Catch:{ all -> 0x093d }
            if (r7 == 0) goto L_0x020a
            long r11 = -r11
            goto L_0x020a
        L_0x01e3:
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzeu r7 = r7.h()     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzew r7 = r7.J()     // Catch:{ all -> 0x093d }
            java.lang.String r8 = "Data lost. Currency value is too big. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzeu.x(r15)     // Catch:{ all -> 0x093d }
            java.lang.Double r10 = java.lang.Double.valueOf(r17)     // Catch:{ all -> 0x093d }
            r7.c(r8, r9, r10)     // Catch:{ all -> 0x093d }
            r23 = r5
            r5 = 0
            r11 = 0
            goto L_0x0316
        L_0x0200:
            com.google.android.gms.measurement.internal.zzan r7 = r2.f10564c     // Catch:{ all -> 0x093d }
            java.lang.Long r7 = r7.G(r11)     // Catch:{ all -> 0x093d }
            long r11 = r7.longValue()     // Catch:{ all -> 0x093d }
        L_0x020a:
            boolean r7 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x093d }
            if (r7 != 0) goto L_0x0312
            java.util.Locale r7 = java.util.Locale.US     // Catch:{ all -> 0x093d }
            java.lang.String r7 = r9.toUpperCase(r7)     // Catch:{ all -> 0x093d }
            java.lang.String r9 = "[A-Z]{3}"
            boolean r9 = r7.matches(r9)     // Catch:{ all -> 0x093d }
            if (r9 == 0) goto L_0x0312
            java.lang.String r9 = "_ltv_"
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x093d }
            int r10 = r7.length()     // Catch:{ all -> 0x093d }
            if (r10 == 0) goto L_0x022f
            java.lang.String r7 = r9.concat(r7)     // Catch:{ all -> 0x093d }
            goto L_0x0234
        L_0x022f:
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x093d }
            r7.<init>(r9)     // Catch:{ all -> 0x093d }
        L_0x0234:
            r10 = r7
            com.google.android.gms.measurement.internal.c r7 = r26.V()     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.s7 r7 = r7.o0(r15, r10)     // Catch:{ all -> 0x093d }
            if (r7 == 0) goto L_0x0270
            java.lang.Object r9 = r7.f10428e     // Catch:{ all -> 0x093d }
            boolean r9 = r9 instanceof java.lang.Long     // Catch:{ all -> 0x093d }
            if (r9 != 0) goto L_0x0246
            goto L_0x0270
        L_0x0246:
            java.lang.Object r7 = r7.f10428e     // Catch:{ all -> 0x093d }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x093d }
            long r7 = r7.longValue()     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.s7 r17 = new com.google.android.gms.measurement.internal.s7     // Catch:{ all -> 0x093d }
            java.lang.String r9 = r2.f10565d     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzfy r13 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.common.util.Clock r13 = r13.n()     // Catch:{ all -> 0x093d }
            long r18 = r13.a()     // Catch:{ all -> 0x093d }
            long r7 = r7 + r11
            java.lang.Long r13 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x093d }
            r7 = r17
            r8 = r15
            r23 = r5
            r5 = 0
            r6 = 1
            r11 = r18
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x093d }
        L_0x026d:
            r6 = r17
            goto L_0x02d7
        L_0x0270:
            r23 = r5
            r5 = 0
            r6 = 1
            com.google.android.gms.measurement.internal.c r7 = r26.V()     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzfy r9 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzy r9 = r9.x()     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzen<java.lang.Integer> r13 = com.google.android.gms.measurement.internal.zzaq.E     // Catch:{ all -> 0x093d }
            int r9 = r9.v(r15, r13)     // Catch:{ all -> 0x093d }
            int r9 = r9 - r6
            com.google.android.gms.common.internal.Preconditions.g(r15)     // Catch:{ all -> 0x093d }
            r7.c()     // Catch:{ all -> 0x093d }
            r7.s()     // Catch:{ all -> 0x093d }
            android.database.sqlite.SQLiteDatabase r13 = r7.w()     // Catch:{ SQLiteException -> 0x02a9 }
            java.lang.String r8 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r6 = 3
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x02a9 }
            r6[r5] = r15     // Catch:{ SQLiteException -> 0x02a9 }
            r16 = 1
            r6[r16] = r15     // Catch:{ SQLiteException -> 0x02a9 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x02a9 }
            r16 = 2
            r6[r16] = r9     // Catch:{ SQLiteException -> 0x02a9 }
            r13.execSQL(r8, r6)     // Catch:{ SQLiteException -> 0x02a9 }
            goto L_0x02bc
        L_0x02a9:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.zzeu r7 = r7.h()     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzew r7 = r7.G()     // Catch:{ all -> 0x093d }
            java.lang.String r8 = "Error pruning currencies. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzeu.x(r15)     // Catch:{ all -> 0x093d }
            r7.c(r8, r9, r6)     // Catch:{ all -> 0x093d }
        L_0x02bc:
            com.google.android.gms.measurement.internal.s7 r17 = new com.google.android.gms.measurement.internal.s7     // Catch:{ all -> 0x093d }
            java.lang.String r9 = r2.f10565d     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzfy r6 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.common.util.Clock r6 = r6.n()     // Catch:{ all -> 0x093d }
            long r18 = r6.a()     // Catch:{ all -> 0x093d }
            java.lang.Long r13 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x093d }
            r7 = r17
            r8 = r15
            r11 = r18
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x093d }
            goto L_0x026d
        L_0x02d7:
            com.google.android.gms.measurement.internal.c r7 = r26.V()     // Catch:{ all -> 0x093d }
            boolean r7 = r7.S(r6)     // Catch:{ all -> 0x093d }
            if (r7 != 0) goto L_0x0315
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzeu r7 = r7.h()     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzew r7 = r7.G()     // Catch:{ all -> 0x093d }
            java.lang.String r8 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzeu.x(r15)     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzfy r10 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzes r10 = r10.H()     // Catch:{ all -> 0x093d }
            java.lang.String r11 = r6.f10426c     // Catch:{ all -> 0x093d }
            java.lang.String r10 = r10.A(r11)     // Catch:{ all -> 0x093d }
            java.lang.Object r6 = r6.f10428e     // Catch:{ all -> 0x093d }
            r7.d(r8, r9, r10, r6)     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzfy r6 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzkr r7 = r6.G()     // Catch:{ all -> 0x093d }
            r9 = 9
            r10 = 0
            r11 = 0
            r12 = 0
            r8 = r15
            r7.W(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x093d }
            goto L_0x0315
        L_0x0312:
            r23 = r5
            r5 = 0
        L_0x0315:
            r11 = 1
        L_0x0316:
            if (r11 != 0) goto L_0x032a
            com.google.android.gms.measurement.internal.c r2 = r26.V()     // Catch:{ all -> 0x093d }
            r2.v()     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.c r2 = r26.V()
            r2.A0()
            return
        L_0x0327:
            r23 = r5
            r5 = 0
        L_0x032a:
            java.lang.String r6 = r2.f10563b     // Catch:{ all -> 0x093d }
            boolean r6 = com.google.android.gms.measurement.internal.zzkr.d0(r6)     // Catch:{ all -> 0x093d }
            java.lang.String r7 = r2.f10563b     // Catch:{ all -> 0x093d }
            boolean r18 = r14.equals(r7)     // Catch:{ all -> 0x093d }
            boolean r7 = com.google.android.gms.internal.measurement.zzjw.b()     // Catch:{ all -> 0x093d }
            r19 = 1
            if (r7 == 0) goto L_0x035d
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzy r7 = r7.x()     // Catch:{ all -> 0x093d }
            java.lang.String r8 = r3.f10709b     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.zzaq.F0     // Catch:{ all -> 0x093d }
            boolean r7 = r7.C(r8, r9)     // Catch:{ all -> 0x093d }
            if (r7 == 0) goto L_0x035d
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i     // Catch:{ all -> 0x093d }
            r7.G()     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzan r7 = r2.f10564c     // Catch:{ all -> 0x093d }
            long r7 = com.google.android.gms.measurement.internal.zzkr.y(r7)     // Catch:{ all -> 0x093d }
            long r7 = r7 + r19
            r11 = r7
            goto L_0x035f
        L_0x035d:
            r11 = r19
        L_0x035f:
            com.google.android.gms.measurement.internal.c r7 = r26.V()     // Catch:{ all -> 0x093d }
            long r8 = r26.k0()     // Catch:{ all -> 0x093d }
            r13 = 1
            r16 = 0
            r17 = 0
            r10 = r15
            r14 = r6
            r27 = r15
            r15 = r16
            r16 = r18
            com.google.android.gms.measurement.internal.zzac r7 = r7.B(r8, r10, r11, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x093d }
            long r8 = r7.f10548b     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzen<java.lang.Integer> r10 = com.google.android.gms.measurement.internal.zzaq.k     // Catch:{ all -> 0x093d }
            r14 = 0
            java.lang.Object r10 = r10.a(r14)     // Catch:{ all -> 0x093d }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x093d }
            int r10 = r10.intValue()     // Catch:{ all -> 0x093d }
            long r10 = (long) r10     // Catch:{ all -> 0x093d }
            long r8 = r8 - r10
            r10 = 1000(0x3e8, double:4.94E-321)
            r12 = 0
            int r15 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r15 <= 0) goto L_0x03be
            long r8 = r8 % r10
            int r2 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r2 != 0) goto L_0x03af
            com.google.android.gms.measurement.internal.zzfy r2 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzeu r2 = r2.h()     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzew r2 = r2.G()     // Catch:{ all -> 0x093d }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeu.x(r27)     // Catch:{ all -> 0x093d }
            long r5 = r7.f10548b     // Catch:{ all -> 0x093d }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x093d }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x093d }
        L_0x03af:
            com.google.android.gms.measurement.internal.c r2 = r26.V()     // Catch:{ all -> 0x093d }
            r2.v()     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.c r2 = r26.V()
            r2.A0()
            return
        L_0x03be:
            if (r6 == 0) goto L_0x0413
            long r8 = r7.f10547a     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzen<java.lang.Integer> r15 = com.google.android.gms.measurement.internal.zzaq.m     // Catch:{ all -> 0x093d }
            java.lang.Object r15 = r15.a(r14)     // Catch:{ all -> 0x093d }
            java.lang.Integer r15 = (java.lang.Integer) r15     // Catch:{ all -> 0x093d }
            int r15 = r15.intValue()     // Catch:{ all -> 0x093d }
            long r14 = (long) r15     // Catch:{ all -> 0x093d }
            long r8 = r8 - r14
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x0413
            long r8 = r8 % r10
            int r3 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r3 != 0) goto L_0x03f2
            com.google.android.gms.measurement.internal.zzfy r3 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzeu r3 = r3.h()     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzew r3 = r3.G()     // Catch:{ all -> 0x093d }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzeu.x(r27)     // Catch:{ all -> 0x093d }
            long r6 = r7.f10547a     // Catch:{ all -> 0x093d }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x093d }
            r3.c(r4, r5, r6)     // Catch:{ all -> 0x093d }
        L_0x03f2:
            com.google.android.gms.measurement.internal.zzfy r3 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzkr r7 = r3.G()     // Catch:{ all -> 0x093d }
            r9 = 16
            java.lang.String r10 = "_ev"
            java.lang.String r11 = r2.f10563b     // Catch:{ all -> 0x093d }
            r12 = 0
            r8 = r27
            r7.W(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.c r2 = r26.V()     // Catch:{ all -> 0x093d }
            r2.v()     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.c r2 = r26.V()
            r2.A0()
            return
        L_0x0413:
            if (r18 == 0) goto L_0x0462
            long r8 = r7.f10550d     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzfy r10 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzy r10 = r10.x()     // Catch:{ all -> 0x093d }
            java.lang.String r11 = r3.f10709b     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzen<java.lang.Integer> r14 = com.google.android.gms.measurement.internal.zzaq.l     // Catch:{ all -> 0x093d }
            int r10 = r10.v(r11, r14)     // Catch:{ all -> 0x093d }
            r11 = 1000000(0xf4240, float:1.401298E-39)
            int r10 = java.lang.Math.min(r11, r10)     // Catch:{ all -> 0x093d }
            int r10 = java.lang.Math.max(r5, r10)     // Catch:{ all -> 0x093d }
            long r10 = (long) r10     // Catch:{ all -> 0x093d }
            long r8 = r8 - r10
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x0462
            int r2 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r2 != 0) goto L_0x0453
            com.google.android.gms.measurement.internal.zzfy r2 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzeu r2 = r2.h()     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzew r2 = r2.G()     // Catch:{ all -> 0x093d }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeu.x(r27)     // Catch:{ all -> 0x093d }
            long r5 = r7.f10550d     // Catch:{ all -> 0x093d }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x093d }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x093d }
        L_0x0453:
            com.google.android.gms.measurement.internal.c r2 = r26.V()     // Catch:{ all -> 0x093d }
            r2.v()     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.c r2 = r26.V()
            r2.A0()
            return
        L_0x0462:
            com.google.android.gms.measurement.internal.zzan r7 = r2.f10564c     // Catch:{ all -> 0x093d }
            android.os.Bundle r14 = r7.B()     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzkr r7 = r7.G()     // Catch:{ all -> 0x093d }
            java.lang.String r8 = "_o"
            java.lang.String r9 = r2.f10565d     // Catch:{ all -> 0x093d }
            r7.N(r14, r8, r9)     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzkr r7 = r7.G()     // Catch:{ all -> 0x093d }
            r15 = r27
            boolean r7 = r7.D0(r15)     // Catch:{ all -> 0x093d }
            java.lang.String r11 = "_r"
            if (r7 == 0) goto L_0x04a1
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzkr r7 = r7.G()     // Catch:{ all -> 0x093d }
            java.lang.String r8 = "_dbg"
            java.lang.Long r9 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x093d }
            r7.N(r14, r8, r9)     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzkr r7 = r7.G()     // Catch:{ all -> 0x093d }
            java.lang.Long r8 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x093d }
            r7.N(r14, r11, r8)     // Catch:{ all -> 0x093d }
        L_0x04a1:
            java.lang.String r7 = "_s"
            java.lang.String r8 = r2.f10563b     // Catch:{ all -> 0x093d }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x093d }
            if (r7 == 0) goto L_0x04c8
            com.google.android.gms.measurement.internal.c r7 = r26.V()     // Catch:{ all -> 0x093d }
            java.lang.String r8 = r3.f10709b     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.s7 r7 = r7.o0(r8, r4)     // Catch:{ all -> 0x093d }
            if (r7 == 0) goto L_0x04c8
            java.lang.Object r8 = r7.f10428e     // Catch:{ all -> 0x093d }
            boolean r8 = r8 instanceof java.lang.Long     // Catch:{ all -> 0x093d }
            if (r8 == 0) goto L_0x04c8
            com.google.android.gms.measurement.internal.zzfy r8 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzkr r8 = r8.G()     // Catch:{ all -> 0x093d }
            java.lang.Object r7 = r7.f10428e     // Catch:{ all -> 0x093d }
            r8.N(r14, r4, r7)     // Catch:{ all -> 0x093d }
        L_0x04c8:
            com.google.android.gms.measurement.internal.c r4 = r26.V()     // Catch:{ all -> 0x093d }
            long r7 = r4.n0(r15)     // Catch:{ all -> 0x093d }
            int r4 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x04eb
            com.google.android.gms.measurement.internal.zzfy r4 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzeu r4 = r4.h()     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzew r4 = r4.J()     // Catch:{ all -> 0x093d }
            java.lang.String r9 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzeu.x(r15)     // Catch:{ all -> 0x093d }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x093d }
            r4.c(r9, r10, r7)     // Catch:{ all -> 0x093d }
        L_0x04eb:
            com.google.android.gms.measurement.internal.zzal r4 = new com.google.android.gms.measurement.internal.zzal     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzfy r8 = r1.i     // Catch:{ all -> 0x093d }
            java.lang.String r9 = r2.f10565d     // Catch:{ all -> 0x093d }
            java.lang.String r10 = r2.f10563b     // Catch:{ all -> 0x093d }
            long r12 = r2.f10566e     // Catch:{ all -> 0x093d }
            r18 = 0
            r7 = r4
            r2 = r10
            r10 = r15
            r5 = r11
            r11 = r2
            r16 = r14
            r2 = r15
            r25 = 0
            r14 = r18
            r7.<init>((com.google.android.gms.measurement.internal.zzfy) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (long) r12, (long) r14, (android.os.Bundle) r16)     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.c r7 = r26.V()     // Catch:{ all -> 0x093d }
            java.lang.String r8 = r4.f10557b     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.h r7 = r7.D(r2, r8)     // Catch:{ all -> 0x093d }
            if (r7 != 0) goto L_0x0589
            com.google.android.gms.measurement.internal.c r7 = r26.V()     // Catch:{ all -> 0x093d }
            long r7 = r7.y0(r2)     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzfy r9 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzy r9 = r9.x()     // Catch:{ all -> 0x093d }
            int r9 = r9.u(r2)     // Catch:{ all -> 0x093d }
            long r9 = (long) r9     // Catch:{ all -> 0x093d }
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x056f
            if (r6 == 0) goto L_0x056f
            com.google.android.gms.measurement.internal.zzfy r3 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzeu r3 = r3.h()     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzew r3 = r3.G()     // Catch:{ all -> 0x093d }
            java.lang.String r5 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzeu.x(r2)     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzes r7 = r7.H()     // Catch:{ all -> 0x093d }
            java.lang.String r4 = r4.f10557b     // Catch:{ all -> 0x093d }
            java.lang.String r4 = r7.w(r4)     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzy r7 = r7.x()     // Catch:{ all -> 0x093d }
            int r7 = r7.u(r2)     // Catch:{ all -> 0x093d }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x093d }
            r3.d(r5, r6, r4, r7)     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzfy r3 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzkr r7 = r3.G()     // Catch:{ all -> 0x093d }
            r9 = 8
            r10 = 0
            r11 = 0
            r12 = 0
            r8 = r2
            r7.W(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.c r2 = r26.V()
            r2.A0()
            return
        L_0x056f:
            com.google.android.gms.measurement.internal.h r6 = new com.google.android.gms.measurement.internal.h     // Catch:{ all -> 0x093d }
            java.lang.String r9 = r4.f10557b     // Catch:{ all -> 0x093d }
            r10 = 0
            r12 = 0
            long r14 = r4.f10559d     // Catch:{ all -> 0x093d }
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r7 = r6
            r8 = r2
            r7.<init>(r8, r9, r10, r12, r14, r16, r18, r19, r20, r21)     // Catch:{ all -> 0x093d }
            goto L_0x0597
        L_0x0589:
            com.google.android.gms.measurement.internal.zzfy r2 = r1.i     // Catch:{ all -> 0x093d }
            long r8 = r7.f10217f     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzal r4 = r4.a(r2, r8)     // Catch:{ all -> 0x093d }
            long r8 = r4.f10559d     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.h r6 = r7.a(r8)     // Catch:{ all -> 0x093d }
        L_0x0597:
            com.google.android.gms.measurement.internal.c r2 = r26.V()     // Catch:{ all -> 0x093d }
            r2.M(r6)     // Catch:{ all -> 0x093d }
            r26.j0()     // Catch:{ all -> 0x093d }
            r26.c0()     // Catch:{ all -> 0x093d }
            com.google.android.gms.common.internal.Preconditions.k(r4)     // Catch:{ all -> 0x093d }
            com.google.android.gms.common.internal.Preconditions.k(r28)     // Catch:{ all -> 0x093d }
            java.lang.String r2 = r4.f10556a     // Catch:{ all -> 0x093d }
            com.google.android.gms.common.internal.Preconditions.g(r2)     // Catch:{ all -> 0x093d }
            java.lang.String r2 = r4.f10556a     // Catch:{ all -> 0x093d }
            java.lang.String r6 = r3.f10709b     // Catch:{ all -> 0x093d }
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x093d }
            com.google.android.gms.common.internal.Preconditions.a(r2)     // Catch:{ all -> 0x093d }
            com.google.android.gms.internal.measurement.zzcb$zzg$zza r2 = com.google.android.gms.internal.measurement.zzcb.zzg.N0()     // Catch:{ all -> 0x093d }
            r6 = 1
            r2.C(r6)     // Catch:{ all -> 0x093d }
            java.lang.String r7 = "android"
            r2.P(r7)     // Catch:{ all -> 0x093d }
            java.lang.String r7 = r3.f10709b     // Catch:{ all -> 0x093d }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x093d }
            if (r7 != 0) goto L_0x05d4
            java.lang.String r7 = r3.f10709b     // Catch:{ all -> 0x093d }
            r2.o0(r7)     // Catch:{ all -> 0x093d }
        L_0x05d4:
            java.lang.String r7 = r3.f10712e     // Catch:{ all -> 0x093d }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x093d }
            if (r7 != 0) goto L_0x05e1
            java.lang.String r7 = r3.f10712e     // Catch:{ all -> 0x093d }
            r2.k0(r7)     // Catch:{ all -> 0x093d }
        L_0x05e1:
            java.lang.String r7 = r3.f10711d     // Catch:{ all -> 0x093d }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x093d }
            if (r7 != 0) goto L_0x05ee
            java.lang.String r7 = r3.f10711d     // Catch:{ all -> 0x093d }
            r2.s0(r7)     // Catch:{ all -> 0x093d }
        L_0x05ee:
            long r7 = r3.k     // Catch:{ all -> 0x093d }
            r9 = -2147483648(0xffffffff80000000, double:NaN)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x05fd
            long r7 = r3.k     // Catch:{ all -> 0x093d }
            int r8 = (int) r7     // Catch:{ all -> 0x093d }
            r2.u0(r8)     // Catch:{ all -> 0x093d }
        L_0x05fd:
            long r7 = r3.f10713f     // Catch:{ all -> 0x093d }
            r2.n0(r7)     // Catch:{ all -> 0x093d }
            java.lang.String r7 = r3.f10710c     // Catch:{ all -> 0x093d }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x093d }
            if (r7 != 0) goto L_0x060f
            java.lang.String r7 = r3.f10710c     // Catch:{ all -> 0x093d }
            r2.G0(r7)     // Catch:{ all -> 0x093d }
        L_0x060f:
            boolean r7 = com.google.android.gms.internal.measurement.zzlm.b()     // Catch:{ all -> 0x093d }
            if (r7 == 0) goto L_0x065e
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzy r7 = r7.x()     // Catch:{ all -> 0x093d }
            java.lang.String r8 = r3.f10709b     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.zzaq.o0     // Catch:{ all -> 0x093d }
            boolean r7 = r7.C(r8, r9)     // Catch:{ all -> 0x093d }
            if (r7 == 0) goto L_0x065e
            java.lang.String r7 = r2.J0()     // Catch:{ all -> 0x093d }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x093d }
            if (r7 == 0) goto L_0x063c
            java.lang.String r7 = r3.w     // Catch:{ all -> 0x093d }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x093d }
            if (r7 != 0) goto L_0x063c
            java.lang.String r7 = r3.w     // Catch:{ all -> 0x093d }
            r2.Q0(r7)     // Catch:{ all -> 0x093d }
        L_0x063c:
            java.lang.String r7 = r2.J0()     // Catch:{ all -> 0x093d }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x093d }
            if (r7 == 0) goto L_0x0675
            java.lang.String r7 = r2.P0()     // Catch:{ all -> 0x093d }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x093d }
            if (r7 == 0) goto L_0x0675
            java.lang.String r7 = r3.s     // Catch:{ all -> 0x093d }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x093d }
            if (r7 != 0) goto L_0x0675
            java.lang.String r7 = r3.s     // Catch:{ all -> 0x093d }
            r2.O0(r7)     // Catch:{ all -> 0x093d }
            goto L_0x0675
        L_0x065e:
            java.lang.String r7 = r2.J0()     // Catch:{ all -> 0x093d }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x093d }
            if (r7 == 0) goto L_0x0675
            java.lang.String r7 = r3.s     // Catch:{ all -> 0x093d }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x093d }
            if (r7 != 0) goto L_0x0675
            java.lang.String r7 = r3.s     // Catch:{ all -> 0x093d }
            r2.O0(r7)     // Catch:{ all -> 0x093d }
        L_0x0675:
            long r7 = r3.g     // Catch:{ all -> 0x093d }
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0682
            long r7 = r3.g     // Catch:{ all -> 0x093d }
            r2.v0(r7)     // Catch:{ all -> 0x093d }
        L_0x0682:
            long r7 = r3.u     // Catch:{ all -> 0x093d }
            r2.F0(r7)     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzy r7 = r7.x()     // Catch:{ all -> 0x093d }
            java.lang.String r8 = r3.f10709b     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.zzaq.X     // Catch:{ all -> 0x093d }
            boolean r7 = r7.C(r8, r11)     // Catch:{ all -> 0x093d }
            if (r7 == 0) goto L_0x06a4
            com.google.android.gms.measurement.internal.zzkn r7 = r26.Z()     // Catch:{ all -> 0x093d }
            java.util.List r7 = r7.Y()     // Catch:{ all -> 0x093d }
            if (r7 == 0) goto L_0x06a4
            r2.d0(r7)     // Catch:{ all -> 0x093d }
        L_0x06a4:
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.q3 r7 = r7.A()     // Catch:{ all -> 0x093d }
            java.lang.String r8 = r3.f10709b     // Catch:{ all -> 0x093d }
            android.util.Pair r7 = r7.u(r8)     // Catch:{ all -> 0x093d }
            if (r7 == 0) goto L_0x06d7
            java.lang.Object r8 = r7.first     // Catch:{ all -> 0x093d }
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ all -> 0x093d }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x093d }
            if (r8 != 0) goto L_0x06d7
            boolean r8 = r3.p     // Catch:{ all -> 0x093d }
            if (r8 == 0) goto L_0x0739
            java.lang.Object r8 = r7.first     // Catch:{ all -> 0x093d }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x093d }
            r2.w0(r8)     // Catch:{ all -> 0x093d }
            java.lang.Object r8 = r7.second     // Catch:{ all -> 0x093d }
            if (r8 == 0) goto L_0x0739
            java.lang.Object r7 = r7.second     // Catch:{ all -> 0x093d }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x093d }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x093d }
            r2.Q(r7)     // Catch:{ all -> 0x093d }
            goto L_0x0739
        L_0x06d7:
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzai r7 = r7.Q()     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzfy r8 = r1.i     // Catch:{ all -> 0x093d }
            android.content.Context r8 = r8.f()     // Catch:{ all -> 0x093d }
            boolean r7 = r7.u(r8)     // Catch:{ all -> 0x093d }
            if (r7 != 0) goto L_0x0739
            boolean r7 = r3.q     // Catch:{ all -> 0x093d }
            if (r7 == 0) goto L_0x0739
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i     // Catch:{ all -> 0x093d }
            android.content.Context r7 = r7.f()     // Catch:{ all -> 0x093d }
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch:{ all -> 0x093d }
            java.lang.String r8 = "android_id"
            java.lang.String r7 = android.provider.Settings.Secure.getString(r7, r8)     // Catch:{ all -> 0x093d }
            if (r7 != 0) goto L_0x0719
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzeu r7 = r7.h()     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzew r7 = r7.J()     // Catch:{ all -> 0x093d }
            java.lang.String r8 = "null secure ID. appId"
            java.lang.String r11 = r2.D0()     // Catch:{ all -> 0x093d }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzeu.x(r11)     // Catch:{ all -> 0x093d }
            r7.b(r8, r11)     // Catch:{ all -> 0x093d }
            java.lang.String r7 = "null"
            goto L_0x0736
        L_0x0719:
            boolean r8 = r7.isEmpty()     // Catch:{ all -> 0x093d }
            if (r8 == 0) goto L_0x0736
            com.google.android.gms.measurement.internal.zzfy r8 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzeu r8 = r8.h()     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzew r8 = r8.J()     // Catch:{ all -> 0x093d }
            java.lang.String r11 = "empty secure ID. appId"
            java.lang.String r12 = r2.D0()     // Catch:{ all -> 0x093d }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzeu.x(r12)     // Catch:{ all -> 0x093d }
            r8.b(r11, r12)     // Catch:{ all -> 0x093d }
        L_0x0736:
            r2.L0(r7)     // Catch:{ all -> 0x093d }
        L_0x0739:
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzai r7 = r7.Q()     // Catch:{ all -> 0x093d }
            r7.p()     // Catch:{ all -> 0x093d }
            java.lang.String r7 = android.os.Build.MODEL     // Catch:{ all -> 0x093d }
            r2.b0(r7)     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzai r7 = r7.Q()     // Catch:{ all -> 0x093d }
            r7.p()     // Catch:{ all -> 0x093d }
            java.lang.String r7 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x093d }
            r2.V(r7)     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzai r7 = r7.Q()     // Catch:{ all -> 0x093d }
            long r7 = r7.v()     // Catch:{ all -> 0x093d }
            int r8 = (int) r7     // Catch:{ all -> 0x093d }
            r2.m0(r8)     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzai r7 = r7.Q()     // Catch:{ all -> 0x093d }
            java.lang.String r7 = r7.w()     // Catch:{ all -> 0x093d }
            r2.e0(r7)     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzy r7 = r7.x()     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.zzaq.M0     // Catch:{ all -> 0x093d }
            boolean r7 = r7.t(r8)     // Catch:{ all -> 0x093d }
            if (r7 != 0) goto L_0x0783
            long r7 = r3.m     // Catch:{ all -> 0x093d }
            r2.B0(r7)     // Catch:{ all -> 0x093d }
        L_0x0783:
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i     // Catch:{ all -> 0x093d }
            boolean r7 = r7.p()     // Catch:{ all -> 0x093d }
            if (r7 == 0) goto L_0x0799
            r2.D0()     // Catch:{ all -> 0x093d }
            boolean r7 = android.text.TextUtils.isEmpty(r25)     // Catch:{ all -> 0x093d }
            if (r7 != 0) goto L_0x0799
            r7 = r25
            r2.N0(r7)     // Catch:{ all -> 0x093d }
        L_0x0799:
            com.google.android.gms.measurement.internal.c r7 = r26.V()     // Catch:{ all -> 0x093d }
            java.lang.String r8 = r3.f10709b     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.k3 r7 = r7.j0(r8)     // Catch:{ all -> 0x093d }
            if (r7 != 0) goto L_0x081a
            com.google.android.gms.measurement.internal.k3 r7 = new com.google.android.gms.measurement.internal.k3     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzfy r8 = r1.i     // Catch:{ all -> 0x093d }
            java.lang.String r11 = r3.f10709b     // Catch:{ all -> 0x093d }
            r7.<init>(r8, r11)     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzfy r8 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzkr r8 = r8.G()     // Catch:{ all -> 0x093d }
            java.lang.String r8 = r8.N0()     // Catch:{ all -> 0x093d }
            r7.c(r8)     // Catch:{ all -> 0x093d }
            java.lang.String r8 = r3.l     // Catch:{ all -> 0x093d }
            r7.F(r8)     // Catch:{ all -> 0x093d }
            java.lang.String r8 = r3.f10710c     // Catch:{ all -> 0x093d }
            r7.r(r8)     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzfy r8 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.q3 r8 = r8.A()     // Catch:{ all -> 0x093d }
            java.lang.String r11 = r3.f10709b     // Catch:{ all -> 0x093d }
            java.lang.String r8 = r8.x(r11)     // Catch:{ all -> 0x093d }
            r7.C(r8)     // Catch:{ all -> 0x093d }
            r7.H(r9)     // Catch:{ all -> 0x093d }
            r7.a(r9)     // Catch:{ all -> 0x093d }
            r7.q(r9)     // Catch:{ all -> 0x093d }
            java.lang.String r8 = r3.f10711d     // Catch:{ all -> 0x093d }
            r7.I(r8)     // Catch:{ all -> 0x093d }
            long r11 = r3.k     // Catch:{ all -> 0x093d }
            r7.u(r11)     // Catch:{ all -> 0x093d }
            java.lang.String r8 = r3.f10712e     // Catch:{ all -> 0x093d }
            r7.L(r8)     // Catch:{ all -> 0x093d }
            long r11 = r3.f10713f     // Catch:{ all -> 0x093d }
            r7.y(r11)     // Catch:{ all -> 0x093d }
            long r11 = r3.g     // Catch:{ all -> 0x093d }
            r7.B(r11)     // Catch:{ all -> 0x093d }
            boolean r8 = r3.i     // Catch:{ all -> 0x093d }
            r7.e(r8)     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzfy r8 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzy r8 = r8.x()     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.zzaq.M0     // Catch:{ all -> 0x093d }
            boolean r8 = r8.t(r11)     // Catch:{ all -> 0x093d }
            if (r8 != 0) goto L_0x080e
            long r11 = r3.m     // Catch:{ all -> 0x093d }
            r7.c0(r11)     // Catch:{ all -> 0x093d }
        L_0x080e:
            long r11 = r3.u     // Catch:{ all -> 0x093d }
            r7.E(r11)     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.c r8 = r26.V()     // Catch:{ all -> 0x093d }
            r8.N(r7)     // Catch:{ all -> 0x093d }
        L_0x081a:
            java.lang.String r8 = r7.x()     // Catch:{ all -> 0x093d }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x093d }
            if (r8 != 0) goto L_0x082b
            java.lang.String r8 = r7.x()     // Catch:{ all -> 0x093d }
            r2.A0(r8)     // Catch:{ all -> 0x093d }
        L_0x082b:
            java.lang.String r8 = r7.M()     // Catch:{ all -> 0x093d }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x093d }
            if (r8 != 0) goto L_0x083c
            java.lang.String r7 = r7.M()     // Catch:{ all -> 0x093d }
            r2.I0(r7)     // Catch:{ all -> 0x093d }
        L_0x083c:
            com.google.android.gms.measurement.internal.c r7 = r26.V()     // Catch:{ all -> 0x093d }
            java.lang.String r3 = r3.f10709b     // Catch:{ all -> 0x093d }
            java.util.List r3 = r7.H(r3)     // Catch:{ all -> 0x093d }
            r11 = 0
        L_0x0847:
            int r7 = r3.size()     // Catch:{ all -> 0x093d }
            if (r11 >= r7) goto L_0x087c
            com.google.android.gms.internal.measurement.zzcb$zzk$zza r7 = com.google.android.gms.internal.measurement.zzcb.zzk.a0()     // Catch:{ all -> 0x093d }
            java.lang.Object r8 = r3.get(r11)     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.s7 r8 = (com.google.android.gms.measurement.internal.s7) r8     // Catch:{ all -> 0x093d }
            java.lang.String r8 = r8.f10426c     // Catch:{ all -> 0x093d }
            r7.F(r8)     // Catch:{ all -> 0x093d }
            java.lang.Object r8 = r3.get(r11)     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.s7 r8 = (com.google.android.gms.measurement.internal.s7) r8     // Catch:{ all -> 0x093d }
            long r12 = r8.f10427d     // Catch:{ all -> 0x093d }
            r7.E(r12)     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzkn r8 = r26.Z()     // Catch:{ all -> 0x093d }
            java.lang.Object r12 = r3.get(r11)     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.s7 r12 = (com.google.android.gms.measurement.internal.s7) r12     // Catch:{ all -> 0x093d }
            java.lang.Object r12 = r12.f10428e     // Catch:{ all -> 0x093d }
            r8.K(r7, r12)     // Catch:{ all -> 0x093d }
            r2.I(r7)     // Catch:{ all -> 0x093d }
            int r11 = r11 + 1
            goto L_0x0847
        L_0x087c:
            com.google.android.gms.measurement.internal.c r3 = r26.V()     // Catch:{ IOException -> 0x08f1 }
            com.google.android.gms.internal.measurement.zzgw r7 = r2.q()     // Catch:{ IOException -> 0x08f1 }
            com.google.android.gms.internal.measurement.zzfo r7 = (com.google.android.gms.internal.measurement.zzfo) r7     // Catch:{ IOException -> 0x08f1 }
            com.google.android.gms.internal.measurement.zzcb$zzg r7 = (com.google.android.gms.internal.measurement.zzcb.zzg) r7     // Catch:{ IOException -> 0x08f1 }
            long r2 = r3.y(r7)     // Catch:{ IOException -> 0x08f1 }
            com.google.android.gms.measurement.internal.c r7 = r26.V()     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzan r8 = r4.f10561f     // Catch:{ all -> 0x093d }
            if (r8 == 0) goto L_0x08e7
            com.google.android.gms.measurement.internal.zzan r8 = r4.f10561f     // Catch:{ all -> 0x093d }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x093d }
        L_0x089a:
            boolean r11 = r8.hasNext()     // Catch:{ all -> 0x093d }
            if (r11 == 0) goto L_0x08ae
            java.lang.Object r11 = r8.next()     // Catch:{ all -> 0x093d }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x093d }
            boolean r11 = r5.equals(r11)     // Catch:{ all -> 0x093d }
            if (r11 == 0) goto L_0x089a
        L_0x08ac:
            r11 = 1
            goto L_0x08e8
        L_0x08ae:
            com.google.android.gms.measurement.internal.zzfs r5 = r26.R()     // Catch:{ all -> 0x093d }
            java.lang.String r8 = r4.f10556a     // Catch:{ all -> 0x093d }
            java.lang.String r11 = r4.f10557b     // Catch:{ all -> 0x093d }
            boolean r5 = r5.D(r8, r11)     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.c r11 = r26.V()     // Catch:{ all -> 0x093d }
            long r12 = r26.k0()     // Catch:{ all -> 0x093d }
            java.lang.String r14 = r4.f10556a     // Catch:{ all -> 0x093d }
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            com.google.android.gms.measurement.internal.zzac r8 = r11.C(r12, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x093d }
            if (r5 == 0) goto L_0x08e7
            long r11 = r8.f10551e     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzfy r5 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzy r5 = r5.x()     // Catch:{ all -> 0x093d }
            java.lang.String r8 = r4.f10556a     // Catch:{ all -> 0x093d }
            int r5 = r5.x(r8)     // Catch:{ all -> 0x093d }
            long r13 = (long) r5     // Catch:{ all -> 0x093d }
            int r5 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x08e7
            goto L_0x08ac
        L_0x08e7:
            r11 = 0
        L_0x08e8:
            boolean r2 = r7.R(r4, r2, r11)     // Catch:{ all -> 0x093d }
            if (r2 == 0) goto L_0x090a
            r1.l = r9     // Catch:{ all -> 0x093d }
            goto L_0x090a
        L_0x08f1:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.zzfy r4 = r1.i     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzeu r4 = r4.h()     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.zzew r4 = r4.G()     // Catch:{ all -> 0x093d }
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.D0()     // Catch:{ all -> 0x093d }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzeu.x(r2)     // Catch:{ all -> 0x093d }
            r4.c(r5, r2, r3)     // Catch:{ all -> 0x093d }
        L_0x090a:
            com.google.android.gms.measurement.internal.c r2 = r26.V()     // Catch:{ all -> 0x093d }
            r2.v()     // Catch:{ all -> 0x093d }
            com.google.android.gms.measurement.internal.c r2 = r26.V()
            r2.A0()
            r26.m0()
            com.google.android.gms.measurement.internal.zzfy r2 = r1.i
            com.google.android.gms.measurement.internal.zzeu r2 = r2.h()
            com.google.android.gms.measurement.internal.zzew r2 = r2.O()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r23
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.b(r4, r3)
            return
        L_0x093d:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.c r3 = r26.V()
            r3.A0()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkj.S(com.google.android.gms.measurement.internal.zzao, com.google.android.gms.measurement.internal.zzn):void");
    }

    private final boolean W(zzn zzn) {
        return (!zzlm.b() || !this.i.x().C(zzn.f10709b, zzaq.o0)) ? !TextUtils.isEmpty(zzn.f10710c) || !TextUtils.isEmpty(zzn.s) : !TextUtils.isEmpty(zzn.f10710c) || !TextUtils.isEmpty(zzn.w) || !TextUtils.isEmpty(zzn.s);
    }

    @VisibleForTesting
    private final int a(FileChannel fileChannel) {
        j0();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.i.h().G().a("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    this.i.h().J().b("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            return allocate.getInt();
        } catch (IOException e2) {
            this.i.h().G().b("Failed to read from channel", e2);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x018d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.measurement.internal.k3 b(com.google.android.gms.measurement.internal.zzn r9, com.google.android.gms.measurement.internal.k3 r10, java.lang.String r11) {
        /*
            r8 = this;
            r0 = 1
            if (r10 != 0) goto L_0x001e
            com.google.android.gms.measurement.internal.k3 r10 = new com.google.android.gms.measurement.internal.k3
            com.google.android.gms.measurement.internal.zzfy r1 = r8.i
            java.lang.String r2 = r9.f10709b
            r10.<init>(r1, r2)
            com.google.android.gms.measurement.internal.zzfy r1 = r8.i
            com.google.android.gms.measurement.internal.zzkr r1 = r1.G()
            java.lang.String r1 = r1.N0()
            r10.c(r1)
            r10.C(r11)
        L_0x001c:
            r11 = 1
            goto L_0x003a
        L_0x001e:
            java.lang.String r1 = r10.J()
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto L_0x0039
            r10.C(r11)
            com.google.android.gms.measurement.internal.zzfy r11 = r8.i
            com.google.android.gms.measurement.internal.zzkr r11 = r11.G()
            java.lang.String r11 = r11.N0()
            r10.c(r11)
            goto L_0x001c
        L_0x0039:
            r11 = 0
        L_0x003a:
            java.lang.String r1 = r9.f10710c
            java.lang.String r2 = r10.A()
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x004c
            java.lang.String r11 = r9.f10710c
            r10.r(r11)
            r11 = 1
        L_0x004c:
            java.lang.String r1 = r9.s
            java.lang.String r2 = r10.D()
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x005e
            java.lang.String r11 = r9.s
            r10.v(r11)
            r11 = 1
        L_0x005e:
            boolean r1 = com.google.android.gms.internal.measurement.zzlm.b()
            if (r1 == 0) goto L_0x0088
            com.google.android.gms.measurement.internal.zzfy r1 = r8.i
            com.google.android.gms.measurement.internal.zzy r1 = r1.x()
            java.lang.String r2 = r10.t()
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.zzaq.o0
            boolean r1 = r1.C(r2, r3)
            if (r1 == 0) goto L_0x0088
            java.lang.String r1 = r9.w
            java.lang.String r2 = r10.G()
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x0088
            java.lang.String r11 = r9.w
            r10.z(r11)
            r11 = 1
        L_0x0088:
            java.lang.String r1 = r9.l
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00a2
            java.lang.String r1 = r9.l
            java.lang.String r2 = r10.M()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00a2
            java.lang.String r11 = r9.l
            r10.F(r11)
            r11 = 1
        L_0x00a2:
            long r1 = r9.f10713f
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00b8
            long r5 = r10.Z()
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00b8
            long r1 = r9.f10713f
            r10.y(r1)
            r11 = 1
        L_0x00b8:
            java.lang.String r1 = r9.f10711d
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00d2
            java.lang.String r1 = r9.f10711d
            java.lang.String r2 = r10.T()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00d2
            java.lang.String r11 = r9.f10711d
            r10.I(r11)
            r11 = 1
        L_0x00d2:
            long r1 = r9.k
            long r5 = r10.V()
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00e2
            long r1 = r9.k
            r10.u(r1)
            r11 = 1
        L_0x00e2:
            java.lang.String r1 = r9.f10712e
            if (r1 == 0) goto L_0x00f6
            java.lang.String r2 = r10.X()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00f6
            java.lang.String r11 = r9.f10712e
            r10.L(r11)
            r11 = 1
        L_0x00f6:
            long r1 = r9.g
            long r5 = r10.b0()
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0106
            long r1 = r9.g
            r10.B(r1)
            r11 = 1
        L_0x0106:
            boolean r1 = r9.i
            boolean r2 = r10.e0()
            if (r1 == r2) goto L_0x0114
            boolean r11 = r9.i
            r10.e(r11)
            r11 = 1
        L_0x0114:
            java.lang.String r1 = r9.h
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x012e
            java.lang.String r1 = r9.h
            java.lang.String r2 = r10.i()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x012e
            java.lang.String r11 = r9.h
            r10.O(r11)
            r11 = 1
        L_0x012e:
            com.google.android.gms.measurement.internal.zzfy r1 = r8.i
            com.google.android.gms.measurement.internal.zzy r1 = r1.x()
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.zzaq.M0
            boolean r1 = r1.t(r2)
            if (r1 != 0) goto L_0x014c
            long r1 = r9.m
            long r5 = r10.k()
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x014c
            long r1 = r9.m
            r10.c0(r1)
            r11 = 1
        L_0x014c:
            boolean r1 = r9.p
            boolean r2 = r10.l()
            if (r1 == r2) goto L_0x015a
            boolean r11 = r9.p
            r10.s(r11)
            r11 = 1
        L_0x015a:
            boolean r1 = r9.q
            boolean r2 = r10.m()
            if (r1 == r2) goto L_0x0168
            boolean r11 = r9.q
            r10.w(r11)
            r11 = 1
        L_0x0168:
            java.lang.Boolean r1 = r9.t
            java.lang.Boolean r2 = r10.n()
            if (r1 == r2) goto L_0x0176
            java.lang.Boolean r11 = r9.t
            r10.b(r11)
            r11 = 1
        L_0x0176:
            long r1 = r9.u
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x018a
            long r3 = r10.d0()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x018a
            long r1 = r9.u
            r10.E(r1)
            goto L_0x018b
        L_0x018a:
            r0 = r11
        L_0x018b:
            if (r0 == 0) goto L_0x0194
            com.google.android.gms.measurement.internal.c r9 = r8.V()
            r9.N(r10)
        L_0x0194:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkj.b(com.google.android.gms.measurement.internal.zzn, com.google.android.gms.measurement.internal.k3, java.lang.String):com.google.android.gms.measurement.internal.k3");
    }

    public static zzkj c(Context context) {
        Preconditions.k(context);
        Preconditions.k(context.getApplicationContext());
        if (x == null) {
            synchronized (zzkj.class) {
                if (x == null) {
                    x = new zzkj(new zzko(context));
                }
            }
        }
        return x;
    }

    private final zzn d(String str) {
        String str2 = str;
        k3 j0 = V().j0(str2);
        if (j0 == null || TextUtils.isEmpty(j0.T())) {
            this.i.h().N().b("No app data available; dropping", str2);
            return null;
        }
        Boolean I = I(j0);
        if (I == null || I.booleanValue()) {
            return new zzn(str, j0.A(), j0.T(), j0.V(), j0.X(), j0.Z(), j0.b0(), (String) null, j0.e0(), false, j0.M(), j0.k(), 0, 0, j0.l(), j0.m(), false, j0.D(), j0.n(), j0.d0(), j0.o(), (!zzlm.b() || !this.i.x().C(str2, zzaq.o0)) ? null : j0.G());
        }
        this.i.h().G().b("App version does not match; dropping. appId", zzeu.x(str));
        return null;
    }

    private final o3 h0() {
        o3 o3Var = this.f10692d;
        if (o3Var != null) {
            return o3Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    private final zzkf i0() {
        L(this.f10693e);
        return this.f10693e;
    }

    @VisibleForTesting
    private static void j(zzcb.zzc.zza zza, int i2, String str) {
        List<zzcb.zze> P = zza.P();
        int i3 = 0;
        while (i3 < P.size()) {
            if (!"_err".equals(P.get(i3).P())) {
                i3++;
            } else {
                return;
            }
        }
        zzcb.zze.zza g0 = zzcb.zze.g0();
        g0.I("_err");
        g0.E(Long.valueOf((long) i2).longValue());
        zzcb.zze.zza g02 = zzcb.zze.g0();
        g02.I("_ev");
        g02.M(str);
        zza.H((zzcb.zze) ((zzfo) g0.q()));
        zza.H((zzcb.zze) ((zzfo) g02.q()));
    }

    private final void j0() {
        this.i.g().c();
    }

    @VisibleForTesting
    private static void k(zzcb.zzc.zza zza, String str) {
        List<zzcb.zze> P = zza.P();
        for (int i2 = 0; i2 < P.size(); i2++) {
            if (str.equals(P.get(i2).P())) {
                zza.R(i2);
                return;
            }
        }
    }

    private final long k0() {
        long a2 = this.i.n().a();
        q3 A = this.i.A();
        A.p();
        A.c();
        long a3 = A.i.a();
        if (a3 == 0) {
            a3 = 1 + ((long) A.j().H0().nextInt(86400000));
            A.i.b(a3);
        }
        return ((((a2 + a3) / 1000) / 60) / 60) / 24;
    }

    private static void l(zzcb.zzg.zza zza) {
        zza.U(Long.MAX_VALUE);
        zza.Z(Long.MIN_VALUE);
        for (int i2 = 0; i2 < zza.S(); i2++) {
            zzcb.zzc T = zza.T(i2);
            if (T.Y() < zza.l0()) {
                zza.U(T.Y());
            }
            if (T.Y() > zza.p0()) {
                zza.Z(T.Y());
            }
        }
    }

    private final boolean l0() {
        j0();
        c0();
        return V().G0() || !TextUtils.isEmpty(V().x());
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m0() {
        /*
            r21 = this;
            r0 = r21
            r21.j0()
            r21.c0()
            long r1 = r0.l
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004d
            com.google.android.gms.measurement.internal.zzfy r1 = r0.i
            com.google.android.gms.common.util.Clock r1 = r1.n()
            long r1 = r1.b()
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r7 = r0.l
            long r1 = r1 - r7
            long r1 = java.lang.Math.abs(r1)
            long r5 = r5 - r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004b
            com.google.android.gms.measurement.internal.zzfy r1 = r0.i
            com.google.android.gms.measurement.internal.zzeu r1 = r1.h()
            com.google.android.gms.measurement.internal.zzew r1 = r1.O()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r1.b(r3, r2)
            com.google.android.gms.measurement.internal.o3 r1 = r21.h0()
            r1.c()
            com.google.android.gms.measurement.internal.zzkf r1 = r21.i0()
            r1.w()
            return
        L_0x004b:
            r0.l = r3
        L_0x004d:
            com.google.android.gms.measurement.internal.zzfy r1 = r0.i
            boolean r1 = r1.u()
            if (r1 == 0) goto L_0x0255
            boolean r1 = r21.l0()
            if (r1 != 0) goto L_0x005d
            goto L_0x0255
        L_0x005d:
            com.google.android.gms.measurement.internal.zzfy r1 = r0.i
            com.google.android.gms.common.util.Clock r1 = r1.n()
            long r1 = r1.a()
            com.google.android.gms.measurement.internal.zzen<java.lang.Long> r5 = com.google.android.gms.measurement.internal.zzaq.A
            r6 = 0
            java.lang.Object r5 = r5.a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.c r5 = r21.V()
            boolean r5 = r5.H0()
            if (r5 != 0) goto L_0x008f
            com.google.android.gms.measurement.internal.c r5 = r21.V()
            boolean r5 = r5.C0()
            if (r5 == 0) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            r5 = 0
            goto L_0x0090
        L_0x008f:
            r5 = 1
        L_0x0090:
            if (r5 == 0) goto L_0x00cc
            com.google.android.gms.measurement.internal.zzfy r10 = r0.i
            com.google.android.gms.measurement.internal.zzy r10 = r10.x()
            java.lang.String r10 = r10.P()
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x00bb
            java.lang.String r11 = ".none."
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00bb
            com.google.android.gms.measurement.internal.zzen<java.lang.Long> r10 = com.google.android.gms.measurement.internal.zzaq.v
            java.lang.Object r10 = r10.a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
            goto L_0x00dc
        L_0x00bb:
            com.google.android.gms.measurement.internal.zzen<java.lang.Long> r10 = com.google.android.gms.measurement.internal.zzaq.u
            java.lang.Object r10 = r10.a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
            goto L_0x00dc
        L_0x00cc:
            com.google.android.gms.measurement.internal.zzen<java.lang.Long> r10 = com.google.android.gms.measurement.internal.zzaq.t
            java.lang.Object r10 = r10.a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
        L_0x00dc:
            com.google.android.gms.measurement.internal.zzfy r12 = r0.i
            com.google.android.gms.measurement.internal.q3 r12 = r12.A()
            com.google.android.gms.measurement.internal.zzfk r12 = r12.f10375e
            long r12 = r12.a()
            com.google.android.gms.measurement.internal.zzfy r14 = r0.i
            com.google.android.gms.measurement.internal.q3 r14 = r14.A()
            com.google.android.gms.measurement.internal.zzfk r14 = r14.f10376f
            long r14 = r14.a()
            com.google.android.gms.measurement.internal.c r16 = r21.V()
            r17 = r10
            long r9 = r16.E0()
            com.google.android.gms.measurement.internal.c r11 = r21.V()
            r19 = r7
            long r6 = r11.F0()
            long r6 = java.lang.Math.max(r9, r6)
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x0113
        L_0x0110:
            r10 = r3
            goto L_0x0188
        L_0x0113:
            long r6 = r6 - r1
            long r6 = java.lang.Math.abs(r6)
            long r6 = r1 - r6
            long r12 = r12 - r1
            long r8 = java.lang.Math.abs(r12)
            long r8 = r1 - r8
            long r14 = r14 - r1
            long r10 = java.lang.Math.abs(r14)
            long r1 = r1 - r10
            long r8 = java.lang.Math.max(r8, r1)
            long r10 = r6 + r19
            if (r5 == 0) goto L_0x0139
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0139
            long r10 = java.lang.Math.min(r6, r8)
            long r10 = r10 + r17
        L_0x0139:
            com.google.android.gms.measurement.internal.zzkn r5 = r21.Z()
            r12 = r17
            boolean r5 = r5.R(r8, r12)
            if (r5 != 0) goto L_0x0147
            long r10 = r8 + r12
        L_0x0147:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0188
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0188
            r5 = 0
        L_0x0150:
            r6 = 20
            com.google.android.gms.measurement.internal.zzen<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.zzaq.C
            r8 = 0
            java.lang.Object r7 = r7.a(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r9 = 0
            int r7 = java.lang.Math.max(r9, r7)
            int r6 = java.lang.Math.min(r6, r7)
            if (r5 >= r6) goto L_0x0110
            r6 = 1
            long r6 = r6 << r5
            com.google.android.gms.measurement.internal.zzen<java.lang.Long> r12 = com.google.android.gms.measurement.internal.zzaq.B
            java.lang.Object r12 = r12.a(r8)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            long r12 = java.lang.Math.max(r3, r12)
            long r12 = r12 * r6
            long r10 = r10 + r12
            int r6 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x0185
            goto L_0x0188
        L_0x0185:
            int r5 = r5 + 1
            goto L_0x0150
        L_0x0188:
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x01aa
            com.google.android.gms.measurement.internal.zzfy r1 = r0.i
            com.google.android.gms.measurement.internal.zzeu r1 = r1.h()
            com.google.android.gms.measurement.internal.zzew r1 = r1.O()
            java.lang.String r2 = "Next upload time is 0"
            r1.a(r2)
            com.google.android.gms.measurement.internal.o3 r1 = r21.h0()
            r1.c()
            com.google.android.gms.measurement.internal.zzkf r1 = r21.i0()
            r1.w()
            return
        L_0x01aa:
            com.google.android.gms.measurement.internal.zzfb r1 = r21.T()
            boolean r1 = r1.y()
            if (r1 != 0) goto L_0x01d2
            com.google.android.gms.measurement.internal.zzfy r1 = r0.i
            com.google.android.gms.measurement.internal.zzeu r1 = r1.h()
            com.google.android.gms.measurement.internal.zzew r1 = r1.O()
            java.lang.String r2 = "No network"
            r1.a(r2)
            com.google.android.gms.measurement.internal.o3 r1 = r21.h0()
            r1.b()
            com.google.android.gms.measurement.internal.zzkf r1 = r21.i0()
            r1.w()
            return
        L_0x01d2:
            com.google.android.gms.measurement.internal.zzfy r1 = r0.i
            com.google.android.gms.measurement.internal.q3 r1 = r1.A()
            com.google.android.gms.measurement.internal.zzfk r1 = r1.g
            long r1 = r1.a()
            com.google.android.gms.measurement.internal.zzen<java.lang.Long> r5 = com.google.android.gms.measurement.internal.zzaq.r
            r6 = 0
            java.lang.Object r5 = r5.a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.zzkn r7 = r21.Z()
            boolean r7 = r7.R(r1, r5)
            if (r7 != 0) goto L_0x01fe
            long r1 = r1 + r5
            long r10 = java.lang.Math.max(r10, r1)
        L_0x01fe:
            com.google.android.gms.measurement.internal.o3 r1 = r21.h0()
            r1.c()
            com.google.android.gms.measurement.internal.zzfy r1 = r0.i
            com.google.android.gms.common.util.Clock r1 = r1.n()
            long r1 = r1.a()
            long r10 = r10 - r1
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x023a
            com.google.android.gms.measurement.internal.zzen<java.lang.Long> r1 = com.google.android.gms.measurement.internal.zzaq.w
            r2 = 0
            java.lang.Object r1 = r1.a(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r10 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.zzfy r1 = r0.i
            com.google.android.gms.measurement.internal.q3 r1 = r1.A()
            com.google.android.gms.measurement.internal.zzfk r1 = r1.f10375e
            com.google.android.gms.measurement.internal.zzfy r2 = r0.i
            com.google.android.gms.common.util.Clock r2 = r2.n()
            long r2 = r2.a()
            r1.b(r2)
        L_0x023a:
            com.google.android.gms.measurement.internal.zzfy r1 = r0.i
            com.google.android.gms.measurement.internal.zzeu r1 = r1.h()
            com.google.android.gms.measurement.internal.zzew r1 = r1.O()
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.b(r3, r2)
            com.google.android.gms.measurement.internal.zzkf r1 = r21.i0()
            r1.v(r10)
            return
        L_0x0255:
            com.google.android.gms.measurement.internal.zzfy r1 = r0.i
            com.google.android.gms.measurement.internal.zzeu r1 = r1.h()
            com.google.android.gms.measurement.internal.zzew r1 = r1.O()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.a(r2)
            com.google.android.gms.measurement.internal.o3 r1 = r21.h0()
            r1.c()
            com.google.android.gms.measurement.internal.zzkf r1 = r21.i0()
            r1.w()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkj.m0():void");
    }

    @VisibleForTesting
    private final void o(zzcb.zzg.zza zza, long j2, boolean z) {
        s7 s7Var;
        String str = z ? "_se" : "_lte";
        s7 o0 = V().o0(zza.D0(), str);
        if (o0 == null || o0.f10428e == null) {
            s7Var = new s7(zza.D0(), "auto", str, this.i.n().a(), Long.valueOf(j2));
        } else {
            s7Var = new s7(zza.D0(), "auto", str, this.i.n().a(), Long.valueOf(((Long) o0.f10428e).longValue() + j2));
        }
        zzcb.zzk.zza a0 = zzcb.zzk.a0();
        a0.F(str);
        a0.E(this.i.n().a());
        a0.I(((Long) s7Var.f10428e).longValue());
        zzcb.zzk zzk = (zzcb.zzk) ((zzfo) a0.q());
        boolean z2 = false;
        int v2 = zzkn.v(zza, str);
        if (v2 >= 0) {
            zza.E(v2, zzk);
            z2 = true;
        }
        if (!z2) {
            zza.L(zzk);
        }
        if (j2 > 0) {
            V().S(s7Var);
            this.i.h().O().c("Updated engagement user property. scope, value", z ? "session-scoped" : "lifetime", s7Var.f10428e);
        }
    }

    private final void r(k3 k3Var) {
        a.e.a aVar;
        j0();
        if (!zzlm.b() || !this.i.x().C(k3Var.t(), zzaq.o0)) {
            if (TextUtils.isEmpty(k3Var.A()) && TextUtils.isEmpty(k3Var.D())) {
                A(k3Var.t(), 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
                return;
            }
        } else if (TextUtils.isEmpty(k3Var.A()) && TextUtils.isEmpty(k3Var.G()) && TextUtils.isEmpty(k3Var.D())) {
            A(k3Var.t(), 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
            return;
        }
        String r2 = this.i.x().r(k3Var);
        try {
            URL url = new URL(r2);
            this.i.h().O().b("Fetching remote configuration", k3Var.t());
            zzby.zzb v2 = R().v(k3Var.t());
            String A = R().A(k3Var.t());
            if (v2 == null || TextUtils.isEmpty(A)) {
                aVar = null;
            } else {
                a.e.a aVar2 = new a.e.a();
                aVar2.put("If-Modified-Since", A);
                aVar = aVar2;
            }
            this.p = true;
            zzfb T = T();
            String t2 = k3Var.t();
            p7 p7Var = new p7(this);
            T.c();
            T.s();
            Preconditions.k(url);
            Preconditions.k(p7Var);
            T.g().C(new p3(T, t2, url, (byte[]) null, aVar, p7Var));
        } catch (MalformedURLException unused) {
            this.i.h().G().c("Failed to parse config URL. Not fetching. appId", zzeu.x(k3Var.t()), r2);
        }
    }

    /* access modifiers changed from: private */
    public final void u(zzko zzko) {
        this.i.g().c();
        c cVar = new c(this);
        cVar.t();
        this.f10691c = cVar;
        this.i.x().s(this.f10689a);
        w7 w7Var = new w7(this);
        w7Var.t();
        this.f10694f = w7Var;
        u5 u5Var = new u5(this);
        u5Var.t();
        this.h = u5Var;
        zzkf zzkf = new zzkf(this);
        zzkf.t();
        this.f10693e = zzkf;
        this.f10692d = new o3(this);
        if (this.n != this.o) {
            this.i.h().G().c("Not all upload components initialized", Integer.valueOf(this.n), Integer.valueOf(this.o));
        }
        this.j = true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013a A[Catch:{ all -> 0x018d, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014a A[Catch:{ all -> 0x018d, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0172 A[Catch:{ all -> 0x018d, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0176 A[Catch:{ all -> 0x018d, all -> 0x0196 }] */
    @com.google.android.gms.common.util.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            r6 = this;
            r6.j0()
            r6.c0()
            com.google.android.gms.common.internal.Preconditions.g(r7)
            r0 = 0
            if (r10 != 0) goto L_0x000e
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x0196 }
        L_0x000e:
            com.google.android.gms.measurement.internal.zzfy r1 = r6.i     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzeu r1 = r1.h()     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzew r1 = r1.O()     // Catch:{ all -> 0x0196 }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r10.length     // Catch:{ all -> 0x0196 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0196 }
            r1.b(r2, r3)     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.c r1 = r6.V()     // Catch:{ all -> 0x0196 }
            r1.v0()     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.c r1 = r6.V()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.k3 r1 = r1.j0(r7)     // Catch:{ all -> 0x018d }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 304(0x130, float:4.26E-43)
            r4 = 1
            if (r8 == r2) goto L_0x003e
            r2 = 204(0xcc, float:2.86E-43)
            if (r8 == r2) goto L_0x003e
            if (r8 != r3) goto L_0x0042
        L_0x003e:
            if (r9 != 0) goto L_0x0042
            r2 = 1
            goto L_0x0043
        L_0x0042:
            r2 = 0
        L_0x0043:
            if (r1 != 0) goto L_0x005a
            com.google.android.gms.measurement.internal.zzfy r8 = r6.i     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzeu r8 = r8.h()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzew r8 = r8.J()     // Catch:{ all -> 0x018d }
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzeu.x(r7)     // Catch:{ all -> 0x018d }
            r8.b(r9, r7)     // Catch:{ all -> 0x018d }
            goto L_0x0179
        L_0x005a:
            r5 = 404(0x194, float:5.66E-43)
            if (r2 != 0) goto L_0x00ca
            if (r8 != r5) goto L_0x0061
            goto L_0x00ca
        L_0x0061:
            com.google.android.gms.measurement.internal.zzfy r10 = r6.i     // Catch:{ all -> 0x018d }
            com.google.android.gms.common.util.Clock r10 = r10.n()     // Catch:{ all -> 0x018d }
            long r10 = r10.a()     // Catch:{ all -> 0x018d }
            r1.N(r10)     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.c r10 = r6.V()     // Catch:{ all -> 0x018d }
            r10.N(r1)     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzfy r10 = r6.i     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzeu r10 = r10.h()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzew r10 = r10.O()     // Catch:{ all -> 0x018d }
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x018d }
            r10.c(r11, r1, r9)     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzfs r9 = r6.R()     // Catch:{ all -> 0x018d }
            r9.C(r7)     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzfy r7 = r6.i     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.q3 r7 = r7.A()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzfk r7 = r7.f10376f     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzfy r9 = r6.i     // Catch:{ all -> 0x018d }
            com.google.android.gms.common.util.Clock r9 = r9.n()     // Catch:{ all -> 0x018d }
            long r9 = r9.a()     // Catch:{ all -> 0x018d }
            r7.b(r9)     // Catch:{ all -> 0x018d }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto L_0x00ae
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r4 = 0
        L_0x00ae:
            if (r4 == 0) goto L_0x00c5
            com.google.android.gms.measurement.internal.zzfy r7 = r6.i     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.q3 r7 = r7.A()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzfk r7 = r7.g     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzfy r8 = r6.i     // Catch:{ all -> 0x018d }
            com.google.android.gms.common.util.Clock r8 = r8.n()     // Catch:{ all -> 0x018d }
            long r8 = r8.a()     // Catch:{ all -> 0x018d }
            r7.b(r8)     // Catch:{ all -> 0x018d }
        L_0x00c5:
            r6.m0()     // Catch:{ all -> 0x018d }
            goto L_0x0179
        L_0x00ca:
            r9 = 0
            if (r11 == 0) goto L_0x00d6
            java.lang.String r2 = "Last-Modified"
            java.lang.Object r11 = r11.get(r2)     // Catch:{ all -> 0x018d }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x018d }
            goto L_0x00d7
        L_0x00d6:
            r11 = r9
        L_0x00d7:
            if (r11 == 0) goto L_0x00e6
            int r2 = r11.size()     // Catch:{ all -> 0x018d }
            if (r2 <= 0) goto L_0x00e6
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x018d }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x018d }
            goto L_0x00e7
        L_0x00e6:
            r11 = r9
        L_0x00e7:
            if (r8 == r5) goto L_0x0103
            if (r8 != r3) goto L_0x00ec
            goto L_0x0103
        L_0x00ec:
            com.google.android.gms.measurement.internal.zzfs r9 = r6.R()     // Catch:{ all -> 0x018d }
            boolean r9 = r9.z(r7, r10, r11)     // Catch:{ all -> 0x018d }
            if (r9 != 0) goto L_0x0124
            com.google.android.gms.measurement.internal.c r7 = r6.V()     // Catch:{ all -> 0x0196 }
            r7.A0()     // Catch:{ all -> 0x0196 }
            r6.p = r0
            r6.F()
            return
        L_0x0103:
            com.google.android.gms.measurement.internal.zzfs r11 = r6.R()     // Catch:{ all -> 0x018d }
            com.google.android.gms.internal.measurement.zzby$zzb r11 = r11.v(r7)     // Catch:{ all -> 0x018d }
            if (r11 != 0) goto L_0x0124
            com.google.android.gms.measurement.internal.zzfs r11 = r6.R()     // Catch:{ all -> 0x018d }
            boolean r9 = r11.z(r7, r9, r9)     // Catch:{ all -> 0x018d }
            if (r9 != 0) goto L_0x0124
            com.google.android.gms.measurement.internal.c r7 = r6.V()     // Catch:{ all -> 0x0196 }
            r7.A0()     // Catch:{ all -> 0x0196 }
            r6.p = r0
            r6.F()
            return
        L_0x0124:
            com.google.android.gms.measurement.internal.zzfy r9 = r6.i     // Catch:{ all -> 0x018d }
            com.google.android.gms.common.util.Clock r9 = r9.n()     // Catch:{ all -> 0x018d }
            long r2 = r9.a()     // Catch:{ all -> 0x018d }
            r1.K(r2)     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.c r9 = r6.V()     // Catch:{ all -> 0x018d }
            r9.N(r1)     // Catch:{ all -> 0x018d }
            if (r8 != r5) goto L_0x014a
            com.google.android.gms.measurement.internal.zzfy r8 = r6.i     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzeu r8 = r8.h()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzew r8 = r8.L()     // Catch:{ all -> 0x018d }
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.b(r9, r7)     // Catch:{ all -> 0x018d }
            goto L_0x0162
        L_0x014a:
            com.google.android.gms.measurement.internal.zzfy r7 = r6.i     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzeu r7 = r7.h()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzew r7 = r7.O()     // Catch:{ all -> 0x018d }
            java.lang.String r9 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x018d }
            int r10 = r10.length     // Catch:{ all -> 0x018d }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x018d }
            r7.c(r9, r8, r10)     // Catch:{ all -> 0x018d }
        L_0x0162:
            com.google.android.gms.measurement.internal.zzfb r7 = r6.T()     // Catch:{ all -> 0x018d }
            boolean r7 = r7.y()     // Catch:{ all -> 0x018d }
            if (r7 == 0) goto L_0x0176
            boolean r7 = r6.l0()     // Catch:{ all -> 0x018d }
            if (r7 == 0) goto L_0x0176
            r6.d0()     // Catch:{ all -> 0x018d }
            goto L_0x0179
        L_0x0176:
            r6.m0()     // Catch:{ all -> 0x018d }
        L_0x0179:
            com.google.android.gms.measurement.internal.c r7 = r6.V()     // Catch:{ all -> 0x018d }
            r7.v()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.c r7 = r6.V()     // Catch:{ all -> 0x0196 }
            r7.A0()     // Catch:{ all -> 0x0196 }
            r6.p = r0
            r6.F()
            return
        L_0x018d:
            r7 = move-exception
            com.google.android.gms.measurement.internal.c r8 = r6.V()     // Catch:{ all -> 0x0196 }
            r8.A0()     // Catch:{ all -> 0x0196 }
            throw r7     // Catch:{ all -> 0x0196 }
        L_0x0196:
            r7 = move-exception
            r6.p = r0
            r6.F()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkj.A(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* access modifiers changed from: package-private */
    public final void B(boolean z) {
        m0();
    }

    public final zzy H() {
        return this.i.x();
    }

    /* access modifiers changed from: package-private */
    public final void M(zzkq zzkq, zzn zzn) {
        j0();
        c0();
        if (W(zzn)) {
            if (!zzn.i) {
                Q(zzn);
            } else if (!"_npa".equals(zzkq.f10701c) || zzn.t == null) {
                this.i.h().N().b("Removing user property", this.i.H().A(zzkq.f10701c));
                V().v0();
                try {
                    Q(zzn);
                    V().l0(zzn.f10709b, zzkq.f10701c);
                    V().v();
                    this.i.h().N().b("User property removed", this.i.H().A(zzkq.f10701c));
                } finally {
                    V().A0();
                }
            } else {
                this.i.h().N().a("Falling back to manifest metadata value for ad personalization");
                v(new zzkq("_npa", this.i.n().a(), Long.valueOf(zzn.t.booleanValue() ? 1 : 0), "auto"), zzn);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x048c A[Catch:{ SQLiteException -> 0x01b6, all -> 0x04b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011b A[Catch:{ SQLiteException -> 0x01b6, all -> 0x04b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01cb A[Catch:{ SQLiteException -> 0x01b6, all -> 0x04b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01ff A[Catch:{ SQLiteException -> 0x01b6, all -> 0x04b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0201 A[Catch:{ SQLiteException -> 0x01b6, all -> 0x04b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0205 A[Catch:{ SQLiteException -> 0x01b6, all -> 0x04b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0228 A[Catch:{ SQLiteException -> 0x01b6, all -> 0x04b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x022e A[Catch:{ SQLiteException -> 0x01b6, all -> 0x04b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x023b A[Catch:{ SQLiteException -> 0x01b6, all -> 0x04b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x024e A[Catch:{ SQLiteException -> 0x01b6, all -> 0x04b8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void N(com.google.android.gms.measurement.internal.zzn r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "_pfo"
            java.lang.String r6 = "_uwa"
            java.lang.String r0 = "app_id=?"
            r21.j0()
            r21.c0()
            com.google.android.gms.common.internal.Preconditions.k(r22)
            java.lang.String r7 = r2.f10709b
            com.google.android.gms.common.internal.Preconditions.g(r7)
            boolean r7 = r21.W(r22)
            if (r7 != 0) goto L_0x0023
            return
        L_0x0023:
            com.google.android.gms.measurement.internal.c r7 = r21.V()
            java.lang.String r8 = r2.f10709b
            com.google.android.gms.measurement.internal.k3 r7 = r7.j0(r8)
            r8 = 0
            if (r7 == 0) goto L_0x0056
            java.lang.String r10 = r7.A()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x0056
            java.lang.String r10 = r2.f10710c
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x0056
            r7.K(r8)
            com.google.android.gms.measurement.internal.c r10 = r21.V()
            r10.N(r7)
            com.google.android.gms.measurement.internal.zzfs r7 = r21.R()
            java.lang.String r10 = r2.f10709b
            r7.F(r10)
        L_0x0056:
            boolean r7 = r2.i
            if (r7 != 0) goto L_0x005e
            r21.Q(r22)
            return
        L_0x005e:
            long r10 = r2.n
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x006e
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i
            com.google.android.gms.common.util.Clock r7 = r7.n()
            long r10 = r7.a()
        L_0x006e:
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i
            com.google.android.gms.measurement.internal.zzai r7 = r7.Q()
            r7.y()
            int r7 = r2.o
            r15 = 1
            if (r7 == 0) goto L_0x0098
            if (r7 == r15) goto L_0x0098
            com.google.android.gms.measurement.internal.zzfy r12 = r1.i
            com.google.android.gms.measurement.internal.zzeu r12 = r12.h()
            com.google.android.gms.measurement.internal.zzew r12 = r12.J()
            java.lang.String r13 = r2.f10709b
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzeu.x(r13)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r14 = "Incorrect app type, assuming installed app. appId, appType"
            r12.c(r14, r13, r7)
            r7 = 0
        L_0x0098:
            com.google.android.gms.measurement.internal.c r12 = r21.V()
            r12.v0()
            com.google.android.gms.measurement.internal.c r12 = r21.V()     // Catch:{ all -> 0x04b8 }
            java.lang.String r13 = r2.f10709b     // Catch:{ all -> 0x04b8 }
            java.lang.String r14 = "_npa"
            com.google.android.gms.measurement.internal.s7 r14 = r12.o0(r13, r14)     // Catch:{ all -> 0x04b8 }
            if (r14 == 0) goto L_0x00bc
            java.lang.String r12 = "auto"
            java.lang.String r13 = r14.f10425b     // Catch:{ all -> 0x04b8 }
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x04b8 }
            if (r12 == 0) goto L_0x00b8
            goto L_0x00bc
        L_0x00b8:
            r18 = r3
            r3 = 1
            goto L_0x010f
        L_0x00bc:
            java.lang.Boolean r12 = r2.t     // Catch:{ all -> 0x04b8 }
            if (r12 == 0) goto L_0x00f9
            com.google.android.gms.measurement.internal.zzkq r13 = new com.google.android.gms.measurement.internal.zzkq     // Catch:{ all -> 0x04b8 }
            java.lang.String r18 = "_npa"
            java.lang.Boolean r12 = r2.t     // Catch:{ all -> 0x04b8 }
            boolean r12 = r12.booleanValue()     // Catch:{ all -> 0x04b8 }
            if (r12 == 0) goto L_0x00cf
            r19 = 1
            goto L_0x00d1
        L_0x00cf:
            r19 = r8
        L_0x00d1:
            java.lang.Long r19 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x04b8 }
            java.lang.String r20 = "auto"
            r8 = 1
            r12 = r13
            r8 = r13
            r13 = r18
            r18 = r3
            r9 = r14
            r3 = 1
            r14 = r10
            r16 = r19
            r17 = r20
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04b8 }
            if (r9 == 0) goto L_0x00f5
            java.lang.Object r9 = r9.f10428e     // Catch:{ all -> 0x04b8 }
            java.lang.Long r12 = r8.f10703e     // Catch:{ all -> 0x04b8 }
            boolean r9 = r9.equals(r12)     // Catch:{ all -> 0x04b8 }
            if (r9 != 0) goto L_0x010f
        L_0x00f5:
            r1.v(r8, r2)     // Catch:{ all -> 0x04b8 }
            goto L_0x010f
        L_0x00f9:
            r18 = r3
            r9 = r14
            r3 = 1
            if (r9 == 0) goto L_0x010f
            com.google.android.gms.measurement.internal.zzkq r8 = new com.google.android.gms.measurement.internal.zzkq     // Catch:{ all -> 0x04b8 }
            java.lang.String r13 = "_npa"
            r16 = 0
            java.lang.String r17 = "auto"
            r12 = r8
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04b8 }
            r1.M(r8, r2)     // Catch:{ all -> 0x04b8 }
        L_0x010f:
            com.google.android.gms.measurement.internal.c r8 = r21.V()     // Catch:{ all -> 0x04b8 }
            java.lang.String r9 = r2.f10709b     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.k3 r8 = r8.j0(r9)     // Catch:{ all -> 0x04b8 }
            if (r8 == 0) goto L_0x01c9
            com.google.android.gms.measurement.internal.zzfy r12 = r1.i     // Catch:{ all -> 0x04b8 }
            r12.G()     // Catch:{ all -> 0x04b8 }
            java.lang.String r12 = r2.f10710c     // Catch:{ all -> 0x04b8 }
            java.lang.String r13 = r8.A()     // Catch:{ all -> 0x04b8 }
            java.lang.String r14 = r2.s     // Catch:{ all -> 0x04b8 }
            java.lang.String r15 = r8.D()     // Catch:{ all -> 0x04b8 }
            boolean r12 = com.google.android.gms.measurement.internal.zzkr.j0(r12, r13, r14, r15)     // Catch:{ all -> 0x04b8 }
            if (r12 == 0) goto L_0x01c9
            com.google.android.gms.measurement.internal.zzfy r12 = r1.i     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.zzeu r12 = r12.h()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.zzew r12 = r12.J()     // Catch:{ all -> 0x04b8 }
            java.lang.String r13 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r14 = r8.t()     // Catch:{ all -> 0x04b8 }
            java.lang.Object r14 = com.google.android.gms.measurement.internal.zzeu.x(r14)     // Catch:{ all -> 0x04b8 }
            r12.b(r13, r14)     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.c r12 = r21.V()     // Catch:{ all -> 0x04b8 }
            java.lang.String r8 = r8.t()     // Catch:{ all -> 0x04b8 }
            r12.s()     // Catch:{ all -> 0x04b8 }
            r12.c()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.common.internal.Preconditions.g(r8)     // Catch:{ all -> 0x04b8 }
            android.database.sqlite.SQLiteDatabase r13 = r12.w()     // Catch:{ SQLiteException -> 0x01b6 }
            java.lang.String[] r14 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x01b6 }
            r15 = 0
            r14[r15] = r8     // Catch:{ SQLiteException -> 0x01b6 }
            java.lang.String r9 = "events"
            int r9 = r13.delete(r9, r0, r14)     // Catch:{ SQLiteException -> 0x01b6 }
            int r9 = r9 + r15
            java.lang.String r15 = "user_attributes"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01b6 }
            int r9 = r9 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01b6 }
            int r9 = r9 + r15
            java.lang.String r15 = "apps"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01b6 }
            int r9 = r9 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01b6 }
            int r9 = r9 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01b6 }
            int r9 = r9 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01b6 }
            int r9 = r9 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01b6 }
            int r9 = r9 + r15
            java.lang.String r15 = "audience_filter_values"
            int r0 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01b6 }
            int r9 = r9 + r0
            if (r9 <= 0) goto L_0x01c8
            com.google.android.gms.measurement.internal.zzeu r0 = r12.h()     // Catch:{ SQLiteException -> 0x01b6 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.O()     // Catch:{ SQLiteException -> 0x01b6 }
            java.lang.String r13 = "Deleted application data. app, records"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ SQLiteException -> 0x01b6 }
            r0.c(r13, r8, r9)     // Catch:{ SQLiteException -> 0x01b6 }
            goto L_0x01c8
        L_0x01b6:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzeu r9 = r12.h()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.zzew r9 = r9.G()     // Catch:{ all -> 0x04b8 }
            java.lang.String r12 = "Error deleting application data. appId, error"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzeu.x(r8)     // Catch:{ all -> 0x04b8 }
            r9.c(r12, r8, r0)     // Catch:{ all -> 0x04b8 }
        L_0x01c8:
            r8 = 0
        L_0x01c9:
            if (r8 == 0) goto L_0x0228
            long r12 = r8.V()     // Catch:{ all -> 0x04b8 }
            r14 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x01e3
            long r12 = r8.V()     // Catch:{ all -> 0x04b8 }
            r9 = r4
            long r3 = r2.k     // Catch:{ all -> 0x04b8 }
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x01e4
            r0 = 1
            goto L_0x01e5
        L_0x01e3:
            r9 = r4
        L_0x01e4:
            r0 = 0
        L_0x01e5:
            long r3 = r8.V()     // Catch:{ all -> 0x04b8 }
            int r12 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r12 != 0) goto L_0x0201
            java.lang.String r3 = r8.T()     // Catch:{ all -> 0x04b8 }
            if (r3 == 0) goto L_0x0201
            java.lang.String r3 = r8.T()     // Catch:{ all -> 0x04b8 }
            java.lang.String r4 = r2.f10711d     // Catch:{ all -> 0x04b8 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x04b8 }
            if (r3 != 0) goto L_0x0201
            r14 = 1
            goto L_0x0202
        L_0x0201:
            r14 = 0
        L_0x0202:
            r0 = r0 | r14
            if (r0 == 0) goto L_0x0229
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04b8 }
            r0.<init>()     // Catch:{ all -> 0x04b8 }
            java.lang.String r3 = "_pv"
            java.lang.String r4 = r8.T()     // Catch:{ all -> 0x04b8 }
            r0.putString(r3, r4)     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.zzao r3 = new com.google.android.gms.measurement.internal.zzao     // Catch:{ all -> 0x04b8 }
            java.lang.String r13 = "_au"
            com.google.android.gms.measurement.internal.zzan r14 = new com.google.android.gms.measurement.internal.zzan     // Catch:{ all -> 0x04b8 }
            r14.<init>(r0)     // Catch:{ all -> 0x04b8 }
            java.lang.String r15 = "auto"
            r12 = r3
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04b8 }
            r1.p(r3, r2)     // Catch:{ all -> 0x04b8 }
            goto L_0x0229
        L_0x0228:
            r9 = r4
        L_0x0229:
            r21.Q(r22)     // Catch:{ all -> 0x04b8 }
            if (r7 != 0) goto L_0x023b
            com.google.android.gms.measurement.internal.c r0 = r21.V()     // Catch:{ all -> 0x04b8 }
            java.lang.String r3 = r2.f10709b     // Catch:{ all -> 0x04b8 }
            java.lang.String r4 = "_f"
            com.google.android.gms.measurement.internal.h r0 = r0.D(r3, r4)     // Catch:{ all -> 0x04b8 }
            goto L_0x024c
        L_0x023b:
            r3 = 1
            if (r7 != r3) goto L_0x024b
            com.google.android.gms.measurement.internal.c r0 = r21.V()     // Catch:{ all -> 0x04b8 }
            java.lang.String r3 = r2.f10709b     // Catch:{ all -> 0x04b8 }
            java.lang.String r4 = "_v"
            com.google.android.gms.measurement.internal.h r0 = r0.D(r3, r4)     // Catch:{ all -> 0x04b8 }
            goto L_0x024c
        L_0x024b:
            r0 = 0
        L_0x024c:
            if (r0 != 0) goto L_0x048c
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            long r12 = r10 / r3
            r14 = 1
            long r12 = r12 + r14
            long r12 = r12 * r3
            java.lang.String r0 = "_dac"
            java.lang.String r3 = "_r"
            java.lang.String r4 = "_c"
            java.lang.String r8 = "_et"
            if (r7 != 0) goto L_0x03ea
            com.google.android.gms.measurement.internal.zzkq r7 = new com.google.android.gms.measurement.internal.zzkq     // Catch:{ all -> 0x04b8 }
            java.lang.String r14 = "_fot"
            java.lang.Long r16 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x04b8 }
            java.lang.String r17 = "auto"
            r12 = r7
            r13 = r14
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04b8 }
            r1.v(r7, r2)     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.zzy r7 = r7.x()     // Catch:{ all -> 0x04b8 }
            java.lang.String r12 = r2.f10710c     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.zzaq.S     // Catch:{ all -> 0x04b8 }
            boolean r7 = r7.C(r12, r13)     // Catch:{ all -> 0x04b8 }
            if (r7 == 0) goto L_0x0293
            r21.j0()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.zzfp r7 = r7.D()     // Catch:{ all -> 0x04b8 }
            java.lang.String r12 = r2.f10709b     // Catch:{ all -> 0x04b8 }
            r7.b(r12)     // Catch:{ all -> 0x04b8 }
        L_0x0293:
            r21.j0()     // Catch:{ all -> 0x04b8 }
            r21.c0()     // Catch:{ all -> 0x04b8 }
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x04b8 }
            r7.<init>()     // Catch:{ all -> 0x04b8 }
            r12 = 1
            r7.putLong(r4, r12)     // Catch:{ all -> 0x04b8 }
            r7.putLong(r3, r12)     // Catch:{ all -> 0x04b8 }
            r3 = 0
            r7.putLong(r6, r3)     // Catch:{ all -> 0x04b8 }
            r7.putLong(r5, r3)     // Catch:{ all -> 0x04b8 }
            r7.putLong(r9, r3)     // Catch:{ all -> 0x04b8 }
            r14 = r18
            r7.putLong(r14, r3)     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.zzfy r3 = r1.i     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.zzy r3 = r3.x()     // Catch:{ all -> 0x04b8 }
            java.lang.String r4 = r2.f10709b     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.zzaq.U     // Catch:{ all -> 0x04b8 }
            boolean r3 = r3.C(r4, r12)     // Catch:{ all -> 0x04b8 }
            if (r3 == 0) goto L_0x02cc
            r3 = 1
            r7.putLong(r8, r3)     // Catch:{ all -> 0x04b8 }
            goto L_0x02ce
        L_0x02cc:
            r3 = 1
        L_0x02ce:
            boolean r12 = r2.r     // Catch:{ all -> 0x04b8 }
            if (r12 == 0) goto L_0x02d5
            r7.putLong(r0, r3)     // Catch:{ all -> 0x04b8 }
        L_0x02d5:
            com.google.android.gms.measurement.internal.c r0 = r21.V()     // Catch:{ all -> 0x04b8 }
            java.lang.String r3 = r2.f10709b     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.common.internal.Preconditions.g(r3)     // Catch:{ all -> 0x04b8 }
            r0.c()     // Catch:{ all -> 0x04b8 }
            r0.s()     // Catch:{ all -> 0x04b8 }
            java.lang.String r4 = "first_open_count"
            long r3 = r0.z0(r3, r4)     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.zzfy r0 = r1.i     // Catch:{ all -> 0x04b8 }
            android.content.Context r0 = r0.f()     // Catch:{ all -> 0x04b8 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x04b8 }
            if (r0 != 0) goto L_0x030f
            com.google.android.gms.measurement.internal.zzfy r0 = r1.i     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.zzeu r0 = r0.h()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.G()     // Catch:{ all -> 0x04b8 }
            java.lang.String r6 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.String r9 = r2.f10709b     // Catch:{ all -> 0x04b8 }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzeu.x(r9)     // Catch:{ all -> 0x04b8 }
            r0.b(r6, r9)     // Catch:{ all -> 0x04b8 }
        L_0x030b:
            r12 = 0
            goto L_0x03ce
        L_0x030f:
            com.google.android.gms.measurement.internal.zzfy r0 = r1.i     // Catch:{ NameNotFoundException -> 0x0321 }
            android.content.Context r0 = r0.f()     // Catch:{ NameNotFoundException -> 0x0321 }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.a(r0)     // Catch:{ NameNotFoundException -> 0x0321 }
            java.lang.String r12 = r2.f10709b     // Catch:{ NameNotFoundException -> 0x0321 }
            r13 = 0
            android.content.pm.PackageInfo r0 = r0.e(r12, r13)     // Catch:{ NameNotFoundException -> 0x0321 }
            goto L_0x0338
        L_0x0321:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzfy r12 = r1.i     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.zzeu r12 = r12.h()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.zzew r12 = r12.G()     // Catch:{ all -> 0x04b8 }
            java.lang.String r13 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.String r15 = r2.f10709b     // Catch:{ all -> 0x04b8 }
            java.lang.Object r15 = com.google.android.gms.measurement.internal.zzeu.x(r15)     // Catch:{ all -> 0x04b8 }
            r12.c(r13, r15, r0)     // Catch:{ all -> 0x04b8 }
            r0 = 0
        L_0x0338:
            if (r0 == 0) goto L_0x038a
            long r12 = r0.firstInstallTime     // Catch:{ all -> 0x04b8 }
            r15 = 0
            int r17 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r17 == 0) goto L_0x038a
            long r12 = r0.firstInstallTime     // Catch:{ all -> 0x04b8 }
            r18 = r14
            long r14 = r0.lastUpdateTime     // Catch:{ all -> 0x04b8 }
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x036d
            com.google.android.gms.measurement.internal.zzfy r0 = r1.i     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.zzy r0 = r0.x()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.zzaq.t0     // Catch:{ all -> 0x04b8 }
            boolean r0 = r0.t(r12)     // Catch:{ all -> 0x04b8 }
            if (r0 == 0) goto L_0x0366
            r12 = 0
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x036b
            r12 = 1
            r7.putLong(r6, r12)     // Catch:{ all -> 0x04b8 }
            goto L_0x036b
        L_0x0366:
            r12 = 1
            r7.putLong(r6, r12)     // Catch:{ all -> 0x04b8 }
        L_0x036b:
            r14 = 0
            goto L_0x036e
        L_0x036d:
            r14 = 1
        L_0x036e:
            com.google.android.gms.measurement.internal.zzkq r0 = new com.google.android.gms.measurement.internal.zzkq     // Catch:{ all -> 0x04b8 }
            java.lang.String r13 = "_fi"
            if (r14 == 0) goto L_0x0377
            r14 = 1
            goto L_0x0379
        L_0x0377:
            r14 = 0
        L_0x0379:
            java.lang.Long r16 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x04b8 }
            java.lang.String r17 = "auto"
            r12 = r0
            r6 = r18
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04b8 }
            r1.v(r0, r2)     // Catch:{ all -> 0x04b8 }
            goto L_0x038b
        L_0x038a:
            r6 = r14
        L_0x038b:
            com.google.android.gms.measurement.internal.zzfy r0 = r1.i     // Catch:{ NameNotFoundException -> 0x039d }
            android.content.Context r0 = r0.f()     // Catch:{ NameNotFoundException -> 0x039d }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.a(r0)     // Catch:{ NameNotFoundException -> 0x039d }
            java.lang.String r12 = r2.f10709b     // Catch:{ NameNotFoundException -> 0x039d }
            r13 = 0
            android.content.pm.ApplicationInfo r0 = r0.c(r12, r13)     // Catch:{ NameNotFoundException -> 0x039d }
            goto L_0x03b4
        L_0x039d:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzfy r12 = r1.i     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.zzeu r12 = r12.h()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.zzew r12 = r12.G()     // Catch:{ all -> 0x04b8 }
            java.lang.String r13 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.String r14 = r2.f10709b     // Catch:{ all -> 0x04b8 }
            java.lang.Object r14 = com.google.android.gms.measurement.internal.zzeu.x(r14)     // Catch:{ all -> 0x04b8 }
            r12.c(r13, r14, r0)     // Catch:{ all -> 0x04b8 }
            r0 = 0
        L_0x03b4:
            if (r0 == 0) goto L_0x030b
            int r12 = r0.flags     // Catch:{ all -> 0x04b8 }
            r13 = 1
            r12 = r12 & r13
            if (r12 == 0) goto L_0x03c1
            r12 = 1
            r7.putLong(r9, r12)     // Catch:{ all -> 0x04b8 }
        L_0x03c1:
            int r0 = r0.flags     // Catch:{ all -> 0x04b8 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x030b
            r12 = 1
            r7.putLong(r6, r12)     // Catch:{ all -> 0x04b8 }
            goto L_0x030b
        L_0x03ce:
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x03d5
            r7.putLong(r5, r3)     // Catch:{ all -> 0x04b8 }
        L_0x03d5:
            com.google.android.gms.measurement.internal.zzao r0 = new com.google.android.gms.measurement.internal.zzao     // Catch:{ all -> 0x04b8 }
            java.lang.String r13 = "_f"
            com.google.android.gms.measurement.internal.zzan r14 = new com.google.android.gms.measurement.internal.zzan     // Catch:{ all -> 0x04b8 }
            r14.<init>(r7)     // Catch:{ all -> 0x04b8 }
            java.lang.String r15 = "auto"
            r12 = r0
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04b8 }
            r1.K(r0, r2)     // Catch:{ all -> 0x04b8 }
            goto L_0x0446
        L_0x03ea:
            r5 = 1
            if (r7 != r5) goto L_0x0446
            com.google.android.gms.measurement.internal.zzkq r5 = new com.google.android.gms.measurement.internal.zzkq     // Catch:{ all -> 0x04b8 }
            java.lang.String r6 = "_fvt"
            java.lang.Long r16 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x04b8 }
            java.lang.String r17 = "auto"
            r12 = r5
            r13 = r6
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04b8 }
            r1.v(r5, r2)     // Catch:{ all -> 0x04b8 }
            r21.j0()     // Catch:{ all -> 0x04b8 }
            r21.c0()     // Catch:{ all -> 0x04b8 }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x04b8 }
            r5.<init>()     // Catch:{ all -> 0x04b8 }
            r6 = 1
            r5.putLong(r4, r6)     // Catch:{ all -> 0x04b8 }
            r5.putLong(r3, r6)     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.zzfy r3 = r1.i     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.zzy r3 = r3.x()     // Catch:{ all -> 0x04b8 }
            java.lang.String r4 = r2.f10709b     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.zzaq.U     // Catch:{ all -> 0x04b8 }
            boolean r3 = r3.C(r4, r6)     // Catch:{ all -> 0x04b8 }
            if (r3 == 0) goto L_0x0429
            r3 = 1
            r5.putLong(r8, r3)     // Catch:{ all -> 0x04b8 }
            goto L_0x042b
        L_0x0429:
            r3 = 1
        L_0x042b:
            boolean r6 = r2.r     // Catch:{ all -> 0x04b8 }
            if (r6 == 0) goto L_0x0432
            r5.putLong(r0, r3)     // Catch:{ all -> 0x04b8 }
        L_0x0432:
            com.google.android.gms.measurement.internal.zzao r0 = new com.google.android.gms.measurement.internal.zzao     // Catch:{ all -> 0x04b8 }
            java.lang.String r13 = "_v"
            com.google.android.gms.measurement.internal.zzan r14 = new com.google.android.gms.measurement.internal.zzan     // Catch:{ all -> 0x04b8 }
            r14.<init>(r5)     // Catch:{ all -> 0x04b8 }
            java.lang.String r15 = "auto"
            r12 = r0
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04b8 }
            r1.K(r0, r2)     // Catch:{ all -> 0x04b8 }
        L_0x0446:
            com.google.android.gms.measurement.internal.zzfy r0 = r1.i     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.zzy r0 = r0.x()     // Catch:{ all -> 0x04b8 }
            java.lang.String r3 = r2.f10709b     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.zzaq.V     // Catch:{ all -> 0x04b8 }
            boolean r0 = r0.C(r3, r4)     // Catch:{ all -> 0x04b8 }
            if (r0 != 0) goto L_0x04a9
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04b8 }
            r0.<init>()     // Catch:{ all -> 0x04b8 }
            r3 = 1
            r0.putLong(r8, r3)     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.zzfy r3 = r1.i     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.zzy r3 = r3.x()     // Catch:{ all -> 0x04b8 }
            java.lang.String r4 = r2.f10709b     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.zzaq.U     // Catch:{ all -> 0x04b8 }
            boolean r3 = r3.C(r4, r5)     // Catch:{ all -> 0x04b8 }
            if (r3 == 0) goto L_0x0477
            java.lang.String r3 = "_fr"
            r4 = 1
            r0.putLong(r3, r4)     // Catch:{ all -> 0x04b8 }
        L_0x0477:
            com.google.android.gms.measurement.internal.zzao r3 = new com.google.android.gms.measurement.internal.zzao     // Catch:{ all -> 0x04b8 }
            java.lang.String r13 = "_e"
            com.google.android.gms.measurement.internal.zzan r14 = new com.google.android.gms.measurement.internal.zzan     // Catch:{ all -> 0x04b8 }
            r14.<init>(r0)     // Catch:{ all -> 0x04b8 }
            java.lang.String r15 = "auto"
            r12 = r3
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04b8 }
            r1.K(r3, r2)     // Catch:{ all -> 0x04b8 }
            goto L_0x04a9
        L_0x048c:
            boolean r0 = r2.j     // Catch:{ all -> 0x04b8 }
            if (r0 == 0) goto L_0x04a9
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04b8 }
            r0.<init>()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.zzao r3 = new com.google.android.gms.measurement.internal.zzao     // Catch:{ all -> 0x04b8 }
            java.lang.String r13 = "_cd"
            com.google.android.gms.measurement.internal.zzan r14 = new com.google.android.gms.measurement.internal.zzan     // Catch:{ all -> 0x04b8 }
            r14.<init>(r0)     // Catch:{ all -> 0x04b8 }
            java.lang.String r15 = "auto"
            r12 = r3
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04b8 }
            r1.K(r3, r2)     // Catch:{ all -> 0x04b8 }
        L_0x04a9:
            com.google.android.gms.measurement.internal.c r0 = r21.V()     // Catch:{ all -> 0x04b8 }
            r0.v()     // Catch:{ all -> 0x04b8 }
            com.google.android.gms.measurement.internal.c r0 = r21.V()
            r0.A0()
            return
        L_0x04b8:
            r0 = move-exception
            com.google.android.gms.measurement.internal.c r2 = r21.V()
            r2.A0()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkj.N(com.google.android.gms.measurement.internal.zzn):void");
    }

    /* access modifiers changed from: package-private */
    public final void O(zzw zzw) {
        zzn d2 = d(zzw.f10715b);
        if (d2 != null) {
            P(zzw, d2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void P(zzw zzw, zzn zzn) {
        Preconditions.k(zzw);
        Preconditions.g(zzw.f10715b);
        Preconditions.k(zzw.f10717d);
        Preconditions.g(zzw.f10717d.f10701c);
        j0();
        c0();
        if (W(zzn)) {
            if (!zzn.i) {
                Q(zzn);
                return;
            }
            V().v0();
            try {
                Q(zzn);
                zzw p0 = V().p0(zzw.f10715b, zzw.f10717d.f10701c);
                if (p0 != null) {
                    this.i.h().N().c("Removing conditional user property", zzw.f10715b, this.i.H().A(zzw.f10717d.f10701c));
                    V().r0(zzw.f10715b, zzw.f10717d.f10701c);
                    if (p0.f10719f) {
                        V().l0(zzw.f10715b, zzw.f10717d.f10701c);
                    }
                    if (zzw.l != null) {
                        Bundle bundle = null;
                        if (zzw.l.f10564c != null) {
                            bundle = zzw.l.f10564c.B();
                        }
                        Bundle bundle2 = bundle;
                        S(this.i.G().E(zzw.f10715b, zzw.l.f10563b, bundle2, p0.f10716c, zzw.l.f10566e, true, false), zzn);
                    }
                } else {
                    this.i.h().J().c("Conditional user property doesn't exist", zzeu.x(zzw.f10715b), this.i.H().A(zzw.f10717d.f10701c));
                }
                V().v();
            } finally {
                V().A0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final k3 Q(zzn zzn) {
        j0();
        c0();
        Preconditions.k(zzn);
        Preconditions.g(zzn.f10709b);
        k3 j0 = V().j0(zzn.f10709b);
        String x2 = this.i.A().x(zzn.f10709b);
        if (!zzkz.b() || !this.i.x().t(zzaq.u0)) {
            return b(zzn, j0, x2);
        }
        if (j0 == null) {
            j0 = new k3(this.i, zzn.f10709b);
            j0.c(this.i.G().N0());
            j0.C(x2);
        } else if (!x2.equals(j0.J())) {
            j0.C(x2);
            j0.c(this.i.G().N0());
        }
        j0.r(zzn.f10710c);
        j0.v(zzn.s);
        if (zzlm.b() && this.i.x().C(j0.t(), zzaq.o0)) {
            j0.z(zzn.w);
        }
        if (!TextUtils.isEmpty(zzn.l)) {
            j0.F(zzn.l);
        }
        long j2 = zzn.f10713f;
        if (j2 != 0) {
            j0.y(j2);
        }
        if (!TextUtils.isEmpty(zzn.f10711d)) {
            j0.I(zzn.f10711d);
        }
        j0.u(zzn.k);
        String str = zzn.f10712e;
        if (str != null) {
            j0.L(str);
        }
        j0.B(zzn.g);
        j0.e(zzn.i);
        if (!TextUtils.isEmpty(zzn.h)) {
            j0.O(zzn.h);
        }
        if (!this.i.x().t(zzaq.M0)) {
            j0.c0(zzn.m);
        }
        j0.s(zzn.p);
        j0.w(zzn.q);
        j0.b(zzn.t);
        j0.E(zzn.u);
        if (j0.f()) {
            V().N(j0);
        }
        return j0;
    }

    public final zzfs R() {
        L(this.f10689a);
        return this.f10689a;
    }

    public final zzfb T() {
        L(this.f10690b);
        return this.f10690b;
    }

    /* access modifiers changed from: package-private */
    public final String U(zzn zzn) {
        try {
            return (String) this.i.g().w(new r7(this, zzn)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            this.i.h().G().c("Failed to get app instance id. appId", zzeu.x(zzn.f10709b), e2);
            return null;
        }
    }

    public final c V() {
        L(this.f10691c);
        return this.f10691c;
    }

    public final w7 X() {
        L(this.f10694f);
        return this.f10694f;
    }

    public final u5 Y() {
        L(this.h);
        return this.h;
    }

    public final zzkn Z() {
        L(this.g);
        return this.g;
    }

    public final zzes a0() {
        return this.i.H();
    }

    public final zzkr b0() {
        return this.i.G();
    }

    /* access modifiers changed from: package-private */
    public final void c0() {
        if (!this.j) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:94|95) */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        r1.i.h().G().c("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.zzeu.x(r5), r9);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:94:0x02cc */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d0() {
        /*
            r17 = this;
            r1 = r17
            r17.j0()
            r17.c0()
            r0 = 1
            r1.r = r0
            r2 = 0
            com.google.android.gms.measurement.internal.zzfy r3 = r1.i     // Catch:{ all -> 0x0308 }
            r3.m()     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzfy r3 = r1.i     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzir r3 = r3.P()     // Catch:{ all -> 0x0308 }
            java.lang.Boolean r3 = r3.b0()     // Catch:{ all -> 0x0308 }
            if (r3 != 0) goto L_0x0032
            com.google.android.gms.measurement.internal.zzfy r0 = r1.i     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzeu r0 = r0.h()     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.J()     // Catch:{ all -> 0x0308 }
            java.lang.String r3 = "Upload data called on the client side before use of service was decided"
            r0.a(r3)     // Catch:{ all -> 0x0308 }
            r1.r = r2
            r17.F()
            return
        L_0x0032:
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0308 }
            if (r3 == 0) goto L_0x004d
            com.google.android.gms.measurement.internal.zzfy r0 = r1.i     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzeu r0 = r0.h()     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.G()     // Catch:{ all -> 0x0308 }
            java.lang.String r3 = "Upload called in the client side when service should be used"
            r0.a(r3)     // Catch:{ all -> 0x0308 }
            r1.r = r2
            r17.F()
            return
        L_0x004d:
            long r3 = r1.l     // Catch:{ all -> 0x0308 }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x005e
            r17.m0()     // Catch:{ all -> 0x0308 }
            r1.r = r2
            r17.F()
            return
        L_0x005e:
            r17.j0()     // Catch:{ all -> 0x0308 }
            java.util.List<java.lang.Long> r3 = r1.u     // Catch:{ all -> 0x0308 }
            if (r3 == 0) goto L_0x0067
            r3 = 1
            goto L_0x0068
        L_0x0067:
            r3 = 0
        L_0x0068:
            if (r3 == 0) goto L_0x007f
            com.google.android.gms.measurement.internal.zzfy r0 = r1.i     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzeu r0 = r0.h()     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.O()     // Catch:{ all -> 0x0308 }
            java.lang.String r3 = "Uploading requested multiple times"
            r0.a(r3)     // Catch:{ all -> 0x0308 }
            r1.r = r2
            r17.F()
            return
        L_0x007f:
            com.google.android.gms.measurement.internal.zzfb r3 = r17.T()     // Catch:{ all -> 0x0308 }
            boolean r3 = r3.y()     // Catch:{ all -> 0x0308 }
            if (r3 != 0) goto L_0x00a1
            com.google.android.gms.measurement.internal.zzfy r0 = r1.i     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzeu r0 = r0.h()     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.O()     // Catch:{ all -> 0x0308 }
            java.lang.String r3 = "Network not connected, ignoring upload request"
            r0.a(r3)     // Catch:{ all -> 0x0308 }
            r17.m0()     // Catch:{ all -> 0x0308 }
            r1.r = r2
            r17.F()
            return
        L_0x00a1:
            com.google.android.gms.measurement.internal.zzfy r3 = r1.i     // Catch:{ all -> 0x0308 }
            com.google.android.gms.common.util.Clock r3 = r3.n()     // Catch:{ all -> 0x0308 }
            long r3 = r3.a()     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzy r7 = r7.x()     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.zzaq.Q     // Catch:{ all -> 0x0308 }
            r9 = 0
            int r7 = r7.v(r9, r8)     // Catch:{ all -> 0x0308 }
            long r10 = com.google.android.gms.measurement.internal.zzy.O()     // Catch:{ all -> 0x0308 }
            long r10 = r3 - r10
            r8 = 0
        L_0x00bf:
            if (r8 >= r7) goto L_0x00ca
            boolean r12 = r1.E(r9, r10)     // Catch:{ all -> 0x0308 }
            if (r12 == 0) goto L_0x00ca
            int r8 = r8 + 1
            goto L_0x00bf
        L_0x00ca:
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.q3 r7 = r7.A()     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzfk r7 = r7.f10375e     // Catch:{ all -> 0x0308 }
            long r7 = r7.a()     // Catch:{ all -> 0x0308 }
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x00f3
            com.google.android.gms.measurement.internal.zzfy r5 = r1.i     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzeu r5 = r5.h()     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzew r5 = r5.N()     // Catch:{ all -> 0x0308 }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r7 = r3 - r7
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x0308 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0308 }
            r5.b(r6, r7)     // Catch:{ all -> 0x0308 }
        L_0x00f3:
            com.google.android.gms.measurement.internal.c r5 = r17.V()     // Catch:{ all -> 0x0308 }
            java.lang.String r5 = r5.x()     // Catch:{ all -> 0x0308 }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0308 }
            r7 = -1
            if (r6 != 0) goto L_0x02e0
            long r10 = r1.w     // Catch:{ all -> 0x0308 }
            int r6 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x0113
            com.google.android.gms.measurement.internal.c r6 = r17.V()     // Catch:{ all -> 0x0308 }
            long r6 = r6.Y()     // Catch:{ all -> 0x0308 }
            r1.w = r6     // Catch:{ all -> 0x0308 }
        L_0x0113:
            com.google.android.gms.measurement.internal.zzfy r6 = r1.i     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzy r6 = r6.x()     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.zzaq.g     // Catch:{ all -> 0x0308 }
            int r6 = r6.v(r5, r7)     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzfy r7 = r1.i     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzy r7 = r7.x()     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.zzaq.h     // Catch:{ all -> 0x0308 }
            int r7 = r7.v(r5, r8)     // Catch:{ all -> 0x0308 }
            int r7 = java.lang.Math.max(r2, r7)     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.c r8 = r17.V()     // Catch:{ all -> 0x0308 }
            java.util.List r6 = r8.I(r5, r6, r7)     // Catch:{ all -> 0x0308 }
            boolean r7 = r6.isEmpty()     // Catch:{ all -> 0x0308 }
            if (r7 != 0) goto L_0x0302
            java.util.Iterator r7 = r6.iterator()     // Catch:{ all -> 0x0308 }
        L_0x0141:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0308 }
            if (r8 == 0) goto L_0x0160
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0308 }
            android.util.Pair r8 = (android.util.Pair) r8     // Catch:{ all -> 0x0308 }
            java.lang.Object r8 = r8.first     // Catch:{ all -> 0x0308 }
            com.google.android.gms.internal.measurement.zzcb$zzg r8 = (com.google.android.gms.internal.measurement.zzcb.zzg) r8     // Catch:{ all -> 0x0308 }
            java.lang.String r10 = r8.b0()     // Catch:{ all -> 0x0308 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0308 }
            if (r10 != 0) goto L_0x0141
            java.lang.String r7 = r8.b0()     // Catch:{ all -> 0x0308 }
            goto L_0x0161
        L_0x0160:
            r7 = r9
        L_0x0161:
            if (r7 == 0) goto L_0x0190
            r8 = 0
        L_0x0164:
            int r10 = r6.size()     // Catch:{ all -> 0x0308 }
            if (r8 >= r10) goto L_0x0190
            java.lang.Object r10 = r6.get(r8)     // Catch:{ all -> 0x0308 }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x0308 }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x0308 }
            com.google.android.gms.internal.measurement.zzcb$zzg r10 = (com.google.android.gms.internal.measurement.zzcb.zzg) r10     // Catch:{ all -> 0x0308 }
            java.lang.String r11 = r10.b0()     // Catch:{ all -> 0x0308 }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0308 }
            if (r11 != 0) goto L_0x018d
            java.lang.String r10 = r10.b0()     // Catch:{ all -> 0x0308 }
            boolean r10 = r10.equals(r7)     // Catch:{ all -> 0x0308 }
            if (r10 != 0) goto L_0x018d
            java.util.List r6 = r6.subList(r2, r8)     // Catch:{ all -> 0x0308 }
            goto L_0x0190
        L_0x018d:
            int r8 = r8 + 1
            goto L_0x0164
        L_0x0190:
            com.google.android.gms.internal.measurement.zzcb$zzf$zza r7 = com.google.android.gms.internal.measurement.zzcb.zzf.H()     // Catch:{ all -> 0x0308 }
            int r8 = r6.size()     // Catch:{ all -> 0x0308 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0308 }
            int r11 = r6.size()     // Catch:{ all -> 0x0308 }
            r10.<init>(r11)     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzfy r11 = r1.i     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzy r11 = r11.x()     // Catch:{ all -> 0x0308 }
            boolean r11 = r11.G(r5)     // Catch:{ all -> 0x0308 }
            r12 = 0
        L_0x01ac:
            if (r12 >= r8) goto L_0x0213
            java.lang.Object r13 = r6.get(r12)     // Catch:{ all -> 0x0308 }
            android.util.Pair r13 = (android.util.Pair) r13     // Catch:{ all -> 0x0308 }
            java.lang.Object r13 = r13.first     // Catch:{ all -> 0x0308 }
            com.google.android.gms.internal.measurement.zzcb$zzg r13 = (com.google.android.gms.internal.measurement.zzcb.zzg) r13     // Catch:{ all -> 0x0308 }
            com.google.android.gms.internal.measurement.zzfo$zza r13 = r13.x()     // Catch:{ all -> 0x0308 }
            com.google.android.gms.internal.measurement.zzcb$zzg$zza r13 = (com.google.android.gms.internal.measurement.zzcb.zzg.zza) r13     // Catch:{ all -> 0x0308 }
            java.lang.Object r14 = r6.get(r12)     // Catch:{ all -> 0x0308 }
            android.util.Pair r14 = (android.util.Pair) r14     // Catch:{ all -> 0x0308 }
            java.lang.Object r14 = r14.second     // Catch:{ all -> 0x0308 }
            java.lang.Long r14 = (java.lang.Long) r14     // Catch:{ all -> 0x0308 }
            r10.add(r14)     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzfy r14 = r1.i     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzy r14 = r14.x()     // Catch:{ all -> 0x0308 }
            long r14 = r14.D()     // Catch:{ all -> 0x0308 }
            r13.r0(r14)     // Catch:{ all -> 0x0308 }
            r13.F(r3)     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzfy r14 = r1.i     // Catch:{ all -> 0x0308 }
            r14.m()     // Catch:{ all -> 0x0308 }
            r13.W(r2)     // Catch:{ all -> 0x0308 }
            if (r11 != 0) goto L_0x01e8
            r13.M0()     // Catch:{ all -> 0x0308 }
        L_0x01e8:
            com.google.android.gms.measurement.internal.zzfy r14 = r1.i     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzy r14 = r14.x()     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r15 = com.google.android.gms.measurement.internal.zzaq.Z     // Catch:{ all -> 0x0308 }
            boolean r14 = r14.C(r5, r15)     // Catch:{ all -> 0x0308 }
            if (r14 == 0) goto L_0x020d
            com.google.android.gms.internal.measurement.zzgw r14 = r13.q()     // Catch:{ all -> 0x0308 }
            com.google.android.gms.internal.measurement.zzfo r14 = (com.google.android.gms.internal.measurement.zzfo) r14     // Catch:{ all -> 0x0308 }
            com.google.android.gms.internal.measurement.zzcb$zzg r14 = (com.google.android.gms.internal.measurement.zzcb.zzg) r14     // Catch:{ all -> 0x0308 }
            byte[] r14 = r14.j()     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzkn r15 = r17.Z()     // Catch:{ all -> 0x0308 }
            long r14 = r15.w(r14)     // Catch:{ all -> 0x0308 }
            r13.H0(r14)     // Catch:{ all -> 0x0308 }
        L_0x020d:
            r7.C(r13)     // Catch:{ all -> 0x0308 }
            int r12 = r12 + 1
            goto L_0x01ac
        L_0x0213:
            com.google.android.gms.measurement.internal.zzfy r6 = r1.i     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzeu r6 = r6.h()     // Catch:{ all -> 0x0308 }
            r11 = 2
            boolean r6 = r6.C(r11)     // Catch:{ all -> 0x0308 }
            if (r6 == 0) goto L_0x0231
            com.google.android.gms.measurement.internal.zzkn r6 = r17.Z()     // Catch:{ all -> 0x0308 }
            com.google.android.gms.internal.measurement.zzgw r11 = r7.q()     // Catch:{ all -> 0x0308 }
            com.google.android.gms.internal.measurement.zzfo r11 = (com.google.android.gms.internal.measurement.zzfo) r11     // Catch:{ all -> 0x0308 }
            com.google.android.gms.internal.measurement.zzcb$zzf r11 = (com.google.android.gms.internal.measurement.zzcb.zzf) r11     // Catch:{ all -> 0x0308 }
            java.lang.String r6 = r6.D(r11)     // Catch:{ all -> 0x0308 }
            goto L_0x0232
        L_0x0231:
            r6 = r9
        L_0x0232:
            r17.Z()     // Catch:{ all -> 0x0308 }
            com.google.android.gms.internal.measurement.zzgw r11 = r7.q()     // Catch:{ all -> 0x0308 }
            com.google.android.gms.internal.measurement.zzfo r11 = (com.google.android.gms.internal.measurement.zzfo) r11     // Catch:{ all -> 0x0308 }
            com.google.android.gms.internal.measurement.zzcb$zzf r11 = (com.google.android.gms.internal.measurement.zzcb.zzf) r11     // Catch:{ all -> 0x0308 }
            byte[] r14 = r11.j()     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzen<java.lang.String> r11 = com.google.android.gms.measurement.internal.zzaq.q     // Catch:{ all -> 0x0308 }
            java.lang.Object r9 = r11.a(r9)     // Catch:{ all -> 0x0308 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0308 }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x02cc }
            r13.<init>(r9)     // Catch:{ MalformedURLException -> 0x02cc }
            boolean r11 = r10.isEmpty()     // Catch:{ MalformedURLException -> 0x02cc }
            if (r11 != 0) goto L_0x0256
            r11 = 1
            goto L_0x0257
        L_0x0256:
            r11 = 0
        L_0x0257:
            com.google.android.gms.common.internal.Preconditions.a(r11)     // Catch:{ MalformedURLException -> 0x02cc }
            java.util.List<java.lang.Long> r11 = r1.u     // Catch:{ MalformedURLException -> 0x02cc }
            if (r11 == 0) goto L_0x026e
            com.google.android.gms.measurement.internal.zzfy r10 = r1.i     // Catch:{ MalformedURLException -> 0x02cc }
            com.google.android.gms.measurement.internal.zzeu r10 = r10.h()     // Catch:{ MalformedURLException -> 0x02cc }
            com.google.android.gms.measurement.internal.zzew r10 = r10.G()     // Catch:{ MalformedURLException -> 0x02cc }
            java.lang.String r11 = "Set uploading progress before finishing the previous upload"
            r10.a(r11)     // Catch:{ MalformedURLException -> 0x02cc }
            goto L_0x0275
        L_0x026e:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x02cc }
            r11.<init>(r10)     // Catch:{ MalformedURLException -> 0x02cc }
            r1.u = r11     // Catch:{ MalformedURLException -> 0x02cc }
        L_0x0275:
            com.google.android.gms.measurement.internal.zzfy r10 = r1.i     // Catch:{ MalformedURLException -> 0x02cc }
            com.google.android.gms.measurement.internal.q3 r10 = r10.A()     // Catch:{ MalformedURLException -> 0x02cc }
            com.google.android.gms.measurement.internal.zzfk r10 = r10.f10376f     // Catch:{ MalformedURLException -> 0x02cc }
            r10.b(r3)     // Catch:{ MalformedURLException -> 0x02cc }
            java.lang.String r3 = "?"
            if (r8 <= 0) goto L_0x028c
            com.google.android.gms.internal.measurement.zzcb$zzg r3 = r7.D(r2)     // Catch:{ MalformedURLException -> 0x02cc }
            java.lang.String r3 = r3.I2()     // Catch:{ MalformedURLException -> 0x02cc }
        L_0x028c:
            com.google.android.gms.measurement.internal.zzfy r4 = r1.i     // Catch:{ MalformedURLException -> 0x02cc }
            com.google.android.gms.measurement.internal.zzeu r4 = r4.h()     // Catch:{ MalformedURLException -> 0x02cc }
            com.google.android.gms.measurement.internal.zzew r4 = r4.O()     // Catch:{ MalformedURLException -> 0x02cc }
            java.lang.String r7 = "Uploading data. app, uncompressed size, data"
            int r8 = r14.length     // Catch:{ MalformedURLException -> 0x02cc }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ MalformedURLException -> 0x02cc }
            r4.d(r7, r3, r8, r6)     // Catch:{ MalformedURLException -> 0x02cc }
            r1.q = r0     // Catch:{ MalformedURLException -> 0x02cc }
            com.google.android.gms.measurement.internal.zzfb r11 = r17.T()     // Catch:{ MalformedURLException -> 0x02cc }
            com.google.android.gms.measurement.internal.q7 r0 = new com.google.android.gms.measurement.internal.q7     // Catch:{ MalformedURLException -> 0x02cc }
            r0.<init>(r1, r5)     // Catch:{ MalformedURLException -> 0x02cc }
            r11.c()     // Catch:{ MalformedURLException -> 0x02cc }
            r11.s()     // Catch:{ MalformedURLException -> 0x02cc }
            com.google.android.gms.common.internal.Preconditions.k(r13)     // Catch:{ MalformedURLException -> 0x02cc }
            com.google.android.gms.common.internal.Preconditions.k(r14)     // Catch:{ MalformedURLException -> 0x02cc }
            com.google.android.gms.common.internal.Preconditions.k(r0)     // Catch:{ MalformedURLException -> 0x02cc }
            com.google.android.gms.measurement.internal.zzfv r3 = r11.g()     // Catch:{ MalformedURLException -> 0x02cc }
            com.google.android.gms.measurement.internal.p3 r4 = new com.google.android.gms.measurement.internal.p3     // Catch:{ MalformedURLException -> 0x02cc }
            r15 = 0
            r10 = r4
            r12 = r5
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x02cc }
            r3.C(r4)     // Catch:{ MalformedURLException -> 0x02cc }
            goto L_0x0302
        L_0x02cc:
            com.google.android.gms.measurement.internal.zzfy r0 = r1.i     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzeu r0 = r0.h()     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.G()     // Catch:{ all -> 0x0308 }
            java.lang.String r3 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeu.x(r5)     // Catch:{ all -> 0x0308 }
            r0.c(r3, r4, r9)     // Catch:{ all -> 0x0308 }
            goto L_0x0302
        L_0x02e0:
            r1.w = r7     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.c r0 = r17.V()     // Catch:{ all -> 0x0308 }
            long r5 = com.google.android.gms.measurement.internal.zzy.O()     // Catch:{ all -> 0x0308 }
            long r3 = r3 - r5
            java.lang.String r0 = r0.G(r3)     // Catch:{ all -> 0x0308 }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0308 }
            if (r3 != 0) goto L_0x0302
            com.google.android.gms.measurement.internal.c r3 = r17.V()     // Catch:{ all -> 0x0308 }
            com.google.android.gms.measurement.internal.k3 r0 = r3.j0(r0)     // Catch:{ all -> 0x0308 }
            if (r0 == 0) goto L_0x0302
            r1.r(r0)     // Catch:{ all -> 0x0308 }
        L_0x0302:
            r1.r = r2
            r17.F()
            return
        L_0x0308:
            r0 = move-exception
            r1.r = r2
            r17.F()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkj.d0():void");
    }

    /* access modifiers changed from: protected */
    public final void e() {
        this.i.g().c();
        V().D0();
        if (this.i.A().f10375e.a() == 0) {
            this.i.A().f10375e.b(this.i.n().a());
        }
        m0();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final void e0() {
        j0();
        c0();
        if (!this.k) {
            this.k = true;
            if (G()) {
                int a2 = a(this.t);
                int H = this.i.R().H();
                j0();
                if (a2 > H) {
                    this.i.h().G().c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(a2), Integer.valueOf(H));
                } else if (a2 >= H) {
                } else {
                    if (C(H, this.t)) {
                        this.i.h().O().c("Storage version upgraded. Previous, current version", Integer.valueOf(a2), Integer.valueOf(H));
                    } else {
                        this.i.h().G().c("Storage version upgrade failed. Previous, current version", Integer.valueOf(a2), Integer.valueOf(H));
                    }
                }
            }
        }
    }

    public final Context f() {
        return this.i.f();
    }

    /* access modifiers changed from: package-private */
    public final void f0() {
        this.o++;
    }

    public final zzfv g() {
        return this.i.g();
    }

    /* access modifiers changed from: package-private */
    public final zzfy g0() {
        return this.i;
    }

    public final zzeu h() {
        return this.i.h();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final void i(int i2, Throwable th, byte[] bArr, String str) {
        c V;
        j0();
        c0();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.q = false;
                F();
                throw th2;
            }
        }
        List<Long> list = this.u;
        this.u = null;
        boolean z = true;
        if ((i2 == 200 || i2 == 204) && th == null) {
            try {
                this.i.A().f10375e.b(this.i.n().a());
                this.i.A().f10376f.b(0);
                m0();
                this.i.h().O().c("Successful upload. Got network response. code, size", Integer.valueOf(i2), Integer.valueOf(bArr.length));
                V().v0();
                try {
                    for (Long next : list) {
                        try {
                            V = V();
                            long longValue = next.longValue();
                            V.c();
                            V.s();
                            if (V.w().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e2) {
                            V.h().G().b("Failed to delete a bundle in a queue table", e2);
                            throw e2;
                        } catch (SQLiteException e3) {
                            if (this.v == null || !this.v.contains(next)) {
                                throw e3;
                            }
                        }
                    }
                    V().v();
                    V().A0();
                    this.v = null;
                    if (!T().y() || !l0()) {
                        this.w = -1;
                        m0();
                    } else {
                        d0();
                    }
                    this.l = 0;
                } catch (Throwable th3) {
                    V().A0();
                    throw th3;
                }
            } catch (SQLiteException e4) {
                this.i.h().G().b("Database error while trying to delete uploaded bundles", e4);
                this.l = this.i.n().b();
                this.i.h().O().b("Disable upload, time", Long.valueOf(this.l));
            }
        } else {
            this.i.h().O().c("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th);
            this.i.A().f10376f.b(this.i.n().a());
            if (i2 != 503) {
                if (i2 != 429) {
                    z = false;
                }
            }
            if (z) {
                this.i.A().g.b(this.i.n().a());
            }
            V().P(list);
            m0();
        }
        this.q = false;
        F();
    }

    public final zzx m() {
        return this.i.m();
    }

    public final Clock n() {
        return this.i.n();
    }

    /* access modifiers changed from: package-private */
    public final void p(zzao zzao, zzn zzn) {
        List<zzw> list;
        List<zzw> list2;
        List<zzw> list3;
        List<String> list4;
        zzao zzao2 = zzao;
        zzn zzn2 = zzn;
        Preconditions.k(zzn);
        Preconditions.g(zzn2.f10709b);
        j0();
        c0();
        String str = zzn2.f10709b;
        long j2 = zzao2.f10566e;
        Z();
        if (zzkn.S(zzao, zzn)) {
            if (!zzn2.i) {
                Q(zzn2);
                return;
            }
            if (this.i.x().C(str, zzaq.c0) && (list4 = zzn2.v) != null) {
                if (list4.contains(zzao2.f10563b)) {
                    Bundle B = zzao2.f10564c.B();
                    B.putLong("ga_safelisted", 1);
                    zzao2 = new zzao(zzao2.f10563b, new zzan(B), zzao2.f10565d, zzao2.f10566e);
                } else {
                    this.i.h().N().d("Dropping non-safelisted event. appId, event name, origin", str, zzao2.f10563b, zzao2.f10565d);
                    return;
                }
            }
            V().v0();
            try {
                c V = V();
                Preconditions.g(str);
                V.c();
                V.s();
                int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                if (i2 < 0) {
                    V.h().J().c("Invalid time querying timed out conditional properties", zzeu.x(str), Long.valueOf(j2));
                    list = Collections.emptyList();
                } else {
                    list = V.K("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j2)});
                }
                for (zzw next : list) {
                    if (next != null) {
                        this.i.h().O().d("User property timed out", next.f10715b, this.i.H().A(next.f10717d.f10701c), next.f10717d.u());
                        if (next.h != null) {
                            S(new zzao(next.h, j2), zzn2);
                        }
                        V().r0(str, next.f10717d.f10701c);
                    }
                }
                c V2 = V();
                Preconditions.g(str);
                V2.c();
                V2.s();
                if (i2 < 0) {
                    V2.h().J().c("Invalid time querying expired conditional properties", zzeu.x(str), Long.valueOf(j2));
                    list2 = Collections.emptyList();
                } else {
                    list2 = V2.K("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j2)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (zzw next2 : list2) {
                    if (next2 != null) {
                        this.i.h().O().d("User property expired", next2.f10715b, this.i.H().A(next2.f10717d.f10701c), next2.f10717d.u());
                        V().l0(str, next2.f10717d.f10701c);
                        if (next2.l != null) {
                            arrayList.add(next2.l);
                        }
                        V().r0(str, next2.f10717d.f10701c);
                    }
                }
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    S(new zzao((zzao) obj, j2), zzn2);
                }
                c V3 = V();
                String str2 = zzao2.f10563b;
                Preconditions.g(str);
                Preconditions.g(str2);
                V3.c();
                V3.s();
                if (i2 < 0) {
                    V3.h().J().d("Invalid time querying triggered conditional properties", zzeu.x(str), V3.e().w(str2), Long.valueOf(j2));
                    list3 = Collections.emptyList();
                } else {
                    list3 = V3.K("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j2)});
                }
                ArrayList arrayList2 = new ArrayList(list3.size());
                for (zzw next3 : list3) {
                    if (next3 != null) {
                        zzkq zzkq = next3.f10717d;
                        s7 s7Var = r4;
                        s7 s7Var2 = new s7(next3.f10715b, next3.f10716c, zzkq.f10701c, j2, zzkq.u());
                        if (V().S(s7Var)) {
                            this.i.h().O().d("User property triggered", next3.f10715b, this.i.H().A(s7Var.f10426c), s7Var.f10428e);
                        } else {
                            this.i.h().G().d("Too many active user properties, ignoring", zzeu.x(next3.f10715b), this.i.H().A(s7Var.f10426c), s7Var.f10428e);
                        }
                        if (next3.j != null) {
                            arrayList2.add(next3.j);
                        }
                        next3.f10717d = new zzkq(s7Var);
                        next3.f10719f = true;
                        V().T(next3);
                    }
                }
                S(zzao2, zzn2);
                int size2 = arrayList2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj2 = arrayList2.get(i4);
                    i4++;
                    S(new zzao((zzao) obj2, j2), zzn2);
                }
                V().v();
            } finally {
                V().A0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void q(zzao zzao, String str) {
        zzao zzao2 = zzao;
        k3 j0 = V().j0(str);
        if (j0 == null || TextUtils.isEmpty(j0.T())) {
            this.i.h().N().b("No app data available; dropping event", str);
            return;
        }
        Boolean I = I(j0);
        if (I == null) {
            if (!"_ui".equals(zzao2.f10563b)) {
                this.i.h().J().b("Could not find package. appId", zzeu.x(str));
            }
        } else if (!I.booleanValue()) {
            this.i.h().G().b("App version does not match; dropping event. appId", zzeu.x(str));
            return;
        }
        zzn zzn = r2;
        zzn zzn2 = new zzn(str, j0.A(), j0.T(), j0.V(), j0.X(), j0.Z(), j0.b0(), (String) null, j0.e0(), false, j0.M(), j0.k(), 0, 0, j0.l(), j0.m(), false, j0.D(), j0.n(), j0.d0(), j0.o(), (!zzlm.b() || !this.i.x().C(j0.t(), zzaq.o0)) ? null : j0.G());
        K(zzao2, zzn);
    }

    /* access modifiers changed from: package-private */
    public final void s(m7 m7Var) {
        this.n++;
    }

    /* access modifiers changed from: package-private */
    public final void v(zzkq zzkq, zzn zzn) {
        j0();
        c0();
        if (W(zzn)) {
            if (!zzn.i) {
                Q(zzn);
                return;
            }
            int x0 = this.i.G().x0(zzkq.f10701c);
            if (x0 != 0) {
                this.i.G();
                String H = zzkr.H(zzkq.f10701c, 24, true);
                String str = zzkq.f10701c;
                this.i.G().W(zzn.f10709b, x0, "_ev", H, str != null ? str.length() : 0);
                return;
            }
            int p0 = this.i.G().p0(zzkq.f10701c, zzkq.u());
            if (p0 != 0) {
                this.i.G();
                String H2 = zzkr.H(zzkq.f10701c, 24, true);
                Object u2 = zzkq.u();
                this.i.G().W(zzn.f10709b, p0, "_ev", H2, (u2 == null || (!(u2 instanceof String) && !(u2 instanceof CharSequence))) ? 0 : String.valueOf(u2).length());
                return;
            }
            Object y0 = this.i.G().y0(zzkq.f10701c, zzkq.u());
            if (y0 != null) {
                if ("_sid".equals(zzkq.f10701c)) {
                    long j2 = zzkq.f10702d;
                    String str2 = zzkq.g;
                    long j3 = 0;
                    s7 o0 = V().o0(zzn.f10709b, "_sno");
                    if (o0 != null) {
                        Object obj = o0.f10428e;
                        if (obj instanceof Long) {
                            j3 = ((Long) obj).longValue();
                            v(new zzkq("_sno", j2, Long.valueOf(j3 + 1), str2), zzn);
                        }
                    }
                    if (o0 != null) {
                        this.i.h().J().b("Retrieved last session number from database does not contain a valid (long) value", o0.f10428e);
                    }
                    h D = V().D(zzn.f10709b, "_s");
                    if (D != null) {
                        j3 = D.f10214c;
                        this.i.h().O().b("Backfill the session number. Last used session number", Long.valueOf(j3));
                    }
                    v(new zzkq("_sno", j2, Long.valueOf(j3 + 1), str2), zzn);
                }
                s7 s7Var = new s7(zzn.f10709b, zzkq.g, zzkq.f10701c, zzkq.f10702d, y0);
                this.i.h().O().c("Setting user property", this.i.H().A(s7Var.f10426c), y0);
                V().v0();
                try {
                    Q(zzn);
                    boolean S = V().S(s7Var);
                    V().v();
                    if (!S) {
                        this.i.h().G().c("Too many unique user properties are set. Ignoring user property", this.i.H().A(s7Var.f10426c), s7Var.f10428e);
                        this.i.G().W(zzn.f10709b, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    V().A0();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final void w(zzn zzn) {
        if (this.u != null) {
            ArrayList arrayList = new ArrayList();
            this.v = arrayList;
            arrayList.addAll(this.u);
        }
        c V = V();
        String str = zzn.f10709b;
        Preconditions.g(str);
        V.c();
        V.s();
        try {
            SQLiteDatabase w2 = V.w();
            String[] strArr = {str};
            int delete = w2.delete("apps", "app_id=?", strArr) + 0 + w2.delete("events", "app_id=?", strArr) + w2.delete("user_attributes", "app_id=?", strArr) + w2.delete("conditional_properties", "app_id=?", strArr) + w2.delete("raw_events", "app_id=?", strArr) + w2.delete("raw_events_metadata", "app_id=?", strArr) + w2.delete("queue", "app_id=?", strArr) + w2.delete("audience_filter_values", "app_id=?", strArr) + w2.delete("main_event_params", "app_id=?", strArr) + w2.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                V.h().O().c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e2) {
            V.h().G().c("Error resetting analytics data. appId, error", zzeu.x(str), e2);
        }
        if (zzn.i) {
            N(zzn);
        }
    }

    /* access modifiers changed from: package-private */
    public final void x(zzw zzw) {
        zzn d2 = d(zzw.f10715b);
        if (d2 != null) {
            y(zzw, d2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void y(zzw zzw, zzn zzn) {
        Preconditions.k(zzw);
        Preconditions.g(zzw.f10715b);
        Preconditions.k(zzw.f10716c);
        Preconditions.k(zzw.f10717d);
        Preconditions.g(zzw.f10717d.f10701c);
        j0();
        c0();
        if (W(zzn)) {
            if (!zzn.i) {
                Q(zzn);
                return;
            }
            zzw zzw2 = new zzw(zzw);
            boolean z = false;
            zzw2.f10719f = false;
            V().v0();
            try {
                zzw p0 = V().p0(zzw2.f10715b, zzw2.f10717d.f10701c);
                if (p0 != null && !p0.f10716c.equals(zzw2.f10716c)) {
                    this.i.h().J().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.i.H().A(zzw2.f10717d.f10701c), zzw2.f10716c, p0.f10716c);
                }
                if (p0 != null && p0.f10719f) {
                    zzw2.f10716c = p0.f10716c;
                    zzw2.f10718e = p0.f10718e;
                    zzw2.i = p0.i;
                    zzw2.g = p0.g;
                    zzw2.j = p0.j;
                    zzw2.f10719f = p0.f10719f;
                    zzw2.f10717d = new zzkq(zzw2.f10717d.f10701c, p0.f10717d.f10702d, zzw2.f10717d.u(), p0.f10717d.g);
                } else if (TextUtils.isEmpty(zzw2.g)) {
                    zzw2.f10717d = new zzkq(zzw2.f10717d.f10701c, zzw2.f10718e, zzw2.f10717d.u(), zzw2.f10717d.g);
                    zzw2.f10719f = true;
                    z = true;
                }
                if (zzw2.f10719f) {
                    zzkq zzkq = zzw2.f10717d;
                    s7 s7Var = new s7(zzw2.f10715b, zzw2.f10716c, zzkq.f10701c, zzkq.f10702d, zzkq.u());
                    if (V().S(s7Var)) {
                        this.i.h().N().d("User property updated immediately", zzw2.f10715b, this.i.H().A(s7Var.f10426c), s7Var.f10428e);
                    } else {
                        this.i.h().G().d("(2)Too many active user properties, ignoring", zzeu.x(zzw2.f10715b), this.i.H().A(s7Var.f10426c), s7Var.f10428e);
                    }
                    if (z && zzw2.j != null) {
                        S(new zzao(zzw2.j, zzw2.f10718e), zzn);
                    }
                }
                if (V().T(zzw2)) {
                    this.i.h().N().d("Conditional property added", zzw2.f10715b, this.i.H().A(zzw2.f10717d.f10701c), zzw2.f10717d.u());
                } else {
                    this.i.h().G().d("Too many conditional properties, ignoring", zzeu.x(zzw2.f10715b), this.i.H().A(zzw2.f10717d.f10701c), zzw2.f10717d.u());
                }
                V().v();
            } finally {
                V().A0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void z(Runnable runnable) {
        j0();
        if (this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(runnable);
    }

    private zzkj(zzko zzko, zzfy zzfy) {
        this.j = false;
        Preconditions.k(zzko);
        this.i = zzfy.a(zzko.f10699a, (zzae) null, (Long) null);
        this.w = -1;
        zzkn zzkn = new zzkn(this);
        zzkn.t();
        this.g = zzkn;
        zzfb zzfb = new zzfb(this);
        zzfb.t();
        this.f10690b = zzfb;
        zzfs zzfs = new zzfs(this);
        zzfs.t();
        this.f10689a = zzfs;
        this.i.g().z(new o7(this, zzko));
    }
}
