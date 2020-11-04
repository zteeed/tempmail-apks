package com.google.firebase.dynamiclinks.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.firebase:firebase-dynamic-links@@19.1.0 */
public interface i extends IInterface {
    void l2(Status status, DynamicLinkData dynamicLinkData) throws RemoteException;

    void r2(Status status, zzo zzo) throws RemoteException;
}
