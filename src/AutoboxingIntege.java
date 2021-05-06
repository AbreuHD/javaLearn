public class AutoboxingIntege {
    public static void main(String[] args) {

        Integer[] inteArr = {1,2,3,4,5,6,7,8,9};
        int suma = 0;

        for (Integer i : inteArr){
            if(i % 2 == 0){
//              suma += i.intValue();
                suma += i;
                System.out.println("suma = " + suma);
            }

        }
    }
}
