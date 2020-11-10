package com.company;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


public class CSV implements ReadFile{
    ArrayList<CreditAccount> accounts = new ArrayList<CreditAccount>();

    @Override
    public void readFile() {


        try {
            BufferedReader reader = new BufferedReader(new FileReader("sample.csv"));
            reader.readLine();//第一行信息，为标题信息，不用，如果需要，注释掉
            String line = null;
            String[] once = null;
            while((line=reader.readLine())!=null){
                String item[] = line.split(" ");//CSV格式文件为逗号分隔符文件，这里根据逗号切分
                String last = item[item.length-1];//这就是你要的数据了
                //int value = Integer.parseInt(last);//如果是数值，可以转化为数值
                //System.out.println(last);
                once=last.split(",");
                //System.out.println("22222"+once[0]+once[1]+once[2]);
                //System.out.println(once[2].getClass().getTypeName());
                CreditAccount account = new CreditAccount(once[2],once[1],once[0]);
                accounts.add(account);


              //  obj.add(last);
//                String[] aa = last.split(",");
//                for(int i = 0; i< aa.length; i++){
//                    System.out.println("aaaaa"+ aa[i]);
//
            }
            //System.out.println(obj.get(0));
            //System.out.println(accounts.get(0).getCardNumber());
        } catch (Exception e) {
            e.printStackTrace();
        }


        for(int i =0 ; i< accounts.size();i++){
            accounts.get(i).setCardNumber(accounts.get(i).getCardNumber());
            System.out.println(accounts.get(i).getCardNumber() + accounts.get(i).getCardType());
        }

    }

}
