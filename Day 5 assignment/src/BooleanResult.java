public class BooleanResult {
    int x;
    int y;
     public boolean checkLesser(int x, int y) {
         boolean result = false;
         if(x<y){
             result = true;
         }
         else {
             result = false;
         }
         return result;
     }
}
