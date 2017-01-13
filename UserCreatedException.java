import java.util.Scanner;
class UserCreatedException {
    int income;

    public static void main(String args[]) {
        Scanner ss = new Scanner(System.in);
        UserCreatedException U = new UserCreatedException();
        System.out.println("Enter the Income");
        U.income = ss.nextInt();
        try {
            if (U.income > 999)
                throw new MohithExcept(0);
        } catch (MohithExcept e) {
            System.out.println(e);
        } finally {
            System.out.println("Executed All Statements");
        }
    }
}
class MohithExcept extends Exception {
    int b;
    MohithExcept(int a) {}
    public String toString() {
        return ("Error:Excessive Income!!!");
    }
}