package main;

import java.util.ArrayList;
import java.util.Arrays;

import static main.printResults.printmyResults;
import static main.printResultstest.printmyResultstest;

public class calculate {
    public static void calccc (ArrayList<Integer> tt , ArrayList<Integer> ff, ArrayList<String> armyTypeNames , int n)
    {
        //ArrayList<Integer> tt = new ArrayList<>(Arrays.asList(100,50,10,5));
        // ArrayList<Integer> ff = new ArrayList<>(Arrays.asList(100,101,20,5));
        ArrayList<Integer> leb = new ArrayList<>();
        ArrayList<Integer> req = new ArrayList<>();
        ArrayList<Integer> left = new ArrayList<>();
        boolean flag = true;

        for(int i=0;i<n;i++)
        {   req.add(0);left.add(0);leb.add(0);
            int x= (ff.get(i)+1)/2;
            //System.out.print (x +" ");
            if(x > tt.get(i))
            {
//                left.add(0);
//                leb.add(i,tt.get(i)) ;
//                req.add(x-tt.get(i)) ;
                leb.set(i,tt.get(i));
                req.set(i,x-tt.get(i));;
            }
            else
            {
//                leb.add(i,x);
//                req.add(0);
//                left.add( tt.get(i)-x);
                leb.set(i,x);
                left.set(i,tt.get(i)-x);
            }
        }
//        System.out.println();
//        for(int i=0;i<n;i++)
//        {
//            System.out.print(tt[i]+ " ");
//        }System.out.println();
//        for(int i=0;i<n;i++)
//        {
//            System.out.print(ff[i]+ " ");
//        }System.out.println();
//        for(int i=0;i<n;i++)
//        {
//            System.out.print(leb[i]+ " ");
//        }System.out.println();
//        for(int i=0;i<n;i++)
//        {
//            System.out.print(req[i]+ " ");
//        }System.out.println();
//        for(int i=0;i<n;i++)
//        {
//            System.out.print(left[i]+ " ");
//        }System.out.println();
//        System.out.println(tt);
//        System.out.println(ff);
//        System.out.println(leb);
//        System.out.println(req);
//        System.out.println(left);printing arraylists
        // printing arrays

        for(int i = 0 ; i < n ; i++)
        {
            if(req.get(i) > 0)
            {
                if(i>0)
                {
                    if(left.get(i-1) > 1)
                    {
                        if(left.get(i-1) % 2 == 0)
                        {
                            int avail = left.get(i-1)/2;

                            if(avail <=req.get(i))
                            {
                                req.set(i,req.get(i)-avail);
                                left.set(i-1,0);
                                leb.set(i-1,tt.get(i-1));
                            }
                            else
                            {
                                left.set(i-1,left.get(i-1)-(2* req.get(i)));
                                leb.set(i-1,leb.get(i-1)+(2*req.get(i)));
                                req.set(i,0);
                            }
                        }
                        else
                        {
                            int avail = left.get(i-1)/2;
                            if(avail <= req.get(i))
                            {
                                req.set(i,req.get(i)-avail);
                                left.set(i-1,1);
                                leb.set(i-1,tt.get(i-1)-1);
                            }
                            else
                            {
                                left.set(i-1,left.get(i-1)-(2*req.get(i)));
                                leb.set(i-1,leb.get(i-1)+(2*req.get(i)));
                                req.set(i,0);
                            }
                        }

                    }
                }
                if(req.get(i) > 0)
                {

                    if(i<n-1)
                    {
                        if(left.get(i+1) == 0)
                        {
                        }
                        else
                        {
                            int avail = 2*left.get(i+1);

                            if(avail >= req.get(i))
                            {
                                leb.set(i+1,leb.get(i+1)+(req.get(i)/2));
                                left.set(i+1,left.get(i+1)-(req.get(i)/2));
                                req.set(i,0);
                            }
                        }
                    }
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(req.get(i)>0)
            {
                flag = false;
                printmyResults(leb,flag,armyTypeNames);
                return;
            }
        }
        flag = true;
        printmyResults(leb,flag,armyTypeNames);

    }
}