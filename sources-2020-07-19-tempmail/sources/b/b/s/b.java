package b.b.s;

import java.util.Scanner;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private String f2073a;

    /* renamed from: b  reason: collision with root package name */
    private String f2074b;

    /* renamed from: c  reason: collision with root package name */
    private String f2075c;

    /* renamed from: d  reason: collision with root package name */
    private String f2076d;

    public b(String str, String str2, String str3) {
        this.f2075c = str;
        this.f2074b = str2;
        this.f2073a = str3;
    }

    public String a() {
        return this.f2076d;
    }

    public String b() {
        return this.f2074b;
    }

    public String c() {
        return this.f2075c;
    }

    public String d() {
        return this.f2073a;
    }

    public void e(String str) {
        this.f2076d = str;
    }

    public b(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            if (nextLine.startsWith("url=")) {
                this.f2075c = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.f2073a = nextLine.substring(8).trim();
            } else if (nextLine.startsWith("data=")) {
                this.f2074b = nextLine.substring(5).trim();
            }
        }
        scanner.close();
    }
}
