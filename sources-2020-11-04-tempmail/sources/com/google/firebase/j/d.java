package com.google.firebase.j;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-common@@19.3.0 */
public class d {

    /* renamed from: b  reason: collision with root package name */
    private static volatile d f11913b;

    /* renamed from: a  reason: collision with root package name */
    private final Set<f> f11914a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f11913b;
        if (dVar == null) {
            synchronized (d.class) {
                dVar = f11913b;
                if (dVar == null) {
                    dVar = new d();
                    f11913b = dVar;
                }
            }
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    public Set<f> b() {
        Set<f> unmodifiableSet;
        synchronized (this.f11914a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f11914a);
        }
        return unmodifiableSet;
    }
}
