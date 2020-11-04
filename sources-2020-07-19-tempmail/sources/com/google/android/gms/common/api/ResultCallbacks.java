package com.google.android.gms.common.api;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;

public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    @KeepForSdk
    public final void a(R r) {
        Status q = r.q();
        if (q.B()) {
            c(r);
            return;
        }
        b(q);
        if (r instanceof Releasable) {
            try {
                ((Releasable) r).release();
            } catch (RuntimeException e2) {
                String valueOf = String.valueOf(r);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("ResultCallbacks", sb.toString(), e2);
            }
        }
    }

    public abstract void b(Status status);

    public abstract void c(R r);
}
