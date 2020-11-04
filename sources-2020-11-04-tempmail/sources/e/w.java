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
    private static final b0 f14775c = b0.c("application/x-www-form-urlencoded");

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f14776a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f14777b;

    /* compiled from: FormBody */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f14778a;

        /* renamed from: b  reason: collision with root package name */
        private final List<String> f14779b;
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        private final Charset f14780c;

        public a() {
            this((Charset) null);
        }

        public a a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                this.f14778a.add(z.c(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f14780c));
                this.f14779b.add(z.c(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f14780c));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        public a b(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                this.f14778a.add(z.c(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f14780c));
                this.f14779b.add(z.c(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f14780c));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        public w c() {
            return new w(this.f14778a, this.f14779b);
        }

        public a(@Nullable Charset charset) {
            this.f14778a = new ArrayList();
            this.f14779b = new ArrayList();
            this.f14780c = charset;
        }
    }

    w(List<String> list, List<String> list2) {
        this.f14776a = e.s(list);
        this.f14777b = e.s(list2);
    }

    private long a(@Nullable BufferedSink bufferedSink, boolean z) {
        Buffer buffer;
        if (z) {
            buffer = new Buffer();
        } else {
            buffer = bufferedSink.buffer();
        }
        int size = this.f14776a.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                buffer.writeByte(38);
            }
            buffer.writeUtf8(this.f14776a.get(i));
            buffer.writeByte(61);
            buffer.writeUtf8(this.f14777b.get(i));
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
        return f14775c;
    }

    public void writeTo(BufferedSink bufferedSink) throws IOException {
        a(bufferedSink, false);
    }
}
