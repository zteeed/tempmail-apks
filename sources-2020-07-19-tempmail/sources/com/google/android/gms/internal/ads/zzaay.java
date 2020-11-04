package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzaay {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    private BlockingQueue<zzabi> f5536a = new ArrayBlockingQueue(100);
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    private LinkedHashMap<String, String> f5537b = new LinkedHashMap<>();
    @VisibleForTesting

    /* renamed from: c  reason: collision with root package name */
    private Map<String, zzabc> f5538c = new HashMap();
    @VisibleForTesting

    /* renamed from: d  reason: collision with root package name */
    private String f5539d;
    @VisibleForTesting

    /* renamed from: e  reason: collision with root package name */
    private Context f5540e;
    @VisibleForTesting

    /* renamed from: f  reason: collision with root package name */
    private String f5541f;
    private final HashSet<String> g = new HashSet<>(Arrays.asList(new String[]{"noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"}));
    private AtomicBoolean h;
    private File i;

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0087 A[SYNTHETIC, Splitter:B:32:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0092 A[SYNTHETIC, Splitter:B:37:0x0092] */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void c(java.util.Map<java.lang.String, java.lang.String> r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "CsiReporter: Cannot close file: sdk_csi_data.txt."
            java.lang.String r1 = r4.f5539d
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.net.Uri$Builder r1 = r1.buildUpon()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0014:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0030
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r1.appendQueryParameter(r3, r2)
            goto L_0x0014
        L_0x0030:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            android.net.Uri r1 = r1.build()
            java.lang.String r1 = r1.toString()
            r5.<init>(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L_0x004b
            java.lang.String r1 = "&it="
            r5.append(r1)
            r5.append(r6)
        L_0x004b:
            java.lang.String r5 = r5.toString()
            java.util.concurrent.atomic.AtomicBoolean r6 = r4.h
            boolean r6 = r6.get()
            if (r6 == 0) goto L_0x00a1
            java.io.File r6 = r4.i
            if (r6 == 0) goto L_0x009b
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x007f }
            r3 = 1
            r2.<init>(r6, r3)     // Catch:{ IOException -> 0x007f }
            byte[] r5 = r5.getBytes()     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
            r2.write(r5)     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
            r5 = 10
            r2.write(r5)     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
            r2.close()     // Catch:{ IOException -> 0x0072 }
            return
        L_0x0072:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzbba.d(r0, r5)
            return
        L_0x0077:
            r5 = move-exception
            r1 = r2
            goto L_0x0090
        L_0x007a:
            r5 = move-exception
            r1 = r2
            goto L_0x0080
        L_0x007d:
            r5 = move-exception
            goto L_0x0090
        L_0x007f:
            r5 = move-exception
        L_0x0080:
            java.lang.String r6 = "CsiReporter: Cannot write to file: sdk_csi_data.txt."
            com.google.android.gms.internal.ads.zzbba.d(r6, r5)     // Catch:{ all -> 0x007d }
            if (r1 == 0) goto L_0x008f
            r1.close()     // Catch:{ IOException -> 0x008b }
            goto L_0x008f
        L_0x008b:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzbba.d(r0, r5)
        L_0x008f:
            return
        L_0x0090:
            if (r1 == 0) goto L_0x009a
            r1.close()     // Catch:{ IOException -> 0x0096 }
            goto L_0x009a
        L_0x0096:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbba.d(r0, r6)
        L_0x009a:
            throw r5
        L_0x009b:
            java.lang.String r5 = "CsiReporter: File doesn't exists. Cannot write CSI data to file."
            com.google.android.gms.internal.ads.zzbba.i(r5)
            return
        L_0x00a1:
            com.google.android.gms.ads.internal.zzq.zzkw()
            android.content.Context r6 = r4.f5540e
            java.lang.String r0 = r4.f5541f
            com.google.android.gms.internal.ads.zzaye.G(r6, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaay.c(java.util.Map, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> a(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Map.Entry next : map2.entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, e(str).a(str2, (String) next.getValue()));
        }
        return linkedHashMap;
    }

    public final void b(Context context, String str, String str2, Map<String, String> map) {
        File externalStorageDirectory;
        this.f5540e = context;
        this.f5541f = str;
        this.f5539d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.h = atomicBoolean;
        atomicBoolean.set(zzach.f5587c.a().booleanValue());
        if (this.h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry next : map.entrySet()) {
            this.f5537b.put((String) next.getKey(), (String) next.getValue());
        }
        zzbbf.f6137a.execute(new m(this));
        this.f5538c.put("action", zzabc.f5547b);
        this.f5538c.put("ad_format", zzabc.f5547b);
        this.f5538c.put("e", zzabc.f5548c);
    }

    public final boolean d(zzabi zzabi) {
        return this.f5536a.offer(zzabi);
    }

    public final zzabc e(String str) {
        zzabc zzabc = this.f5538c.get(str);
        if (zzabc != null) {
            return zzabc;
        }
        return zzabc.f5546a;
    }

    public final void f(String str) {
        if (!this.g.contains(str)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("sdkVersion", this.f5541f);
            linkedHashMap.put("ue", str);
            c(a(this.f5537b, linkedHashMap), "");
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g() {
        while (true) {
            try {
                zzabi take = this.f5536a.take();
                String e2 = take.e();
                if (!TextUtils.isEmpty(e2)) {
                    c(a(this.f5537b, take.f()), e2);
                }
            } catch (InterruptedException e3) {
                zzbba.d("CsiReporter:reporter interrupted", e3);
                return;
            }
        }
    }
}
