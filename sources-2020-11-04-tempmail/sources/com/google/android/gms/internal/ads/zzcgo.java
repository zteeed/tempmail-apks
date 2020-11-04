package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcgo implements zzahc<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final zzaez f7208a;

    /* renamed from: b  reason: collision with root package name */
    private final zzcgr f7209b;

    /* renamed from: c  reason: collision with root package name */
    private final zzeku<zzcgl> f7210c;

    public zzcgo(zzccv zzccv, zzcck zzcck, zzcgr zzcgr, zzeku<zzcgl> zzeku) {
        this.f7208a = zzccv.i(zzcck.e());
        this.f7209b = zzcgr;
        this.f7210c = zzeku;
    }

    public final void a(Object obj, Map<String, String> map) {
        String str = map.get("asset");
        try {
            this.f7208a.b0(this.f7210c.get(), str);
        } catch (RemoteException e2) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            zzbba.d(sb.toString(), e2);
        }
    }

    public final void b() {
        if (this.f7208a != null) {
            this.f7209b.d("/nativeAdCustomClick", this);
        }
    }
}
