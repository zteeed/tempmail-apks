package com.google.android.gms.tasks;

import android.app.Activity;
import java.util.concurrent.Executor;

public abstract class Task<TResult> {
    public Task<TResult> a(Executor executor, OnCanceledListener onCanceledListener) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public Task<TResult> b(Activity activity, OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public Task<TResult> c(OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public Task<TResult> d(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract Task<TResult> e(Activity activity, OnFailureListener onFailureListener);

    public abstract Task<TResult> f(Executor executor, OnFailureListener onFailureListener);

    public abstract Task<TResult> g(Activity activity, OnSuccessListener<? super TResult> onSuccessListener);

    public abstract Task<TResult> h(Executor executor, OnSuccessListener<? super TResult> onSuccessListener);

    public <TContinuationResult> Task<TContinuationResult> i(Continuation<TResult, TContinuationResult> continuation) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> Task<TContinuationResult> j(Executor executor, Continuation<TResult, TContinuationResult> continuation) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> Task<TContinuationResult> k(Continuation<TResult, Task<TContinuationResult>> continuation) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> Task<TContinuationResult> l(Executor executor, Continuation<TResult, Task<TContinuationResult>> continuation) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception m();

    public abstract TResult n();

    public abstract <X extends Throwable> TResult o(Class<X> cls) throws Throwable;

    public abstract boolean p();

    public abstract boolean q();

    public abstract boolean r();

    public <TContinuationResult> Task<TContinuationResult> s(SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public <TContinuationResult> Task<TContinuationResult> t(Executor executor, SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
