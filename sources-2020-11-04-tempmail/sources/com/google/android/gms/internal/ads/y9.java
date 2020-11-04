package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class y9 implements zzbgn {

    /* renamed from: a  reason: collision with root package name */
    private final zzbfn f5548a;

    y9(zzbfn zzbfn) {
        this.f5548a = zzbfn;
    }

    public final void a(Uri uri) {
        zzbgz q = this.f5548a.q();
        if (q == null) {
            zzbba.g("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            q.a(uri);
        }
    }
}
