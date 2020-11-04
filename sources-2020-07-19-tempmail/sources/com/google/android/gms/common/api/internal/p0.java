package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

final class p0 implements zabt {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ n0 f2813a;

    private p0(n0 n0Var) {
        this.f2813a = n0Var;
    }

    public final void a(ConnectionResult connectionResult) {
        this.f2813a.m.lock();
        try {
            ConnectionResult unused = this.f2813a.j = connectionResult;
            this.f2813a.t();
        } finally {
            this.f2813a.m.unlock();
        }
    }

    public final void b(Bundle bundle) {
        this.f2813a.m.lock();
        try {
            this.f2813a.f(bundle);
            ConnectionResult unused = this.f2813a.j = ConnectionResult.f2653f;
            this.f2813a.t();
        } finally {
            this.f2813a.m.unlock();
        }
    }

    public final void c(int i, boolean z) {
        this.f2813a.m.lock();
        try {
            if (!this.f2813a.l && this.f2813a.k != null) {
                if (this.f2813a.k.G()) {
                    boolean unused = this.f2813a.l = true;
                    this.f2813a.f2809e.y(i);
                    this.f2813a.m.unlock();
                    return;
                }
            }
            boolean unused2 = this.f2813a.l = false;
            this.f2813a.e(i, z);
        } finally {
            this.f2813a.m.unlock();
        }
    }

    /* synthetic */ p0(n0 n0Var, o0 o0Var) {
        this(n0Var);
    }
}
