package d.a.a0.j;

/* compiled from: Pow2 */
public final class p {
    public static int a(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }
}
