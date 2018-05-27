
package javaapplication22;


class Star{
    void fun(){
        int i,j;
        for(i=0;i<9;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
public class JavaApplication22 {

    
    public static void main(String[] args) {
        Star a=new Star();
        a.fun();
        
    }
    
}
