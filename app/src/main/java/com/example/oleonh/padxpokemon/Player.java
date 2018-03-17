public class Player{
    String name;
    Araylist<Pokemon> pokemen = new Arraylist<>();

    //boolean reveals if the pokemon can be added
    boolean addPokemon(Pokemon p){
        if (pokemen.getSize() >= 5) {
            return false;
        }
        pokemen.add(p); return true;
    }
}