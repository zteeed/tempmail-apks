package com.google.zxing;

public final class ChecksumException extends ReaderException {

    /* renamed from: d  reason: collision with root package name */
    private static final ChecksumException f12190d;

    static {
        ChecksumException checksumException = new ChecksumException();
        f12190d = checksumException;
        checksumException.setStackTrace(ReaderException.f12194c);
    }

    private ChecksumException() {
    }

    public static ChecksumException a() {
        return ReaderException.f12193b ? new ChecksumException() : f12190d;
    }
}
