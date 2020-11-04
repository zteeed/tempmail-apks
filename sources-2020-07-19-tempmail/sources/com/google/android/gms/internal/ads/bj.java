package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class bj implements zzo, zzt, zzagi, zzagk, zzuu {

    /* renamed from: b  reason: collision with root package name */
    private zzuu f3474b;

    /* renamed from: c  reason: collision with root package name */
    private zzagi f3475c;

    /* renamed from: d  reason: collision with root package name */
    private zzo f3476d;

    /* renamed from: e  reason: collision with root package name */
    private zzagk f3477e;

    /* renamed from: f  reason: collision with root package name */
    private zzt f3478f;

    private bj() {
    }

    /* access modifiers changed from: private */
    public final synchronized void b(zzuu zzuu, zzagi zzagi, zzo zzo, zzagk zzagk, zzt zzt) {
        this.f3474b = zzuu;
        this.f3475c = zzagi;
        this.f3476d = zzo;
        this.f3477e = zzagk;
        this.f3478f = zzt;
    }

    public final synchronized void onAdClicked() {
        if (this.f3474b != null) {
            this.f3474b.onAdClicked();
        }
    }

    public final synchronized void onAppEvent(String str, String str2) {
        if (this.f3477e != null) {
            this.f3477e.onAppEvent(str, str2);
        }
    }

    public final synchronized void onPause() {
        if (this.f3476d != null) {
            this.f3476d.onPause();
        }
    }

    public final synchronized void onResume() {
        if (this.f3476d != null) {
            this.f3476d.onResume();
        }
    }

    public final synchronized void s(String str, Bundle bundle) {
        if (this.f3475c != null) {
            this.f3475c.s(str, bundle);
        }
    }

    public final synchronized void zzud() {
        if (this.f3476d != null) {
            this.f3476d.zzud();
        }
    }

    public final synchronized void zzue() {
        if (this.f3476d != null) {
            this.f3476d.zzue();
        }
    }

    public final synchronized void zzuu() {
        if (this.f3478f != null) {
            this.f3478f.zzuu();
        }
    }

    /* synthetic */ bj(xi xiVar) {
        this();
    }
}
