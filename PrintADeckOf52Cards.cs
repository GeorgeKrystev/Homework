using System;
     class PrintADeckOf52Cards
    {
        static void Main()
        {
            char[] color = {'\u0005', '\u0004', '\u0003', '\u0006'};
            string colorStr =  new string(color);

            for (int i = 0; i <= colorStr.Length; i++)
            {
                for (int card = 1; card <= 13; card++)
                {
                    switch (card)
                    {
                        case 1: Console.WriteLine("2{0}  2{1}  2{2}  2{3}", colorStr[i], colorStr[i + 1], colorStr[i+2], colorStr[i+3]); break;
                        case 2: Console.WriteLine("3{0}  3{1}  3{2}  3{3}", colorStr[i], colorStr[i + 1], colorStr[i + 2], colorStr[i + 3]); break;
                        case 3: Console.WriteLine("4{0}  4{1}  4{2}  4{3}", colorStr[i], colorStr[i + 1], colorStr[i + 2], colorStr[i + 3]); break;
                        case 4: Console.WriteLine("5{0}  5{1}  5{2}  5{3}", colorStr[i], colorStr[i + 1], colorStr[i + 2], colorStr[i + 3]); break;
                        case 5: Console.WriteLine("6{0}  6{1}  6{2}  6{3}",colorStr[i], colorStr[i + 1], colorStr[i + 2], colorStr[i + 3]); break;
                        case 6: Console.WriteLine("7{0}  7{1}  7{2}  7{3}", colorStr[i], colorStr[i + 1], colorStr[i + 2], colorStr[i + 3]); break;
                        case 7: Console.WriteLine("8{0}  8{1}  8{2}  8{3}", colorStr[i], colorStr[i + 1], colorStr[i + 2], colorStr[i + 3]); break;
                        case 8: Console.WriteLine("9{0}  9{1}  9{2}  9{3}", colorStr[i], colorStr[i + 1], colorStr[i + 2], colorStr[i + 3]); break;
                        case 9: Console.WriteLine("10{0} 10{1} 10{2} 10{3}", colorStr[i], colorStr[i + 1], colorStr[i + 2], colorStr[i + 3]); break;
                        case 10: Console.WriteLine("J{0}  J{1}  J{2}  J{3}", colorStr[i], colorStr[i + 1], colorStr[i + 2], colorStr[i + 3]); break;
                        case 11: Console.WriteLine("Q{0}  Q{1}  Q{2}  Q{3}", colorStr[i], colorStr[i + 1], colorStr[i + 2], colorStr[i + 3]); break;
                        case 12: Console.WriteLine("K{0}  K{1}  K{2}  K{3}", colorStr[i], colorStr[i + 1], colorStr[i + 2], colorStr[i + 3]); break;
                        case 13: Console.WriteLine("A{0}  A{1}  A{2}  A{3}", colorStr[i], colorStr[i + 1], colorStr[i + 2], colorStr[i + 3]); break;
                                                                      
                    }
                }
                i += 4;
            }

        }
    }

