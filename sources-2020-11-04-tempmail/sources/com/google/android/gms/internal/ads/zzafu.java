package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzafu extends UnifiedNativeAd {

    /* renamed from: a  reason: collision with root package name */
    private final zzaft f5857a;

    /* renamed from: b  reason: collision with root package name */
    private final List<NativeAd.Image> f5858b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final zzadu f5859c;

    /* renamed from: d  reason: collision with root package name */
    private final VideoController f5860d = new VideoController();

    /* renamed from: e  reason: collision with root package name */
    private final NativeAd.AdChoicesInfo f5861e;

    /* renamed from: f  reason: collision with root package name */
    private final List<MuteThisAdReason> f5862f = new ArrayList();

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ae A[Catch:{ RemoteException -> 0x00bb }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzafu(com.google.android.gms.internal.ads.zzaft r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f5858b = r1
            com.google.android.gms.ads.VideoController r1 = new com.google.android.gms.ads.VideoController
            r1.<init>()
            r5.f5860d = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f5862f = r1
            r5.f5857a = r6
            r1 = 0
            java.util.List r6 = r6.k()     // Catch:{ RemoteException -> 0x005a }
            if (r6 == 0) goto L_0x005e
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RemoteException -> 0x005a }
        L_0x0027:
            boolean r2 = r6.hasNext()     // Catch:{ RemoteException -> 0x005a }
            if (r2 == 0) goto L_0x005e
            java.lang.Object r2 = r6.next()     // Catch:{ RemoteException -> 0x005a }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x005a }
            if (r3 == 0) goto L_0x004c
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x005a }
            if (r2 == 0) goto L_0x004c
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch:{ RemoteException -> 0x005a }
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.zzadt     // Catch:{ RemoteException -> 0x005a }
            if (r4 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.zzadt r3 = (com.google.android.gms.internal.ads.zzadt) r3     // Catch:{ RemoteException -> 0x005a }
            goto L_0x004d
        L_0x0046:
            com.google.android.gms.internal.ads.zzadv r3 = new com.google.android.gms.internal.ads.zzadv     // Catch:{ RemoteException -> 0x005a }
            r3.<init>(r2)     // Catch:{ RemoteException -> 0x005a }
            goto L_0x004d
        L_0x004c:
            r3 = r1
        L_0x004d:
            if (r3 == 0) goto L_0x0027
            java.util.List<com.google.android.gms.ads.formats.NativeAd$Image> r2 = r5.f5858b     // Catch:{ RemoteException -> 0x005a }
            com.google.android.gms.internal.ads.zzadu r4 = new com.google.android.gms.internal.ads.zzadu     // Catch:{ RemoteException -> 0x005a }
            r4.<init>(r3)     // Catch:{ RemoteException -> 0x005a }
            r2.add(r4)     // Catch:{ RemoteException -> 0x005a }
            goto L_0x0027
        L_0x005a:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbba.c(r0, r6)
        L_0x005e:
            com.google.android.gms.internal.ads.zzaft r6 = r5.f5857a     // Catch:{ RemoteException -> 0x008d }
            java.util.List r6 = r6.D4()     // Catch:{ RemoteException -> 0x008d }
            if (r6 == 0) goto L_0x0091
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RemoteException -> 0x008d }
        L_0x006a:
            boolean r2 = r6.hasNext()     // Catch:{ RemoteException -> 0x008d }
            if (r2 == 0) goto L_0x0091
            java.lang.Object r2 = r6.next()     // Catch:{ RemoteException -> 0x008d }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x008d }
            if (r3 == 0) goto L_0x007f
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x008d }
            com.google.android.gms.internal.ads.zzxt r2 = com.google.android.gms.internal.ads.zzxw.e7(r2)     // Catch:{ RemoteException -> 0x008d }
            goto L_0x0080
        L_0x007f:
            r2 = r1
        L_0x0080:
            if (r2 == 0) goto L_0x006a
            java.util.List<com.google.android.gms.ads.MuteThisAdReason> r3 = r5.f5862f     // Catch:{ RemoteException -> 0x008d }
            com.google.android.gms.internal.ads.zzxy r4 = new com.google.android.gms.internal.ads.zzxy     // Catch:{ RemoteException -> 0x008d }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x008d }
            r3.add(r4)     // Catch:{ RemoteException -> 0x008d }
            goto L_0x006a
        L_0x008d:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbba.c(r0, r6)
        L_0x0091:
            com.google.android.gms.internal.ads.zzaft r6 = r5.f5857a     // Catch:{ RemoteException -> 0x009f }
            com.google.android.gms.internal.ads.zzadt r6 = r6.m()     // Catch:{ RemoteException -> 0x009f }
            if (r6 == 0) goto L_0x00a3
            com.google.android.gms.internal.ads.zzadu r2 = new com.google.android.gms.internal.ads.zzadu     // Catch:{ RemoteException -> 0x009f }
            r2.<init>(r6)     // Catch:{ RemoteException -> 0x009f }
            goto L_0x00a4
        L_0x009f:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbba.c(r0, r6)
        L_0x00a3:
            r2 = r1
        L_0x00a4:
            r5.f5859c = r2
            com.google.android.gms.internal.ads.zzaft r6 = r5.f5857a     // Catch:{ RemoteException -> 0x00bb }
            com.google.android.gms.internal.ads.zzadl r6 = r6.g()     // Catch:{ RemoteException -> 0x00bb }
            if (r6 == 0) goto L_0x00bf
            com.google.android.gms.internal.ads.zzadm r6 = new com.google.android.gms.internal.ads.zzadm     // Catch:{ RemoteException -> 0x00bb }
            com.google.android.gms.internal.ads.zzaft r2 = r5.f5857a     // Catch:{ RemoteException -> 0x00bb }
            com.google.android.gms.internal.ads.zzadl r2 = r2.g()     // Catch:{ RemoteException -> 0x00bb }
            r6.<init>(r2)     // Catch:{ RemoteException -> 0x00bb }
            r1 = r6
            goto L_0x00bf
        L_0x00bb:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbba.c(r0, r6)
        L_0x00bf:
            r5.f5861e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafu.<init>(com.google.android.gms.internal.ads.zzaft):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final IObjectWrapper zzjr() {
        try {
            return this.f5857a.o();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return null;
        }
    }

    public final void cancelUnconfirmedClick() {
        try {
            this.f5857a.N();
        } catch (RemoteException e2) {
            zzbba.c("Failed to cancelUnconfirmedClick", e2);
        }
    }

    public final void destroy() {
        try {
            this.f5857a.destroy();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }

    public final void enableCustomClickGesture() {
        try {
            this.f5857a.J();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }

    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.f5861e;
    }

    public final String getAdvertiser() {
        try {
            return this.f5857a.q();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return null;
        }
    }

    public final String getBody() {
        try {
            return this.f5857a.j();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return null;
        }
    }

    public final String getCallToAction() {
        try {
            return this.f5857a.i();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return null;
        }
    }

    public final Bundle getExtras() {
        try {
            Bundle extras = this.f5857a.getExtras();
            if (extras != null) {
                return extras;
            }
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
        return new Bundle();
    }

    public final String getHeadline() {
        try {
            return this.f5857a.e();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return null;
        }
    }

    public final NativeAd.Image getIcon() {
        return this.f5859c;
    }

    public final List<NativeAd.Image> getImages() {
        return this.f5858b;
    }

    public final MediaContent getMediaContent() {
        try {
            if (this.f5857a.l0() != null) {
                return new zzzc(this.f5857a.l0());
            }
            return null;
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return null;
        }
    }

    public final String getMediationAdapterClassName() {
        try {
            return this.f5857a.getMediationAdapterClassName();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return null;
        }
    }

    public final List<MuteThisAdReason> getMuteThisAdReasons() {
        return this.f5862f;
    }

    public final String getPrice() {
        try {
            return this.f5857a.n();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return null;
        }
    }

    public final ResponseInfo getResponseInfo() {
        zzyd zzyd;
        try {
            zzyd = this.f5857a.zzkj();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            zzyd = null;
        }
        return ResponseInfo.zza(zzyd);
    }

    public final Double getStarRating() {
        try {
            double p = this.f5857a.p();
            if (p == -1.0d) {
                return null;
            }
            return Double.valueOf(p);
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return null;
        }
    }

    public final String getStore() {
        try {
            return this.f5857a.r();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            if (this.f5857a.getVideoController() != null) {
                this.f5860d.zza(this.f5857a.getVideoController());
            }
        } catch (RemoteException e2) {
            zzbba.c("Exception occurred while getting video controller", e2);
        }
        return this.f5860d;
    }

    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.f5857a.m0();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return false;
        }
    }

    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.f5857a.p2();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return false;
        }
    }

    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        try {
            if (!isCustomMuteThisAdEnabled()) {
                zzbba.g("Ad is not custom mute enabled");
            } else if (muteThisAdReason == null) {
                this.f5857a.c0((zzxt) null);
            } else if (muteThisAdReason instanceof zzxy) {
                this.f5857a.c0(((zzxy) muteThisAdReason).a());
            } else {
                zzbba.g("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
            }
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }

    public final void performClick(Bundle bundle) {
        try {
            this.f5857a.u(bundle);
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }

    public final void recordCustomClickGesture() {
        try {
            this.f5857a.J6();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.f5857a.A(bundle);
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return false;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.f5857a.F(bundle);
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }

    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.f5857a.R(new zzxu(muteThisAdListener));
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.f5857a.zza(new zzzv(onPaidEventListener));
        } catch (RemoteException e2) {
            zzbba.c("Failed to setOnPaidEventListener", e2);
        }
    }

    public final void setUnconfirmedClickListener(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.f5857a.f0(new zzagg(unconfirmedClickListener));
        } catch (RemoteException e2) {
            zzbba.c("Failed to setUnconfirmedClickListener", e2);
        }
    }

    public final Object zzjw() {
        try {
            IObjectWrapper f2 = this.f5857a.f();
            if (f2 != null) {
                return ObjectWrapper.V(f2);
            }
            return null;
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return null;
        }
    }
}
