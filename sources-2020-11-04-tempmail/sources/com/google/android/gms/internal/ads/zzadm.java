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
    private final zzadl f5822a;

    /* renamed from: b  reason: collision with root package name */
    private final List<NativeAd.Image> f5823b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private String f5824c;

    public zzadm(zzadl zzadl) {
        zzadt zzadt;
        IBinder iBinder;
        this.f5822a = zzadl;
        try {
            this.f5824c = zzadl.O0();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            this.f5824c = "";
        }
        try {
            for (zzadt next : zzadl.Z6()) {
                if (!(next instanceof IBinder) || (iBinder = (IBinder) next) == null) {
                    zzadt = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzadt = queryLocalInterface instanceof zzadt ? (zzadt) queryLocalInterface : new zzadv(iBinder);
                }
                if (zzadt != null) {
                    this.f5823b.add(new zzadu(zzadt));
                }
            }
        } catch (RemoteException e3) {
            zzbba.c("", e3);
        }
    }

    public final List<NativeAd.Image> getImages() {
        return this.f5823b;
    }

    public final CharSequence getText() {
        return this.f5824c;
    }
}
