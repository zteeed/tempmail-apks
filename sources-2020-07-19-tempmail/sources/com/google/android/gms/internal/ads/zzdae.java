package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdae implements zzdec<Object> {

    /* renamed from: f  reason: collision with root package name */
    private static final Object f7768f = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final String f7769a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7770b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbqk f7771c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdlv f7772d;

    /* renamed from: e  reason: collision with root package name */
    private final zzdla f7773e;

    public zzdae(String str, String str2, zzbqk zzbqk, zzdlv zzdlv, zzdla zzdla) {
        this.f7769a = str;
        this.f7770b = str2;
        this.f7771c = zzbqk;
        this.f7772d = zzdlv;
        this.f7773e = zzdla;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Bundle bundle, Bundle bundle2) {
        if (((Boolean) zzwg.e().c(zzaav.B2)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) zzwg.e().c(zzaav.A2)).booleanValue()) {
                synchronized (f7768f) {
                    this.f7771c.a(this.f7773e.f8166d);
                    bundle2.putBundle("quality_signals", this.f7772d.b());
                }
            } else {
                this.f7771c.a(this.f7773e.f8166d);
                bundle2.putBundle("quality_signals", this.f7772d.b());
            }
        }
        bundle2.putString("seq_num", this.f7769a);
        bundle2.putString("session_id", this.f7770b);
    }

    public final zzdvf<Object> b() {
        Bundle bundle = new Bundle();
        if (((Boolean) zzwg.e().c(zzaav.B2)).booleanValue()) {
            this.f7771c.a(this.f7773e.f8166d);
            bundle.putAll(this.f7772d.b());
        }
        return zzdux.g(new sr(this, bundle));
    }
}
