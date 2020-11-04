package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdem implements zzdec<zzdej> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdvi f7945a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f7946b;

    public zzdem(zzdvi zzdvi, Context context) {
        this.f7945a = zzdvi;
        this.f7946b = context;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdej a() throws Exception {
        int i;
        boolean z;
        int i2;
        int i3;
        TelephonyManager telephonyManager = (TelephonyManager) this.f7946b.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int networkType = telephonyManager.getNetworkType();
        int phoneType = telephonyManager.getPhoneType();
        zzq.zzkw();
        int i4 = -1;
        if (zzaye.l0(this.f7946b, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f7946b.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                i4 = activeNetworkInfo.getType();
                i3 = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                i3 = -1;
            }
            z = connectivityManager.isActiveNetworkMetered();
            i = i3;
            i2 = i4;
        } else {
            i2 = -2;
            z = false;
            i = -1;
        }
        return new zzdej(networkOperator, i2, networkType, phoneType, z, i);
    }

    public final zzdvf<zzdej> b() {
        return this.f7945a.f(new kt(this));
    }
}
