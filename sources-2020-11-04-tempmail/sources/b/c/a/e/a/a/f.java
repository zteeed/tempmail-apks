package b.c.a.e.a.a;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.play.core.common.a;

final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Activity f2432a;

    f(Activity activity) {
        this.f2432a = activity;
    }

    public final void a(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        this.f2432a.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
