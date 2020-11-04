package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class bj implements zzo, zzt, zzagi, zzagk, zzuu {

    /* renamed from: b  reason: collision with root package name */
    private zzuu f3657b;

    /* renamed from: c  reason: collision with root package name */
    private zzagi f3658c;

    /* renamed from: d  reason: collision with root package name */
    private zzo f3659d;

    /* renamed from: e  reason: collision with root package name */
    private zzagk f3660e;

    /* renamed from: f  reason: collision with root package name */
    private zzt f3661f;

    private bj() {
    }

    /* access modifiers changed from: private */
    public final synchronized void b(zzuu zzuu, zzagi zzagi, zzo zzo, zzagk zzagk, zzt zzt) {
        this.f3657b = zzuu;
        this.f3658c = zzagi;
        this.f3659d = zzo;
        this.f3660e = zzagk;
        this.f3661f = zzt;
    }

    public final synchronized void onAdClicked() {
        if (this.f3657b != null) {
            this.f3657b.onAdClicked();
        }
    }

    public final synchronized void onAppEvent(String str, String str2) {
        if (this.f3660e != null) {
            this.f3660e.onAppEvent(str, str2);
        }
    }

    public final synchronized void onPause() {
        if (this.f3659d != null) {
            this.f3659d.onPause();
        }
    }

    public final synchronized void onResume() {
        if (this.f3659d != null) {
            this.f3659d.onResume();
        }
    }

    public final synchronized void s(String str, Bundle bundle) {
        if (this.f3658c != null) {
            this.f3658c.s(str, bundle);
        }
    }

    public final synchronized void zzud() {
        if (this.f3659d != null) {
            this.f3659d.zzud();
        }
    }

    public final synchronized void zzue() {
        if (this.f3659d != null) {
            this.f3659d.zzue();
        }
    }

    public final synchronized void zzuu() {
        if (this.f3661f != null) {
            this.f3661f.zzuu();
        }
    }

    /* synthetic */ bj(xi xiVar) {
        this();
    }
}
