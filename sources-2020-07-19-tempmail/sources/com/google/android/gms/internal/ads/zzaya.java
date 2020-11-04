package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzaya implements zzaxx {

    /* renamed from: a  reason: collision with root package name */
    private final Object f6042a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private boolean f6043b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Runnable> f6044c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private zzdvf<?> f6045d;
    @GuardedBy("lock")

    /* renamed from: e  reason: collision with root package name */
    private zzri f6046e = null;
    @GuardedBy("lock")

    /* renamed from: f  reason: collision with root package name */
    private SharedPreferences f6047f;
    @GuardedBy("lock")
    private SharedPreferences.Editor g;
    @GuardedBy("lock")
    private boolean h = true;
    @GuardedBy("lock")
    private String i;
    @GuardedBy("lock")
    private String j;
    @GuardedBy("lock")
    private boolean k = false;
    @GuardedBy("lock")
    private String l = "";
    @GuardedBy("lock")
    private long m = 0;
    @GuardedBy("lock")
    private long n = 0;
    @GuardedBy("lock")
    private long o = 0;
    @GuardedBy("lock")
    private int p = -1;
    @GuardedBy("lock")
    private int q = 0;
    @GuardedBy("lock")
    private Set<String> r = Collections.emptySet();
    @GuardedBy("lock")
    private JSONObject s = new JSONObject();
    @GuardedBy("lock")
    private boolean t = true;
    @GuardedBy("lock")
    private boolean u = true;
    @GuardedBy("lock")
    private String v = null;
    @GuardedBy("lock")
    private int w = -1;

    private final void b(Bundle bundle) {
        zzbbf.f6137a.execute(new g5(this));
    }

    private final void d() {
        zzdvf<?> zzdvf = this.f6045d;
        if (zzdvf != null && !zzdvf.isDone()) {
            try {
                this.f6045d.get(1, TimeUnit.SECONDS);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                zzbba.d("Interrupted while waiting for preferences loaded.", e2);
            } catch (CancellationException | ExecutionException | TimeoutException e3) {
                zzbba.c("Fail to initialize AdSharedPreferenceManager.", e3);
            }
        }
    }

    private final Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("listener_registration_bundle", true);
        synchronized (this.f6042a) {
            bundle.putBoolean("use_https", this.h);
            bundle.putBoolean("content_url_opted_out", this.t);
            bundle.putBoolean("content_vertical_opted_out", this.u);
            bundle.putBoolean("auto_collect_location", this.k);
            bundle.putInt("version_code", this.q);
            bundle.putStringArray("never_pool_slots", (String[]) this.r.toArray(new String[0]));
            bundle.putString("app_settings_json", this.l);
            bundle.putLong("app_settings_last_update_ms", this.m);
            bundle.putLong("app_last_background_time_ms", this.n);
            bundle.putInt("request_in_session_count", this.p);
            bundle.putLong("first_ad_req_time_ms", this.o);
            bundle.putString("native_advanced_settings", this.s.toString());
            bundle.putString("display_cutout", this.v);
            bundle.putInt("app_measurement_npa", this.w);
            if (this.i != null) {
                bundle.putString("content_url_hashes", this.i);
            }
            if (this.j != null) {
                bundle.putString("content_vertical_hashes", this.j);
            }
        }
        return bundle;
    }

    public final zzri A() {
        if (!this.f6043b) {
            return null;
        }
        if ((w() && q()) || !zzacf.f5578b.a().booleanValue()) {
            return null;
        }
        synchronized (this.f6042a) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.f6046e == null) {
                this.f6046e = new zzri();
            }
            this.f6046e.e();
            zzbba.h("start fetching content...");
            zzri zzri = this.f6046e;
            return zzri;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B(java.lang.String r4) {
        /*
            r3 = this;
            r3.d()
            java.lang.Object r0 = r3.f6042a
            monitor-enter(r0)
            if (r4 == 0) goto L_0x0032
            java.lang.String r1 = r3.j     // Catch:{ all -> 0x0034 }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0011
            goto L_0x0032
        L_0x0011:
            r3.j = r4     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r3.g     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0023
            android.content.SharedPreferences$Editor r1 = r3.g     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "content_vertical_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r3.g     // Catch:{ all -> 0x0034 }
            r1.apply()     // Catch:{ all -> 0x0034 }
        L_0x0023:
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x0034 }
            r1.<init>()     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "content_vertical_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0034 }
            r3.b(r1)     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaya.B(java.lang.String):void");
    }

    public final zzaxi C() {
        zzaxi zzaxi;
        d();
        synchronized (this.f6042a) {
            zzaxi = new zzaxi(this.l, this.m);
        }
        return zzaxi;
    }

    public final JSONObject D() {
        JSONObject jSONObject;
        d();
        synchronized (this.f6042a) {
            jSONObject = this.s;
        }
        return jSONObject;
    }

    public final void E(boolean z) {
        d();
        synchronized (this.f6042a) {
            if (this.t != z) {
                this.t = z;
                if (this.g != null) {
                    this.g.putBoolean("content_url_opted_out", z);
                    this.g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("content_url_opted_out", this.t);
                bundle.putBoolean("content_vertical_opted_out", this.u);
                b(bundle);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F(java.lang.String r6) {
        /*
            r5 = this;
            r5.d()
            java.lang.Object r0 = r5.f6042a
            monitor-enter(r0)
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzq.zzld()     // Catch:{ all -> 0x0060 }
            long r1 = r1.a()     // Catch:{ all -> 0x0060 }
            r5.m = r1     // Catch:{ all -> 0x0060 }
            if (r6 == 0) goto L_0x005e
            java.lang.String r3 = r5.l     // Catch:{ all -> 0x0060 }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x0060 }
            if (r3 == 0) goto L_0x001b
            goto L_0x005e
        L_0x001b:
            r5.l = r6     // Catch:{ all -> 0x0060 }
            android.content.SharedPreferences$Editor r3 = r5.g     // Catch:{ all -> 0x0060 }
            if (r3 == 0) goto L_0x0034
            android.content.SharedPreferences$Editor r3 = r5.g     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = "app_settings_json"
            r3.putString(r4, r6)     // Catch:{ all -> 0x0060 }
            android.content.SharedPreferences$Editor r3 = r5.g     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = "app_settings_last_update_ms"
            r3.putLong(r4, r1)     // Catch:{ all -> 0x0060 }
            android.content.SharedPreferences$Editor r3 = r5.g     // Catch:{ all -> 0x0060 }
            r3.apply()     // Catch:{ all -> 0x0060 }
        L_0x0034:
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x0060 }
            r3.<init>()     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = "app_settings_json"
            r3.putString(r4, r6)     // Catch:{ all -> 0x0060 }
            java.lang.String r6 = "app_settings_last_update_ms"
            r3.putLong(r6, r1)     // Catch:{ all -> 0x0060 }
            r5.b(r3)     // Catch:{ all -> 0x0060 }
            java.util.List<java.lang.Runnable> r6 = r5.f6044c     // Catch:{ all -> 0x0060 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0060 }
        L_0x004c:
            boolean r1 = r6.hasNext()     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x005c
            java.lang.Object r1 = r6.next()     // Catch:{ all -> 0x0060 }
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch:{ all -> 0x0060 }
            r1.run()     // Catch:{ all -> 0x0060 }
            goto L_0x004c
        L_0x005c:
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            return
        L_0x005e:
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            return
        L_0x0060:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaya.F(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000f, code lost:
        r4 = java.lang.String.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        if (r4.length() == 0) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        r4 = "admob__".concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r4 = new java.lang.String("admob__");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        r2.f6045d = com.google.android.gms.internal.ads.zzbbf.f6137a.g(new com.google.android.gms.internal.ads.e5(r2, r3, r4));
        r2.f6043b = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000a, code lost:
        if (r4 != null) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000c, code lost:
        r4 = "admob";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r3, java.lang.String r4, boolean r5) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f6042a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r2.f6047f     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return
        L_0x0009:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            if (r4 != 0) goto L_0x000f
            java.lang.String r4 = "admob"
            goto L_0x0025
        L_0x000f:
            java.lang.String r0 = "admob__"
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r1 = r4.length()
            if (r1 == 0) goto L_0x0020
            java.lang.String r4 = r0.concat(r4)
            goto L_0x0025
        L_0x0020:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r0)
        L_0x0025:
            com.google.android.gms.internal.ads.zzdvi r0 = com.google.android.gms.internal.ads.zzbbf.f6137a
            com.google.android.gms.internal.ads.e5 r1 = new com.google.android.gms.internal.ads.e5
            r1.<init>(r2, r3, r4)
            com.google.android.gms.internal.ads.zzdvf r3 = r0.g(r1)
            r2.f6045d = r3
            r2.f6043b = r5
            return
        L_0x0035:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaya.a(android.content.Context, java.lang.String, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.f6042a) {
            this.f6047f = sharedPreferences;
            this.g = edit;
            if (PlatformVersion.i()) {
                boolean isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            }
            this.h = this.f6047f.getBoolean("use_https", this.h);
            this.t = this.f6047f.getBoolean("content_url_opted_out", this.t);
            this.i = this.f6047f.getString("content_url_hashes", this.i);
            this.k = this.f6047f.getBoolean("auto_collect_location", this.k);
            this.u = this.f6047f.getBoolean("content_vertical_opted_out", this.u);
            this.j = this.f6047f.getString("content_vertical_hashes", this.j);
            this.q = this.f6047f.getInt("version_code", this.q);
            this.l = this.f6047f.getString("app_settings_json", this.l);
            this.m = this.f6047f.getLong("app_settings_last_update_ms", this.m);
            this.n = this.f6047f.getLong("app_last_background_time_ms", this.n);
            this.p = this.f6047f.getInt("request_in_session_count", this.p);
            this.o = this.f6047f.getLong("first_ad_req_time_ms", this.o);
            this.r = this.f6047f.getStringSet("never_pool_slots", this.r);
            this.v = this.f6047f.getString("display_cutout", this.v);
            this.w = this.f6047f.getInt("app_measurement_npa", this.w);
            try {
                this.s = new JSONObject(this.f6047f.getString("native_advanced_settings", "{}"));
            } catch (JSONException e2) {
                zzbba.d("Could not convert native advanced settings to json object", e2);
            }
            b(e());
        }
    }

    public final void f(String str, String str2, boolean z) {
        d();
        synchronized (this.f6042a) {
            JSONArray optJSONArray = this.s.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            int i2 = 0;
            while (true) {
                if (i2 < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    if (optJSONObject != null) {
                        if (!str2.equals(optJSONObject.optString("template_id"))) {
                            i2++;
                        } else if (!z || !optJSONObject.optBoolean("uses_media_view", false)) {
                            length = i2;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", zzq.zzld().a());
                optJSONArray.put(length, jSONObject);
                this.s.put(str, optJSONArray);
            } catch (JSONException e2) {
                zzbba.d("Could not update native advanced settings", e2);
            }
            if (this.g != null) {
                this.g.putString("native_advanced_settings", this.s.toString());
                this.g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", this.s.toString());
            b(bundle);
        }
    }

    public final int g() {
        int i2;
        d();
        synchronized (this.f6042a) {
            i2 = this.q;
        }
        return i2;
    }

    public final void h(int i2) {
        d();
        synchronized (this.f6042a) {
            if (this.p != i2) {
                this.p = i2;
                if (this.g != null) {
                    this.g.putInt("request_in_session_count", i2);
                    this.g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putInt("request_in_session_count", i2);
                b(bundle);
            }
        }
    }

    public final long i() {
        long j2;
        d();
        synchronized (this.f6042a) {
            j2 = this.o;
        }
        return j2;
    }

    public final boolean j() {
        boolean z;
        d();
        synchronized (this.f6042a) {
            z = this.k;
        }
        return z;
    }

    public final void k(long j2) {
        d();
        synchronized (this.f6042a) {
            if (this.n != j2) {
                this.n = j2;
                if (this.g != null) {
                    this.g.putLong("app_last_background_time_ms", j2);
                    this.g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putLong("app_last_background_time_ms", j2);
                b(bundle);
            }
        }
    }

    public final int l() {
        int i2;
        d();
        synchronized (this.f6042a) {
            i2 = this.p;
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(java.lang.String r4) {
        /*
            r3 = this;
            r3.d()
            java.lang.Object r0 = r3.f6042a
            monitor-enter(r0)
            if (r4 == 0) goto L_0x0032
            java.lang.String r1 = r3.i     // Catch:{ all -> 0x0034 }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0011
            goto L_0x0032
        L_0x0011:
            r3.i = r4     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r3.g     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0023
            android.content.SharedPreferences$Editor r1 = r3.g     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "content_url_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r3.g     // Catch:{ all -> 0x0034 }
            r1.apply()     // Catch:{ all -> 0x0034 }
        L_0x0023:
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x0034 }
            r1.<init>()     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "content_url_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0034 }
            r3.b(r1)     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaya.m(java.lang.String):void");
    }

    public final String n() {
        String str;
        d();
        synchronized (this.f6042a) {
            str = this.j;
        }
        return str;
    }

    public final long o() {
        long j2;
        d();
        synchronized (this.f6042a) {
            j2 = this.n;
        }
        return j2;
    }

    public final void p(int i2) {
        d();
        synchronized (this.f6042a) {
            if (this.q != i2) {
                this.q = i2;
                if (this.g != null) {
                    this.g.putInt("version_code", i2);
                    this.g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putInt("version_code", i2);
                b(bundle);
            }
        }
    }

    public final boolean q() {
        boolean z;
        d();
        synchronized (this.f6042a) {
            z = this.u;
        }
        return z;
    }

    public final void r(long j2) {
        d();
        synchronized (this.f6042a) {
            if (this.o != j2) {
                this.o = j2;
                if (this.g != null) {
                    this.g.putLong("first_ad_req_time_ms", j2);
                    this.g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putLong("first_ad_req_time_ms", j2);
                b(bundle);
            }
        }
    }

    public final void s(String str) {
        d();
        synchronized (this.f6042a) {
            if (!TextUtils.equals(this.v, str)) {
                this.v = str;
                if (this.g != null) {
                    this.g.putString("display_cutout", str);
                    this.g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putString("display_cutout", str);
                b(bundle);
            }
        }
    }

    public final String t() {
        String str;
        d();
        synchronized (this.f6042a) {
            str = this.i;
        }
        return str;
    }

    public final void u(boolean z) {
        d();
        synchronized (this.f6042a) {
            if (this.u != z) {
                this.u = z;
                if (this.g != null) {
                    this.g.putBoolean("content_vertical_opted_out", z);
                    this.g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("content_url_opted_out", this.t);
                bundle.putBoolean("content_vertical_opted_out", this.u);
                b(bundle);
            }
        }
    }

    public final String v() {
        String str;
        d();
        synchronized (this.f6042a) {
            str = this.v;
        }
        return str;
    }

    public final boolean w() {
        boolean z;
        d();
        synchronized (this.f6042a) {
            z = this.t;
        }
        return z;
    }

    public final void x(boolean z) {
        d();
        synchronized (this.f6042a) {
            if (this.k != z) {
                this.k = z;
                if (this.g != null) {
                    this.g.putBoolean("auto_collect_location", z);
                    this.g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("auto_collect_location", z);
                b(bundle);
            }
        }
    }

    public final void y(Runnable runnable) {
        this.f6044c.add(runnable);
    }

    public final void z() {
        d();
        synchronized (this.f6042a) {
            this.s = new JSONObject();
            if (this.g != null) {
                this.g.remove("native_advanced_settings");
                this.g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", "{}");
            b(bundle);
        }
    }
}
