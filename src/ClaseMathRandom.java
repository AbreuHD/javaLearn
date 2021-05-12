public class ClaseMathRandom {
    public static void main(String[] args){

        String colores[] = {"Azul", "Amarillo", "Verde", "Violeta"};

        double rand = Math.random();
        System.out.println("Random = " + rand);

        rand = Math.floor(rand *= colores.length);
        System.out.println("Random = " + rand);
        System.out.println("Color = " + colores[(int) rand]);

    }
}
