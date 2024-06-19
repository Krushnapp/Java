class Main {
    public static void dis(int n) {
        System.out.println(n);
        n++;
    }

    public static void main(String[] args) {
        int f = 9;
        dis(f);
        System.out.println(f);   the value of f will not be afected because it is pass by value
    }
}


in java it will create memory for both n, f both are not dependent
  Pass By Reference: Changing the value of the real address in the memory.
Pass By Value: Copying the value to another location and so the real value is not changed.(java)

