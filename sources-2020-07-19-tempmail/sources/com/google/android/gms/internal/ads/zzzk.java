package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzzk extends zzxl {

    /* renamed from: b  reason: collision with root package name */
    private zzaij f9270b;

    public final List<zzaic> B2() throws RemoteException {
        return Collections.emptyList();
    }

    public final void C1() {
    }

    public final void F() throws RemoteException {
        zzbba.g("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        zzbaq.f6115b.post(new yg0(this));
    }

    public final void J1(boolean z) throws RemoteException {
    }

    public final void V1(zzaij zzaij) throws RemoteException {
        this.f9270b = zzaij;
    }

    public final void Y4(String str) throws RemoteException {
    }

    public final float k4() throws RemoteException {
        return 1.0f;
    }

    public final void m0(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
    }

    public final void n5(float f2) throws RemoteException {
    }

    public final boolean q3() throws RemoteException {
        return false;
    }

    public final String t3() {
        return "";
    }

    public final void u5(zzamr zzamr) throws RemoteException {
    }

    public final void y1(zzzu zzzu) throws RemoteException {
    }

    public final void y3(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final void z2(String str) throws RemoteException {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void z6() {
        zzaij zzaij = this.f9270b;
        if (zzaij != null) {
            try {
                zzaij.c0(Collections.emptyList());
            } catch (RemoteException e2) {
                zzbba.d("Could not notify onComplete event.", e2);
            }
        }
    }
}
