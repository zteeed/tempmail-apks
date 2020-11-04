package com.google.android.gms.config.proto;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.e;
import com.google.protobuf.g;
import com.google.protobuf.i;
import com.google.protobuf.j;
import com.google.protobuf.n;
import com.google.protobuf.p;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
public final class Logs {

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    public static final class AndroidConfigFetchProto extends i<AndroidConfigFetchProto, Builder> implements AndroidConfigFetchProtoOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public static final AndroidConfigFetchProto f3183f;
        private static volatile p<AndroidConfigFetchProto> g;

        /* renamed from: d  reason: collision with root package name */
        private int f3184d;

        /* renamed from: e  reason: collision with root package name */
        private ConfigFetchReason f3185e;

        /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
        public static final class Builder extends i.b<AndroidConfigFetchProto, Builder> implements AndroidConfigFetchProtoOrBuilder {
            /* synthetic */ Builder(a aVar) {
                this();
            }

            private Builder() {
                super(AndroidConfigFetchProto.f3183f);
            }
        }

        static {
            AndroidConfigFetchProto androidConfigFetchProto = new AndroidConfigFetchProto();
            f3183f = androidConfigFetchProto;
            androidConfigFetchProto.q();
        }

        private AndroidConfigFetchProto() {
        }

        public static p<AndroidConfigFetchProto> C() {
            return f3183f.d();
        }

