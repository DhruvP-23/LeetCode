class Solution:
    def romanToInt(self, s: str) -> int:
        #the values of all the roman numerals
        roman={"I":1,"V":5,"X":10,"L":50,"C":100,"D":500,"M":1000}
        total = 0

        for i in range(len(s)-1):

            #if the value of the roman numberal in front of the current one is more then its value is subtracted ( ie CM = 900 ( 1000 - 100) )
            if roman[s[i]] < roman[s[i+1]]:
                total -= roman[s[i]]
            else:
                total += roman[s[i]]
            # The last numer will always be added since there is nothing in fornt of it, have to add it here becuase the last digit is never used (range(len(d)-1)
        return total+roman[s[-1]]
