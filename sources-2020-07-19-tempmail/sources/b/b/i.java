package b.b;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import b.b.a;
import b.b.b;
import b.b.b0;
import b.b.i0;
import b.b.n;
import b.b.x;
import com.google.android.gms.common.GoogleApiAvailability;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.NetworkInterface;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public class i implements t {
    private static String A = null;
    private static String B = null;
    static final String C;
    private static final List<String> D = Arrays.asList(new String[]{"is_cache"});
    /* access modifiers changed from: private */
    public static final List<String> E = Arrays.asList(new String[]{"googleplay", "playstore", "googleplaystore"});
    /* access modifiers changed from: private */
    public static h F = null;
    private static k G = null;
    private static i H = new i();
    static final String x = "4";
    private static final String y;
    private static String z;

    /* renamed from: a  reason: collision with root package name */
    private long f2020a = -1;

    /* renamed from: b  reason: collision with root package name */
    private long f2021b = -1;

    /* renamed from: c  reason: collision with root package name */
    private long f2022c = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: d  reason: collision with root package name */
    private u f2023d = null;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Map<String, String> f2024e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f2025f = false;
    /* access modifiers changed from: private */
    public long g;
    /* access modifiers changed from: private */
    public ScheduledExecutorService h = null;
    private long i;
    private long j;
    private b0.b k;
    String l;
    String m;
    protected Uri n = null;
    private long o;
    private boolean p = false;
    private boolean q = false;
    private String r;
    private boolean s;
    private boolean t;
    private f0 u = new f0();
    private boolean v = false;
    private boolean w = false;

    class a implements i0.a {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ Map f2026a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ WeakReference f2027b;

        a(i iVar, Map map, WeakReference weakReference) {
            this.f2026a = map;
            this.f2027b = weakReference;
        }

        private void c(Map<String, String> map) {
            if (this.f2027b.get() != null) {
                i.X((Context) this.f2027b.get(), "deeplinkAttribution", new JSONObject(map).toString());
            }
        }

        public final void a(String str) {
            if (i.F != null) {
                c(this.f2026a);
                i.F.c(str);
            }
        }

        public final void b(Map<String, String> map) {
            for (String next : map.keySet()) {
                this.f2026a.put(next, map.get(next));
            }
            c(this.f2026a);
            i.y(this.f2026a);
        }
    }

    class b implements b0.b {
        b(i iVar) {
        }

        public final void a(WeakReference<Context> weakReference) {
            a.C0057a.a(weakReference.get());
            y c2 = y.c(weakReference.get());
            c2.f2096a.post(c2.j);
        }

        public final void b(Activity activity) {
            if (2 > i.r(i.M(activity))) {
                y c2 = y.c(activity);
                c2.f2096a.post(c2.j);
                c2.f2096a.post(c2.i);
            }
            e.c("onBecameForeground");
            i.e().b0();
            i.e().x(activity, (String) null, (Map<String, Object>) null);
            e.g();
        }
    }

    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final Intent f2028b;

        /* renamed from: c  reason: collision with root package name */
        private final String f2029c;

        /* renamed from: d  reason: collision with root package name */
        private WeakReference<Context> f2030d;

        /* renamed from: e  reason: collision with root package name */
        private String f2031e;

        /* renamed from: f  reason: collision with root package name */
        private String f2032f;
        private String g;
        private String h;
        private boolean i;
        private boolean j;

        /* synthetic */ c(i iVar, WeakReference weakReference, String str, String str2, String str3, String str4, boolean z, Intent intent, String str5, byte b2) {
            this(weakReference, str, str2, str3, str4, z, intent, str5);
        }

        public final void run() {
            i.n0(i.this, this.f2030d.get(), this.f2031e, this.f2032f, this.g, this.h, this.i, this.j, this.f2028b, this.f2029c);
        }

        private c(WeakReference<Context> weakReference, String str, String str2, String str3, String str4, boolean z, Intent intent, String str5) {
            this.f2030d = weakReference;
            this.f2031e = str;
            this.f2032f = str2;
            this.g = str3;
            this.h = str4;
            this.i = true;
            this.j = z;
            this.f2028b = intent;
            this.f2029c = str5;
        }
    }

    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private String f2033b;

        /* renamed from: c  reason: collision with root package name */
        private WeakReference<Context> f2034c;

        /* renamed from: d  reason: collision with root package name */
        private Map<String, Object> f2035d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f2036e;

        /* renamed from: f  reason: collision with root package name */
        private int f2037f;

        /* synthetic */ d(i iVar, String str, Map map, Context context, boolean z, int i, byte b2) {
            this(str, map, context, z, i);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
            b.b.e.b(r0.getMessage(), r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x006e, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x006f, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0070, code lost:
            b.b.e.b("Exception while sending request to server. ", r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0075, code lost:
            if (r0 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0085, code lost:
            b.b.s.a.d().a(new b.b.s.b(r9.f2033b, r0, "4.9.0"), r9.f2034c.get());
            b.b.e.b(r1.getMessage(), r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r9 = this;
                b.b.i r0 = b.b.i.this
                boolean r0 = r0.j()
                if (r0 == 0) goto L_0x0009
                return
            L_0x0009:
                r0 = 0
                boolean r1 = r9.f2036e
                if (r1 == 0) goto L_0x0028
                int r1 = r9.f2037f
                r2 = 2
                if (r1 > r2) goto L_0x0028
                b.b.i r1 = b.b.i.this
                boolean r1 = b.b.i.q0(r1)
                if (r1 == 0) goto L_0x0028
                java.util.Map<java.lang.String, java.lang.Object> r1 = r9.f2035d
                java.lang.String r2 = "rfr"
                b.b.i r3 = b.b.i.this
                java.util.Map r3 = r3.f2024e
                r1.put(r2, r3)
            L_0x0028:
                java.util.Map<java.lang.String, java.lang.Object> r1 = r9.f2035d
                b.b.p$a r2 = new b.b.p$a
                java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f2035d
                java.lang.ref.WeakReference<android.content.Context> r4 = r9.f2034c
                java.lang.Object r4 = r4.get()
                android.content.Context r4 = (android.content.Context) r4
                r2.<init>(r3, r4)
                r1.putAll(r2)
                java.util.Map<java.lang.String, java.lang.Object> r1 = r9.f2035d     // Catch:{ IOException -> 0x006f, all -> 0x0066 }
                java.lang.String r2 = "appsflyerKey"
                java.lang.Object r1 = r1.get(r2)     // Catch:{ IOException -> 0x006f, all -> 0x0066 }
                r5 = r1
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x006f, all -> 0x0066 }
                java.util.Map<java.lang.String, java.lang.Object> r1 = r9.f2035d     // Catch:{ IOException -> 0x006f, all -> 0x0066 }
                monitor-enter(r1)     // Catch:{ IOException -> 0x006f, all -> 0x0066 }
                java.util.Map<java.lang.String, java.lang.Object> r2 = r9.f2035d     // Catch:{ all -> 0x0063 }
                org.json.JSONObject r2 = b.b.c.a(r2)     // Catch:{ all -> 0x0063 }
                java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0063 }
                monitor-exit(r1)     // Catch:{ all -> 0x0063 }
                b.b.i r2 = b.b.i.this     // Catch:{ IOException -> 0x006f, all -> 0x0066 }
                java.lang.String r3 = r9.f2033b     // Catch:{ IOException -> 0x006f, all -> 0x0066 }
                java.lang.ref.WeakReference<android.content.Context> r6 = r9.f2034c     // Catch:{ IOException -> 0x006f, all -> 0x0066 }
                r7 = 0
                boolean r8 = r9.f2036e     // Catch:{ IOException -> 0x006f, all -> 0x0066 }
                r4 = r0
                b.b.i.o0(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ IOException -> 0x006f, all -> 0x0066 }
                return
            L_0x0063:
                r2 = move-exception
                monitor-exit(r1)     // Catch:{ IOException -> 0x006f, all -> 0x0066 }
                throw r2     // Catch:{ IOException -> 0x006f, all -> 0x0066 }
            L_0x0066:
                r0 = move-exception
                java.lang.String r1 = r0.getMessage()
                b.b.e.b(r1, r0)
                return
            L_0x006f:
                r1 = move-exception
                java.lang.String r2 = "Exception while sending request to server. "
                b.b.e.b(r2, r1)
                if (r0 == 0) goto L_0x00a4
                java.lang.ref.WeakReference<android.content.Context> r2 = r9.f2034c
                if (r2 == 0) goto L_0x00a4
                java.lang.String r2 = r9.f2033b
                java.lang.String r3 = "&isCachedRequest=true&timeincache="
                boolean r2 = r2.contains(r3)
                if (r2 != 0) goto L_0x00a4
                b.b.s.a r2 = b.b.s.a.d()
                b.b.s.b r3 = new b.b.s.b
                java.lang.String r4 = r9.f2033b
                java.lang.String r5 = "4.9.0"
                r3.<init>(r4, r0, r5)
                java.lang.ref.WeakReference<android.content.Context> r0 = r9.f2034c
                java.lang.Object r0 = r0.get()
                android.content.Context r0 = (android.content.Context) r0
                r2.a(r3, r0)
                java.lang.String r0 = r1.getMessage()
                b.b.e.b(r0, r1)
            L_0x00a4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b.b.i.d.run():void");
        }

        private d(String str, Map<String, Object> map, Context context, boolean z, int i) {
            this.f2034c = null;
            this.f2033b = str;
            this.f2035d = map;
            this.f2034c = new WeakReference<>(context);
            this.f2036e = z;
            this.f2037f = i;
        }
    }

    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<Context> f2038b = null;

        public e(Context context) {
            this.f2038b = new WeakReference<>(context);
        }

        public final void run() {
            if (!i.this.f2025f) {
                long unused = i.this.g = System.currentTimeMillis();
                if (this.f2038b != null) {
                    boolean unused2 = i.this.f2025f = true;
                    try {
                        String s = j.b().g("AppsFlyerKey");
                        synchronized (this.f2038b) {
                            for (b.b.s.b next : b.b.s.a.d().c(this.f2038b.get())) {
                                StringBuilder sb = new StringBuilder("resending request: ");
                                sb.append(next.c());
                                e.c(sb.toString());
                                try {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    long parseLong = Long.parseLong(next.a(), 10);
                                    i iVar = i.this;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(next.c());
                                    sb2.append("&isCachedRequest=true&timeincache=");
                                    sb2.append(Long.toString((currentTimeMillis - parseLong) / 1000));
                                    i.o0(iVar, sb2.toString(), next.b(), s, this.f2038b, next.a(), false);
                                } catch (Exception e2) {
                                    e.b("Failed to resend cached request", e2);
                                }
                            }
                        }
                    } catch (Exception e3) {
                        try {
                            e.b("failed to check cache. ", e3);
                        } catch (Throwable th) {
                            boolean unused3 = i.this.f2025f = false;
                            throw th;
                        }
                    }
                    boolean unused4 = i.this.f2025f = false;
                    i.this.h.shutdown();
                    ScheduledExecutorService unused5 = i.this.h = null;
                }
            }
        }
    }

    abstract class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        WeakReference<Context> f2040b = null;

        /* renamed from: c  reason: collision with root package name */
        private String f2041c;

        /* renamed from: d  reason: collision with root package name */
        private ScheduledExecutorService f2042d;

        /* renamed from: e  reason: collision with root package name */
        private AtomicInteger f2043e = new AtomicInteger(0);

        f(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
            this.f2040b = new WeakReference<>(context);
            this.f2041c = str;
            if (scheduledExecutorService == null) {
                this.f2042d = b.a().f();
            } else {
                this.f2042d = scheduledExecutorService;
            }
        }

        /* access modifiers changed from: protected */
        public abstract void a(Map<String, String> map);

        public abstract String b();

        /* access modifiers changed from: protected */
        public abstract void c(String str, int i);

        /* JADX WARNING: Removed duplicated region for block: B:28:0x00f6 A[Catch:{ z -> 0x01ce, all -> 0x020f }] */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x01d8 A[Catch:{ z -> 0x01ce, all -> 0x020f }] */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x020b  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x0219 A[Catch:{ all -> 0x0237 }] */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x022e A[DONT_GENERATE] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r13 = this;
                java.lang.String r0 = "af_siteid"
                java.lang.String r1 = r13.f2041c
                if (r1 == 0) goto L_0x0243
                int r1 = r1.length()
                if (r1 != 0) goto L_0x000e
                goto L_0x0243
            L_0x000e:
                b.b.i r1 = b.b.i.this
                boolean r1 = r1.j()
                if (r1 == 0) goto L_0x0017
                return
            L_0x0017:
                java.util.concurrent.atomic.AtomicInteger r1 = r13.f2043e
                r1.incrementAndGet()
                r1 = 0
                r2 = 0
                java.lang.ref.WeakReference<android.content.Context> r3 = r13.f2040b     // Catch:{ all -> 0x0212 }
                java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0212 }
                android.content.Context r3 = (android.content.Context) r3     // Catch:{ all -> 0x0212 }
                if (r3 != 0) goto L_0x002e
                java.util.concurrent.atomic.AtomicInteger r0 = r13.f2043e
                r0.decrementAndGet()
                return
            L_0x002e:
                long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0212 }
                java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0212 }
                r6.<init>(r3)     // Catch:{ all -> 0x0212 }
                java.lang.String r6 = b.b.i.C(r6)     // Catch:{ all -> 0x0212 }
                java.lang.String r6 = b.b.i.s0(r3, r6)     // Catch:{ all -> 0x0212 }
                java.lang.String r7 = ""
                r8 = 1
                if (r6 == 0) goto L_0x006a
                java.util.List r9 = b.b.i.E     // Catch:{ all -> 0x0212 }
                java.lang.String r10 = r6.toLowerCase()     // Catch:{ all -> 0x0212 }
                boolean r9 = r9.contains(r10)     // Catch:{ all -> 0x0212 }
                if (r9 != 0) goto L_0x005d
                java.lang.String r9 = "-"
                java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0212 }
                java.lang.String r6 = r9.concat(r6)     // Catch:{ all -> 0x0212 }
                goto L_0x006b
            L_0x005d:
                java.lang.String r9 = "AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix."
                java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ all -> 0x0212 }
                r10[r2] = r6     // Catch:{ all -> 0x0212 }
                java.lang.String r6 = java.lang.String.format(r9, r10)     // Catch:{ all -> 0x0212 }
                b.b.e.f(r6)     // Catch:{ all -> 0x0212 }
            L_0x006a:
                r6 = r7
            L_0x006b:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0212 }
                r9.<init>()     // Catch:{ all -> 0x0212 }
                java.lang.String r10 = r13.b()     // Catch:{ all -> 0x0212 }
                r9.append(r10)     // Catch:{ all -> 0x0212 }
                java.lang.String r10 = r3.getPackageName()     // Catch:{ all -> 0x0212 }
                r9.append(r10)     // Catch:{ all -> 0x0212 }
                r9.append(r6)     // Catch:{ all -> 0x0212 }
                java.lang.String r6 = "?devkey="
                r9.append(r6)     // Catch:{ all -> 0x0212 }
                java.lang.String r6 = r13.f2041c     // Catch:{ all -> 0x0212 }
                r9.append(r6)     // Catch:{ all -> 0x0212 }
                java.lang.String r6 = "&device_id="
                r9.append(r6)     // Catch:{ all -> 0x0212 }
                java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0212 }
                r6.<init>(r3)     // Catch:{ all -> 0x0212 }
                java.lang.String r6 = b.b.g0.b(r6)     // Catch:{ all -> 0x0212 }
                r9.append(r6)     // Catch:{ all -> 0x0212 }
                b.b.h0 r6 = b.b.h0.m()     // Catch:{ all -> 0x0212 }
                java.lang.String r10 = r9.toString()     // Catch:{ all -> 0x0212 }
                r6.d(r10, r7)     // Catch:{ all -> 0x0212 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0212 }
                java.lang.String r7 = "Calling server for attribution url: "
                r6.<init>(r7)     // Catch:{ all -> 0x0212 }
                java.lang.String r7 = r9.toString()     // Catch:{ all -> 0x0212 }
                r6.append(r7)     // Catch:{ all -> 0x0212 }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0212 }
                b.b.x.a.b(r6)     // Catch:{ all -> 0x0212 }
                java.net.URL r6 = new java.net.URL     // Catch:{ all -> 0x0212 }
                java.lang.String r7 = r9.toString()     // Catch:{ all -> 0x0212 }
                r6.<init>(r7)     // Catch:{ all -> 0x0212 }
                java.net.URLConnection r6 = r6.openConnection()     // Catch:{ all -> 0x0212 }
                java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ all -> 0x0212 }
                java.lang.String r1 = "GET"
                r6.setRequestMethod(r1)     // Catch:{ all -> 0x020f }
                r1 = 10000(0x2710, float:1.4013E-41)
                r6.setConnectTimeout(r1)     // Catch:{ all -> 0x020f }
                java.lang.String r1 = "Connection"
                java.lang.String r7 = "close"
                r6.setRequestProperty(r1, r7)     // Catch:{ all -> 0x020f }
                r6.connect()     // Catch:{ all -> 0x020f }
                int r1 = r6.getResponseCode()     // Catch:{ all -> 0x020f }
                java.lang.String r7 = b.b.i.P(r6)     // Catch:{ all -> 0x020f }
                b.b.h0 r10 = b.b.h0.m()     // Catch:{ all -> 0x020f }
                java.lang.String r11 = r9.toString()     // Catch:{ all -> 0x020f }
                r10.n(r11, r1, r7)     // Catch:{ all -> 0x020f }
                r10 = 200(0xc8, float:2.8E-43)
                if (r1 != r10) goto L_0x01d8
                long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x020f }
                java.lang.String r1 = "appsflyerGetConversionDataTiming"
                long r9 = r9 - r4
                b.b.i.W(r3, r1, r9)     // Catch:{ all -> 0x020f }
                java.lang.String r1 = "Attribution data: "
                java.lang.String r4 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x020f }
                java.lang.String r1 = r1.concat(r4)     // Catch:{ all -> 0x020f }
                b.b.x.a.b(r1)     // Catch:{ all -> 0x020f }
                int r1 = r7.length()     // Catch:{ all -> 0x020f }
                if (r1 <= 0) goto L_0x0204
                if (r3 == 0) goto L_0x0204
                java.util.Map r1 = b.b.i.E(r7)     // Catch:{ all -> 0x020f }
                java.lang.String r4 = "iscache"
                java.lang.Object r4 = r1.get(r4)     // Catch:{ all -> 0x020f }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x020f }
                if (r4 == 0) goto L_0x0136
                java.lang.String r5 = java.lang.Boolean.toString(r2)     // Catch:{ all -> 0x020f }
                boolean r5 = r5.equals(r4)     // Catch:{ all -> 0x020f }
                if (r5 == 0) goto L_0x0136
                java.lang.String r5 = "appsflyerConversionDataCacheExpiration"
                long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x020f }
                b.b.i.W(r3, r5, r9)     // Catch:{ all -> 0x020f }
            L_0x0136:
                boolean r5 = r1.containsKey(r0)     // Catch:{ all -> 0x020f }
                java.lang.String r9 = "[Invite] Detected App-Invite via channel: "
                java.lang.String r10 = "af_channel"
                if (r5 == 0) goto L_0x016d
                boolean r5 = r1.containsKey(r10)     // Catch:{ all -> 0x020f }
                if (r5 == 0) goto L_0x015c
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x020f }
                r5.<init>(r9)     // Catch:{ all -> 0x020f }
                java.lang.Object r11 = r1.get(r10)     // Catch:{ all -> 0x020f }
                java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x020f }
                r5.append(r11)     // Catch:{ all -> 0x020f }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x020f }
                b.b.e.a(r5)     // Catch:{ all -> 0x020f }
                goto L_0x016d
            L_0x015c:
                java.lang.String r5 = "[CrossPromotion] App was installed via %s's Cross Promotion"
                java.lang.Object[] r11 = new java.lang.Object[r8]     // Catch:{ all -> 0x020f }
                java.lang.Object r12 = r1.get(r0)     // Catch:{ all -> 0x020f }
                r11[r2] = r12     // Catch:{ all -> 0x020f }
                java.lang.String r5 = java.lang.String.format(r5, r11)     // Catch:{ all -> 0x020f }
                b.b.e.a(r5)     // Catch:{ all -> 0x020f }
            L_0x016d:
                boolean r0 = r1.containsKey(r0)     // Catch:{ all -> 0x020f }
                if (r0 == 0) goto L_0x0188
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x020f }
                r0.<init>(r9)     // Catch:{ all -> 0x020f }
                java.lang.Object r5 = r1.get(r10)     // Catch:{ all -> 0x020f }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x020f }
                r0.append(r5)     // Catch:{ all -> 0x020f }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x020f }
                b.b.e.a(r0)     // Catch:{ all -> 0x020f }
            L_0x0188:
                java.lang.String r0 = "is_first_launch"
                java.lang.String r5 = java.lang.Boolean.toString(r2)     // Catch:{ all -> 0x020f }
                r1.put(r0, r5)     // Catch:{ all -> 0x020f }
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x020f }
                r0.<init>(r1)     // Catch:{ all -> 0x020f }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x020f }
                java.lang.String r5 = "attributionId"
                if (r0 == 0) goto L_0x01a2
                b.b.i.X(r3, r5, r0)     // Catch:{ all -> 0x020f }
                goto L_0x01a5
            L_0x01a2:
                b.b.i.X(r3, r5, r7)     // Catch:{ all -> 0x020f }
            L_0x01a5:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x020f }
                java.lang.String r5 = "iscache="
                r0.<init>(r5)     // Catch:{ all -> 0x020f }
                r0.append(r4)     // Catch:{ all -> 0x020f }
                java.lang.String r4 = " caching conversion data"
                r0.append(r4)     // Catch:{ all -> 0x020f }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x020f }
                b.b.e.a(r0)     // Catch:{ all -> 0x020f }
                b.b.h r0 = b.b.i.F     // Catch:{ all -> 0x020f }
                if (r0 == 0) goto L_0x0204
                java.util.concurrent.atomic.AtomicInteger r0 = r13.f2043e     // Catch:{ all -> 0x020f }
                int r0 = r0.intValue()     // Catch:{ all -> 0x020f }
                if (r0 > r8) goto L_0x0204
                java.util.Map r1 = b.b.i.t(r3)     // Catch:{ z -> 0x01ce }
                goto L_0x01d4
            L_0x01ce:
                r0 = move-exception
                java.lang.String r3 = "Exception while trying to fetch attribution data. "
                b.b.e.b(r3, r0)     // Catch:{ all -> 0x020f }
            L_0x01d4:
                r13.a(r1)     // Catch:{ all -> 0x020f }
                goto L_0x0204
            L_0x01d8:
                b.b.h r0 = b.b.i.F     // Catch:{ all -> 0x020f }
                if (r0 == 0) goto L_0x01eb
                java.lang.String r0 = "Error connection to server: "
                java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x020f }
                java.lang.String r0 = r0.concat(r3)     // Catch:{ all -> 0x020f }
                r13.c(r0, r1)     // Catch:{ all -> 0x020f }
            L_0x01eb:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x020f }
                java.lang.String r3 = "AttributionIdFetcher response code: "
                r0.<init>(r3)     // Catch:{ all -> 0x020f }
                r0.append(r1)     // Catch:{ all -> 0x020f }
                java.lang.String r1 = "  url: "
                r0.append(r1)     // Catch:{ all -> 0x020f }
                r0.append(r9)     // Catch:{ all -> 0x020f }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x020f }
                b.b.x.a.b(r0)     // Catch:{ all -> 0x020f }
            L_0x0204:
                java.util.concurrent.atomic.AtomicInteger r0 = r13.f2043e
                r0.decrementAndGet()
                if (r6 == 0) goto L_0x0231
                r6.disconnect()
                goto L_0x0231
            L_0x020f:
                r0 = move-exception
                r1 = r6
                goto L_0x0213
            L_0x0212:
                r0 = move-exception
            L_0x0213:
                b.b.h r3 = b.b.i.F     // Catch:{ all -> 0x0237 }
                if (r3 == 0) goto L_0x0220
                java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x0237 }
                r13.c(r3, r2)     // Catch:{ all -> 0x0237 }
            L_0x0220:
                java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x0237 }
                b.b.e.b(r2, r0)     // Catch:{ all -> 0x0237 }
                java.util.concurrent.atomic.AtomicInteger r0 = r13.f2043e
                r0.decrementAndGet()
                if (r1 == 0) goto L_0x0231
                r1.disconnect()
            L_0x0231:
                java.util.concurrent.ScheduledExecutorService r0 = r13.f2042d
                r0.shutdown()
                return
            L_0x0237:
                r0 = move-exception
                java.util.concurrent.atomic.AtomicInteger r2 = r13.f2043e
                r2.decrementAndGet()
                if (r1 == 0) goto L_0x0242
                r1.disconnect()
            L_0x0242:
                throw r0
            L_0x0243:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b.b.i.f.run():void");
        }
    }

    class g extends f {
        public g(i iVar, Context context, String str, ScheduledExecutorService scheduledExecutorService) {
            super(context, str, scheduledExecutorService);
        }

        /* access modifiers changed from: protected */
        public final void a(Map<String, String> map) {
            map.put("is_first_launch", Boolean.toString(true));
            i.F.a(map);
            i.c0(this.f2040b.get(), "appsflyerConversionDataRequestRetries", 0);
        }

        public final String b() {
            return o.a("https://%sapi.%s/install_data/v3/");
        }

        /* access modifiers changed from: protected */
        public final void c(String str, int i) {
            i.F.d(str);
            if (i >= 400 && i < 500) {
                i.c0(this.f2040b.get(), "appsflyerConversionDataRequestRetries", i.M(this.f2040b.get()).getInt("appsflyerConversionDataRequestRetries", 0) + 1);
            }
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        sb.append("/androidevent?buildnumber=4.9.0&app_id=");
        y = sb.toString();
        StringBuilder sb2 = new StringBuilder("https://%sattr.%s/api/v");
        sb2.append(y);
        z = sb2.toString();
        StringBuilder sb3 = new StringBuilder("https://%st.%s/api/v");
        sb3.append(y);
        A = sb3.toString();
        StringBuilder sb4 = new StringBuilder("https://%sevents.%s/api/v");
        sb4.append(y);
        B = sb4.toString();
        StringBuilder sb5 = new StringBuilder("https://%sregister.%s/api/v");
        sb5.append(y);
        C = sb5.toString();
    }

    private i() {
        g.a();
    }

    private static String B(String str, PackageManager packageManager, String str2) {
        Object obj;
        try {
            Bundle bundle = packageManager.getApplicationInfo(str2, 128).metaData;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Could not find ");
            sb.append(str);
            sb.append(" value in the manifest");
            e.b(sb.toString(), th);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static String C(WeakReference<Context> weakReference) {
        String g2 = j.b().g("channel");
        if (g2 == null) {
            g2 = O(weakReference, "CHANNEL");
        }
        if (g2 == null || !g2.equals("")) {
            return g2;
        }
        return null;
    }

    private static Map<String, String> D(Context context, String str) {
        String str2;
        int i2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] split = str.split("&");
        int length = split.length;
        int i3 = 0;
        boolean z2 = false;
        while (true) {
            str2 = "media_source";
            if (i3 < length) {
                String str3 = split[i3];
                int indexOf = str3.indexOf("=");
                String substring = indexOf > 0 ? str3.substring(0, indexOf) : str3;
                if (!linkedHashMap.containsKey(substring)) {
                    if (substring.equals(com.tempmail.l.c.f12425e)) {
                        str2 = "campaign";
                    } else if (!substring.equals("pid")) {
                        if (substring.equals("af_prt")) {
                            z2 = true;
                            str2 = "agency";
                        } else {
                            str2 = substring;
                        }
                    }
                    linkedHashMap.put(str2, "");
                    substring = str2;
                }
                linkedHashMap.put(substring, (indexOf <= 0 || str3.length() <= (i2 = indexOf + 1)) ? null : str3.substring(i2));
                i3++;
            } else {
                try {
                    break;
                } catch (Exception e2) {
                    e.b("Could not fetch install time. ", e2);
                }
            }
        }
        if (!linkedHashMap.containsKey("install_time")) {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
            long j2 = packageInfo.firstInstallTime;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            linkedHashMap.put("install_time", simpleDateFormat.format(new Date(j2)));
        }
        if (!linkedHashMap.containsKey("af_status")) {
            linkedHashMap.put("af_status", "Non-organic");
        }
        if (z2) {
            linkedHashMap.remove(str2);
        }
        return linkedHashMap;
    }

    /* access modifiers changed from: private */
    public static Map<String, String> E(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!D.contains(next)) {
                    String string = jSONObject.getString(next);
                    if (!TextUtils.isEmpty(string) && !"null".equals(string)) {
                        hashMap.put(next, string);
                    }
                }
            }
            return hashMap;
        } catch (JSONException e2) {
            e.b(e2.getMessage(), e2);
            return null;
        }
    }

    private void G(Application application) {
        j.b().j(application.getApplicationContext());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 14) {
            e.c("SDK<14 call trackEvent manually");
            e.c("onBecameForeground");
            e().i = System.currentTimeMillis();
            e().x(application, (String) null, (Map<String, Object>) null);
            e.g();
        } else if (i2 >= 14 && this.k == null) {
            b0.e();
            this.k = new b(this);
            b0.f().a(application, this.k);
        }
    }

    private static void I(Context context, String str, String str2, String str3) {
        if (j.b().a("shouldMonitor", false)) {
            Intent intent = new Intent("com.appsflyer.MonitorBroadcast");
            intent.setPackage("com.appsflyer.nightvision");
            intent.putExtra("message", str2);
            intent.putExtra("value", str3);
            intent.putExtra("packageName", "true");
            intent.putExtra("pid", new Integer(Process.myPid()));
            intent.putExtra("eventIdentifier", str);
            intent.putExtra("sdk", "4.9.0");
            context.sendBroadcast(intent);
        }
    }

    private static void J(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j2, TimeUnit timeUnit) {
        if (scheduledExecutorService != null) {
            try {
                if (!scheduledExecutorService.isShutdown() && !scheduledExecutorService.isTerminated()) {
                    scheduledExecutorService.schedule(runnable, j2, timeUnit);
                    return;
                }
            } catch (RejectedExecutionException e2) {
                e.b("scheduleJob failed with RejectedExecutionException Exception", e2);
                return;
            } catch (Throwable th) {
                e.b("scheduleJob failed with Exception", th);
                return;
            }
        }
        e.f("scheduler is null, shut downed or terminated");
    }

    private static boolean K(Context context) {
        if (L(context.getApplicationContext().getSharedPreferences("appsflyer-data", 0), "appsFlyerCount", false) > 2) {
            e.e("Install referrer will not load, the counter > 2, ");
            return false;
        }
        try {
            Class.forName("b.a.b.a.a");
            if (b.a.C0058a.a(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                e.a("Install referrer is allowed");
                return true;
            }
            e.a("Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException unused) {
            e.e("Class com.android.installreferrer.api.InstallReferrerClient not found");
            return false;
        } catch (Throwable th) {
            e.b("An error occurred while trying to verify manifest : com.android.installreferrer.api.InstallReferrerClient", th);
            return false;
        }
    }

    private static int L(SharedPreferences sharedPreferences, String str, boolean z2) {
        int i2 = sharedPreferences.getInt(str, 0);
        if (z2) {
            i2++;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(str, i2);
            if (Build.VERSION.SDK_INT >= 9) {
                edit.apply();
            } else {
                edit.commit();
            }
        }
        if (h0.m().a()) {
            h0.m().k(String.valueOf(i2));
        }
        return i2;
    }

    static SharedPreferences M(Context context) {
        return context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
    }

    private static String O(WeakReference<Context> weakReference, String str) {
        if (weakReference.get() == null) {
            return null;
        }
        return B(str, weakReference.get().getPackageManager(), weakReference.get().getPackageName());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        if (r3 != null) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054 A[SYNTHETIC, Splitter:B:23:0x0054] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String P(java.net.HttpURLConnection r7) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.io.InputStream r2 = r7.getErrorStream()     // Catch:{ all -> 0x0037 }
            if (r2 != 0) goto L_0x0010
            java.io.InputStream r2 = r7.getInputStream()     // Catch:{ all -> 0x0037 }
        L_0x0010:
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0037 }
            r3.<init>(r2)     // Catch:{ all -> 0x0037 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0035 }
            r2.<init>(r3)     // Catch:{ all -> 0x0035 }
        L_0x001a:
            java.lang.String r1 = r2.readLine()     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x0029
            r0.append(r1)     // Catch:{ all -> 0x0030 }
            r1 = 10
            r0.append(r1)     // Catch:{ all -> 0x0030 }
            goto L_0x001a
        L_0x0029:
            r2.close()     // Catch:{ all -> 0x005a }
        L_0x002c:
            r3.close()     // Catch:{ all -> 0x005a }
            goto L_0x005a
        L_0x0030:
            r1 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L_0x0039
        L_0x0035:
            r2 = move-exception
            goto L_0x0039
        L_0x0037:
            r2 = move-exception
            r3 = r1
        L_0x0039:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x007d }
            java.lang.String r5 = "Could not read connection response from: "
            r4.<init>(r5)     // Catch:{ all -> 0x007d }
            java.net.URL r7 = r7.getURL()     // Catch:{ all -> 0x007d }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x007d }
            r4.append(r7)     // Catch:{ all -> 0x007d }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x007d }
            b.b.e.b(r7, r2)     // Catch:{ all -> 0x007d }
            if (r1 == 0) goto L_0x0057
            r1.close()     // Catch:{ all -> 0x005a }
        L_0x0057:
            if (r3 == 0) goto L_0x005a
            goto L_0x002c
        L_0x005a:
            java.lang.String r7 = r0.toString()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0064 }
            r0.<init>(r7)     // Catch:{ JSONException -> 0x0064 }
            return r7
        L_0x0064:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "string_response"
            r0.put(r1, r7)     // Catch:{ JSONException -> 0x0073 }
            java.lang.String r7 = r0.toString()     // Catch:{ JSONException -> 0x0073 }
            return r7
        L_0x0073:
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            java.lang.String r7 = r7.toString()
            return r7
        L_0x007d:
            r7 = move-exception
            if (r1 == 0) goto L_0x0083
            r1.close()     // Catch:{ all -> 0x0088 }
        L_0x0083:
            if (r3 == 0) goto L_0x0088
            r3.close()     // Catch:{ all -> 0x0088 }
        L_0x0088:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.i.P(java.net.HttpURLConnection):java.lang.String");
    }

    /* access modifiers changed from: private */
    public static void W(Context context, String str, long j2) {
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).edit();
        edit.putLong(str, j2);
        if (Build.VERSION.SDK_INT >= 9) {
            edit.apply();
        } else {
            edit.commit();
        }
    }

    /* access modifiers changed from: private */
    public static void X(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).edit();
        edit.putString(str, str2);
        if (Build.VERSION.SDK_INT >= 9) {
            edit.apply();
        } else {
            edit.commit();
        }
    }

    private static String Z(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class}).invoke((Object) null, new Object[]{str});
        } catch (Throwable th) {
            e.b(th.getMessage(), th);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void c0(Context context, String str, int i2) {
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).edit();
        edit.putInt(str, i2);
        if (Build.VERSION.SDK_INT >= 9) {
            edit.apply();
        } else {
            edit.commit();
        }
    }

    private void d0(Context context, String str, String str2, String str3, String str4, Intent intent, String str5) {
        Context applicationContext = context.getApplicationContext();
        boolean z2 = false;
        boolean z3 = str2 == null;
        if (j.b().a("waitForCustomerId", false) && j.b().g("AppUserId") == null) {
            z2 = true;
        }
        if (z2) {
            e.d("CustomerUserId not set, Tracking is disabled", true);
            return;
        }
        if (z3) {
            if (!j.b().a("launchProtectEnabled", true)) {
                e.c("Allowing multiple launches within a 5 second time window.");
            } else if (z()) {
                return;
            }
            this.f2020a = System.currentTimeMillis();
        }
        J(b.a().f(), new c(this, new WeakReference(applicationContext), str, str2, str3, str4, false, intent, str5, (byte) 0), 150, TimeUnit.MILLISECONDS);
    }

    public static i e() {
        return H;
    }

    private static void e0(Context context, Map<String, ? super String> map) {
        x xVar = x.b.f2095a;
        x.a a2 = x.a(context);
        map.put("network", a2.a());
        if (a2.c() != null) {
            map.put("operator", a2.c());
        }
        if (a2.e() != null) {
            map.put("carrier", a2.e());
        }
    }

    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r10v2 */
    /* JADX WARNING: type inference failed for: r10v3, types: [java.io.Writer] */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: type inference failed for: r10v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x022c A[SYNTHETIC, Splitter:B:117:0x022c] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x023a A[Catch:{ z -> 0x0213, all -> 0x0238 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0248  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g0(java.net.URL r21, java.lang.String r22, java.lang.String r23, java.lang.ref.WeakReference<android.content.Context> r24, java.lang.String r25, boolean r26) throws java.io.IOException {
        /*
            r20 = this;
            r1 = r20
            r0 = r22
            r2 = r23
            r3 = r25
            java.lang.String r4 = "is_first_launch"
            java.lang.String r5 = "appsflyerConversionDataCacheExpiration"
            java.lang.Object r6 = r24.get()
            android.content.Context r6 = (android.content.Context) r6
            r7 = 1
            r8 = 0
            if (r26 == 0) goto L_0x001c
            b.b.h r9 = F
            if (r9 == 0) goto L_0x001c
            r9 = 1
            goto L_0x001d
        L_0x001c:
            r9 = 0
        L_0x001d:
            r10 = 0
            b.b.h0 r11 = b.b.h0.m()     // Catch:{ all -> 0x0244 }
            java.lang.String r12 = r21.toString()     // Catch:{ all -> 0x0244 }
            r11.d(r12, r0)     // Catch:{ all -> 0x0244 }
            java.net.URLConnection r11 = r21.openConnection()     // Catch:{ all -> 0x0244 }
            java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11     // Catch:{ all -> 0x0244 }
            java.lang.String r12 = "POST"
            r11.setRequestMethod(r12)     // Catch:{ all -> 0x023e }
            byte[] r12 = r22.getBytes()     // Catch:{ all -> 0x023e }
            int r12 = r12.length     // Catch:{ all -> 0x023e }
            java.lang.String r13 = "Content-Length"
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x023e }
            r11.setRequestProperty(r13, r12)     // Catch:{ all -> 0x023e }
            java.lang.String r12 = "Content-Type"
            java.lang.String r13 = "application/json"
            r11.setRequestProperty(r12, r13)     // Catch:{ all -> 0x023e }
            r12 = 10000(0x2710, float:1.4013E-41)
            r11.setConnectTimeout(r12)     // Catch:{ all -> 0x023e }
            r11.setDoOutput(r7)     // Catch:{ all -> 0x023e }
            java.io.OutputStreamWriter r12 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0226 }
            java.io.OutputStream r13 = r11.getOutputStream()     // Catch:{ all -> 0x0226 }
            java.lang.String r14 = "UTF-8"
            r12.<init>(r13, r14)     // Catch:{ all -> 0x0226 }
            r12.write(r0)     // Catch:{ all -> 0x0221 }
            r12.close()     // Catch:{ all -> 0x023e }
            int r0 = r11.getResponseCode()     // Catch:{ all -> 0x023e }
            java.lang.String r12 = P(r11)     // Catch:{ all -> 0x023e }
            b.b.h0 r13 = b.b.h0.m()     // Catch:{ all -> 0x023e }
            java.lang.String r14 = r21.toString()     // Catch:{ all -> 0x023e }
            r13.n(r14, r0, r12)     // Catch:{ all -> 0x023e }
            java.lang.String r13 = "response code: "
            java.lang.String r14 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x023e }
            java.lang.String r13 = r13.concat(r14)     // Catch:{ all -> 0x023e }
            b.b.e.c(r13)     // Catch:{ all -> 0x023e }
            java.lang.String r13 = "AppsFlyer_4.9.0"
            java.lang.String r14 = "SERVER_RESPONSE_CODE"
            java.lang.String r15 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x023e }
            I(r6, r13, r14, r15)     // Catch:{ all -> 0x023e }
            android.content.Context r13 = r6.getApplicationContext()     // Catch:{ all -> 0x023e }
            java.lang.String r14 = "appsflyer-data"
            android.content.SharedPreferences r13 = r13.getSharedPreferences(r14, r8)     // Catch:{ all -> 0x023e }
            r14 = 200(0xc8, float:2.8E-43)
            if (r0 != r14) goto L_0x016c
            java.lang.Object r0 = r24.get()     // Catch:{ all -> 0x023e }
            if (r0 == 0) goto L_0x00b7
            if (r26 == 0) goto L_0x00b7
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00b3 }
            r1.f2021b = r14     // Catch:{ all -> 0x00b3 }
            b.b.k r0 = G     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x00b7
            b.b.k r0 = G     // Catch:{ all -> 0x00b3 }
            r0.b()     // Catch:{ all -> 0x00b3 }
            goto L_0x00b7
        L_0x00b3:
            r0 = move-exception
            r10 = r11
            goto L_0x0246
        L_0x00b7:
            java.lang.String r0 = "afUninstallToken"
            b.b.j r14 = b.b.j.b()     // Catch:{ all -> 0x023e }
            java.lang.String r0 = r14.g(r0)     // Catch:{ all -> 0x023e }
            if (r0 == 0) goto L_0x00ee
            java.lang.String r14 = "Uninstall Token exists: "
            java.lang.String r15 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00b3 }
            java.lang.String r14 = r14.concat(r15)     // Catch:{ all -> 0x00b3 }
            b.b.e.a(r14)     // Catch:{ all -> 0x00b3 }
            java.lang.String r14 = "sentRegisterRequestToAF"
            boolean r14 = r13.getBoolean(r14, r8)     // Catch:{ all -> 0x00b3 }
            if (r14 != 0) goto L_0x010e
            java.lang.String r14 = "Resending Uninstall token to AF servers: "
            java.lang.String r15 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00b3 }
            java.lang.String r14 = r14.concat(r15)     // Catch:{ all -> 0x00b3 }
            b.b.e.a(r14)     // Catch:{ all -> 0x00b3 }
            b.b.p$a$a r14 = new b.b.p$a$a     // Catch:{ all -> 0x00b3 }
            r14.<init>(r0)     // Catch:{ all -> 0x00b3 }
            b.b.j0.e(r6, r14)     // Catch:{ all -> 0x00b3 }
            goto L_0x010e
        L_0x00ee:
            java.lang.String r0 = "gcmProjectNumber"
            b.b.j r14 = b.b.j.b()     // Catch:{ all -> 0x023e }
            java.lang.String r0 = r14.g(r0)     // Catch:{ all -> 0x023e }
            if (r0 == 0) goto L_0x010e
            java.lang.String r0 = "GCM Project number exists. Fetching token and sending to AF servers"
            b.b.e.a(r0)     // Catch:{ all -> 0x00b3 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x00b3 }
            r0.<init>(r6)     // Catch:{ all -> 0x00b3 }
            b.b.j0$a r14 = new b.b.j0$a     // Catch:{ all -> 0x00b3 }
            r14.<init>(r0)     // Catch:{ all -> 0x00b3 }
            java.lang.Void[] r0 = new java.lang.Void[r8]     // Catch:{ all -> 0x00b3 }
            r14.execute(r0)     // Catch:{ all -> 0x00b3 }
        L_0x010e:
            android.net.Uri r0 = r1.n     // Catch:{ all -> 0x023e }
            if (r0 == 0) goto L_0x0114
            r1.n = r10     // Catch:{ all -> 0x00b3 }
        L_0x0114:
            if (r3 == 0) goto L_0x011d
            b.b.s.a r0 = b.b.s.a.d()     // Catch:{ all -> 0x00b3 }
            r0.b(r3, r6)     // Catch:{ all -> 0x00b3 }
        L_0x011d:
            java.lang.Object r0 = r24.get()     // Catch:{ all -> 0x023e }
            if (r0 == 0) goto L_0x015d
            if (r3 != 0) goto L_0x015d
            java.lang.String r0 = "sentSuccessfully"
            java.lang.String r3 = "true"
            X(r6, r0, r3)     // Catch:{ all -> 0x023e }
            boolean r0 = r1.f2025f     // Catch:{ all -> 0x023e }
            if (r0 != 0) goto L_0x015d
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x023e }
            r16 = r11
            long r10 = r1.g     // Catch:{ all -> 0x0238 }
            long r14 = r14 - r10
            r10 = 15000(0x3a98, double:7.411E-320)
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x0140
            goto L_0x015f
        L_0x0140:
            java.util.concurrent.ScheduledExecutorService r0 = r1.h     // Catch:{ all -> 0x0238 }
            if (r0 != 0) goto L_0x015f
            b.b.b r0 = b.b.b.a()     // Catch:{ all -> 0x0238 }
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r0.f()     // Catch:{ all -> 0x0238 }
            r1.h = r0     // Catch:{ all -> 0x0238 }
            b.b.i$e r0 = new b.b.i$e     // Catch:{ all -> 0x0238 }
            r0.<init>(r6)     // Catch:{ all -> 0x0238 }
            java.util.concurrent.ScheduledExecutorService r10 = r1.h     // Catch:{ all -> 0x0238 }
            r14 = 1
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0238 }
            J(r10, r0, r14, r11)     // Catch:{ all -> 0x0238 }
            goto L_0x015f
        L_0x015d:
            r16 = r11
        L_0x015f:
            org.json.JSONObject r0 = b.b.o.b(r12)     // Catch:{ all -> 0x0238 }
            java.lang.String r10 = "send_background"
            boolean r0 = r0.optBoolean(r10, r8)     // Catch:{ all -> 0x0238 }
            r1.v = r0     // Catch:{ all -> 0x0238 }
            goto L_0x0181
        L_0x016c:
            r16 = r11
            b.b.k r10 = G     // Catch:{ all -> 0x0238 }
            if (r10 == 0) goto L_0x0181
            java.lang.String r10 = "Failure: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0238 }
            java.lang.String r0 = r10.concat(r0)     // Catch:{ all -> 0x0238 }
            b.b.k r10 = G     // Catch:{ all -> 0x0238 }
            r10.a(r0)     // Catch:{ all -> 0x0238 }
        L_0x0181:
            java.lang.String r0 = "appsflyerConversionDataRequestRetries"
            int r0 = r13.getInt(r0, r8)     // Catch:{ all -> 0x0238 }
            r10 = 0
            long r14 = r13.getLong(r5, r10)     // Catch:{ all -> 0x0238 }
            java.lang.String r12 = "attributionId"
            int r17 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r17 == 0) goto L_0x01a9
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0238 }
            long r17 = r17 - r14
            r14 = 5184000000(0x134fd9000, double:2.561236308E-314)
            int r19 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r19 <= 0) goto L_0x01a9
            r3 = 0
            X(r6, r12, r3)     // Catch:{ all -> 0x0238 }
            W(r6, r5, r10)     // Catch:{ all -> 0x0238 }
        L_0x01a9:
            r3 = 0
            java.lang.String r5 = r13.getString(r12, r3)     // Catch:{ all -> 0x0238 }
            if (r5 != 0) goto L_0x01d4
            if (r2 == 0) goto L_0x01d4
            if (r9 == 0) goto L_0x01d4
            b.b.h r5 = F     // Catch:{ all -> 0x0238 }
            if (r5 == 0) goto L_0x01d4
            r5 = 5
            if (r0 > r5) goto L_0x01d4
            b.b.b r0 = b.b.b.a()     // Catch:{ all -> 0x0238 }
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r0.f()     // Catch:{ all -> 0x0238 }
            b.b.i$g r3 = new b.b.i$g     // Catch:{ all -> 0x0238 }
            android.content.Context r4 = r6.getApplicationContext()     // Catch:{ all -> 0x0238 }
            r3.<init>(r1, r4, r2, r0)     // Catch:{ all -> 0x0238 }
            r4 = 10
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0238 }
            J(r0, r3, r4, r2)     // Catch:{ all -> 0x0238 }
            goto L_0x021b
        L_0x01d4:
            if (r2 != 0) goto L_0x01dc
            java.lang.String r0 = "AppsFlyer dev key is missing."
            b.b.e.f(r0)     // Catch:{ all -> 0x0238 }
            goto L_0x021b
        L_0x01dc:
            if (r9 == 0) goto L_0x021b
            b.b.h r0 = F     // Catch:{ all -> 0x0238 }
            if (r0 == 0) goto L_0x021b
            r2 = 0
            java.lang.String r0 = r13.getString(r12, r2)     // Catch:{ all -> 0x0238 }
            if (r0 == 0) goto L_0x021b
            java.lang.String r0 = "appsFlyerCount"
            int r0 = L(r13, r0, r8)     // Catch:{ all -> 0x0238 }
            if (r0 <= r7) goto L_0x021b
            java.util.Map r0 = t(r6)     // Catch:{ z -> 0x0213 }
            if (r0 == 0) goto L_0x021b
            boolean r2 = r0.containsKey(r4)     // Catch:{ all -> 0x020a }
            if (r2 != 0) goto L_0x0204
            java.lang.String r2 = java.lang.Boolean.toString(r8)     // Catch:{ all -> 0x020a }
            r0.put(r4, r2)     // Catch:{ all -> 0x020a }
        L_0x0204:
            b.b.h r2 = F     // Catch:{ all -> 0x020a }
            r2.a(r0)     // Catch:{ all -> 0x020a }
            goto L_0x021b
        L_0x020a:
            r0 = move-exception
            java.lang.String r2 = r0.getLocalizedMessage()     // Catch:{ z -> 0x0213 }
            b.b.e.b(r2, r0)     // Catch:{ z -> 0x0213 }
            goto L_0x021b
        L_0x0213:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x0238 }
            b.b.e.b(r2, r0)     // Catch:{ all -> 0x0238 }
        L_0x021b:
            if (r16 == 0) goto L_0x0220
            r16.disconnect()
        L_0x0220:
            return
        L_0x0221:
            r0 = move-exception
            r16 = r11
            r10 = r12
            goto L_0x022a
        L_0x0226:
            r0 = move-exception
            r2 = r10
            r16 = r11
        L_0x022a:
            if (r10 != 0) goto L_0x023a
            b.b.k r2 = G     // Catch:{ all -> 0x0238 }
            if (r2 == 0) goto L_0x023d
            b.b.k r2 = G     // Catch:{ all -> 0x0238 }
            java.lang.String r3 = "No Connectivity"
            r2.a(r3)     // Catch:{ all -> 0x0238 }
            goto L_0x023d
        L_0x0238:
            r0 = move-exception
            goto L_0x0241
        L_0x023a:
            r10.close()     // Catch:{ all -> 0x0238 }
        L_0x023d:
            throw r0     // Catch:{ all -> 0x0238 }
        L_0x023e:
            r0 = move-exception
            r16 = r11
        L_0x0241:
            r10 = r16
            goto L_0x0246
        L_0x0244:
            r0 = move-exception
            r2 = r10
        L_0x0246:
            if (r10 == 0) goto L_0x024b
            r10.disconnect()
        L_0x024b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.i.g0(java.net.URL, java.lang.String, java.lang.String, java.lang.ref.WeakReference, java.lang.String, boolean):void");
    }

    private static File k0(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (str.trim().length() > 0) {
                return new File(str.trim());
            }
            return null;
        } catch (Throwable th) {
            e.b(th.getMessage(), th);
            return null;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031 A[SYNTHETIC, Splitter:B:16:0x0031] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:13:0x0028=Splitter:B:13:0x0028, B:22:0x003f=Splitter:B:22:0x003f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String l0(java.io.File r4, java.lang.String r5) {
        /*
            r0 = 0
            java.util.Properties r1 = new java.util.Properties     // Catch:{ FileNotFoundException -> 0x003e, all -> 0x0026 }
            r1.<init>()     // Catch:{ FileNotFoundException -> 0x003e, all -> 0x0026 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ FileNotFoundException -> 0x003e, all -> 0x0026 }
            r2.<init>(r4)     // Catch:{ FileNotFoundException -> 0x003e, all -> 0x0026 }
            r1.load(r2)     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x0024 }
            java.lang.String r3 = "Found PreInstall property!"
            b.b.e.c(r3)     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x0024 }
            java.lang.String r4 = r1.getProperty(r5)     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x0024 }
            r2.close()     // Catch:{ all -> 0x001b }
            goto L_0x0023
        L_0x001b:
            r5 = move-exception
            java.lang.String r0 = r5.getMessage()
            b.b.e.b(r0, r5)
        L_0x0023:
            return r4
        L_0x0024:
            r4 = move-exception
            goto L_0x0028
        L_0x0026:
            r4 = move-exception
            r2 = r0
        L_0x0028:
            java.lang.String r5 = r4.getMessage()     // Catch:{ all -> 0x005a }
            b.b.e.b(r5, r4)     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x0059
            r2.close()     // Catch:{ all -> 0x0035 }
            goto L_0x0059
        L_0x0035:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            b.b.e.b(r5, r4)
            goto L_0x0059
        L_0x003e:
            r2 = r0
        L_0x003f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x005a }
            java.lang.String r1 = "PreInstall file wasn't found: "
            r5.<init>(r1)     // Catch:{ all -> 0x005a }
            java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ all -> 0x005a }
            r5.append(r4)     // Catch:{ all -> 0x005a }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x005a }
            b.b.e.a(r4)     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x0059
            r2.close()     // Catch:{ all -> 0x0035 }
        L_0x0059:
            return r0
        L_0x005a:
            r4 = move-exception
            if (r2 == 0) goto L_0x0069
            r2.close()     // Catch:{ all -> 0x0061 }
            goto L_0x0069
        L_0x0061:
            r5 = move-exception
            java.lang.String r0 = r5.getMessage()
            b.b.e.b(r0, r5)
        L_0x0069:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.i.l0(java.io.File, java.lang.String):java.lang.String");
    }

    static /* synthetic */ void n0(i iVar, Context context, String str, String str2, String str3, String str4, boolean z2, boolean z3, Intent intent, String str5) {
        ScheduledExecutorService scheduledExecutorService;
        i iVar2 = iVar;
        if (context == null) {
            e.a("sendTrackingWithEvent - got null context. skipping event/launch.");
            return;
        }
        int i2 = 0;
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
        j.b().k(sharedPreferences);
        if (!iVar.j()) {
            StringBuilder sb = new StringBuilder("sendTrackingWithEvent from activity: ");
            sb.append(context.getClass().getName());
            e.c(sb.toString());
        }
        boolean z4 = true;
        boolean z5 = str2 == null;
        Map<String, Object> R = iVar.R(context, str, str2, str3, str4, z2, sharedPreferences, z5, intent, str5);
        String str6 = (String) R.get("appsflyerKey");
        if (str6 == null || str6.length() == 0) {
            e.a("Not sending data yet, waiting for dev key");
            return;
        }
        if (!iVar.j()) {
            e.c("AppsFlyerLib.sendTrackingWithEvent");
        }
        String a2 = o.a(z5 ? z3 ? z : A : B);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a2);
        sb2.append(context.getPackageName());
        String obj = sb2.toString();
        int L = L(sharedPreferences, "appsFlyerCount", false);
        if (!(j.b().a("collectAndroidIdForceByUser", false) || j.b().a("collectIMEIForceByUser", false)) && R.get("advertiserId") != null) {
            try {
                if (TextUtils.isEmpty(iVar2.m) && R.remove("android_id") != null) {
                    e.c("validateGaidAndIMEI :: removing: android_id");
                }
                if (TextUtils.isEmpty(iVar2.l) && R.remove("imei") != null) {
                    e.c("validateGaidAndIMEI :: removing: imei");
                }
            } catch (Exception e2) {
                e.b("failed to remove IMEI or AndroidID key from params; ", e2);
            }
        }
        d dVar = new d(iVar, obj, R, context.getApplicationContext(), z5, L, (byte) 0);
        if (z5 && K(context)) {
            Map<String, String> map = iVar2.f2024e;
            if (map == null || map.size() <= 0) {
                z4 = false;
            }
            if (!z4) {
                i2 = 500;
                e.a("Failed to get new referrer, wait ...");
            }
        }
        if (a.f1964c) {
            e.e("ESP deeplink: execute launch on SerialExecutor");
            scheduledExecutorService = b.a().b();
        } else {
            scheduledExecutorService = b.a().f();
        }
        J(scheduledExecutorService, dVar, (long) i2, TimeUnit.MILLISECONDS);
    }

    private static boolean o(Context context) {
        if (context != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                try {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    for (Network networkCapabilities : connectivityManager.getAllNetworks()) {
                        NetworkCapabilities networkCapabilities2 = connectivityManager.getNetworkCapabilities(networkCapabilities);
                        if (networkCapabilities2.hasTransport(4) && !networkCapabilities2.hasCapability(15)) {
                            return true;
                        }
                    }
                    return false;
                } catch (Exception e2) {
                    e.b("Failed collecting ivc data", e2);
                }
            } else if (i2 >= 16) {
                ArrayList arrayList = new ArrayList();
                try {
                    Iterator<T> it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                    while (it.hasNext()) {
                        NetworkInterface networkInterface = (NetworkInterface) it.next();
                        if (networkInterface.isUp()) {
                            arrayList.add(networkInterface.getName());
                        }
                    }
                    return arrayList.contains("tun0");
                } catch (Exception e3) {
                    e.b("Failed collecting ivc data", e3);
                }
            }
        }
        return false;
    }

    static /* synthetic */ void o0(i iVar, String str, String str2, String str3, WeakReference weakReference, String str4, boolean z2) throws IOException {
        String str5 = str;
        URL url = new URL(str5);
        StringBuilder sb = new StringBuilder("url: ");
        sb.append(url.toString());
        e.c(sb.toString());
        x.a.b("data: ".concat(String.valueOf(str2)));
        I((Context) weakReference.get(), "AppsFlyer_4.9.0", "EVENT_DATA", str2);
        try {
            iVar.g0(url, str2, str3, weakReference, str4, z2);
        } catch (IOException e2) {
            IOException iOException = e2;
            e.b("Exception in sendRequestToServer. ", iOException);
            if (j.b().a("useHttpFallback", false)) {
                iVar.g0(new URL(str5.replace("https:", "http:")), str2, str3, weakReference, str4, z2);
                return;
            }
            StringBuilder sb2 = new StringBuilder("failed to send requeset to server. ");
            sb2.append(iOException.getLocalizedMessage());
            e.c(sb2.toString());
            I((Context) weakReference.get(), "AppsFlyer_4.9.0", "ERROR", iOException.getLocalizedMessage());
            throw iOException;
        }
    }

    private static String p(Context context) {
        String g2 = j.b().g("api_store_value");
        if (g2 != null) {
            return g2;
        }
        String O = O(new WeakReference(context), "AF_STORE");
        if (O != null) {
            return O;
        }
        return null;
    }

    private static boolean p0(Context context) {
        try {
            if (GoogleApiAvailability.q().i(context) == 0) {
                return true;
            }
        } catch (Throwable th) {
            e.b("WARNING:  Google play services is unavailable. ", th);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            e.b("WARNING:  Google Play Services is unavailable. ", e2);
            return false;
        }
    }

    private static float q(Context context) {
        try {
            Intent registerReceiver = context.getApplicationContext().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra == -1 || intExtra2 == -1) {
                return 50.0f;
            }
            return (((float) intExtra) / ((float) intExtra2)) * 100.0f;
        } catch (Throwable th) {
            e.b(th.getMessage(), th);
            return 1.0f;
        }
    }

    static /* synthetic */ boolean q0(i iVar) {
        Map<String, String> map = iVar.f2024e;
        return map != null && map.size() > 0;
    }

    static int r(SharedPreferences sharedPreferences) {
        return L(sharedPreferences, "appsFlyerCount", false);
    }

    private static boolean r0(Context context) {
        if ((j.b().a("collectAndroidIdForceByUser", false) || j.b().a("collectIMEIForceByUser", false)) || !p0(context)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static String s0(Context context, String str) throws PackageManager.NameNotFoundException {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
        if (sharedPreferences.contains("CACHED_CHANNEL")) {
            return sharedPreferences.getString("CACHED_CHANNEL", (String) null);
        }
        X(context, "CACHED_CHANNEL", str);
        return str;
    }

    /* access modifiers changed from: private */
    public static Map<String, String> t(Context context) throws z {
        String string = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).getString("attributionId", (String) null);
        if (string != null && string.length() > 0) {
            return E(string);
        }
        throw new z();
    }

    private static void v(Context context, String str) {
        Intent intent = new Intent("com.appsflyer.testIntgrationBroadcast");
        intent.putExtra("params", str);
        if (Build.VERSION.SDK_INT < 26) {
            context.sendBroadcast(intent);
        } else if (context.getPackageManager().queryBroadcastReceivers(intent, 0).toString().contains("com.appsflyer.referrerSender")) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(new ComponentName("com.appsflyer.referrerSender", "com.appsflyer.referrerSender.Receiver"));
            context.sendBroadcast(intent2);
        }
    }

    static /* synthetic */ void y(Map map) {
        h hVar = F;
        if (hVar != null) {
            try {
                hVar.b(map);
            } catch (Throwable th) {
                e.b(th.getLocalizedMessage(), th);
            }
        }
    }

    private boolean z() {
        if (this.f2020a > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f2020a;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", Locale.US);
            long j2 = this.f2020a;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String format = simpleDateFormat.format(new Date(j2));
            long j3 = this.f2021b;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String format2 = simpleDateFormat.format(new Date(j3));
            if (currentTimeMillis < this.f2022c && !j()) {
                e.c(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", new Object[]{format, format2, Long.valueOf(currentTimeMillis), Long.valueOf(this.f2022c)}));
                return true;
            } else if (!j()) {
                e.c(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", new Object[]{format, format2, Long.valueOf(currentTimeMillis)}));
            }
        } else if (!j()) {
            e.c("Sending first launch for this session!");
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02fd A[Catch:{ Exception -> 0x00c1, all -> 0x0bb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0310 A[Catch:{ Exception -> 0x0316 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0345 A[Catch:{ Exception -> 0x00c1, all -> 0x0bb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x036a A[Catch:{ Exception -> 0x00c1, all -> 0x0bb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0372 A[Catch:{ Exception -> 0x00c1, all -> 0x0bb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0390 A[Catch:{ Exception -> 0x00c1, all -> 0x0bb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x03ae A[Catch:{ Exception -> 0x00c1, all -> 0x0bb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03e5 A[Catch:{ Exception -> 0x00c1, all -> 0x0bb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03f9 A[Catch:{ Exception -> 0x00c1, all -> 0x0bb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0405 A[Catch:{ Exception -> 0x00c1, all -> 0x0bb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x040d A[Catch:{ Exception -> 0x00c1, all -> 0x0bb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0419 A[Catch:{ Exception -> 0x00c1, all -> 0x0bb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0421 A[Catch:{ Exception -> 0x00c1, all -> 0x0bb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0437 A[Catch:{ Exception -> 0x00c1, all -> 0x0bb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0438 A[Catch:{ Exception -> 0x00c1, all -> 0x0bb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x043b A[Catch:{ Exception -> 0x00c1, all -> 0x0bb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x043d A[Catch:{ Exception -> 0x00c1, all -> 0x0bb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0458 A[Catch:{ Exception -> 0x00c1, all -> 0x0bb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0467 A[Catch:{ Exception -> 0x00c1, all -> 0x0bb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0476 A[SYNTHETIC, Splitter:B:194:0x0476] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0492 A[Catch:{ Exception -> 0x00c1, all -> 0x0bb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x04a1 A[Catch:{ Exception -> 0x00c1, all -> 0x0bb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x04b2 A[Catch:{ Exception -> 0x00c1, all -> 0x0bb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04b8 A[Catch:{ Exception -> 0x00c1, all -> 0x0bb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04cf A[Catch:{ Exception -> 0x00c1, all -> 0x0bb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x04e7 A[Catch:{ Exception -> 0x00c1, all -> 0x0bb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x04fe A[Catch:{ Exception -> 0x00c1, all -> 0x0bb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x052c A[Catch:{ Exception -> 0x00c1, all -> 0x0bb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x054b A[SYNTHETIC, Splitter:B:230:0x054b] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0577 A[Catch:{ NameNotFoundException -> 0x056d, all -> 0x0562, all -> 0x0bb4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x057d A[Catch:{ NameNotFoundException -> 0x056d, all -> 0x0562, all -> 0x0bb4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x058e  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0595 A[Catch:{ NameNotFoundException -> 0x056d, all -> 0x0562, all -> 0x0bb4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x05fa A[SYNTHETIC, Splitter:B:277:0x05fa] */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0606 A[Catch:{ NameNotFoundException -> 0x056d, all -> 0x0562, all -> 0x0bb4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x062f A[Catch:{ NameNotFoundException -> 0x056d, all -> 0x0562, all -> 0x0bb4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x063a A[Catch:{ NameNotFoundException -> 0x056d, all -> 0x0562, all -> 0x0bb4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x065b A[Catch:{ NameNotFoundException -> 0x056d, all -> 0x0562, all -> 0x0bb4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x069a A[Catch:{ NameNotFoundException -> 0x056d, all -> 0x0562, all -> 0x0bb4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x06a4 A[Catch:{ NameNotFoundException -> 0x056d, all -> 0x0562, all -> 0x0bb4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x06af A[Catch:{ NameNotFoundException -> 0x056d, all -> 0x0562, all -> 0x0bb4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x06c1 A[SYNTHETIC, Splitter:B:326:0x06c1] */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x077b  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x07e2 A[Catch:{ all -> 0x081b }] */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x0832  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0840 A[Catch:{ NameNotFoundException -> 0x056d, all -> 0x0562, all -> 0x0bb4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x0851 A[Catch:{ NameNotFoundException -> 0x056d, all -> 0x0562, all -> 0x0bb4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x087b A[Catch:{ NameNotFoundException -> 0x056d, all -> 0x0562, all -> 0x0bb4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x0886 A[Catch:{ NameNotFoundException -> 0x056d, all -> 0x0562, all -> 0x0bb4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x08b6 A[Catch:{ NameNotFoundException -> 0x056d, all -> 0x0562, all -> 0x0bb4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x08e1 A[ADDED_TO_REGION, Catch:{ NameNotFoundException -> 0x056d, all -> 0x0562, all -> 0x0bb4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x08f0 A[Catch:{ NameNotFoundException -> 0x056d, all -> 0x0562, all -> 0x0bb4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x091b A[Catch:{ NameNotFoundException -> 0x056d, all -> 0x0562, all -> 0x0bb4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x0941 A[Catch:{ NameNotFoundException -> 0x056d, all -> 0x0562, all -> 0x0bb4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:446:0x099d A[Catch:{ NameNotFoundException -> 0x056d, all -> 0x0562, all -> 0x0bb4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x099f A[Catch:{ NameNotFoundException -> 0x056d, all -> 0x0562, all -> 0x0bb4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:454:0x09c6 A[Catch:{ NameNotFoundException -> 0x056d, all -> 0x0562, all -> 0x0bb4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:458:0x09d6 A[Catch:{ NameNotFoundException -> 0x056d, all -> 0x0562, all -> 0x0bb4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:459:0x09d8 A[Catch:{ NameNotFoundException -> 0x056d, all -> 0x0562, all -> 0x0bb4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x0a13 A[Catch:{ NameNotFoundException -> 0x056d, all -> 0x0562, all -> 0x0bb4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:480:0x0b6e A[Catch:{ NameNotFoundException -> 0x056d, all -> 0x0562, all -> 0x0bb4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:483:0x0b8a A[Catch:{ NameNotFoundException -> 0x056d, all -> 0x0562, all -> 0x0bb4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:484:0x0b9f A[Catch:{ NameNotFoundException -> 0x056d, all -> 0x0562, all -> 0x0bb4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.Object> R(android.content.Context r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, boolean r33, android.content.SharedPreferences r34, boolean r35, android.content.Intent r36, java.lang.String r37) {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r5 = r31
            r6 = r34
            r7 = r35
            java.lang.String r8 = "AppsFlyer_4.9.0"
            java.lang.String r9 = "UTC"
            java.lang.String r10 = "use cached IMEI: "
            java.lang.String r11 = "uid"
            java.lang.String r12 = "appid"
            java.lang.String r13 = "INSTALL_STORE"
            java.lang.String r14 = "prev_event_name"
            java.lang.String r15 = "preInstallName"
            r16 = r9
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            b.b.c0.a(r2, r9)
            java.util.Date r17 = new java.util.Date
            r17.<init>()
            r18 = r10
            r19 = r11
            long r10 = r17.getTime()
            java.lang.String r1 = java.lang.Long.toString(r10)
            r17 = r12
            java.lang.String r12 = "af_timestamp"
            r9.put(r12, r1)
            java.lang.String r1 = b.b.p.d(r2, r10)
            if (r1 == 0) goto L_0x004b
            java.lang.String r10 = "cksm_v1"
            r9.put(r10, r1)
        L_0x004b:
            boolean r1 = r27.j()     // Catch:{ all -> 0x0bb6 }
            java.lang.String r10 = "Launch"
            if (r1 != 0) goto L_0x006a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0bb6 }
            java.lang.String r11 = "******* sendTrackingWithEvent: "
            r1.<init>(r11)     // Catch:{ all -> 0x0bb6 }
            if (r7 == 0) goto L_0x005e
            r11 = r10
            goto L_0x005f
        L_0x005e:
            r11 = r4
        L_0x005f:
            r1.append(r11)     // Catch:{ all -> 0x0bb6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0bb6 }
            b.b.e.c(r1)     // Catch:{ all -> 0x0bb6 }
            goto L_0x006f
        L_0x006a:
            java.lang.String r1 = "SDK tracking has been stopped"
            b.b.e.c(r1)     // Catch:{ all -> 0x0bb6 }
        L_0x006f:
            java.lang.String r1 = "EVENT_CREATED_WITH_NAME"
            if (r7 == 0) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r10 = r4
        L_0x0075:
            I(r2, r8, r1, r10)     // Catch:{ all -> 0x0bb6 }
            b.b.s.a r1 = b.b.s.a.d()     // Catch:{ all -> 0x0bb6 }
            r1.e(r2)     // Catch:{ all -> 0x0bb6 }
            android.content.pm.PackageManager r10 = r28.getPackageManager()     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r11 = r28.getPackageName()     // Catch:{ Exception -> 0x00c1 }
            r1 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r1 = r10.getPackageInfo(r11, r1)     // Catch:{ Exception -> 0x00c1 }
            java.lang.String[] r1 = r1.requestedPermissions     // Catch:{ Exception -> 0x00c1 }
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r10 = "android.permission.INTERNET"
            boolean r10 = r1.contains(r10)     // Catch:{ Exception -> 0x00c1 }
            if (r10 != 0) goto L_0x00a6
            java.lang.String r10 = "Permission android.permission.INTERNET is missing in the AndroidManifest.xml"
            b.b.e.f(r10)     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r10 = "PERMISSION_INTERNET_MISSING"
            r11 = 0
            I(r2, r11, r10, r11)     // Catch:{ Exception -> 0x00c1 }
        L_0x00a6:
            java.lang.String r10 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r10 = r1.contains(r10)     // Catch:{ Exception -> 0x00c1 }
            if (r10 != 0) goto L_0x00b3
            java.lang.String r10 = "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml"
            b.b.e.f(r10)     // Catch:{ Exception -> 0x00c1 }
        L_0x00b3:
            java.lang.String r10 = "android.permission.ACCESS_WIFI_STATE"
            boolean r1 = r1.contains(r10)     // Catch:{ Exception -> 0x00c1 }
            if (r1 != 0) goto L_0x00c8
            java.lang.String r1 = "Permission android.permission.ACCESS_WIFI_STATE is missing in the AndroidManifest.xml"
            b.b.e.f(r1)     // Catch:{ Exception -> 0x00c1 }
            goto L_0x00c8
        L_0x00c1:
            r0 = move-exception
            r1 = r0
            java.lang.String r10 = "Exception while validation permissions. "
            b.b.e.b(r10, r1)     // Catch:{ all -> 0x0bb6 }
        L_0x00c8:
            if (r33 == 0) goto L_0x00d1
            java.lang.String r1 = "af_events_api"
            java.lang.String r10 = "1"
            r9.put(r1, r10)     // Catch:{ all -> 0x0bb6 }
        L_0x00d1:
            java.lang.String r1 = "brand"
            java.lang.String r10 = android.os.Build.BRAND     // Catch:{ all -> 0x0bb6 }
            r9.put(r1, r10)     // Catch:{ all -> 0x0bb6 }
            java.lang.String r1 = "device"
            java.lang.String r10 = android.os.Build.DEVICE     // Catch:{ all -> 0x0bb6 }
            r9.put(r1, r10)     // Catch:{ all -> 0x0bb6 }
            java.lang.String r1 = "product"
            java.lang.String r10 = android.os.Build.PRODUCT     // Catch:{ all -> 0x0bb6 }
            r9.put(r1, r10)     // Catch:{ all -> 0x0bb6 }
            java.lang.String r1 = "sdk"
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0bb6 }
            java.lang.String r10 = java.lang.Integer.toString(r10)     // Catch:{ all -> 0x0bb6 }
            r9.put(r1, r10)     // Catch:{ all -> 0x0bb6 }
            java.lang.String r1 = "model"
            java.lang.String r10 = android.os.Build.MODEL     // Catch:{ all -> 0x0bb6 }
            r9.put(r1, r10)     // Catch:{ all -> 0x0bb6 }
            java.lang.String r1 = "deviceType"
            java.lang.String r10 = android.os.Build.TYPE     // Catch:{ all -> 0x0bb6 }
            r9.put(r1, r10)     // Catch:{ all -> 0x0bb6 }
            java.lang.String r1 = "appsFlyerCount"
            java.lang.String r10 = "appsflyer-data"
            r11 = 0
            if (r7 == 0) goto L_0x024e
            android.content.Context r14 = r28.getApplicationContext()     // Catch:{ all -> 0x0bb6 }
            android.content.SharedPreferences r14 = r14.getSharedPreferences(r10, r11)     // Catch:{ all -> 0x0bb6 }
            boolean r14 = r14.contains(r1)     // Catch:{ all -> 0x0bb6 }
            r22 = 1
            r14 = r14 ^ 1
            if (r14 == 0) goto L_0x01c7
            b.b.j r14 = b.b.j.b()     // Catch:{ all -> 0x0bb6 }
            boolean r14 = r14.i()     // Catch:{ all -> 0x0bb6 }
            if (r14 != 0) goto L_0x012f
            float r14 = q(r28)     // Catch:{ all -> 0x0bb6 }
            java.lang.String r11 = "batteryLevel"
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x0bb6 }
            r9.put(r11, r14)     // Catch:{ all -> 0x0bb6 }
        L_0x012f:
            java.lang.String r14 = "OPPO"
            java.lang.String r11 = android.os.Build.BRAND     // Catch:{ all -> 0x0bb6 }
            boolean r11 = r14.equals(r11)     // Catch:{ all -> 0x0bb6 }
            if (r11 == 0) goto L_0x0141
            r11 = 23
            java.lang.String r14 = "OPPO device found"
            b.b.e.e(r14)     // Catch:{ all -> 0x0bb6 }
            goto L_0x0143
        L_0x0141:
            r11 = 18
        L_0x0143:
            int r14 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0bb6 }
            if (r14 < r11) goto L_0x01aa
            java.lang.String r11 = "keyPropDisableAFKeystore"
            b.b.j r14 = b.b.j.b()     // Catch:{ all -> 0x0bb6 }
            r23 = r8
            r8 = 0
            boolean r11 = r14.a(r11, r8)     // Catch:{ all -> 0x0bb6 }
            if (r11 != 0) goto L_0x01ac
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0bb6 }
            java.lang.String r11 = "OS SDK is="
            r8.<init>(r11)     // Catch:{ all -> 0x0bb6 }
            int r11 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0bb6 }
            r8.append(r11)     // Catch:{ all -> 0x0bb6 }
            java.lang.String r11 = "; use KeyStore"
            r8.append(r11)     // Catch:{ all -> 0x0bb6 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0bb6 }
            b.b.e.e(r8)     // Catch:{ all -> 0x0bb6 }
            b.b.d r8 = new b.b.d     // Catch:{ all -> 0x0bb6 }
            r8.<init>(r2)     // Catch:{ all -> 0x0bb6 }
            boolean r11 = r8.d()     // Catch:{ all -> 0x0bb6 }
            if (r11 != 0) goto L_0x0186
            java.lang.ref.WeakReference r11 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0bb6 }
            r11.<init>(r2)     // Catch:{ all -> 0x0bb6 }
            java.lang.String r11 = b.b.g0.b(r11)     // Catch:{ all -> 0x0bb6 }
            r8.g(r11)     // Catch:{ all -> 0x0bb6 }
            goto L_0x0189
        L_0x0186:
            r8.a()     // Catch:{ all -> 0x0bb6 }
        L_0x0189:
            java.lang.String r11 = "KSAppsFlyerId"
            java.lang.String r14 = r8.f()     // Catch:{ all -> 0x0bb6 }
            r24 = r12
            b.b.j r12 = b.b.j.b()     // Catch:{ all -> 0x0bb6 }
            r12.n(r11, r14)     // Catch:{ all -> 0x0bb6 }
            java.lang.String r11 = "KSAppsFlyerRICounter"
            int r8 = r8.b()     // Catch:{ all -> 0x0bb6 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0bb6 }
            b.b.j r12 = b.b.j.b()     // Catch:{ all -> 0x0bb6 }
            r12.n(r11, r8)     // Catch:{ all -> 0x0bb6 }
            goto L_0x01cb
        L_0x01aa:
            r23 = r8
        L_0x01ac:
            r24 = r12
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0bb6 }
            java.lang.String r11 = "OS SDK is="
            r8.<init>(r11)     // Catch:{ all -> 0x0bb6 }
            int r11 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0bb6 }
            r8.append(r11)     // Catch:{ all -> 0x0bb6 }
            java.lang.String r11 = "; no KeyStore usage"
            r8.append(r11)     // Catch:{ all -> 0x0bb6 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0bb6 }
            b.b.e.e(r8)     // Catch:{ all -> 0x0bb6 }
            goto L_0x01cb
        L_0x01c7:
            r23 = r8
            r24 = r12
        L_0x01cb:
            java.lang.String r8 = "timepassedsincelastlaunch"
            android.content.Context r11 = r28.getApplicationContext()     // Catch:{ all -> 0x0bb6 }
            r12 = 0
            android.content.SharedPreferences r11 = r11.getSharedPreferences(r10, r12)     // Catch:{ all -> 0x0bb6 }
            java.lang.String r12 = "AppsFlyerTimePassedSincePrevLaunch"
            r25 = r15
            r14 = 0
            long r11 = r11.getLong(r12, r14)     // Catch:{ all -> 0x0bb6 }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0bb6 }
            java.lang.String r7 = "AppsFlyerTimePassedSincePrevLaunch"
            W(r2, r7, r14)     // Catch:{ all -> 0x0bb6 }
            r20 = 0
            int r7 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r7 <= 0) goto L_0x01f4
            long r14 = r14 - r11
            r11 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 / r11
            goto L_0x01f6
        L_0x01f4:
            r14 = -1
        L_0x01f6:
            java.lang.String r7 = java.lang.Long.toString(r14)     // Catch:{ all -> 0x0bb6 }
            r9.put(r8, r7)     // Catch:{ all -> 0x0bb6 }
            b.b.j r7 = b.b.j.b()     // Catch:{ all -> 0x0bb6 }
            java.lang.String r8 = "oneLinkSlug"
            java.lang.String r7 = r7.g(r8)     // Catch:{ all -> 0x0bb6 }
            if (r7 == 0) goto L_0x021d
            java.lang.String r8 = "onelink_id"
            r9.put(r8, r7)     // Catch:{ all -> 0x0bb6 }
            java.lang.String r7 = "ol_ver"
            b.b.j r8 = b.b.j.b()     // Catch:{ all -> 0x0bb6 }
            java.lang.String r11 = "onelinkVersion"
            java.lang.String r8 = r8.g(r11)     // Catch:{ all -> 0x0bb6 }
            r9.put(r7, r8)     // Catch:{ all -> 0x0bb6 }
        L_0x021d:
            java.lang.String r7 = "appsflyerGetConversionDataTiming"
            r11 = 0
            long r7 = r6.getLong(r7, r11)     // Catch:{ all -> 0x0bb6 }
            int r14 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r14 <= 0) goto L_0x024a
            java.lang.String r11 = "gcd_timing"
            java.lang.String r7 = java.lang.Long.toString(r7)     // Catch:{ all -> 0x0bb6 }
            r9.put(r11, r7)     // Catch:{ all -> 0x0bb6 }
            java.lang.String r7 = "appsflyerGetConversionDataTiming"
            android.content.SharedPreferences$Editor r8 = r34.edit()     // Catch:{ all -> 0x0bb6 }
            r11 = 0
            r8.putLong(r7, r11)     // Catch:{ all -> 0x0bb6 }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0bb6 }
            r11 = 9
            if (r7 < r11) goto L_0x0247
            r8.apply()     // Catch:{ all -> 0x0bb6 }
            goto L_0x024a
        L_0x0247:
            r8.commit()     // Catch:{ all -> 0x0bb6 }
        L_0x024a:
            r26 = r1
            goto L_0x02c5
        L_0x024e:
            r23 = r8
            r24 = r12
            r25 = r15
            android.content.Context r7 = r28.getApplicationContext()     // Catch:{ all -> 0x0bb6 }
            r8 = 0
            android.content.SharedPreferences r7 = r7.getSharedPreferences(r10, r8)     // Catch:{ all -> 0x0bb6 }
            android.content.SharedPreferences$Editor r8 = r7.edit()     // Catch:{ all -> 0x0bb6 }
            r11 = 0
            java.lang.String r12 = r7.getString(r14, r11)     // Catch:{ Exception -> 0x02bc }
            java.lang.String r11 = "prev_event_timestamp"
            java.lang.String r15 = "prev_event_value"
            if (r12 == 0) goto L_0x029d
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x02bc }
            r6.<init>()     // Catch:{ Exception -> 0x02bc }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02bc }
            r3.<init>()     // Catch:{ Exception -> 0x02bc }
            r26 = r1
            r1 = -1
            long r1 = r7.getLong(r11, r1)     // Catch:{ Exception -> 0x02ba }
            r3.append(r1)     // Catch:{ Exception -> 0x02ba }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x02ba }
            r6.put(r11, r1)     // Catch:{ Exception -> 0x02ba }
            r1 = 0
            java.lang.String r2 = r7.getString(r15, r1)     // Catch:{ Exception -> 0x02ba }
            r6.put(r15, r2)     // Catch:{ Exception -> 0x02ba }
            r6.put(r14, r12)     // Catch:{ Exception -> 0x02ba }
            java.lang.String r1 = "prev_event"
            java.lang.String r2 = r6.toString()     // Catch:{ Exception -> 0x02ba }
            r9.put(r1, r2)     // Catch:{ Exception -> 0x02ba }
            goto L_0x029f
        L_0x029d:
            r26 = r1
        L_0x029f:
            r8.putString(r14, r4)     // Catch:{ Exception -> 0x02ba }
            r8.putString(r15, r5)     // Catch:{ Exception -> 0x02ba }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x02ba }
            r8.putLong(r11, r1)     // Catch:{ Exception -> 0x02ba }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x02ba }
            r2 = 9
            if (r1 < r2) goto L_0x02b6
            r8.apply()     // Catch:{ Exception -> 0x02ba }
            goto L_0x02c5
        L_0x02b6:
            r8.commit()     // Catch:{ Exception -> 0x02ba }
            goto L_0x02c5
        L_0x02ba:
            r0 = move-exception
            goto L_0x02bf
        L_0x02bc:
            r0 = move-exception
            r26 = r1
        L_0x02bf:
            r1 = r0
            java.lang.String r2 = "Error while processing previous event."
            b.b.e.b(r2, r1)     // Catch:{ all -> 0x0bb6 }
        L_0x02c5:
            java.lang.String r1 = "KSAppsFlyerId"
            b.b.j r2 = b.b.j.b()     // Catch:{ all -> 0x0bb6 }
            java.lang.String r1 = r2.g(r1)     // Catch:{ all -> 0x0bb6 }
            java.lang.String r2 = "KSAppsFlyerRICounter"
            b.b.j r3 = b.b.j.b()     // Catch:{ all -> 0x0bb6 }
            java.lang.String r2 = r3.g(r2)     // Catch:{ all -> 0x0bb6 }
            if (r1 == 0) goto L_0x02f1
            if (r2 == 0) goto L_0x02f1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0bb6 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0bb6 }
            if (r3 <= 0) goto L_0x02f1
            java.lang.String r3 = "reinstallCounter"
            r9.put(r3, r2)     // Catch:{ all -> 0x0bb6 }
            java.lang.String r2 = "originalAppsflyerId"
            r9.put(r2, r1)     // Catch:{ all -> 0x0bb6 }
        L_0x02f1:
            java.lang.String r1 = "additionalCustomData"
            b.b.j r2 = b.b.j.b()     // Catch:{ all -> 0x0bb6 }
            java.lang.String r1 = r2.g(r1)     // Catch:{ all -> 0x0bb6 }
            if (r1 == 0) goto L_0x0302
            java.lang.String r2 = "customData"
            r9.put(r2, r1)     // Catch:{ all -> 0x0bb6 }
        L_0x0302:
            android.content.pm.PackageManager r1 = r28.getPackageManager()     // Catch:{ Exception -> 0x0316 }
            java.lang.String r2 = r28.getPackageName()     // Catch:{ Exception -> 0x0316 }
            java.lang.String r1 = r1.getInstallerPackageName(r2)     // Catch:{ Exception -> 0x0316 }
            if (r1 == 0) goto L_0x031d
            java.lang.String r2 = "installer_package"
            r9.put(r2, r1)     // Catch:{ Exception -> 0x0316 }
            goto L_0x031d
        L_0x0316:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = "Exception while getting the app's installer package. "
            b.b.e.b(r2, r1)     // Catch:{ all -> 0x0bb6 }
        L_0x031d:
            b.b.j r1 = b.b.j.b()     // Catch:{ all -> 0x0bb6 }
            java.lang.String r2 = "sdkExtension"
            java.lang.String r1 = r1.g(r2)     // Catch:{ all -> 0x0bb6 }
            if (r1 == 0) goto L_0x0334
            int r2 = r1.length()     // Catch:{ all -> 0x0bb6 }
            if (r2 <= 0) goto L_0x0334
            java.lang.String r2 = "sdkExtension"
            r9.put(r2, r1)     // Catch:{ all -> 0x0bb6 }
        L_0x0334:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0bb6 }
            r2 = r28
            r1.<init>(r2)     // Catch:{ all -> 0x0bb6 }
            java.lang.String r1 = C(r1)     // Catch:{ all -> 0x0bb6 }
            java.lang.String r3 = s0(r2, r1)     // Catch:{ all -> 0x0bb6 }
            if (r3 == 0) goto L_0x034a
            java.lang.String r6 = "channel"
            r9.put(r6, r3)     // Catch:{ all -> 0x0bb6 }
        L_0x034a:
            if (r3 == 0) goto L_0x0352
            boolean r6 = r3.equals(r1)     // Catch:{ all -> 0x0bb6 }
            if (r6 == 0) goto L_0x0356
        L_0x0352:
            if (r3 != 0) goto L_0x035b
            if (r1 == 0) goto L_0x035b
        L_0x0356:
            java.lang.String r3 = "af_latestchannel"
            r9.put(r3, r1)     // Catch:{ all -> 0x0bb6 }
        L_0x035b:
            android.content.Context r1 = r28.getApplicationContext()     // Catch:{ all -> 0x0bb6 }
            r3 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r10, r3)     // Catch:{ all -> 0x0bb6 }
            boolean r3 = r1.contains(r13)     // Catch:{ all -> 0x0bb6 }
            if (r3 == 0) goto L_0x0372
            r3 = 0
            java.lang.String r1 = r1.getString(r13, r3)     // Catch:{ all -> 0x0bb6 }
            r3 = r26
            goto L_0x038e
        L_0x0372:
            android.content.Context r1 = r28.getApplicationContext()     // Catch:{ all -> 0x0bb6 }
            r3 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r10, r3)     // Catch:{ all -> 0x0bb6 }
            r3 = r26
            boolean r1 = r1.contains(r3)     // Catch:{ all -> 0x0bb6 }
            r6 = 1
            r1 = r1 ^ r6
            if (r1 == 0) goto L_0x038a
            java.lang.String r1 = p(r28)     // Catch:{ all -> 0x0bb6 }
            goto L_0x038b
        L_0x038a:
            r1 = 0
        L_0x038b:
            X(r2, r13, r1)     // Catch:{ all -> 0x0bb6 }
        L_0x038e:
            if (r1 == 0) goto L_0x0399
            java.lang.String r6 = "af_installstore"
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ all -> 0x0bb6 }
            r9.put(r6, r1)     // Catch:{ all -> 0x0bb6 }
        L_0x0399:
            android.content.Context r1 = r28.getApplicationContext()     // Catch:{ all -> 0x0bb6 }
            r6 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r10, r6)     // Catch:{ all -> 0x0bb6 }
            b.b.j r6 = b.b.j.b()     // Catch:{ all -> 0x0bb6 }
            r7 = r25
            java.lang.String r6 = r6.g(r7)     // Catch:{ all -> 0x0bb6 }
            if (r6 != 0) goto L_0x0456
            boolean r8 = r1.contains(r7)     // Catch:{ all -> 0x0bb6 }
            if (r8 == 0) goto L_0x03bc
            r6 = 0
            java.lang.String r1 = r1.getString(r7, r6)     // Catch:{ all -> 0x0bb6 }
            r6 = r1
            goto L_0x044d
        L_0x03bc:
            android.content.Context r1 = r28.getApplicationContext()     // Catch:{ all -> 0x0bb6 }
            r8 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r10, r8)     // Catch:{ all -> 0x0bb6 }
            boolean r1 = r1.contains(r3)     // Catch:{ all -> 0x0bb6 }
            r8 = 1
            r1 = r1 ^ r8
            if (r1 == 0) goto L_0x0448
            java.lang.String r1 = "ro.appsflyer.preinstall.path"
            java.lang.String r1 = Z(r1)     // Catch:{ all -> 0x0bb6 }
            java.io.File r1 = k0(r1)     // Catch:{ all -> 0x0bb6 }
            if (r1 == 0) goto L_0x03e2
            boolean r6 = r1.exists()     // Catch:{ all -> 0x0bb6 }
            if (r6 != 0) goto L_0x03e0
            goto L_0x03e2
        L_0x03e0:
            r6 = 0
            goto L_0x03e3
        L_0x03e2:
            r6 = 1
        L_0x03e3:
            if (r6 == 0) goto L_0x03f7
            java.lang.String r1 = "AF_PRE_INSTALL_PATH"
            android.content.pm.PackageManager r6 = r28.getPackageManager()     // Catch:{ all -> 0x0bb6 }
            java.lang.String r8 = r28.getPackageName()     // Catch:{ all -> 0x0bb6 }
            java.lang.String r1 = B(r1, r6, r8)     // Catch:{ all -> 0x0bb6 }
            java.io.File r1 = k0(r1)     // Catch:{ all -> 0x0bb6 }
        L_0x03f7:
            if (r1 == 0) goto L_0x0402
            boolean r6 = r1.exists()     // Catch:{ all -> 0x0bb6 }
            if (r6 != 0) goto L_0x0400
            goto L_0x0402
        L_0x0400:
            r6 = 0
            goto L_0x0403
        L_0x0402:
            r6 = 1
        L_0x0403:
            if (r6 == 0) goto L_0x040b
            java.lang.String r1 = "/data/local/tmp/pre_install.appsflyer"
            java.io.File r1 = k0(r1)     // Catch:{ all -> 0x0bb6 }
        L_0x040b:
            if (r1 == 0) goto L_0x0416
            boolean r6 = r1.exists()     // Catch:{ all -> 0x0bb6 }
            if (r6 != 0) goto L_0x0414
            goto L_0x0416
        L_0x0414:
            r6 = 0
            goto L_0x0417
        L_0x0416:
            r6 = 1
        L_0x0417:
            if (r6 == 0) goto L_0x041f
            java.lang.String r1 = "/etc/pre_install.appsflyer"
            java.io.File r1 = k0(r1)     // Catch:{ all -> 0x0bb6 }
        L_0x041f:
            if (r1 == 0) goto L_0x042a
            boolean r6 = r1.exists()     // Catch:{ all -> 0x0bb6 }
            if (r6 != 0) goto L_0x0428
            goto L_0x042a
        L_0x0428:
            r6 = 0
            goto L_0x042b
        L_0x042a:
            r6 = 1
        L_0x042b:
            if (r6 != 0) goto L_0x0438
            java.lang.String r6 = r28.getPackageName()     // Catch:{ all -> 0x0bb6 }
            java.lang.String r1 = l0(r1, r6)     // Catch:{ all -> 0x0bb6 }
            if (r1 == 0) goto L_0x0438
            goto L_0x0439
        L_0x0438:
            r1 = 0
        L_0x0439:
            if (r1 == 0) goto L_0x043d
            r6 = r1
            goto L_0x0448
        L_0x043d:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0bb6 }
            r1.<init>(r2)     // Catch:{ all -> 0x0bb6 }
            java.lang.String r6 = "AF_PRE_INSTALL_NAME"
            java.lang.String r6 = O(r1, r6)     // Catch:{ all -> 0x0bb6 }
        L_0x0448:
            if (r6 == 0) goto L_0x044d
            X(r2, r7, r6)     // Catch:{ all -> 0x0bb6 }
        L_0x044d:
            if (r6 == 0) goto L_0x0456
            b.b.j r1 = b.b.j.b()     // Catch:{ all -> 0x0bb6 }
            r1.n(r7, r6)     // Catch:{ all -> 0x0bb6 }
        L_0x0456:
            if (r6 == 0) goto L_0x0461
            java.lang.String r1 = "af_preinstall_name"
            java.lang.String r6 = r6.toLowerCase()     // Catch:{ all -> 0x0bb6 }
            r9.put(r1, r6)     // Catch:{ all -> 0x0bb6 }
        L_0x0461:
            java.lang.String r1 = p(r28)     // Catch:{ all -> 0x0bb6 }
            if (r1 == 0) goto L_0x0470
            java.lang.String r6 = "af_currentstore"
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ all -> 0x0bb6 }
            r9.put(r6, r1)     // Catch:{ all -> 0x0bb6 }
        L_0x0470:
            java.lang.String r1 = "appsflyerKey"
            r6 = r29
            if (r6 == 0) goto L_0x0480
            int r7 = r29.length()     // Catch:{ all -> 0x0bb6 }
            if (r7 < 0) goto L_0x0480
            r9.put(r1, r6)     // Catch:{ all -> 0x0bb6 }
            goto L_0x0495
        L_0x0480:
            java.lang.String r6 = "AppsFlyerKey"
            b.b.j r7 = b.b.j.b()     // Catch:{ all -> 0x0bb6 }
            java.lang.String r6 = r7.g(r6)     // Catch:{ all -> 0x0bb6 }
            if (r6 == 0) goto L_0x0b9f
            int r7 = r6.length()     // Catch:{ all -> 0x0bb6 }
            if (r7 < 0) goto L_0x0b9f
            r9.put(r1, r6)     // Catch:{ all -> 0x0bb6 }
        L_0x0495:
            java.lang.String r6 = "AppUserId"
            b.b.j r7 = b.b.j.b()     // Catch:{ all -> 0x0bb6 }
            java.lang.String r6 = r7.g(r6)     // Catch:{ all -> 0x0bb6 }
            if (r6 == 0) goto L_0x04a6
            java.lang.String r7 = "appUserId"
            r9.put(r7, r6)     // Catch:{ all -> 0x0bb6 }
        L_0x04a6:
            b.b.j r6 = b.b.j.b()     // Catch:{ all -> 0x0bb6 }
            java.lang.String r7 = "userEmails"
            java.lang.String r6 = r6.g(r7)     // Catch:{ all -> 0x0bb6 }
            if (r6 == 0) goto L_0x04b8
            java.lang.String r7 = "user_emails"
            r9.put(r7, r6)     // Catch:{ all -> 0x0bb6 }
            goto L_0x04cd
        L_0x04b8:
            java.lang.String r6 = "userEmail"
            b.b.j r7 = b.b.j.b()     // Catch:{ all -> 0x0bb6 }
            java.lang.String r6 = r7.g(r6)     // Catch:{ all -> 0x0bb6 }
            if (r6 == 0) goto L_0x04cd
            java.lang.String r7 = "sha1_el"
            java.lang.String r6 = b.b.e0.a(r6)     // Catch:{ all -> 0x0bb6 }
            r9.put(r7, r6)     // Catch:{ all -> 0x0bb6 }
        L_0x04cd:
            if (r4 == 0) goto L_0x04db
            java.lang.String r6 = "eventName"
            r9.put(r6, r4)     // Catch:{ all -> 0x0bb6 }
            if (r5 == 0) goto L_0x04db
            java.lang.String r6 = "eventValue"
            r9.put(r6, r5)     // Catch:{ all -> 0x0bb6 }
        L_0x04db:
            b.b.j r5 = b.b.j.b()     // Catch:{ all -> 0x0bb6 }
            r6 = r17
            java.lang.String r5 = r5.g(r6)     // Catch:{ all -> 0x0bb6 }
            if (r5 == 0) goto L_0x04f2
            b.b.j r5 = b.b.j.b()     // Catch:{ all -> 0x0bb6 }
            java.lang.String r5 = r5.g(r6)     // Catch:{ all -> 0x0bb6 }
            r9.put(r6, r5)     // Catch:{ all -> 0x0bb6 }
        L_0x04f2:
            java.lang.String r5 = "currencyCode"
            b.b.j r6 = b.b.j.b()     // Catch:{ all -> 0x0bb6 }
            java.lang.String r5 = r6.g(r5)     // Catch:{ all -> 0x0bb6 }
            if (r5 == 0) goto L_0x0520
            int r6 = r5.length()     // Catch:{ all -> 0x0bb6 }
            r7 = 3
            if (r6 == r7) goto L_0x051b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0bb6 }
            java.lang.String r7 = "WARNING: currency code should be 3 characters!!! '"
            r6.<init>(r7)     // Catch:{ all -> 0x0bb6 }
            r6.append(r5)     // Catch:{ all -> 0x0bb6 }
            java.lang.String r7 = "' is not a legal value."
            r6.append(r7)     // Catch:{ all -> 0x0bb6 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0bb6 }
            b.b.e.f(r6)     // Catch:{ all -> 0x0bb6 }
        L_0x051b:
            java.lang.String r6 = "currency"
            r9.put(r6, r5)     // Catch:{ all -> 0x0bb6 }
        L_0x0520:
            java.lang.String r5 = "IS_UPDATE"
            b.b.j r6 = b.b.j.b()     // Catch:{ all -> 0x0bb6 }
            java.lang.String r5 = r6.g(r5)     // Catch:{ all -> 0x0bb6 }
            if (r5 == 0) goto L_0x0531
            java.lang.String r6 = "isUpdate"
            r9.put(r6, r5)     // Catch:{ all -> 0x0bb6 }
        L_0x0531:
            boolean r5 = r27.i(r28)     // Catch:{ all -> 0x0bb6 }
            java.lang.String r6 = "af_preinstalled"
            java.lang.String r5 = java.lang.Boolean.toString(r5)     // Catch:{ all -> 0x0bb6 }
            r9.put(r6, r5)     // Catch:{ all -> 0x0bb6 }
            b.b.j r5 = b.b.j.b()     // Catch:{ all -> 0x0bb6 }
            java.lang.String r6 = "collectFacebookAttrId"
            r7 = 1
            boolean r5 = r5.a(r6, r7)     // Catch:{ all -> 0x0bb6 }
            if (r5 == 0) goto L_0x057d
            android.content.pm.PackageManager r5 = r28.getPackageManager()     // Catch:{ NameNotFoundException -> 0x056d, all -> 0x0562 }
            java.lang.String r6 = "com.facebook.katana"
            r7 = 0
            r5.getApplicationInfo(r6, r7)     // Catch:{ NameNotFoundException -> 0x056d, all -> 0x0562 }
            android.content.ContentResolver r5 = r28.getContentResolver()     // Catch:{ NameNotFoundException -> 0x056d, all -> 0x0562 }
            r6 = r27
            java.lang.String r5 = r6.b(r5)     // Catch:{ NameNotFoundException -> 0x056f, all -> 0x0560 }
            goto L_0x0575
        L_0x0560:
            r0 = move-exception
            goto L_0x0565
        L_0x0562:
            r0 = move-exception
            r6 = r27
        L_0x0565:
            r5 = r0
            java.lang.String r7 = "Exception while collecting facebook's attribution ID. "
            b.b.e.b(r7, r5)     // Catch:{ all -> 0x0bb4 }
        L_0x056b:
            r5 = 0
            goto L_0x0575
        L_0x056d:
            r6 = r27
        L_0x056f:
            java.lang.String r5 = "Exception while collecting facebook's attribution ID. "
            b.b.e.f(r5)     // Catch:{ all -> 0x0bb4 }
            goto L_0x056b
        L_0x0575:
            if (r5 == 0) goto L_0x057f
            java.lang.String r7 = "fb"
            r9.put(r7, r5)     // Catch:{ all -> 0x0bb4 }
            goto L_0x057f
        L_0x057d:
            r6 = r27
        L_0x057f:
            b.b.j r5 = b.b.j.b()     // Catch:{ all -> 0x0bb4 }
            java.lang.String r7 = "deviceTrackingDisabled"
            r8 = 0
            boolean r5 = r5.a(r7, r8)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r7 = "true"
            if (r5 == 0) goto L_0x0595
            java.lang.String r5 = "deviceTrackingDisabled"
            r9.put(r5, r7)     // Catch:{ all -> 0x0bb4 }
            goto L_0x06b4
        L_0x0595:
            android.content.Context r5 = r28.getApplicationContext()     // Catch:{ all -> 0x0bb4 }
            r8 = 0
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r10, r8)     // Catch:{ all -> 0x0bb4 }
            b.b.j r8 = b.b.j.b()     // Catch:{ all -> 0x0bb4 }
            java.lang.String r11 = "collectIMEI"
            r12 = 1
            boolean r8 = r8.a(r11, r12)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r11 = "imeiCached"
            r12 = 0
            java.lang.String r11 = r5.getString(r11, r12)     // Catch:{ all -> 0x0bb4 }
            if (r8 == 0) goto L_0x0624
            java.lang.String r8 = r6.l     // Catch:{ all -> 0x0bb4 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0bb4 }
            if (r8 == 0) goto L_0x0624
            boolean r8 = r0(r28)     // Catch:{ all -> 0x0bb4 }
            if (r8 == 0) goto L_0x062c
            java.lang.String r8 = "phone"
            java.lang.Object r8 = r2.getSystemService(r8)     // Catch:{ InvocationTargetException -> 0x060d, Exception -> 0x05f4 }
            android.telephony.TelephonyManager r8 = (android.telephony.TelephonyManager) r8     // Catch:{ InvocationTargetException -> 0x060d, Exception -> 0x05f4 }
            java.lang.Class r12 = r8.getClass()     // Catch:{ InvocationTargetException -> 0x060d, Exception -> 0x05f4 }
            java.lang.String r13 = "getDeviceId"
            r14 = 0
            java.lang.Class[] r15 = new java.lang.Class[r14]     // Catch:{ InvocationTargetException -> 0x060d, Exception -> 0x05f4 }
            java.lang.reflect.Method r12 = r12.getMethod(r13, r15)     // Catch:{ InvocationTargetException -> 0x060d, Exception -> 0x05f4 }
            java.lang.Object[] r13 = new java.lang.Object[r14]     // Catch:{ InvocationTargetException -> 0x060d, Exception -> 0x05f4 }
            java.lang.Object r8 = r12.invoke(r8, r13)     // Catch:{ InvocationTargetException -> 0x060d, Exception -> 0x05f4 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ InvocationTargetException -> 0x060d, Exception -> 0x05f4 }
            if (r8 == 0) goto L_0x05e0
            goto L_0x062a
        L_0x05e0:
            if (r11 == 0) goto L_0x062c
            java.lang.String r8 = java.lang.String.valueOf(r11)     // Catch:{ InvocationTargetException -> 0x060d, Exception -> 0x05f4 }
            r12 = r18
            java.lang.String r8 = r12.concat(r8)     // Catch:{ InvocationTargetException -> 0x05f2, Exception -> 0x05f0 }
            b.b.e.a(r8)     // Catch:{ InvocationTargetException -> 0x05f2, Exception -> 0x05f0 }
            goto L_0x062d
        L_0x05f0:
            r0 = move-exception
            goto L_0x05f7
        L_0x05f2:
            goto L_0x060f
        L_0x05f4:
            r0 = move-exception
            r12 = r18
        L_0x05f7:
            r8 = r0
            if (r11 == 0) goto L_0x0606
            java.lang.String r13 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r12 = r12.concat(r13)     // Catch:{ all -> 0x0bb4 }
            b.b.e.a(r12)     // Catch:{ all -> 0x0bb4 }
            goto L_0x0607
        L_0x0606:
            r11 = 0
        L_0x0607:
            java.lang.String r12 = "WARNING: other reason: "
            b.b.e.b(r12, r8)     // Catch:{ all -> 0x0bb4 }
            goto L_0x062d
        L_0x060d:
            r12 = r18
        L_0x060f:
            if (r11 == 0) goto L_0x061d
            java.lang.String r8 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r8 = r12.concat(r8)     // Catch:{ all -> 0x0bb4 }
            b.b.e.a(r8)     // Catch:{ all -> 0x0bb4 }
            goto L_0x061e
        L_0x061d:
            r11 = 0
        L_0x061e:
            java.lang.String r8 = "WARNING: READ_PHONE_STATE is missing."
            b.b.e.f(r8)     // Catch:{ all -> 0x0bb4 }
            goto L_0x062d
        L_0x0624:
            java.lang.String r8 = r6.l     // Catch:{ all -> 0x0bb4 }
            if (r8 == 0) goto L_0x062c
            java.lang.String r8 = r6.l     // Catch:{ all -> 0x0bb4 }
        L_0x062a:
            r11 = r8
            goto L_0x062d
        L_0x062c:
            r11 = 0
        L_0x062d:
            if (r11 == 0) goto L_0x063a
            java.lang.String r8 = "imeiCached"
            X(r2, r8, r11)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r8 = "imei"
            r9.put(r8, r11)     // Catch:{ all -> 0x0bb4 }
            goto L_0x063f
        L_0x063a:
            java.lang.String r8 = "IMEI was not collected."
            b.b.e.c(r8)     // Catch:{ all -> 0x0bb4 }
        L_0x063f:
            b.b.j r8 = b.b.j.b()     // Catch:{ all -> 0x0bb4 }
            java.lang.String r11 = "collectAndroidId"
            r12 = 1
            boolean r8 = r8.a(r11, r12)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r11 = "androidIdCached"
            r12 = 0
            java.lang.String r5 = r5.getString(r11, r12)     // Catch:{ all -> 0x0bb4 }
            if (r8 == 0) goto L_0x069a
            java.lang.String r8 = r6.m     // Catch:{ all -> 0x0bb4 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0bb4 }
            if (r8 == 0) goto L_0x069a
            boolean r8 = r0(r28)     // Catch:{ all -> 0x0bb4 }
            if (r8 == 0) goto L_0x06a1
            android.content.ContentResolver r8 = r28.getContentResolver()     // Catch:{ Exception -> 0x067f }
            java.lang.String r11 = "android_id"
            java.lang.String r8 = android.provider.Settings.Secure.getString(r8, r11)     // Catch:{ Exception -> 0x067f }
            if (r8 == 0) goto L_0x066f
            r5 = r8
            goto L_0x06a2
        L_0x066f:
            if (r5 == 0) goto L_0x06a1
            java.lang.String r8 = "use cached AndroidId: "
            java.lang.String r11 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x067f }
            java.lang.String r8 = r8.concat(r11)     // Catch:{ Exception -> 0x067f }
            b.b.e.a(r8)     // Catch:{ Exception -> 0x067f }
            goto L_0x06a2
        L_0x067f:
            r0 = move-exception
            r8 = r0
            if (r5 == 0) goto L_0x0691
            java.lang.String r11 = "use cached AndroidId: "
            java.lang.String r12 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r11 = r11.concat(r12)     // Catch:{ all -> 0x0bb4 }
            b.b.e.a(r11)     // Catch:{ all -> 0x0bb4 }
            goto L_0x0692
        L_0x0691:
            r5 = 0
        L_0x0692:
            java.lang.String r11 = r8.getMessage()     // Catch:{ all -> 0x0bb4 }
            b.b.e.b(r11, r8)     // Catch:{ all -> 0x0bb4 }
            goto L_0x06a2
        L_0x069a:
            java.lang.String r5 = r6.m     // Catch:{ all -> 0x0bb4 }
            if (r5 == 0) goto L_0x06a1
            java.lang.String r5 = r6.m     // Catch:{ all -> 0x0bb4 }
            goto L_0x06a2
        L_0x06a1:
            r5 = 0
        L_0x06a2:
            if (r5 == 0) goto L_0x06af
            java.lang.String r8 = "androidIdCached"
            X(r2, r8, r5)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r8 = "android_id"
            r9.put(r8, r5)     // Catch:{ all -> 0x0bb4 }
            goto L_0x06b4
        L_0x06af:
            java.lang.String r5 = "Android ID was not collected."
            b.b.e.c(r5)     // Catch:{ all -> 0x0bb4 }
        L_0x06b4:
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference     // Catch:{ Exception -> 0x06c7 }
            r5.<init>(r2)     // Catch:{ Exception -> 0x06c7 }
            java.lang.String r5 = b.b.g0.b(r5)     // Catch:{ Exception -> 0x06c7 }
            r8 = r19
            if (r5 == 0) goto L_0x06e0
            r9.put(r8, r5)     // Catch:{ Exception -> 0x06c5 }
            goto L_0x06e0
        L_0x06c5:
            r0 = move-exception
            goto L_0x06ca
        L_0x06c7:
            r0 = move-exception
            r8 = r19
        L_0x06ca:
            r5 = r0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0bb4 }
            java.lang.String r12 = "ERROR: could not get uid "
            r11.<init>(r12)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r12 = r5.getMessage()     // Catch:{ all -> 0x0bb4 }
            r11.append(r12)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0bb4 }
            b.b.e.b(r11, r5)     // Catch:{ all -> 0x0bb4 }
        L_0x06e0:
            java.lang.String r5 = "lang"
            java.util.Locale r11 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x06ee }
            java.lang.String r11 = r11.getDisplayLanguage()     // Catch:{ Exception -> 0x06ee }
            r9.put(r5, r11)     // Catch:{ Exception -> 0x06ee }
            goto L_0x06f5
        L_0x06ee:
            r0 = move-exception
            r5 = r0
            java.lang.String r11 = "Exception while collecting display language name. "
            b.b.e.b(r11, r5)     // Catch:{ all -> 0x0bb4 }
        L_0x06f5:
            java.lang.String r5 = "lang_code"
            java.util.Locale r11 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0703 }
            java.lang.String r11 = r11.getLanguage()     // Catch:{ Exception -> 0x0703 }
            r9.put(r5, r11)     // Catch:{ Exception -> 0x0703 }
            goto L_0x070a
        L_0x0703:
            r0 = move-exception
            r5 = r0
            java.lang.String r11 = "Exception while collecting display language code. "
            b.b.e.b(r11, r5)     // Catch:{ all -> 0x0bb4 }
        L_0x070a:
            java.lang.String r5 = "country"
            java.util.Locale r11 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0718 }
            java.lang.String r11 = r11.getCountry()     // Catch:{ Exception -> 0x0718 }
            r9.put(r5, r11)     // Catch:{ Exception -> 0x0718 }
            goto L_0x071f
        L_0x0718:
            r0 = move-exception
            r5 = r0
            java.lang.String r11 = "Exception while collecting country name. "
            b.b.e.b(r11, r5)     // Catch:{ all -> 0x0bb4 }
        L_0x071f:
            java.lang.String r5 = "platformextension"
            b.b.f0 r11 = r6.u     // Catch:{ all -> 0x0bb4 }
            java.lang.String r11 = r11.b()     // Catch:{ all -> 0x0bb4 }
            r9.put(r5, r11)     // Catch:{ all -> 0x0bb4 }
            e0(r2, r9)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r5 = "yyyy-MM-dd_HHmmssZ"
            java.text.SimpleDateFormat r11 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x0bb4 }
            java.util.Locale r12 = java.util.Locale.US     // Catch:{ all -> 0x0bb4 }
            r11.<init>(r5, r12)     // Catch:{ all -> 0x0bb4 }
            android.content.pm.PackageManager r5 = r28.getPackageManager()     // Catch:{ Exception -> 0x075b }
            java.lang.String r12 = r28.getPackageName()     // Catch:{ Exception -> 0x075b }
            r13 = 0
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r12, r13)     // Catch:{ Exception -> 0x075b }
            long r12 = r5.firstInstallTime     // Catch:{ Exception -> 0x075b }
            java.lang.String r5 = "installDate"
            java.util.TimeZone r14 = java.util.TimeZone.getTimeZone(r16)     // Catch:{ Exception -> 0x075b }
            r11.setTimeZone(r14)     // Catch:{ Exception -> 0x075b }
            java.util.Date r14 = new java.util.Date     // Catch:{ Exception -> 0x075b }
            r14.<init>(r12)     // Catch:{ Exception -> 0x075b }
            java.lang.String r12 = r11.format(r14)     // Catch:{ Exception -> 0x075b }
            r9.put(r5, r12)     // Catch:{ Exception -> 0x075b }
            goto L_0x0762
        L_0x075b:
            r0 = move-exception
            r5 = r0
            java.lang.String r12 = "Exception while collecting install date. "
            b.b.e.b(r12, r5)     // Catch:{ all -> 0x0bb4 }
        L_0x0762:
            android.content.pm.PackageManager r5 = r28.getPackageManager()     // Catch:{ all -> 0x081f }
            java.lang.String r12 = r28.getPackageName()     // Catch:{ all -> 0x081f }
            r13 = 0
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r12, r13)     // Catch:{ all -> 0x081f }
            java.lang.String r12 = "versionCode"
            r14 = r34
            int r12 = r14.getInt(r12, r13)     // Catch:{ all -> 0x081d }
            int r15 = r5.versionCode     // Catch:{ all -> 0x081d }
            if (r15 <= r12) goto L_0x078e
            java.lang.String r12 = "appsflyerConversionDataRequestRetries"
            c0(r2, r12, r13)     // Catch:{ all -> 0x0788 }
            java.lang.String r12 = "versionCode"
            int r13 = r5.versionCode     // Catch:{ all -> 0x0788 }
            c0(r2, r12, r13)     // Catch:{ all -> 0x0788 }
            goto L_0x078e
        L_0x0788:
            r0 = move-exception
            r4 = r0
            r19 = r8
            goto L_0x0825
        L_0x078e:
            java.lang.String r12 = "app_version_code"
            int r13 = r5.versionCode     // Catch:{ all -> 0x081d }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ all -> 0x081d }
            r9.put(r12, r13)     // Catch:{ all -> 0x081d }
            java.lang.String r12 = "app_version_name"
            java.lang.String r13 = r5.versionName     // Catch:{ all -> 0x081d }
            r9.put(r12, r13)     // Catch:{ all -> 0x081d }
            long r12 = r5.firstInstallTime     // Catch:{ all -> 0x081d }
            long r4 = r5.lastUpdateTime     // Catch:{ all -> 0x081d }
            java.lang.String r15 = "date1"
            r19 = r8
            java.util.TimeZone r8 = java.util.TimeZone.getTimeZone(r16)     // Catch:{ all -> 0x081b }
            r11.setTimeZone(r8)     // Catch:{ all -> 0x081b }
            java.util.Date r8 = new java.util.Date     // Catch:{ all -> 0x081b }
            r8.<init>(r12)     // Catch:{ all -> 0x081b }
            java.lang.String r8 = r11.format(r8)     // Catch:{ all -> 0x081b }
            r9.put(r15, r8)     // Catch:{ all -> 0x081b }
            java.lang.String r8 = "date2"
            java.util.TimeZone r12 = java.util.TimeZone.getTimeZone(r16)     // Catch:{ all -> 0x081b }
            r11.setTimeZone(r12)     // Catch:{ all -> 0x081b }
            java.util.Date r12 = new java.util.Date     // Catch:{ all -> 0x081b }
            r12.<init>(r4)     // Catch:{ all -> 0x081b }
            java.lang.String r4 = r11.format(r12)     // Catch:{ all -> 0x081b }
            r9.put(r8, r4)     // Catch:{ all -> 0x081b }
            android.content.Context r4 = r28.getApplicationContext()     // Catch:{ all -> 0x081b }
            r5 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r10, r5)     // Catch:{ all -> 0x081b }
            java.lang.String r8 = "appsFlyerFirstInstall"
            r12 = 0
            java.lang.String r4 = r4.getString(r8, r12)     // Catch:{ all -> 0x081b }
            if (r4 != 0) goto L_0x0808
            android.content.Context r4 = r28.getApplicationContext()     // Catch:{ all -> 0x081b }
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r10, r5)     // Catch:{ all -> 0x081b }
            boolean r4 = r4.contains(r3)     // Catch:{ all -> 0x081b }
            r5 = 1
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x0801
            java.lang.String r4 = "AppsFlyer: first launch detected"
            b.b.e.a(r4)     // Catch:{ all -> 0x081b }
            java.util.Date r4 = new java.util.Date     // Catch:{ all -> 0x081b }
            r4.<init>()     // Catch:{ all -> 0x081b }
            java.lang.String r4 = r11.format(r4)     // Catch:{ all -> 0x081b }
            goto L_0x0803
        L_0x0801:
            java.lang.String r4 = ""
        L_0x0803:
            java.lang.String r5 = "appsFlyerFirstInstall"
            X(r2, r5, r4)     // Catch:{ all -> 0x081b }
        L_0x0808:
            java.lang.String r5 = "AppsFlyer: first launch date: "
            java.lang.String r8 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x081b }
            java.lang.String r5 = r5.concat(r8)     // Catch:{ all -> 0x081b }
            b.b.e.c(r5)     // Catch:{ all -> 0x081b }
            java.lang.String r5 = "firstLaunchDate"
            r9.put(r5, r4)     // Catch:{ all -> 0x081b }
            goto L_0x082a
        L_0x081b:
            r0 = move-exception
            goto L_0x0824
        L_0x081d:
            r0 = move-exception
            goto L_0x0822
        L_0x081f:
            r0 = move-exception
            r14 = r34
        L_0x0822:
            r19 = r8
        L_0x0824:
            r4 = r0
        L_0x0825:
            java.lang.String r5 = "Exception while collecting app version data "
            b.b.e.b(r5, r4)     // Catch:{ all -> 0x0bb4 }
        L_0x082a:
            int r4 = r32.length()     // Catch:{ all -> 0x0bb4 }
            java.lang.String r5 = "referrer"
            if (r4 <= 0) goto L_0x0837
            r4 = r32
            r9.put(r5, r4)     // Catch:{ all -> 0x0bb4 }
        L_0x0837:
            java.lang.String r4 = "extraReferrers"
            r8 = 0
            java.lang.String r4 = r14.getString(r4, r8)     // Catch:{ all -> 0x0bb4 }
            if (r4 == 0) goto L_0x0845
            java.lang.String r8 = "extraReferrers"
            r9.put(r8, r4)     // Catch:{ all -> 0x0bb4 }
        L_0x0845:
            java.lang.String r4 = "afUninstallToken"
            b.b.j r8 = b.b.j.b()     // Catch:{ all -> 0x0bb4 }
            java.lang.String r4 = r8.g(r4)     // Catch:{ all -> 0x0bb4 }
            if (r4 == 0) goto L_0x085e
            b.b.p$a$a r4 = b.b.p.a.C0059a.c(r4)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r8 = "af_gcm_token"
            java.lang.String r4 = r4.a()     // Catch:{ all -> 0x0bb4 }
            r9.put(r8, r4)     // Catch:{ all -> 0x0bb4 }
        L_0x085e:
            boolean r4 = b.b.j0.c(r28)     // Catch:{ all -> 0x0bb4 }
            r6.s = r4     // Catch:{ all -> 0x0bb4 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0bb4 }
            java.lang.String r8 = "didConfigureTokenRefreshService="
            r4.<init>(r8)     // Catch:{ all -> 0x0bb4 }
            boolean r8 = r6.s     // Catch:{ all -> 0x0bb4 }
            r4.append(r8)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0bb4 }
            b.b.e.a(r4)     // Catch:{ all -> 0x0bb4 }
            boolean r4 = r6.s     // Catch:{ all -> 0x0bb4 }
            if (r4 != 0) goto L_0x0882
            java.lang.String r4 = "tokenRefreshConfigured"
            java.lang.Boolean r8 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0bb4 }
            r9.put(r4, r8)     // Catch:{ all -> 0x0bb4 }
        L_0x0882:
            r4 = r35
            if (r4 == 0) goto L_0x08b2
            b.b.a r8 = b.b.a.b()     // Catch:{ all -> 0x0bb4 }
            r10 = r36
            r8.c(r10, r2, r9)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r8 = r6.r     // Catch:{ all -> 0x0bb4 }
            if (r8 == 0) goto L_0x08a8
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ all -> 0x0bb4 }
            java.lang.String r10 = r6.r     // Catch:{ all -> 0x0bb4 }
            r8.<init>(r10)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r10 = "isPush"
            r8.put(r10, r7)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r10 = "af_deeplink"
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0bb4 }
            r9.put(r10, r8)     // Catch:{ all -> 0x0bb4 }
        L_0x08a8:
            r8 = 0
            r6.r = r8     // Catch:{ all -> 0x0bb4 }
            java.lang.String r8 = "open_referrer"
            r10 = r37
            r9.put(r8, r10)     // Catch:{ all -> 0x0bb4 }
        L_0x08b2:
            boolean r8 = r6.q     // Catch:{ all -> 0x0bb4 }
            if (r8 == 0) goto L_0x08cc
            java.lang.String r8 = "testAppMode_retargeting"
            r9.put(r8, r7)     // Catch:{ all -> 0x0bb4 }
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ all -> 0x0bb4 }
            r8.<init>(r9)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0bb4 }
            v(r2, r8)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r8 = "Sent retargeting params to test app"
            b.b.e.c(r8)     // Catch:{ all -> 0x0bb4 }
        L_0x08cc:
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0bb4 }
            long r12 = r6.o     // Catch:{ all -> 0x0bb4 }
            long r10 = r10 - r12
            b.b.j r8 = b.b.j.b()     // Catch:{ all -> 0x0bb4 }
            java.lang.String r8 = r8.f(r2)     // Catch:{ all -> 0x0bb4 }
            r12 = 30000(0x7530, double:1.4822E-319)
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 > 0) goto L_0x08ed
            if (r8 == 0) goto L_0x08ed
            java.lang.String r10 = "AppsFlyer_Test"
            boolean r8 = r8.contains(r10)     // Catch:{ all -> 0x0bb4 }
            if (r8 == 0) goto L_0x08ed
            r8 = 1
            goto L_0x08ee
        L_0x08ed:
            r8 = 0
        L_0x08ee:
            if (r8 == 0) goto L_0x090f
            java.lang.String r8 = "testAppMode"
            r9.put(r8, r7)     // Catch:{ all -> 0x0bb4 }
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ all -> 0x0bb4 }
            r8.<init>(r9)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0bb4 }
            v(r2, r8)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r8 = "Sent params to test app"
            b.b.e.c(r8)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r8 = "Test mode ended!"
            b.b.e.c(r8)     // Catch:{ all -> 0x0bb4 }
            r10 = 0
            r6.o = r10     // Catch:{ all -> 0x0bb4 }
        L_0x090f:
            java.lang.String r8 = "advertiserId"
            b.b.j r10 = b.b.j.b()     // Catch:{ all -> 0x0bb4 }
            java.lang.String r8 = r10.g(r8)     // Catch:{ all -> 0x0bb4 }
            if (r8 != 0) goto L_0x0937
            b.b.c0.a(r2, r9)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r8 = "advertiserId"
            b.b.j r10 = b.b.j.b()     // Catch:{ all -> 0x0bb4 }
            java.lang.String r8 = r10.g(r8)     // Catch:{ all -> 0x0bb4 }
            if (r8 == 0) goto L_0x0930
            java.lang.String r8 = "GAID_retry"
            r9.put(r8, r7)     // Catch:{ all -> 0x0bb4 }
            goto L_0x0937
        L_0x0930:
            java.lang.String r8 = "GAID_retry"
            java.lang.String r10 = "false"
            r9.put(r8, r10)     // Catch:{ all -> 0x0bb4 }
        L_0x0937:
            android.content.ContentResolver r8 = r28.getContentResolver()     // Catch:{ all -> 0x0bb4 }
            b.b.a0 r8 = b.b.c0.b(r8)     // Catch:{ all -> 0x0bb4 }
            if (r8 == 0) goto L_0x0957
            java.lang.String r10 = "amazon_aid"
            java.lang.String r11 = r8.a()     // Catch:{ all -> 0x0bb4 }
            r9.put(r10, r11)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r10 = "amazon_aid_limit"
            boolean r8 = r8.b()     // Catch:{ all -> 0x0bb4 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0bb4 }
            r9.put(r10, r8)     // Catch:{ all -> 0x0bb4 }
        L_0x0957:
            b.b.j r8 = b.b.j.b()     // Catch:{ all -> 0x0bb4 }
            java.lang.String r8 = r8.f(r2)     // Catch:{ all -> 0x0bb4 }
            if (r8 == 0) goto L_0x0970
            int r10 = r8.length()     // Catch:{ all -> 0x0bb4 }
            if (r10 <= 0) goto L_0x0970
            java.lang.Object r10 = r9.get(r5)     // Catch:{ all -> 0x0bb4 }
            if (r10 != 0) goto L_0x0970
            r9.put(r5, r8)     // Catch:{ all -> 0x0bb4 }
        L_0x0970:
            java.lang.String r5 = "sentSuccessfully"
            java.lang.String r8 = ""
            java.lang.String r5 = r14.getString(r5, r8)     // Catch:{ all -> 0x0bb4 }
            boolean r5 = r7.equals(r5)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r7 = "sentRegisterRequestToAF"
            r8 = 0
            boolean r7 = r14.getBoolean(r7, r8)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r8 = "registeredUninstall"
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x0bb4 }
            r9.put(r8, r7)     // Catch:{ all -> 0x0bb4 }
            int r3 = L(r14, r3, r4)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r7 = "counter"
            java.lang.String r8 = java.lang.Integer.toString(r3)     // Catch:{ all -> 0x0bb4 }
            r9.put(r7, r8)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r7 = "iaecounter"
            if (r30 == 0) goto L_0x099f
            r8 = 1
            goto L_0x09a0
        L_0x099f:
            r8 = 0
        L_0x09a0:
            java.lang.String r10 = "appsFlyerInAppEventCount"
            int r8 = L(r14, r10, r8)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r8 = java.lang.Integer.toString(r8)     // Catch:{ all -> 0x0bb4 }
            r9.put(r7, r8)     // Catch:{ all -> 0x0bb4 }
            if (r4 == 0) goto L_0x09d1
            r7 = 1
            if (r3 != r7) goto L_0x09d1
            b.b.j r7 = b.b.j.b()     // Catch:{ all -> 0x0bb4 }
            r7.o()     // Catch:{ all -> 0x0bb4 }
            java.lang.String r7 = "waitForCustomerId"
            b.b.j r8 = b.b.j.b()     // Catch:{ all -> 0x0bb4 }
            r10 = 0
            boolean r7 = r8.a(r7, r10)     // Catch:{ all -> 0x0bb4 }
            if (r7 == 0) goto L_0x09d1
            java.lang.String r7 = "wait_cid"
            r8 = 1
            java.lang.String r10 = java.lang.Boolean.toString(r8)     // Catch:{ all -> 0x0bb4 }
            r9.put(r7, r10)     // Catch:{ all -> 0x0bb4 }
            goto L_0x09d2
        L_0x09d1:
            r8 = 1
        L_0x09d2:
            java.lang.String r7 = "isFirstCall"
            if (r5 != 0) goto L_0x09d8
            r11 = 1
            goto L_0x09d9
        L_0x09d8:
            r11 = 0
        L_0x09d9:
            java.lang.String r5 = java.lang.Boolean.toString(r11)     // Catch:{ all -> 0x0bb4 }
            r9.put(r7, r5)     // Catch:{ all -> 0x0bb4 }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x0bb4 }
            r5.<init>()     // Catch:{ all -> 0x0bb4 }
            java.lang.String r7 = "cpu_abi"
            java.lang.String r8 = "ro.product.cpu.abi"
            java.lang.String r8 = Z(r8)     // Catch:{ all -> 0x0bb4 }
            r5.put(r7, r8)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r7 = "cpu_abi2"
            java.lang.String r8 = "ro.product.cpu.abi2"
            java.lang.String r8 = Z(r8)     // Catch:{ all -> 0x0bb4 }
            r5.put(r7, r8)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r7 = "arch"
            java.lang.String r8 = "os.arch"
            java.lang.String r8 = Z(r8)     // Catch:{ all -> 0x0bb4 }
            r5.put(r7, r8)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r7 = "build_display_id"
            java.lang.String r8 = "ro.build.display.id"
            java.lang.String r8 = Z(r8)     // Catch:{ all -> 0x0bb4 }
            r5.put(r7, r8)     // Catch:{ all -> 0x0bb4 }
            if (r4 == 0) goto L_0x0a8f
            boolean r4 = r6.p     // Catch:{ all -> 0x0bb4 }
            if (r4 == 0) goto L_0x0a57
            b.b.q r4 = b.b.q.a.f2067a     // Catch:{ all -> 0x0bb4 }
            android.location.Location r4 = b.b.q.b(r28)     // Catch:{ all -> 0x0bb4 }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x0bb4 }
            r8 = 3
            r7.<init>(r8)     // Catch:{ all -> 0x0bb4 }
            if (r4 == 0) goto L_0x0a4c
            java.lang.String r8 = "lat"
            double r10 = r4.getLatitude()     // Catch:{ all -> 0x0bb4 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0bb4 }
            r7.put(r8, r10)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r8 = "lon"
            double r10 = r4.getLongitude()     // Catch:{ all -> 0x0bb4 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0bb4 }
            r7.put(r8, r10)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r8 = "ts"
            long r10 = r4.getTime()     // Catch:{ all -> 0x0bb4 }
            java.lang.String r4 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0bb4 }
            r7.put(r8, r4)     // Catch:{ all -> 0x0bb4 }
        L_0x0a4c:
            boolean r4 = r7.isEmpty()     // Catch:{ all -> 0x0bb4 }
            if (r4 != 0) goto L_0x0a57
            java.lang.String r4 = "loc"
            r5.put(r4, r7)     // Catch:{ all -> 0x0bb4 }
        L_0x0a57:
            b.b.r r4 = b.b.r.a.f2069a     // Catch:{ all -> 0x0bb4 }
            b.b.r$b r4 = r4.a(r2)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r7 = "btl"
            float r8 = r4.b()     // Catch:{ all -> 0x0bb4 }
            java.lang.String r8 = java.lang.Float.toString(r8)     // Catch:{ all -> 0x0bb4 }
            r5.put(r7, r8)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r7 = r4.a()     // Catch:{ all -> 0x0bb4 }
            if (r7 == 0) goto L_0x0a79
            java.lang.String r7 = "btch"
            java.lang.String r4 = r4.a()     // Catch:{ all -> 0x0bb4 }
            r5.put(r7, r4)     // Catch:{ all -> 0x0bb4 }
        L_0x0a79:
            r4 = 2
            if (r4 < r3) goto L_0x0a8f
            b.b.y r3 = b.b.y.c(r28)     // Catch:{ all -> 0x0bb4 }
            java.util.List r3 = r3.b()     // Catch:{ all -> 0x0bb4 }
            boolean r4 = r3.isEmpty()     // Catch:{ all -> 0x0bb4 }
            if (r4 != 0) goto L_0x0a8f
            java.lang.String r4 = "sensors"
            r5.put(r4, r3)     // Catch:{ all -> 0x0bb4 }
        L_0x0a8f:
            java.util.Map r3 = b.b.f.a(r28)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r4 = "dim"
            r5.put(r4, r3)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r3 = "deviceData"
            r9.put(r3, r5)     // Catch:{ all -> 0x0bb4 }
            java.lang.Object r3 = r9.get(r1)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0bb4 }
            r4 = r24
            java.lang.Object r5 = r9.get(r4)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0bb4 }
            r7 = r19
            java.lang.Object r8 = r9.get(r7)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0bb4 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0bb4 }
            r10.<init>()     // Catch:{ all -> 0x0bb4 }
            r11 = 7
            r12 = 0
            java.lang.String r3 = r3.substring(r12, r11)     // Catch:{ all -> 0x0bb4 }
            r10.append(r3)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r3 = r8.substring(r12, r11)     // Catch:{ all -> 0x0bb4 }
            r10.append(r3)     // Catch:{ all -> 0x0bb4 }
            int r3 = r5.length()     // Catch:{ all -> 0x0bb4 }
            int r3 = r3 - r11
            java.lang.String r3 = r5.substring(r3)     // Catch:{ all -> 0x0bb4 }
            r10.append(r3)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r3 = r10.toString()     // Catch:{ all -> 0x0bb4 }
            java.lang.String r3 = b.b.e0.a(r3)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r5 = "af_v"
            r9.put(r5, r3)     // Catch:{ all -> 0x0bb4 }
            java.lang.Object r1 = r9.get(r1)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0bb4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0bb4 }
            r3.<init>()     // Catch:{ all -> 0x0bb4 }
            r3.append(r1)     // Catch:{ all -> 0x0bb4 }
            java.lang.Object r1 = r9.get(r4)     // Catch:{ all -> 0x0bb4 }
            r3.append(r1)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0bb4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0bb4 }
            r3.<init>()     // Catch:{ all -> 0x0bb4 }
            r3.append(r1)     // Catch:{ all -> 0x0bb4 }
            java.lang.Object r1 = r9.get(r7)     // Catch:{ all -> 0x0bb4 }
            r3.append(r1)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0bb4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0bb4 }
            r3.<init>()     // Catch:{ all -> 0x0bb4 }
            r3.append(r1)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r1 = "installDate"
            java.lang.Object r1 = r9.get(r1)     // Catch:{ all -> 0x0bb4 }
            r3.append(r1)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0bb4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0bb4 }
            r3.<init>()     // Catch:{ all -> 0x0bb4 }
            r3.append(r1)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r1 = "counter"
            java.lang.Object r1 = r9.get(r1)     // Catch:{ all -> 0x0bb4 }
            r3.append(r1)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0bb4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0bb4 }
            r3.<init>()     // Catch:{ all -> 0x0bb4 }
            r3.append(r1)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r1 = "iaecounter"
            java.lang.Object r1 = r9.get(r1)     // Catch:{ all -> 0x0bb4 }
            r3.append(r1)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0bb4 }
            java.lang.String r1 = b.b.e0.d(r1)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r1 = b.b.e0.a(r1)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r3 = "af_v2"
            r9.put(r3, r1)     // Catch:{ all -> 0x0bb4 }
            boolean r1 = o(r28)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r2 = "ivc"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0bb4 }
            r9.put(r2, r1)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r1 = "is_stop_tracking_used"
            boolean r1 = r14.contains(r1)     // Catch:{ all -> 0x0bb4 }
            if (r1 == 0) goto L_0x0b7e
            java.lang.String r1 = "istu"
            java.lang.String r2 = "is_stop_tracking_used"
            r3 = 0
            boolean r2 = r14.getBoolean(r2, r3)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0bb4 }
            r9.put(r1, r2)     // Catch:{ all -> 0x0bb4 }
        L_0x0b7e:
            b.b.j r1 = b.b.j.b()     // Catch:{ all -> 0x0bb4 }
            java.lang.String r2 = "consumeAfDeepLink"
            java.lang.Object r1 = r1.e(r2)     // Catch:{ all -> 0x0bb4 }
            if (r1 == 0) goto L_0x0bc1
            b.b.j r1 = b.b.j.b()     // Catch:{ all -> 0x0bb4 }
            java.lang.String r2 = "consumeAfDeepLink"
            r3 = 0
            boolean r1 = r1.a(r2, r3)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r2 = "is_dp_api"
            r9.put(r2, r1)     // Catch:{ all -> 0x0bb4 }
            goto L_0x0bc1
        L_0x0b9f:
            r6 = r27
            java.lang.String r1 = "AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. "
            b.b.e.c(r1)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r1 = "DEV_KEY_MISSING"
            r3 = r23
            r4 = 0
            I(r2, r3, r1, r4)     // Catch:{ all -> 0x0bb4 }
            java.lang.String r1 = "AppsFlyer will not track this event."
            b.b.e.c(r1)     // Catch:{ all -> 0x0bb4 }
            return r4
        L_0x0bb4:
            r0 = move-exception
            goto L_0x0bb9
        L_0x0bb6:
            r0 = move-exception
            r6 = r27
        L_0x0bb9:
            r1 = r0
            java.lang.String r2 = r1.getLocalizedMessage()
            b.b.e.b(r2, r1)
        L_0x0bc1:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.i.R(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, android.content.SharedPreferences, boolean, android.content.Intent, java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: package-private */
    public final void U(Context context, String str) {
        if (j.b().a("waitForCustomerId", false) && j.b().g("AppUserId") == null) {
            e.d("CustomerUserId not set, Tracking is disabled", true);
            return;
        }
        HashMap hashMap = new HashMap();
        String g2 = j.b().g("AppsFlyerKey");
        if (g2 == null) {
            e.f("[registerUninstall] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            hashMap.put("app_version_code", Integer.toString(packageInfo.versionCode));
            hashMap.put("app_version_name", packageInfo.versionName);
            hashMap.put("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            long j2 = packageInfo.firstInstallTime;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            hashMap.put("installDate", simpleDateFormat.format(new Date(j2)));
        } catch (Throwable th) {
            e.b("Exception while collecting application version info.", th);
        }
        e0(context, hashMap);
        String g3 = j.b().g("AppUserId");
        if (g3 != null) {
            hashMap.put("appUserId", g3);
        }
        try {
            hashMap.put("model", Build.MODEL);
            hashMap.put("brand", Build.BRAND);
        } catch (Throwable th2) {
            e.b("Exception while collecting device brand and model.", th2);
        }
        if (j.b().a("deviceTrackingDisabled", false)) {
            hashMap.put("deviceTrackingDisabled", "true");
        }
        a0 b2 = c0.b(context.getContentResolver());
        if (b2 != null) {
            hashMap.put("amazon_aid", b2.a());
            hashMap.put("amazon_aid_limit", String.valueOf(b2.b()));
        }
        String g4 = j.b().g("advertiserId");
        if (g4 != null) {
            hashMap.put("advertiserId", g4);
        }
        hashMap.put("devkey", g2);
        hashMap.put("uid", g0.b(new WeakReference(context)));
        hashMap.put("af_gcm_token", str);
        hashMap.put("launch_counter", Integer.toString(L(context.getApplicationContext().getSharedPreferences("appsflyer-data", 0), "appsFlyerCount", false)));
        hashMap.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        String C2 = C(new WeakReference(context));
        if (C2 != null) {
            hashMap.put("channel", C2);
        }
        try {
            d0 d0Var = new d0(context, j());
            d0Var.f1996b = hashMap;
            StringBuilder sb = new StringBuilder();
            sb.append(o.a(C));
            sb.append(packageName);
            d0Var.execute(new String[]{sb.toString()});
        } catch (Throwable th3) {
            e.b(th3.getMessage(), th3);
        }
    }

    public void a(Map<String, String> map) {
        this.f2024e = map;
    }

    public String b(ContentResolver contentResolver) {
        ContentResolver contentResolver2 = contentResolver;
        Cursor query = contentResolver2.query(Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider"), new String[]{"aid"}, (String) null, (String[]) null, (String) null);
        String str = null;
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    str = query.getString(query.getColumnIndex("aid"));
                    if (query != null) {
                        try {
                            query.close();
                        } catch (Exception e2) {
                            e.b(e2.getMessage(), e2);
                        }
                    }
                    return str;
                }
            } catch (Exception e3) {
                e.b("Could not collect cursor attribution. ", e3);
                if (query != null) {
                    query.close();
                }
            } catch (Throwable th) {
                if (query != null) {
                    try {
                        query.close();
                    } catch (Exception e4) {
                        e.b(e4.getMessage(), e4);
                    }
                }
                throw th;
            }
        }
        if (query != null) {
            try {
                query.close();
            } catch (Exception e5) {
                e.b(e5.getMessage(), e5);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void b0() {
        this.i = System.currentTimeMillis();
    }

    public String c() {
        String g2 = j.b().g("custom_host");
        return g2 != null ? g2 : "appsflyer.com";
    }

    public String d() {
        String g2 = j.b().g("custom_host_prefix");
        return g2 != null ? g2 : "";
    }

    /* access modifiers changed from: protected */
    public void f(Context context, Map<String, Object> map, Uri uri) {
        Map map2;
        String obj = uri.toString();
        boolean z2 = true;
        if (obj == null) {
            obj = null;
        } else {
            Matcher matcher = Pattern.compile("fb\\d*?://authorize.*access_token=([^&]*)").matcher(obj);
            if (matcher.find()) {
                obj = new StringBuilder(obj).replace(matcher.start(1), matcher.end(1), "").toString().replaceFirst("&access_token=", "").replaceFirst("access_token=&", "").replaceFirst("access_token=", "");
            }
        }
        if (!map.containsKey("af_deeplink")) {
            map.put("af_deeplink", obj);
        }
        if (uri.getQueryParameter("af_deeplink") != null) {
            String queryParameter = uri.getQueryParameter("media_source");
            String queryParameter2 = uri.getQueryParameter("is_retargeting");
            if (!"AppsFlyer_Test".equals(queryParameter) || !Boolean.parseBoolean(queryParameter2)) {
                z2 = false;
            }
            this.q = z2;
            map2 = D(context, uri.getQuery());
            String path = uri.getPath();
            if (path != null) {
                map2.put("path", path);
            }
            String scheme = uri.getScheme();
            if (scheme != null) {
                map2.put("scheme", scheme);
            }
            String host = uri.getHost();
            if (host != null) {
                map2.put("host", host);
            }
        } else {
            map2 = new HashMap();
            map2.put("link", uri.toString());
        }
        WeakReference weakReference = new WeakReference(context);
        i0 i0Var = new i0(uri, this);
        i0Var.a(new n.a());
        if (i0Var.g()) {
            i0Var.f(new a(this, map2, weakReference));
            b.a().c().execute(i0Var);
            return;
        }
        h hVar = F;
        if (hVar != null) {
            try {
                hVar.b(map2);
            } catch (Throwable th) {
                e.b(th.getLocalizedMessage(), th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void f0(WeakReference<Context> weakReference) {
        if (weakReference.get() != null) {
            e.c("app went to background");
            SharedPreferences sharedPreferences = weakReference.get().getApplicationContext().getSharedPreferences("appsflyer-data", 0);
            j.b().k(sharedPreferences);
            long j2 = this.j - this.i;
            HashMap hashMap = new HashMap();
            String g2 = j.b().g("AppsFlyerKey");
            if (g2 == null) {
                e.f("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
                return;
            }
            String g3 = j.b().g("KSAppsFlyerId");
            if (j.b().a("deviceTrackingDisabled", false)) {
                hashMap.put("deviceTrackingDisabled", "true");
            }
            a0 b2 = c0.b(weakReference.get().getContentResolver());
            if (b2 != null) {
                hashMap.put("amazon_aid", b2.a());
                hashMap.put("amazon_aid_limit", String.valueOf(b2.b()));
            }
            String g4 = j.b().g("advertiserId");
            if (g4 != null) {
                hashMap.put("advertiserId", g4);
            }
            hashMap.put("app_id", weakReference.get().getPackageName());
            hashMap.put("devkey", g2);
            hashMap.put("uid", g0.b(weakReference));
            hashMap.put("time_in_app", String.valueOf(j2 / 1000));
            hashMap.put("statType", "user_closed_app");
            hashMap.put("platform", "Android");
            hashMap.put("launch_counter", Integer.toString(L(sharedPreferences, "appsFlyerCount", false)));
            hashMap.put("channel", C(weakReference));
            if (g3 == null) {
                g3 = "";
            }
            hashMap.put("originalAppsflyerId", g3);
            if (this.v) {
                try {
                    d0 d0Var = new d0((Context) null, j());
                    d0Var.f1996b = hashMap;
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        e.a("Main thread detected. Running callStats task in a new thread.");
                        d0Var.execute(new String[]{o.a("https://%sstats.%s/stats")});
                        return;
                    }
                    StringBuilder sb = new StringBuilder("Running callStats task (on current thread: ");
                    sb.append(Thread.currentThread().toString());
                    sb.append(" )");
                    e.a(sb.toString());
                    d0Var.onPreExecute();
                    d0Var.onPostExecute(d0Var.doInBackground(o.a("https://%sstats.%s/stats")));
                } catch (Throwable th) {
                    e.b("Could not send callStats request", th);
                }
            } else {
                e.a("Stats call is disabled, ignore ...");
            }
        }
    }

    public i g(String str, h hVar) {
        h0 m2 = h0.m();
        String[] strArr = new String[2];
        strArr[0] = str;
        strArr[1] = hVar == null ? "null" : "conversionDataListener";
        m2.e("init", strArr);
        e.k(String.format("Initializing AppsFlyer SDK: (v%s.%s)", new Object[]{"4.9.0", "184"}));
        this.t = true;
        j.b().n("AppsFlyerKey", str);
        x.a.d(str);
        F = hVar;
        return this;
    }

    public i h(String str, h hVar, Context context) {
        if (context == null) {
            e.f("init :: context is null, Google Install Referrer will be not initialized!");
        } else if (K(context)) {
            if (this.f2023d == null) {
                u uVar = new u();
                this.f2023d = uVar;
                uVar.c(context, this);
            } else {
                e.f("AFInstallReferrer instance already created");
            }
        }
        g(str, hVar);
        return this;
    }

    public boolean i(Context context) {
        try {
            if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e2) {
            e.b("Could not check if app is pre installed", e2);
        }
    }

    public boolean j() {
        return this.w;
    }

    public void k(Application application) {
        if (!this.t) {
            e.f("ERROR: AppsFlyer SDK is not initialized! The API call 'startTracking(Application)' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
        } else {
            l(application, (String) null);
        }
    }

    public void l(Application application, String str) {
        m(application, str, (k) null);
    }

    public void m(Application application, String str, k kVar) {
        h0.m().e("startTracking", str);
        e.c(String.format("Starting AppsFlyer Tracking: (v%s.%s)", new Object[]{"4.9.0", "184"}));
        e.c("Build Number: 184");
        j.b().j(application.getApplicationContext());
        if (!TextUtils.isEmpty(str)) {
            j.b().n("AppsFlyerKey", str);
            x.a.d(str);
        } else if (TextUtils.isEmpty(j.b().g("AppsFlyerKey"))) {
            e.f("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the startTracking API method (should be called on Activity's onCreate).");
            return;
        }
        if (kVar != null) {
            G = kVar;
        }
        G(application);
    }

    /* access modifiers changed from: package-private */
    public final void m0() {
        this.j = System.currentTimeMillis();
    }

    public void n(Context context, String str, Map<String, Object> map) {
        h0.m().e("trackEvent", str, new JSONObject(map == null ? new HashMap<>() : map).toString());
        x(context, str, map);
    }

    /* access modifiers changed from: package-private */
    public final void x(Context context, String str, Map<String, Object> map) {
        String str2;
        Intent intent;
        String str3;
        Uri uri = null;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            Intent intent2 = activity.getIntent();
            a.b().f1968a = System.identityHashCode(activity);
            try {
                uri = androidx.core.app.a.n(activity);
            } catch (Throwable th) {
                e.b(th.getLocalizedMessage(), th);
            }
            if (uri != null) {
                str2 = uri.toString();
            } else {
                str2 = "";
            }
            intent = intent2;
        } else {
            str2 = "";
            intent = null;
        }
        if (j.b().g("AppsFlyerKey") == null) {
            e.f("[TrackEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        JSONObject jSONObject = new JSONObject(map);
        String f2 = j.b().f(context);
        String jSONObject2 = jSONObject.toString();
        if (f2 == null) {
            str3 = "";
        } else {
            str3 = f2;
        }
        d0(context, (String) null, str, jSONObject2, str3, intent, str2);
    }
}
