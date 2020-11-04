package org.threeten.bp.zone;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ZoneRulesInitializer */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f14698a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReference<a> f14699b = new AtomicReference<>();

    public static void a(a aVar) {
        if (f14698a.get()) {
            throw new IllegalStateException("Already initialized");
        } else if (!f14699b.compareAndSet((Object) null, aVar)) {
            throw new IllegalStateException("Initializer was already set, possibly with a default during initialization");
        }
    }
}
