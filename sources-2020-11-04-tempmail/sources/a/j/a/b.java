package a.j.a;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: FocusStrategy */
class b {

    /* compiled from: FocusStrategy */
    public interface a<T> {
        void a(T t, Rect rect);
    }

    /* renamed from: a.j.a.b$b  reason: collision with other inner class name */
    /* compiled from: FocusStrategy */
    public interface C0018b<T, V> {
        V a(T t, int i);

        int b(T t);
    }

    /* compiled from: FocusStrategy */
    private static class c<T> implements Comparator<T> {

        /* renamed from: b  reason: collision with root package name */
        private final Rect f450b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        private final Rect f451c = new Rect();

        /* renamed from: d  reason: collision with root package name */
        private final boolean f452d;

        /* renamed from: e  reason: collision with root package name */
        private final a<T> f453e;

        c(boolean z, a<T> aVar) {
            this.f452d = z;
            this.f453e = aVar;
        }

        public int compare(T t, T t2) {
            Rect rect = this.f450b;
            Rect rect2 = this.f451c;
            this.f453e.a(t, rect);
            this.f453e.a(t2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            if (i3 < i4) {
                if (this.f452d) {
                    return 1;
                }
                return -1;
            } else if (i3 <= i4) {
                int i5 = rect.bottom;
                int i6 = rect2.bottom;
                if (i5 < i6) {
                    return -1;
                }
                if (i5 > i6) {
                    return 1;
                }
                int i7 = rect.right;
                int i8 = rect2.right;
                if (i7 < i8) {
                    if (this.f452d) {
                        return 1;
                    }
                    return -1;
                } else if (i7 <= i8) {
                    return 0;
                } else {
                    if (this.f452d) {
                        return -1;
                    }
                    return 1;
                }
            } else if (this.f452d) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    private static boolean a(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean b2 = b(i, rect, rect2);
        if (b(i, rect, rect3) || !b2) {
            return false;
        }
        if (j(i, rect, rect3) && i != 17 && i != 66 && k(i, rect, rect2) >= m(i, rect, rect3)) {
            return false;
        }
        return true;
    }

    private static boolean b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }

    public static <L, T> T c(L l, C0018b<L, T> bVar, a<T> aVar, T t, Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else if (i == 130) {
            rect2.offset(0, -(rect.height() + 1));
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        T t2 = null;
        int b2 = bVar.b(l);
        Rect rect3 = new Rect();
        for (int i2 = 0; i2 < b2; i2++) {
            T a2 = bVar.a(l, i2);
            if (a2 != t) {
                aVar.a(a2, rect3);
                if (h(i, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t2 = a2;
                }
            }
        }
        return t2;
    }

    public static <L, T> T d(L l, C0018b<L, T> bVar, a<T> aVar, T t, int i, boolean z, boolean z2) {
        int b2 = bVar.b(l);
        ArrayList arrayList = new ArrayList(b2);
        for (int i2 = 0; i2 < b2; i2++) {
            arrayList.add(bVar.a(l, i2));
        }
        Collections.sort(arrayList, new c(z, aVar));
        if (i == 1) {
            return f(t, arrayList, z2);
        }
        if (i == 2) {
            return e(t, arrayList, z2);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    private static <T> T e(T t, ArrayList<T> arrayList, boolean z) {
        int i;
        int size = arrayList.size();
        if (t == null) {
            i = -1;
        } else {
            i = arrayList.lastIndexOf(t);
        }
        int i2 = i + 1;
        if (i2 < size) {
            return arrayList.get(i2);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    private static <T> T f(T t, ArrayList<T> arrayList, boolean z) {
        int i;
        int size = arrayList.size();
        if (t == null) {
            i = size;
        } else {
            i = arrayList.indexOf(t);
        }
        int i2 = i - 1;
        if (i2 >= 0) {
            return arrayList.get(i2);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    private static int g(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    private static boolean h(int i, Rect rect, Rect rect2, Rect rect3) {
        if (!i(rect, rect2, i)) {
            return false;
        }
        if (!i(rect, rect3, i) || a(i, rect, rect2, rect3)) {
            return true;
        }
        if (!a(i, rect, rect3, rect2) && g(k(i, rect, rect2), o(i, rect, rect2)) < g(k(i, rect, rect3), o(i, rect, rect3))) {
            return true;
        }
        return false;
    }

    private static boolean i(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            if ((i2 > i3 || rect.left >= i3) && rect.left > rect2.left) {
                return true;
            }
            return false;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            if ((i4 > i5 || rect.top >= i5) && rect.top > rect2.top) {
                return true;
            }
            return false;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
                return true;
            }
            return false;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    private static boolean j(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        return rect.bottom <= rect2.top;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                } else if (rect.right <= rect2.left) {
                    return true;
                } else {
                    return false;
                }
            } else if (rect.top >= rect2.bottom) {
                return true;
            } else {
                return false;
            }
        } else if (rect.left >= rect2.right) {
            return true;
        } else {
            return false;
        }
    }

    private static int k(int i, Rect rect, Rect rect2) {
        return Math.max(0, l(i, rect, rect2));
    }

    private static int l(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    private static int m(int i, Rect rect, Rect rect2) {
        return Math.max(1, n(i, rect, rect2));
    }

    private static int n(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.top;
        } else if (i == 66) {
            i2 = rect2.right;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.bottom;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    private static int o(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
