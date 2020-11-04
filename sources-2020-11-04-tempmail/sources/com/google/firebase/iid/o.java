package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: com.google.firebase:firebase-iid@@20.2.1 */
final class o {

    /* renamed from: a  reason: collision with root package name */
    private final Messenger f11775a;

    /* renamed from: b  reason: collision with root package name */
    private final zzj f11776b;

    o(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f11775a = new Messenger(iBinder);
            this.f11776b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f11776b = new zzj(iBinder);
            this.f11775a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Message message) throws RemoteException {
        Messenger messenger = this.f11775a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zzj zzj = this.f11776b;
        if (zzj != null) {
            zzj.b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
