package com.google.zxing;

public final class NotFoundException extends ReaderException {

    /* renamed from: d  reason: collision with root package name */
    private static final NotFoundException f11643d;

    static {
        NotFoundException notFoundException = new NotFoundException();
        f11643d = notFoundException;
        notFoundException.setStackTrace(ReaderException.f11645c);
    }

    private NotFoundException() {
    }

    public static NotFoundException a() {
        return f11643d;
    }
}
