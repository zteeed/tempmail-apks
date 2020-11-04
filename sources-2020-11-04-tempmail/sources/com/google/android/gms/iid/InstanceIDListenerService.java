package com.google.android.gms.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

@Deprecated
public class InstanceIDListenerService extends zze {
    static void d(Context context, zzak zzak) {
        zzak.l();
        Intent intent = new Intent("com.google.android.gms.iid.InstanceID");
        intent.putExtra("CMD", "RST");
        intent.setClassName(context, "com.google.android.gms.gcm.GcmReceiver");
        context.sendBroadcast(intent);
    }

    public void c() {
    }

    public void handleIntent(Intent intent) {
        if ("com.google.android.gms.iid.InstanceID".equals(intent.getAction())) {
            Bundle bundle = null;
            String stringExtra = intent.getStringExtra("subtype");
            if (stringExtra != null) {
                bundle = new Bundle();
                bundle.putString("subtype", stringExtra);
            }
            InstanceID c2 = InstanceID.c(this, bundle);
            String stringExtra2 = intent.getStringExtra("CMD");
            if (Log.isLoggable("InstanceID", 3)) {
                StringBuilder sb = new StringBuilder(String.valueOf(stringExtra).length() + 34 + String.valueOf(stringExtra2).length());
                sb.append("Service command. subtype:");
                sb.append(stringExtra);
                sb.append(" command:");
                sb.append(stringExtra2);
                Log.d("InstanceID", sb.toString());
            }
            if ("RST".equals(stringExtra2)) {
                c2.j();
                c();
            } else if ("RST_FULL".equals(stringExtra2)) {
                if (!InstanceID.k().b()) {
                    InstanceID.k().l();
                    c();
                }
            } else if ("SYNC".equals(stringExtra2)) {
                zzak k = InstanceID.k();
                String valueOf = String.valueOf(stringExtra);
                k.i("|T|".length() != 0 ? valueOf.concat("|T|") : new String(valueOf));
                String valueOf2 = String.valueOf(stringExtra);
                k.i("|T-timestamp|".length() != 0 ? valueOf2.concat("|T-timestamp|") : new String(valueOf2));
                c();
            }
        }
    }
}
