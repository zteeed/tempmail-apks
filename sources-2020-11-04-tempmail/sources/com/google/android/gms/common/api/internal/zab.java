package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.util.PlatformVersion;

public abstract class zab {
    public zab(int i) {
    }

    /* access modifiers changed from: private */
    public static Status a(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (PlatformVersion.b() && (remoteException instanceof TransactionTooLargeException)) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }

    public abstract void b(Status status);

    public abstract void c(GoogleApiManager.zaa<?> zaa) throws DeadObjectException;

    public abstract void d(zaab zaab, boolean z);

    public abstract void e(RuntimeException runtimeException);
}
