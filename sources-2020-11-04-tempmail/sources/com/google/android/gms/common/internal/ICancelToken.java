package com.google.android.gms.common.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zzb;

public interface ICancelToken extends IInterface {

    public static abstract class Stub extends zzb implements ICancelToken {

        public static class zza extends com.google.android.gms.internal.common.zza implements ICancelToken {
            public final void cancel() throws RemoteException {
                h0(2, B());
            }
        }

        public Stub() {
            super("com.google.android.gms.common.internal.ICancelToken");
        }
    }

    void cancel() throws RemoteException;
}
