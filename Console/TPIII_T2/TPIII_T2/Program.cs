using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TPIII_T2
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("sbyte: {0} bits, range from {1} to {2}", (sizeof(sbyte)*8), sbyte.MinValue, sbyte.MaxValue);
            Console.WriteLine("short: {0} bits, range from {1} to {2}", (sizeof(short) * 8), short.MinValue, short.MaxValue);
            Console.WriteLine("int: {0} bits, range from {1} to {2}", (sizeof(int) * 8), int.MinValue, int.MaxValue);
            Console.WriteLine("long: {0} bits, range from {1} to {2}", (sizeof(long) * 8), long.MinValue, long.MaxValue);
            Console.WriteLine("byte: {0} bits, range from {1} to {2}", (sizeof(byte) * 8), byte.MinValue, byte.MaxValue);
            Console.WriteLine("ushort: {0} bits, range from {1} to {2}", (sizeof(ushort) * 8), ushort.MinValue, ushort.MaxValue);
            Console.WriteLine("uint: {0} bits, range from {1} to {2}", (sizeof(uint) * 8), uint.MinValue, uint.MaxValue);
            Console.WriteLine("ulong: {0} bits, range from {1} to {2}", (sizeof(ulong) * 8), ulong.MinValue, ulong.MaxValue);
            Console.WriteLine("float: {0} bits, range from {1} to {2}", (sizeof(float) * 8), float.MinValue, float.MaxValue);
            Console.WriteLine("double: {0} bits, range from {1} to {2}", (sizeof(double) * 8), double.MinValue, double.MaxValue);
            Console.WriteLine("decimal: {0} bits, range from {1} to {2}", (sizeof(decimal) * 8), decimal.MinValue, decimal.MaxValue);
            Console.ReadLine();
        }
    }
}
