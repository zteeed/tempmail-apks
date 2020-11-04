package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zzb;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
public class ProxyBillingActivity extends Activity {

    /* renamed from: b  reason: collision with root package name */
    private ResultReceiver f2480b;

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            int a2 = zzb.a(intent, "ProxyBillingActivity");
            if (!(i2 == -1 && a2 == 0)) {
                StringBuilder sb = new StringBuilder(85);
                sb.append("Activity finished with resultCode ");
                sb.append(i2);
                sb.append(" and billing's responseCode: ");
                sb.append(a2);
                zzb.l("ProxyBillingActivity", sb.toString());
            }
            this.f2480b.send(a2, intent == null ? null : intent.getExtras());
        } else {
            StringBuilder sb2 = new StringBuilder(69);
            sb2.append("Got onActivityResult with wrong requestCode: ");
            sb2.append(i);
            sb2.append("; skipping...");
            zzb.l("ProxyBillingActivity", sb2.toString());
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle == null) {
            zzb.i("ProxyBillingActivity", "Launching Play Store billing flow");
            this.f2480b = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            } else {
                pendingIntent = getIntent().hasExtra("SUBS_MANAGEMENT_INTENT") ? (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT") : null;
            }
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 100, new Intent(), 0, 0, 0);
            } catch (IntentSender.SendIntentException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
                sb.append("Got exception while trying to start a purchase flow: ");
                sb.append(valueOf);
                zzb.l("ProxyBillingActivity", sb.toString());
                this.f2480b.send(6, (Bundle) null);
                finish();
            }
        } else {
            zzb.i("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f2480b = (ResultReceiver) bundle.getParcelable("result_receiver");
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f2480b);
    }
}
