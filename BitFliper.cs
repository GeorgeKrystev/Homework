using System;
     class FirstBitFliper
    {
        static void Main()
        {
            //ulong num = ulong.Parse(Console.ReadLine());
            long num =  8773276988229695713;
            string numAsString = Convert.ToString(num, 2).PadLeft(64,'0');
            char[] numAsCharArry = numAsString.ToCharArray();

            for (int i = 2; i < numAsString.Length; i++)
            {
                if (numAsCharArry[i] == numAsCharArry[i - 1] && numAsCharArry[i] == numAsCharArry[i - 2])
                {
                    if (numAsCharArry[i] == '0')
                    {
                        numAsCharArry[i] = '1';
                        numAsCharArry[i - 1] = '1';
                        numAsCharArry[i - 2] = '1';
                    }
                    else
                    {
                        numAsCharArry[i] = '0';
                        numAsCharArry[i - 1] = '0';
                        numAsCharArry[i - 2] = '0';
                    }
                    i += 2;
                    //Console.WriteLine(num);
                    //Console.WriteLine(numAsCharArry[i]);                                 
 
                }
                
            }
            Console.WriteLine(num);
            Console.WriteLine(numAsCharArry);


        }
    }

