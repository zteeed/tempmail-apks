package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzp {

    /* renamed from: a  reason: collision with root package name */
    private final zzfy f10528a;

    public zzp(zzfy zzfy) {
        this.f10528a = zzfy;
    }

    private final boolean d() {
        if (e() && this.f10528a.n().a() - this.f10528a.A().B.a() > this.f10528a.x().q((String) null, zzaq.S0)) {
            return true;
        }
        return false;
    }

    private final boolean e() {
        return this.f10528a.A().B.a() > 0;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f10528a.g().c();
        if (e()) {
            if (d()) {
                this.f10528a.A().A.b((String) null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1);
                this.f10528a.F().R("auto", "_cmpx", bundle);
            } else {
                String a2 = this.f10528a.A().A.a();
                if (TextUtils.isEmpty(a2)) {
                    this.f10528a.h().H().a("Cache still valid but referrer not found");
                } else {
                    long a3 = ((this.f10528a.A().B.a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a2);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String next : parse.getQueryParameterNames()) {
                        bundle2.putString(next, parse.getQueryParameter(next));
                    }
                    ((Bundle) pair.second).putLong("_cc", a3);
                    this.f10528a.F().R((String) pair.first, "_cmp", (Bundle) pair.second);
                }
                this.f10528a.A().A.b((String) null);
            }
            this.f10528a.A().B.b(0);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(String str, Bundle bundle) {
        String str2;
        this.f10528a.g().c();
        if (!this.f10528a.p()) {
            if (bundle == null || bundle.isEmpty()) {
                str2 = null;
            } else {
                if (str == null || str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str3 : bundle.keySet()) {
                    builder.appendQueryParameter(str3, bundle.getString(str3));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f10528a.A().A.b(str2);
                this.f10528a.A().B.b(this.f10528a.n().a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (e() && d()) {
            this.f10528a.A().A.b((String) null);
        }
    }
}
