public class oddevencount {
    public static void main(String []args){
         int a[] = {10,15,20,25,30};
         int odd = 0;
         int even = 0;
        System.out.println("Count of even no:");
        for(int i : a){
            if(i % 2 == 0){
            even++;
            }
        }
        System.out.println(even);
        System.out.println("Count of odd no:");
        for(int i : a){
            if(i % 2 == 1){
            odd++;
            }
        }
        System.out.println(odd);
    }
    
}
