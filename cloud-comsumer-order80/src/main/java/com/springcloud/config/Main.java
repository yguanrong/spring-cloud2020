package com.springcloud.config;

import java.util.*;
import java.lang.*;

public class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

        List<Integer> re = new ArrayList<>();

        for(int i = 0;i< 13;i++){
            int a = in.nextInt();
            list.add(a);
            Integer temp = map.get(a);
            if (temp == null){
                map.put(a,1);
            }else {
                map.put(a,++temp);
            }
        }

        for(int i = 1; i <10; i++){

            if (checkStr(list,i,map)){
                re.add(i);
                System.out.println(i + " ");
            }
        }
        if (re.size()==0){

                System.out.println(0);
        }
    }

    private static boolean checkStr(List<Integer> list,int a,Map<Integer,Integer> map ){
        list.add(a);
        Integer temp = map.get(a);
        if (temp == null){
            map.put(a,1);
        }else {
            map.put(a,++temp);
        }

        return false;

    }
}