package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfb;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
abstract class j2<T extends zzfb> {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f9612a = Logger.getLogger(zzev.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static String f9613b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    j2() {
    }

    static <T extends zzfb> T b(Class<T> cls) {
        String str;
        Class<j2> cls2 = j2.class;
        ClassLoader classLoader = cls2.getClassLoader();
        if (cls.equals(zzfb.class)) {
            str = f9613b;
        } else if (cls.getPackage().equals(cls2.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (zzfb) cls.cast(((j2) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).a());
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
                    arrayList.add(cls.cast(((j2) it.next()).a()));
                } catch (ServiceConfigurationError e6) {
                    ServiceConfigurationError serviceConfigurationError = e6;
                    Logger logger = f9612a;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(cls.getSimpleName());
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", valueOf.length() != 0 ? "Unable to load ".concat(valueOf) : new String("Unable to load "), serviceConfigurationError);
                }
            }
            if (arrayList.size() == 1) {
                return (zzfb) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzfb) cls.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{arrayList});
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
