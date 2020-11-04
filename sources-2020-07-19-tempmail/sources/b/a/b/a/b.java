package b.a.b.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import b.c.a.c.a.a;
import java.util.List;

/* compiled from: InstallReferrerClientImpl */
class b extends a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public int f1955a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final Context f1956b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public b.c.a.c.a.a f1957c;

    /* renamed from: d  reason: collision with root package name */
    private ServiceConnection f1958d;

    /* renamed from: b.a.b.a.b$b  reason: collision with other inner class name */
    /* compiled from: InstallReferrerClientImpl */
    private final class C0054b implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        private final c f1959a;

        private C0054b(c cVar) {
            if (cVar != null) {
                this.f1959a = cVar;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            b.a.b.b.a.a("InstallReferrerClient", "Install Referrer service connected.");
            b.c.a.c.a.a unused = b.this.f1957c = a.C0063a.y(iBinder);
            int unused2 = b.this.f1955a = 2;
            this.f1959a.a(0);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            b.a.b.b.a.b("InstallReferrerClient", "Install Referrer service disconnected.");
            b.c.a.c.a.a unused = b.this.f1957c = null;
            int unused2 = b.this.f1955a = 0;
            this.f1959a.b();
        }
    }

    public b(Context context) {
        this.f1956b = context.getApplicationContext();
    }

    private boolean h() {
        try {
            if (this.f1956b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public void a() {
        this.f1955a = 3;
        if (this.f1958d != null) {
            b.a.b.b.a.a("InstallReferrerClient", "Unbinding from service.");
            this.f1956b.unbindService(this.f1958d);
            this.f1958d = null;
        }
        this.f1957c = null;
    }

    public d b() throws RemoteException {
        if (c()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f1956b.getPackageName());
            try {
                return new d(this.f1957c.T0(bundle));
            } catch (RemoteException e2) {
                b.a.b.b.a.b("InstallReferrerClient", "RemoteException getting install referrer information");
                this.f1955a = 0;
                throw e2;
            }
        } else {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
    }

    public boolean c() {
        return (this.f1955a != 2 || this.f1957c == null || this.f1958d == null) ? false : true;
    }

    public void e(c cVar) {
        ServiceInfo serviceInfo;
        if (!c()) {
            int i = this.f1955a;
            if (i == 1) {
                b.a.b.b.a.b("InstallReferrerClient", "Client is already in the process of connecting to the service.");
                cVar.a(3);
            } else if (i != 3) {
                b.a.b.b.a.a("InstallReferrerClient", "Starting install referrer service setup.");
                Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                List<ResolveInfo> queryIntentServices = this.f1956b.getPackageManager().queryIntentServices(intent, 0);
                if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
                    this.f1955a = 0;
                    b.a.b.b.a.a("InstallReferrerClient", "Install Referrer service unavailable on device.");
                    cVar.a(2);
                    return;
                }
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if ("com.android.vending".equals(str) && str2 != null && h()) {
                    Intent intent2 = new Intent(intent);
                    C0054b bVar = new C0054b(cVar);
                    this.f1958d = bVar;
                    if (this.f1956b.bindService(intent2, bVar, 1)) {
                        b.a.b.b.a.a("InstallReferrerClient", "Service was bonded successfully.");
                        return;
                    }
                    b.a.b.b.a.b("InstallReferrerClient", "Connection to service is blocked.");
                    this.f1955a = 0;
                    cVar.a(1);
                    return;
                }
                b.a.b.b.a.b("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
                this.f1955a = 0;
                cVar.a(2);
            } else {
                b.a.b.b.a.b("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
                cVar.a(3);
            }
        } else {
            b.a.b.b.a.a("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            cVar.a(0);
        }
    }
}
