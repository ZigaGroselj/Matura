import java.util.Scanner;

public class junij2016 {
    public static Scanner sc = new Scanner(System.in);
    public static int st;
    public static String[] pokemon= new String[st]; 
    public static int[] moc = new int[st];
    public static String[] tip = new String[st];
    public static void main(String[] args){
//---------------------A------------------------------------
        System.out.printf("Vnesite stevilo vnosov: ");
        st = sc.nextInt();
        for(int i = 0; i < st; i++){
            System.out.printf("Vnesite %d. pokemona: ",i);
            pokemon[i]=sc.nextLine();
            System.out.printf("Vnesite %d. moc: ",i);
            moc[i]=sc.nextInt();
            System.out.printf("Vnesite %d. tip: ",i);
            tip[i]=sc.nextLine();
        }
    }
//-------------------------B----------------------------------------
    public static String zapis(String pokemonIn){
        int i = 0;
        int index = 0;
        while(i<st){
            if(pokemonIn.equals(pokemon[i])){
                index = i;
            }
            i++;
        }
        String value = String.valueOf(moc[index]);
        return pokemonIn.concat("-").concat(tip[i].substring(0,1)).concat("-").concat(value);
    }
//-------------------------C----------------------------------------
    
}
