package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.zza;
import java.util.List;

@KeepForSdk
public class WakeLockTracker {

    /* renamed from: a  reason: collision with root package name */
    private static WakeLockTracker f3114a = new WakeLockTracker();

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f3115b;

    @KeepForSdk
    public static WakeLockTracker a() {
        return f3114a;
    }

    private static void d(Context context, WakeLockEvent wakeLockEvent) {
        try {
            context.startService(new Intent().setComponent(LoggingConstants.f3108a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", wakeLockEvent));
        } catch (Exception e2) {
            Log.wtf("WakeLockTracker", e2);
        }
    }

    private static boolean e() {
        if (f3115b == null) {
            f3115b = Boolean.FALSE;
        }
        return f3115b.booleanValue();
    }

    @KeepForSdk
    public void b(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list) {
        c(context, str, i, str2, str3, str4, i2, list, 0);
    }

    @KeepForSdk
    public void c(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list, long j) {
        int i3 = i;
        if (e()) {
            if (TextUtils.isEmpty(str)) {
                String valueOf = String.valueOf(str);
                Log.e("WakeLockTracker", valueOf.length() != 0 ? "missing wakeLock key. ".concat(valueOf) : new String("missing wakeLock key. "));
            } else if (7 == i3 || 8 == i3 || 10 == i3 || 11 == i3) {
                WakeLockEvent wakeLockEvent = r0;
                WakeLockEvent wakeLockEvent2 = new WakeLockEvent(System.currentTimeMillis(), i, str2, i2, StatsUtils.b(list), str, SystemClock.elapsedRealtime(), zza.a(context), str3, StatsUtils.c(context.getPackageName()), zza.b(context), j, str4, false);
                d(context, wakeLockEvent);
            }
        }
    }
}
