package org.threeten.bp.zone;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ZoneRulesInitializer */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f15267a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReference<a> f15268b = new AtomicReference<>();

    public static void a(a aVar) {
        if (f15267a.get()) {
            throw new IllegalStateException("Already initialized");
        } else if (!f15268b.compareAndSet((Object) null, aVar)) {
            throw new IllegalStateException("Initializer was already set, possibly with a default during initialization");
        }
    }
}
