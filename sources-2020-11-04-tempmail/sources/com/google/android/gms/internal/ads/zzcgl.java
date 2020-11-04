package com.google.android.gms.internal.ads;

import a.e.g;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcgl extends zzaeo {

    /* renamed from: b  reason: collision with root package name */
    private final Context f7197b;

    /* renamed from: c  reason: collision with root package name */
    private final zzcck f7198c;

    /* renamed from: d  reason: collision with root package name */
    private zzcdg f7199d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public zzccd f7200e;

    public zzcgl(Context context, zzcck zzcck, zzcdg zzcdg, zzccd zzccd) {
        this.f7197b = context;
        this.f7198c = zzcck;
        this.f7199d = zzcdg;
        this.f7200e = zzccd;
    }

    public final boolean A5() {
        zzccd zzccd = this.f7200e;
        if ((zzccd == null || zzccd.v()) && this.f7198c.G() != null && this.f7198c.F() == null) {
            return true;
        }
        return false;
    }

    public final boolean G3(IObjectWrapper iObjectWrapper) {
        Object V = ObjectWrapper.V(iObjectWrapper);
        if (!(V instanceof ViewGroup)) {
            return false;
        }
        zzcdg zzcdg = this.f7199d;
        if (!(zzcdg != null && zzcdg.c((ViewGroup) V))) {
            return false;
        }
        this.f7198c.F().t0(new vi(this));
        return true;
    }

    public final void P2(IObjectWrapper iObjectWrapper) {
        zzccd zzccd;
        Object V = ObjectWrapper.V(iObjectWrapper);
        if ((V instanceof View) && this.f7198c.H() != null && (zzccd = this.f7200e) != null) {
            zzccd.r((View) V);
        }
    }

    public final void destroy() {
        zzccd zzccd = this.f7200e;
        if (zzccd != null) {
            zzccd.a();
        }
        this.f7200e = null;
        this.f7199d = null;
    }

    public final List<String> getAvailableAssetNames() {
        g<String, zzadf> I = this.f7198c.I();
        g<String, String> K = this.f7198c.K();
        String[] strArr = new String[(I.size() + K.size())];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < I.size()) {
            strArr[i3] = I.i(i2);
            i2++;
            i3++;
        }
        while (i < K.size()) {
            strArr[i3] = K.i(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    public final String getCustomTemplateId() {
        return this.f7198c.e();
    }

    public final zzyi getVideoController() {
        return this.f7198c.n();
    }

    public final String l4(String str) {
        return this.f7198c.K().get(str);
    }

    public final IObjectWrapper m6() {
        return ObjectWrapper.h0(this.f7197b);
    }

    public final IObjectWrapper o() {
        return null;
    }

    public final void performClick(String str) {
        zzccd zzccd = this.f7200e;
        if (zzccd != null) {
            zzccd.C(str);
        }
    }

    public final zzadt r5(String str) {
        return this.f7198c.I().get(str);
    }

    public final void recordImpression() {
        zzccd zzccd = this.f7200e;
        if (zzccd != null) {
            zzccd.t();
        }
    }

    public final boolean v4() {
        IObjectWrapper H = this.f7198c.H();
        if (H != null) {
            zzq.zzll().e(H);
            return true;
        }
        zzbba.i("Trying to start OMID session before creation.");
        return false;
    }

    public final void w3() {
        String J = this.f7198c.J();
        if ("Google".equals(J)) {
            zzbba.i("Illegal argument specified for omid partner name.");
            return;
        }
        zzccd zzccd = this.f7200e;
        if (zzccd != null) {
            zzccd.E(J, false);
        }
    }
}
