class Solution {
    

}

// MY ATTEMPT 
// public String gcdOfStrings(String str1, String str2) {
//         if (str1.length() == 0 || str2.length() == 0) return "";

//         String use;
//         String check;

//         if(str1.length() > str2.length()){
//             use = str2;
//             check = str1;
//         } else if ( str1.length() == str2.length()){
//             return str1.equals(str2) ? str1 : "";
//         } else {
//             use = str1;
//             check = str2;
//         }

        

//         for (int i = use.length(); i >= 1; i--) {
//             String currPattern = use.substring(0, i);
//             boolean patternWorks = true;
//             System.out.println(currPattern + " Is Pattern");
        
//         if((check.length() % i) == 0){
//             for (int j = 0; j < (check.length() / i); j++) {
//                 int p1 = j * currPattern.length();
//                 int p2 = p1 + currPattern.length();
//                 System.out.println(check.substring(p1, p2));

//                 if (!check.substring(p1, p2).equals(currPattern)) {
//                     System.out.println("BREAK WITH " + currPattern);
//                     patternWorks = false;
//                     break;
//                 }
//             }

//             if (patternWorks)
//                 return gcdOfStrings(currPattern, use);}
//         }

//         return "";
//     }