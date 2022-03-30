/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;
import javax.naming.spi.DirStateFactory.Result;

/**
 *
 * @author ahmed
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //ask user for array size 0<=100
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
        List<Integer> numbers=arr;
        int size=numbers.size();
        float posNum,negNum,zeroNum;
        posNum=0;
        negNum=0;
        zeroNum=0;
        
        
        bufferedReader.close();
        for(int i=0;i<size;i++)
            {
                if(numbers.get(i)==0)
                {
                    zeroNum++;
                }
                else
                {
                
                    if(numbers.get(i)>0)
                
                    {
                    
                       posNum++;
                
                    }
                
                    else
                
                    {
                    
                        negNum++;
                
                    }
                
               }
            }
            
        
            System.out.printf("%.6f \n", (posNum/size));
            System.out.printf("%.6f \n",(negNum/size));
            System.out.printf("%.6f \n",(zeroNum/size));
    }
    }
 

