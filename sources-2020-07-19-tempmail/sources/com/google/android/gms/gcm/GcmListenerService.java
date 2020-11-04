package com.google.android.gms.gcm;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.iid.zze;
import com.google.android.gms.internal.gcm.zzl;
import com.google.android.gms.internal.gcm.zzm;
import java.util.Iterator;
import java.util.List;

@Deprecated
public class GcmListenerService extends zze {
    private zzl g = zzm.f9311a;

    static void g(Bundle bundle) {
        Iterator it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null && str.startsWith("google.c.")) {
                it.remove();
            }
        }
    }

    public void c() {
    }

    public void d(String str, Bundle bundle) {
    }

    public void e(String str) {
    }

    public void f(String str, String str2) {
    }

    public void handleIntent(Intent intent) {
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            String valueOf = String.valueOf(intent.getAction());
            Log.w("GcmListenerService", valueOf.length() != 0 ? "Unknown intent action: ".concat(valueOf) : new String("Unknown intent action: "));
            return;
        }
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        char c2 = 65535;
        boolean z = false;
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals("deleted_messages")) {
                    c2 = 1;
                    break;
                }
                break;
            case 102161:
                if (stringExtra.equals("gcm")) {
                    c2 = 0;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra.equals("send_error")) {
                    c2 = 3;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra.equals("send_event")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        if (c2 == 0) {
            Bundle extras = intent.getExtras();
            extras.remove("message_type");
            extras.remove("androidx.contentpager.content.wakelockid");
            if ("1".equals(a.b(extras, "gcm.n.e")) || a.b(extras, "gcm.n.icon") != null) {
                if (!((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
                    int myPid = Process.myPid();
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) getSystemService("activity")).getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                ActivityManager.RunningAppProcessInfo next = it.next();
                                if (next.pid == myPid) {
                                    if (next.importance == 100) {
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                }
                if (!z) {
                    a.a(this).d(extras);
                    return;
                }
                Bundle bundle = new Bundle();
                Iterator it2 = extras.keySet().iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    String string = extras.getString(str);
                    if (str.startsWith("gcm.notification.")) {
                        str = str.replace("gcm.notification.", "gcm.n.");
                    }
                    if (str.startsWith("gcm.n.")) {
                        if (!"gcm.n.e".equals(str)) {
                            bundle.putString(str.substring(6), string);
                        }
                        it2.remove();
                    }
                }
                String string2 = bundle.getString("sound2");
                if (string2 != null) {
                    bundle.remove("sound2");
                    bundle.putString("sound", string2);
                }
                if (!bundle.isEmpty()) {
                    extras.putBundle("notification", bundle);
                }
            }
            String string3 = extras.getString("from");
            extras.remove("from");
            g(extras);
            this.g.a("onMessageReceived");
            d(string3, extras);
        } else if (c2 == 1) {
            c();
        } else if (c2 == 2) {
            e(intent.getStringExtra("google.message_id"));
        } else if (c2 != 3) {
            String valueOf2 = String.valueOf(stringExtra);
            Log.w("GcmListenerService", valueOf2.length() != 0 ? "Received message with unknown type: ".concat(valueOf2) : new String("Received message with unknown type: "));
        } else {
            String stringExtra2 = intent.getStringExtra("google.message_id");
            if (stringExtra2 == null) {
                stringExtra2 = intent.getStringExtra("message_id");
            }
            f(stringExtra2, intent.getStringExtra("error"));
        }
    }

    public void onCreate() {
        super.onCreate();
        zzm.a();
        getClass();
        this.g = zzm.f9311a;
    }
}
