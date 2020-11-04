package org.greenrobot.greendao.j;

import java.util.Date;
import java.util.List;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.i.d;

/* compiled from: WhereCondition */
public interface j {
    void a(List<Object> list);

    void b(StringBuilder sb, String str);

    /* compiled from: WhereCondition */
    public static class b extends a {

        /* renamed from: d  reason: collision with root package name */
        public final f f14573d;

        /* renamed from: e  reason: collision with root package name */
        public final String f14574e;

        public b(f fVar, String str) {
            this.f14573d = fVar;
            this.f14574e = str;
        }

        private static Object c(f fVar, Object obj) {
            if (obj == null || !obj.getClass().isArray()) {
                Class<?> cls = fVar.f14510b;
                if (cls != Date.class) {
                    if (cls == Boolean.TYPE || cls == Boolean.class) {
                        if (obj instanceof Boolean) {
                            return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
                        }
                        if (obj instanceof Number) {
                            int intValue = ((Number) obj).intValue();
                            if (!(intValue == 0 || intValue == 1)) {
                                throw new DaoException("Illegal boolean value: numbers must be 0 or 1, but was " + obj);
                            }
                        } else if (obj instanceof String) {
                            String str = (String) obj;
                            if ("TRUE".equalsIgnoreCase(str)) {
                                return 1;
                            }
                            if ("FALSE".equalsIgnoreCase(str)) {
                                return 0;
                            }
                            throw new DaoException("Illegal boolean value: Strings must be \"TRUE\" or \"FALSE\" (case insensitive), but was " + obj);
                        }
                    }
                    return obj;
                } else if (obj instanceof Date) {
                    return Long.valueOf(((Date) obj).getTime());
                } else {
                    if (obj instanceof Long) {
                        return obj;
                    }
                    throw new DaoException("Illegal date value: expected java.util.Date or Long for value " + obj);
                }
            } else {
                throw new DaoException("Illegal value: found array, but simple object required");
            }
        }

        private static Object[] d(f fVar, Object[] objArr) {
            for (int i = 0; i < objArr.length; i++) {
                objArr[i] = c(fVar, objArr[i]);
            }
            return objArr;
        }

        public void b(StringBuilder sb, String str) {
            d.h(sb, str, this.f14573d);
            sb.append(this.f14574e);
        }

        public b(f fVar, String str, Object obj) {
            super(c(fVar, obj));
            this.f14573d = fVar;
            this.f14574e = str;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(f fVar, String str, Object[] objArr) {
            super(objArr);
            d(fVar, objArr);
            this.f14573d = fVar;
            this.f14574e = str;
        }
    }

    /* compiled from: WhereCondition */
    public static abstract class a implements j {

        /* renamed from: a  reason: collision with root package name */
        protected final boolean f14570a;

        /* renamed from: b  reason: collision with root package name */
        protected final Object f14571b;

        /* renamed from: c  reason: collision with root package name */
        protected final Object[] f14572c;

        public a() {
            this.f14570a = false;
            this.f14571b = null;
            this.f14572c = null;
        }

        public void a(List<Object> list) {
            if (this.f14570a) {
                list.add(this.f14571b);
                return;
            }
            Object[] objArr = this.f14572c;
            if (objArr != null) {
                for (Object add : objArr) {
                    list.add(add);
                }
            }
        }

        public a(Object obj) {
            this.f14571b = obj;
            this.f14570a = true;
            this.f14572c = null;
        }

        public a(Object[] objArr) {
            this.f14571b = null;
            this.f14570a = false;
            this.f14572c = objArr;
        }
    }
}
