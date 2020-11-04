package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import b.c.a.e.a.b.c;
import com.google.android.play.core.internal.a;
import com.google.android.play.core.internal.y;
import java.util.ArrayList;
import java.util.concurrent.Executor;

final class v extends c<b> {
    private final m1 g;
    private final w0 h;
    private final y<j3> i;
    private final n0 j;
    private final y0 k;
    private final y<Executor> l;
    private final y<Executor> m;
    private final Handler n = new Handler(Looper.getMainLooper());

    v(Context context, m1 m1Var, w0 w0Var, y<j3> yVar, y0 y0Var, n0 n0Var, y<Executor> yVar2, y<Executor> yVar3) {
        super(new a("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.g = m1Var;
        this.h = w0Var;
        this.i = yVar;
        this.k = y0Var;
        this.j = n0Var;
        this.l = yVar2;
        this.m = yVar3;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra != null) {
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
            if (stringArrayList == null || stringArrayList.size() != 1) {
                this.f2466a.e("Corrupt bundle received from broadcast.", new Object[0]);
                return;
            }
            b a2 = b.a(bundleExtra, stringArrayList.get(0), this.k, x.f11446a);
            this.f2466a.c("ListenerRegistryBroadcastReceiver.onReceive: %s", a2);
            PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("confirmation_intent");
            if (pendingIntent != null) {
                this.j.a(pendingIntent);
            }
            this.m.d().execute(new t(this, bundleExtra, a2));
            this.l.d().execute(new u(this, bundleExtra));
            return;
        }
        this.f2466a.e("Empty bundle received from broadcast.", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h(Bundle bundle) {
        if (this.g.e(bundle)) {
            this.h.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void i(Bundle bundle, b bVar) {
        if (this.g.i(bundle)) {
            j(bVar);
            this.i.d().d();
        }
    }

    /* access modifiers changed from: package-private */
    public final void j(b bVar) {
        this.n.post(new s(this, bVar));
    }
}
