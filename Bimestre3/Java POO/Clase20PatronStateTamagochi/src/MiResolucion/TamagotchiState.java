package MiResolucion;

//si de alguna manera necesito implementar lógica para los estados debo usar clase abstracta en lugar de interface

//empiezo con la interfaz

public interface TamagotchiState {
//    public abstract void darDeBeber();
//    public abstract void darDeComer();
//    public abstract void darCaricias();
    //es obvio que tienen que ser publicas y abstractas

     TamagotchiState darDeBeber();
     TamagotchiState darDeComer();
     TamagotchiState darMimos();

}


