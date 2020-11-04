package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzadm extends NativeAd.AdChoicesInfo {

    /* renamed from: a  reason: collision with root package name */
    private final zzadl f5639a;

    /* renamed from: b  reason: collision with root package name */
    private final List<NativeAd.Image> f5640b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private String f5641c;

    public zzadm(zzadl zzadl) {
        zzadt zzadt;
        IBinder iBinder;
        this.f5639a = zzadl;
        try {
            this.f5641c = zzadl.H0();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            this.f5641c = "";
        }
        try {
            for (zzadt next : zzadl.v6()) {
                if (!(next instanceof IBinder) || (iBinder = (IBinder) next) == null) {
                    zzadt = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzadt = queryLocalInterface instanceof zzadt ? (zzadt) queryLocalInterface : new zzadv(iBinder);
                }
                if (zzadt != null) {
                    this.f5640b.add(new zzadu(zzadt));
                }
            }
        } catch (RemoteException e3) {
            zzbba.c("", e3);
        }
    }

    public final List<NativeAd.Image> getImages() {
        return this.f5640b;
    }

    public final CharSequence getText() {
        return this.f5641c;
    }
}
