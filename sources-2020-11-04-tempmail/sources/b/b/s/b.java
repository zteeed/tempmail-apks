package b.b.s;

import java.util.Scanner;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private String f2171a;

    /* renamed from: b  reason: collision with root package name */
    private String f2172b;

    /* renamed from: c  reason: collision with root package name */
    private String f2173c;

    /* renamed from: d  reason: collision with root package name */
    private String f2174d;

    public b(String str, String str2, String str3) {
        this.f2173c = str;
        this.f2172b = str2;
        this.f2171a = str3;
    }

    public String a() {
        return this.f2174d;
    }

    public String b() {
        return this.f2172b;
    }

    public String c() {
        return this.f2173c;
    }

    public String d() {
        return this.f2171a;
    }

    public void e(String str) {
        this.f2174d = str;
    }

    public b(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            if (nextLine.startsWith("url=")) {
                this.f2173c = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.f2171a = nextLine.substring(8).trim();
            } else if (nextLine.startsWith("data=")) {
                this.f2172b = nextLine.substring(5).trim();
            }
        }
        scanner.close();
    }
}
