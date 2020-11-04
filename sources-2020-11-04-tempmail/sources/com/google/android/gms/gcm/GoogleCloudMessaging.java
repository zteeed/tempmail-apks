package com.google.android.gms.gcm;

import a.e.a;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.google.android.gms.iid.zzaf;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
public class GoogleCloudMessaging {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Context f3410a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Handler> f3411b = Collections.synchronizedMap(new a());
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final BlockingQueue<Intent> f3412c = new LinkedBlockingQueue();

    static {
        new AtomicInteger(1);
    }

    public GoogleCloudMessaging() {
        new Messenger(new c(this, Looper.getMainLooper()));
    }

    /* access modifiers changed from: private */
    public final boolean b(Intent intent) {
        Handler remove;
        String stringExtra = intent.getStringExtra("In-Reply-To");
        if (stringExtra == null && intent.hasExtra("error")) {
            stringExtra = intent.getStringExtra("google.message_id");
        }
        if (stringExtra == null || (remove = this.f3411b.remove(stringExtra)) == null) {
            return false;
        }
        Message obtain = Message.obtain();
        obtain.obj = intent;
        return remove.sendMessage(obtain);
    }

    public static int e(Context context) {
        String l = zzaf.l(context);
        if (l == null) {
            return -1;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(l, 0);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
            return -1;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }
}
