package Patterns;

public class StarPatterns {

    public static void main(String[] args) {
        Pattern12(5);
    }

    public static void Pattern1(int n){
   
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    
    }

    public static void Pattern2(int n){
   
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    
    }

    public static void Pattern3(int n){
   
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    
    }
    
    public static void Pattern4(int n){
   
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    
    }

    public static void Pattern5(int n){
   
        for(int i=1;i<=(2*n)-1;i++){
            int columnsValue=i<=n?i:(2*n)-i;
            for(int j=1;j<=columnsValue;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    
    }

    public static void Pattern6(int n){
   
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++){
                System.out.print("*");
            }

            System.out.println();
        }
    
    }

    public static void Pattern7(int n){
   
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=n-i+1;k++){
                System.out.print("*");
            }

            System.out.println();
        }
    
    }

    public static void Pattern8(int n){
   
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++){
                System.out.print("*");
            }

            for(int l=1;l<i;l++){
                System.out.print("*");
            }

            System.out.println();
        }
    
    }

    public static void Pattern9(int n){
   
        for(int i=1;i<=n;i++){

            for(int l=1;l<i;l++){
                System.out.print(" ");
            }
            
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }

            for(int k=1;k<=n-i;k++){
                System.out.print("*");
            }

            System.out.println();
        }
    
    }

    public static void Pattern10(int n){
   
        for(int i=1;i<=n;i++){

            for(int l=1;l<=n-i;l++){
                System.out.print(" ");
            }
            
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    
    }

    public static void Pattern11(int n){
   
        for(int i=1;i<=n;i++){

            for(int l=1;l<i;l++){
                System.out.print(" ");
            }
            
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    
    }

    public static void Pattern12(int n){
   
        for(int i=1;i<=2*n;i++){
            int totalSpaces=i<=n?i-1:(2*n)-i;
            int totalStars=i<=n?n-i+1:i-n;
            for(int l=1;l<=totalSpaces;l++){
                System.out.print(" ");
            }
            
            for(int j=1;j<=totalStars;j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    
    }

}
