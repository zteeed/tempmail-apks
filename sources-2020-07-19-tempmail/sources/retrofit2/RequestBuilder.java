package retrofit2;

import e.b0;
import e.c0;
import e.g0;
import e.h0;
import e.w;
import e.y;
import e.z;
import java.io.IOException;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okio.Buffer;
import okio.BufferedSink;

final class RequestBuilder {
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final String PATH_SEGMENT_ALWAYS_ENCODE_SET = " \"<>^`{}|\\?#";
    private static final Pattern PATH_TRAVERSAL = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    private final z baseUrl;
    @Nullable
    private h0 body;
    @Nullable
    private b0 contentType;
    @Nullable
    private w.a formBuilder;
    private final boolean hasBody;
    private final y.a headersBuilder;
    private final String method;
    @Nullable
    private c0.a multipartBuilder;
    @Nullable
    private String relativeUrl;
    private final g0.a requestBuilder = new g0.a();
    @Nullable
    private z.a urlBuilder;

    private static class ContentTypeOverridingRequestBody extends h0 {
        private final b0 contentType;
        private final h0 delegate;

        ContentTypeOverridingRequestBody(h0 h0Var, b0 b0Var) {
            this.delegate = h0Var;
            this.contentType = b0Var;
        }

        public long contentLength() throws IOException {
            return this.delegate.contentLength();
        }

        public b0 contentType() {
            return this.contentType;
        }

        public void writeTo(BufferedSink bufferedSink) throws IOException {
            this.delegate.writeTo(bufferedSink);
        }
    }

    RequestBuilder(String str, z zVar, @Nullable String str2, @Nullable y yVar, @Nullable b0 b0Var, boolean z, boolean z2, boolean z3) {
        this.method = str;
        this.baseUrl = zVar;
        this.relativeUrl = str2;
        this.contentType = b0Var;
        this.hasBody = z;
        if (yVar != null) {
            this.headersBuilder = yVar.f();
        } else {
            this.headersBuilder = new y.a();
        }
        if (z2) {
            this.formBuilder = new w.a();
        } else if (z3) {
            c0.a aVar = new c0.a();
            this.multipartBuilder = aVar;
            aVar.f(c0.f13985f);
        }
    }

    private static String canonicalizeForPath(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 32 || codePointAt >= 127 || PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, 0, i);
                canonicalizeForPath(buffer, str, i, length, z);
                return buffer.readUtf8();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    public void addFormField(String str, String str2, boolean z) {
        if (z) {
            this.formBuilder.b(str, str2);
        } else {
            this.formBuilder.a(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public void addHeader(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.contentType = b0.c(str2);
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException("Malformed content type: " + str2, e2);
            }
        } else {
            this.headersBuilder.a(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public void addHeaders(y yVar) {
        this.headersBuilder.b(yVar);
    }

    /* access modifiers changed from: package-private */
    public void addPart(y yVar, h0 h0Var) {
        this.multipartBuilder.c(yVar, h0Var);
    }

    /* access modifiers changed from: package-private */
    public void addPathParam(String str, String str2, boolean z) {
        if (this.relativeUrl != null) {
            String canonicalizeForPath = canonicalizeForPath(str2, z);
            String str3 = this.relativeUrl;
            String replace = str3.replace("{" + str + "}", canonicalizeForPath);
            if (!PATH_TRAVERSAL.matcher(replace).matches()) {
                this.relativeUrl = replace;
                return;
            }
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    public void addQueryParam(String str, @Nullable String str2, boolean z) {
        String str3 = this.relativeUrl;
        if (str3 != null) {
            z.a q = this.baseUrl.q(str3);
            this.urlBuilder = q;
            if (q != null) {
                this.relativeUrl = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.baseUrl + ", Relative: " + this.relativeUrl);
            }
        }
        if (z) {
            this.urlBuilder.a(str, str2);
        } else {
            this.urlBuilder.b(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public <T> void addTag(Class<T> cls, @Nullable T t) {
        this.requestBuilder.g(cls, t);
    }

    /* access modifiers changed from: package-private */
    public g0.a get() {
        z zVar;
        z.a aVar = this.urlBuilder;
        if (aVar != null) {
            zVar = aVar.c();
        } else {
            zVar = this.baseUrl.D(this.relativeUrl);
            if (zVar == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.baseUrl + ", Relative: " + this.relativeUrl);
            }
        }
        ContentTypeOverridingRequestBody contentTypeOverridingRequestBody = this.body;
        if (contentTypeOverridingRequestBody == null) {
            w.a aVar2 = this.formBuilder;
            if (aVar2 != null) {
                contentTypeOverridingRequestBody = aVar2.c();
            } else {
                c0.a aVar3 = this.multipartBuilder;
                if (aVar3 != null) {
                    contentTypeOverridingRequestBody = aVar3.e();
                } else if (this.hasBody) {
                    contentTypeOverridingRequestBody = h0.create((b0) null, new byte[0]);
                }
            }
        }
        b0 b0Var = this.contentType;
        if (b0Var != null) {
            if (contentTypeOverridingRequestBody != null) {
                contentTypeOverridingRequestBody = new ContentTypeOverridingRequestBody(contentTypeOverridingRequestBody, b0Var);
            } else {
                this.headersBuilder.a("Content-Type", b0Var.toString());
            }
        }
        g0.a aVar4 = this.requestBuilder;
        aVar4.i(zVar);
        aVar4.d(this.headersBuilder.f());
        aVar4.e(this.method, contentTypeOverridingRequestBody);
        return aVar4;
    }

    /* access modifiers changed from: package-private */
    public void setBody(h0 h0Var) {
        this.body = h0Var;
    }

    /* access modifiers changed from: package-private */
    public void setRelativeUrl(Object obj) {
        this.relativeUrl = obj.toString();
    }

    /* access modifiers changed from: package-private */
    public void addPart(c0.b bVar) {
        this.multipartBuilder.d(bVar);
    }

    private static void canonicalizeForPath(Buffer buffer, String str, int i, int i2, boolean z) {
        Buffer buffer2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                    if (buffer2 == null) {
                        buffer2 = new Buffer();
                    }
                    buffer2.writeUtf8CodePoint(codePointAt);
                    while (!buffer2.exhausted()) {
                        byte readByte = buffer2.readByte() & 255;
                        buffer.writeByte(37);
                        buffer.writeByte((int) HEX_DIGITS[(readByte >> 4) & 15]);
                        buffer.writeByte((int) HEX_DIGITS[readByte & 15]);
                    }
                } else {
                    buffer.writeUtf8CodePoint(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }
}
