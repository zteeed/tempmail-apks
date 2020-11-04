package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zaj;
import com.google.android.gms.signin.zaa;
import com.google.android.gms.signin.zad;
import java.util.Set;

public final class zace extends zac implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    private static Api.AbstractClientBuilder<? extends zad, SignInOptions> i = zaa.f10743c;

    /* renamed from: b  reason: collision with root package name */
    private final Context f3053b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f3054c;

    /* renamed from: d  reason: collision with root package name */
    private final Api.AbstractClientBuilder<? extends zad, SignInOptions> f3055d;

    /* renamed from: e  reason: collision with root package name */
    private Set<Scope> f3056e;

    /* renamed from: f  reason: collision with root package name */
    private ClientSettings f3057f;
    private zad g;
    /* access modifiers changed from: private */
    public zach h;

    public zace(Context context, Handler handler, ClientSettings clientSettings) {
        this(context, handler, clientSettings, i);
    }

    /* access modifiers changed from: private */
    public final void H5(zaj zaj) {
        ConnectionResult u = zaj.u();
        if (u.G()) {
            ResolveAccountResponse v = zaj.v();
            ConnectionResult v2 = v.v();
            if (!v2.G()) {
                String valueOf = String.valueOf(v2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                this.h.c(v2);
                this.g.disconnect();
                return;
            }
            this.h.b(v.u(), this.f3056e);
        } else {
            this.h.c(u);
        }
        this.g.disconnect();
    }

    public final void B(int i2) {
        this.g.disconnect();
    }

    public final void H(Bundle bundle) {
        this.g.d(this);
    }

    public final zad Y2() {
        return this.g;
    }

    public final void b1(zaj zaj) {
        this.f3054c.post(new c0(this, zaj));
    }

    public final void d2(zach zach) {
        zad zad = this.g;
        if (zad != null) {
            zad.disconnect();
        }
        this.f3057f.l(Integer.valueOf(System.identityHashCode(this)));
        Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder = this.f3055d;
        Context context = this.f3053b;
        Looper looper = this.f3054c.getLooper();
        ClientSettings clientSettings = this.f3057f;
        this.g = (zad) abstractClientBuilder.b(context, looper, clientSettings, clientSettings.j(), this, this);
        this.h = zach;
        Set<Scope> set = this.f3056e;
        if (set == null || set.isEmpty()) {
            this.f3054c.post(new b0(this));
        } else {
            this.g.connect();
        }
    }

    public final void h0(ConnectionResult connectionResult) {
        this.h.c(connectionResult);
    }

    public final void z3() {
        zad zad = this.g;
        if (zad != null) {
            zad.disconnect();
        }
    }

    public zace(Context context, Handler handler, ClientSettings clientSettings, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder) {
        this.f3053b = context;
        this.f3054c = handler;
        Preconditions.l(clientSettings, "ClientSettings must not be null");
        this.f3057f = clientSettings;
        this.f3056e = clientSettings.i();
        this.f3055d = abstractClientBuilder;
    }
}
