package com.google.zxing;

public abstract class ReaderException extends Exception {

    /* renamed from: b  reason: collision with root package name */
    protected static final boolean f12193b = (System.getProperty("surefire.test.class.path") != null);

    /* renamed from: c  reason: collision with root package name */
    protected static final StackTraceElement[] f12194c = new StackTraceElement[0];

    ReaderException() {
    }

    public final synchronized Throwable fillInStackTrace() {
        return null;
    }

    ReaderException(Throwable th) {
        super(th);
    }
}
