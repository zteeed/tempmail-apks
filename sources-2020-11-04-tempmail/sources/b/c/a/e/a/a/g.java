package b.c.a.e.a.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.a;
import com.google.android.play.core.install.b;
import com.google.android.play.core.tasks.c;

final class g implements b {

    /* renamed from: a  reason: collision with root package name */
    private final n f2433a;

    /* renamed from: b  reason: collision with root package name */
    private final e f2434b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f2435c;

    g(n nVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.f2433a = nVar;
        this.f2434b = new e(context);
        this.f2435c = context;
    }

    public final c<Void> a() {
        return this.f2433a.h(this.f2435c.getPackageName());
    }

    public final c<a> b() {
        return this.f2433a.e(this.f2435c.getPackageName());
    }

    public final synchronized void c(b bVar) {
        this.f2434b.b(bVar);
    }

    public final boolean d(a aVar, int i, Activity activity, int i2) throws IntentSender.SendIntentException {
        return f(aVar, new f(activity), d.c(i), i2);
    }

    public final synchronized void e(b bVar) {
        this.f2434b.e(bVar);
    }

    public final boolean f(a aVar, a aVar2, d dVar, int i) throws IntentSender.SendIntentException {
        if (!aVar.o(dVar)) {
            return false;
        }
        aVar2.a(aVar.b(dVar).getIntentSender(), i, (Intent) null, 0, 0, 0, (Bundle) null);
        return true;
    }
}
