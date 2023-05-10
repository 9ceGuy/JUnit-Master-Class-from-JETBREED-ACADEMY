package Activity3_1;

import java.util.Random;

public class CombiningStrings {
    public String combineString(String custName)
    {
        StringBuilder randNums;

        String randnumbers = "1234567890";

        int numLength = randnumbers.length();
        Random randomNum = new Random();

        randNums = new StringBuilder(numLength);

        for (int i = 0; i < 4; i++)
        {
            randNums.append(randnumbers.charAt(randomNum.nextInt(numLength)));
        }

        String newCustName;
        if (custName.length() > 3)
        {
            newCustName = custName.substring(0, 3);
        }
        else
        {
            newCustName = custName;
        }

        String passResult;
        passResult = newCustName + randNums;

        return passResult;
    }
}
