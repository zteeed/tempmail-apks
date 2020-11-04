package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzag;
import com.google.android.gms.measurement.internal.zzia;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.4.3 */
final class b implements zzia {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzag f11008a;

    b(zzag zzag) {
        this.f11008a = zzag;
    }

    public final void B(Bundle bundle) {
        this.f11008a.k(bundle);
    }

    public final void G(String str) {
        this.f11008a.H(str);
    }

    public final void N(String str, String str2, Bundle bundle) {
        this.f11008a.r(str, str2, bundle);
    }

    public final String a() {
        return this.f11008a.Q();
    }

    public final String b() {
        return this.f11008a.S();
    }

    public final String c() {
        return this.f11008a.L();
    }

    public final String d() {
        return this.f11008a.G();
    }

    public final long e() {
        return this.f11008a.N();
    }

    public final Map<String, Object> f(String str, String str2, boolean z) {
        return this.f11008a.h(str, str2, z);
    }

    public final void g(String str) {
        this.f11008a.B(str);
    }

    public final int h(String str) {
        return this.f11008a.K(str);
    }

    public final List<Bundle> i(String str, String str2) {
        return this.f11008a.z(str, str2);
    }

    public final void j(String str, String str2, Bundle bundle) {
        this.f11008a.C(str, str2, bundle);
    }
}
