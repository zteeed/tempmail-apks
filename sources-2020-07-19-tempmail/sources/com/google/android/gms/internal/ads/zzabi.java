package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzabi {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    boolean f5552a = true;

    /* renamed from: b  reason: collision with root package name */
    private final List<zzabg> f5553b = new LinkedList();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f5554c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Object f5555d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private zzabi f5556e;

    public zzabi(boolean z, String str, String str2) {
        this.f5554c.put("action", str);
        this.f5554c.put("ad_format", str2);
    }

    public final boolean a(zzabg zzabg, long j, String... strArr) {
        synchronized (this.f5555d) {
            for (String zzabg2 : strArr) {
                this.f5553b.add(new zzabg(j, zzabg2, zzabg));
            }
        }
        return true;
    }

    public final void b(zzabi zzabi) {
        synchronized (this.f5555d) {
            this.f5556e = zzabi;
        }
    }

    public final zzabg c(long j) {
        if (!this.f5552a) {
            return null;
        }
        return new zzabg(j, (String) null, (zzabg) null);
    }

    public final void d(String str, String str2) {
        zzaay l;
        if (this.f5552a && !TextUtils.isEmpty(str2) && (l = zzq.zzla().l()) != null) {
            synchronized (this.f5555d) {
                zzabc e2 = l.e(str);
                Map<String, String> map = this.f5554c;
                map.put(str, e2.a(map.get(str), str2));
            }
        }
    }

    public final String e() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.f5555d) {
            for (zzabg next : this.f5553b) {
                long a2 = next.a();
                String b2 = next.b();
                zzabg c2 = next.c();
                if (c2 != null && a2 > 0) {
                    sb2.append(b2);
                    sb2.append('.');
                    sb2.append(a2 - c2.a());
                    sb2.append(',');
                }
            }
            this.f5553b.clear();
            if (!TextUtils.isEmpty((CharSequence) null)) {
                sb2.append((String) null);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            sb = sb2.toString();
        }
        return sb;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final Map<String, String> f() {
        synchronized (this.f5555d) {
            zzaay l = zzq.zzla().l();
            if (l != null) {
                if (this.f5556e != null) {
                    Map<String, String> a2 = l.a(this.f5554c, this.f5556e.f());
                    return a2;
                }
            }
            Map<String, String> map = this.f5554c;
            return map;
        }
    }
}
