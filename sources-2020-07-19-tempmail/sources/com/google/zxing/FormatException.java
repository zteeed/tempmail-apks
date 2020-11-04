package com.google.zxing;

public final class FormatException extends ReaderException {

    /* renamed from: d  reason: collision with root package name */
    private static final FormatException f11642d;

    static {
        FormatException formatException = new FormatException();
        f11642d = formatException;
        formatException.setStackTrace(ReaderException.f11645c);
    }

    private FormatException() {
    }

    public static FormatException a() {
        return ReaderException.f11644b ? new FormatException() : f11642d;
    }

    public static FormatException b(Throwable th) {
        return ReaderException.f11644b ? new FormatException(th) : f11642d;
    }

    private FormatException(Throwable th) {
        super(th);
    }
}
