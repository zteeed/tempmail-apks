package b.c.a.e.a.a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import b.c.a.e.a.b.c;
import com.google.android.play.core.install.a;

public final class e extends c<a> {
    public e(Context context) {
        super(new com.google.android.play.core.internal.a("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, Intent intent) {
        Intent intent2 = intent;
        if (context.getPackageName().equals(intent2.getStringExtra("package.name"))) {
            this.f2466a.c("List of extras in received intent:", new Object[0]);
            for (String str : intent.getExtras().keySet()) {
                this.f2466a.c("Key: %s; value: %s", str, intent.getExtras().get(str));
            }
            com.google.android.play.core.internal.a aVar = this.f2466a;
            aVar.c("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
            aVar.c("Key: %s; value: %s", "install.status", Integer.valueOf(intent2.getIntExtra("install.status", 0)));
            aVar.c("Key: %s; value: %s", "error.code", Integer.valueOf(intent2.getIntExtra("error.code", 0)));
            a a2 = a.a(intent2.getIntExtra("install.status", 0), intent2.getLongExtra("bytes.downloaded", 0), intent2.getLongExtra("total.bytes.to.download", 0), intent2.getIntExtra("error.code", 0), intent2.getStringExtra("package.name"));
            this.f2466a.c("ListenerRegistryBroadcastReceiver.onReceive: %s", a2);
            c(a2);
            return;
        }
        this.f2466a.c("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent2.getStringExtra("package.name"));
    }
}
