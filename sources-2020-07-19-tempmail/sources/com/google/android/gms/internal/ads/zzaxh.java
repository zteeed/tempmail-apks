package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.crashlytics.internal.proto.CodedOutputStream;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzaxh {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Object f6016a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final zzaya f6017b = new zzaya();

    /* renamed from: c  reason: collision with root package name */
    private final zzaxs f6018c = new zzaxs(zzwg.f(), this.f6017b);

    /* renamed from: d  reason: collision with root package name */
    private boolean f6019d = false;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Context f6020e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public zzbbd f6021f;
    /* access modifiers changed from: private */
    public zzaay g = null;
    private Boolean h = null;
    private final AtomicInteger i = new AtomicInteger(0);
    private final b5 j = new b5((y4) null);
    private final Object k = new Object();
    private zzdvf<ArrayList<String>> l;

    @TargetApi(16)
    private static ArrayList<String> f(Context context) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            PackageInfo e2 = Wrappers.a(context).e(context.getApplicationInfo().packageName, CodedOutputStream.DEFAULT_BUFFER_SIZE);
            if (e2.requestedPermissions != null && e2.requestedPermissionsFlags != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr = e2.requestedPermissions;
                    if (i2 >= strArr.length) {
                        break;
                    }
                    if ((e2.requestedPermissionsFlags[i2] & 2) != 0) {
                        arrayList.add(strArr[i2]);
                    }
                    i2++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final Context a() {
        return this.f6020e;
    }

    public final Resources b() {
        if (this.f6021f.f6134e) {
            return this.f6020e.getResources();
        }
        try {
            zzbaz.b(this.f6020e).getResources();
            return null;
        } catch (zzbbb e2) {
            zzbba.d("Cannot load resource from dynamite apk or local jar", e2);
            return null;
        }
    }

    public final void d(Boolean bool) {
        synchronized (this.f6016a) {
            this.h = bool;
        }
    }

    public final void e(Throwable th, String str) {
        zzarl.f(this.f6020e, this.f6021f).a(th, str);
    }

    public final void h(Throwable th, String str) {
        zzarl.f(this.f6020e, this.f6021f).b(th, str, zzacq.g.a().floatValue());
    }

    @TargetApi(23)
    public final void k(Context context, zzbbd zzbbd) {
        synchronized (this.f6016a) {
            if (!this.f6019d) {
                this.f6020e = context.getApplicationContext();
                this.f6021f = zzbbd;
                zzq.zzkz().d(this.f6018c);
                zzaay zzaay = null;
                this.f6017b.a(this.f6020e, (String) null, true);
                zzarl.f(this.f6020e, this.f6021f);
                new zzqp(context.getApplicationContext(), this.f6021f);
                zzq.zzlf();
                if (!zzace.f5576c.a().booleanValue()) {
                    zzaxv.m("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                } else {
                    zzaay = new zzaay();
                }
                this.g = zzaay;
                if (zzaay != null) {
                    zzbbj.a(new y4(this).zzwq(), "AppState.registerCsiReporter");
                }
                this.f6019d = true;
                s();
            }
        }
        zzq.zzkw().m0(context, zzbbd.f6131b);
    }

    public final zzaay l() {
        zzaay zzaay;
        synchronized (this.f6016a) {
            zzaay = this.g;
        }
        return zzaay;
    }

    public final Boolean m() {
        Boolean bool;
        synchronized (this.f6016a) {
            bool = this.h;
        }
        return bool;
    }

    public final void n() {
        this.j.a();
    }

    public final void o() {
        this.i.incrementAndGet();
    }

    public final void p() {
        this.i.decrementAndGet();
    }

    public final int q() {
        return this.i.get();
    }

    public final zzaxx r() {
        zzaya zzaya;
        synchronized (this.f6016a) {
            zzaya = this.f6017b;
        }
        return zzaya;
    }

    public final zzdvf<ArrayList<String>> s() {
        if (PlatformVersion.c() && this.f6020e != null) {
            if (!((Boolean) zzwg.e().c(zzaav.d1)).booleanValue()) {
                synchronized (this.k) {
                    if (this.l != null) {
                        zzdvf<ArrayList<String>> zzdvf = this.l;
                        return zzdvf;
                    }
                    zzdvf<ArrayList<String>> f2 = zzbbf.f6137a.f(new z4(this));
                    this.l = f2;
                    return f2;
                }
            }
        }
        return zzdux.g(new ArrayList());
    }

    public final zzaxs t() {
        return this.f6018c;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList u() throws Exception {
        return f(zzatd.c(this.f6020e));
    }
}
