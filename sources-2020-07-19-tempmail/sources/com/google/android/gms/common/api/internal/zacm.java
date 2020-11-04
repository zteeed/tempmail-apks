package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultCallbacks;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import javax.annotation.concurrent.GuardedBy;

public final class zacm<R extends Result> extends TransformedResult<R> implements ResultCallback<R> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public ResultTransform<? super R, ? extends Result> f2870a;

    /* renamed from: b  reason: collision with root package name */
    private zacm<? extends Result> f2871b;

    /* renamed from: c  reason: collision with root package name */
    private volatile ResultCallbacks<? super R> f2872c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f2873d;

    /* renamed from: e  reason: collision with root package name */
    private Status f2874e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final WeakReference<GoogleApiClient> f2875f;
    /* access modifiers changed from: private */
    public final e0 g;

    /* access modifiers changed from: private */
    public static void c(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException e2) {
                String valueOf = String.valueOf(result);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("TransformedResultImpl", sb.toString(), e2);
            }
        }
    }

    @GuardedBy("mSyncToken")
    private final boolean e() {
        return (this.f2872c == null || ((GoogleApiClient) this.f2875f.get()) == null) ? false : true;
    }

    private final void h(Status status) {
        synchronized (this.f2873d) {
            this.f2874e = status;
            j(status);
        }
    }

    private final void j(Status status) {
        synchronized (this.f2873d) {
            if (this.f2870a != null) {
                Status a2 = this.f2870a.a(status);
                Preconditions.l(a2, "onFailure must not return null");
                this.f2871b.h(a2);
            } else if (e()) {
                this.f2872c.b(status);
            }
        }
    }

    public final void a(R r) {
        synchronized (this.f2873d) {
            if (!r.q().B()) {
                h(r.q());
                c(r);
            } else if (this.f2870a != null) {
                zacc.a().submit(new d0(this, r));
            } else if (e()) {
                this.f2872c.c(r);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        this.f2872c = null;
    }
}
