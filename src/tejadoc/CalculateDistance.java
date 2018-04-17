package tejadoc;

import java.util.Scanner;

/**
 * Created by kasir on 4/2/2018.
 */
public class CalculateDistance {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1");
        int x1 = scanner.nextInt();
        System.out.print("Enter y1");
        int y1 = scanner.nextInt();
        System.out.print("Enter x2");
        int x2 = scanner.nextInt();
        System.out.print("Enter y2");
        int y2 = scanner.nextInt();
        int xdiff = x1-x2;
        xdiff = xdiff*xdiff;
        int ydiff = y1-y2;
        ydiff = ydiff*ydiff;
        int distance = (int)(Math.sqrt(xdiff+ydiff));
        System.out.println(distance);
    }
}
//    @SuppressWarnings("resource")
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new FileReader("distance.txt"));
//
//        String s;
//
//        String patternString = "^\\(([\\d-]+), ([\\d-]+)\\) \\(([\\d-]+), ([-\\d]+)\\)$";
//
//        Pattern pattern = Pattern.compile(patternString);
//
//        while ((s = br.readLine()) != null) {
//
//            System.out.println(s);
//
//            Matcher m = pattern.matcher(s);
//
//            if (m.matches()) {
//
//                int x1 = Integer.parseInt(m.group(1));
//
//                int y1 = Integer.parseInt(m.group(2));
//
//                int x2 = Integer.parseInt(m.group(3));
//
//                int y2 = Integer.parseInt(m.group(4));
//
