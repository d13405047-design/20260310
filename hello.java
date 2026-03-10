import java.util.Random;
import java.util.Scanner;

public class hello {
    static class Player {
    private int ID;
    private String role;
    private boolean alive;

public Player(){
    this.ID = ID;
    this.role = role;
    this.alive = true;
}
public int getID(){
    return ID;
}
public String getRole(){
    return role;
}
public boolean getalive(){
    return alive;
}
public void kill(){
    alive=false;
}
public String getpublicInfo(){
    if(alive){
        return "Player " + ID +"[alive]";
    }else{
        return "Player " + ID +"[dead]";
    }
}
public static   void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Random road = new Random();

    System.out.println("wolfgame");
    System.out.println("Enter number of players:");
    int n=sc.nextInt();
    sc.nextLine();

    while (n<4||n>10) {
        System.out.println("InvalID of 4~10");
        n=sc.nextInt();
        sc.nextLine();
    }
    Player[]players=new Player[n];
    int wolfIndex= road.nextInt();
    for(int i=0;i<n;i++){
    if(int i==wolfIndex){
    players[i]=new Player(i+1,role ="wolf");    
    }else{
    players[i]=new Player(i+1,role ="villager");    



    }
   }
   System.out.println();
   System.out.print("Role assignment start.");
   System.out.print("Each player take turn to role");
   
   for(int i =0;i<n;i++){
    System.out.println();
    System.out.println("Player",+(i+1)+"please Enter");
    sc.nextLine();
    System.out.println("Yoyr role: "+players[i].getRole());
    System.out.print("Memorzie your role, then turn.");
    sc.nextLine();
    for(int line=0;line < 30; line++){
    System.out.println();
    }
   }
   boolean gemeOver=false;
   int round=1;

   while (!gemeOver) {
    System.out.println("Round",+round);
    System.out.println();
    
    System.out.println("晚上:狼人TIME");
    int alivewolf= findalivewolf(players);
    if(alivewolf !=-1){
        System.out.println("狼人開始活動");
        System.out.println("倖存玩家");
        printalivePlayers(players);
        int target=-1;
        while (true){
            System.out.printIn("選擇殺玩家");
            if(sc.hasNext()){
                targetID=sc.nextInt();
                sc.nextLine();

                if(isValid)
            }
        }
    }
}

  }
 }    
}