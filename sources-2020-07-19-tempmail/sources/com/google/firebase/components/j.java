package com.google.firebase.components;

import com.google.firebase.h.a;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
final /* synthetic */ class j implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Set f11056a;

    private j(Set set) {
        this.f11056a = set;
    }

    public static a a(Set set) {
        return new j(set);
    }

    public Object get() {
        return l.g(this.f11056a);
    }
}
