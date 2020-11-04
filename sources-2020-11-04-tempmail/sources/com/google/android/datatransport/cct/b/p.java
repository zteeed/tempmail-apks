package com.google.android.datatransport.cct.b;

import android.util.SparseArray;

public enum p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    
    private static final SparseArray<p> h = null;

    static {
        DEFAULT = new p("DEFAULT", 0, 0);
        UNMETERED_ONLY = new p("UNMETERED_ONLY", 1, 1);
        UNMETERED_OR_DAILY = new p("UNMETERED_OR_DAILY", 2, 2);
        FAST_IF_RADIO_AWAKE = new p("FAST_IF_RADIO_AWAKE", 3, 3);
        NEVER = new p("NEVER", 4, 4);
        UNRECOGNIZED = new p("UNRECOGNIZED", 5, -1);
        SparseArray<p> sparseArray = new SparseArray<>();
        h = sparseArray;
        sparseArray.put(0, DEFAULT);
        h.put(1, UNMETERED_ONLY);
        h.put(2, UNMETERED_OR_DAILY);
        h.put(3, FAST_IF_RADIO_AWAKE);
        h.put(4, NEVER);
        h.put(-1, UNRECOGNIZED);
    }

    private p(int i) {
    }
}
