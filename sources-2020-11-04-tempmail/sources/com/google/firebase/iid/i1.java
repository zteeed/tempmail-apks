package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;
import java.util.concurrent.Callable;

/* compiled from: com.google.firebase:firebase-iid@@20.2.1 */
final /* synthetic */ class i1 implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final Intent f11755b;

    i1(Intent intent) {
        this.f11755b = intent;
    }

    public final Object call() {
        Intent intent = this.f11755b;
        String stringExtra = intent.getStringExtra("CMD");
        if (stringExtra != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(intent.getExtras());
                StringBuilder sb = new StringBuilder(String.valueOf(stringExtra).length() + 21 + String.valueOf(valueOf).length());
                sb.append("Received command: ");
                sb.append(stringExtra);
                sb.append(" - ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                FirebaseInstanceId.b().x();
            } else if ("SYNC".equals(stringExtra)) {
                FirebaseInstanceId.b().z();
            }
        }
        return -1;
    }
}
