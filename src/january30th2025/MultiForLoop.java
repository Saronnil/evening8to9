package january30th2025;

public class MultiForLoop {
    public static void main(String[] args) {
//        String string = "Hello World";
//        for (int i = 0; i < string.length(); i++) {
//            for (int j = i; j < string.length(); j++) {
//                if ((i+j) % 2 == 0) {
//                    System.out.println(string.charAt(i));
//                }else {
//                    System.out.println(string.charAt(j));
//                }
//
//            }
//            System.out.println();
//        }
//
//        String str = "Challenge";
//        String result= "";
//        int length = str.length();
//        for(int i = 0; i< length;i++){
//            if ((length+i)% 2== 0) {
//                result += (char) (str.charAt(i) - 1);
//            } else if ((length-i)% 3 == 0) {
//                result += "*";
//                }else {
//                result += str.charAt(i);
//            }
//        }
//        System.out.println(result);
//        }

//        String str = "Programming";
//        String result = "";
//        int Length = str.length();
//        for (int i = 0; i < Length; i++) {
//            if ((str.charAt(i) +i) % 3 == 0) {
//                result += str.charAt(i);
//                } else if ( i % 2 == 0) {
//                result += (char) (str.charAt(i) - 1);
//            }else {
//                result += (char)(str.charAt(i) +1);
//            }
//        }
//        System.out.println(result);
//    }

//        String str = "Reflection";
//        String result = "";
//        for (int i = str.length()-1;i>= 0; i--) {
//            if((str.charAt(i) + i) % 2 == 0) {
//                result += (char)(str.charAt(i) +1);
//            }else {
//                result += str.charAt(i);
//            }
//        }
//        System.out.println(result);
//    }

//        String word = "Encapsulation";
//        String result ="";
//        int len = word.length();
//        for (int i = 1; i < len/2; i++) {
//        result += word.substring(i-1,i).toUpperCase();
//        if ((len * i) % 5 == 0){
//            result += (char)(word.charAt(len - i) + 2);
//        }
//        }
//        System.out.println(result);
//    }

//        String str = "Java";
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = i; j < str.length(); j++) {
//                if ((i * j) % 2 == 0) {
//                    System.out.println(str.charAt(i));
//                } else {
//
//                    System.out.println(str.charAt(j));
//                }
//            }
//            System.out.println();
//        }

        int x = 5;
        int y = 10;
        for (int i = 1; i <= 4; i++) {
            if ((x+y)%i == 0) {
                x += i * 2;
            } else if (i % 2 == 0) {
                y -= i * 3;
            }else {
                x+= y/i;
            }
        }
        System.out.println("x" +x+ ",y"+y);
        }

    }



