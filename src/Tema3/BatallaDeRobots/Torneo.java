package Tema3.BatallaDeRobots;

public class Torneo {
    public static void main(String[] args) {

        Robot robot1 = new Robot("Mazinger", "z");
        Robot robot2 = new Robot("Optimus", "prime");

        System.out.println("Estadisticas de Mazinger: ");
        robot1.mostrarEstadisticas();
        System.out.println("Estadisticas de Optimus: ");
        robot2.mostrarEstadisticas();

        while (robot1.estaVivo() && robot2.estaVivo()){
            robot1.atacar(robot2);

            if (robot2.estaVivo()){
                robot2.atacar(robot1);
            }

            System.out.println("La vida de Mazinger: " + robot1.getVida());
            System.out.println("La vida de Optimus: " + robot2.getVida());
        }

        if (robot1.estaVivo()){
            System.out.println("Ha ganado Mazinguer");
        } else{
            System.out.println("Ha ganado Optimus");
        }
    }
}
