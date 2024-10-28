

public class JuegoLucha {
    private Personaje jugador1;
    private Personaje jugador2;



//Metodo para iniciaizar los personajes
public JuegoLucha(String nombre1, String nombre2){
    this.jugador1 = new Rugal(nombre1);
    this.jugador2 = new Iori(nombre2);
}

//Merodo para iniciar pelea
public void iniciarPelea(){
    System.out.println("la pelea comienza" + jugador1.getNombre() + "y" + jugador2.getNombre() + "...");

    while (jugador1.estaVivo() && jugador2.estaVivo()){
        turno(jugador1, jugador2);
        if (jugador2.estaVivo()){
            turno(jugador2, jugador1);
        }
    }

    //Mostrar resultado de la pelea 
    if (jugador1.estaVivo()){
        System.out.println(jugador1.getNombre() + "ha ganado la pelea");
    } else {
        System.out.println(jugador2.getNombre() + "ha ganado la pelea");
    }
}    

    //Metodo que representa un turno de ataque 
    private void turno(Personaje atacante, Personaje defensor){
        System.out.println("Turno de" + atacante.getNombre() + "Puntos de vida" + defensor.getNombre() + ": " + defensor.getPuntosDeVida());
        atacante.atacar(defensor);
        System.out.println(defensor.getNombre() + "ahora tiene" + defensor.getPuntosDeVida() + "puntos de vida");


    }

    


}    






