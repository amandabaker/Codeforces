using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Presents163A
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            String line = Console.ReadLine();

            int[] gifting = new int[n];
            int   count   = 1;

            String[] input      = line.Split(' ');
            int[]    output     = new int[input.Length];
            for (int i = 0; i < input.Length; i++) {
                int x       = Convert.ToInt32(input[i]) - 1;
                output[x]   = i + 1; 
            }

            //  this is supposed to split ints at spaces but 
            //    foolishly assumes ints of only one digit...
            /*
            for (int i = 0; i < n * 2 - 1; i += 2) {
                int x = line[i];
                gifting[x-49] = count++;       
            }
            */

            for (int i = 0; i < n; i++) {
                Console.Write(output[i] + " ");
            }



        }
    }
}
