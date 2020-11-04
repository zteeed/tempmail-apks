package com.google.android.gms.config.proto;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.config.proto.Logs;
import com.google.firebase.crashlytics.internal.proto.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d;
import com.google.protobuf.e;
import com.google.protobuf.g;
import com.google.protobuf.i;
import com.google.protobuf.j;
import com.google.protobuf.n;
import com.google.protobuf.p;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
public final class Config {

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    public static final class AppConfigTable extends i<AppConfigTable, Builder> implements AppConfigTableOrBuilder {
        /* access modifiers changed from: private */
        public static final AppConfigTable h;
        private static volatile p<AppConfigTable> i;

        /* renamed from: d  reason: collision with root package name */
        private int f3150d;

        /* renamed from: e  reason: collision with root package name */
        private String f3151e = "";

        /* renamed from: f  reason: collision with root package name */
        private j.b<AppNamespaceConfigTable> f3152f = i.j();
        private j.b<d> g = i.j();

        /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
        public static final class Builder extends i.b<AppConfigTable, Builder> implements AppConfigTableOrBuilder {
            /* synthetic */ Builder(a aVar) {
                this();
            }

            private Builder() {
                super(AppConfigTable.h);
            }
        }

        static {
            AppConfigTable appConfigTable = new AppConfigTable();
            h = appConfigTable;
            appConfigTable.q();
        }

        private AppConfigTable() {
        }

        public static p<AppConfigTable> D() {
            return h.d();
        }

        public boolean C() {
            return (this.f3150d & 1) == 1;
        }

        /* access modifiers changed from: protected */
        public final Object i(i.C0109i iVar, Object obj, Object obj2) {
            switch (a.f3182a[iVar.ordinal()]) {
                case 1:
                    return new AppConfigTable();
                case 2:
                    return h;
                case 3:
                    this.f3152f.o();
                    this.g.o();
                    return null;
                case 4:
                    return new Builder((a) null);
                case 5:
                    i.j jVar = (i.j) obj;
                    AppConfigTable appConfigTable = (AppConfigTable) obj2;
                    this.f3151e = jVar.e(C(), this.f3151e, appConfigTable.C(), appConfigTable.f3151e);
                    this.f3152f = jVar.f(this.f3152f, appConfigTable.f3152f);
                    this.g = jVar.f(this.g, appConfigTable.g);
                    if (jVar == i.h.f11589a) {
                        this.f3150d |= appConfigTable.f3150d;
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
                                    String x = eVar.x();
                                    this.f3150d = 1 | this.f3150d;
                                    this.f3151e = x;
                                } else if (z2 == 18) {
                                    if (!this.f3152f.R()) {
                                        this.f3152f = i.s(this.f3152f);
                                    }
                                    this.f3152f.add((AppNamespaceConfigTable) eVar.p(AppNamespaceConfigTable.F(), gVar));
                                } else if (z2 == 26) {
                                    if (!this.g.R()) {
                                        this.g = i.s(this.g);
                                    }
                                    this.g.add(eVar.j());
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
                    if (i == null) {
                        synchronized (AppConfigTable.class) {
                            if (i == null) {
                                i = new i.c(h);
                            }
                        }
                    }
                    return i;
                default:
                    throw new UnsupportedOperationException();
            }
            return h;
        }
    }

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    public interface AppConfigTableOrBuilder extends n {
    }

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    public static final class AppNamespaceConfigTable extends i<AppNamespaceConfigTable, Builder> implements AppNamespaceConfigTableOrBuilder {
        /* access modifiers changed from: private */
        public static final AppNamespaceConfigTable i;
        private static volatile p<AppNamespaceConfigTable> j;

        /* renamed from: d  reason: collision with root package name */
        private int f3153d;

        /* renamed from: e  reason: collision with root package name */
        private String f3154e = "";

        /* renamed from: f  reason: collision with root package name */
        private String f3155f = "";
        private j.b<KeyValue> g = i.j();
        private int h;

        /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
        public static final class Builder extends i.b<AppNamespaceConfigTable, Builder> implements AppNamespaceConfigTableOrBuilder {
            /* synthetic */ Builder(a aVar) {
                this();
            }

            private Builder() {
                super(AppNamespaceConfigTable.i);
            }
        }

        /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
        public enum NamespaceStatus implements j.a {
            UPDATE(0),
            NO_TEMPLATE(1),
            NO_CHANGE(2),
            EMPTY_CONFIG(3),
            NOT_AUTHORIZED(4);

            private NamespaceStatus(int i) {
            }

            public static NamespaceStatus f(int i) {
                if (i == 0) {
                    return UPDATE;
                }
                if (i == 1) {
                    return NO_TEMPLATE;
                }
                if (i == 2) {
                    return NO_CHANGE;
                }
                if (i == 3) {
                    return EMPTY_CONFIG;
                }
                if (i != 4) {
                    return null;
                }
                return NOT_AUTHORIZED;
            }
        }

        static {
            AppNamespaceConfigTable appNamespaceConfigTable = new AppNamespaceConfigTable();
            i = appNamespaceConfigTable;
            appNamespaceConfigTable.q();
        }

        private AppNamespaceConfigTable() {
        }

        public static p<AppNamespaceConfigTable> F() {
            return i.d();
        }

        public boolean C() {
            return (this.f3153d & 2) == 2;
        }

        public boolean D() {
            return (this.f3153d & 1) == 1;
        }

        public boolean E() {
            return (this.f3153d & 4) == 4;
        }

        /* access modifiers changed from: protected */
        public final Object i(i.C0109i iVar, Object obj, Object obj2) {
            switch (a.f3182a[iVar.ordinal()]) {
                case 1:
                    return new AppNamespaceConfigTable();
                case 2:
                    return i;
                case 3:
                    this.g.o();
                    return null;
                case 4:
                    return new Builder((a) null);
                case 5:
                    i.j jVar = (i.j) obj;
                    AppNamespaceConfigTable appNamespaceConfigTable = (AppNamespaceConfigTable) obj2;
                    this.f3154e = jVar.e(D(), this.f3154e, appNamespaceConfigTable.D(), appNamespaceConfigTable.f3154e);
                    this.f3155f = jVar.e(C(), this.f3155f, appNamespaceConfigTable.C(), appNamespaceConfigTable.f3155f);
                    this.g = jVar.f(this.g, appNamespaceConfigTable.g);
                    this.h = jVar.c(E(), this.h, appNamespaceConfigTable.E(), appNamespaceConfigTable.h);
                    if (jVar == i.h.f11589a) {
                        this.f3153d |= appNamespaceConfigTable.f3153d;
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
                                    String x = eVar.x();
                                    this.f3153d = 1 | this.f3153d;
                                    this.f3154e = x;
                                } else if (z2 == 18) {
                                    String x2 = eVar.x();
                                    this.f3153d |= 2;
                                    this.f3155f = x2;
                                } else if (z2 == 26) {
                                    if (!this.g.R()) {
                                        this.g = i.s(this.g);
                                    }
                                    this.g.add((KeyValue) eVar.p(KeyValue.E(), gVar));
                                } else if (z2 == 32) {
                                    int k = eVar.k();
                                    if (NamespaceStatus.f(k) == null) {
                                        super.r(4, k);
                                    } else {
                                        this.f3153d |= 4;
                                        this.h = k;
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
                    if (j == null) {
                        synchronized (AppNamespaceConfigTable.class) {
                            if (j == null) {
                                j = new i.c(i);
                            }
                        }
                    }
                    return j;
                default:
                    throw new UnsupportedOperationException();
            }
            return i;
        }
    }

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    public interface AppNamespaceConfigTableOrBuilder extends n {
    }

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    public static final class ConfigFetchRequest extends i<ConfigFetchRequest, Builder> implements ConfigFetchRequestOrBuilder {
        /* access modifiers changed from: private */
        public static final ConfigFetchRequest s;
        private static volatile p<ConfigFetchRequest> t;

        /* renamed from: d  reason: collision with root package name */
        private int f3161d;

        /* renamed from: e  reason: collision with root package name */
        private Logs.AndroidConfigFetchProto f3162e;

        /* renamed from: f  reason: collision with root package name */
        private long f3163f;
        private j.b<PackageData> g = i.j();
        private String h = "";
        private long i;
        private int j;
        private int k;
        private int l;
        private String m = "";
        private String n = "";
        private int o;
        private int p;
        private String q = "";
        private String r = "";

        /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
        public static final class Builder extends i.b<ConfigFetchRequest, Builder> implements ConfigFetchRequestOrBuilder {
            /* synthetic */ Builder(a aVar) {
                this();
            }

            private Builder() {
                super(ConfigFetchRequest.s);
            }
        }

        static {
            ConfigFetchRequest configFetchRequest = new ConfigFetchRequest();
            s = configFetchRequest;
            configFetchRequest.q();
        }

        private ConfigFetchRequest() {
        }

        public boolean C() {
            return (this.f3161d & 2) == 2;
        }

        public boolean D() {
            return (this.f3161d & 64) == 64;
        }

        public boolean E() {
            return (this.f3161d & 16) == 16;
        }

        public boolean F() {
            return (this.f3161d & 128) == 128;
        }

        public boolean H() {
            return (this.f3161d & 4) == 4;
        }

        public boolean I() {
            return (this.f3161d & 256) == 256;
        }

        public boolean J() {
            return (this.f3161d & 1024) == 1024;
        }

        public boolean K() {
            return (this.f3161d & CodedOutputStream.DEFAULT_BUFFER_SIZE) == 4096;
        }

        public boolean L() {
            return (this.f3161d & AdRequest.MAX_CONTENT_URL_LENGTH) == 512;
        }

        public boolean M() {
            return (this.f3161d & 32) == 32;
        }

        public boolean N() {
            return (this.f3161d & 2048) == 2048;
        }

        public boolean O() {
            return (this.f3161d & 8) == 8;
        }

        /* access modifiers changed from: protected */
        public final Object i(i.C0109i iVar, Object obj, Object obj2) {
            switch (a.f3182a[iVar.ordinal()]) {
                case 1:
                    return new ConfigFetchRequest();
                case 2:
                    return s;
                case 3:
                    this.g.o();
                    return null;
                case 4:
                    return new Builder((a) null);
                case 5:
                    i.j jVar = (i.j) obj;
                    ConfigFetchRequest configFetchRequest = (ConfigFetchRequest) obj2;
                    this.f3162e = (Logs.AndroidConfigFetchProto) jVar.a(this.f3162e, configFetchRequest.f3162e);
                    this.f3163f = jVar.i(C(), this.f3163f, configFetchRequest.C(), configFetchRequest.f3163f);
                    this.g = jVar.f(this.g, configFetchRequest.g);
                    this.h = jVar.e(H(), this.h, configFetchRequest.H(), configFetchRequest.h);
                    this.i = jVar.i(O(), this.i, configFetchRequest.O(), configFetchRequest.i);
                    this.j = jVar.c(E(), this.j, configFetchRequest.E(), configFetchRequest.j);
                    this.k = jVar.c(M(), this.k, configFetchRequest.M(), configFetchRequest.k);
                    this.l = jVar.c(D(), this.l, configFetchRequest.D(), configFetchRequest.l);
                    this.m = jVar.e(F(), this.m, configFetchRequest.F(), configFetchRequest.m);
                    this.n = jVar.e(I(), this.n, configFetchRequest.I(), configFetchRequest.n);
                    this.o = jVar.c(L(), this.o, configFetchRequest.L(), configFetchRequest.o);
                    this.p = jVar.c(J(), this.p, configFetchRequest.J(), configFetchRequest.p);
                    this.q = jVar.e(N(), this.q, configFetchRequest.N(), configFetchRequest.q);
                    this.r = jVar.e(K(), this.r, configFetchRequest.K(), configFetchRequest.r);
                    if (jVar == i.h.f11589a) {
                        this.f3161d |= configFetchRequest.f3161d;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    g gVar = (g) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int z2 = eVar.z();
                            switch (z2) {
                                case 0:
                                    z = true;
                                    break;
                                case 9:
                                    this.f3161d |= 2;
                                    this.f3163f = eVar.m();
                                    break;
                                case 18:
                                    if (!this.g.R()) {
                                        this.g = i.s(this.g);
                                    }
                                    this.g.add((PackageData) eVar.p(PackageData.T(), gVar));
                                    break;
                                case 26:
                                    String x = eVar.x();
                                    this.f3161d |= 4;
                                    this.h = x;
                                    break;
                                case 33:
                                    this.f3161d |= 8;
                                    this.i = eVar.m();
                                    break;
                                case 42:
                                    Logs.AndroidConfigFetchProto.Builder builder = (this.f3161d & 1) == 1 ? (Logs.AndroidConfigFetchProto.Builder) this.f3162e.c() : null;
                                    Logs.AndroidConfigFetchProto androidConfigFetchProto = (Logs.AndroidConfigFetchProto) eVar.p(Logs.AndroidConfigFetchProto.C(), gVar);
                                    this.f3162e = androidConfigFetchProto;
                                    if (builder != null) {
                                        builder.p(androidConfigFetchProto);
                                        this.f3162e = (Logs.AndroidConfigFetchProto) builder.j();
                                    }
                                    this.f3161d |= 1;
                                    break;
                                case 48:
                                    this.f3161d |= 16;
                                    this.j = eVar.n();
                                    break;
                                case 56:
                                    this.f3161d |= 32;
                                    this.k = eVar.n();
                                    break;
                                case 64:
                                    this.f3161d |= 64;
                                    this.l = eVar.n();
                                    break;
                                case 74:
                                    String x2 = eVar.x();
                                    this.f3161d |= 128;
                                    this.m = x2;
                                    break;
                                case 82:
                                    String x3 = eVar.x();
                                    this.f3161d |= 256;
                                    this.n = x3;
                                    break;
                                case 88:
                                    this.f3161d |= AdRequest.MAX_CONTENT_URL_LENGTH;
                                    this.o = eVar.n();
                                    break;
                                case 96:
                                    this.f3161d |= 1024;
                                    this.p = eVar.n();
                                    break;
                                case 106:
                                    String x4 = eVar.x();
                                    this.f3161d |= 2048;
                                    this.q = x4;
                                    break;
                                case 114:
                                    String x5 = eVar.x();
                                    this.f3161d |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
                                    this.r = x5;
                                    break;
                                default:
                                    if (y(z2, eVar)) {
                                        break;
                                    }
                                    z = true;
                                    break;
                            }
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
                    if (t == null) {
                        synchronized (ConfigFetchRequest.class) {
                            if (t == null) {
                                t = new i.c(s);
                            }
                        }
                    }
                    return t;
                default:
                    throw new UnsupportedOperationException();
            }
            return s;
        }
    }

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    public interface ConfigFetchRequestOrBuilder extends n {
    }

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    public static final class ConfigFetchResponse extends i<ConfigFetchResponse, Builder> implements ConfigFetchResponseOrBuilder {
        /* access modifiers changed from: private */
        public static final ConfigFetchResponse i;
        private static volatile p<ConfigFetchResponse> j;

        /* renamed from: d  reason: collision with root package name */
        private int f3164d;

        /* renamed from: e  reason: collision with root package name */
        private j.b<PackageTable> f3165e = i.j();

        /* renamed from: f  reason: collision with root package name */
        private int f3166f;
        private j.b<KeyValue> g = i.j();
        private j.b<AppConfigTable> h = i.j();

        /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
        public static final class Builder extends i.b<ConfigFetchResponse, Builder> implements ConfigFetchResponseOrBuilder {
            /* synthetic */ Builder(a aVar) {
                this();
            }

            private Builder() {
                super(ConfigFetchResponse.i);
            }
        }

        /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
        public enum ResponseStatus implements j.a {
            SUCCESS(0),
            NO_PACKAGES_IN_REQUEST(1);

            private ResponseStatus(int i) {
            }

            public static ResponseStatus f(int i) {
                if (i == 0) {
                    return SUCCESS;
                }
                if (i != 1) {
                    return null;
                }
                return NO_PACKAGES_IN_REQUEST;
            }
        }

        static {
            ConfigFetchResponse configFetchResponse = new ConfigFetchResponse();
            i = configFetchResponse;
            configFetchResponse.q();
        }

        private ConfigFetchResponse() {
        }

        public boolean C() {
            return (this.f3164d & 1) == 1;
        }

        /* access modifiers changed from: protected */
        public final Object i(i.C0109i iVar, Object obj, Object obj2) {
            switch (a.f3182a[iVar.ordinal()]) {
                case 1:
                    return new ConfigFetchResponse();
                case 2:
                    return i;
                case 3:
                    this.f3165e.o();
                    this.g.o();
                    this.h.o();
                    return null;
                case 4:
                    return new Builder((a) null);
                case 5:
                    i.j jVar = (i.j) obj;
                    ConfigFetchResponse configFetchResponse = (ConfigFetchResponse) obj2;
                    this.f3165e = jVar.f(this.f3165e, configFetchResponse.f3165e);
                    this.f3166f = jVar.c(C(), this.f3166f, configFetchResponse.C(), configFetchResponse.f3166f);
                    this.g = jVar.f(this.g, configFetchResponse.g);
                    this.h = jVar.f(this.h, configFetchResponse.h);
                    if (jVar == i.h.f11589a) {
                        this.f3164d |= configFetchResponse.f3164d;
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
                                    if (!this.f3165e.R()) {
                                        this.f3165e = i.s(this.f3165e);
                                    }
                                    this.f3165e.add((PackageTable) eVar.p(PackageTable.E(), gVar));
                                } else if (z2 == 16) {
                                    int k = eVar.k();
                                    if (ResponseStatus.f(k) == null) {
                                        super.r(2, k);
                                    } else {
                                        this.f3164d = 1 | this.f3164d;
                                        this.f3166f = k;
                                    }
                                } else if (z2 == 26) {
                                    if (!this.g.R()) {
                                        this.g = i.s(this.g);
                                    }
                                    this.g.add((KeyValue) eVar.p(KeyValue.E(), gVar));
                                } else if (z2 == 34) {
                                    if (!this.h.R()) {
                                        this.h = i.s(this.h);
                                    }
                                    this.h.add((AppConfigTable) eVar.p(AppConfigTable.D(), gVar));
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
                    if (j == null) {
                        synchronized (ConfigFetchResponse.class) {
                            if (j == null) {
                                j = new i.c(i);
                            }
                        }
                    }
                    return j;
                default:
                    throw new UnsupportedOperationException();
            }
            return i;
        }
    }

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    public interface ConfigFetchResponseOrBuilder extends n {
    }

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    public static final class KeyValue extends i<KeyValue, Builder> implements KeyValueOrBuilder {
        /* access modifiers changed from: private */
        public static final KeyValue g;
        private static volatile p<KeyValue> h;

        /* renamed from: d  reason: collision with root package name */
        private int f3170d;

        /* renamed from: e  reason: collision with root package name */
        private String f3171e = "";

        /* renamed from: f  reason: collision with root package name */
        private d f3172f = d.f11556c;

        /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
        public static final class Builder extends i.b<KeyValue, Builder> implements KeyValueOrBuilder {
            /* synthetic */ Builder(a aVar) {
                this();
            }

            private Builder() {
                super(KeyValue.g);
            }
        }

        static {
            KeyValue keyValue = new KeyValue();
            g = keyValue;
            keyValue.q();
        }

        private KeyValue() {
        }

        public static p<KeyValue> E() {
            return g.d();
        }

        public boolean C() {
            return (this.f3170d & 1) == 1;
        }

        public boolean D() {
            return (this.f3170d & 2) == 2;
        }

        /* access modifiers changed from: protected */
        public final Object i(i.C0109i iVar, Object obj, Object obj2) {
            switch (a.f3182a[iVar.ordinal()]) {
                case 1:
                    return new KeyValue();
                case 2:
                    return g;
                case 3:
                    return null;
                case 4:
                    return new Builder((a) null);
                case 5:
                    i.j jVar = (i.j) obj;
                    KeyValue keyValue = (KeyValue) obj2;
                    this.f3171e = jVar.e(C(), this.f3171e, keyValue.C(), keyValue.f3171e);
                    this.f3172f = jVar.h(D(), this.f3172f, keyValue.D(), keyValue.f3172f);
                    if (jVar == i.h.f11589a) {
                        this.f3170d |= keyValue.f3170d;
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
                                    String x = eVar.x();
                                    this.f3170d = 1 | this.f3170d;
                                    this.f3171e = x;
                                } else if (z2 == 18) {
                                    this.f3170d |= 2;
                                    this.f3172f = eVar.j();
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
                    if (h == null) {
                        synchronized (KeyValue.class) {
                            if (h == null) {
                                h = new i.c(g);
                            }
                        }
                    }
                    return h;
                default:
                    throw new UnsupportedOperationException();
            }
            return g;
        }
    }

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    public interface KeyValueOrBuilder extends n {
    }

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    public static final class NamedValue extends i<NamedValue, Builder> implements NamedValueOrBuilder {
        /* access modifiers changed from: private */
        public static final NamedValue g;
        private static volatile p<NamedValue> h;

        /* renamed from: d  reason: collision with root package name */
        private int f3173d;

        /* renamed from: e  reason: collision with root package name */
        private String f3174e = "";

        /* renamed from: f  reason: collision with root package name */
        private String f3175f = "";

        /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
        public static final class Builder extends i.b<NamedValue, Builder> implements NamedValueOrBuilder {
            /* synthetic */ Builder(a aVar) {
                this();
            }

            private Builder() {
                super(NamedValue.g);
            }
        }

        static {
            NamedValue namedValue = new NamedValue();
            g = namedValue;
            namedValue.q();
        }

        private NamedValue() {
        }

        public static p<NamedValue> E() {
            return g.d();
        }

        public boolean C() {
            return (this.f3173d & 1) == 1;
        }

        public boolean D() {
            return (this.f3173d & 2) == 2;
        }

        /* access modifiers changed from: protected */
        public final Object i(i.C0109i iVar, Object obj, Object obj2) {
            switch (a.f3182a[iVar.ordinal()]) {
                case 1:
                    return new NamedValue();
                case 2:
                    return g;
                case 3:
                    return null;
                case 4:
                    return new Builder((a) null);
                case 5:
                    i.j jVar = (i.j) obj;
                    NamedValue namedValue = (NamedValue) obj2;
                    this.f3174e = jVar.e(C(), this.f3174e, namedValue.C(), namedValue.f3174e);
                    this.f3175f = jVar.e(D(), this.f3175f, namedValue.D(), namedValue.f3175f);
                    if (jVar == i.h.f11589a) {
                        this.f3173d |= namedValue.f3173d;
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
                                    String x = eVar.x();
                                    this.f3173d = 1 | this.f3173d;
                                    this.f3174e = x;
                                } else if (z2 == 18) {
                                    String x2 = eVar.x();
                                    this.f3173d |= 2;
                                    this.f3175f = x2;
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
                    if (h == null) {
                        synchronized (NamedValue.class) {
                            if (h == null) {
                                h = new i.c(g);
                            }
                        }
                    }
                    return h;
                default:
                    throw new UnsupportedOperationException();
            }
            return g;
        }
    }

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    public interface NamedValueOrBuilder extends n {
    }

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    public static final class PackageData extends i<PackageData, Builder> implements PackageDataOrBuilder {
        /* access modifiers changed from: private */
        public static final PackageData y;
        private static volatile p<PackageData> z;

        /* renamed from: d  reason: collision with root package name */
        private int f3176d;

        /* renamed from: e  reason: collision with root package name */
        private int f3177e;

        /* renamed from: f  reason: collision with root package name */
        private d f3178f;
        private d g;
        private String h = "";
        private String i = "";
        private String j = "";
        private String k = "";
        private j.b<NamedValue> l = i.j();
        private j.b<NamedValue> m = i.j();
        private d n = d.f11556c;
        private int o;
        private String p = "";
        private String q = "";
        private String r = "";
        private j.b<String> s = i.j();
        private int t;
        private j.b<NamedValue> u = i.j();
        private int v;
        private int w;
        private int x;

        /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
        public static final class Builder extends i.b<PackageData, Builder> implements PackageDataOrBuilder {
            /* synthetic */ Builder(a aVar) {
                this();
            }

            private Builder() {
                super(PackageData.y);
            }
        }

        static {
            PackageData packageData = new PackageData();
            y = packageData;
            packageData.q();
        }

        private PackageData() {
            d dVar = d.f11556c;
            this.f3178f = dVar;
            this.g = dVar;
        }

        public static p<PackageData> T() {
            return y.d();
        }

        public boolean C() {
            return (this.f3176d & 32768) == 32768;
        }

        public boolean D() {
            return (this.f3176d & 128) == 128;
        }

        public boolean E() {
            return (this.f3176d & 1024) == 1024;
        }

        public boolean F() {
            return (this.f3176d & 2048) == 2048;
        }

        public boolean H() {
            return (this.f3176d & AdRequest.MAX_CONTENT_URL_LENGTH) == 512;
        }

        public boolean I() {
            return (this.f3176d & 256) == 256;
        }

        public boolean J() {
            return (this.f3176d & 4) == 4;
        }

        public boolean K() {
            return (this.f3176d & 8) == 8;
        }

        public boolean L() {
            return (this.f3176d & 2) == 2;
        }

        public boolean M() {
            return (this.f3176d & 16384) == 16384;
        }

        public boolean N() {
            return (this.f3176d & 64) == 64;
        }

        public boolean O() {
            return (this.f3176d & 32) == 32;
        }

        public boolean P() {
            return (this.f3176d & 16) == 16;
        }

        public boolean Q() {
            return (this.f3176d & 8192) == 8192;
        }

        public boolean R() {
            return (this.f3176d & CodedOutputStream.DEFAULT_BUFFER_SIZE) == 4096;
        }

        public boolean S() {
            return (this.f3176d & 1) == 1;
        }

        /* access modifiers changed from: protected */
        public final Object i(i.C0109i iVar, Object obj, Object obj2) {
            switch (a.f3182a[iVar.ordinal()]) {
                case 1:
                    return new PackageData();
                case 2:
                    return y;
                case 3:
                    this.l.o();
                    this.m.o();
                    this.s.o();
                    this.u.o();
                    return null;
                case 4:
                    return new Builder((a) null);
                case 5:
                    i.j jVar = (i.j) obj;
                    PackageData packageData = (PackageData) obj2;
                    this.f3177e = jVar.c(S(), this.f3177e, packageData.S(), packageData.f3177e);
                    this.f3178f = jVar.h(L(), this.f3178f, packageData.L(), packageData.f3178f);
                    this.g = jVar.h(J(), this.g, packageData.J(), packageData.g);
                    this.h = jVar.e(K(), this.h, packageData.K(), packageData.h);
                    this.i = jVar.e(P(), this.i, packageData.P(), packageData.i);
                    this.j = jVar.e(O(), this.j, packageData.O(), packageData.j);
                    this.k = jVar.e(N(), this.k, packageData.N(), packageData.k);
                    this.l = jVar.f(this.l, packageData.l);
                    this.m = jVar.f(this.m, packageData.m);
                    this.n = jVar.h(D(), this.n, packageData.D(), packageData.n);
                    this.o = jVar.c(I(), this.o, packageData.I(), packageData.o);
                    this.p = jVar.e(H(), this.p, packageData.H(), packageData.p);
                    this.q = jVar.e(E(), this.q, packageData.E(), packageData.q);
                    this.r = jVar.e(F(), this.r, packageData.F(), packageData.r);
                    this.s = jVar.f(this.s, packageData.s);
                    this.t = jVar.c(R(), this.t, packageData.R(), packageData.t);
                    this.u = jVar.f(this.u, packageData.u);
                    this.v = jVar.c(Q(), this.v, packageData.Q(), packageData.v);
                    this.w = jVar.c(M(), this.w, packageData.M(), packageData.w);
                    this.x = jVar.c(C(), this.x, packageData.C(), packageData.x);
                    if (jVar == i.h.f11589a) {
                        this.f3176d |= packageData.f3176d;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    g gVar = (g) obj2;
                    boolean z2 = false;
                    while (!z2) {
                        try {
                            int z3 = eVar.z();
                            switch (z3) {
                                case 0:
                                    z2 = true;
                                    break;
                                case 10:
                                    String x2 = eVar.x();
                                    this.f3176d |= 16;
                                    this.i = x2;
                                    break;
                                case 16:
                                    this.f3176d |= 1;
                                    this.f3177e = eVar.n();
                                    break;
                                case 26:
                                    this.f3176d |= 2;
                                    this.f3178f = eVar.j();
                                    break;
                                case 34:
                                    this.f3176d |= 4;
                                    this.g = eVar.j();
                                    break;
                                case 42:
                                    String x3 = eVar.x();
                                    this.f3176d |= 8;
                                    this.h = x3;
                                    break;
                                case 50:
                                    String x4 = eVar.x();
                                    this.f3176d |= 32;
                                    this.j = x4;
                                    break;
                                case 58:
                                    String x5 = eVar.x();
                                    this.f3176d |= 64;
                                    this.k = x5;
                                    break;
                                case 66:
                                    if (!this.l.R()) {
                                        this.l = i.s(this.l);
                                    }
                                    this.l.add((NamedValue) eVar.p(NamedValue.E(), gVar));
                                    break;
                                case 74:
                                    if (!this.m.R()) {
                                        this.m = i.s(this.m);
                                    }
                                    this.m.add((NamedValue) eVar.p(NamedValue.E(), gVar));
                                    break;
                                case 82:
                                    this.f3176d |= 128;
                                    this.n = eVar.j();
                                    break;
                                case 88:
                                    this.f3176d |= 256;
                                    this.o = eVar.n();
                                    break;
                                case 98:
                                    String x6 = eVar.x();
                                    this.f3176d |= 1024;
                                    this.q = x6;
                                    break;
                                case 106:
                                    String x7 = eVar.x();
                                    this.f3176d |= AdRequest.MAX_CONTENT_URL_LENGTH;
                                    this.p = x7;
                                    break;
                                case 114:
                                    String x8 = eVar.x();
                                    this.f3176d |= 2048;
                                    this.r = x8;
                                    break;
                                case 122:
                                    String x9 = eVar.x();
                                    if (!this.s.R()) {
                                        this.s = i.s(this.s);
                                    }
                                    this.s.add(x9);
                                    break;
                                case 128:
                                    this.f3176d |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
                                    this.t = eVar.n();
                                    break;
                                case 138:
                                    if (!this.u.R()) {
                                        this.u = i.s(this.u);
                                    }
                                    this.u.add((NamedValue) eVar.p(NamedValue.E(), gVar));
                                    break;
                                case 144:
                                    this.f3176d |= 8192;
                                    this.v = eVar.n();
                                    break;
                                case 152:
                                    this.f3176d |= 16384;
                                    this.w = eVar.n();
                                    break;
                                case 160:
                                    this.f3176d |= 32768;
                                    this.x = eVar.n();
                                    break;
                                default:
                                    if (y(z3, eVar)) {
                                        break;
                                    }
                                    z2 = true;
                                    break;
                            }
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
                    if (z == null) {
                        synchronized (PackageData.class) {
                            if (z == null) {
                                z = new i.c(y);
                            }
                        }
                    }
                    return z;
                default:
                    throw new UnsupportedOperationException();
            }
            return y;
        }
    }

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    public interface PackageDataOrBuilder extends n {
    }

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    public static final class PackageTable extends i<PackageTable, Builder> implements PackageTableOrBuilder {
        /* access modifiers changed from: private */
        public static final PackageTable h;
        private static volatile p<PackageTable> i;

        /* renamed from: d  reason: collision with root package name */
        private int f3179d;

        /* renamed from: e  reason: collision with root package name */
        private String f3180e = "";

        /* renamed from: f  reason: collision with root package name */
        private j.b<KeyValue> f3181f = i.j();
        private String g = "";

        /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
        public static final class Builder extends i.b<PackageTable, Builder> implements PackageTableOrBuilder {
            /* synthetic */ Builder(a aVar) {
                this();
            }

            private Builder() {
                super(PackageTable.h);
            }
        }

        static {
            PackageTable packageTable = new PackageTable();
            h = packageTable;
            packageTable.q();
        }

        private PackageTable() {
        }

        public static p<PackageTable> E() {
            return h.d();
        }

        public boolean C() {
            return (this.f3179d & 2) == 2;
        }

        public boolean D() {
            return (this.f3179d & 1) == 1;
        }

        /* access modifiers changed from: protected */
        public final Object i(i.C0109i iVar, Object obj, Object obj2) {
            switch (a.f3182a[iVar.ordinal()]) {
                case 1:
                    return new PackageTable();
                case 2:
                    return h;
                case 3:
                    this.f3181f.o();
                    return null;
                case 4:
                    return new Builder((a) null);
                case 5:
                    i.j jVar = (i.j) obj;
                    PackageTable packageTable = (PackageTable) obj2;
                    this.f3180e = jVar.e(D(), this.f3180e, packageTable.D(), packageTable.f3180e);
                    this.f3181f = jVar.f(this.f3181f, packageTable.f3181f);
                    this.g = jVar.e(C(), this.g, packageTable.C(), packageTable.g);
                    if (jVar == i.h.f11589a) {
                        this.f3179d |= packageTable.f3179d;
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
                                    String x = eVar.x();
                                    this.f3179d = 1 | this.f3179d;
                                    this.f3180e = x;
                                } else if (z2 == 18) {
                                    if (!this.f3181f.R()) {
                                        this.f3181f = i.s(this.f3181f);
                                    }
                                    this.f3181f.add((KeyValue) eVar.p(KeyValue.E(), gVar));
                                } else if (z2 == 26) {
                                    String x2 = eVar.x();
                                    this.f3179d |= 2;
                                    this.g = x2;
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
                    if (i == null) {
                        synchronized (PackageTable.class) {
                            if (i == null) {
                                i = new i.c(h);
                            }
                        }
                    }
                    return i;
                default:
                    throw new UnsupportedOperationException();
            }
            return h;
        }
    }

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    public interface PackageTableOrBuilder extends n {
    }

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3182a;

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
                f3182a = r0
                com.google.protobuf.i$i r1 = com.google.protobuf.i.C0109i.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3182a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.i$i r1 = com.google.protobuf.i.C0109i.IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3182a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.i$i r1 = com.google.protobuf.i.C0109i.MAKE_IMMUTABLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3182a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.i$i r1 = com.google.protobuf.i.C0109i.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f3182a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.i$i r1 = com.google.protobuf.i.C0109i.VISIT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f3182a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.i$i r1 = com.google.protobuf.i.C0109i.MERGE_FROM_STREAM     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f3182a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.i$i r1 = com.google.protobuf.i.C0109i.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f3182a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.i$i r1 = com.google.protobuf.i.C0109i.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.config.proto.Config.a.<clinit>():void");
        }
    }

    private Config() {
    }
}
