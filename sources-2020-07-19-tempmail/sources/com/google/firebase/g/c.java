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
        private final int f11134b;

        private a(int i) {
            this.f11134b = i;
        }

        public int f() {
            return this.f11134b;
        }
    }

    a a(String str);
}
