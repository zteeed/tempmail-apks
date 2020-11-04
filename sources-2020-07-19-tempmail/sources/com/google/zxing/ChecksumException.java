package com.google.zxing;

public final class ChecksumException extends ReaderException {

    /* renamed from: d  reason: collision with root package name */
    private static final ChecksumException f11641d;

    static {
        ChecksumException checksumException = new ChecksumException();
        f11641d = checksumException;
        checksumException.setStackTrace(ReaderException.f11645c);
    }

    private ChecksumException() {
    }

    public static ChecksumException a() {
        return ReaderException.f11644b ? new ChecksumException() : f11641d;
    }
}
