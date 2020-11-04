package com.google.firebase.iid;

import a.l.a.a;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.firebase:firebase-iid@@20.2.0 */
public final class FirebaseInstanceIdReceiver extends a {

    /* renamed from: c  reason: collision with root package name */
    private final ExecutorService f11152c = s0.b();

    static final /* synthetic */ void d(boolean z, BroadcastReceiver.PendingResult pendingResult, Task task) {
        if (z) {
            pendingResult.setResultCode(task.r() ? ((Integer) task.n()).intValue() : 500);
        }
        pendingResult.finish();
    }

    public final void onReceive(Context context, Intent intent) {
        c0 c0Var;
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                intent = intent2;
            }
            intent.setComponent((ComponentName) null);
            intent.setPackage(context.getPackageName());
            if (Build.VERSION.SDK_INT <= 18) {
                intent.removeCategory(context.getPackageName());
            }
            if ("google.com/iid".equals(intent.getStringExtra("from"))) {
                c0Var = new j1(this.f11152c);
            } else {
                c0Var = new c(context, this.f11152c);
            }
            c0Var.a(intent).d(this.f11152c, new b1(isOrderedBroadcast(), goAsync()));
        }
    }
}
