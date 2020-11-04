package e;

import e.m0.e;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;
import okio.BufferedSink;
import okio.ByteString;

/* compiled from: RequestBody */
public abstract class h0 {

    /* compiled from: RequestBody */
    class a extends h0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b0 f14039a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ByteString f14040b;

        a(b0 b0Var, ByteString byteString) {
            this.f14039a = b0Var;
            this.f14040b = byteString;
        }

        public long contentLength() throws IOException {
            return (long) this.f14040b.size();
        }

        @Nullable
        public b0 contentType() {
            return this.f14039a;
        }

        public void writeTo(BufferedSink bufferedSink) throws IOException {
            bufferedSink.write(this.f14040b);
        }
    }

    /* compiled from: RequestBody */
    class b extends h0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b0 f14041a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f14042b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ byte[] f14043c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f14044d;

        b(b0 b0Var, int i, byte[] bArr, int i2) {
            this.f14041a = b0Var;
            this.f14042b = i;
            this.f14043c = bArr;
            this.f14044d = i2;
        }

        public long contentLength() {
            return (long) this.f14042b;
        }

        @Nullable
        public b0 contentType() {
            return this.f14041a;
        }

        public void writeTo(BufferedSink bufferedSink) throws IOException {
            bufferedSink.write(this.f14043c, this.f14044d, this.f14042b);
        }
    }

    /* compiled from: RequestBody */
    class c extends h0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b0 f14045a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ File f14046b;

        c(b0 b0Var, File file) {
            this.f14045a = b0Var;
            this.f14046b = file;
        }

        public long contentLength() {
            return this.f14046b.length();
        }

        @Nullable
        public b0 contentType() {
            return this.f14045a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r0.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
            r3.addSuppressed(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
            if (r0 != null) goto L_0x0014;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void writeTo(okio.BufferedSink r3) throws java.io.IOException {
            /*
                r2 = this;
                java.io.File r0 = r2.f14046b
                okio.Source r0 = okio.Okio.source((java.io.File) r0)
                r3.writeAll(r0)     // Catch:{ all -> 0x000f }
                if (r0 == 0) goto L_0x000e
                r0.close()
            L_0x000e:
                return
            L_0x000f:
                r3 = move-exception
                throw r3     // Catch:{ all -> 0x0011 }
            L_0x0011:
                r1 = move-exception
                if (r0 == 0) goto L_0x001c
                r0.close()     // Catch:{ all -> 0x0018 }
                goto L_0x001c
            L_0x0018:
                r0 = move-exception
                r3.addSuppressed(r0)
            L_0x001c:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: e.h0.c.writeTo(okio.BufferedSink):void");
        }
    }

    public static h0 create(@Nullable b0 b0Var, String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (b0Var != null && (charset = b0Var.a()) == null) {
            charset = StandardCharsets.UTF_8;
            b0Var = b0.d(b0Var + "; charset=utf-8");
        }
        return create(b0Var, str.getBytes(charset));
    }

    public long contentLength() throws IOException {
        return -1;
    }

    @Nullable
    public abstract b0 contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(BufferedSink bufferedSink) throws IOException;

    public static h0 create(@Nullable b0 b0Var, ByteString byteString) {
        return new a(b0Var, byteString);
    }

    public static h0 create(@Nullable b0 b0Var, byte[] bArr) {
        return create(b0Var, bArr, 0, bArr.length);
    }

    public static h0 create(@Nullable b0 b0Var, byte[] bArr, int i, int i2) {
        if (bArr != null) {
            e.e((long) bArr.length, (long) i, (long) i2);
            return new b(b0Var, i2, bArr, i);
        }
        throw new NullPointerException("content == null");
    }

    public static h0 create(@Nullable b0 b0Var, File file) {
        if (file != null) {
            return new c(b0Var, file);
        }
        throw new NullPointerException("file == null");
    }
}
