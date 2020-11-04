package e;

import e.m0.e;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import okio.Buffer;
import okio.BufferedSink;

/* compiled from: FormBody */
public final class w extends h0 {

    /* renamed from: c  reason: collision with root package name */
    private static final b0 f14209c = b0.c("application/x-www-form-urlencoded");

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f14210a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f14211b;

    /* compiled from: FormBody */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f14212a;

        /* renamed from: b  reason: collision with root package name */
        private final List<String> f14213b;
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        private final Charset f14214c;

        public a() {
            this((Charset) null);
        }

        public a a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                this.f14212a.add(z.c(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f14214c));
                this.f14213b.add(z.c(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f14214c));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        public a b(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                this.f14212a.add(z.c(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f14214c));
                this.f14213b.add(z.c(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f14214c));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        public w c() {
            return new w(this.f14212a, this.f14213b);
        }

        public a(@Nullable Charset charset) {
            this.f14212a = new ArrayList();
            this.f14213b = new ArrayList();
            this.f14214c = charset;
        }
    }

    w(List<String> list, List<String> list2) {
        this.f14210a = e.s(list);
        this.f14211b = e.s(list2);
    }

    private long a(@Nullable BufferedSink bufferedSink, boolean z) {
        Buffer buffer;
        if (z) {
            buffer = new Buffer();
        } else {
            buffer = bufferedSink.buffer();
        }
        int size = this.f14210a.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                buffer.writeByte(38);
            }
            buffer.writeUtf8(this.f14210a.get(i));
            buffer.writeByte(61);
            buffer.writeUtf8(this.f14211b.get(i));
        }
        if (!z) {
            return 0;
        }
        long size2 = buffer.size();
        buffer.clear();
        return size2;
    }

    public long contentLength() {
        return a((BufferedSink) null, true);
    }

    public b0 contentType() {
        return f14209c;
    }

    public void writeTo(BufferedSink bufferedSink) throws IOException {
        a(bufferedSink, false);
    }
}
