package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public class zzyt {
    @GuardedBy("InternalMobileAds.class")
    private static zzyt g;

    /* renamed from: a  reason: collision with root package name */
    private final Object f9431a = new Object();
    @GuardedBy("lock")

    /* renamed from: b  reason: collision with root package name */
    private zzxm f9432b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f9433c = false;

    /* renamed from: d  reason: collision with root package name */
    private RewardedVideoAd f9434d;

    /* renamed from: e  reason: collision with root package name */
    private RequestConfiguration f9435e = new RequestConfiguration.Builder().build();

    /* renamed from: f  reason: collision with root package name */
    private InitializationStatus f9436f;

    private zzyt() {
    }

    @GuardedBy("lock")
    private final void m(RequestConfiguration requestConfiguration) {
        try {
            this.f9432b.H1(new zzzu(requestConfiguration));
        } catch (RemoteException e2) {
            zzbba.c("Unable to set request configuration parcel.", e2);
        }
    }

    /* access modifiers changed from: private */
    public static InitializationStatus o(List<zzaic> list) {
        HashMap hashMap = new HashMap();
        for (zzaic next : list) {
            hashMap.put(next.f5902b, new zzaik(next.f5903c ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, next.f5905e, next.f5904d));
        }
        return new zzain(hashMap);
    }

    @GuardedBy("lock")
    private final void p(Context context) {
        if (this.f9432b == null) {
            this.f9432b = (zzxm) new jg0(zzwg.b(), context).b(context, false);
        }
    }

    public static zzyt s() {
        zzyt zzyt;
        synchronized (zzyt.class) {
            if (g == null) {
                g = new zzyt();
            }
            zzyt = g;
        }
        return zzyt;
    }

    public final void a(Context context) {
        synchronized (this.f9431a) {
            p(context);
            try {
                this.f9432b.L1();
            } catch (RemoteException unused) {
                zzbba.g("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final InitializationStatus b() {
        synchronized (this.f9431a) {
            Preconditions.o(this.f9432b != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                if (this.f9436f != null) {
                    InitializationStatus initializationStatus = this.f9436f;
                    return initializationStatus;
                }
                InitializationStatus o = o(this.f9432b.M2());
                return o;
            } catch (RemoteException unused) {
                zzbba.g("Unable to get Initialization status.");
                return null;
            }
        }
    }

    public final RequestConfiguration c() {
        return this.f9435e;
    }

    public final RewardedVideoAd d(Context context) {
        synchronized (this.f9431a) {
            if (this.f9434d != null) {
                RewardedVideoAd rewardedVideoAd = this.f9434d;
                return rewardedVideoAd;
            }
            zzaty zzaty = new zzaty(context, (zzatj) new og0(zzwg.b(), context, new zzamo()).b(context, false));
            this.f9434d = zzaty;
            return zzaty;
        }
    }

    public final String e() {
        String d2;
        synchronized (this.f9431a) {
            Preconditions.o(this.f9432b != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                d2 = zzdsi.d(this.f9432b.I3());
            } catch (RemoteException e2) {
                zzbba.c("Unable to get version string.", e2);
                return "";
            }
        }
        return d2;
    }

    public final void f(Context context, String str) {
        synchronized (this.f9431a) {
            Preconditions.o(this.f9432b != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.f9432b.s0(ObjectWrapper.h0(context), str);
            } catch (RemoteException e2) {
                zzbba.c("Unable to open debug menu.", e2);
            }
        }
    }

    public final void g(Class<? extends RtbAdapter> cls) {
        synchronized (this.f9431a) {
            try {
                this.f9432b.L2(cls.getCanonicalName());
            } catch (RemoteException e2) {
                zzbba.c("Unable to register RtbAdapter", e2);
            }
        }
    }

    public final void h(boolean z) {
        synchronized (this.f9431a) {
            Preconditions.o(this.f9432b != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.f9432b.S1(z);
            } catch (RemoteException e2) {
                zzbba.c("Unable to set app mute state.", e2);
            }
        }
    }

    public final void i(float f2) {
        boolean z = true;
        Preconditions.b(0.0f <= f2 && f2 <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.f9431a) {
            if (this.f9432b == null) {
                z = false;
            }
            Preconditions.o(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.f9432b.J5(f2);
            } catch (RemoteException e2) {
                zzbba.c("Unable to set app volume.", e2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(com.google.android.gms.ads.RequestConfiguration r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0004
            r0 = 1
            goto L_0x0005
        L_0x0004:
            r0 = 0
        L_0x0005:
            java.lang.String r1 = "Null passed to setRequestConfiguration."
            com.google.android.gms.common.internal.Preconditions.b(r0, r1)
            java.lang.Object r0 = r4.f9431a
            monitor-enter(r0)
            com.google.android.gms.ads.RequestConfiguration r1 = r4.f9435e     // Catch:{ all -> 0x0030 }
            r4.f9435e = r5     // Catch:{ all -> 0x0030 }
            com.google.android.gms.internal.ads.zzxm r2 = r4.f9432b     // Catch:{ all -> 0x0030 }
            if (r2 != 0) goto L_0x0017
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0017:
            int r2 = r1.getTagForChildDirectedTreatment()     // Catch:{ all -> 0x0030 }
            int r3 = r5.getTagForChildDirectedTreatment()     // Catch:{ all -> 0x0030 }
            if (r2 != r3) goto L_0x002b
            int r1 = r1.getTagForUnderAgeOfConsent()     // Catch:{ all -> 0x0030 }
            int r2 = r5.getTagForUnderAgeOfConsent()     // Catch:{ all -> 0x0030 }
            if (r1 == r2) goto L_0x002e
        L_0x002b:
            r4.m(r5)     // Catch:{ all -> 0x0030 }
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0030:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyt.j(com.google.android.gms.ads.RequestConfiguration):void");
    }

    public final void l(Context context, String str, OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.f9431a) {
            if (!this.f9433c) {
                if (context != null) {
                    try {
                        zzamj.g().b(context, str);
                        p(context);
                        this.f9433c = true;
                        if (onInitializationCompleteListener != null) {
                            this.f9432b.e2(new a(this, onInitializationCompleteListener, (sg0) null));
                        }
                        this.f9432b.Q5(new zzamo());
                        this.f9432b.I();
                        this.f9432b.M3(str, ObjectWrapper.h0(new rg0(this, context)));
                        if (!(this.f9435e.getTagForChildDirectedTreatment() == -1 && this.f9435e.getTagForUnderAgeOfConsent() == -1)) {
                            m(this.f9435e);
                        }
                        zzaav.a(context);
                        if (!((Boolean) zzwg.e().c(zzaav.r2)).booleanValue() && !e().endsWith("0")) {
                            zzbba.g("Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.");
                            this.f9436f = new tg0(this);
                            if (onInitializationCompleteListener != null) {
                                zzbaq.f6298b.post(new qg0(this, onInitializationCompleteListener));
                            }
                        }
                    } catch (RemoteException e2) {
                        zzbba.d("MobileAdsSettingManager initialization failed", e2);
                    }
                } else {
                    throw new IllegalArgumentException("Context cannot be null.");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void n(OnInitializationCompleteListener onInitializationCompleteListener) {
        onInitializationCompleteListener.onInitializationComplete(this.f9436f);
    }

    public final float q() {
        float f2;
        synchronized (this.f9431a) {
            f2 = 1.0f;
            if (this.f9432b == null) {
                return 1.0f;
            }
            try {
                f2 = this.f9432b.E4();
            } catch (RemoteException e2) {
                zzbba.c("Unable to get app volume.", e2);
            }
        }
        return f2;
    }

    public final boolean r() {
        boolean z;
        synchronized (this.f9431a) {
            z = false;
            if (this.f9432b == null) {
                return false;
            }
            try {
                z = this.f9432b.F3();
            } catch (RemoteException e2) {
                zzbba.c("Unable to get app mute state.", e2);
            }
        }
        return z;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    class a extends zzaii {

        /* renamed from: b  reason: collision with root package name */
        private final OnInitializationCompleteListener f9437b;

        private a(OnInitializationCompleteListener onInitializationCompleteListener) {
            this.f9437b = onInitializationCompleteListener;
        }

        public final void i0(List<zzaic> list) throws RemoteException {
            this.f9437b.onInitializationComplete(zzyt.o(list));
        }

        /* synthetic */ a(zzyt zzyt, OnInitializationCompleteListener onInitializationCompleteListener, sg0 sg0) {
            this(onInitializationCompleteListener);
        }
    }
}
