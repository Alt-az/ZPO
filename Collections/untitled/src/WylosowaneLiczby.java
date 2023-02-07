import java.util.Random;
public class WylosowaneLiczby {
    int[] wylosowane= new int[6];
    Random random = new Random();
    public void losuj(){
        boolean pow=false;
        for(int i=0;i<wylosowane.length;i++){
            pow=true;
            while(pow) {
                wylosowane[i] = random.nextInt(49) + 1;
                pow = false;
                for (int j = i-1; j >= 0; j--) {
                    if (wylosowane[i]==wylosowane[j]){
                        pow=true;
                        break;
                    }
                }
            }
        }
    }
}
