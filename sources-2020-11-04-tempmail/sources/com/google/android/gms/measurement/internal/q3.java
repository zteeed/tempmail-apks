package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class q3 extends s4 {
    @VisibleForTesting
    static final Pair<String, Long> D = new Pair<>("", 0L);
    public final zzfm A = new zzfm(this, "deferred_attribution_cache", (String) null);
    public final zzfk B = new zzfk(this, "deferred_attribution_cache_timestamp", 0);
    public final zzfl C = new zzfl(this, "default_event_parameters", (Bundle) null);

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f10373c;

    /* renamed from: d  reason: collision with root package name */
    public zzfn f10374d;

    /* renamed from: e  reason: collision with root package name */
    public final zzfk f10375e = new zzfk(this, "last_upload", 0);

    /* renamed from: f  reason: collision with root package name */
    public final zzfk f10376f = new zzfk(this, "last_upload_attempt", 0);
    public final zzfk g = new zzfk(this, "backoff", 0);
    public final zzfk h = new zzfk(this, "last_delete_stale", 0);
    public final zzfk i = new zzfk(this, "midnight_offset", 0);
    public final zzfk j = new zzfk(this, "first_open_time", 0);
    public final zzfk k = new zzfk(this, "app_install_time", 0);
    public final zzfm l = new zzfm(this, "app_instance_id", (String) null);
    private String m;
    private boolean n;
    private long o;
    public final zzfk p = new zzfk(this, "time_before_start", 10000);
    public final zzfk q = new zzfk(this, "session_timeout", 1800000);
    public final zzfi r = new zzfi(this, "start_new_session", true);
    public final zzfm s = new zzfm(this, "non_personalized_ads", (String) null);
    public final zzfi t = new zzfi(this, "allow_remote_dynamite", false);
    public final zzfk u = new zzfk(this, "last_pause_time", 0);
    public boolean v;
    public zzfi w = new zzfi(this, "app_backgrounded", false);
    public zzfi x = new zzfi(this, "deep_link_retrieval_complete", false);
    public zzfk y = new zzfk(this, "deep_link_retrieval_attempts", 0);
    public final zzfm z = new zzfm(this, "firebase_feature_rollouts", (String) null);

    q3(zzfy zzfy) {
        super(zzfy);
    }

    /* access modifiers changed from: package-private */
    public final void A(boolean z2) {
        c();
        h().O().b("App measurement setting deferred collection", Boolean.valueOf(z2));
        SharedPreferences.Editor edit = C().edit();
        edit.putBoolean("deferred_analytics_collection", z2);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final void B(String str) {
        c();
        SharedPreferences.Editor edit = C().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    public final SharedPreferences C() {
        c();
        p();
        return this.f10373c;
    }

    /* access modifiers changed from: package-private */
    public final String D() {
        c();
        return C().getString("gmp_app_id", (String) null);
    }

    /* access modifiers changed from: package-private */
    public final String E() {
        c();
        return C().getString("admob_app_id", (String) null);
    }

    /* access modifiers changed from: package-private */
    public final Boolean F() {
        c();
        if (!C().contains("use_service")) {
            return null;
        }
        return Boolean.valueOf(C().getBoolean("use_service", false));
    }

    /* access modifiers changed from: package-private */
    public final void G() {
        c();
        Boolean H = H();
        SharedPreferences.Editor edit = C().edit();
        edit.clear();
        edit.apply();
        if (H != null) {
            y(H.booleanValue());
        }
    }

    /* access modifiers changed from: package-private */
    public final Boolean H() {
        c();
        if (C().contains("measurement_enabled")) {
            return Boolean.valueOf(C().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final String I() {
        c();
        String string = C().getString("previous_os_version", (String) null);
        d().p();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = C().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    /* access modifiers changed from: package-private */
    public final boolean J() {
        return this.f10373c.contains("deferred_analytics_collection");
    }

    /* access modifiers changed from: protected */
    public final void o() {
        SharedPreferences sharedPreferences = f().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f10373c = sharedPreferences;
        boolean z2 = sharedPreferences.getBoolean("has_been_opened", false);
        this.v = z2;
        if (!z2) {
            SharedPreferences.Editor edit = this.f10373c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f10374d = new zzfn(this, "health_monitor", Math.max(0, zzaq.f10569c.a(null).longValue()));
    }

    /* access modifiers changed from: protected */
    public final boolean s() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Pair<String, Boolean> u(String str) {
        c();
        long b2 = n().b();
        if (this.m != null && b2 < this.o) {
            return new Pair<>(this.m, Boolean.valueOf(this.n));
        }
        this.o = b2 + l().q(str, zzaq.f10568b);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(f());
            if (advertisingIdInfo != null) {
                this.m = advertisingIdInfo.getId();
                this.n = advertisingIdInfo.isLimitAdTrackingEnabled();
            }
            if (this.m == null) {
                this.m = "";
            }
        } catch (Exception e2) {
            h().N().b("Unable to get advertising id", e2);
            this.m = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.m, Boolean.valueOf(this.n));
    }

    /* access modifiers changed from: package-private */
    public final void v(boolean z2) {
        c();
        SharedPreferences.Editor edit = C().edit();
        edit.putBoolean("use_service", z2);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final boolean w(long j2) {
        return j2 - this.q.a() > this.u.a();
    }

    /* access modifiers changed from: package-private */
    public final String x(String str) {
        c();
        String str2 = (String) u(str).first;
        MessageDigest J0 = zzkr.J0();
        if (J0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, J0.digest(str2.getBytes()))});
    }

    /* access modifiers changed from: package-private */
    public final void y(boolean z2) {
        c();
        SharedPreferences.Editor edit = C().edit();
        edit.putBoolean("measurement_enabled", z2);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final void z(String str) {
        c();
        SharedPreferences.Editor edit = C().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }
}
