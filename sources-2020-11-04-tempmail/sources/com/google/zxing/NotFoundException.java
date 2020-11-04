package com.google.zxing;

public final class NotFoundException extends ReaderException {

    /* renamed from: d  reason: collision with root package name */
    private static final NotFoundException f12192d;

    static {
        NotFoundException notFoundException = new NotFoundException();
        f12192d = notFoundException;
        notFoundException.setStackTrace(ReaderException.f12194c);
    }

    private NotFoundException() {
    }

    public static NotFoundException a() {
        return f12192d;
    }
}
