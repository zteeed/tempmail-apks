package b.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

final class v {

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f2177a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f2178b;

        a(String str, boolean z) {
            this.f2177a = str;
            this.f2178b = z;
        }

        public final String a() {
            return this.f2177a;
        }

        /* access modifiers changed from: package-private */
        public final boolean b() {
            return this.f2178b;
        }
    }

    static final class c implements IInterface {

        /* renamed from: b  reason: collision with root package name */
        private IBinder f2181b;

        c(IBinder iBinder) {
            this.f2181b = iBinder;
        }

        public final String B() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f2181b.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean H() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.f2181b.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public final IBinder asBinder() {
            return this.f2181b;
        }
    }

    static a a(Context context) throws Exception {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                b bVar = new b((byte) 0);
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (context.bindService(intent, bVar, 1)) {
                        c cVar = new c(bVar.a());
                        a aVar = new a(cVar.B(), cVar.H());
                        if (context != null) {
                            context.unbindService(bVar);
                        }
                        return aVar;
                    }
                    if (context != null) {
                        context.unbindService(bVar);
                    }
                    throw new IOException("Google Play connection failed");
                } catch (Exception e2) {
                    throw e2;
                } catch (Throwable th) {
                    if (context != null) {
                        context.unbindService(bVar);
                    }
                    throw th;
                }
            } catch (Exception e3) {
                throw e3;
            }
        } else {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
    }

    static final class b implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        private boolean f2179a;

        /* renamed from: b  reason: collision with root package name */
        private final LinkedBlockingQueue<IBinder> f2180b;

        private b() {
            this.f2179a = false;
            this.f2180b = new LinkedBlockingQueue<>(1);
        }

        public final IBinder a() throws InterruptedException {
            if (!this.f2179a) {
                this.f2179a = true;
                return this.f2180b.take();
            }
            throw new IllegalStateException();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f2180b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public final void onServiceDisconnected(ComponentName componentName) {
        }

        /* synthetic */ b(byte b2) {
            this();
        }
    }
}
