package com.google.android.play.core.tasks;

import b.c.a.e.a.c.a;
import java.util.concurrent.ExecutionException;

public final class e {
    public static <ResultT> c<ResultT> a(Exception exc) {
        p pVar = new p();
        pVar.j(exc);
        return pVar;
    }

    public static <ResultT> c<ResultT> b(ResultT resultt) {
        p pVar = new p();
        pVar.k(resultt);
        return pVar;
    }

    private static <ResultT> ResultT c(c<ResultT> cVar) throws ExecutionException {
        if (cVar.h()) {
            return cVar.f();
        }
        throw new ExecutionException(cVar.e());
    }

    private static void d(c<?> cVar, q qVar) {
        cVar.d(d.f11509b, qVar);
        cVar.b(d.f11509b, qVar);
    }

    public static <ResultT> ResultT e(c<ResultT> cVar) throws ExecutionException, InterruptedException {
        a.b(cVar, "Task must not be null");
        if (cVar.g()) {
            return c(cVar);
        }
        q qVar = new q((byte[]) null);
        d(cVar, qVar);
        qVar.a();
        return c(cVar);
    }
}
