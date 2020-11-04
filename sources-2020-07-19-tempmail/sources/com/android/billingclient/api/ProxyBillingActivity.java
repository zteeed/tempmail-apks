package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import b.a.a.a.a;

public class ProxyBillingActivity extends Activity {

    /* renamed from: b  reason: collision with root package name */
    private ResultReceiver f2379b;

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            int d2 = a.d(intent, "ProxyBillingActivity");
            if (!(i2 == -1 && d2 == 0)) {
                a.f("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + d2);
            }
            this.f2379b.send(d2, intent == null ? null : intent.getExtras());
        } else {
            a.f("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i + "; skipping...");
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle == null) {
            a.e("ProxyBillingActivity", "Launching Play Store billing flow");
            this.f2379b = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            } else {
                pendingIntent = getIntent().hasExtra("SUBS_MANAGEMENT_INTENT") ? (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT") : null;
            }
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 100, new Intent(), 0, 0, 0);
            } catch (IntentSender.SendIntentException e2) {
                a.f("ProxyBillingActivity", "Got exception while trying to start a purchase flow: " + e2);
                this.f2379b.send(6, (Bundle) null);
                finish();
            }
        } else {
            a.e("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f2379b = (ResultReceiver) bundle.getParcelable("result_receiver");
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f2379b);
    }
}
