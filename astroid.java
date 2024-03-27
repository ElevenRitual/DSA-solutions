import java.util.*;;
public class px {
 public static void stateOfAstroid(int arr[]){
    Stack<Integer> state= new Stack<>();
   for(int astro:arr){
    if(astro<0){
        int pre= state.pop();
        if(Math.abs(pre)>Math.abs(astro)){
            state.push(pre);
        }else if(Math.abs(pre)<Math.abs(astro)){
            while (!state.isEmpty()) {
                int temp= Math.abs(state.pop());
                if(temp>Math.abs(astro)){
                    state.push(temp);
                    break;
                } 
            }
            if(state.isEmpty()){
                state.add(astro);
            }
        }
        

    }else{
        state.push(astro);
    }
   }
   System.out.println(state);
 }
 public static void main(String[] args) {
    int arr[]= {5,05,-5};
    stateOfAstroid(arr);
 }

    
}
