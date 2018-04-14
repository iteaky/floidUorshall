import static java.lang.Integer.MAX_VALUE;

public class Main {


    public static Integer[][] routeMatrix(Integer[][] mass) {
        Integer[][] route = new Integer[mass.length][mass.length];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
               if(route[i][j]==null) route[i][j] =  i + 1;
                int a = mass[i][j];
                if(a == MAX_VALUE) continue;
                for (int k = 0; k < mass.length; k++) {
                    int b = mass[k][i];
                    int c = mass[k][j];
                    if (b != MAX_VALUE) {
                        if (c > (b + a)) {
                            if (k != j) {
                                mass[k][j] = (a + b);
                                route[k][j] = i + 1;
                            } else {
                                mass[k][j] = 0;
                            }
                        }
                    }
                }
            }
        }
        return route;
    }

    public static void main(String[] args) {
        Integer[][] mass = {{MAX_VALUE, 10, 30, 50, 10},
                {MAX_VALUE, MAX_VALUE, MAX_VALUE, MAX_VALUE, MAX_VALUE},
                {MAX_VALUE, MAX_VALUE, MAX_VALUE, MAX_VALUE, 10},
                {MAX_VALUE, 40, 20, MAX_VALUE, MAX_VALUE},
                {10, MAX_VALUE, 10, 30, MAX_VALUE}};

        final Integer[][] integers = routeMatrix(mass);
        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                System.out.print(mass[i][j] + (mass[i][j] >= 10 ? " " : "  "));
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < integers.length; i++) {
            for (int j = 0; j < integers.length; j++) {
                System.out.print(integers[i][j] + (integers[i][j] >= 10 ? " " : "  "));
            }
            System.out.println();
        }

    }
}

