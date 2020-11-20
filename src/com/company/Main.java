package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan=new Scanner(System.in);
        String phone=scan.next();
        Pattern pattern= Pattern.compile("^((\\+|00)374|0)(\\-|\\s)?(11|322|254|60|10|256|94|93|91|99|43|49|55|99)\\d{6}$");
        Matcher matcher=pattern.matcher(phone);
        if (matcher.matches()) {
            System.out.println("Phone Number Valid");
        }
    }
}
