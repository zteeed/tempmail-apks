package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.play.core.internal.n;

public class PlayCoreDialogWrapperActivity extends Activity {

    /* renamed from: b  reason: collision with root package name */
    private ResultReceiver f11469b;

    public static void a(Context context) {
        n.a(context.getPackageManager(), new ComponentName(context.getPackageName(), "com.google.android.play.core.common.PlayCoreDialogWrapperActivity"));
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        ResultReceiver resultReceiver;
        Bundle bundle;
        int i3;
        super.onActivityResult(i, i2, intent);
        if (i == 0 && (resultReceiver = this.f11469b) != null) {
            if (i2 == -1) {
                bundle = new Bundle();
                i3 = 1;
            } else if (i2 == 0) {
                bundle = new Bundle();
                i3 = 2;
            }
            resultReceiver.send(i3, bundle);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f11469b = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            try {
                startIntentSenderForResult(((PendingIntent) getIntent().getExtras().get("confirmation_intent")).getIntentSender(), 0, (Intent) null, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused) {
                ResultReceiver resultReceiver = this.f11469b;
                if (resultReceiver != null) {
                    resultReceiver.send(3, new Bundle());
                }
                finish();
            }
        } else {
            this.f11469b = (ResultReceiver) bundle.getParcelable("result_receiver");
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f11469b);
    }
}
