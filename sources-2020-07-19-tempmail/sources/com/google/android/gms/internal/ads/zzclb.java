package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzclb implements zzdpa {

    /* renamed from: b  reason: collision with root package name */
    private final Map<zzdor, Long> f7179b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final zzckv f7180c;

    /* renamed from: d  reason: collision with root package name */
    private final Clock f7181d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<zzdor, ok> f7182e = new HashMap();

    public zzclb(zzckv zzckv, Set<ok> set, Clock clock) {
        this.f7180c = zzckv;
        for (ok next : set) {
            this.f7182e.put(next.f4567c, next);
        }
        this.f7181d = clock;
    }

    private final void d(zzdor zzdor, boolean z) {
        zzdor b2 = this.f7182e.get(zzdor).f4566b;
        String str = z ? "s." : "f.";
        if (this.f7179b.containsKey(b2)) {
            long b3 = this.f7181d.b() - this.f7179b.get(b2).longValue();
            Map<String, String> c2 = this.f7180c.c();
            String valueOf = String.valueOf(this.f7182e.get(zzdor).f4565a);
            String concat = valueOf.length() != 0 ? "label.".concat(valueOf) : new String("label.");
            String valueOf2 = String.valueOf(Long.toString(b3));
            c2.put(concat, valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str));
        }
    }

    public final void a(zzdor zzdor, String str) {
    }

    public final void b(zzdor zzdor, String str) {
        this.f7179b.put(zzdor, Long.valueOf(this.f7181d.b()));
    }

    public final void c(zzdor zzdor, String str) {
        if (this.f7179b.containsKey(zzdor)) {
            long b2 = this.f7181d.b() - this.f7179b.get(zzdor).longValue();
            Map<String, String> c2 = this.f7180c.c();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(b2));
            c2.put(concat, valueOf2.length() != 0 ? "s.".concat(valueOf2) : new String("s."));
        }
        if (this.f7182e.containsKey(zzdor)) {
            d(zzdor, true);
        }
    }

    public final void e(zzdor zzdor, String str, Throwable th) {
        if (this.f7179b.containsKey(zzdor)) {
            long b2 = this.f7181d.b() - this.f7179b.get(zzdor).longValue();
            Map<String, String> c2 = this.f7180c.c();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(b2));
            c2.put(concat, valueOf2.length() != 0 ? "f.".concat(valueOf2) : new String("f."));
        }
        if (this.f7182e.containsKey(zzdor)) {
            d(zzdor, false);
        }
    }
}
