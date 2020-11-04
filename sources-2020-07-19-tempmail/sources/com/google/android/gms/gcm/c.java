package com.google.android.gms.gcm;

import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.gcm.zzj;

final class c extends zzj {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ GoogleCloudMessaging f3249a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    c(GoogleCloudMessaging googleCloudMessaging, Looper looper) {
        super(looper);
        this.f3249a = googleCloudMessaging;
    }

    public final void handleMessage(Message message) {
        if (message == null || !(message.obj instanceof Intent)) {
            Log.w("GCM", "Dropping invalid message");
        }
        Intent intent = (Intent) message.obj;
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(intent.getAction())) {
            this.f3249a.f3229c.add(intent);
        } else if (!this.f3249a.b(intent)) {
            intent.setPackage(this.f3249a.f3227a.getPackageName());
            this.f3249a.f3227a.sendBroadcast(intent);
        }
    }
}
