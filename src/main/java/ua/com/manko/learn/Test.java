package ua.com.manko.learn;

/**
 * Created by Sergej on 17.02.2016.
 */
    class Test{
        public static void main(String[] args)   {
            String s = "old";
            print(s = "34534", s = "new");
        }
        static void print(String s1, String s2)   {
            System.out.println(s1 +" "+ s2);
        }
    }
