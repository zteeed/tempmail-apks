package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcxa implements AppEventListener {
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private zzxe f7668b;

    public final synchronized zzxe a() {
        return this.f7668b;
    }

    public final synchronized void b(zzxe zzxe) {
        this.f7668b = zzxe;
    }

    public final synchronized void onAppEvent(String str, String str2) {
        if (this.f7668b != null) {
            try {
                this.f7668b.onAppEvent(str, str2);
            } catch (RemoteException e2) {
                zzbba.d("Remote Exception at onAppEvent.", e2);
            }
        }
    }
}
