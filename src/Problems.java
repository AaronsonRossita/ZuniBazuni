public class Problems {

    public static void main(String[] args) {

        System.out.println(calc(4,0,'/'));

    }

    public static int calc(int a, int b,char c){
        switch (c){
            case '+':
                return a + b;

            case '-':
                return a - b;

            case '*':
                return a * b;

            case '/':
                if (b != 0){
                    return a / b;
                }else{
                    return 0;
                }
            default:
                return 0;
        }
    }

}
