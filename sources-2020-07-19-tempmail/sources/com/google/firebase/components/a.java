package com.google.firebase.components;

import java.util.Set;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
abstract class a implements e {
    a() {
    }

    public <T> T a(Class<T> cls) {
        com.google.firebase.h.a<T> b2 = b(cls);
        if (b2 == null) {
            return null;
        }
        return b2.get();
    }

    public <T> Set<T> d(Class<T> cls) {
        return c(cls).get();
    }
}
