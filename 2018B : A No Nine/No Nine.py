def main():
        input = open("Input.txt", "r")
        output = open("Output.txt", "w")
        a = int(input.readline())
        for i in range(1, a+1):
               start, end = [int(i) for i in input.readline().split()]
               output.write("Case #{}: {}".format(i, count(start, end)))
               output.write("\n")
               print(i)
        input.close()
        output.close()   


def count(start, end):
        count = 0
        for x in range(end - start + 1):
                if(isLegal(start + x)):
                        count += 1
        return count


def isLegal(a):
        if(a % 9 == 0):
                return False
        elif(containNine(a)):
                return False
        else:
                return True

        
def containNine(a):
        length = len(str(a))
        containNine = False
        for x in range(length):
                if(int(str(a)[x:x+1]) == 9):
                        containNine = True
        return containNine

        
main()




                
              


