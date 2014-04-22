public class faktorial {
    public static void main(String[] args) {
        int jum,ang,a,b,tot;
        jum=7;
        a=1;
        b=0;
        for(int i=1;i<=jum;i++){
            a=i*a;
        }
        System.out.print(jum+"! = ");
        for(int i=1;i<=jum;i++){
            if (i==jum){
                System.out.print(jum +" = ");
            }
            else
            {
                System.out.print(jum +" X ");
            }
        }
        System.out.print(a);
    }
}
