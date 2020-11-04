package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zze;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcwb implements zze {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    private zze f7811a;

    public final synchronized void a(zze zze) {
        this.f7811a = zze;
    }

    public final synchronized void zzh(View view) {
        if (this.f7811a != null) {
            this.f7811a.zzh(view);
        }
    }

    public final synchronized void zzjz() {
        if (this.f7811a != null) {
            this.f7811a.zzjz();
        }
    }

    public final synchronized void zzka() {
        if (this.f7811a != null) {
            this.f7811a.zzka();
        }
    }
}
