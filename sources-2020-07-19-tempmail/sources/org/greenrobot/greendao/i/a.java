package org.greenrobot.greendao.i;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.h.b;
import org.greenrobot.greendao.h.c;
import org.greenrobot.greendao.h.d;

/* compiled from: DaoConfig */
public final class a implements Cloneable {

    /* renamed from: b  reason: collision with root package name */
    public final org.greenrobot.greendao.g.a f14523b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14524c;

    /* renamed from: d  reason: collision with root package name */
    public final f[] f14525d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f14526e;

    /* renamed from: f  reason: collision with root package name */
    public final String[] f14527f;
    public final String[] g;
    public final f h;
    public final boolean i;
    public final e j;
    private org.greenrobot.greendao.h.a<?, ?> k;

    public a(org.greenrobot.greendao.g.a aVar, Class<? extends org.greenrobot.greendao.a<?, ?>> cls) {
        this.f14523b = aVar;
        try {
            f fVar = null;
            this.f14524c = (String) cls.getField("TABLENAME").get((Object) null);
            f[] f2 = f(cls);
            this.f14525d = f2;
            this.f14526e = new String[f2.length];
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            boolean z = false;
            f fVar2 = null;
            for (int i2 = 0; i2 < f2.length; i2++) {
                f fVar3 = f2[i2];
                String str = fVar3.f14513e;
                this.f14526e[i2] = str;
                if (fVar3.f14512d) {
                    arrayList.add(str);
                    fVar2 = fVar3;
                } else {
                    arrayList2.add(str);
                }
            }
            this.g = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            this.f14527f = strArr;
            this.h = strArr.length == 1 ? fVar2 : fVar;
            this.j = new e(aVar, this.f14524c, this.f14526e, this.f14527f);
            if (this.h != null) {
                Class<?> cls2 = this.h.f14510b;
                this.i = (cls2.equals(Long.TYPE) || cls2.equals(Long.class) || cls2.equals(Integer.TYPE) || cls2.equals(Integer.class) || cls2.equals(Short.TYPE) || cls2.equals(Short.class) || cls2.equals(Byte.TYPE) || cls2.equals(Byte.class)) ? true : z;
                return;
            }
            this.i = false;
        } catch (Exception e2) {
            throw new DaoException("Could not init DAOConfig", e2);
        }
    }

    private static f[] f(Class<? extends org.greenrobot.greendao.a<?, ?>> cls) throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException {
        Field[] declaredFields = Class.forName(cls.getName() + "$Properties").getDeclaredFields();
        ArrayList arrayList = new ArrayList();
        for (Field field : declaredFields) {
            if ((field.getModifiers() & 9) == 9) {
                Object obj = field.get((Object) null);
                if (obj instanceof f) {
                    arrayList.add((f) obj);
                }
            }
        }
        f[] fVarArr = new f[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            int i2 = fVar.f14509a;
            if (fVarArr[i2] == null) {
                fVarArr[i2] = fVar;
            } else {
                throw new DaoException("Duplicate property ordinals");
            }
        }
        return fVarArr;
    }

    public void b() {
        org.greenrobot.greendao.h.a<?, ?> aVar = this.k;
        if (aVar != null) {
            aVar.clear();
        }
    }

    /* renamed from: c */
    public a clone() {
        return new a(this);
    }

    public org.greenrobot.greendao.h.a<?, ?> d() {
        return this.k;
    }

    public void e(d dVar) {
        if (dVar == d.None) {
            this.k = null;
        } else if (dVar != d.Session) {
            throw new IllegalArgumentException("Unsupported type: " + dVar);
        } else if (this.i) {
            this.k = new b();
        } else {
            this.k = new c();
        }
    }

    public a(a aVar) {
        this.f14523b = aVar.f14523b;
        this.f14524c = aVar.f14524c;
        this.f14525d = aVar.f14525d;
        this.f14526e = aVar.f14526e;
        this.f14527f = aVar.f14527f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.j = aVar.j;
        this.i = aVar.i;
    }
}
