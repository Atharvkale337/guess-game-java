
import java.util.Random;
import java.util.Scanner;
class game{
public int number;
public int userinput;

public int noofguesses=0;
game(){
    Random sc = new Random();
    this.number=sc.nextInt(100);

}
void takeinput(){
    System.out.println("guess the number");
Scanner vc = new Scanner(System.in);
this.userinput=vc.nextInt();

}
boolean iscorrectnumber(){
    noofguesses++;
    if(userinput==number){
        System.out.println("yes you guessed it right in "+noofguesses+"attempts");
        return true;

    }else if(userinput<number){
        System.out.println("the number is too low");
    }
    else if(userinput>number){
        System.out.println("the number is too high");

    }return false;

}
}

public class guess_game {
    public static void main(String[] args) {
        game g = new game();

        boolean b = false;
        while(!b) {
            g.takeinput();
            b = g.iscorrectnumber();
            System.out.println(b);
        }
    }
}