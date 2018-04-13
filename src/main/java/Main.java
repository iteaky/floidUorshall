import static java.lang.Integer.*;

public class Main {


    public static void routeMatrix(Integer[][] mass){
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length ; j++) {
                int a = mass[i][j];
                for (int k = 0; k < mass.length; k++) {
                    int b = mass[k][i];
                    int c = mass[k][j];
                    if (a != MAX_VALUE && b != MAX_VALUE) {
                        if (c > (b + a)) {
                            if (k != j)
                                mass[k][j] = (a + b);
                            else mass[k][j] = 0;
                        }
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        Integer[][] mass = {{MAX_VALUE,MAX_VALUE,3,MAX_VALUE},
                {2,MAX_VALUE,MAX_VALUE,MAX_VALUE},
                {MAX_VALUE,7,MAX_VALUE,1},
                {6,MAX_VALUE,MAX_VALUE,MAX_VALUE},};

        routeMatrix(mass);
        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                System.out.print(mass[i][j]+ " ");
            }
            System.out.println();
        }

        }
    }

