package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

final class q0 implements zabt {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ n0 f3002a;

    private q0(n0 n0Var) {
        this.f3002a = n0Var;
    }

    public final void a(ConnectionResult connectionResult) {
        this.f3002a.m.lock();
        try {
            ConnectionResult unused = this.f3002a.k = connectionResult;
            this.f3002a.t();
        } finally {
            this.f3002a.m.unlock();
        }
    }

    public final void b(Bundle bundle) {
        this.f3002a.m.lock();
        try {
            ConnectionResult unused = this.f3002a.k = ConnectionResult.f2841f;
            this.f3002a.t();
        } finally {
            this.f3002a.m.unlock();
        }
    }

    public final void c(int i, boolean z) {
        this.f3002a.m.lock();
        try {
            if (this.f3002a.l) {
                boolean unused = this.f3002a.l = false;
                this.f3002a.e(i, z);
                return;
            }
            boolean unused2 = this.f3002a.l = true;
            this.f3002a.f2996d.B(i);
            this.f3002a.m.unlock();
        } finally {
            this.f3002a.m.unlock();
        }
    }

    /* synthetic */ q0(n0 n0Var, o0 o0Var) {
        this(n0Var);
    }
}
