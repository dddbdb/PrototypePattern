public class main {
    public static void main(String[] args) {
        PrototypeDemo pro = new PrototypeDemo();
        pro.setName("this is prototype");
        PrototypeDemo clone = (PrototypeDemo) pro.Clone();
        System.out.println(clone.getName());
    }
}
