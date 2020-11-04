package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ads.zzcf;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzex {
    private static final String r = "zzex";

    /* renamed from: a  reason: collision with root package name */
    protected Context f8852a;

    /* renamed from: b  reason: collision with root package name */
    private ExecutorService f8853b;

    /* renamed from: c  reason: collision with root package name */
    private DexClassLoader f8854c;

    /* renamed from: d  reason: collision with root package name */
    private zzei f8855d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f8856e;

    /* renamed from: f  reason: collision with root package name */
    private volatile AdvertisingIdClient f8857f = null;
    private volatile boolean g;
    private Future h;
    private boolean i;
    /* access modifiers changed from: private */
    public volatile zzcf.zza j;
    private Future k;
    private zzdu l;
    private boolean m;
    private boolean n;
    private Map<Pair<String, String>, zzgk> o;
    private boolean p;
    private zzev q;

    private zzex(Context context) {
        boolean z = false;
        this.g = false;
        this.h = null;
        this.j = null;
        this.k = null;
        this.m = false;
        this.n = false;
        this.p = false;
        Context applicationContext = context.getApplicationContext();
        z = applicationContext != null ? true : z;
        this.i = z;
        this.f8852a = z ? applicationContext : context;
        this.o = new HashMap();
        if (this.q == null) {
            this.q = new zzev(this.f8852a);
        }
    }

    /* access modifiers changed from: private */
    public final void B() {
        try {
            if (this.f8857f == null && this.i) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.f8852a);
                advertisingIdClient.start();
                this.f8857f = advertisingIdClient;
            }
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
            this.f8857f = null;
        }
    }

    private final zzcf.zza C() {
        try {
            return zzdpt.a(this.f8852a, this.f8852a.getPackageName(), Integer.toString(this.f8852a.getPackageManager().getPackageInfo(this.f8852a.getPackageName(), 0).versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|(1:4)|5|6|7|8|(1:10)(1:11)|12|(1:14)(1:15)|16|17|18|(2:20|(1:22)(2:23|24))|25|26|27|28|29|(2:31|(1:33)(2:34|35))|36|(1:38)|39|40|41|42|43|44|45|66) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004d */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056 A[Catch:{ zzeh -> 0x012f, zzeu -> 0x0136 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0087 A[Catch:{ all -> 0x00fe, FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b2 A[Catch:{ all -> 0x00fe, FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzex d(android.content.Context r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            java.lang.String r0 = "%s/%s.dex"
            com.google.android.gms.internal.ads.zzex r1 = new com.google.android.gms.internal.ads.zzex
            r1.<init>(r9)
            com.google.android.gms.internal.ads.ea0 r9 = new com.google.android.gms.internal.ads.ea0     // Catch:{ zzeu -> 0x0136 }
            r9.<init>()     // Catch:{ zzeu -> 0x0136 }
            java.util.concurrent.ExecutorService r9 = java.util.concurrent.Executors.newCachedThreadPool(r9)     // Catch:{ zzeu -> 0x0136 }
            r1.f8853b = r9     // Catch:{ zzeu -> 0x0136 }
            r1.g = r12     // Catch:{ zzeu -> 0x0136 }
            if (r12 == 0) goto L_0x0023
            java.util.concurrent.ExecutorService r9 = r1.f8853b     // Catch:{ zzeu -> 0x0136 }
            com.google.android.gms.internal.ads.ca0 r12 = new com.google.android.gms.internal.ads.ca0     // Catch:{ zzeu -> 0x0136 }
            r12.<init>(r1)     // Catch:{ zzeu -> 0x0136 }
            java.util.concurrent.Future r9 = r9.submit(r12)     // Catch:{ zzeu -> 0x0136 }
            r1.h = r9     // Catch:{ zzeu -> 0x0136 }
        L_0x0023:
            java.util.concurrent.ExecutorService r9 = r1.f8853b     // Catch:{ zzeu -> 0x0136 }
            com.google.android.gms.internal.ads.fa0 r12 = new com.google.android.gms.internal.ads.fa0     // Catch:{ zzeu -> 0x0136 }
            r12.<init>(r1)     // Catch:{ zzeu -> 0x0136 }
            r9.execute(r12)     // Catch:{ zzeu -> 0x0136 }
            r9 = 1
            r12 = 0
            com.google.android.gms.common.GoogleApiAvailabilityLight r2 = com.google.android.gms.common.GoogleApiAvailabilityLight.h()     // Catch:{ all -> 0x004d }
            android.content.Context r3 = r1.f8852a     // Catch:{ all -> 0x004d }
            int r3 = r2.b(r3)     // Catch:{ all -> 0x004d }
            if (r3 <= 0) goto L_0x003d
            r3 = 1
            goto L_0x003e
        L_0x003d:
            r3 = 0
        L_0x003e:
            r1.m = r3     // Catch:{ all -> 0x004d }
            android.content.Context r3 = r1.f8852a     // Catch:{ all -> 0x004d }
            int r2 = r2.i(r3)     // Catch:{ all -> 0x004d }
            if (r2 != 0) goto L_0x004a
            r2 = 1
            goto L_0x004b
        L_0x004a:
            r2 = 0
        L_0x004b:
            r1.n = r2     // Catch:{ all -> 0x004d }
        L_0x004d:
            r1.f(r12, r9)     // Catch:{ zzeu -> 0x0136 }
            boolean r2 = com.google.android.gms.internal.ads.zzfg.a()     // Catch:{ zzeu -> 0x0136 }
            if (r2 == 0) goto L_0x0071
            com.google.android.gms.internal.ads.zzaag<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.zzaav.i1     // Catch:{ zzeu -> 0x0136 }
            com.google.android.gms.internal.ads.zzaar r3 = com.google.android.gms.internal.ads.zzwg.e()     // Catch:{ zzeu -> 0x0136 }
            java.lang.Object r2 = r3.c(r2)     // Catch:{ zzeu -> 0x0136 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ zzeu -> 0x0136 }
            boolean r2 = r2.booleanValue()     // Catch:{ zzeu -> 0x0136 }
            if (r2 != 0) goto L_0x0069
            goto L_0x0071
        L_0x0069:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ zzeu -> 0x0136 }
            java.lang.String r10 = "Task Context initialization must not be called from the UI thread."
            r9.<init>(r10)     // Catch:{ zzeu -> 0x0136 }
            throw r9     // Catch:{ zzeu -> 0x0136 }
        L_0x0071:
            com.google.android.gms.internal.ads.zzei r2 = new com.google.android.gms.internal.ads.zzei     // Catch:{ zzeu -> 0x0136 }
            r3 = 0
            r2.<init>(r3)     // Catch:{ zzeu -> 0x0136 }
            r1.f8855d = r2     // Catch:{ zzeu -> 0x0136 }
            byte[] r10 = r2.c(r10)     // Catch:{ zzeh -> 0x012f }
            r1.f8856e = r10     // Catch:{ zzeh -> 0x012f }
            android.content.Context r10 = r1.f8852a     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            java.io.File r10 = r10.getCacheDir()     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            if (r10 != 0) goto L_0x0098
            android.content.Context r10 = r1.f8852a     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            java.lang.String r2 = "dex"
            java.io.File r10 = r10.getDir(r2, r12)     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            if (r10 == 0) goto L_0x0092
            goto L_0x0098
        L_0x0092:
            com.google.android.gms.internal.ads.zzeu r9 = new com.google.android.gms.internal.ads.zzeu     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            r9.<init>()     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            throw r9     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
        L_0x0098:
            java.lang.String r2 = "1584479576572"
            java.io.File r4 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            java.lang.String r5 = "%s/%s.jar"
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            r7[r12] = r10     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            r7[r9] = r2     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            java.lang.String r5 = java.lang.String.format(r5, r7)     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            boolean r5 = r4.exists()     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            if (r5 != 0) goto L_0x00c9
            com.google.android.gms.internal.ads.zzei r5 = r1.f8855d     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            byte[] r7 = r1.f8856e     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            byte[] r11 = r5.b(r7, r11)     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            r4.createNewFile()     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            r5.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            int r7 = r11.length     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            r5.write(r11, r12, r7)     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            r5.close()     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
        L_0x00c9:
            r1.n(r10, r2)     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            dalvik.system.DexClassLoader r11 = new dalvik.system.DexClassLoader     // Catch:{ all -> 0x00fe }
            java.lang.String r5 = r4.getAbsolutePath()     // Catch:{ all -> 0x00fe }
            java.lang.String r7 = r10.getAbsolutePath()     // Catch:{ all -> 0x00fe }
            android.content.Context r8 = r1.f8852a     // Catch:{ all -> 0x00fe }
            java.lang.ClassLoader r8 = r8.getClassLoader()     // Catch:{ all -> 0x00fe }
            r11.<init>(r5, r7, r3, r8)     // Catch:{ all -> 0x00fe }
            r1.f8854c = r11     // Catch:{ all -> 0x00fe }
            p(r4)     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            r1.h(r10, r2)     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            r11[r12] = r10     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            r11[r9] = r2     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            java.lang.String r10 = java.lang.String.format(r0, r11)     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            k(r10)     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            com.google.android.gms.internal.ads.zzdu r10 = new com.google.android.gms.internal.ads.zzdu     // Catch:{ zzeu -> 0x0136 }
            r10.<init>(r1)     // Catch:{ zzeu -> 0x0136 }
            r1.l = r10     // Catch:{ zzeu -> 0x0136 }
            r1.p = r9     // Catch:{ zzeu -> 0x0136 }
            goto L_0x0136
        L_0x00fe:
            r11 = move-exception
            p(r4)     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            r1.h(r10, r2)     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            r3[r12] = r10     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            r3[r9] = r2     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            java.lang.String r9 = java.lang.String.format(r0, r3)     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            k(r9)     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
            throw r11     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x0121, zzeh -> 0x011a, NullPointerException -> 0x0113 }
        L_0x0113:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzeu r10 = new com.google.android.gms.internal.ads.zzeu     // Catch:{ zzeu -> 0x0136 }
            r10.<init>(r9)     // Catch:{ zzeu -> 0x0136 }
            throw r10     // Catch:{ zzeu -> 0x0136 }
        L_0x011a:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzeu r10 = new com.google.android.gms.internal.ads.zzeu     // Catch:{ zzeu -> 0x0136 }
            r10.<init>(r9)     // Catch:{ zzeu -> 0x0136 }
            throw r10     // Catch:{ zzeu -> 0x0136 }
        L_0x0121:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzeu r10 = new com.google.android.gms.internal.ads.zzeu     // Catch:{ zzeu -> 0x0136 }
            r10.<init>(r9)     // Catch:{ zzeu -> 0x0136 }
            throw r10     // Catch:{ zzeu -> 0x0136 }
        L_0x0128:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzeu r10 = new com.google.android.gms.internal.ads.zzeu     // Catch:{ zzeu -> 0x0136 }
            r10.<init>(r9)     // Catch:{ zzeu -> 0x0136 }
            throw r10     // Catch:{ zzeu -> 0x0136 }
        L_0x012f:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzeu r10 = new com.google.android.gms.internal.ads.zzeu     // Catch:{ zzeu -> 0x0136 }
            r10.<init>(r9)     // Catch:{ zzeu -> 0x0136 }
            throw r10     // Catch:{ zzeu -> 0x0136 }
        L_0x0136:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzex.d(android.content.Context, java.lang.String, java.lang.String, boolean):com.google.android.gms.internal.ads.zzex");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:22|23|24|25|26|27|28|30) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00bd */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d1 A[SYNTHETIC, Splitter:B:42:0x00d1] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d8 A[SYNTHETIC, Splitter:B:46:0x00d8] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e2 A[SYNTHETIC, Splitter:B:54:0x00e2] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e9 A[SYNTHETIC, Splitter:B:58:0x00e9] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void h(java.io.File r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "test"
            java.io.File r1 = new java.io.File
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r10
            r5 = 1
            r3[r5] = r11
            java.lang.String r6 = "%s/%s.tmp"
            java.lang.String r3 = java.lang.String.format(r6, r3)
            r1.<init>(r3)
            boolean r3 = r1.exists()
            if (r3 == 0) goto L_0x001d
            return
        L_0x001d:
            java.io.File r3 = new java.io.File
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r10
            r2[r5] = r11
            java.lang.String r10 = "%s/%s.dex"
            java.lang.String r10 = java.lang.String.format(r10, r2)
            r3.<init>(r10)
            boolean r10 = r3.exists()
            if (r10 != 0) goto L_0x0035
            return
        L_0x0035:
            long r5 = r3.length()
            r7 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 > 0) goto L_0x0040
            return
        L_0x0040:
            int r10 = (int) r5
            byte[] r10 = new byte[r10]
            r2 = 0
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cd }
            r5.<init>(r3)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cd }
            int r6 = r5.read(r10)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            if (r6 > 0) goto L_0x0056
            r5.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            p(r3)
            return
        L_0x0056:
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            r6.print(r0)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            r6.print(r0)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            r6.print(r0)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzcf$zzc$zza r0 = com.google.android.gms.internal.ads.zzcf.zzc.Q()     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            byte[] r6 = r6.getBytes()     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzeer r6 = com.google.android.gms.internal.ads.zzeer.U(r6)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            r0.z(r6)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            byte[] r11 = r11.getBytes()     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzeer r11 = com.google.android.gms.internal.ads.zzeer.U(r11)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            r0.y(r11)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzei r11 = r9.f8855d     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            byte[] r6 = r9.f8856e     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            java.lang.String r10 = r11.d(r6, r10)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            byte[] r10 = r10.getBytes()     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzeer r11 = com.google.android.gms.internal.ads.zzeer.U(r10)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            r0.w(r11)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            byte[] r10 = com.google.android.gms.internal.ads.bq.e(r10)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzeer r10 = com.google.android.gms.internal.ads.zzeer.U(r10)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            r0.x(r10)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            r1.createNewFile()     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            r10.<init>(r1)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzehl r11 = r0.O()     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c4 }
            com.google.android.gms.internal.ads.zzegb r11 = (com.google.android.gms.internal.ads.zzegb) r11     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c4 }
            com.google.android.gms.internal.ads.zzcf$zzc r11 = (com.google.android.gms.internal.ads.zzcf.zzc) r11     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c4 }
            byte[] r11 = r11.g()     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c4 }
            int r0 = r11.length     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c4 }
            r10.write(r11, r4, r0)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c4 }
            r10.close()     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c4 }
            r5.close()     // Catch:{ IOException -> 0x00bd }
        L_0x00bd:
            r10.close()     // Catch:{ IOException -> 0x00c0 }
        L_0x00c0:
            p(r3)
            return
        L_0x00c4:
            r11 = move-exception
            goto L_0x00c8
        L_0x00c6:
            r11 = move-exception
            r10 = r2
        L_0x00c8:
            r2 = r5
            goto L_0x00cf
        L_0x00ca:
            r10 = r2
        L_0x00cb:
            r2 = r5
            goto L_0x00e0
        L_0x00cd:
            r11 = move-exception
            r10 = r2
        L_0x00cf:
            if (r2 == 0) goto L_0x00d6
            r2.close()     // Catch:{ IOException -> 0x00d5 }
            goto L_0x00d6
        L_0x00d5:
        L_0x00d6:
            if (r10 == 0) goto L_0x00db
            r10.close()     // Catch:{ IOException -> 0x00db }
        L_0x00db:
            p(r3)
            throw r11
        L_0x00df:
            r10 = r2
        L_0x00e0:
            if (r2 == 0) goto L_0x00e7
            r2.close()     // Catch:{ IOException -> 0x00e6 }
            goto L_0x00e7
        L_0x00e6:
        L_0x00e7:
            if (r10 == 0) goto L_0x00ec
            r10.close()     // Catch:{ IOException -> 0x00ec }
        L_0x00ec:
            p(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzex.h(java.io.File, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    public static boolean i(int i2, zzcf.zza zza) {
        if (i2 >= 4) {
            return false;
        }
        if (zza != null && zza.j0() && !zza.c0().equals("0000000000000000000000000000000000000000000000000000000000000000") && zza.t0() && zza.u0().G() && zza.u0().H() != -2) {
            return false;
        }
        return true;
    }

    private static void k(String str) {
        p(new File(str));
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00cc */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e4 A[SYNTHETIC, Splitter:B:55:0x00e4] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00eb A[SYNTHETIC, Splitter:B:59:0x00eb] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f2 A[SYNTHETIC, Splitter:B:66:0x00f2] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00f9 A[SYNTHETIC, Splitter:B:70:0x00f9] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean n(java.io.File r10, java.lang.String r11) {
        /*
            r9 = this;
            java.io.File r0 = new java.io.File
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r10
            r4 = 1
            r2[r4] = r11
            java.lang.String r5 = "%s/%s.tmp"
            java.lang.String r2 = java.lang.String.format(r5, r2)
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 != 0) goto L_0x001b
            return r3
        L_0x001b:
            java.io.File r2 = new java.io.File
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r10
            r1[r4] = r11
            java.lang.String r10 = "%s/%s.dex"
            java.lang.String r10 = java.lang.String.format(r10, r1)
            r2.<init>(r10)
            boolean r10 = r2.exists()
            if (r10 == 0) goto L_0x0033
            return r3
        L_0x0033:
            r10 = 0
            long r5 = r0.length()     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ef, all -> 0x00e0 }
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x0042
            p(r0)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ef, all -> 0x00e0 }
            return r3
        L_0x0042:
            int r1 = (int) r5     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ef, all -> 0x00e0 }
            byte[] r1 = new byte[r1]     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ef, all -> 0x00e0 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ef, all -> 0x00e0 }
            r5.<init>(r0)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00ef, all -> 0x00e0 }
            int r6 = r5.read(r1)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            if (r6 > 0) goto L_0x005e
            java.lang.String r11 = r     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            java.lang.String r1 = "Cannot read the cache data."
            android.util.Log.d(r11, r1)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            p(r0)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            r5.close()     // Catch:{ IOException -> 0x005d }
        L_0x005d:
            return r3
        L_0x005e:
            com.google.android.gms.internal.ads.zzefo r6 = com.google.android.gms.internal.ads.zzefo.c()     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzcf$zzc r1 = com.google.android.gms.internal.ads.zzcf.zzc.H(r1, r6)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            java.lang.String r6 = new java.lang.String     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzeer r7 = r1.N()     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            byte[] r7 = r7.c()     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            r6.<init>(r7)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            boolean r11 = r11.equals(r6)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            if (r11 == 0) goto L_0x00d2
            com.google.android.gms.internal.ads.zzeer r11 = r1.M()     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            byte[] r11 = r11.c()     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzeer r6 = r1.L()     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            byte[] r6 = r6.c()     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            byte[] r6 = com.google.android.gms.internal.ads.bq.e(r6)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            boolean r11 = java.util.Arrays.equals(r11, r6)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            if (r11 == 0) goto L_0x00d2
            com.google.android.gms.internal.ads.zzeer r11 = r1.P()     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            byte[] r11 = r11.c()     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            byte[] r6 = r6.getBytes()     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            boolean r11 = java.util.Arrays.equals(r11, r6)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            if (r11 != 0) goto L_0x00a8
            goto L_0x00d2
        L_0x00a8:
            com.google.android.gms.internal.ads.zzei r11 = r9.f8855d     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            byte[] r0 = r9.f8856e     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            java.lang.String r6 = new java.lang.String     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzeer r1 = r1.L()     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            byte[] r1 = r1.c()     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            r6.<init>(r1)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            byte[] r11 = r11.b(r0, r6)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            r2.createNewFile()     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            r0.<init>(r2)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            int r10 = r11.length     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00d0 }
            r0.write(r11, r3, r10)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00d0 }
            r5.close()     // Catch:{ IOException -> 0x00cc }
        L_0x00cc:
            r0.close()     // Catch:{ IOException -> 0x00cf }
        L_0x00cf:
            return r4
        L_0x00d0:
            r11 = move-exception
            goto L_0x00db
        L_0x00d2:
            p(r0)     // Catch:{ zzeh | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            r5.close()     // Catch:{ IOException -> 0x00d8 }
        L_0x00d8:
            return r3
        L_0x00d9:
            r11 = move-exception
            r0 = r10
        L_0x00db:
            r10 = r5
            goto L_0x00e2
        L_0x00dd:
            r0 = r10
        L_0x00de:
            r10 = r5
            goto L_0x00f0
        L_0x00e0:
            r11 = move-exception
            r0 = r10
        L_0x00e2:
            if (r10 == 0) goto L_0x00e9
            r10.close()     // Catch:{ IOException -> 0x00e8 }
            goto L_0x00e9
        L_0x00e8:
        L_0x00e9:
            if (r0 == 0) goto L_0x00ee
            r0.close()     // Catch:{ IOException -> 0x00ee }
        L_0x00ee:
            throw r11
        L_0x00ef:
            r0 = r10
        L_0x00f0:
            if (r10 == 0) goto L_0x00f7
            r10.close()     // Catch:{ IOException -> 0x00f6 }
            goto L_0x00f7
        L_0x00f6:
        L_0x00f7:
            if (r0 == 0) goto L_0x00fc
            r0.close()     // Catch:{ IOException -> 0x00fc }
        L_0x00fc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzex.n(java.io.File, java.lang.String):boolean");
    }

    private static void p(File file) {
        if (!file.exists()) {
            Log.d(r, String.format("File %s not found. No need for deletion", new Object[]{file.getAbsolutePath()}));
            return;
        }
        file.delete();
    }

    public final Future A() {
        return this.k;
    }

    public final AdvertisingIdClient D() {
        if (!this.g) {
            return null;
        }
        if (this.f8857f != null) {
            return this.f8857f;
        }
        Future future = this.h;
        if (future != null) {
            try {
                future.get(2000, TimeUnit.MILLISECONDS);
                this.h = null;
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
                this.h.cancel(true);
            }
        }
        return this.f8857f;
    }

    public final Context a() {
        return this.f8852a;
    }

    public final boolean b() {
        return this.p;
    }

    public final Method e(String str, String str2) {
        zzgk zzgk = this.o.get(new Pair(str, str2));
        if (zzgk == null) {
            return null;
        }
        return zzgk.d();
    }

    /* access modifiers changed from: package-private */
    public final void f(int i2, boolean z) {
        if (this.n) {
            Future<?> submit = this.f8853b.submit(new ga0(this, i2, z));
            if (i2 == 0) {
                this.k = submit;
            }
        }
    }

    public final boolean j(String str, String str2, Class<?>... clsArr) {
        if (this.o.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.o.put(new Pair(str, str2), new zzgk(this, str, str2, clsArr));
        return true;
    }

    /* access modifiers changed from: package-private */
    public final zzcf.zza l(int i2, boolean z) {
        if (i2 > 0 && z) {
            try {
                Thread.sleep((long) (i2 * 1000));
            } catch (InterruptedException unused) {
            }
        }
        return C();
    }

    public final int o() {
        if (this.l != null) {
            return zzdu.e();
        }
        return Integer.MIN_VALUE;
    }

    public final boolean q() {
        return this.q.a();
    }

    public final ExecutorService r() {
        return this.f8853b;
    }

    public final DexClassLoader s() {
        return this.f8854c;
    }

    public final zzei t() {
        return this.f8855d;
    }

    public final byte[] u() {
        return this.f8856e;
    }

    public final boolean v() {
        return this.m;
    }

    public final zzdu w() {
        return this.l;
    }

    public final boolean x() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public final zzev y() {
        return this.q;
    }

    public final zzcf.zza z() {
        return this.j;
    }
}
