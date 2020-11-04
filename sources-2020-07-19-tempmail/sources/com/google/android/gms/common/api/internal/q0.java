package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

final class q0 implements zabt {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ n0 f2814a;

    private q0(n0 n0Var) {
        this.f2814a = n0Var;
    }

    public final void a(ConnectionResult connectionResult) {
        this.f2814a.m.lock();
        try {
            ConnectionResult unused = this.f2814a.k = connectionResult;
            this.f2814a.t();
        } finally {
            this.f2814a.m.unlock();
        }
    }

    public final void b(Bundle bundle) {
        this.f2814a.m.lock();
        try {
            ConnectionResult unused = this.f2814a.k = ConnectionResult.f2653f;
            this.f2814a.t();
        } finally {
            this.f2814a.m.unlock();
        }
    }

    public final void c(int i, boolean z) {
        this.f2814a.m.lock();
        try {
            if (this.f2814a.l) {
                boolean unused = this.f2814a.l = false;
                this.f2814a.e(i, z);
                return;
            }
            boolean unused2 = this.f2814a.l = true;
            this.f2814a.f2808d.y(i);
            this.f2814a.m.unlock();
        } finally {
            this.f2814a.m.unlock();
        }
    }

    /* synthetic */ q0(n0 n0Var, o0 o0Var) {
        this(n0Var);
    }
}
