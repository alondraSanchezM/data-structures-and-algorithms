public class TowerOfHanoi{

    public static void move(int numDiscs,char from, char to, char used) {
        if(numDiscs == 1){
            System.out.println("Moving disc 1 from "+from+" to "+to);
        }
        else{
            move(numDiscs-1, from, used, to);
            System.out.println("Movid disc "+numDiscs+" from "+from+ " to "+to);
            move(numDiscs-1,used,to,from);
        }
    }

    public static void main(String[] args) {
        move(5,'A','B','C'); // T.C.: O(2^n).
    }
}