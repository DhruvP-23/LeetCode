class Solution:
    def isValid(self, s: str) -> bool:
        # creates a stack obj
        stack = []
        for n in list(s):

            #checks if n is an open parentheses
            if n in ["(", "{", "["]:
                # if it is puts it into the top of the stack
                stack.append(n)
            elif n in ["}", "]", ")"]:
                # if its not and the stack size is zero returns false
                if len(stack) == 0:
                    return False # ex ( ' ] ' )

                # checks if the closed parentheses has a mathcing open perentheses at the top of the stack
                # if it does then it gets removed
                if stack[-1] == "{" and n == "}":
                    stack.pop(-1)
                elif stack[-1] == "(" and n == ")":
                    stack.pop(-1)
                elif stack[-1] == "[" and n == "]":
                    stack.pop(-1)
                # if it doesn't that means its not valid and it returns false ( ' {] ' )
                else:
                    return False
        # if the for loop is run and there is not result, it will return true if the stack is empty ( every open P has a matching closeing one )
        # else its false
        if len(stack) == 0:
            return True
        else:
            return False

