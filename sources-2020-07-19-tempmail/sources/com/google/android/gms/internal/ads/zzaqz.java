package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public interface zzaqz extends IInterface {
    void k3(List<Uri> list) throws RemoteException;

    void onError(String str) throws RemoteException;
}
