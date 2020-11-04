package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class ih implements zzahc {

    /* renamed from: a  reason: collision with root package name */
    private final zzcdn f4241a;

    /* renamed from: b  reason: collision with root package name */
    private final zzafo f4242b;

    ih(zzcdn zzcdn, zzafo zzafo) {
        this.f4241a = zzcdn;
        this.f4242b = zzafo;
    }

    public final void a(Object obj, Map map) {
        zzcdn zzcdn = this.f4241a;
        zzafo zzafo = this.f4242b;
        try {
            zzcdn.g = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
        } catch (NumberFormatException unused) {
            zzbba.g("Failed to call parse unconfirmedClickTimestamp.");
        }
        zzcdn.f7076f = (String) map.get("id");
        String str = (String) map.get("asset_id");
        if (zzafo == null) {
            zzbba.f("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            zzafo.onUnconfirmedClickReceived(str);
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }
}