        /* access modifiers changed from: protected */
        public final Object i(i.C0109i iVar, Object obj, Object obj2) {
            switch (a.f3194a[iVar.ordinal()]) {
                case 1:
                    return new AndroidConfigFetchProto();
                case 2:
                    return f3183f;
                case 3:
                    return null;
                case 4:
                    return new Builder((a) null);
                case 5:
                    i.j jVar = (i.j) obj;
                    AndroidConfigFetchProto androidConfigFetchProto = (AndroidConfigFetchProto) obj2;
                    this.f3185e = (ConfigFetchReason) jVar.a(this.f3185e, androidConfigFetchProto.f3185e);
                    if (jVar == i.h.f11589a) {
                        this.f3184d |= androidConfigFetchProto.f3184d;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    g gVar = (g) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int z2 = eVar.z();
                            if (z2 != 0) {
                                if (z2 == 10) {
                                    ConfigFetchReason.Builder builder = (this.f3184d & 1) == 1 ? (ConfigFetchReason.Builder) this.f3185e.c() : null;
                                    ConfigFetchReason configFetchReason = (ConfigFetchReason) eVar.p(ConfigFetchReason.D(), gVar);
                                    this.f3185e = configFetchReason;
                                    if (builder != null) {
                                        builder.p(configFetchReason);
                                        this.f3185e = (ConfigFetchReason) builder.j();
                                    }
                                    this.f3184d |= 1;
                                } else if (!y(z2, eVar)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e2) {
                            e2.h(this);
                            throw new RuntimeException(e2);
                        } catch (IOException e3) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                            invalidProtocolBufferException.h(this);
                            throw new RuntimeException(invalidProtocolBufferException);
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (g == null) {
                        synchronized (AndroidConfigFetchProto.class) {
                            if (g == null) {
                                g = new i.c(f3183f);
                            }
                        }
                    }
                    return g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f3183f;
        }
    }

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    public interface AndroidConfigFetchProtoOrBuilder extends n {
    }

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    public static final class ConfigFetchReason extends i<ConfigFetchReason, Builder> implements ConfigFetchReasonOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public static final ConfigFetchReason f3186f;
        private static volatile p<ConfigFetchReason> g;

        /* renamed from: d  reason: collision with root package name */
        private int f3187d;

        /* renamed from: e  reason: collision with root package name */
        private int f3188e;

        /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
        public enum AndroidConfigFetchType implements j.a {
            UNKNOWN(0),
            SCHEDULED(1),
            BOOT_COMPLETED(2),
            PACKAGE_ADDED(3),
            PACKAGE_REMOVED(4),
            GMS_CORE_UPDATED(5),
            SECRET_CODE(6);

            private AndroidConfigFetchType(int i2) {
            }

            public static AndroidConfigFetchType f(int i2) {
                switch (i2) {
                    case 0:
                        return UNKNOWN;
                    case 1:
                        return SCHEDULED;
                    case 2:
                        return BOOT_COMPLETED;
                    case 3:
                        return PACKAGE_ADDED;
                    case 4:
                        return PACKAGE_REMOVED;
                    case 5:
                        return GMS_CORE_UPDATED;
                    case 6:
                        return SECRET_CODE;
                    default:
                        return null;
                }
            }
        }

        /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
        public static final class Builder extends i.b<ConfigFetchReason, Builder> implements ConfigFetchReasonOrBuilder {
            /* synthetic */ Builder(a aVar) {
                this();
            }

            private Builder() {
                super(ConfigFetchReason.f3186f);
            }
        }

        static {
            ConfigFetchReason configFetchReason = new ConfigFetchReason();
            f3186f = configFetchReason;
            configFetchReason.q();
        }

        private ConfigFetchReason() {
        }

        public static p<ConfigFetchReason> D() {
            return f3186f.d();
        }

        public boolean C() {
            return (this.f3187d & 1) == 1;
        }

        /* access modifiers changed from: protected */
        public final Object i(i.C0109i iVar, Object obj, Object obj2) {
            switch (a.f3194a[iVar.ordinal()]) {
                case 1:
                    return new ConfigFetchReason();
                case 2:
                    return f3186f;
                case 3:
                    return null;
                case 4:
                    return new Builder((a) null);
                case 5:
                    i.j jVar = (i.j) obj;
                    ConfigFetchReason configFetchReason = (ConfigFetchReason) obj2;
                    this.f3188e = jVar.c(C(), this.f3188e, configFetchReason.C(), configFetchReason.f3188e);
                    if (jVar == i.h.f11589a) {
                        this.f3187d |= configFetchReason.f3187d;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    g gVar = (g) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int z2 = eVar.z();
                            if (z2 != 0) {
                                if (z2 == 8) {
                                    int k = eVar.k();
                                    if (AndroidConfigFetchType.f(k) == null) {
                                        super.r(1, k);
                                    } else {
                                        this.f3187d = 1 | this.f3187d;
                                        this.f3188e = k;
                                    }
                                } else if (!y(z2, eVar)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e2) {
                            e2.h(this);
                            throw new RuntimeException(e2);
                        } catch (IOException e3) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                            invalidProtocolBufferException.h(this);
                            throw new RuntimeException(invalidProtocolBufferException);
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (g == null) {
                        synchronized (ConfigFetchReason.class) {
                            if (g == null) {
                                g = new i.c(f3186f);
                            }
                        }
                    }
                    return g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f3186f;
        }
    }

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    public interface ConfigFetchReasonOrBuilder extends n {
    }

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3194a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.i$i[] r0 = com.google.protobuf.i.C0109i.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3194a = r0
                com.google.protobuf.i$i r1 = com.google.protobuf.i.C0109i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3194a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.i$i r1 = com.google.protobuf.i.C0109i.IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3194a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.i$i r1 = com.google.protobuf.i.C0109i.MAKE_IMMUTABLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3194a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.i$i r1 = com.google.protobuf.i.C0109i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f3194a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.i$i r1 = com.google.protobuf.i.C0109i.VISIT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f3194a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.i$i r1 = com.google.protobuf.i.C0109i.MERGE_FROM_STREAM     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f3194a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.i$i r1 = com.google.protobuf.i.C0109i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f3194a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.i$i r1 = com.google.protobuf.i.C0109i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.config.proto.Logs.a.<clinit>():void");
        }
    }

    private Logs() {
    }
}
