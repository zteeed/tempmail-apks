package com.google.android.gms.tasks;

public class TaskCompletionSource<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final t<TResult> f10753a = new t<>();

    public Task<TResult> a() {
        return this.f10753a;
    }

    public void b(Exception exc) {
        this.f10753a.u(exc);
    }

    public void c(TResult tresult) {
        this.f10753a.v(tresult);
    }

    public boolean d(Exception exc) {
        return this.f10753a.w(exc);
    }

    public boolean e(TResult tresult) {
        return this.f10753a.x(tresult);
    }
}
