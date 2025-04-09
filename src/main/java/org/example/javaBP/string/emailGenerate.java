package org.example.javaBP.string;

import java.util.Objects;
import java.util.Scanner;

public class emailGenerate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] employeeList = new String[n];

        for (int i = 0; i < n; i++) {
            String list = scanner.nextLine();
            employeeList[i] = list;
        }
        String[] emailList = generateEmail(employeeList);
        for (String s : emailList) {
            System.out.println(s + "@onemount.com");
        }
    }

    public static String[] generateEmail(String[] employeeList) {
        int prefix = 0;
        String[] emailList = new String[employeeList.length];
        String[] fullName = new String[employeeList.length];

        for (int i = 0; i < emailList.length; i++) {

            //xử lý dữ liệu đầu vào, bỏ khoảng trắng trước giữa, và sau, sau đó lưu giá trị vào mảng string
            String[] employee = employeeList[i].trim().split(" ");

            //email sẽ = công thức bên dứoi
            String email = employee[employee.length - 1].toLowerCase() + "." + employee[0].toLowerCase();

            //xử lý prefix
            String fullname = employee[employee.length - 1].toLowerCase()+ "." + employee[0].toLowerCase();
            for (String e : fullName) {
                if (Objects.equals(e, fullname)) {
                    prefix++;
                }
            }

            //nếu có prefix thì add còn k có thì k cần điền prefix
            if (prefix != 0) {
                emailList[i] = email + prefix;
            } else emailList[i] = email;

            prefix = 0;
            fullName[i]=fullname;

        }
        return emailList;
    }
}


