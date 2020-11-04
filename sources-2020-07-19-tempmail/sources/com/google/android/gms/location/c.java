package com.google.android.gms.location;

import java.util.Comparator;

final class c implements Comparator<ActivityTransition> {
    c() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        ActivityTransition activityTransition = (ActivityTransition) obj;
        ActivityTransition activityTransition2 = (ActivityTransition) obj2;
        int u = activityTransition.u();
        int u2 = activityTransition2.u();
        if (u != u2) {
            return u < u2 ? -1 : 1;
        }
        int v = activityTransition.v();
        int v2 = activityTransition2.v();
        if (v == v2) {
            return 0;
        }
        return v < v2 ? -1 : 1;
    }
}
