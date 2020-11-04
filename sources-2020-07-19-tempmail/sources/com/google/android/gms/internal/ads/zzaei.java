package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaei extends NativeAppInstallAd {

    /* renamed from: a  reason: collision with root package name */
    private final zzaeh f5655a;

    /* renamed from: b  reason: collision with root package name */
    private final List<NativeAd.Image> f5656b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final zzadu f5657c;

    /* renamed from: d  reason: collision with root package name */
    private final VideoController f5658d = new VideoController();

    /* renamed from: e  reason: collision with root package name */
    private final NativeAd.AdChoicesInfo f5659e;

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0074 A[Catch:{ RemoteException -> 0x0081 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzaei(com.google.android.gms.internal.ads.zzaeh r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f5656b = r1
            com.google.android.gms.ads.VideoController r1 = new com.google.android.gms.ads.VideoController
            r1.<init>()
            r5.f5658d = r1
            r5.f5655a = r6
            r1 = 0
            java.util.List r6 = r6.j()     // Catch:{ RemoteException -> 0x0053 }
            if (r6 == 0) goto L_0x0057
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RemoteException -> 0x0053 }
        L_0x0020:
            boolean r2 = r6.hasNext()     // Catch:{ RemoteException -> 0x0053 }
            if (r2 == 0) goto L_0x0057
            java.lang.Object r2 = r6.next()     // Catch:{ RemoteException -> 0x0053 }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x0053 }
            if (r3 == 0) goto L_0x0045
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x0053 }
            if (r2 == 0) goto L_0x0045
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch:{ RemoteException -> 0x0053 }
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.zzadt     // Catch:{ RemoteException -> 0x0053 }
            if (r4 == 0) goto L_0x003f
            com.google.android.gms.internal.ads.zzadt r3 = (com.google.android.gms.internal.ads.zzadt) r3     // Catch:{ RemoteException -> 0x0053 }
            goto L_0x0046
        L_0x003f:
            com.google.android.gms.internal.ads.zzadv r3 = new com.google.android.gms.internal.ads.zzadv     // Catch:{ RemoteException -> 0x0053 }
            r3.<init>(r2)     // Catch:{ RemoteException -> 0x0053 }
            goto L_0x0046
        L_0x0045:
            r3 = r1
        L_0x0046:
            if (r3 == 0) goto L_0x0020
            java.util.List<com.google.android.gms.ads.formats.NativeAd$Image> r2 = r5.f5656b     // Catch:{ RemoteException -> 0x0053 }
            com.google.android.gms.internal.ads.zzadu r4 = new com.google.android.gms.internal.ads.zzadu     // Catch:{ RemoteException -> 0x0053 }
            r4.<init>(r3)     // Catch:{ RemoteException -> 0x0053 }
            r2.add(r4)     // Catch:{ RemoteException -> 0x0053 }
            goto L_0x0020
        L_0x0053:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbba.c(r0, r6)
        L_0x0057:
            com.google.android.gms.internal.ads.zzaeh r6 = r5.f5655a     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.internal.ads.zzadt r6 = r6.k()     // Catch:{ RemoteException -> 0x0065 }
            if (r6 == 0) goto L_0x0069
            com.google.android.gms.internal.ads.zzadu r2 = new com.google.android.gms.internal.ads.zzadu     // Catch:{ RemoteException -> 0x0065 }
            r2.<init>(r6)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x006a
        L_0x0065:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbba.c(r0, r6)
        L_0x0069:
            r2 = r1
        L_0x006a:
            r5.f5657c = r2
            com.google.android.gms.internal.ads.zzaeh r6 = r5.f5655a     // Catch:{ RemoteException -> 0x0081 }
            com.google.android.gms.internal.ads.zzadl r6 = r6.f()     // Catch:{ RemoteException -> 0x0081 }
            if (r6 == 0) goto L_0x0085
            com.google.android.gms.internal.ads.zzadm r6 = new com.google.android.gms.internal.ads.zzadm     // Catch:{ RemoteException -> 0x0081 }
            com.google.android.gms.internal.ads.zzaeh r2 = r5.f5655a     // Catch:{ RemoteException -> 0x0081 }
            com.google.android.gms.internal.ads.zzadl r2 = r2.f()     // Catch:{ RemoteException -> 0x0081 }
            r6.<init>(r2)     // Catch:{ RemoteException -> 0x0081 }
            r1 = r6
            goto L_0x0085
        L_0x0081:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbba.c(r0, r6)
        L_0x0085:
            r5.f5659e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaei.<init>(com.google.android.gms.internal.ads.zzaeh):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final IObjectWrapper zzjr() {
        try {
            return this.f5655a.m();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return null;
        }
    }

    public final void destroy() {
        try {
            this.f5655a.destroy();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }

    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.f5659e;
    }

    public final CharSequence getBody() {
        try {
            return this.f5655a.i();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return null;
        }
    }

    public final CharSequence getCallToAction() {
        try {
            return this.f5655a.h();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return null;
        }
    }

    public final Bundle getExtras() {
        try {
            return this.f5655a.getExtras();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return null;
        }
    }

    public final CharSequence getHeadline() {
        try {
            return this.f5655a.d();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return null;
        }
    }

    public final NativeAd.Image getIcon() {
        return this.f5657c;
    }

    public final List<NativeAd.Image> getImages() {
        return this.f5656b;
    }

    public final CharSequence getMediationAdapterClassName() {
        try {
            return this.f5655a.getMediationAdapterClassName();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return null;
        }
    }

    public final CharSequence getPrice() {
        try {
            return this.f5655a.l();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return null;
        }
    }

    public final Double getStarRating() {
        try {
            double n = this.f5655a.n();
            if (n == -1.0d) {
                return null;
            }
            return Double.valueOf(n);
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return null;
        }
    }

    public final CharSequence getStore() {
        try {
            return this.f5655a.p();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            if (this.f5655a.getVideoController() != null) {
                this.f5658d.zza(this.f5655a.getVideoController());
            }
        } catch (RemoteException e2) {
            zzbba.c("Exception occurred while getting video controller", e2);
        }
        return this.f5658d;
    }

    public final void performClick(Bundle bundle) {
        try {
            this.f5655a.s(bundle);
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.f5655a.x(bundle);
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return false;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.f5655a.C(bundle);
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }
}
