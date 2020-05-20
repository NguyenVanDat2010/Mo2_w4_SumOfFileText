import java.io.*;
import java.util.Scanner;

public class SumOfFileText {
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = null;
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Sum = " + sum);
        } catch (Exception e) {
            System.out.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }

    public static void main(String[] args) {
        //Tạo file và thêm giá trị vào file
//        try {
//            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("numbers.txt"));
//            bufferedWriter.write("5\n");
//            bufferedWriter.write("3\n");
//            bufferedWriter.write("6\n");
//            bufferedWriter.write("1\n");
//            bufferedWriter.write("8\n");
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn file: ");
        String str = scanner.nextLine();

        SumOfFileText sumOfFileText = new SumOfFileText();
        sumOfFileText.readFileText(str);

    }
}
