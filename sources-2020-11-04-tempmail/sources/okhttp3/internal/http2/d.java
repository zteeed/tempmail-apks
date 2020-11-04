package okhttp3.internal.http2;

import e.m0.e;
import java.io.IOException;
import okio.ByteString;

/* compiled from: Http2 */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    static final ByteString f14892a = ByteString.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f14893b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c  reason: collision with root package name */
    static final String[] f14894c = new String[64];

    /* renamed from: d  reason: collision with root package name */
    static final String[] f14895d = new String[256];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f14895d;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = e.p("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = f14894c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i3 = 0; i3 < 1; i3++) {
            int i4 = iArr[i3];
            f14894c[i4 | 8] = f14894c[i4] + "|PADDED";
        }
        String[] strArr3 = f14894c;
        strArr3[4] = "END_HEADERS";
        strArr3[32] = "PRIORITY";
        strArr3[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 < 1; i7++) {
                int i8 = iArr[i7];
                String[] strArr4 = f14894c;
                int i9 = i8 | i6;
                strArr4[i9] = f14894c[i8] + '|' + f14894c[i6];
                f14894c[i9 | 8] = f14894c[i8] + '|' + f14894c[i6] + "|PADDED";
            }
        }
        while (true) {
            String[] strArr5 = f14894c;
            if (i < strArr5.length) {
                if (strArr5[i] == null) {
                    strArr5[i] = f14895d[i];
                }
                i++;
            } else {
                return;
            }
        }
    }

    private d() {
    }

    static String a(byte b2, byte b3) {
        if (b3 == 0) {
            return "";
        }
        if (!(b2 == 2 || b2 == 3)) {
            if (b2 == 4 || b2 == 6) {
                if (b3 == 1) {
                    return "ACK";
                }
                return f14895d[b3];
            } else if (!(b2 == 7 || b2 == 8)) {
                String[] strArr = f14894c;
                String str = b3 < strArr.length ? strArr[b3] : f14895d[b3];
                if (b2 != 5 || (b3 & 4) == 0) {
                    return (b2 != 0 || (b3 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED");
                }
                return str.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return f14895d[b3];
    }

    static String b(boolean z, int i, int i2, byte b2, byte b3) {
        String[] strArr = f14893b;
        String p = b2 < strArr.length ? strArr[b2] : e.p("0x%02x", Byte.valueOf(b2));
        String a2 = a(b2, b3);
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = p;
        objArr[4] = a2;
        return e.p("%s 0x%08x %5d %-13s %s", objArr);
    }

    static IllegalArgumentException c(String str, Object... objArr) {
        throw new IllegalArgumentException(e.p(str, objArr));
    }

    static IOException d(String str, Object... objArr) throws IOException {
        throw new IOException(e.p(str, objArr));
    }
}
