package com.google.firebase.iid;

import android.os.Bundle;

/* compiled from: com.google.firebase:firebase-iid@@20.2.0 */
final class r extends p<Bundle> {
    r(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* access modifiers changed from: package-private */
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        c(bundle2);
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        return false;
    }
}
