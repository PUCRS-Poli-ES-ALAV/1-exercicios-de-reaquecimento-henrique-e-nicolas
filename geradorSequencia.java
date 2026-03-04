public class geradorSequencia {
    public static void main(String[] args) {
        System.out.println(sequelGerador(3));

    }

    static int sequelGerador(int num){
        if(num == 1){return 1;}
        if (num==2){return 2;}
        return 2 * sequelGerador(num-1)+ 3 * sequelGerador(num-2);
    }
}

