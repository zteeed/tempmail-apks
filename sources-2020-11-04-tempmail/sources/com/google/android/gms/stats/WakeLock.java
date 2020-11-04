package com.google.android.gms.stats;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.providers.PooledExecutorsProvider;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;

@ShowFirstParty
@ThreadSafe
@KeepForSdk
public class WakeLock {
    private static ScheduledExecutorService l;

    /* renamed from: a  reason: collision with root package name */
    private final Object f10746a;

    /* renamed from: b  reason: collision with root package name */
    private final PowerManager.WakeLock f10747b;

    /* renamed from: c  reason: collision with root package name */
    private WorkSource f10748c;

    /* renamed from: d  reason: collision with root package name */
    private final int f10749d;

    /* renamed from: e  reason: collision with root package name */
    private final String f10750e;

    /* renamed from: f  reason: collision with root package name */
    private final String f10751f;
    private final Context g;
    private boolean h;
    private final Map<String, Integer[]> i;
    private int j;
    private AtomicInteger k;

    public interface zza {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @KeepForSdk
    public WakeLock(Context context, int i2, String str) {
        this(context, i2, str, (String) null, context == null ? null : context.getPackageName());
    }

    private final String d(String str) {
        if (this.h) {
            return !TextUtils.isEmpty(str) ? str : this.f10751f;
        }
        return this.f10751f;
    }

    private final List<String> e() {
        return WorkSourceUtil.b(this.f10748c);
    }

    /* access modifiers changed from: private */
    public final void f(int i2) {
        if (this.f10747b.isHeld()) {
            try {
                this.f10747b.release();
            } catch (RuntimeException e2) {
                if (e2.getClass().equals(RuntimeException.class)) {
                    Log.e("WakeLock", String.valueOf(this.f10750e).concat(" was already released!"), e2);
                } else {
                    throw e2;
                }
            }
            this.f10747b.isHeld();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r2 == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (r13.j == 0) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        com.google.android.gms.common.stats.WakeLockTracker.a().c(r13.g, com.google.android.gms.common.stats.StatsUtils.a(r13.f10747b, r6), 7, r13.f10750e, r6, (java.lang.String) null, r13.f10749d, e(), r14);
        r13.j++;
     */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(long r14) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r13.k
            r0.incrementAndGet()
            r0 = 0
            java.lang.String r6 = r13.d(r0)
            java.lang.Object r0 = r13.f10746a
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.i     // Catch:{ all -> 0x0096 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0096 }
            r2 = 0
            if (r1 == 0) goto L_0x001a
            int r1 = r13.j     // Catch:{ all -> 0x0096 }
            if (r1 <= 0) goto L_0x0029
        L_0x001a:
            android.os.PowerManager$WakeLock r1 = r13.f10747b     // Catch:{ all -> 0x0096 }
            boolean r1 = r1.isHeld()     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x0029
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.i     // Catch:{ all -> 0x0096 }
            r1.clear()     // Catch:{ all -> 0x0096 }
            r13.j = r2     // Catch:{ all -> 0x0096 }
        L_0x0029:
            boolean r1 = r13.h     // Catch:{ all -> 0x0096 }
            r12 = 1
            if (r1 == 0) goto L_0x0056
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.i     // Catch:{ all -> 0x0096 }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x0096 }
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x0047
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.i     // Catch:{ all -> 0x0096 }
            java.lang.Integer[] r3 = new java.lang.Integer[r12]     // Catch:{ all -> 0x0096 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0096 }
            r3[r2] = r4     // Catch:{ all -> 0x0096 }
            r1.put(r6, r3)     // Catch:{ all -> 0x0096 }
            r2 = 1
            goto L_0x0054
        L_0x0047:
            r3 = r1[r2]     // Catch:{ all -> 0x0096 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0096 }
            int r3 = r3 + r12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0096 }
            r1[r2] = r3     // Catch:{ all -> 0x0096 }
        L_0x0054:
            if (r2 != 0) goto L_0x005e
        L_0x0056:
            boolean r1 = r13.h     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x007d
            int r1 = r13.j     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x007d
        L_0x005e:
            com.google.android.gms.common.stats.WakeLockTracker r1 = com.google.android.gms.common.stats.WakeLockTracker.a()     // Catch:{ all -> 0x0096 }
            android.content.Context r2 = r13.g     // Catch:{ all -> 0x0096 }
            android.os.PowerManager$WakeLock r3 = r13.f10747b     // Catch:{ all -> 0x0096 }
            java.lang.String r3 = com.google.android.gms.common.stats.StatsUtils.a(r3, r6)     // Catch:{ all -> 0x0096 }
            r4 = 7
            java.lang.String r5 = r13.f10750e     // Catch:{ all -> 0x0096 }
            r7 = 0
            int r8 = r13.f10749d     // Catch:{ all -> 0x0096 }
            java.util.List r9 = r13.e()     // Catch:{ all -> 0x0096 }
            r10 = r14
            r1.c(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0096 }
            int r1 = r13.j     // Catch:{ all -> 0x0096 }
            int r1 = r1 + r12
            r13.j = r1     // Catch:{ all -> 0x0096 }
        L_0x007d:
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            android.os.PowerManager$WakeLock r0 = r13.f10747b
            r0.acquire()
            r0 = 0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0095
            java.util.concurrent.ScheduledExecutorService r0 = l
            com.google.android.gms.stats.a r1 = new com.google.android.gms.stats.a
            r1.<init>(r13)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r14, r2)
        L_0x0095:
            return
        L_0x0096:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.stats.WakeLock.a(long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        if (r1 != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        if (r12.j == 1) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        com.google.android.gms.common.stats.WakeLockTracker.a().b(r12.g, com.google.android.gms.common.stats.StatsUtils.a(r12.f10747b, r6), 8, r12.f10750e, r6, (java.lang.String) null, r12.f10749d, e());
        r12.j--;
     */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b() {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r12.k
            int r0 = r0.decrementAndGet()
            if (r0 >= 0) goto L_0x0019
            java.lang.String r0 = "WakeLock"
            java.lang.String r1 = r12.f10750e
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = " release without a matched acquire!"
            java.lang.String r1 = r1.concat(r2)
            android.util.Log.e(r0, r1)
        L_0x0019:
            r0 = 0
            java.lang.String r6 = r12.d(r0)
            java.lang.Object r0 = r12.f10746a
            monitor-enter(r0)
            boolean r1 = r12.h     // Catch:{ all -> 0x007e }
            r10 = 1
            r11 = 0
            if (r1 == 0) goto L_0x0052
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r12.i     // Catch:{ all -> 0x007e }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x007e }
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch:{ all -> 0x007e }
            if (r1 != 0) goto L_0x0033
        L_0x0031:
            r1 = 0
            goto L_0x0050
        L_0x0033:
            r2 = r1[r11]     // Catch:{ all -> 0x007e }
            int r2 = r2.intValue()     // Catch:{ all -> 0x007e }
            if (r2 != r10) goto L_0x0042
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r12.i     // Catch:{ all -> 0x007e }
            r1.remove(r6)     // Catch:{ all -> 0x007e }
            r1 = 1
            goto L_0x0050
        L_0x0042:
            r2 = r1[r11]     // Catch:{ all -> 0x007e }
            int r2 = r2.intValue()     // Catch:{ all -> 0x007e }
            int r2 = r2 - r10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x007e }
            r1[r11] = r2     // Catch:{ all -> 0x007e }
            goto L_0x0031
        L_0x0050:
            if (r1 != 0) goto L_0x005a
        L_0x0052:
            boolean r1 = r12.h     // Catch:{ all -> 0x007e }
            if (r1 != 0) goto L_0x0079
            int r1 = r12.j     // Catch:{ all -> 0x007e }
            if (r1 != r10) goto L_0x0079
        L_0x005a:
            com.google.android.gms.common.stats.WakeLockTracker r1 = com.google.android.gms.common.stats.WakeLockTracker.a()     // Catch:{ all -> 0x007e }
            android.content.Context r2 = r12.g     // Catch:{ all -> 0x007e }
            android.os.PowerManager$WakeLock r3 = r12.f10747b     // Catch:{ all -> 0x007e }
            java.lang.String r3 = com.google.android.gms.common.stats.StatsUtils.a(r3, r6)     // Catch:{ all -> 0x007e }
            r4 = 8
            java.lang.String r5 = r12.f10750e     // Catch:{ all -> 0x007e }
            r7 = 0
            int r8 = r12.f10749d     // Catch:{ all -> 0x007e }
            java.util.List r9 = r12.e()     // Catch:{ all -> 0x007e }
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x007e }
            int r1 = r12.j     // Catch:{ all -> 0x007e }
            int r1 = r1 - r10
            r12.j = r1     // Catch:{ all -> 0x007e }
        L_0x0079:
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            r12.f(r11)
            return
        L_0x007e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.stats.WakeLock.b():void");
    }

