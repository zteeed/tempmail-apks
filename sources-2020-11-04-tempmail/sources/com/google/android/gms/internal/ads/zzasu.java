package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzasu {
    private int A;
    private String B;
    private boolean C;

    /* renamed from: a  reason: collision with root package name */
    private int f6111a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6112b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6113c;

    /* renamed from: d  reason: collision with root package name */
    private int f6114d;

    /* renamed from: e  reason: collision with root package name */
    private int f6115e;

    /* renamed from: f  reason: collision with root package name */
    private int f6116f;
    private String g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private int l;
    private double m;
    private boolean n;
    private String o;
    private String p;
    private boolean q;
    private boolean r;
    private String s;
    private boolean t;
    private final boolean u;
    private boolean v;
    private String w;
    private String x;
    private float y;
    private int z;

    public zzasu(Context context) {
        DisplayMetrics displayMetrics;
        PackageManager packageManager = context.getPackageManager();
        c(context);
        e(context);
        f(context);
        Locale locale = Locale.getDefault();
        boolean z2 = true;
        this.q = a(packageManager, "geo:0,0?q=donuts") != null;
        this.r = a(packageManager, "http://www.google.com") == null ? false : z2;
        this.s = locale.getCountry();
        zzwg.a();
        this.t = zzbaq.x();
        this.u = DeviceProperties.a(context);
        this.v = DeviceProperties.b(context);
        this.w = locale.getLanguage();
        this.x = b(context, packageManager);
        this.B = g(context);
        Resources resources = context.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            this.y = displayMetrics.density;
            this.z = displayMetrics.widthPixels;
            this.A = displayMetrics.heightPixels;
        }
    }

    private static ResolveInfo a(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            zzq.zzla().e(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    private static String b(Context context, PackageManager packageManager) {
        ActivityInfo activityInfo;
        ResolveInfo a2 = a(packageManager, "market://details?id=com.google.android.gms.ads");
        if (a2 == null || (activityInfo = a2.activityInfo) == null) {
            return null;
        }
        try {
            PackageInfo e2 = Wrappers.a(context).e(activityInfo.packageName, 0);
            if (e2 != null) {
                int i2 = e2.versionCode;
                String str = activityInfo.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i2);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    private final void c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f6111a = audioManager.getMode();
                this.f6112b = audioManager.isMusicActive();
                this.f6113c = audioManager.isSpeakerphoneOn();
                this.f6114d = audioManager.getStreamVolume(3);
                this.f6115e = audioManager.getRingerMode();
                this.f6116f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                zzq.zzla().e(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f6111a = -2;
        this.f6112b = false;
        this.f6113c = false;
        this.f6114d = 0;
        this.f6115e = 2;
        this.f6116f = 0;
    }

    @TargetApi(16)
    private final void e(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.g = telephonyManager.getNetworkOperator();
        this.i = telephonyManager.getNetworkType();
        this.j = telephonyManager.getPhoneType();
        this.h = -2;
        this.k = false;
        this.l = -1;
        zzq.zzkw();
        if (zzaye.l0(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.h = activeNetworkInfo.getType();
                this.l = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.h = -1;
            }
            this.k = connectivityManager.isActiveNetworkMetered();
        }
    }

    private final void f(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z2 = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.m = (double) (((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
            if (intExtra == 2 || intExtra == 5) {
                z2 = true;
            }
            this.n = z2;
            return;
        }
        this.m = -1.0d;
        this.n = false;
    }

    private static String g(Context context) {
        try {
            PackageInfo e2 = Wrappers.a(context).e("com.android.vending", 128);
            if (e2 != null) {
                int i2 = e2.versionCode;
                String str = e2.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i2);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final zzasr d() {
        return new zzasr(this.f6111a, this.q, this.r, this.g, this.s, this.t, this.u, this.v, this.f6112b, this.f6113c, this.w, this.x, this.B, this.f6114d, this.h, this.i, this.j, this.f6115e, this.f6116f, this.y, this.z, this.A, this.m, this.n, this.k, this.l, this.o, this.C, this.p);
    }

    public zzasu(Context context, zzasr zzasr) {
        c(context);
        e(context);
        f(context);
        this.o = Build.FINGERPRINT;
        this.p = Build.DEVICE;
        this.C = PlatformVersion.b() && zzabs.a(context);
        this.q = zzasr.f6098a;
        this.r = zzasr.f6099b;
        this.s = zzasr.f6100c;
        this.t = zzasr.f6101d;
        this.u = zzasr.f6102e;
        this.v = zzasr.f6103f;
        this.w = zzasr.g;
        this.x = zzasr.h;
        this.B = zzasr.i;
        this.y = zzasr.l;
        this.z = zzasr.m;
        this.A = zzasr.n;
    }
}
