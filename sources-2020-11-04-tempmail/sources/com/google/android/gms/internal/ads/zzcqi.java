package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.internal.ads.zzty;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcqi {
    private static final SparseArray<zzty.zzo.zzc> g;

    /* renamed from: a  reason: collision with root package name */
    private final Context f7548a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbrq f7549b;

    /* renamed from: c  reason: collision with root package name */
    private final TelephonyManager f7550c;

    /* renamed from: d  reason: collision with root package name */
    private final zzcqf f7551d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final zzcpz f7552e;

    /* renamed from: f  reason: collision with root package name */
    private zzui f7553f;

    static {
        SparseArray<zzty.zzo.zzc> sparseArray = new SparseArray<>();
        g = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzty.zzo.zzc.CONNECTED);
        g.put(NetworkInfo.DetailedState.AUTHENTICATING.ordinal(), zzty.zzo.zzc.CONNECTING);
        g.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzty.zzo.zzc.CONNECTING);
        g.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzty.zzo.zzc.CONNECTING);
        g.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzty.zzo.zzc.DISCONNECTING);
        g.put(NetworkInfo.DetailedState.BLOCKED.ordinal(), zzty.zzo.zzc.DISCONNECTED);
        g.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzty.zzo.zzc.DISCONNECTED);
        g.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzty.zzo.zzc.DISCONNECTED);
        g.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzty.zzo.zzc.DISCONNECTED);
        g.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzty.zzo.zzc.DISCONNECTED);
        g.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzty.zzo.zzc.SUSPENDED);
        if (Build.VERSION.SDK_INT >= 17) {
            g.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzty.zzo.zzc.CONNECTING);
        }
        g.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzty.zzo.zzc.CONNECTING);
    }

    zzcqi(Context context, zzbrq zzbrq, zzcqf zzcqf, zzcpz zzcpz) {
        this.f7548a = context;
        this.f7549b = zzbrq;
        this.f7551d = zzcqf;
        this.f7552e = zzcpz;
        this.f7550c = (TelephonyManager) context.getSystemService("phone");
    }

    /* access modifiers changed from: private */
    public final byte[] d(boolean z, ArrayList<zzty.zzc.zza> arrayList, zzty.zzm zzm, zzty.zzo.zzc zzc) {
        zzty.zzo.zza.C0088zza k0 = zzty.zzo.zza.k0();
        k0.F(arrayList);
        boolean z2 = true;
        k0.I(f(zzq.zzky().k(this.f7548a.getContentResolver()) != 0));
        k0.L(zzq.zzky().g(this.f7548a, this.f7550c));
        k0.C(this.f7551d.b());
        k0.D(this.f7551d.d());
        k0.y(this.f7551d.a());
        k0.x(zzc);
        k0.w(zzm);
        k0.M(this.f7553f);
        k0.E(f(z));
        k0.z(zzq.zzld().a());
        if (zzq.zzky().c(this.f7548a.getContentResolver()) == 0) {
            z2 = false;
        }
        k0.H(f(z2));
        return ((zzty.zzo.zza) ((zzegb) k0.O())).g();
    }

    private static zzui f(boolean z) {
        return z ? zzui.ENUM_TRUE : zzui.ENUM_FALSE;
    }

    /* access modifiers changed from: private */
    public final zzty.zzm i(Bundle bundle) {
        zzty.zzm.zza zza;
        zzty.zzm.zzb M = zzty.zzm.M();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        if (i == -1) {
            this.f7553f = zzui.ENUM_TRUE;
        } else {
            this.f7553f = zzui.ENUM_FALSE;
            if (i == 0) {
                M.x(zzty.zzm.zzc.CELL);
            } else if (i != 1) {
                M.x(zzty.zzm.zzc.NETWORKTYPE_UNSPECIFIED);
            } else {
                M.x(zzty.zzm.zzc.WIFI);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zza = zzty.zzm.zza.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zza = zzty.zzm.zza.THREE_G;
                    break;
                case 13:
                    zza = zzty.zzm.zza.LTE;
                    break;
                default:
                    zza = zzty.zzm.zza.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            M.w(zza);
        }
        return (zzty.zzm) ((zzegb) M.O());
    }

    /* access modifiers changed from: private */
    public static zzty.zzo.zzc j(Bundle bundle) {
        return g.get(zzdlf.a(zzdlf.a(bundle, "device"), "network").getInt("active_network_state", -1), zzty.zzo.zzc.UNSPECIFIED);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<com.google.android.gms.internal.ads.zzty.zzc.zza> k(android.os.Bundle r7) {
        /*
            java.lang.String r0 = "ad_types"
            java.lang.Object r7 = r7.get(r0)
            boolean r0 = r7 instanceof java.util.List
            if (r0 == 0) goto L_0x000d
            java.util.List r7 = (java.util.List) r7
            goto L_0x0017
        L_0x000d:
            boolean r0 = r7 instanceof java.lang.String[]
            if (r0 == 0) goto L_0x003d
            java.lang.String[] r7 = (java.lang.String[]) r7
            java.util.List r7 = java.util.Arrays.asList(r7)
        L_0x0017:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.size()
            r0.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L_0x0024:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0038
            java.lang.Object r1 = r7.next()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x0024
            java.lang.String r1 = (java.lang.String) r1
            r0.add(r1)
            goto L_0x0024
        L_0x0038:
            java.util.List r7 = java.util.Collections.unmodifiableList(r0)
            goto L_0x0041
        L_0x003d:
            java.util.List r7 = java.util.Collections.emptyList()
        L_0x0041:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x004a:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x00a3
            java.lang.Object r1 = r7.next()
            java.lang.String r1 = (java.lang.String) r1
            r2 = -1
            int r3 = r1.hashCode()
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r3) {
                case -1396342996: goto L_0x0080;
                case -1052618729: goto L_0x0076;
                case -239580146: goto L_0x006c;
                case 604727084: goto L_0x0062;
                default: goto L_0x0061;
            }
        L_0x0061:
            goto L_0x0089
        L_0x0062:
            java.lang.String r3 = "interstitial"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
            r2 = 1
            goto L_0x0089
        L_0x006c:
            java.lang.String r3 = "rewarded"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
            r2 = 3
            goto L_0x0089
        L_0x0076:
            java.lang.String r3 = "native"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
            r2 = 2
            goto L_0x0089
        L_0x0080:
            java.lang.String r3 = "banner"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
            r2 = 0
        L_0x0089:
            if (r2 == 0) goto L_0x009d
            if (r2 == r6) goto L_0x009a
            if (r2 == r5) goto L_0x0097
            if (r2 == r4) goto L_0x0094
            com.google.android.gms.internal.ads.zzty$zzc$zza r1 = com.google.android.gms.internal.ads.zzty.zzc.zza.AD_FORMAT_TYPE_UNSPECIFIED
            goto L_0x009f
        L_0x0094:
            com.google.android.gms.internal.ads.zzty$zzc$zza r1 = com.google.android.gms.internal.ads.zzty.zzc.zza.REWARD_BASED_VIDEO_AD
            goto L_0x009f
        L_0x0097:
            com.google.android.gms.internal.ads.zzty$zzc$zza r1 = com.google.android.gms.internal.ads.zzty.zzc.zza.NATIVE_APP_INSTALL
            goto L_0x009f
        L_0x009a:
            com.google.android.gms.internal.ads.zzty$zzc$zza r1 = com.google.android.gms.internal.ads.zzty.zzc.zza.INTERSTITIAL
            goto L_0x009f
        L_0x009d:
            com.google.android.gms.internal.ads.zzty$zzc$zza r1 = com.google.android.gms.internal.ads.zzty.zzc.zza.BANNER
        L_0x009f:
            r0.add(r1)
            goto L_0x004a
        L_0x00a3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcqi.k(android.os.Bundle):java.util.ArrayList");
    }

    public final void g(boolean z) {
        zzdux.f(this.f7549b.a(), new en(this, z), zzbbf.f6325f);
    }
}
