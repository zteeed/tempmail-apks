package com.google.protobuf;

import com.google.protobuf.h.b;
import com.google.protobuf.k;
import com.google.protobuf.m;
import com.google.protobuf.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: FieldSet */
final class h<FieldDescriptorType extends b<FieldDescriptorType>> {

    /* renamed from: a  reason: collision with root package name */
    private final r<FieldDescriptorType, Object> f11572a = r.o(16);

    /* renamed from: b  reason: collision with root package name */
    private boolean f11573b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11574c = false;

    /* compiled from: FieldSet */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11575a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f11576b;

        /* JADX WARNING: Can't wrap try/catch for region: R(55:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0107 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0111 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x011b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x012f */
        static {
            /*
                com.google.protobuf.w$b[] r0 = com.google.protobuf.w.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11576b = r0
                r1 = 1
                com.google.protobuf.w$b r2 = com.google.protobuf.w.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f11576b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.w$b r3 = com.google.protobuf.w.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f11576b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.w$b r4 = com.google.protobuf.w.b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f11576b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.w$b r5 = com.google.protobuf.w.b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f11576b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.w$b r6 = com.google.protobuf.w.b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f11576b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.w$b r7 = com.google.protobuf.w.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f11576b     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.w$b r8 = com.google.protobuf.w.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f11576b     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.w$b r9 = com.google.protobuf.w.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f11576b     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.w$b r10 = com.google.protobuf.w.b.GROUP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r9 = f11576b     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.w$b r10 = com.google.protobuf.w.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r9 = f11576b     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.w$b r10 = com.google.protobuf.w.b.STRING     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r9 = f11576b     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.w$b r10 = com.google.protobuf.w.b.BYTES     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r9 = f11576b     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.w$b r10 = com.google.protobuf.w.b.UINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r9 = f11576b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.w$b r10 = com.google.protobuf.w.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r9 = f11576b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.w$b r10 = com.google.protobuf.w.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r9 = f11576b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.w$b r10 = com.google.protobuf.w.b.SINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r9 = f11576b     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.w$b r10 = com.google.protobuf.w.b.SINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r9 = f11576b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.google.protobuf.w$b r10 = com.google.protobuf.w.b.ENUM     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                com.google.protobuf.w$c[] r9 = com.google.protobuf.w.c.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                f11575a = r9
                com.google.protobuf.w$c r10 = com.google.protobuf.w.c.INT     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r1 = f11575a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                com.google.protobuf.w$c r9 = com.google.protobuf.w.c.LONG     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r1[r9] = r0     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r0 = f11575a     // Catch:{ NoSuchFieldError -> 0x00fd }
                com.google.protobuf.w$c r1 = com.google.protobuf.w.c.FLOAT     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = f11575a     // Catch:{ NoSuchFieldError -> 0x0107 }
                com.google.protobuf.w$c r1 = com.google.protobuf.w.c.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = f11575a     // Catch:{ NoSuchFieldError -> 0x0111 }
                com.google.protobuf.w$c r1 = com.google.protobuf.w.c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                int[] r0 = f11575a     // Catch:{ NoSuchFieldError -> 0x011b }
                com.google.protobuf.w$c r1 = com.google.protobuf.w.c.STRING     // Catch:{ NoSuchFieldError -> 0x011b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011b }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x011b }
            L_0x011b:
                int[] r0 = f11575a     // Catch:{ NoSuchFieldError -> 0x0125 }
                com.google.protobuf.w$c r1 = com.google.protobuf.w.c.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = f11575a     // Catch:{ NoSuchFieldError -> 0x012f }
                com.google.protobuf.w$c r1 = com.google.protobuf.w.c.ENUM     // Catch:{ NoSuchFieldError -> 0x012f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                int[] r0 = f11575a     // Catch:{ NoSuchFieldError -> 0x0139 }
                com.google.protobuf.w$c r1 = com.google.protobuf.w.c.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.h.a.<clinit>():void");
        }
    }

    /* compiled from: FieldSet */
    public interface b<T extends b<T>> extends Comparable<T> {
        w.c P();

        boolean l();

        w.b s();

        m.a y(m.a aVar, m mVar);
    }

    static {
        new h(true);
    }

    private h() {
    }

    private Object b(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private void h(Map.Entry<FieldDescriptorType, Object> entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof k) {
            value = ((k) value).d();
        }
        if (bVar.l()) {
            Object c2 = c(bVar);
            if (c2 == null) {
                c2 = new ArrayList();
            }
            for (Object b2 : (List) value) {
                ((List) c2).add(b(b2));
            }
            this.f11572a.put(bVar, c2);
        } else if (bVar.P() == w.c.MESSAGE) {
            Object c3 = c(bVar);
            if (c3 == null) {
                this.f11572a.put(bVar, b(value));
                return;
            }
            this.f11572a.put(bVar, bVar.y(((m) c3).c(), (m) value).h());
        } else {
            this.f11572a.put(bVar, b(value));
        }
    }

    public static <T extends b<T>> h<T> i() {
        return new h<>();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        if ((r3 instanceof com.google.protobuf.j.a) == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if ((r3 instanceof com.google.protobuf.k) == false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void k(com.google.protobuf.w.b r2, java.lang.Object r3) {
        /*
            if (r3 == 0) goto L_0x004e
            int[] r0 = com.google.protobuf.h.a.f11575a
            com.google.protobuf.w$c r2 = r2.f()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0041;
                case 2: goto L_0x003e;
                case 3: goto L_0x003b;
                case 4: goto L_0x0038;
                case 5: goto L_0x0035;
                case 6: goto L_0x0032;
                case 7: goto L_0x0026;
                case 8: goto L_0x001d;
                case 9: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0043
        L_0x0014:
            boolean r2 = r3 instanceof com.google.protobuf.m
            if (r2 != 0) goto L_0x0030
            boolean r2 = r3 instanceof com.google.protobuf.k
            if (r2 == 0) goto L_0x002f
            goto L_0x0030
        L_0x001d:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0030
            boolean r2 = r3 instanceof com.google.protobuf.j.a
            if (r2 == 0) goto L_0x002f
            goto L_0x0030
        L_0x0026:
            boolean r2 = r3 instanceof com.google.protobuf.d
            if (r2 != 0) goto L_0x0030
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            r1 = r0
            goto L_0x0043
        L_0x0032:
            boolean r1 = r3 instanceof java.lang.String
            goto L_0x0043
        L_0x0035:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L_0x0043
        L_0x0038:
            boolean r1 = r3 instanceof java.lang.Double
            goto L_0x0043
        L_0x003b:
            boolean r1 = r3 instanceof java.lang.Float
            goto L_0x0043
        L_0x003e:
            boolean r1 = r3 instanceof java.lang.Long
            goto L_0x0043
        L_0x0041:
            boolean r1 = r3 instanceof java.lang.Integer
        L_0x0043:
            if (r1 == 0) goto L_0x0046
            return
        L_0x0046:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        L_0x004e:
            r2 = 0
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.h.k(com.google.protobuf.w$b, java.lang.Object):void");
    }

    /* renamed from: a */
    public h<FieldDescriptorType> clone() {
        h<FieldDescriptorType> i = i();
        for (int i2 = 0; i2 < this.f11572a.i(); i2++) {
            Map.Entry<FieldDescriptorType, Object> h = this.f11572a.h(i2);
            i.j((b) h.getKey(), h.getValue());
        }
        for (Map.Entry next : this.f11572a.k()) {
            i.j((b) next.getKey(), next.getValue());
        }
        i.f11574c = this.f11574c;
        return i;
    }

    public Object c(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f11572a.get(fielddescriptortype);
        return obj instanceof k ? ((k) obj).d() : obj;
    }

    public boolean d() {
        return this.f11573b;
    }

    public Iterator<Map.Entry<FieldDescriptorType, Object>> e() {
        if (this.f11574c) {
            return new k.c(this.f11572a.entrySet().iterator());
        }
        return this.f11572a.entrySet().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return this.f11572a.equals(((h) obj).f11572a);
    }

    public void f() {
        if (!this.f11573b) {
            this.f11572a.n();
            this.f11573b = true;
        }
    }

    public void g(h<FieldDescriptorType> hVar) {
        for (int i = 0; i < hVar.f11572a.i(); i++) {
            h(hVar.f11572a.h(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> h : hVar.f11572a.k()) {
            h(h);
        }
    }

    public int hashCode() {
        return this.f11572a.hashCode();
    }

    public void j(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.l()) {
            k(fielddescriptortype.s(), obj);
        } else if (obj instanceof List) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.addAll((List) obj);
            for (Object k : arrayList) {
                k(fielddescriptortype.s(), k);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof k) {
            this.f11574c = true;
        }
        this.f11572a.put(fielddescriptortype, obj);
    }

    private h(boolean z) {
        f();
    }
}
