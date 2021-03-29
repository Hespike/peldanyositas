public class Main {
    
    public static void main(String[] args){

        int szam = 3;
        Ember ember1 = new Ember();

        ember1.nev="Kaszimir";
        ember1.nem= false;
        ember1.szulEv = 1998;

        System.out.println(ember1.nev + " egy " + ((ember1.nem)?"nő":"férfi") + ", akinek születési éve "+ ember1.szulEv);
    }
}
