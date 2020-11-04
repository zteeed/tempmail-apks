package com.google.android.play.core.tasks;

import java.util.concurrent.Executor;

public abstract class c<ResultT> {
    public abstract c<ResultT> a(a aVar);

    public abstract c<ResultT> b(Executor executor, a aVar);

    public abstract c<ResultT> c(b<? super ResultT> bVar);

    public abstract c<ResultT> d(Executor executor, b<? super ResultT> bVar);

    public abstract Exception e();

    public abstract ResultT f();

    public abstract boolean g();

    public abstract boolean h();
}