    @KeepForSdk
    public void c(boolean z) {
        this.f10747b.setReferenceCounted(z);
        this.h = z;
    }

    private WakeLock(Context context, int i2, String str, String str2, String str3) {
        this(context, i2, str, (String) null, str3, (String) null);
    }

    @SuppressLint({"UnwrappedWakeLock"})
    private WakeLock(Context context, int i2, String str, String str2, String str3, String str4) {
        this.f10746a = this;
        this.h = true;
        this.i = new HashMap();
        Collections.synchronizedSet(new HashSet());
        this.k = new AtomicInteger(0);
        Preconditions.l(context, "WakeLock: context must not be null");
        Preconditions.h(str, "WakeLock: wakeLockName must not be empty");
        this.f10749d = i2;
        this.f10751f = null;
        this.g = context.getApplicationContext();
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            this.f10750e = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        } else {
            this.f10750e = str;
        }
        this.f10747b = ((PowerManager) context.getSystemService("power")).newWakeLock(i2, str);
        if (WorkSourceUtil.c(context)) {
            WorkSource a2 = WorkSourceUtil.a(context, Strings.a(str3) ? context.getPackageName() : str3);
            this.f10748c = a2;
            if (a2 != null && WorkSourceUtil.c(this.g)) {
                WorkSource workSource = this.f10748c;
                if (workSource != null) {
                    workSource.add(a2);
                } else {
                    this.f10748c = a2;
                }
                try {
                    this.f10747b.setWorkSource(this.f10748c);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e2) {
                    Log.wtf("WakeLock", e2.toString());
                }
            }
        }
        if (l == null) {
            l = PooledExecutorsProvider.a().a();
        }
    }
}
