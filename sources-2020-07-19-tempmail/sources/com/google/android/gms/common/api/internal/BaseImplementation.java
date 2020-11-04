package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.SimpleClientAdapter;

@KeepForSdk
public class BaseImplementation {

    @KeepForSdk
    public static abstract class ApiMethodImpl<R extends Result, A extends Api.AnyClient> extends BasePendingResult<R> implements ResultHolder<R> {
        @KeepForSdk
        private final Api.AnyClientKey<A> q;
        @KeepForSdk
        private final Api<?> r;

        @KeepForSdk
        private void w(RemoteException remoteException) {
            x(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
        }

        @KeepForSdk
        public /* bridge */ /* synthetic */ void a(Object obj) {
            super.h((Result) obj);
        }

        /* access modifiers changed from: protected */
        @KeepForSdk
        public abstract void r(A a2) throws RemoteException;

        @KeepForSdk
        public final Api<?> s() {
            return this.r;
        }

        @KeepForSdk
        public final Api.AnyClientKey<A> t() {
            return this.q;
        }

        /* access modifiers changed from: protected */
        @KeepForSdk
        public void u(R r2) {
        }

        @KeepForSdk
        public final void v(A a2) throws DeadObjectException {
            if (a2 instanceof SimpleClientAdapter) {
                a2 = ((SimpleClientAdapter) a2).i();
            }
            try {
                r(a2);
            } catch (DeadObjectException e2) {
                w(e2);
                throw e2;
            } catch (RemoteException e3) {
                w(e3);
            }
        }

        @KeepForSdk
        public final void x(Status status) {
            Preconditions.b(!status.B(), "Failed result must not be success");
            Result d2 = d(status);
            h(d2);
            u(d2);
        }
    }

    @KeepForSdk
    public interface ResultHolder<R> {
        @KeepForSdk
        void a(R r);
    }
}
