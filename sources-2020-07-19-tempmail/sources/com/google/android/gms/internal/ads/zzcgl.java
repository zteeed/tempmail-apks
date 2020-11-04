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
    private final Context f7014b;

    /* renamed from: c  reason: collision with root package name */
    private final zzcck f7015c;

    /* renamed from: d  reason: collision with root package name */
    private zzcdg f7016d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public zzccd f7017e;

    public zzcgl(Context context, zzcck zzcck, zzcdg zzcdg, zzccd zzccd) {
        this.f7014b = context;
        this.f7015c = zzcck;
        this.f7016d = zzcdg;
        this.f7017e = zzccd;
    }

    public final void E2(IObjectWrapper iObjectWrapper) {
        zzccd zzccd;
        Object P = ObjectWrapper.P(iObjectWrapper);
        if ((P instanceof View) && this.f7015c.H() != null && (zzccd = this.f7017e) != null) {
            zzccd.r((View) P);
        }
    }

    public final IObjectWrapper N5() {
        return ObjectWrapper.b0(this.f7014b);
    }

    public final String T3(String str) {
        return this.f7015c.K().get(str);
    }

    public final zzadt W4(String str) {
        return this.f7015c.I().get(str);
    }

    public final boolean b4() {
        IObjectWrapper H = this.f7015c.H();
        if (H != null) {
            zzq.zzll().e(H);
            return true;
        }
        zzbba.i("Trying to start OMID session before creation.");
        return false;
    }

    public final void destroy() {
        zzccd zzccd = this.f7017e;
        if (zzccd != null) {
            zzccd.a();
        }
        this.f7017e = null;
        this.f7016d = null;
    }

    public final boolean e5() {
        zzccd zzccd = this.f7017e;
        if ((zzccd == null || zzccd.v()) && this.f7015c.G() != null && this.f7015c.F() == null) {
            return true;
        }
        return false;
    }

    public final void g3() {
        String J = this.f7015c.J();
        if ("Google".equals(J)) {
            zzbba.i("Illegal argument specified for omid partner name.");
            return;
        }
        zzccd zzccd = this.f7017e;
        if (zzccd != null) {
            zzccd.E(J, false);
        }
    }

    public final List<String> getAvailableAssetNames() {
        g<String, zzadf> I = this.f7015c.I();
        g<String, String> K = this.f7015c.K();
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
        return this.f7015c.e();
    }

    public final zzyi getVideoController() {
        return this.f7015c.n();
    }

    public final IObjectWrapper m() {
        return null;
    }

    public final void performClick(String str) {
        zzccd zzccd = this.f7017e;
        if (zzccd != null) {
            zzccd.C(str);
        }
    }

    public final boolean r3(IObjectWrapper iObjectWrapper) {
        Object P = ObjectWrapper.P(iObjectWrapper);
        if (!(P instanceof ViewGroup)) {
            return false;
        }
        zzcdg zzcdg = this.f7016d;
        if (!(zzcdg != null && zzcdg.c((ViewGroup) P))) {
            return false;
        }
        this.f7015c.F().t0(new vi(this));
        return true;
    }

    public final void recordImpression() {
        zzccd zzccd = this.f7017e;
        if (zzccd != null) {
            zzccd.t();
        }
    }
}
