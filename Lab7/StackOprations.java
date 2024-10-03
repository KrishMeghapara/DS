public class StackOprations {
    public static void main(String[] args) {
        StackDemo s1 = new StackDemo();
        s1.push(5);
        s1.push(6);
        s1.push(7);
        s1.push(8);
        s1.push(9);
        s1.pop();
        System.out.println(s1.peep(6));
        s1.change(3, 10);
        s1.Display();
    }
}
class StackDemo{
    int top = -1;
    int S[] = new int[5];
    void push(int x)
    {
        if(top>=S.length){
            System.out.println("Stack Overflow");

        }
        else{
            top = top +1;
            S[top] = x;
        }
    }
    void Display(){
        for(int i =0;i<=top;i++){
            System.out.println(S[i]);
        }
    }
    int pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            top = top -1;
            return (S[top+1]);
        }
    }
    int peep(int I){

        if((top-I+1)<=-1){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            return (S[top-I+1]);
        }

    }
    void change(int I,int x){
        if((top-I+1)<=-1){
            System.out.println("Stack Underflow");
        }
        else{
            S[top-I+1] = x;
        }
    }
}