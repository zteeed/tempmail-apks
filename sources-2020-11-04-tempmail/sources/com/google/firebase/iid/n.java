package com.google.firebase.iid;

import android.os.Bundle;

/* compiled from: com.google.firebase:firebase-iid@@20.2.1 */
final class n extends p<Void> {
    n(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* access modifiers changed from: package-private */
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            c(null);
        } else {
            b(new zzam(4, "Invalid response to one way request"));
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        return true;
    }
}
