class Parent {
 int pr_1;
 Parent() {
  pr_1 = 36;
 }
}
class Child extends Parent {
 int pr_1;
 Child() {
  super();
  pr_1 = 12;
 }
 public int display_private() {
  return super.pr_1;
 }
}
public class Inheritance {
 public static void main(String[] args) {
  Child C = new Child();
  System.out.println(C.display_private());
 }
}
