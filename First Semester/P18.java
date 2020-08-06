package lab3;

public class P18 {
    
    public static void solveTowers(int n, char from, char inter, char to) {
      if (n == 1){
        System.out.println("Disk 1 from " + from + " to " + to);
      }
      else {
              
                      
        solveTowers(n - 1, from, to, inter);
                       
        System.out.println("Disk " + n + " from " + from + " to " + to);
                      
        solveTowers(n - 1, inter, from, to);
      }
    }
            public static void main(String[] args) {
              int ndisks = 3;
              solveTowers(ndisks, 'A', 'B', 'C');
            }
   
  
}
