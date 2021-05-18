import java.util.Random;

public class ClaseMathRandom {
    public static void main(String[] args){

        String colores[] = {"Azul", "Amarillo", "Verde", "Violeta"};
        Random randomObj = new Random();

        double rand = Math.random();
        System.out.println("Random = " + rand);

        rand = Math.floor(rand *= colores.length);
        System.out.println("Random = " + rand);
        System.out.println("Color = " + colores[(int) rand]);

        int randomInt = randomObj.nextInt();
        System.out.println("randomInt = " + randomInt);
        randomInt = randomObj.nextInt(25);
        System.out.println("randomInt = " + randomInt);
        randomInt = 15 + randomObj.nextInt(25-15); // 15 a 24

        double randomDouble = randomObj.nextDouble();
        System.out.println("randomDouble = " + randomDouble);


    }
}
