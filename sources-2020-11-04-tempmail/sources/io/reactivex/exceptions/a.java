package io.reactivex.exceptions;

import d.a.a0.j.j;

/* compiled from: Exceptions */
public final class a {
    public static RuntimeException a(Throwable th) {
        throw j.d(th);
    }

    public static void b(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
