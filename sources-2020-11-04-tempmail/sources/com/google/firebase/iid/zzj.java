package com.google.firebase.iid;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: com.google.firebase:firebase-iid@@20.2.1 */
public class zzj implements Parcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new t0();

    /* renamed from: b  reason: collision with root package name */
    private Messenger f11825b;

    /* renamed from: c  reason: collision with root package name */
    private h1 f11826c;

    /* compiled from: com.google.firebase:firebase-iid@@20.2.1 */
    public static final class a extends ClassLoader {
        /* access modifiers changed from: protected */
        public final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            if (!FirebaseInstanceId.w()) {
                return zzj.class;
            }
            Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
            return zzj.class;
        }
    }

    public zzj(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f11825b = new Messenger(iBinder);
        } else {
            this.f11826c = new g1(iBinder);
        }
    }

    private final IBinder a() {
        Messenger messenger = this.f11825b;
        return messenger != null ? messenger.getBinder() : this.f11826c.asBinder();
    }

    public final void b(Message message) throws RemoteException {
        Messenger messenger = this.f11825b;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f11826c.g6(message);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((zzj) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f11825b;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.f11826c.asBinder());
        }
    }
}
