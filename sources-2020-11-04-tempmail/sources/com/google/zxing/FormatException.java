package com.google.zxing;

public final class FormatException extends ReaderException {

    /* renamed from: d  reason: collision with root package name */
    private static final FormatException f12191d;

    static {
        FormatException formatException = new FormatException();
        f12191d = formatException;
        formatException.setStackTrace(ReaderException.f12194c);
    }

    private FormatException() {
    }

    public static FormatException a() {
        return ReaderException.f12193b ? new FormatException() : f12191d;
    }

    public static FormatException b(Throwable th) {
        return ReaderException.f12193b ? new FormatException(th) : f12191d;
    }

    private FormatException(Throwable th) {
        super(th);
    }
}
