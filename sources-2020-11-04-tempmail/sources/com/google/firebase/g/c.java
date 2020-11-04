package com.google.firebase.g;

/* compiled from: com.google.firebase:firebase-common@@19.3.0 */
public interface c {

    /* compiled from: com.google.firebase:firebase-common@@19.3.0 */
    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        

        /* renamed from: b  reason: collision with root package name */
        private final int f11684b;

        private a(int i) {
            this.f11684b = i;
        }

        public int f() {
            return this.f11684b;
        }
    }

    a a(String str);
}
