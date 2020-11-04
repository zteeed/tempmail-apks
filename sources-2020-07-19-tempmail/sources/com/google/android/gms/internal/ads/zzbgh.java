package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbgh extends zzyh {

    /* renamed from: b  reason: collision with root package name */
    private final zzbdb f6234b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f6235c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final boolean f6236d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f6237e;
    @GuardedBy("lock")

    /* renamed from: f  reason: collision with root package name */
    private int f6238f;
    @GuardedBy("lock")
    private zzyj g;
    @GuardedBy("lock")
    private boolean h;
    @GuardedBy("lock")
    private boolean i = true;
    @GuardedBy("lock")
    private float j;
    @GuardedBy("lock")
    private float k;
    @GuardedBy("lock")
    private float l;
    @GuardedBy("lock")
    private boolean m;
    @GuardedBy("lock")
    private boolean n;
    @GuardedBy("lock")
    private zzaff o;

    public zzbgh(zzbdb zzbdb, float f2, boolean z, boolean z2) {
        this.f6234b = zzbdb;
        this.j = f2;
        this.f6236d = z;
        this.f6237e = z2;
    }

    private final void B6(int i2, int i3, boolean z, boolean z2) {
        zzbbf.f6141e.execute(new w9(this, i2, i3, z, z2));
    }

    private final void G6(String str, Map<String, String> map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        zzbbf.f6141e.execute(new x9(this, hashMap));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A6(float r4, float r5, int r6, boolean r7, float r8) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f6235c
            monitor-enter(r0)
            float r1 = r3.j     // Catch:{ all -> 0x004f }
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0012
            float r1 = r3.l     // Catch:{ all -> 0x004f }
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r1 = 0
            goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            r3.j = r5     // Catch:{ all -> 0x004f }
            r3.k = r4     // Catch:{ all -> 0x004f }
            boolean r4 = r3.i     // Catch:{ all -> 0x004f }
            r3.i = r7     // Catch:{ all -> 0x004f }
            int r5 = r3.f6238f     // Catch:{ all -> 0x004f }
            r3.f6238f = r6     // Catch:{ all -> 0x004f }
            float r2 = r3.l     // Catch:{ all -> 0x004f }
            r3.l = r8     // Catch:{ all -> 0x004f }
            float r8 = r8 - r2
            float r8 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x004f }
            r2 = 953267991(0x38d1b717, float:1.0E-4)
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 <= 0) goto L_0x0038
            com.google.android.gms.internal.ads.zzbdb r8 = r3.f6234b     // Catch:{ all -> 0x004f }
            android.view.View r8 = r8.getView()     // Catch:{ all -> 0x004f }
            r8.invalidate()     // Catch:{ all -> 0x004f }
        L_0x0038:
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            if (r1 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.zzaff r8 = r3.o     // Catch:{ RemoteException -> 0x0045 }
            if (r8 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.zzaff r8 = r3.o     // Catch:{ RemoteException -> 0x0045 }
            r8.t1()     // Catch:{ RemoteException -> 0x0045 }
            goto L_0x004b
        L_0x0045:
            r8 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.internal.ads.zzbba.e(r0, r8)
        L_0x004b:
            r3.B6(r5, r6, r4, r7)
            return
        L_0x004f:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbgh.A6(float, float, int, boolean, float):void");
    }

    public final void C6() {
        boolean z;
        int i2;
        synchronized (this.f6235c) {
            z = this.i;
            i2 = this.f6238f;
            this.f6238f = 3;
        }
        B6(i2, 3, z, z);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void D6(int i2, int i3, boolean z, boolean z2) {
        synchronized (this.f6235c) {
            boolean z3 = false;
            boolean z4 = i2 != i3;
            boolean z5 = !this.h && i3 == 1;
            boolean z6 = z4 && i3 == 1;
            boolean z7 = z4 && i3 == 2;
            boolean z8 = z4 && i3 == 3;
            boolean z9 = z != z2;
            if (this.h || z5) {
                z3 = true;
            }
            this.h = z3;
            if (z5) {
                try {
                    if (this.g != null) {
                        this.g.onVideoStart();
                    }
                } catch (RemoteException e2) {
                    zzbba.e("#007 Could not call remote method.", e2);
                }
            }
            if (z6 && this.g != null) {
                this.g.onVideoPlay();
            }
            if (z7 && this.g != null) {
                this.g.onVideoPause();
            }
            if (z8) {
                if (this.g != null) {
                    this.g.S();
                }
                this.f6234b.u();
            }
            if (z9 && this.g != null) {
                this.g.n0(z2);
            }
        }
    }

    public final zzyj E5() throws RemoteException {
        zzyj zzyj;
        synchronized (this.f6235c) {
            zzyj = this.g;
        }
        return zzyj;
    }

    public final void E6(zzaaa zzaaa) {
        boolean z = zzaaa.f5513b;
        boolean z2 = zzaaa.f5514c;
        boolean z3 = zzaaa.f5515d;
        synchronized (this.f6235c) {
            this.m = z2;
            this.n = z3;
        }
        G6("initialState", CollectionUtils.e("muteStart", z ? "1" : "0", "customControlsRequested", z2 ? "1" : "0", "clickToExpandRequested", z3 ? "1" : "0"));
    }

    public final void F6(float f2) {
        synchronized (this.f6235c) {
            this.k = f2;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void H6(Map map) {
        this.f6234b.z("pubVideoCmd", map);
    }

    public final void S0(zzyj zzyj) {
        synchronized (this.f6235c) {
            this.g = zzyj;
        }
    }

    public final void X1(boolean z) {
        G6(z ? "mute" : "unmute", (Map<String, String>) null);
    }

    public final boolean g5() {
        boolean z;
        synchronized (this.f6235c) {
            z = this.f6236d && this.m;
        }
        return z;
    }

    public final float getAspectRatio() {
        float f2;
        synchronized (this.f6235c) {
            f2 = this.l;
        }
        return f2;
    }

    public final float getCurrentTime() {
        float f2;
        synchronized (this.f6235c) {
            f2 = this.k;
        }
        return f2;
    }

    public final float getDuration() {
        float f2;
        synchronized (this.f6235c) {
            f2 = this.j;
        }
        return f2;
    }

    public final int getPlaybackState() {
        int i2;
        synchronized (this.f6235c) {
            i2 = this.f6238f;
        }
        return i2;
    }

    public final boolean l1() {
        boolean z;
        synchronized (this.f6235c) {
            z = this.i;
        }
        return z;
    }

    public final void pause() {
        G6("pause", (Map<String, String>) null);
    }

    public final void play() {
        G6("play", (Map<String, String>) null);
    }

    public final void stop() {
        G6("stop", (Map<String, String>) null);
    }

    public final void v4(zzaff zzaff) {
        synchronized (this.f6235c) {
            this.o = zzaff;
        }
    }

    public final boolean z0() {
        boolean z;
        boolean g5 = g5();
        synchronized (this.f6235c) {
            if (!g5) {
                try {
                    if (this.n && this.f6237e) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z = false;
        }
        return z;
    }
}
