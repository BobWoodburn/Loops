public interface TestNestedLoop {
    public static void main(String[] args) {


        for (int i=10;i<20;i++){
            for (int j=0;j<2;j++)
            System.out.println(i+"  "+j);
        }
    }
}
