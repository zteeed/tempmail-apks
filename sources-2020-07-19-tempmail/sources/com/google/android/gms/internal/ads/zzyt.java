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
    private final Object f9248a = new Object();
    @GuardedBy("lock")

    /* renamed from: b  reason: collision with root package name */
    private zzxm f9249b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f9250c = false;

    /* renamed from: d  reason: collision with root package name */
    private RewardedVideoAd f9251d;

    /* renamed from: e  reason: collision with root package name */
    private RequestConfiguration f9252e = new RequestConfiguration.Builder().build();

    /* renamed from: f  reason: collision with root package name */
    private InitializationStatus f9253f;

    private zzyt() {
    }

    @GuardedBy("lock")
    private final void m(RequestConfiguration requestConfiguration) {
        try {
            this.f9249b.y1(new zzzu(requestConfiguration));
        } catch (RemoteException e2) {
            zzbba.c("Unable to set request configuration parcel.", e2);
        }
    }

    /* access modifiers changed from: private */
    public static InitializationStatus o(List<zzaic> list) {
        HashMap hashMap = new HashMap();
        for (zzaic next : list) {
            hashMap.put(next.f5719b, new zzaik(next.f5720c ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, next.f5722e, next.f5721d));
        }
        return new zzain(hashMap);
    }

    @GuardedBy("lock")
    private final void p(Context context) {
        if (this.f9249b == null) {
            this.f9249b = (zzxm) new jg0(zzwg.b(), context).b(context, false);
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
        synchronized (this.f9248a) {
            p(context);
            try {
                this.f9249b.C1();
            } catch (RemoteException unused) {
                zzbba.g("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final InitializationStatus b() {
        synchronized (this.f9248a) {
            Preconditions.o(this.f9249b != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                if (this.f9253f != null) {
                    InitializationStatus initializationStatus = this.f9253f;
                    return initializationStatus;
                }
                InitializationStatus o = o(this.f9249b.B2());
                return o;
            } catch (RemoteException unused) {
                zzbba.g("Unable to get Initialization status.");
                return null;
            }
        }
    }

    public final RequestConfiguration c() {
        return this.f9252e;
    }

    public final RewardedVideoAd d(Context context) {
        synchronized (this.f9248a) {
            if (this.f9251d != null) {
                RewardedVideoAd rewardedVideoAd = this.f9251d;
                return rewardedVideoAd;
            }
            zzaty zzaty = new zzaty(context, (zzatj) new og0(zzwg.b(), context, new zzamo()).b(context, false));
            this.f9251d = zzaty;
            return zzaty;
        }
    }

    public final String e() {
        String d2;
        synchronized (this.f9248a) {
            Preconditions.o(this.f9249b != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                d2 = zzdsi.d(this.f9249b.t3());
            } catch (RemoteException e2) {
                zzbba.c("Unable to get version string.", e2);
                return "";
            }
        }
        return d2;
    }

    public final void f(Context context, String str) {
        synchronized (this.f9248a) {
            Preconditions.o(this.f9249b != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.f9249b.m0(ObjectWrapper.b0(context), str);
            } catch (RemoteException e2) {
                zzbba.c("Unable to open debug menu.", e2);
            }
        }
    }

    public final void g(Class<? extends RtbAdapter> cls) {
        synchronized (this.f9248a) {
            try {
                this.f9249b.z2(cls.getCanonicalName());
            } catch (RemoteException e2) {
                zzbba.c("Unable to register RtbAdapter", e2);
            }
        }
    }

    public final void h(boolean z) {
        synchronized (this.f9248a) {
            Preconditions.o(this.f9249b != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.f9249b.J1(z);
            } catch (RemoteException e2) {
                zzbba.c("Unable to set app mute state.", e2);
            }
        }
    }

    public final void i(float f2) {
        boolean z = true;
        Preconditions.b(0.0f <= f2 && f2 <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.f9248a) {
            if (this.f9249b == null) {
                z = false;
            }
            Preconditions.o(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.f9249b.n5(f2);
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
            java.lang.Object r0 = r4.f9248a
            monitor-enter(r0)
            com.google.android.gms.ads.RequestConfiguration r1 = r4.f9252e     // Catch:{ all -> 0x0030 }
            r4.f9252e = r5     // Catch:{ all -> 0x0030 }
            com.google.android.gms.internal.ads.zzxm r2 = r4.f9249b     // Catch:{ all -> 0x0030 }
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
        synchronized (this.f9248a) {
            if (!this.f9250c) {
                if (context != null) {
                    try {
                        zzamj.g().b(context, str);
                        p(context);
                        this.f9250c = true;
                        if (onInitializationCompleteListener != null) {
                            this.f9249b.V1(new a(this, onInitializationCompleteListener, (sg0) null));
                        }
                        this.f9249b.u5(new zzamo());
                        this.f9249b.F();
                        this.f9249b.y3(str, ObjectWrapper.b0(new rg0(this, context)));
                        if (!(this.f9252e.getTagForChildDirectedTreatment() == -1 && this.f9252e.getTagForUnderAgeOfConsent() == -1)) {
                            m(this.f9252e);
                        }
                        zzaav.a(context);
                        if (!((Boolean) zzwg.e().c(zzaav.r2)).booleanValue() && !e().endsWith("0")) {
                            zzbba.g("Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.");
                            this.f9253f = new tg0(this);
                            if (onInitializationCompleteListener != null) {
                                zzbaq.f6115b.post(new qg0(this, onInitializationCompleteListener));
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
        onInitializationCompleteListener.onInitializationComplete(this.f9253f);
    }

    public final float q() {
        float f2;
        synchronized (this.f9248a) {
            f2 = 1.0f;
            if (this.f9249b == null) {
                return 1.0f;
            }
            try {
                f2 = this.f9249b.k4();
            } catch (RemoteException e2) {
                zzbba.c("Unable to get app volume.", e2);
            }
        }
        return f2;
    }

    public final boolean r() {
        boolean z;
        synchronized (this.f9248a) {
            z = false;
            if (this.f9249b == null) {
                return false;
            }
            try {
                z = this.f9249b.q3();
            } catch (RemoteException e2) {
                zzbba.c("Unable to get app mute state.", e2);
            }
        }
        return z;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    class a extends zzaii {

        /* renamed from: b  reason: collision with root package name */
        private final OnInitializationCompleteListener f9254b;

        private a(OnInitializationCompleteListener onInitializationCompleteListener) {
            this.f9254b = onInitializationCompleteListener;
        }

        public final void c0(List<zzaic> list) throws RemoteException {
            this.f9254b.onInitializationComplete(zzyt.o(list));
        }

        /* synthetic */ a(zzyt zzyt, OnInitializationCompleteListener onInitializationCompleteListener, sg0 sg0) {
            this(onInitializationCompleteListener);
        }
    }
}
