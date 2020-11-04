package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzefo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
abstract class o60<T extends zzefo> {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f4711a = Logger.getLogger(zzefl.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static String f4712b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    o60() {
    }

    static <T extends zzefo> T b(Class<T> cls) {
        String str;
        Class<o60> cls2 = o60.class;
        ClassLoader classLoader = cls2.getClassLoader();
        if (cls.equals(zzefo.class)) {
            str = f4712b;
        } else if (cls.getPackage().equals(cls2.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (zzefo) cls.cast(((o60) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).a());
        } catch (NoSuchMethodException e2) {
            throw new IllegalStateException(e2);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(e3);
        } catch (IllegalAccessException e4) {
            throw new IllegalStateException(e4);
        } catch (InvocationTargetException e5) {
            throw new IllegalStateException(e5);
        } catch (ClassNotFoundException unused) {
            Iterator<S> it = ServiceLoader.load(cls2, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((o60) it.next()).a()));
                } catch (ServiceConfigurationError e6) {
                    ServiceConfigurationError serviceConfigurationError = e6;
                    Logger logger = f4711a;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(cls.getSimpleName());
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", valueOf.length() != 0 ? "Unable to load ".concat(valueOf) : new String("Unable to load "), serviceConfigurationError);
                }
            }
            if (arrayList.size() == 1) {
                return (zzefo) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzefo) cls.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{arrayList});
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (IllegalAccessException e8) {
                throw new IllegalStateException(e8);
            } catch (InvocationTargetException e9) {
                throw new IllegalStateException(e9);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract T a();
}
