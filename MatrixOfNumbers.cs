using System;
     class Program
    {
        static void Main()
        {
            int n = int.Parse(Console.ReadLine());

            if ( 1 <= n && n <= 20)
            {
                for (int i = 0; i < n ; i++)
                {
                    for (int j = i+1; j <= n+i; j++)
                    {
                        Console.Write( "{0,2}",j);
                    }
                    Console.WriteLine();
                }
            }
            else
            {
                Console.WriteLine("Enter a number between [0,20]");
            }
        }
    }

