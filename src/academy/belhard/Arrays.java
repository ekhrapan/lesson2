package academy.belhard;

public class Arrays {

    public static void main(String[] args) {

        int[] goals = new int[5];
        goals[0] = 2;
        goals[1] = 1;
        goals[2] = 0;
        goals[3] = 5;
        goals[4] = 3;

//        System.out.println("Демострация цикла for:");
//        for (int i = 0; i < goals.length; i++) {
//            if (i == 2) {
//                continue;
//            }
//            System.out.println("Забил в " + (i + 1) + "-м матче -> " + goals[i]);
//
//        }
//        System.out.println("------------------------------");
//        System.out.println("");
//
//        System.out.println("Демострация цикла while:");
//        int counter = 0;
//        while (counter < goals.length) {
//            System.out.println("Забил в " + (counter + 1) + "-м матче -> " + goals[counter]);
//            counter++;
//        }
//        System.out.println("------------------------------");
//        System.out.println("");

        System.out.println("Демострация switch:");
        for (int i = 0; i < goals.length; i++) {

            System.out.print("В " + (i + 1) + "-м матче ");
            switch (goals[i]) {
                case 0:
                    System.out.println("не забил ни одного гола");
                    break;
                case 1:
                    System.out.println("забил гол");
                    break;
                case 2:
                    System.out.println("оформил дубль");
                    break;
                case 3:
                    System.out.println("оформил хет трик");
                    break;
                default:
                    System.out.println("играл как Боженька");
            }
        }
        System.out.println("------------------------------");
    }
}
