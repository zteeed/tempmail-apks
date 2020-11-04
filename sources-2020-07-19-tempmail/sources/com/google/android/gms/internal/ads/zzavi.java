package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzejv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzavi implements zzavr {
    /* access modifiers changed from: private */
    public static List<Future<Void>> n = Collections.synchronizedList(new ArrayList());
    @GuardedBy("lock")

    /* renamed from: a  reason: collision with root package name */
    private final zzejv.zzb.zza f5985a;
    @GuardedBy("lock")

    /* renamed from: b  reason: collision with root package name */
    private final LinkedHashMap<String, zzejv.zzb.zzh.C0084zzb> f5986b;
    @GuardedBy("lock")

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f5987c = new ArrayList();
    @GuardedBy("lock")

    /* renamed from: d  reason: collision with root package name */
    private final List<String> f5988d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final Context f5989e;

    /* renamed from: f  reason: collision with root package name */
    private final zzavt f5990f;
    private boolean g;
    private final zzavq h;
    private final d4 i;
    private final Object j = new Object();
    private HashSet<String> k = new HashSet<>();
    private boolean l = false;
    private boolean m = false;

    public zzavi(Context context, zzbbd zzbbd, zzavq zzavq, String str, zzavt zzavt) {
        Preconditions.l(zzavq, "SafeBrowsing config is not present.");
        this.f5989e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f5986b = new LinkedHashMap<>();
        this.f5990f = zzavt;
        this.h = zzavq;
        for (String lowerCase : zzavq.f5995f) {
            this.k.add(lowerCase.toLowerCase(Locale.ENGLISH));
        }
        this.k.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzejv.zzb.zza d0 = zzejv.zzb.d0();
        d0.z(zzejv.zzb.zzg.OCTAGON_AD);
        d0.I(str);
        d0.L(str);
        zzejv.zzb.C0080zzb.zza H = zzejv.zzb.C0080zzb.H();
        String str2 = this.h.f5991b;
        if (str2 != null) {
            H.w(str2);
        }
        d0.x((zzejv.zzb.C0080zzb) ((zzegb) H.O()));
        zzejv.zzb.zzi.zza L = zzejv.zzb.zzi.L();
        L.w(Wrappers.a(this.f5989e).g());
        String str3 = zzbbd.f6131b;
        if (str3 != null) {
            L.y(str3);
        }
        long b2 = (long) GoogleApiAvailabilityLight.h().b(this.f5989e);
        if (b2 > 0) {
            L.x(b2);
        }
        d0.D((zzejv.zzb.zzi) ((zzegb) L.O()));
        this.f5985a = d0;
        this.i = new d4(this.f5989e, this.h.i, this);
    }

    private final zzejv.zzb.zzh.C0084zzb l(String str) {
        zzejv.zzb.zzh.C0084zzb zzb;
        synchronized (this.j) {
            zzb = this.f5986b.get(str);
        }
        return zzb;
    }

    static final /* synthetic */ Void m(String str) {
        return null;
    }

    private final zzdvf<Void> o() {
        zzdvf<Void> i2;
        if (!((this.g && this.h.h) || (this.m && this.h.g) || (!this.g && this.h.f5994e))) {
            return zzdux.g(null);
        }
        synchronized (this.j) {
            for (zzejv.zzb.zzh.C0084zzb O : this.f5986b.values()) {
                this.f5985a.C((zzejv.zzb.zzh) ((zzegb) O.O()));
            }
            this.f5985a.P(this.f5987c);
            this.f5985a.Q(this.f5988d);
            if (zzavs.a()) {
                String w = this.f5985a.w();
                String F = this.f5985a.F();
                StringBuilder sb = new StringBuilder(String.valueOf(w).length() + 53 + String.valueOf(F).length());
                sb.append("Sending SB report\n  url: ");
                sb.append(w);
                sb.append("\n  clickUrl: ");
                sb.append(F);
                sb.append("\n  resources: \n");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                for (zzejv.zzb.zzh next : this.f5985a.E()) {
                    sb2.append("    [");
                    sb2.append(next.T());
                    sb2.append("] ");
                    sb2.append(next.G());
                }
                zzavs.b(sb2.toString());
            }
            zzdvf<String> a2 = new zzazq(this.f5989e).a(1, this.h.f5992c, (Map<String, String>) null, ((zzejv.zzb) ((zzegb) this.f5985a.O())).g());
            if (zzavs.a()) {
                a2.f(z3.f5432b, zzbbf.f6137a);
            }
            i2 = zzdux.i(a2, c4.f3516a, zzbbf.f6142f);
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, int r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.j
            monitor-enter(r0)
            r1 = 3
            if (r9 != r1) goto L_0x0009
            r2 = 1
            r6.m = r2     // Catch:{ all -> 0x00bb }
        L_0x0009:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.zzejv$zzb$zzh$zzb> r2 = r6.f5986b     // Catch:{ all -> 0x00bb }
            boolean r2 = r2.containsKey(r7)     // Catch:{ all -> 0x00bb }
            if (r2 == 0) goto L_0x0024
            if (r9 != r1) goto L_0x0022
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.zzejv$zzb$zzh$zzb> r8 = r6.f5986b     // Catch:{ all -> 0x00bb }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.zzejv$zzb$zzh$zzb r7 = (com.google.android.gms.internal.ads.zzejv.zzb.zzh.C0084zzb) r7     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.zzejv$zzb$zzh$zza r8 = com.google.android.gms.internal.ads.zzejv.zzb.zzh.zza.f(r9)     // Catch:{ all -> 0x00bb }
            r7.x(r8)     // Catch:{ all -> 0x00bb }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            return
        L_0x0024:
            com.google.android.gms.internal.ads.zzejv$zzb$zzh$zzb r1 = com.google.android.gms.internal.ads.zzejv.zzb.zzh.U()     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.zzejv$zzb$zzh$zza r9 = com.google.android.gms.internal.ads.zzejv.zzb.zzh.zza.f(r9)     // Catch:{ all -> 0x00bb }
            if (r9 == 0) goto L_0x0031
            r1.x(r9)     // Catch:{ all -> 0x00bb }
        L_0x0031:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.zzejv$zzb$zzh$zzb> r9 = r6.f5986b     // Catch:{ all -> 0x00bb }
            int r9 = r9.size()     // Catch:{ all -> 0x00bb }
            r1.y(r9)     // Catch:{ all -> 0x00bb }
            r1.z(r7)     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.zzejv$zzb$zzd$zza r9 = com.google.android.gms.internal.ads.zzejv.zzb.zzd.I()     // Catch:{ all -> 0x00bb }
            java.util.HashSet<java.lang.String> r2 = r6.k     // Catch:{ all -> 0x00bb }
            int r2 = r2.size()     // Catch:{ all -> 0x00bb }
            if (r2 <= 0) goto L_0x00a9
            if (r8 == 0) goto L_0x00a9
            java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x00bb }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x00bb }
        L_0x0053:
            boolean r2 = r8.hasNext()     // Catch:{ all -> 0x00bb }
            if (r2 == 0) goto L_0x00a9
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x00bb }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x00bb }
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x00bb }
            if (r3 == 0) goto L_0x006c
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x00bb }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00bb }
            goto L_0x006e
        L_0x006c:
            java.lang.String r3 = ""
        L_0x006e:
            java.lang.Object r4 = r2.getValue()     // Catch:{ all -> 0x00bb }
            if (r4 == 0) goto L_0x007b
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x00bb }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00bb }
            goto L_0x007d
        L_0x007b:
            java.lang.String r2 = ""
        L_0x007d:
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x00bb }
            java.lang.String r4 = r3.toLowerCase(r4)     // Catch:{ all -> 0x00bb }
            java.util.HashSet<java.lang.String> r5 = r6.k     // Catch:{ all -> 0x00bb }
            boolean r4 = r5.contains(r4)     // Catch:{ all -> 0x00bb }
            if (r4 == 0) goto L_0x0053
            com.google.android.gms.internal.ads.zzejv$zzb$zzc$zza r4 = com.google.android.gms.internal.ads.zzejv.zzb.zzc.M()     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.zzeer r3 = com.google.android.gms.internal.ads.zzeer.N(r3)     // Catch:{ all -> 0x00bb }
            r4.w(r3)     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.zzeer r2 = com.google.android.gms.internal.ads.zzeer.N(r2)     // Catch:{ all -> 0x00bb }
            r4.x(r2)     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.zzehl r2 = r4.O()     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.zzegb r2 = (com.google.android.gms.internal.ads.zzegb) r2     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.zzejv$zzb$zzc r2 = (com.google.android.gms.internal.ads.zzejv.zzb.zzc) r2     // Catch:{ all -> 0x00bb }
            r9.w(r2)     // Catch:{ all -> 0x00bb }
            goto L_0x0053
        L_0x00a9:
            com.google.android.gms.internal.ads.zzehl r8 = r9.O()     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.zzegb r8 = (com.google.android.gms.internal.ads.zzegb) r8     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.zzejv$zzb$zzd r8 = (com.google.android.gms.internal.ads.zzejv.zzb.zzd) r8     // Catch:{ all -> 0x00bb }
            r1.w(r8)     // Catch:{ all -> 0x00bb }
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.zzejv$zzb$zzh$zzb> r8 = r6.f5986b     // Catch:{ all -> 0x00bb }
            r8.put(r7, r1)     // Catch:{ all -> 0x00bb }
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            return
        L_0x00bb:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavi.a(java.lang.String, java.util.Map, int):void");
    }

    public final void b() {
        synchronized (this.j) {
            zzdvf<O> j2 = zzdux.j(this.f5990f.a(this.f5989e, this.f5986b.keySet()), new a4(this), zzbbf.f6142f);
            zzdvf<O> d2 = zzdux.d(j2, 10, TimeUnit.SECONDS, zzbbf.f6140d);
            zzdux.f(j2, new b4(this, d2), zzbbf.f6142f);
            n.add(d2);
        }
    }

    public final void c() {
    }

    public final void d(View view) {
        if (this.h.f5993d && !this.l) {
            zzq.zzkw();
            Bitmap g0 = zzaye.g0(view);
            if (g0 == null) {
                zzavs.b("Failed to capture the webview bitmap.");
                return;
            }
            this.l = true;
            zzaye.O(new y3(this, g0));
        }
    }

    public final String[] e(String[] strArr) {
        return (String[]) this.i.a(strArr).toArray(new String[0]);
    }

    public final void f(String str) {
        synchronized (this.j) {
            if (str == null) {
                this.f5985a.H();
            } else {
                this.f5985a.M(str);
            }
        }
    }

    public final boolean g() {
        return PlatformVersion.f() && this.h.f5993d && !this.l;
    }

    public final zzavq h() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void i(Bitmap bitmap) {
        zzefa y = zzeer.y();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, y);
        synchronized (this.j) {
            zzejv.zzb.zza zza = this.f5985a;
            zzejv.zzb.zzf.zza P = zzejv.zzb.zzf.P();
            P.x(y.b());
            P.y("image/png");
            P.w(zzejv.zzb.zzf.C0083zzb.TYPE_CREATIVE);
            zza.y((zzejv.zzb.zzf) ((zzegb) P.O()));
        }
    }

    /* access modifiers changed from: package-private */
    public final void j(String str) {
        synchronized (this.j) {
            this.f5987c.add(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final void k(String str) {
        synchronized (this.j) {
            this.f5988d.add(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf n(Map map) throws Exception {
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.j) {
                            int length = optJSONArray.length();
                            zzejv.zzb.zzh.C0084zzb l2 = l(str);
                            if (l2 == null) {
                                String valueOf = String.valueOf(str);
                                zzavs.b(valueOf.length() != 0 ? "Cannot find the corresponding resource object for ".concat(valueOf) : new String("Cannot find the corresponding resource object for "));
                            } else {
                                boolean z = false;
                                for (int i2 = 0; i2 < length; i2++) {
                                    l2.C(optJSONArray.getJSONObject(i2).getString("threat_type"));
                                }
                                boolean z2 = this.g;
                                if (length > 0) {
                                    z = true;
                                }
                                this.g = z | z2;
                            }
                        }
                    }
                }
            } catch (JSONException e2) {
                if (zzacr.f5611a.a().booleanValue()) {
                    zzbba.b("Failed to get SafeBrowsing metadata", e2);
                }
                return zzdux.a(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.g) {
            synchronized (this.j) {
                this.f5985a.z(zzejv.zzb.zzg.OCTAGON_AD_SB_MATCH);
            }
        }
        return o();
    }
}
