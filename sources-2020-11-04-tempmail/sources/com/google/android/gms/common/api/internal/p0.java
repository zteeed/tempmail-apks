package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

final class p0 implements zabt {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ n0 f3001a;

    private p0(n0 n0Var) {
        this.f3001a = n0Var;
    }

    public final void a(ConnectionResult connectionResult) {
        this.f3001a.m.lock();
        try {
            ConnectionResult unused = this.f3001a.j = connectionResult;
            this.f3001a.t();
        } finally {
            this.f3001a.m.unlock();
        }
    }

    public final void b(Bundle bundle) {
        this.f3001a.m.lock();
        try {
            this.f3001a.f(bundle);
            ConnectionResult unused = this.f3001a.j = ConnectionResult.f2841f;
            this.f3001a.t();
        } finally {
            this.f3001a.m.unlock();
        }
    }

    public final void c(int i, boolean z) {
        this.f3001a.m.lock();
        try {
            if (!this.f3001a.l && this.f3001a.k != null) {
                if (this.f3001a.k.G()) {
                    boolean unused = this.f3001a.l = true;
                    this.f3001a.f2997e.B(i);
                    this.f3001a.m.unlock();
                    return;
                }
            }
            boolean unused2 = this.f3001a.l = false;
            this.f3001a.e(i, z);
        } finally {
            this.f3001a.m.unlock();
        }
    }

    /* synthetic */ p0(n0 n0Var, o0 o0Var) {
        this(n0Var);
    }
}
