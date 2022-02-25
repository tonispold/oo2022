public class Main {
    public static void main(String[] args) {
        Info info = new Info("dsa", "asd", "ksd", 1, 1);
        Arvuti arvuti = new Arvuti(info, 1304);

        String arvutiInfo = arvuti.getInfo();
        System.out.println(arvutiInfo);
    }
}
