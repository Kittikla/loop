package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count =0;
        for(int i=1; i<=n;i++){
            if(n%i==0);
            count++;
        }

        System.out.println(count==2? "Yes" : "No");
        }

    }

