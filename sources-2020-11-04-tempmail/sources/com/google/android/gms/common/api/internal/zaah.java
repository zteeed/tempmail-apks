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
    public final zabe f3023a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f3024b = false;

    public zaah(zabe zabe) {
        this.f3023a = zabe;
    }

    public final void B(int i) {
        this.f3023a.i((ConnectionResult) null);
        this.f3023a.p.c(i, this.f3024b);
    }

    public final void H(Bundle bundle) {
    }

    public final void V(ConnectionResult connectionResult, Api<?> api, boolean z) {
    }

    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T W(T t) {
        try {
            this.f3023a.o.x.b(t);
            zaaw zaaw = this.f3023a.o;
            Api.Client client = zaaw.o.get(t.t());
            Preconditions.l(client, "Appropriate Api was not requested.");
            if (client.isConnected() || !this.f3023a.h.containsKey(t.t())) {
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
            this.f3023a.d(new e(this, this));
        }
    }

    public final void X() {
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (this.f3024b) {
            this.f3024b = false;
            this.f3023a.o.x.a();
            disconnect();
        }
    }

    public final void connect() {
        if (this.f3024b) {
            this.f3024b = false;
            this.f3023a.d(new f(this, this));
        }
    }

    public final boolean disconnect() {
        if (this.f3024b) {
            return false;
        }
        if (this.f3023a.o.q()) {
            this.f3024b = true;
            for (zacm d2 : this.f3023a.o.w) {
                d2.d();
            }
            return false;
        }
        this.f3023a.i((ConnectionResult) null);
        return true;
    }
}
