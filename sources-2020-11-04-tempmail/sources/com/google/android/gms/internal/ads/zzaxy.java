package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzaxy extends zzdrr {
    public zzaxy(Looper looper) {
        super(looper);
    }

    /* access modifiers changed from: protected */
    public final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            zzq.zzkw();
            zzaye.n(zzq.zzla().a(), th);
            throw th;
        }
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e2) {
            zzq.zzla().e(e2, "AdMobHandler.handleMessage");
        }
    }
}
