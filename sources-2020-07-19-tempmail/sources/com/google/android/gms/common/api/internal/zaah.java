package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.SimpleClientAdapter;

public final class zaah implements zabd {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final zabe f2835a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2836b = false;

    public zaah(zabe zabe) {
        this.f2835a = zabe;
    }

    public final void E(Bundle bundle) {
    }

    public final void P(ConnectionResult connectionResult, Api<?> api, boolean z) {
    }

    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T Q(T t) {
        try {
            this.f2835a.o.x.b(t);
            zaaw zaaw = this.f2835a.o;
            Api.Client client = zaaw.o.get(t.t());
            Preconditions.l(client, "Appropriate Api was not requested.");
            if (client.isConnected() || !this.f2835a.h.containsKey(t.t())) {
                boolean z = client instanceof SimpleClientAdapter;
                Api.AnyClient anyClient = client;
                if (z) {
                    anyClient = ((SimpleClientAdapter) client).i();
                }
                t.v(anyClient);
                return t;
            }
            t.x(new Status(17));
            return t;
        } catch (DeadObjectException unused) {
            this.f2835a.d(new e(this, this));
        }
    }

    public final void R() {
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (this.f2836b) {
            this.f2836b = false;
            this.f2835a.o.x.a();
            disconnect();
        }
    }

    public final void connect() {
        if (this.f2836b) {
            this.f2836b = false;
            this.f2835a.d(new f(this, this));
        }
    }

    public final boolean disconnect() {
        if (this.f2836b) {
            return false;
        }
        if (this.f2835a.o.q()) {
            this.f2836b = true;
            for (zacm d2 : this.f2835a.o.w) {
                d2.d();
            }
            return false;
        }
        this.f2835a.i((ConnectionResult) null);
        return true;
    }

    public final void y(int i) {
        this.f2835a.i((ConnectionResult) null);
        this.f2835a.p.c(i, this.f2836b);
    }
}
