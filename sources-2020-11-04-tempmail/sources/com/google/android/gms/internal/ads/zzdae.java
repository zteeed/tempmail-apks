package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdae implements zzdec<Object> {

    /* renamed from: f  reason: collision with root package name */
    private static final Object f7951f = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final String f7952a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7953b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbqk f7954c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdlv f7955d;

    /* renamed from: e  reason: collision with root package name */
    private final zzdla f7956e;

    public zzdae(String str, String str2, zzbqk zzbqk, zzdlv zzdlv, zzdla zzdla) {
        this.f7952a = str;
        this.f7953b = str2;
        this.f7954c = zzbqk;
        this.f7955d = zzdlv;
        this.f7956e = zzdla;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Bundle bundle, Bundle bundle2) {
        if (((Boolean) zzwg.e().c(zzaav.B2)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) zzwg.e().c(zzaav.A2)).booleanValue()) {
                synchronized (f7951f) {
                    this.f7954c.a(this.f7956e.f8349d);
                    bundle2.putBundle("quality_signals", this.f7955d.b());
                }
            } else {
                this.f7954c.a(this.f7956e.f8349d);
                bundle2.putBundle("quality_signals", this.f7955d.b());
            }
        }
        bundle2.putString("seq_num", this.f7952a);
        bundle2.putString("session_id", this.f7953b);
    }

    public final zzdvf<Object> b() {
        Bundle bundle = new Bundle();
        if (((Boolean) zzwg.e().c(zzaav.B2)).booleanValue()) {
            this.f7954c.a(this.f7956e.f8349d);
            bundle.putAll(this.f7955d.b());
        }
        return zzdux.g(new sr(this, bundle));
    }
}
