package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzzk extends zzxl {

    /* renamed from: b  reason: collision with root package name */
    private zzaij f9453b;

    public final float E4() throws RemoteException {
        return 1.0f;
    }

    public final boolean F3() throws RemoteException {
        return false;
    }

    public final void H1(zzzu zzzu) throws RemoteException {
    }

    public final void I() throws RemoteException {
        zzbba.g("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        zzbaq.f6298b.post(new yg0(this));
    }

    public final String I3() {
        return "";
    }

    public final void J5(float f2) throws RemoteException {
    }

    public final void L1() {
    }

    public final void L2(String str) throws RemoteException {
    }

    public final List<zzaic> M2() throws RemoteException {
        return Collections.emptyList();
    }

    public final void M3(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final void Q5(zzamr zzamr) throws RemoteException {
    }

    public final void S1(boolean z) throws RemoteException {
    }

    public final void e2(zzaij zzaij) throws RemoteException {
        this.f9453b = zzaij;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e7() {
        zzaij zzaij = this.f9453b;
        if (zzaij != null) {
            try {
                zzaij.i0(Collections.emptyList());
            } catch (RemoteException e2) {
                zzbba.d("Could not notify onComplete event.", e2);
            }
        }
    }

    public final void s0(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
    }

    public final void t5(String str) throws RemoteException {
    }
}
