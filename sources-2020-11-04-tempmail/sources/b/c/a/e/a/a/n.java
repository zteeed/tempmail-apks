package b.c.a.e.a.a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.internal.a;
import com.google.android.play.core.internal.i0;
import com.google.android.play.core.internal.l;
import com.google.android.play.core.internal.o;
import com.google.android.play.core.tasks.c;
import com.google.android.play.core.tasks.e;
import com.google.android.play.core.tasks.m;

final class n {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final a f2448e = new a("AppUpdateService");

    /* renamed from: f  reason: collision with root package name */
    private static final Intent f2449f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a  reason: collision with root package name */
    l<i0> f2450a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final String f2451b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f2452c;

    /* renamed from: d  reason: collision with root package name */
    private final o f2453d;

    public n(Context context) {
        this.f2451b = context.getPackageName();
        this.f2452c = context;
        if (o.a(context)) {
            this.f2450a = new l(com.google.android.play.core.splitinstall.a.a(context), f2448e, "AppUpdateService", f2449f, h.f2436a);
        }
        this.f2453d = new o(context);
    }

    static /* synthetic */ Bundle b(n nVar, String str) {
        Integer num;
        Bundle bundle = new Bundle();
        bundle.putAll(j());
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(nVar.f2452c.getPackageManager().getPackageInfo(nVar.f2452c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f2448e.e("The current version of the app could not be retrieved", new Object[0]);
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }

    static /* synthetic */ a c(n nVar, Bundle bundle, String str) {
        Bundle bundle2 = bundle;
        return a.c(str, bundle2.getInt("version.code", -1), bundle2.getInt("update.availability"), bundle2.getInt("install.status", 0), bundle2.getInt("client.version.staleness", -1) != -1 ? Integer.valueOf(bundle2.getInt("client.version.staleness")) : null, bundle2.getInt("in.app.update.priority", 0), bundle2.getLong("bytes.downloaded"), bundle2.getLong("total.bytes.to.download"), bundle2.getLong("additional.size.required"), nVar.f2453d.a(), (PendingIntent) bundle2.getParcelable("blocking.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.intent"), (PendingIntent) bundle2.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.destructive.intent"));
    }

    private static <T> c<T> i() {
        f2448e.e("onError(%d)", -9);
        return e.a(new InstallException(-9));
    }

    /* access modifiers changed from: private */
    public static Bundle j() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore.version.code", 10703);
        return bundle;
    }

    public final c<a> e(String str) {
        if (this.f2450a == null) {
            return i();
        }
        f2448e.f("requestUpdateInfo(%s)", str);
        m mVar = new m();
        this.f2450a.c(new i(this, mVar, str, mVar));
        return mVar.a();
    }

    public final c<Void> h(String str) {
        if (this.f2450a == null) {
            return i();
        }
        f2448e.f("completeUpdate(%s)", str);
        m mVar = new m();
        this.f2450a.c(new j(this, mVar, mVar, str));
        return mVar.a();
    }
}
